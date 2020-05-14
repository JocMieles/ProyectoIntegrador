package Febuntux;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import rojeru_san.rspanel.RSPanelCircleBorder;


public class Cargar extends Thread{
    
    private JProgressBar barra;
    private Presentacion window;
    private JLabel lbl;
    
    
    public Cargar (JProgressBar barra, Presentacion window, JLabel lbl){
        super();
        this.barra = barra;
        this.window = window;
        this.lbl = lbl;
        
    }
    
    @Override
    public void run(){
        setProgress(0);
        pause(300);
        setProgress(10);
        pause(300);
        setProgress(30);
        pause(300);
        setProgress(45);
        pause(300);
        setProgress(80);
        pause(300);
        setProgress(85);
        pause(300);
        setProgress(90);
        pause(300);
        setProgress(92);
        setProgress(98);
        setProgress(100);
        
    }
    
    public void pause(int mls){
        try{
            Thread.sleep(mls);
        }catch(InterruptedException ex){
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setProgress(int valor){
        barra.setValue(valor);
        lbl.setText(valor+"%");
        
        pause(300);
        
        if(valor == 100){
            pause(300);
            window.dispose();
            Proyecto_Integrador menu=new Proyecto_Integrador();
            menu.setVisible(true);
            
        }
    }
}
