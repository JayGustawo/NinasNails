/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NN_jframes;

import BusinessObjects.Client;
import BusinessObjects.Employee;
import Managers.DatabaseManager;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Armando
 */
public class NN_editarEmpleado extends javax.swing.JFrame {

    DatabaseManager db;
    boolean busy = false;
    NN_JframeAdmin manager;
    NN_empleadoMain employeeMenu;
    Employee selectedEmployee;
    /**
     * Creates new form NN_agregarCliente
     */
    public NN_editarEmpleado() {
        initComponents();
        db = NN_MainClass.db;
        setMinimumSize(new Dimension(600,515).getSize());
        hidebttn();
        //KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(keyEventDispatcher);
        manager = NN_MainClass.getManager();
        employeeMenu = manager.managerEmpleadoMain;
        Employee editEmploy = db.getEmployeeById(employeeMenu.selectedId);
        T_id.setText(Integer.toString(editEmploy.getId()));
        TB_firstName.setText(editEmploy.getFirstName());
        TB_lastName.setText(editEmploy.getLastName());
        TB_direccion.setText(editEmploy.getAddress());
        TB_usuario.setText(editEmploy.getUserName());
        PB_password.setText(editEmploy.getPass());
        PB_password1.setText(editEmploy.getPass());
        TB_telefono.setText(Long.toString(editEmploy.getPhone()));
        if(editEmploy.getRole().equals("Admin")){
            CB_admin.setSelected(true);
        }
        
    }

    public void hidebttn(){
       
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

        line10 = new javax.swing.JLabel();
        line9 = new javax.swing.JLabel();
        line8 = new javax.swing.JLabel();
        line7 = new javax.swing.JLabel();
        line6 = new javax.swing.JLabel();
        line5 = new javax.swing.JLabel();
        line4 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        B_agregar = new javax.swing.JButton();
        line11 = new javax.swing.JLabel();
        T_Nombre = new javax.swing.JLabel();
        T_Id = new javax.swing.JLabel();
        T_Apellido = new javax.swing.JLabel();
        T_Direccion = new javax.swing.JLabel();
        TB_firstName = new javax.swing.JTextField();
        TB_lastName = new javax.swing.JTextField();
        TB_direccion = new javax.swing.JTextField();
        T_id = new javax.swing.JLabel();
        T_Usuario = new javax.swing.JLabel();
        TB_usuario = new javax.swing.JTextField();
        T_telefono = new javax.swing.JLabel();
        TB_telefono = new javax.swing.JTextField();
        T_admin = new javax.swing.JLabel();
        CB_admin = new javax.swing.JCheckBox();
        T_Password = new javax.swing.JLabel();
        T_Password1 = new javax.swing.JLabel();
        PB_password = new javax.swing.JPasswordField();
        PB_password1 = new javax.swing.JPasswordField();
        T_Success = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Editar empleado");
        setLocation(new java.awt.Point(300, 230));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
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

        line10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 390, -1, 10));

        line9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 340, -1, 10));

        line8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, -1, 10));

        line7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, -1, 10));

        line6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, -1, 10));

        line5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, -1, 10));

        line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, -1, 10));

        line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, -1, 10));

        line3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_line.png"))); // NOI18N
        getContentPane().add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, -1, 10));

        B_agregar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_agregar.setForeground(new java.awt.Color(255, 255, 255));
        B_agregar.setText("Editar");
        B_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(B_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 80, 30));

        line11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Clientmain/clientMain_button.png"))); // NOI18N
        getContentPane().add(line11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 120, 50));

        T_Nombre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Nombre.setForeground(new java.awt.Color(0, 102, 102));
        T_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Nombre.setText("Primer Nombre");
        getContentPane().add(T_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 172, -1));

        T_Id.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Id.setForeground(new java.awt.Color(0, 102, 102));
        T_Id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Id.setText("ID de empleado");
        getContentPane().add(T_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 172, -1));

        T_Apellido.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Apellido.setForeground(new java.awt.Color(0, 102, 102));
        T_Apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Apellido.setText("Apellidos");
        getContentPane().add(T_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 172, -1));

        T_Direccion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Direccion.setForeground(new java.awt.Color(0, 102, 102));
        T_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Direccion.setText("Direccion");
        getContentPane().add(T_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 172, -1));

        TB_firstName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_firstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TB_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 249, -1));

        TB_lastName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_lastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TB_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 249, -1));

        TB_direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TB_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 249, -1));

        T_id.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_id.setForeground(new java.awt.Color(0, 102, 102));
        T_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_id.setText("-");
        getContentPane().add(T_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 249, -1));

        T_Usuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Usuario.setForeground(new java.awt.Color(0, 102, 102));
        T_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Usuario.setText("Nombre de usuario");
        getContentPane().add(T_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 172, -1));

        TB_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TB_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 249, -1));

        T_telefono.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_telefono.setForeground(new java.awt.Color(0, 102, 102));
        T_telefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_telefono.setText("Numero de telefono");
        getContentPane().add(T_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 172, -1));

        TB_telefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TB_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 249, -1));

        T_admin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_admin.setForeground(new java.awt.Color(0, 102, 102));
        T_admin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_admin.setText("Administrador");
        getContentPane().add(T_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 172, -1));

        CB_admin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(CB_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        T_Password.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Password.setForeground(new java.awt.Color(0, 102, 102));
        T_Password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Password.setText("Password");
        getContentPane().add(T_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 172, -1));

        T_Password1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Password1.setForeground(new java.awt.Color(0, 102, 102));
        T_Password1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_Password1.setText("Verifica el password");
        getContentPane().add(T_Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 172, -1));

        PB_password.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PB_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PB_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 249, -1));

        PB_password1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PB_password1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PB_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 249, -1));

        T_Success.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_Success.setForeground(new java.awt.Color(0, 102, 102));
        T_Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Success.setText("-");
        getContentPane().add(T_Success, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 447, 450, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Empleadomain/Empleadomain_background.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        employeeMenu.refreshTable();
        employeeMenu.enable(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void B_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_agregarActionPerformed
        // TODO add your handling code here
        confirm();
    }//GEN-LAST:event_B_agregarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        busy = false;
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        busy = true;
    }//GEN-LAST:event_formWindowLostFocus
    
    public void confirm(){
        boolean okFName = true;
        boolean okLName = true;
        boolean okAddress = true;
        boolean okUsername = true;
        boolean okPass = true;
        boolean okPhone = true;
        boolean okBoth = true;
        boolean valFN = false;
        boolean valLN = false;
        String addFirstName = TB_firstName.getText();
        String addLastName = TB_lastName.getText();
        valFN = validateFirstName(TB_firstName.getText());
        valLN = validateLastName(TB_lastName.getText());
        String addAddress = TB_direccion.getText();
        String addUser = TB_usuario.getText();
        String addPass = PB_password.getText();
        long addPhone  = 0;
        String addRole = "User";
        if(CB_admin.isSelected()){
            addRole = "Admin";
        }
        if(addFirstName.length() > 40 || addFirstName.equals("") || addFirstName == null ){
            okFName = false;
            JOptionPane.showMessageDialog(null, "Los nombres deben ser menor a 40 caracteres", "Error en el primer nombre", JOptionPane.INFORMATION_MESSAGE);
        }
        if(addLastName.length() > 40 || addLastName.equals("") || addLastName == null){
            okLName = false;
            JOptionPane.showMessageDialog(null, "Los nombres deben ser menor a 40 caracteres", "Error en los apellidos", JOptionPane.INFORMATION_MESSAGE);
        }
        if(addAddress.length() > 80){
            okAddress = false;
            JOptionPane.showMessageDialog(null, "La direccion debe ser menor a 80 caracteres", "Error en la direccion", JOptionPane.INFORMATION_MESSAGE);
        }
        if( ( addUser.equals("") && !addPass.equals("") ) || ( !addUser.equals("") && addPass.equals("") ) ){
            okBoth = false;
            JOptionPane.showMessageDialog(null, "No puede crear usuario sin password", "Error en el usuario/password", JOptionPane.INFORMATION_MESSAGE);
        }
        if(addUser.length() > 20){
            okUsername = false;
            JOptionPane.showMessageDialog(null, "El usuario debe ser menor a 20 caracteres", "Error en el usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        if(addPass.length() > 20){
            okPass = false;
            JOptionPane.showMessageDialog(null, "EL password debe ser menor a 20 caracteres", "Error en el password", JOptionPane.INFORMATION_MESSAGE);
        }
        if(!addPass.equals(PB_password1.getText())){
            okPass = false;
            JOptionPane.showMessageDialog(null, "El password no coincide", "Error en el password", JOptionPane.INFORMATION_MESSAGE);
        }
        if(addPass.equalsIgnoreCase("password")){
            okPass = false;
            JOptionPane.showMessageDialog(null, "El password no puede ser password", "Error en el password", JOptionPane.INFORMATION_MESSAGE);
        }
        if(db.checkUser(addRole)){
            okUsername = false;
            JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre", "Error en el usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        if(!TB_telefono.getText().equals("")){
            try{
                addPhone = Long.parseLong(TB_telefono.getText());
            } catch(Exception e){
                okPhone = false;
                JOptionPane.showMessageDialog(null, "El numero de telefono no puede contener letras y debe ser menor a 20 caracteres", "Error en Telefono", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        if(okLName && okFName && okPhone && okBoth && okAddress && okUsername && okPass && valFN && valLN){
            Employee editEmploy = new Employee();
            editEmploy.setFirstName(TB_firstName.getText());
            editEmploy.setLastName(TB_lastName.getText());
            editEmploy.setId(Integer.parseInt(T_id.getText()));
            editEmploy.setAddress(addAddress);
            editEmploy.setUserName(addUser);
            editEmploy.setPass(addPass);
            editEmploy.setPhone(addPhone);
            editEmploy.setRole(addRole);
            selectedEmployee = editEmploy;
            manager.openEmpleadoAdminVer();
            this.enable(false);
        }
    }
    
    public void validated(boolean status){
        if(status){
            TB_firstName.setText("");
            TB_lastName.setText("");
            TB_direccion.setText("");
            TB_usuario.setText("");
            PB_password.setText("");
            PB_password1.setText("");
            TB_direccion.setText("");
            TB_telefono.setText("");
            CB_admin.setSelected(false);
            int newid = db.getMaxClient() + 1;
            T_id.setText(Integer.toString(newid));
            T_Success.setText("Se agrego correctamente");
            
        }
        else{
           JOptionPane.showMessageDialog(null, "Hubo un error al tratar de agregar a la base de datos", "Error en la base de datos", JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    KeyEventDispatcher keyEventDispatcher = new KeyEventDispatcher() {
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
    };
    
    public boolean validateLastName(String text){
        boolean valid = true;
        boolean isAlp = true;
        boolean only2 = true;
        String names[] = {"",""};
        StringTokenizer tokens = new StringTokenizer(text);
        int maxT = tokens.countTokens();
        if(tokens.countTokens() > 2 || tokens.countTokens() == 0){
            only2 = false;
        }
        else{
            for(int c=0; c <= tokens.countTokens() ; c++){
                names[c] = tokens.nextToken();
                names[c] = names[c].toLowerCase();
                names[c] = Character.toUpperCase(names[c].charAt(0)) + names[c].substring(1);
                for(int z=0 ; z < names[c].length() ;z++){
                    if(isAlp){
                        isAlp = Character.isAlphabetic(names[c].charAt(z));   
                    }
                    if(!isAlp){
                        z = names[c].length();
                    }
                }
            }
        }
        if(!isAlp){
            valid = false;
            JOptionPane.showMessageDialog(null, "Solo se permiten letras en el nombre", "Error en los nombres", JOptionPane.INFORMATION_MESSAGE);
        }
        if(!only2){
            valid = false;
            JOptionPane.showMessageDialog(null, "Maximo dos nombres por campo, minimo 1", "Error en los nombres", JOptionPane.INFORMATION_MESSAGE);
        }
        if(isAlp && only2 && valid){
            if(maxT==1){
                TB_lastName.setText(names[0]);
            }
            else{
                TB_lastName.setText(names[0] + " " + names[1]);
            }
        }
        return valid;
    }
    
    public boolean validateFirstName(String text){
        boolean valid = true;
        boolean isAlp = true;
        boolean only2 = true;
        String names[] = {"",""};
        StringTokenizer tokens = new StringTokenizer(text);
        int maxT = tokens.countTokens();
        if(tokens.countTokens() > 2 || tokens.countTokens() == 0){
            only2 = false;
        }
        else{
            for(int c=0; c <= tokens.countTokens() ; c++){
                names[c] = tokens.nextToken();
                names[c] = names[c].toLowerCase();
                names[c] = Character.toUpperCase(names[c].charAt(0)) + names[c].substring(1);
                for(int z=0 ; z < names[c].length() ;z++){
                    if(isAlp){
                        isAlp = Character.isAlphabetic(names[c].charAt(z));   
                    }
                    if(!isAlp){
                        z = names[c].length();
                    }
                }
            }
        }
        if(!isAlp){
            valid = false;
            JOptionPane.showMessageDialog(null, "Solo se permiten letras en el nombre", "Error en los nombres", JOptionPane.INFORMATION_MESSAGE);
        }
        if(!only2){
            valid = false;
            JOptionPane.showMessageDialog(null, "Maximo dos nombres por campo, minimo 1", "Error en los nombres", JOptionPane.INFORMATION_MESSAGE);
        }
        if(isAlp && only2 && valid){
            if(maxT==1){
                TB_firstName.setText(names[0]);
            }
            else{
                TB_firstName.setText(names[0] + " " + names[1]);
            }
        }
        return valid;
    }
    
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
            java.util.logging.Logger.getLogger(NN_editarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NN_editarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NN_editarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NN_editarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NN_editarEmpleado().setVisible(true);
            }
        });
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton B_agregar;
    private javax.swing.JCheckBox CB_admin;
    private javax.swing.JPasswordField PB_password;
    private javax.swing.JPasswordField PB_password1;
    private javax.swing.JTextField TB_direccion;
    private javax.swing.JTextField TB_firstName;
    private javax.swing.JTextField TB_lastName;
    private javax.swing.JTextField TB_telefono;
    private javax.swing.JTextField TB_usuario;
    private javax.swing.JLabel T_Apellido;
    private javax.swing.JLabel T_Direccion;
    private javax.swing.JLabel T_Id;
    private javax.swing.JLabel T_Nombre;
    private javax.swing.JLabel T_Password;
    private javax.swing.JLabel T_Password1;
    private javax.swing.JLabel T_Success;
    private javax.swing.JLabel T_Usuario;
    private javax.swing.JLabel T_admin;
    private javax.swing.JLabel T_id;
    private javax.swing.JLabel T_telefono;
    private javax.swing.JLabel line10;
    private javax.swing.JLabel line11;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel line4;
    private javax.swing.JLabel line5;
    private javax.swing.JLabel line6;
    private javax.swing.JLabel line7;
    private javax.swing.JLabel line8;
    private javax.swing.JLabel line9;
    // End of variables declaration//GEN-END:variables
}
