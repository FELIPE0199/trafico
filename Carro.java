
package Final;


import static Final.proceso.delaytiempo;
import java.awt.Point;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

/**
 *
 * @author Felipe Ramirez
 */
public class Carro extends Thread {
    JLabel carro2;
    JLabel carro4;
    JLabel eti;
    Simulacion p;
    JLabel carro6;
    JLabel carro7;
    JLabel carro1;
    JLabel carro3;
    JLabel carro5;
    JLabel carro8;
    JLabel carro9;
    JLabel carro10;
    JLabel carro11;
    JLabel carro12;
    
    
    
 public Carro(JLabel eti,Simulacion p){
     this.eti=eti;
      this.p = p;
     
 }
  
    @Override
    public void run() {
              int c1=0, c2=0,c4=0, c3=0,contador1=0;
              contador1++;
                while (true){
                    delaytiempo();
/*                    try {
                    sleep((int)(Math.random()*1000));
                } catch (InterruptedException ex) {
                    //Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
                }
  */             c1=p.getcarro2().getLocation().x;
                 c2=p.getcarro4().getLocation().x;
                 c3=p.getcarro2().getLocation().x;
                 c4=p.getcarro4().getLocation().x;
                 c1=p.getcarro2().getLocation().x;
                 c2=p.getcarro4().getLocation().x;
                 c1=p.getcarro2().getLocation().x;
                 c2=p.getcarro4().getLocation().x;
                //c3=p.getlbl3().getLocation().x;
                
                if(contador1==1){
                    
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
                    
                  }         

              

        }
    
    
    
        /* public static void delaytiempo1(){
        while (true){
                    try {
                    sleep((int)(Math.random()*1000));
                } catch (InterruptedException ex) {
                    //Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
}
         public void start() {
        new Thread(this).start();
    }*/
}
}
