package Final;
//hago todo lo de los semaforos 

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.*;


public class proceso implements Runnable {
    JLabel carro2;
    JLabel carro4;
    JPanel rojo1;
    JPanel naranja1;
    JPanel verde1;
    JPanel rojo2;
    JPanel naranja2;
    JPanel verde2;
    JPanel rojo3;
    JPanel naranja3;
    JPanel verde3;
    JPanel rojo4;
    JPanel naranja4;
    JPanel verde4;
    JPanel projo1;
    JPanel projo2;
    JPanel projo3;
    JPanel projo4;
    JPanel pverde1;
    JPanel pverde2;
    JPanel pverde3;
    JPanel pverde4;
    
    //JTextField texto;
    int contador=0,temp=0,temp2=0,temp3=0,temp4=0;
    
    public proceso(JPanel entrada1,JPanel entrada2,JPanel entrada3,JPanel entrada4,JPanel entrada5,JPanel entrada6,JPanel entrada7,JPanel entrada8,JPanel entrada9,JPanel entrada10,JPanel entrada11,JPanel entrada12
    ,JPanel entrada13,JPanel entrada14,JPanel entrada15,JPanel entrada16,JPanel entrada17,JPanel entrada18,JPanel entrada19,JPanel entrada20, JLabel entrada21, JLabel entrada22){
        
       this.rojo1=entrada1;
       this.naranja1=entrada2;
       this.verde1=entrada3;
       this.rojo3=entrada4;
       this.naranja3=entrada5;
       this.verde3=entrada6;
       this.rojo2=entrada7;
       this.naranja2=entrada8;
       this.verde2=entrada9;
       this.rojo4=entrada10;
       this.naranja4=entrada11;
       this.verde4=entrada12;
       //peatonales 
       this.projo1=entrada13; 
        this.projo2=entrada14;
        this.projo3=entrada15;
        this.projo4=entrada16;
        this.pverde1=entrada17;
        this.pverde2=entrada18;   
       this.pverde3=entrada19;     
       this.pverde4=entrada20;
      // this.texto=entrada4;
   this.carro2=entrada21;     
       this.carro4=entrada22;
    }


    @Override
    public void run() {
        
        while(true){
            
            contador++;
              
            /*if(contador>=1 && contador<=60){
                temp++;
                texto.setText(""+temp);
            }*/
            if(contador==1){
                rojo1.setBackground(Color.red);
                naranja1.setBackground(Color.gray);
                verde1.setBackground(Color.gray);
                rojo3.setBackground(Color.red);
                naranja3.setBackground(Color.gray);
                verde3.setBackground(Color.gray);

            }

           
            
            
          /*
            if(contador>=60 && contador<=63){
                temp2++;
                texto.setText(""+temp2);
            }*/
            if(contador==60){
              rojo1.setBackground(Color.gray);
              naranja1.setBackground(Color.yellow);
              verde1.setBackground(Color.gray);
              rojo3.setBackground(Color.gray);
              naranja3.setBackground(Color.yellow);
              verde3.setBackground(Color.gray);  
            
            }
            
            /*
            if(contador>=63 && contador<=93){
                temp3++;
                texto.setText(""+temp3);
            }*/
            if(contador==63){
              rojo1.setBackground(Color.gray);
              naranja1.setBackground(Color.gray);
              verde1.setBackground(Color.green);  
              rojo3.setBackground(Color.gray);
              naranja3.setBackground(Color.gray);
              verde3.setBackground(Color.green);
            }
            
            /*
            if(contador>=93 && contador<=96){
                temp4++;
                texto.setText(""+temp4);
            }*/
            if(contador==93){
              rojo1.setBackground(Color.gray);
              naranja1.setBackground(Color.yellow);
              verde1.setBackground(Color.gray);
              rojo3.setBackground(Color.gray);
              naranja3.setBackground(Color.yellow);
              verde3.setBackground(Color.gray);
            }
            
            
         /*   if(contador==95){
                contador=0;
                temp=0;
                temp2=0;
                temp3=0;
                temp4=0;
            }
            */
            //izquierda a derecha
            if(contador==1){
                rojo2.setBackground(Color.gray);
                naranja2.setBackground(Color.gray);
                verde2.setBackground(Color.green);
                rojo4.setBackground(Color.gray);
                naranja4.setBackground(Color.gray);
                verde4.setBackground(Color.green);
              
            }
            
          /*
            if(contador>=60 && contador<=63){
                temp2++;
                texto.setText(""+temp2);
            }*/
            if(contador==30){
              rojo2.setBackground(Color.gray);
              naranja2.setBackground(Color.yellow);
              verde2.setBackground(Color.gray);
              rojo4.setBackground(Color.gray);
              naranja4.setBackground(Color.yellow);
              verde4.setBackground(Color.gray);  
            
            }
            
            /*
            if(contador>=63 && contador<=93){
                temp3++;
                texto.setText(""+temp3);
            }*/
            if(contador==33){
              rojo2.setBackground(Color.red);
              naranja2.setBackground(Color.gray);
              verde2.setBackground(Color.gray);  
              rojo4.setBackground(Color.red);
              naranja4.setBackground(Color.gray);
              verde4.setBackground(Color.gray);
            }
            
            /*
            if(contador>=93 && contador<=96){
                temp4++;
                texto.setText(""+temp4);
            }*/
            if(contador==93){
              rojo2.setBackground(Color.gray);
              naranja2.setBackground(Color.yellow);
              verde2.setBackground(Color.gray);
              rojo4.setBackground(Color.gray);
              naranja4.setBackground(Color.yellow);
              verde4.setBackground(Color.gray);
            }
            //peatonales
              
            if(contador==1){
              pverde1.setBackground(Color.gray);
              pverde2.setBackground(Color.gray);
              pverde3.setBackground(Color.gray);
              pverde4.setBackground(Color.gray);
              projo1.setBackground(Color.red);
              projo2.setBackground(Color.red);
              projo3.setBackground(Color.red);
              projo4.setBackground(Color.red);
            }
            if(contador==33){
              pverde1.setBackground(Color.green);
              pverde2.setBackground(Color.green);
              pverde3.setBackground(Color.green);
              pverde4.setBackground(Color.green);
              projo1.setBackground(Color.gray);
              projo2.setBackground(Color.gray);
              projo3.setBackground(Color.gray);
              projo4.setBackground(Color.gray);
            }
            
            if(contador==59){
              pverde1.setBackground(Color.gray);
              pverde2.setBackground(Color.gray);
              pverde3.setBackground(Color.gray);
              pverde4.setBackground(Color.gray);
              projo1.setBackground(Color.red);
              projo2.setBackground(Color.red);
              projo3.setBackground(Color.red);
              projo4.setBackground(Color.red);
            }
            
            if(contador==95){
                contador=0;
                temp=0;
                temp2=0;
                temp3=0;
                temp4=0;
            } 
            try {
                delaytiempo();
            } catch (Exception e) {
            }
            
        }
        
    }
 
     public static void delaytiempo(){
        try{
           Thread.sleep(100);
        }catch(InterruptedException e){
            
        }
    }
    public void start() {
        new Thread(this).start();
    }  
}
