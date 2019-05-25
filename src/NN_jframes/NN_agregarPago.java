/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NN_jframes;

import BusinessObjects.Appointment;
import BusinessObjects.Client;
import BusinessObjects.Employee;
import BusinessObjects.Payment;
import Managers.DatabaseManager;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Armando
 */
public class NN_agregarPago extends javax.swing.JFrame {
    
    DatabaseManager db;
    boolean busy = false;
    boolean clientNew = false;
    Client idClienteSolicita = null;
    NN_JframeAdmin manager;
    NN_pagoMain paymentMenu;
    
    /**
     * Creates new form NN_agregarCliente
     */
    public NN_agregarPago() {
        initComponents();
        setMinimumSize(new Dimension(600,420).getSize());
        hidebttn();
        manager = NN_MainClass.getManager();
        db = NN_MainClass.db;
        paymentMenu = manager.managerPagoMain;
        int newid = db.getMax("PAYMENT");
        T_id.setText(Integer.toString(newid));
        LocalDate rightnow = java.time.LocalDate.now();
        CBO_dia.setSelectedIndex(rightnow.getDayOfMonth()-1);
        CBO_mes.setSelectedIndex(rightnow.getMonthValue()-1);
        CBO_año.setSelectedIndex(rightnow.getYear()-2017);
        //KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(keyEventDispatcher);
        
    }

    public void hidebttn(){
                
        B__selectCliente.setOpaque(false);
        B__selectCliente.setContentAreaFilled(false); //to make the content area transparent
        B__selectCliente.setBorderPainted(false); //to make the borders transparent
        
        B_nuevoCliente.setOpaque(false);
        B_nuevoCliente.setContentAreaFilled(false); //to make the content area transparent
        B_nuevoCliente.setBorderPainted(false); //to make the borders transparent
        
        B_agregar.setOpaque(false);
        B_agregar.setContentAreaFilled(false); //to make the content area transparent
        B_agregar.setBorderPainted(false); //to make the borders transparent
               
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Line5 = new javax.swing.JLabel();
        Line4 = new javax.swing.JLabel();
        Line3 = new javax.swing.JLabel();
        Line2 = new javax.swing.JLabel();
        Line1 = new javax.swing.JLabel();
        B_agregar = new javax.swing.JButton();
        B__selectCliente = new javax.swing.JButton();
        B_nuevoCliente = new javax.swing.JButton();
        T_Success = new javax.swing.JLabel();
        T_Cantidad = new javax.swing.JLabel();
        B_cantidad = new javax.swing.JTextField();
        T_primerNombre = new javax.swing.JLabel();
        T_secondName = new javax.swing.JLabel();
        T_telefono = new javax.swing.JLabel();
        T_id = new javax.swing.JLabel();
        buttonS3 = new javax.swing.JLabel();
        buttonS2 = new javax.swing.JLabel();
        buttonS1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBO_dia = new javax.swing.JComboBox<>();
        CBO_mes = new javax.swing.JComboBox<>();
        CBO_año = new javax.swing.JComboBox<>();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar pago");
        setLocation(new java.awt.Point(300, 230));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Line5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_line.png"))); // NOI18N
        getContentPane().add(Line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, -1, 10));

        Line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_line.png"))); // NOI18N
        getContentPane().add(Line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, -1, 10));

        Line3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_line.png"))); // NOI18N
        getContentPane().add(Line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, -1, 10));

        Line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_line.png"))); // NOI18N
        getContentPane().add(Line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, -1, 10));

        Line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_line.png"))); // NOI18N
        getContentPane().add(Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, -1, 10));

        B_agregar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_agregar.setForeground(new java.awt.Color(255, 255, 255));
        B_agregar.setText("Agregar");
        B_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(B_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 340, 80, 40));

        B__selectCliente.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        B__selectCliente.setForeground(new java.awt.Color(255, 255, 255));
        B__selectCliente.setText("Escoger Cliente");
        B__selectCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B__selectClienteActionPerformed(evt);
            }
        });
        getContentPane().add(B__selectCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 343, 120, 30));

        B_nuevoCliente.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        B_nuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        B_nuevoCliente.setText("Nuevo Cliente");
        B_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_nuevoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(B_nuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 343, -1, 30));

        T_Success.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Success.setForeground(new java.awt.Color(0, 102, 102));
        T_Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Success.setText("-");
        getContentPane().add(T_Success, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 287, 530, 50));

        T_Cantidad.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Cantidad.setForeground(new java.awt.Color(0, 102, 102));
        T_Cantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Cantidad.setText("Cantidad");
        getContentPane().add(T_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 105, -1));

        B_cantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        B_cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(B_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 230, -1));

        T_primerNombre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_primerNombre.setForeground(new java.awt.Color(0, 102, 102));
        T_primerNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_primerNombre.setText("Primer Nombre");
        getContentPane().add(T_primerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 250, 20));

        T_secondName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_secondName.setForeground(new java.awt.Color(0, 102, 102));
        T_secondName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_secondName.setText("Apellidos");
        getContentPane().add(T_secondName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 240, 20));

        T_telefono.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_telefono.setForeground(new java.awt.Color(0, 102, 102));
        T_telefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_telefono.setText("Telefono");
        getContentPane().add(T_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 177, -1));

        T_id.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        T_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_id.setText("-");
        getContentPane().add(T_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, -1));

        buttonS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, -1));

        buttonS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, -1));

        buttonS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 345, 100, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ID de cita");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 20));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nombre del cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 20));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 20));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Fecha");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 20));

        CBO_dia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(CBO_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        CBO_mes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(CBO_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        CBO_año.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        getContentPane().add(CBO_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_background.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        paymentMenu.refreshTable();
        paymentMenu.enable(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing
   
    public void confirm(){
        boolean clientSelected = true;
        boolean amountOk = true;
        float amount = 0;
        int minuto = 0;
        try{
            amount = Float.parseFloat(B_cantidad.getText());
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "La cantidad debe ser solo numeros", "Error en la hora", JOptionPane.INFORMATION_MESSAGE);
            amountOk = false;
        }
        if(idClienteSolicita == null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar o agregar un cliente", "Error en el cliente", JOptionPane.INFORMATION_MESSAGE);
            clientSelected = false;
        }
        if(clientSelected && amountOk){
            if(clientNew){
                boolean isNew;
                Client queryClient = db.getClientbyName(idClienteSolicita.getFirstName(), idClienteSolicita.getLastName());
                if(queryClient.getFirstName()!= null){
                    if(queryClient.getPhone() == idClienteSolicita.getPhone()){
                        idClienteSolicita.setId(queryClient.getId());
                        isNew = false;
                        manager.openAddPayClientExist();
                        this.enable(false);
                    }
                }
                else{
                    db.addClient(idClienteSolicita);
                    finishPayment();  
                }
                
            }
            else{
                finishPayment();                
            }  
        }
        paymentMenu.refreshTable();
    }
    
    public void finishPayment(){
        Payment newPayment = new Payment();
        int newMonth = CBO_mes.getSelectedIndex();
        int newDay = CBO_dia.getSelectedIndex();
        float amountVal = Float.parseFloat(B_cantidad.getText());
        String SnewYear = CBO_año.getSelectedItem().toString();
        int newYear = Integer.parseInt(SnewYear);
        newPayment.setId(db.getMax("PAYMENT"));
        newPayment.setId_a(idClienteSolicita.getId());
        newPayment.setId_e(manager.loggeduser.getId());
        newPayment.setAmount(amountVal);
        newPayment.setDay(newDay+1);
        newPayment.setMonth(newMonth);
        newPayment.setYear(newYear);
        db.addPayment(newPayment);
        T_Success.setText("Se agrego correctamente la cita");
        manager.managerPagoMain.refreshTable();
        
    }
    
    
    public void reset(){
        boolean clientNew = false;
        Client idClienteSolicita = null;
        T_primerNombre.setText("Primer Nombre");
        T_secondName.setText("Apellidos");
        T_telefono.setText("Telefono");
    }
    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        busy = false;
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        busy = true;
    }//GEN-LAST:event_formWindowLostFocus

    private void B__selectClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B__selectClienteActionPerformed
        // TODO add your handling code here:
        manager.openAddPayClient();
        this.enable(false);
    }//GEN-LAST:event_B__selectClienteActionPerformed

    private void B_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_nuevoClienteActionPerformed
        // TODO add your handling code here:
        manager.openAddPayAddClient();
        this.enable(false);
    }//GEN-LAST:event_B_nuevoClienteActionPerformed

    private void B_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_agregarActionPerformed
        confirm();
    }//GEN-LAST:event_B_agregarActionPerformed
    
    public void updateAppointmentNewClientData(Client appClient){
        clientNew = true;
        T_primerNombre.setText(appClient.getFirstName());
        T_secondName.setText(appClient.getLastName());
        T_telefono.setText(Long.toString(appClient.getPhone()));
        idClienteSolicita = appClient;
    }
    
    public void updateAppointmentOldClientData(Client appClient){
        clientNew = false;
        T_primerNombre.setText(appClient.getFirstName());
        T_secondName.setText(appClient.getLastName());
        T_telefono.setText(Long.toString(appClient.getPhone()));
        idClienteSolicita = appClient;
    }
        
    /*KeyEventDispatcher keyEventDispatcher = new KeyEventDispatcher() {
        @Override
        public boolean dispatchKeyEvent(final KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_TYPED) {
            String eString = e.toString();
            if(eString.contains("Intro") && !busy){
                confirm();
            }
        }
        // Pass the KeyEvent to the next KeyEventDispatcher in the chain
            return false;
        }
    };*/
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NN_agregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NN_agregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NN_agregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NN_agregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NN_agregarEmpleado().setVisible(true);
            }
        });
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton B__selectCliente;
    private javax.swing.JButton B_agregar;
    private javax.swing.JTextField B_cantidad;
    private javax.swing.JButton B_nuevoCliente;
    private javax.swing.JComboBox<String> CBO_año;
    private javax.swing.JComboBox<String> CBO_dia;
    private javax.swing.JComboBox<String> CBO_mes;
    private javax.swing.JLabel Line1;
    private javax.swing.JLabel Line2;
    private javax.swing.JLabel Line3;
    private javax.swing.JLabel Line4;
    private javax.swing.JLabel Line5;
    private javax.swing.JLabel T_Cantidad;
    private javax.swing.JLabel T_Success;
    private javax.swing.JLabel T_id;
    private javax.swing.JLabel T_primerNombre;
    private javax.swing.JLabel T_secondName;
    private javax.swing.JLabel T_telefono;
    private javax.swing.JLabel buttonS1;
    private javax.swing.JLabel buttonS2;
    private javax.swing.JLabel buttonS3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
