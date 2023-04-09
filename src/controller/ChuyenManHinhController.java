
package controller;

import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.BaoCaoJPanel;
import view.CaiDatJPanel;
import view.GiangVienJPanel;
import view.HocVienJPanel;
import view.KhoaHocJPanel;
import view.LopHocJPanel;
import view.TrangChuJPanel;

/**
 *
 * @author ASUS
 */
public class ChuyenManHinhController {
    private JPanel jpnRoot;
    private String kindSelected = "";
    List<DanhMucBean> list;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.list = null;
        this.jpnRoot = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(255,255,255));
        jlbItem.setForeground(new Color(0,50,99));
        
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new TrangChuJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }

   
    public void setEvent(List<DanhMucBean> list){
        this.list = list;
        for(DanhMucBean item : list){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{

        private JPanel node;
        private  String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
        @Override
        public void mouseClicked(MouseEvent e) {
          switch(kind){
              case "TrangChu":
                  node = new TrangChuJPanel();
                  break;
              case "HocVien":
                  node = new HocVienJPanel();
                  break;
              case "GiangVien":
                  node = new GiangVienJPanel();
                  break;
              case "KhoaHoc":
                  node = new KhoaHocJPanel();
                  break;
              case "LopHoc":
                  node = new LopHocJPanel();
                  break;
              case "BaoCao":
                  node = new BaoCaoJPanel();
                  break;
              case "CaiDat":
                  node = new CaiDatJPanel();
                  break;
              default:
                  node = new TrangChuJPanel();
                  break;         
          }
          jpnRoot.removeAll();
          jpnRoot.setLayout(new BorderLayout());
          jpnRoot.add(node);
          jpnRoot.validate();
          jpnRoot.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(255,255,255));
           jlbItem.setForeground(new Color(0,50,99));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           jpnItem.setBackground(new Color(255,255,255));
           jlbItem.setForeground(new Color(0,50,99));
        }

        @Override
        public void mouseExited(MouseEvent e) {
          if(!kindSelected.equalsIgnoreCase(kind)){
               jpnItem.setBackground(new Color(0,50,99));
               jlbItem.setForeground(new Color(255,255,255));
          }
        }
    }
    
     private void setChangeBackground(String kind){
        for(DanhMucBean item : list){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(255,255,255));
                item.getJlb().setForeground(new Color(0,50,99));
            }else{
                item.getJpn().setBackground(new Color(0,50,99));
                item.getJlb().setForeground(new Color(255,255,255));
            }
        }
    }
   
}
