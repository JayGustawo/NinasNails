/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NN_jframes;

import BusinessObjects.Appointment;
import BusinessObjects.Client;
import BusinessObjects.Employee;
import Managers.DatabaseManager;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    


/**
 *
 * @author Diego Armando
 */
public class NN_agregarCita extends javax.swing.JFrame {
    
    DatabaseManager db;
    boolean busy = false;
    boolean clientNew = false;
    Client idClienteSolicita = null;
    NN_JframeAdmin manager;
    NN_citaMain appointmentMenu;
    /**
     * Creates new form NN_agregarCliente
     */
    public NN_agregarCita() {
        initComponents();
        setMinimumSize(new Dimension(600,575).getSize());
        hidebttn();
        //KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(keyEventDispatcher);
        manager = NN_MainClass.getManager();
        db = NN_MainClass.db;
        appointmentMenu = manager.managerCitaMain;
        //int newid = db.getMaxAppointment() + 1;
        int newid = db.getMax("APPOINTMENT");
        T_id.setText(Integer.toString(newid));
        LocalDate rightnow = java.time.LocalDate.now();
        CBO_dia.setSelectedIndex(rightnow.getDayOfMonth()-1);
        CBO_mes.setSelectedIndex(rightnow.getMonthValue()-1);
        CBO_año.setSelectedIndex(rightnow.getYear()-2017);
        
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

        B_agregar = new javax.swing.JButton();
        B__selectCliente = new javax.swing.JButton();
        B_nuevoCliente = new javax.swing.JButton();
        line10 = new javax.swing.JLabel();
        line9 = new javax.swing.JLabel();
        line8 = new javax.swing.JLabel();
        line5 = new javax.swing.JLabel();
        line4 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        T_primerNombre = new javax.swing.JLabel();
        T_secondName = new javax.swing.JLabel();
        T_telefono = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TB_hora = new javax.swing.JTextField();
        T_id = new javax.swing.JLabel();
        T_Success = new javax.swing.JLabel();
        TB_minutos = new javax.swing.JTextField();
        CBO_dia = new javax.swing.JComboBox<>();
        CBO_mes = new javax.swing.JComboBox<>();
        CBO_año = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CB_turno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_razon = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar cita");
        setLocation(new java.awt.Point(300, 230));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));
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

        B_agregar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_agregar.setForeground(new java.awt.Color(255, 255, 255));
        B_agregar.setText("Agregar");
        B_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(B_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        B__selectCliente.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        B__selectCliente.setForeground(new java.awt.Color(255, 255, 255));
        B__selectCliente.setText("Escoger Cliente");
        B__selectCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B__selectClienteActionPerformed(evt);
            }
        });
        getContentPane().add(B__selectCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, -1));

        B_nuevoCliente.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        B_nuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        B_nuevoCliente.setText("Nuevo Cliente");
        B_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_nuevoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(B_nuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        line10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_button.png"))); // NOI18N
        getContentPane().add(line10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 140, 50));

        line9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_button.png"))); // NOI18N
        getContentPane().add(line9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 140, 50));

        line8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_button.png"))); // NOI18N
        getContentPane().add(line8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 150, 50));

        line5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_line.png"))); // NOI18N
        getContentPane().add(line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, -1, 10));

        line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_line.png"))); // NOI18N
        getContentPane().add(line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, -1, 10));

        line3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_line.png"))); // NOI18N
        getContentPane().add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, -1, 10));

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_line.png"))); // NOI18N
        getContentPane().add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, -1, 10));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_line.png"))); // NOI18N
        getContentPane().add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, -1, 10));

        line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_line.png"))); // NOI18N
        getContentPane().add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, -1, 10));

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

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Razon");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 20));

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

        TB_hora.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_hora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TB_hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TB_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 40, -1));

        T_id.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        T_id.setForeground(new java.awt.Color(0, 102, 102));
        T_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_id.setText("-");
        getContentPane().add(T_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, -1));

        T_Success.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        T_Success.setForeground(new java.awt.Color(0, 51, 51));
        T_Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Success.setText("-");
        getContentPane().add(T_Success, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 453, 540, 30));

        TB_minutos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_minutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TB_minutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TB_minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 40, -1));

        CBO_dia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(CBO_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        CBO_mes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(CBO_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        CBO_año.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        getContentPane().add(CBO_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText(":");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 10, -1));

        CB_turno.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CB_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a.m.", "p.m." }));
        getContentPane().add(CB_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        TA_razon.setColumns(20);
        TA_razon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TA_razon.setRows(5);
        TA_razon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(TA_razon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 290, 190));

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

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Hora");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 20));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/Appmain/appMain_background.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        appointmentMenu.refreshTable();
        appointmentMenu.enable(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    public void confirm(){
        boolean reasonSize = true;
        boolean numHour = true;
        boolean inDayTime = true;
        boolean clientSelected = true;
        int hora = 0;
        int minuto = 0;
        try{
            hora = Integer.parseInt(TB_hora.getText());
            minuto = Integer.parseInt(TB_minutos.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "La hora debe ser solo numeros", "Error en la hora", JOptionPane.INFORMATION_MESSAGE);
            numHour = false;
        }
        if(hora > 12 || hora < 0){
            inDayTime = false;
            JOptionPane.showMessageDialog(null, "La hora debe estar entre 0 y 12", "Error en la hora", JOptionPane.INFORMATION_MESSAGE);
        }
        if(minuto > 59 || minuto < 0){
            inDayTime = false;
            JOptionPane.showMessageDialog(null, "Los minutos deben estar entre 0 y 59", "Error en los minutos", JOptionPane.INFORMATION_MESSAGE);
        }
        if(idClienteSolicita == null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar o agregar un cliente", "Error en el cliente", JOptionPane.INFORMATION_MESSAGE);
            clientSelected = false;
        }
        if(TA_razon.getText().length() > 1000){
            JOptionPane.showMessageDialog(null, "El tamaño de la razon no debe exceder 1000 caracteres", "Error en la razon", JOptionPane.INFORMATION_MESSAGE);
            reasonSize = false;
        }
        if(numHour && inDayTime && clientSelected && reasonSize){
            if(clientNew){
                boolean isNew;
                Client queryClient = db.getClientbyName(idClienteSolicita.getFirstName(), idClienteSolicita.getLastName());
                if(queryClient.getFirstName()!= null){
                    if(queryClient.getPhone() == idClienteSolicita.getPhone()){
                        idClienteSolicita.setId(queryClient.getId());
                        isNew = false;
                        manager.openAddAppClientExist();
                        this.enable(false);
                    }
                }
                else{
                    db.addClient(idClienteSolicita);
                    finishAppointment();  
                }
                
            }
            else{
                finishAppointment();                
            }  
        }
    }
    
    public void finishAppointment(){
        Appointment newAppointment = new Appointment();
        String turno;
        int hourInt = Integer.parseInt(TB_hora.getText());
        int minuteInt = Integer.parseInt(TB_minutos.getText());
        String SMinute = null;
        double hourValue;
        double onlyHour = Float.parseFloat(TB_hora.getText());
        double onlyMinute = Float.parseFloat(TB_minutos.getText());
        if(minuteInt < 10){
            SMinute = "0" + minuteInt;
        }
        else{
            SMinute = Integer.toString(minuteInt);
        }
        if(CB_turno.getSelectedIndex()==0){
            turno = "AM";
            hourValue = onlyHour + (onlyMinute * 0.01);
        }
        else{
            turno = "PM";
            hourValue = 12 + onlyHour + (onlyMinute * 0.01);
        }
        String hour = hourInt + ":" + SMinute + " " + turno;
        System.out.print(hour);
        int newMonth = CBO_mes.getSelectedIndex();
        int newDay = CBO_dia.getSelectedIndex()+1;
        String SnewYear = CBO_año.getSelectedItem().toString();
        int newYear = Integer.parseInt(SnewYear);
        newAppointment.setId(db.getMaxAppointment()+1);
        newAppointment.setId_c(idClienteSolicita.getId());
        newAppointment.setId_e(manager.loggeduser.getId());
        newAppointment.setDay(newDay);
        newAppointment.setMonth(newMonth);
        newAppointment.setYear(newYear);
        newAppointment.setReason(TA_razon.getText());
        newAppointment.setHour(hour);
        newAppointment.setHourValue(hourValue);
        if(db.CheckAppointmentByTime(newDay, newMonth, newYear, hourValue) > 0){
            JOptionPane.showMessageDialog(null, "Fecha y hora se encuentra ocupada, porfavor intente otra", "Fecha y hora ocupada", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!db.CheckAppointmentHour(newAppointment).equals("libre")){
            if (JOptionPane.showConfirmDialog(null, "Existe una cita a las " + db.CheckAppointmentHour(newAppointment) +" ¿Esta seguro de agregar la cita?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // yes option
            db.updateAppointment(newAppointment);
            T_Success.setText("Se agrego correctamente la cita");
            refresh();
            appointmentMenu.refreshTable();
            } else {
            // no option
            }
        }
        else{
            db.addAppointment(newAppointment);
            T_Success.setText("Se agrego correctamente la cita");
            refresh();
            appointmentMenu.refreshTable();
        }
        
    }
    
    public void reset(){
        boolean clientNew = false;
        Client idClienteSolicita = null;
        T_primerNombre.setText("Primer Nombre");
        T_secondName.setText("Apellidos");
        T_telefono.setText("Telefono");
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
    
    public void refresh(){
        //int newid = db.getMaxAppointment() + 1;
        int newid = db.getMax("APPOINTMENT");
        T_id.setText(Integer.toString(newid));
        LocalDate rightnow = java.time.LocalDate.now();
        CBO_dia.setSelectedIndex(rightnow.getDayOfMonth()-1);
        CBO_mes.setSelectedIndex(rightnow.getMonthValue()-1);
        CBO_año.setSelectedIndex(rightnow.getYear()-2017);
        TA_razon.setText("");
        TB_hora.setText("");
        TB_minutos.setText("");
        boolean clientNew = false;
        CB_turno.setSelectedIndex(0);
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
        manager.openAddAppClient();
        this.enable(false);
    }//GEN-LAST:event_B__selectClienteActionPerformed

    private void B_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_nuevoClienteActionPerformed
        // TODO add your handling code here:
        manager.openAddAppAddClient();
        this.enable(false);
    }//GEN-LAST:event_B_nuevoClienteActionPerformed

    private void B_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_agregarActionPerformed
        // TODO add your handling code here
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
    private javax.swing.JButton B_nuevoCliente;
    private javax.swing.JComboBox<String> CBO_año;
    private javax.swing.JComboBox<String> CBO_dia;
    private javax.swing.JComboBox<String> CBO_mes;
    private javax.swing.JComboBox<String> CB_turno;
    private javax.swing.JTextArea TA_razon;
    private javax.swing.JTextField TB_hora;
    private javax.swing.JTextField TB_minutos;
    private javax.swing.JLabel T_Success;
    private javax.swing.JLabel T_id;
    private javax.swing.JLabel T_primerNombre;
    private javax.swing.JLabel T_secondName;
    private javax.swing.JLabel T_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line10;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel line4;
    private javax.swing.JLabel line5;
    private javax.swing.JLabel line8;
    private javax.swing.JLabel line9;
    // End of variables declaration//GEN-END:variables
}
