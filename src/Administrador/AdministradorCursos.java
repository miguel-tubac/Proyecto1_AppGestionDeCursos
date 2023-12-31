/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

import Profesores.InicioGeneral;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class AdministradorCursos extends javax.swing.JFrame {

    public static Curso[] cursos = new Curso[100];
    public static int contadorCursos;
    
    // Para actualizar curso
    public static int fila;
    

    public static String codigo;
    public static String nombre;
    public static String creditos;
    public static String alumnos;
    public static String profesor;
    

    /**
     * Creates new form AdministradorCursos
     */
    public AdministradorCursos() {
        initComponents();
        actualizarListadoCursos();
        
    }
          //clase de degradado
  class jPanelGradient extends JPanel{

    jPanelGradient() {
    }
    protected void paintComponent(Graphics g){
      Graphics2D g2d=(Graphics2D) g;
      int width=getWidth();
      int height=getHeight();
      
      Color color1=new Color(33, 47, 61 );
      Color color2=new Color(51, 57, 255);
      GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
      g2d.setPaint(gp);
      g2d.fillRect(0, 0, width, height);
    }
  }
  //clase de degradado

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoCursos = new javax.swing.JTable();
        ExportarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTop3 = new javax.swing.JTable();
        EliminarBtn = new javax.swing.JButton();
        CargaMBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        CrearProfBtn = new javax.swing.JButton();
        Regresar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado Cursos");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Profesores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ListadoCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Creditos", "Alumno", "Profesor"
            }
        ));
        jScrollPane1.setViewportView(ListadoCursos);

        ExportarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ExportarBtn.setText("Exportar Listado HTML");
        ExportarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBtnActionPerformed(evt);
            }
        });

        TablaTop3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Puesto", "Curso", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(TablaTop3);

        EliminarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        CargaMBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn.setText("Carga Masiva");
        CargaMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtnActionPerformed(evt);
            }
        });

        ActualizarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        CrearProfBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CrearProfBtn.setText("Crear Curso");
        CrearProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtnActionPerformed(evt);
            }
        });

        Regresar3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar3.setText("REGRESAR A USUARIOS");
        Regresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExportarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EliminarBtn)
                            .addComponent(CrearProfBtn))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ActualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CargaMBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CrearProfBtn)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CargaMBtn)
                                    .addComponent(EliminarBtn)))
                            .addComponent(ActualizarBtn))
                        .addGap(58, 58, 58)
                        .addComponent(ExportarBtn)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Regresar3)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrearProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtnActionPerformed
        // TODO add your handling code here:
        if(ListadoCursos.getRowCount()==0){
            JOptionPane.showMessageDialog(rootPane,"DEBE DE INGRESAR LA CARGA MASIVA");
        }else{
                        
        CrearCursos objet=new CrearCursos();
        objet.show(true);
        this.show(false);
        }
        
    }//GEN-LAST:event_CrearProfBtnActionPerformed

    public void pasarCursoAlumnos(){
        fila = ListadoCursos.getRowCount();
        
        for(int i=0;i<fila;i++){
            if(ListadoCursos.getModel().getValueAt(i, 0).toString().equals(Profesores.LoginProfesores.codigo)){
                nombre = ListadoCursos.getModel().getValueAt(i, 1).toString();
                alumnos = ListadoCursos.getModel().getValueAt(i, 3).toString();
                
            }
               
        }
    }
    
    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoCursos.getSelectedRow();

        for (int i = fila; i < contadorCursos - 1; i++) {
            cursos[i] = cursos[i + 1];
        }
        // se reduce en 1 la cantidad de cursos
        contadorCursos--;

        /*
        DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
        modeloListado.setRowCount(contadorCursos);
         */
        actualizarListadoCursos();
        
    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        if(ListadoCursos.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(rootPane,"DEBE SELECCIONAR EL CURSO");
        }else{
            fila = ListadoCursos.getSelectedRow();

            codigo = ListadoCursos.getModel().getValueAt(fila, 0).toString();
            nombre = ListadoCursos.getModel().getValueAt(fila, 1).toString();
            creditos = ListadoCursos.getModel().getValueAt(fila, 2).toString();
            alumnos = ListadoCursos.getModel().getValueAt(fila, 3).toString();
            profesor = ListadoCursos.getModel().getValueAt(fila, 4).toString();

            ActualizarCurso objet=new ActualizarCurso();
            objet.show(true);
            this.show(false);
        }
        
        
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    private void CargaMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtnActionPerformed
        // TODO add your handling code here:
        //System.out.println("holaa");

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        String filePath = fc.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);

        BufferedReader reader = null;
        String line = "";

        contadorCursos = 0;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = reader.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    int cantAlumnos = (int) Math.floor(Math.random() * (80 - 0) + 0);
                    Curso curso = new Curso(columnas[0], columnas[1],
                            columnas[2], String.valueOf(cantAlumnos), columnas[3]);

                    cursos[contadorFila - 1] = curso;

                }
                contadorFila++;

            }
            contadorCursos = contadorFila - 1;
            //System.out.println(Arrays.toString(cursos));
            actualizarListadoCursos();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }//GEN-LAST:event_CargaMBtnActionPerformed

    private void ExportarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBtnActionPerformed
        // TODO add your handling code here:
        // codigo nombre creditos alumnos profesor
        String cadenaHTML = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<body>\n"
                + "\n"
                + "<h1>CURSOS</h1>\n"
                + "\n"
                + "<table style=\"margin:auto\">\n"
                + "    <tr>\n"
                + "      <th>codigo</th>\n"
                + "      <th>nombre</th>\n"
                + "      <th>creditos</th>\n"
                + "      <th>alumnos</th>\n"
                + "      <th>profesor</th>\n"
                + "    </tr>";

        
        for (int i = 0; i < contadorCursos; i++) {
            cadenaHTML += "<tr>\n"
                    + "<td>" + cursos[i].codigo + "</td>\n"
                    + "<td>" + cursos[i].nombre + "</td>\n"
                    + "<td>" + cursos[i].creditos + "</td>\n"
                    + "<td>" + cursos[i].alumnos + "</td>\n"
                    + "<td>" + cursos[i].profesor + "</td>\n"
                    + "</tr>";
        }
        
        cadenaHTML += "</table>\n"
                + "</body>\n"
                + "</html>\n";
                
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter("./Reportes/Cursos.html");
            pw = new PrintWriter(fichero);
              
            pw.println(cadenaHTML);
            fichero.close();
            JOptionPane.showMessageDialog(rootPane,"ARCHIVO CREADO");
            
        }catch (Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_ExportarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministradorProfesores objet=new AdministradorProfesores();
        objet.show(true);
        this.show(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Regresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar3ActionPerformed
        // TODO add your handling code here:
        InicioGeneral objet=new InicioGeneral();
        objet.show(true);
        this.show(false);
       
    }//GEN-LAST:event_Regresar3ActionPerformed

    public void actualizarListadoCursos() {

        if (contadorCursos > 0) {

            // actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
            modeloListado.setRowCount(contadorCursos);

            for (int i = 0; i < contadorCursos; i++) {
                modeloListado.setValueAt(cursos[i].codigo, i, 0);
                modeloListado.setValueAt(cursos[i].nombre, i, 1);
                modeloListado.setValueAt(cursos[i].creditos, i, 2);
                modeloListado.setValueAt(cursos[i].alumnos, i, 3);
                modeloListado.setValueAt(cursos[i].profesor, i, 4);
            }

            // hacer top 3
            Curso[] arregloCopia = cursos.clone();

            // burbuja
            for (int comprobacion = 0; comprobacion < contadorCursos; comprobacion++) {
                //System.out.println("Iniciando comprobacion");

                // ciclo para recorrer los elementos del arreglo
                for (int elementoArreglo = 0; elementoArreglo < contadorCursos - 1; elementoArreglo++) {
                    Curso elementoActual = arregloCopia[elementoArreglo];
                    Curso elementoSiguiente = arregloCopia[elementoArreglo + 1];

                    // si el actual es mayor al siguiente
                    if (Integer.valueOf(elementoActual.alumnos)
                            < Integer.valueOf(elementoSiguiente.alumnos)) {
                        // Se hace el intercambio
                        arregloCopia[elementoArreglo] = elementoSiguiente;
                        arregloCopia[elementoArreglo + 1] = elementoActual;

                    }
                }
            }

            //System.out.println("entra aquii");
            // actualizar listado
            DefaultTableModel modeloTop3 = (DefaultTableModel) TablaTop3.getModel();

            modeloTop3.setValueAt("1", 0, 0);
            modeloTop3.setValueAt("2", 1, 0);
            modeloTop3.setValueAt("3", 2, 0);

            for (int i = 0; i < 3; i++) {
                // puesto, nombre, cantidad
                modeloTop3.setValueAt(arregloCopia[i].nombre, i, 1);
                modeloTop3.setValueAt(arregloCopia[i].alumnos, i, 2);
            }

        }
        fila = ListadoCursos.getRowCount();
        
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
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton CargaMBtn;
    private javax.swing.JButton CrearProfBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JButton ExportarBtn;
    private javax.swing.JTable ListadoCursos;
    private javax.swing.JButton Regresar3;
    private javax.swing.JTable TablaTop3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
