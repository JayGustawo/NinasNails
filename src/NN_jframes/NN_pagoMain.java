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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Armando
 */
public class NN_pagoMain extends javax.swing.JFrame {
    
    DatabaseManager db;
    public NN_JframeAdmin manager;
    int selectedId;
    /**
     * Creates new form NN_citaMain
     */
    public NN_pagoMain() {
        initComponents();
        manager = NN_MainClass.getManager();
        db = NN_MainClass.db;
        hidebttn();
        setMinimumSize(new Dimension(1000,715).getSize());
        DefaultTableModel amodel = (DefaultTableModel)table_pago.getModel();
        amodel.setRowCount(0);
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "proyectouser", "proyecto");
            String colhead[]={"ID","Cliente","Empleado","Cantidad","Dia","Mes","Año"};
            amodel.setColumnIdentifiers(colhead);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select ID,ID_A,ID_E,AMOUNT,DAY,MONTH,YEAR FROM PAYMENT ORDER BY ID ASC");
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols=rsmd.getColumnCount();
            while(rs.next()){
                Object[] obj=new Object[cols];
                for(int i=0; i<cols; i++){
                    if(i==1){
                        obj[i] = idToClientName(rs.getInt("ID_A"));
                    }
                    else if(i==2){
                        obj[i] = idToEmployeeName(rs.getInt("ID_E"));
                    }
                    else if(i==5){
                       switch (rs.getInt("MONTH")){
                           case 0:  obj[i]= "Enero";
                           break;
                           case 1:  obj[i]= "Febrero";
                           break;
                           case 2:  obj[i]= "Marzo";
                           break;
                           case 3:  obj[i]= "Abril";
                           break;
                           case 4:  obj[i]= "Mayo";
                           break;
                           case 5:  obj[i]= "Junio";
                           break;
                           case 6:  obj[i]= "Julio";
                           break;
                           case 7:  obj[i]= "Agosto";
                           break;
                           case 8:  obj[i]= "Septiembre";
                           break;
                           case 9:  obj[i]= "Octubre";
                           break;
                           case 10:  obj[i]= "Noviembre";
                           break;
                           case 11:  obj[i]= "Diciembre";
                           break;
                       }
                    }
                    else{
                        obj[i]=rs.getObject(i+1);
                    }
                                    }
                amodel.addRow(obj);
            }
            conn.close();
        }catch(Exception e){
        }
        table_pago.setDefaultEditor(Object.class, null);
    }

    public void hidebttn(){
                
        B_salir.setOpaque(false);
        B_salir.setContentAreaFilled(false); //to make the content area transparent
        B_salir.setBorderPainted(false); //to make the borders transparent
        
        B_editar.setOpaque(false);
        B_editar.setContentAreaFilled(false); //to make the content area transparent
        B_editar.setBorderPainted(false); //to make the borders transparent
        
        B_agregar.setOpaque(false);
        B_agregar.setContentAreaFilled(false); //to make the content area transparent
        B_agregar.setBorderPainted(false); //to make the borders transparent
        
        B_eliminar.setOpaque(false);
        B_eliminar.setContentAreaFilled(false); //to make the content area transparent
        B_eliminar.setBorderPainted(false); //to make the borders transparent
        
        B_consulta.setOpaque(false);
        B_consulta.setContentAreaFilled(false); //to make the content area transparent
        B_consulta.setBorderPainted(false); //to make the borders transparent         
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBO_dia = new javax.swing.JComboBox<>();
        CBO_mes = new javax.swing.JComboBox<>();
        CBO_año = new javax.swing.JComboBox<>();
        B_consulta = new javax.swing.JButton();
        SP_table = new javax.swing.JScrollPane();
        table_pago = new javax.swing.JTable();
        text_Message = new javax.swing.JLabel();
        B_salir = new javax.swing.JButton();
        B_agregar = new javax.swing.JButton();
        B_eliminar = new javax.swing.JButton();
        B_editar = new javax.swing.JButton();
        TB_textSelect = new javax.swing.JTextField();
        T_message = new javax.swing.JLabel();
        buttonE = new javax.swing.JLabel();
        buttonA = new javax.swing.JLabel();
        buttonED = new javax.swing.JLabel();
        buttonS = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        Tab_text = new javax.swing.JLabel();
        TAB = new javax.swing.JLabel();
        buttonS1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pagos");
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBO_dia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(CBO_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        CBO_mes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(CBO_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        CBO_año.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CBO_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        getContentPane().add(CBO_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        B_consulta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        B_consulta.setForeground(new java.awt.Color(255, 255, 255));
        B_consulta.setText("Consultar");
        B_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(B_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 23, 90, 30));

        SP_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 214, 207), 3));

        table_pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pagoMouseClicked(evt);
            }
        });
        SP_table.setViewportView(table_pago);

        getContentPane().add(SP_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 980, 520));

        text_Message.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        text_Message.setForeground(new java.awt.Color(0, 102, 102));
        text_Message.setText("Id de pago seleccionado");
        getContentPane().add(text_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 589, 146, 30));

        B_salir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_salir.setForeground(new java.awt.Color(255, 255, 255));
        B_salir.setText("Salir");
        B_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_salirActionPerformed(evt);
            }
        });
        getContentPane().add(B_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 645, 90, 30));

        B_agregar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_agregar.setForeground(new java.awt.Color(255, 255, 255));
        B_agregar.setText("Agregar");
        B_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(B_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 645, 90, 30));

        B_eliminar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        B_eliminar.setText("Eliminar");
        B_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(B_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 645, 90, 30));

        B_editar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        B_editar.setForeground(new java.awt.Color(255, 255, 255));
        B_editar.setText("Editar");
        B_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_editarActionPerformed(evt);
            }
        });
        getContentPane().add(B_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 645, 90, 30));

        TB_textSelect.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TB_textSelect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TB_textSelect.setText("-");
        getContentPane().add(TB_textSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 593, 22, -1));

        T_message.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        T_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(T_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 281, 28));

        buttonE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, 40));

        buttonA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, 40));

        buttonED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonED, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, -1, 40));

        buttonS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, -1, 40));

        Line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_line.png"))); // NOI18N
        getContentPane().add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 40));

        Tab_text.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Tab_text.setForeground(new java.awt.Color(255, 255, 255));
        Tab_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_text.setText("Pagos");
        getContentPane().add(Tab_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, -1));

        TAB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_tab.png"))); // NOI18N
        getContentPane().add(TAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 40));

        buttonS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_button.png"))); // NOI18N
        getContentPane().add(buttonS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 20, 90, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/NinaNails/pagoMain/pagoMain_background.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pagoMouseClicked
        // TODO add your handling code here:
        table_pago.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = table_pago.rowAtPoint(evt.getPoint());
        int col = table_pago.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            DefaultTableModel amodel = (DefaultTableModel)table_pago.getModel();
            Object ido = amodel.getValueAt(row, 0);
            selectedId = Integer.parseInt(ido.toString());
            TB_textSelect.setText(ido.toString());
        }
    }
});
    }//GEN-LAST:event_table_pagoMouseClicked

    private void B_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_salirActionPerformed
        // TODO add your handling code here:
        manager.openMainMenu();
        this.dispose();
    }//GEN-LAST:event_B_salirActionPerformed

    private void B_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_agregarActionPerformed
        // TODO add your handling code here:
        manager.openAddPay();
        this.enable(false);
    }//GEN-LAST:event_B_agregarActionPerformed

    private void B_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminarActionPerformed
        // TODO add your handling code here:
        boolean ok=true;
        try{
            selectedId = Integer.parseInt(TB_textSelect.getText());
        }catch(Exception e){
            ok = false;
            selectedId = 0;
            JOptionPane.showMessageDialog(null, "Id de pago invalido", "ID invalido", JOptionPane.INFORMATION_MESSAGE);
        }
       if(ok){
            Payment query = db.getPaymentById(selectedId);
            try{
                if(query.getId() == selectedId){
                    //Abrir Verificacion para eliminar pago
                    manager.openPagoVer();
                    this.enable(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Id no existe", "ID invalido", JOptionPane.INFORMATION_MESSAGE);
                }
            }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Id no existe", "ID invalido", JOptionPane.INFORMATION_MESSAGE);
            }
            
       }
    }//GEN-LAST:event_B_eliminarActionPerformed

    private void B_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_editarActionPerformed
        boolean ok=true;
        try{
            selectedId = Integer.parseInt(TB_textSelect.getText());
        }catch(Exception e){
            ok = false;
            selectedId = 0;
            JOptionPane.showMessageDialog(null, "Id de pago invalido", "ID invalido", JOptionPane.INFORMATION_MESSAGE);
        }
       if(ok){
            Payment query = db.getPaymentById(selectedId);
            try{
                if(query.getId() == selectedId){
                   manager.openPagoEdit();
                    this.enable(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Id no existe", "ID invalido", JOptionPane.INFORMATION_MESSAGE);
                }
            }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Id no existe", "ID invalido", JOptionPane.INFORMATION_MESSAGE);
            }
            
       }
    }//GEN-LAST:event_B_editarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        manager.openMainMenu();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void B_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_consultaActionPerformed
        // TODO add your handling code here:
        rTableFull();
    }//GEN-LAST:event_B_consultaActionPerformed

    public void rTableFull(){
        boolean invalid = false;
        DefaultTableModel amodel = (DefaultTableModel)table_pago.getModel();
        amodel.setRowCount(0);
        int dia = 0;
        int año = 0;
        int mes = 0;
        dia = CBO_dia.getSelectedIndex();
        if(CBO_año.getSelectedIndex()!=0){
            año = Integer.parseInt(CBO_año.getSelectedItem().toString());    
        }
        mes = CBO_mes.getSelectedIndex()-1;
        int c=0;
        Payment query[] = null;
        if(CBO_dia.getSelectedIndex()==0 && CBO_mes.getSelectedIndex() ==0 && CBO_año.getSelectedIndex()==0){
            refreshTable();
            invalid = true;
        }
        if(CBO_dia.getSelectedIndex()==0 && CBO_mes.getSelectedIndex()==0 && CBO_año.getSelectedIndex()!=0){
            query = db.getPaymentsByYear(año);
        }
        if(CBO_dia.getSelectedIndex()==0 && CBO_año.getSelectedIndex()==0 && CBO_mes.getSelectedIndex()!=0){
            query = db.getPaymentsByMonth(mes);
        }
        if(CBO_año.getSelectedIndex()==0 && CBO_mes.getSelectedIndex()==0 && CBO_dia.getSelectedIndex()!=0){
            query = db.getPaymentsByDay(dia);
        }
        if(CBO_dia.getSelectedIndex()==0 && CBO_mes.getSelectedIndex()!=0 && CBO_año.getSelectedIndex()!=0){
            query = db.getPaymentsByMonthYear(mes,año);
        }
        if(CBO_mes.getSelectedIndex()!=0 && CBO_dia.getSelectedIndex()!=0 && CBO_año.getSelectedIndex()==0){
            query = db.getPaymentsByMonthDay(mes,dia);
        }
        if(CBO_mes.getSelectedIndex()==0 && CBO_dia.getSelectedIndex()!=0 && CBO_año.getSelectedIndex()!=0){
            query = db.getPaymentsByDayYear(dia,año);
        }
        if(CBO_mes.getSelectedIndex()!=0 && CBO_dia.getSelectedIndex()!=0 && CBO_año.getSelectedIndex()!=0){
            query = db.getPaymentsByDate(dia,mes,año);   
        }
        if(!invalid){
            try {
            String colhead[]={"ID","Cliente","Empleado","Cantidad","Dia","Mes","Año"};
            amodel.setColumnIdentifiers(colhead);   
            int cols=8;
            int max = query.length;
            while(c < max){
                Object[] obj=new Object[cols];
                for(int i=0; i<cols; i++){
                    if(i==0){
                        obj[i]= query[c].getId();
                    }
                    else if(i==1){
                        obj[i]= idToClientName(query[c].getId_a());
                    }
                    else if(i==2){
                        obj[i]= idToEmployeeName(query[c].getId_e());
                    }
                    else if(i==3){
                        obj[i]= query[c].getAmount();
                    }
                    else if(i==5){
                       switch (query[c].getMonth()){
                           case 0:  obj[i]= "Enero";
                           break;
                           case 1:  obj[i]= "Febrero";
                           break;
                           case 2:  obj[i]= "Marzo";
                           break;
                           case 3:  obj[i]= "Abril";
                           break;
                           case 4:  obj[i]= "Mayo";
                           break;
                           case 5:  obj[i]= "Junio";
                           break;
                           case 6:  obj[i]= "Julio";
                           break;
                           case 7:  obj[i]= "Agosto";
                           break;
                           case 8:  obj[i]= "Septiembre";
                           break;
                           case 9:  obj[i]= "Octubre";
                           break;
                           case 10:  obj[i]= "Noviembre";
                           break;
                           case 11:  obj[i]= "Diciembre";
                           break;
                       }
                    }
                    else if(i==6){
                        obj[i]=query[c].getYear();
                    }
                    else if(i==4){
                        obj[i]=query[c].getDay();
                    }
                }
                amodel.addRow(obj);
                c++;
            }
        }catch(Exception e){
        }
        table_pago.setDefaultEditor(Object.class, null);
        }
        
    }
    
    public void refreshTable(){
        DefaultTableModel amodel = (DefaultTableModel)table_pago.getModel();
        amodel.setRowCount(0);
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "proyectouser", "proyecto");
            String colhead[]={"ID","Cliente","Empleado","Cantidad","Dia","Mes","Año"};
            amodel.setColumnIdentifiers(colhead);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select ID,ID_A,ID_E,AMOUNT,DAY,MONTH,YEAR FROM PAYMENT ORDER BY ID ASC");
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols=rsmd.getColumnCount();
            while(rs.next()){
                Object[] obj=new Object[cols];
                for(int i=0; i<cols; i++){
                    if(i==1){
                        obj[i] = idToClientName(rs.getInt("ID_A"));
                    }
                    else if(i==2){
                        obj[i] = idToEmployeeName(rs.getInt("ID_E"));
                    }
                    else if(i==5){
                       switch (rs.getInt("MONTH")){
                           case 0:  obj[i]= "Enero";
                           break;
                           case 1:  obj[i]= "Febrero";
                           break;
                           case 2:  obj[i]= "Marzo";
                           break;
                           case 3:  obj[i]= "Abril";
                           break;
                           case 4:  obj[i]= "Mayo";
                           break;
                           case 5:  obj[i]= "Junio";
                           break;
                           case 6:  obj[i]= "Julio";
                           break;
                           case 7:  obj[i]= "Agosto";
                           break;
                           case 8:  obj[i]= "Septiembre";
                           break;
                           case 9:  obj[i]= "Octubre";
                           break;
                           case 10:  obj[i]= "Noviembre";
                           break;
                           case 11:  obj[i]= "Diciembre";
                           break;
                       }
                    }
                    else{
                        obj[i]=rs.getObject(i+1);
                    }                
                }
                amodel.addRow(obj);
            }
            conn.close();
        }catch(Exception e){
        }
        table_pago.setDefaultEditor(Object.class, null);
    }
    
    public String idToEmployeeName(int id){
        String name = null;
        Employee newEmployee = db.getEmployeeById(id);
        if(newEmployee.getId()<=0){
            name = "Inexistente";
        }
        else{
            String fName = newEmployee.getFirstName();
            String lName = newEmployee.getLastName();
            name = fName + " " + lName;
        }
        
        return name;
    }
    
    public String idToClientName(int id){
        String name = null;
        Client newClient = db.getClientebyId(id);
        if(newClient.getId()<=0){
            name = "Inexistente";
        }
        else{
            String fName = newClient.getFirstName();
            String lName = newClient.getLastName();
            name = fName + " " + lName;
        }
        
        return name;
    }
    
    public void display(String message){
        T_message.setText(message);
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
            java.util.logging.Logger.getLogger(NN_pagoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NN_pagoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NN_pagoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NN_pagoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NN_pagoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton B_agregar;
    private javax.swing.JButton B_consulta;
    private javax.swing.JButton B_editar;
    private javax.swing.JButton B_eliminar;
    private javax.swing.JButton B_salir;
    private javax.swing.JComboBox<String> CBO_año;
    private javax.swing.JComboBox<String> CBO_dia;
    private javax.swing.JComboBox<String> CBO_mes;
    private javax.swing.JLabel Line;
    private javax.swing.JScrollPane SP_table;
    private javax.swing.JLabel TAB;
    private javax.swing.JTextField TB_textSelect;
    private javax.swing.JLabel T_message;
    private javax.swing.JLabel Tab_text;
    private javax.swing.JLabel buttonA;
    private javax.swing.JLabel buttonE;
    private javax.swing.JLabel buttonED;
    private javax.swing.JLabel buttonS;
    private javax.swing.JLabel buttonS1;
    private javax.swing.JTable table_pago;
    private javax.swing.JLabel text_Message;
    // End of variables declaration//GEN-END:variables
}
