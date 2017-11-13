/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon_premiun;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;

/**
 *
 * @author Carlos
 */
public class salon_premiun_nuevoEvento extends javax.swing.JDialog {

    /**
     * Creates new form salon_premiun_form
     */
    public salon_premiun_nuevoEvento() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(salon_premiun_nuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salon_premiun_nuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salon_premiun_nuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salon_premiun_nuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        initComponents();

        //centramos el formulario para que aparezca en el centro
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipo = new javax.swing.ButtonGroup();
        btGuardar = new javax.swing.JButton();
        jpDatospersonales = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtTelf = new javax.swing.JTextField();
        lblTelf = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jpDatos = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNumpersonas = new javax.swing.JLabel();
        txtNumpersonas = new javax.swing.JTextField();
        lblTipococina = new javax.swing.JLabel();
        cbTipococina = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        Date fecha = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(fecha, null ,null, Calendar.DAY_OF_YEAR);
        spnFecha = new javax.swing.JSpinner(sm);
        jpOpciones = new javax.swing.JPanel();
        lblJornadas = new javax.swing.JLabel();
        txtNumjornadas = new javax.swing.JTextField();
        chkHabitacionesasistentes = new javax.swing.JCheckBox();
        chkCapilla = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Evento");
        setResizable(false);

        btGuardar.setBackground(Color.BLUE);
        btGuardar.setText("Guardar");
        btGuardar.setToolTipText("Pulda para guaradar el evento");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jpDatospersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Swis721 BlkCn BT", 0, 12))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellidos.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblApellidos.setText("Apellidos");

        txtNombre.setToolTipText("Introduce tu nombre");

        lblDNI.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblDNI.setText("DNI");

        txtDNI.setToolTipText("Introduce tu número de DNI");

        txtTelf.setToolTipText("Introduce tu número de teléfono");

        lblTelf.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblTelf.setText("Teléfono");

        txtApellidos.setToolTipText("Introduce tus apellidos");

        javax.swing.GroupLayout jpDatospersonalesLayout = new javax.swing.GroupLayout(jpDatospersonales);
        jpDatospersonales.setLayout(jpDatospersonalesLayout);
        jpDatospersonalesLayout.setHorizontalGroup(
            jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatospersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatospersonalesLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(112, 112, 112)
                        .addComponent(lblApellidos))
                    .addGroup(jpDatospersonalesLayout.createSequentialGroup()
                        .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDNI)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelf)
                            .addComponent(txtTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatospersonalesLayout.setVerticalGroup(
            jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatospersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(lblTelf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatospersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jpDatos.setMaximumSize(new java.awt.Dimension(50, 50));
        jpDatos.setMinimumSize(new java.awt.Dimension(500, 500));
        jpDatos.setPreferredSize(new java.awt.Dimension(100, 230));

        lblFecha.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblFecha.setText("Fecha del evento:");

        lblTipo.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        lblNumpersonas.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblNumpersonas.setText("Nº de personas:");

        txtNumpersonas.setToolTipText("Selecciona el número de personas");

        lblTipococina.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblTipococina.setText("Tipo de cocina:");

        cbTipococina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bufé", "Wok", "Carta", "Cita Chef", "No precisa" }));
        cbTipococina.setToolTipText("Selecciona el tipo de cocina");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso", "Boda" }));
        cbTipo.setToolTipText("Selecciona el tipo de evento");
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });

        JSpinner.DateEditor de = new JSpinner.DateEditor(spnFecha,"dd/MM/yyyy");
        spnFecha.setEditor(de);
        spnFecha.setToolTipText("Selecciona la fecha del evento.");

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumpersonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTipococina, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)
                    .addComponent(lblTipococina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnFecha)
                    .addComponent(txtNumpersonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblNumpersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipococina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipococina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Swis721 BlkCn BT", 0, 12))); // NOI18N

        lblJornadas.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        lblJornadas.setText("Nº de jornadas");
        lblJornadas.setEnabled(false);

        txtNumjornadas.setToolTipText("Número de jornadas del evento");
        txtNumjornadas.setEnabled(false);

        chkHabitacionesasistentes.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        chkHabitacionesasistentes.setText("¿Habitaciones para asistentes?");
        chkHabitacionesasistentes.setToolTipText("Marcar si los asistentes necesitan habitaciones");
        chkHabitacionesasistentes.setEnabled(false);

        chkCapilla.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        chkCapilla.setText("¿Capilla para la boda?");
        chkCapilla.setToolTipText("Marcar si los asistentes necesitan habitaciones");
        chkCapilla.setEnabled(false);

        javax.swing.GroupLayout jpOpcionesLayout = new javax.swing.GroupLayout(jpOpciones);
        jpOpciones.setLayout(jpOpcionesLayout);
        jpOpcionesLayout.setHorizontalGroup(
            jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOpcionesLayout.createSequentialGroup()
                        .addComponent(chkCapilla)
                        .addGap(147, 147, 147))
                    .addGroup(jpOpcionesLayout.createSequentialGroup()
                        .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNumjornadas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJornadas, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addComponent(chkHabitacionesasistentes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOpcionesLayout.setVerticalGroup(
            jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJornadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumjornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHabitacionesasistentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkCapilla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpDatospersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jpDatospersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btGuardar)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged

        if (cbTipo.getSelectedItem().toString().equals("Congreso")) {

            this.lblJornadas.setEnabled(true);
            this.txtNumjornadas.setEnabled(true);
            this.chkHabitacionesasistentes.setEnabled(true);
            this.chkCapilla.setEnabled(false);

        } else if (cbTipo.getSelectedItem().toString().equals("Boda")) {

            this.lblJornadas.setEnabled(false);
            this.txtNumjornadas.setEnabled(false);
            this.chkHabitacionesasistentes.setEnabled(false);
            this.chkCapilla.setEnabled(true);

        } else {

            this.lblJornadas.setEnabled(false);
            this.txtNumjornadas.setEnabled(false);
            this.chkHabitacionesasistentes.setEnabled(false);
            this.chkCapilla.setEnabled(false);
        }


    }//GEN-LAST:event_cbTipoItemStateChanged

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        
        JOptionPane.showMessageDialog(rootPane, "Has registrado un nuevo evento de tipo \"" + this.cbTipo.getSelectedItem().toString() + "\", gracias."); 
    }//GEN-LAST:event_btGuardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbTipococina;
    private javax.swing.JCheckBox chkCapilla;
    private javax.swing.JCheckBox chkHabitacionesasistentes;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDatospersonales;
    private javax.swing.JPanel jpOpciones;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblJornadas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumpersonas;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipococina;
    private javax.swing.JSpinner spnFecha;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumjornadas;
    private javax.swing.JTextField txtNumpersonas;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
