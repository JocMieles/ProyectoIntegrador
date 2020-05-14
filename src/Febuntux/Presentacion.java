package Febuntux;

import com.sun.awt.AWTUtilities;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import rojerusan.componentes.RSProgressBarSinText;



public class Presentacion extends javax.swing.JFrame {


    public Presentacion() {
        initComponents();
       this.setLocationRelativeTo(this);
       
       this.barra.setValue(0);
       this.lbl.setText("0%");
       startThread();
    }


    @SuppressWarnings("unchecked")
    private static void inicio (){
         int i = 0;
        do{
            i++;
            if(i==20000){
                Proyecto_Integrador menu = new Proyecto_Integrador();
                    
                    menu.setVisible(true);
            }
            System.out.println(i);
        }while(i<20000);
        
        
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        barra = new rojerusan.componentes.RSProgressBarSinText();
        lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("FEBUNTUX");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 70));

        barra.setForeground(new java.awt.Color(0, 0, 0));
        barra.setColorForeground(new java.awt.Color(153, 255, 255));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 430, -1));

        lbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl.setForeground(new java.awt.Color(153, 255, 255));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("50 %");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPre.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for(int i=0; i>50000; i++){
            if(i>50000){
                Proyecto_Integrador menu = new Proyecto_Integrador();
                    
                    menu.setVisible(true);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        for(int i=0; i>50000; i++){
            System.out.println(i);
            if(i>50000){
                Proyecto_Integrador menu = new Proyecto_Integrador();
                    
                    menu.setVisible(true);
            }
        }
    }//GEN-LAST:event_formWindowActivated

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
           
  
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
                
               
            }              
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.componentes.RSProgressBarSinText barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables

    Cargar hilo;
    public RSProgressBarSinText getProgress(){
        return this.barra;
    }
    
    public void setProgress(RSProgressBarSinText progress){
        this.barra = progress;
    }
    
    public void startThread(){
        hilo = new Cargar (getProgress(), this, lbl);
        hilo.start();
        hilo = null;
        
    }
}
