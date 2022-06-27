package histogramas;

import java.awt.Color;
import static java.awt.Font.BOLD;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javafx.scene.text.Font;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Histogramas extends JFrame {
    Graficar grafica;
    public Histogramas() {
        initComponents();
        ImprimirEncabezadoTabla();
        this.jTable1.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
        this.jTable1.getTableHeader().setForeground(Color.black);
        this.jTable1.getTableHeader().setResizingAllowed(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(600, 395, 395, 395));
        setMaximumSize(new java.awt.Dimension(640, 428));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 428));

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 34)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Histogramas");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresa los numeros que desees...");

        txtNumeros.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeros.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtNumeros.setText("11.5, 13.2, 11.2, 14.3, 14.2, 14.5, 12.2, 12.4, 11.2, 12.5, \n10.2, 13.4, 12.3, 9.3, 15.2, 8.2, 11.5, 8.5, 12.5, 9.1,\n10, 10.4, 10.5, 12.4, 10.3, 14, 15.3, 11.3, 14.4, 14.3,\n13, 11.3, 14.2, 9, 14.3, 13, 11.5, 12.2, 13, 12.1,\n11.1, 14.4, 15.5, 10, 10, 12.4, 13.5, 9.1, 15.3, 9.2");
        txtNumeros.setToolTipText("");
        txtNumeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumerosKeyPressed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(255, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("X");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("a");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCalcular)
                                .addGap(226, 226, 226))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumerosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerosKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {

            System.out.println("Rango : "+Rango()+ "  , K: "+NumeroIntervalos()+"  , Tamano: "+TamanoIntervalos());
            
            ImprimirTabla();

        }
    }//GEN-LAST:event_txtNumerosKeyPressed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        System.out.println("Rango : "+Rango()+ "  , K: "+NumeroIntervalos()+"  , Tamano: "+TamanoIntervalos());
            
        ImprimirTabla();
       
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        this.txtNumeros.setText("");
        DefaultTableModel MiTabla =(DefaultTableModel)jTable1.getModel();
        int filas=jTable1.getRowCount();
            for (int i = 0;filas>i; i++) {
                MiTabla.removeRow(0);
        }
            grafica.setVisible(false);
            
    }//GEN-LAST:event_btnBorrarActionPerformed

    
//--------- R A N G O -------------------------
    public double Rango(){
        double[] numeros = ObtenerNumeros();
        double mayor=numeros[numeros.length-1], menor=numeros[0], rango=0;
        String num = "";
        
        num = String.format("%.2f", mayor - menor);   //Reddondear a 2 decimales     
       
        rango = Double.parseDouble(num); 
        
        return rango;
       
    }
    
//--------- Numero Intervalos -------------------------
    public double NumeroIntervalos(){
        double[] numeros = ObtenerNumeros();
        double Intervalos=0;
        
        Intervalos = Math.sqrt(numeros.length);
        
        Intervalos = Math.round(Intervalos);
        
        return Intervalos;
       
    }
    
//--------- Tamano Intervalos -------------------------
    public double TamanoIntervalos(){
        double R = Rango(), K = NumeroIntervalos(), tamano=0;
        String num = "";
        
        num = String.format("%.2f", R/K);
        
        tamano = Double.parseDouble(num);
        
        return tamano;
       
    }
    
//--------------------------------------------
    public double[] ObtenerNumeros(){
        
        String cadena = this.txtNumeros.getText();
        String [] c = cadena.split(",");
        
        double [] numeros = new double[c.length];
        
        for(int i=0; i < c.length; i++){            
            numeros[i] = Double.parseDouble(c[i]);
        }
        
        Arrays.sort(numeros);
        
        return numeros;
       
    }
    
//--------- T A B L A --------------------------
    public void ImprimirEncabezadoTabla(){
        DefaultTableModel MiTabla =(DefaultTableModel)jTable1.getModel();
        String EncabezadoTabla[]={"Intervalo","Marca de Clase","Frecuencia"};
        MiTabla = new DefaultTableModel(null,EncabezadoTabla);
        this.jTable1.setModel(MiTabla); 
        
        
    }
    
//---------- D A T O S   T A B L A--------------
    public void ImprimirTabla(){
        DefaultTableModel MiTabla =(DefaultTableModel)jTable1.getModel();
        double[] numeros = ObtenerNumeros();
        double R=Rango(), K=NumeroIntervalos(), Ancho=TamanoIntervalos(), num=0.0;
        float inter_1=0, inter_2=0;
        String marca="";
        int frecuencia=0;
        
        String Registros[]=new String[3];
        
        String Intervalos[]=new String[(int)K];
        int Frecuencias[]=new int[(int)K];

        int filas=jTable1.getRowCount();
            for (int i = 0;filas>i; i++) {
                MiTabla.removeRow(0);
        }
        
        while(num<K){
            if(num==0){ //Primera iteracion
                inter_1 = (float) numeros[0];
                inter_2 = (float) (inter_1 + Ancho);
                                                        
                marca = String.format("%.2f",(inter_1 + inter_2) / 2);
                    
                for(int i=0; i<numeros.length; i++){
                    if (numeros[i]>=inter_1  &&  numeros[i]<=inter_2){
                        frecuencia++;
                    }
                }
                    
                Registros[0] = inter_1 + " - " + inter_2;
                Intervalos[(int)num] = inter_1 + " - " + inter_2;
                Frecuencias [(int)num] = frecuencia;
                inter_1=inter_2;
            }else{
                frecuencia=0;
                if(num==K-1){
                    inter_2 = (float) numeros[numeros.length-1];
                    frecuencia=0;
                }else{
                    inter_2 = (float) (inter_1 + Ancho);
                }
                    
                Registros[0]= inter_1 + " - " + inter_2;                    
                Intervalos[(int)num] = inter_1 + " - " + inter_2;
                  
                marca = String.format("%.2f",(inter_1 + inter_2) / 2);
                //marca = (float) (Math.ceil( ((inter_1 + inter_2) / 2)*100 )/100);
                for(int i=0; i<numeros.length; i++){
                    if (numeros[i]>=inter_1  &&  numeros[i] <= inter_2){
                        frecuencia++;
                    }
                }
                    
                Frecuencias [(int)num] = frecuencia;
                    
                inter_1=inter_2;
            }
                
            Registros[1]=marca;
            Registros[2]=frecuencia+"";
            MiTabla.addRow(Registros);
            num++;
        }
        this.jTable1.setModel(MiTabla);
            
        grafica = new Graficar(Intervalos, Frecuencias);
        
        grafica.setVisible(false);
        grafica.setSize(900, 400);
        grafica.setLocationRelativeTo(null);
        grafica.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
           
        grafica.setVisible(true);
            
    }
       
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
            java.util.logging.Logger.getLogger(Histogramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Histogramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Histogramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Histogramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Histogramas().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}


