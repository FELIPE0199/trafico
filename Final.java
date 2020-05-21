package Final;
//aca hago que se corra la simulacion
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Ramirez
 */
public class Final extends Thread{
JLabel eti;
 Simulacion p;
 
 public Final(JLabel eti,Simulacion p){
      this.eti=eti;
      this.p = p;
   
 }
 
    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
         //java.awt.EventQueue.invokeLater(new Runnable() {
          public static void main(String args[]) {
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    Final(JLabel carro2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 public void run() {
               // new Simulacion().setVisible(true);
               /*int c1=0, c2=0;
                while (true){
                    try {
                    sleep((int)(Math.random()*1000));
                } catch (InterruptedException ex) {
                    //Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
                }
                c1=p.getcarro2().getLocation().x;
                c2=p.getcarro4().getLocation().x;
                //c3=p.getlbl3().getLocation().x;
                if(c1<p.getborde2().getLocation().x-10&&c2<p.getborde2().getLocation().x-10){
                    
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
            }else
            {
                  //  break;
                    }
        }/*
        if (eti.getLocation().x>=p.getborde2().getLocation().x-10){
            if(c1>c2){
                JOptionPane.showMessageDialog(null, "Gano 1");
            }else if(c2>c1){
                JOptionPane.showMessageDialog(null, "Gano 2");
            }else{
                
                JOptionPane.showMessageDialog(null, "Empate");
            }
            
        }*/
}
}
