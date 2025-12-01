/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package Interfaz_Admin;

import Gestion.GestionReportes1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vehiculos.Vehiculo;
import Vehiculos.EstadoVehiculo;
import Vehiculos.GestionVehiculo;  // <-- esta es la clase lógica, la creamos ahorita


/**
 *
 * @author Leonardo
 */
public class gestionVehiculo extends javax.swing.JFrame {

    //private GestionVehiculo gestionVehiculo = GestionReportes1.agregarVehiculos(Vehiculo);
    //private GestionVehiculo gestionVehiculo = new GestionVehiculo();


    /**
     * Creates new form gestionVehiculo
     */
    public gestionVehiculo() {
        initComponents();
        setLocationRelativeTo(null);
        configurarTabla();
        listarVehiculos();
    }
    
    private void configurarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbLibro.getModel();
        modelo.setColumnIdentifiers(new String[]{
            "Código", "Marca", "Modelo", "Año", "Tipo", "Color", "Precio Base", "Estado"
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        lblPrecio1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblPrecio2 = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCodigo1 = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtCodigo2 = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtCodigo3 = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLibro = new javax.swing.JTable();
        btnBoleta = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblPrecio1.setText("Tipo");

        lblTitulo.setText("Marca");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblPrecio2.setText("Color");

        lblAutor.setText("Modelo");

        lblPrecio3.setText("Precio Base:");

        lblPrecio.setText("Año");

        lblPrecio4.setText("Estado:");

        txtCodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo3ActionPerformed(evt);
            }
        });

        tbLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbLibro);

        btnBoleta.setText("Boleta");
        btnBoleta.setToolTipText("");
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código Vehiculo");

        btnRegistrar1.setText("Registrar");
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblTitulo)
                            .addComponent(lblAutor)
                            .addComponent(lblPrecio)
                            .addComponent(lblPrecio1)
                            .addComponent(lblPrecio2)
                            .addComponent(lblPrecio4)
                            .addComponent(lblPrecio3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCodigo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(txtCodigo2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBoleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrar1)
                        .addGap(11, 11, 11)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrecio2)
                        .addGap(63, 63, 63)
                        .addComponent(lblPrecio4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio3))
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBoleta)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addComponent(btnRegistrar1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void listarVehiculos() {
    DefaultTableModel modelo = (DefaultTableModel) tbLibro.getModel();
    modelo.setRowCount(0); // limpiar tabla

    for (int i = 0; i < GestionReportes1.getContVehiculos(); i++) {
        Vehiculo v = GestionReportes1.getListaVehiculos()[i];
        
        Object[] fila = {
            v.getCodigo(),
            v.getMarca(),
            v.getModelo(),
            v.getAnioFabricacion(),
            v.getTipo(),
            v.getColor(),
            v.getPrecioBase(),
            v.getEstado()
        };
        modelo.addRow(fila);
    }
}   
    

private void limpiar() {
    txtCodigo.setText("");
    txtTitulo.setText("");
    txtAutor.setText("");
    txtPrecio.setText("");
    txtCodigo1.setText("");
    txtCodigo2.setText("");
    txtCodigo3.setText("");
    txtCodigo4.setText("");
    txtCodigo.requestFocus();
}

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    try {
            String codigo = txtCodigo.getText().trim();
            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el código del vehículo a actualizar");
                return;
            }

            // Buscamos el vehículo en la lista global para modificarlo
            boolean encontrado = false;
            for (int i = 0; i < GestionReportes1.getContVehiculos(); i++) {
                Vehiculo v = GestionReportes1.getListaVehiculos()[i];
                
                if (v.getCodigo().equalsIgnoreCase(codigo)) {
                    // Actualizamos sus datos con lo que hay en las cajas de texto
                    v.setMarca(txtTitulo.getText().trim());
                    v.setModelo(txtAutor.getText().trim());
                    v.setAnioFabricacion(Integer.parseInt(txtPrecio.getText().trim()));
                    v.setTipo(txtCodigo1.getText().trim());
                    v.setColor(txtCodigo4.getText().trim());
                    v.setPrecioBase(Double.parseDouble(txtCodigo2.getText().trim()));
                    v.setEstado(EstadoVehiculo.valueOf(txtCodigo3.getText().trim().toUpperCase()));
                    
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                listarVehiculos();
                limpiar();
                JOptionPane.showMessageDialog(this, "Vehículo actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el vehículo con código: " + codigo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText().trim();
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código para eliminar");
            return;
        }

        // Llamamos al método nuevo que creaste en el paso 1
        if (GestionReportes1.eliminarVehiculo(codigo)) {
            listarVehiculos();
            limpiar();
            JOptionPane.showMessageDialog(this, "Vehículo eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el vehículo a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
   
         String codigo        = txtCodigo.getText().trim();
    String marca         = txtTitulo.getText().trim();
    String modelo        = txtAutor.getText().trim();
    String anio          = txtPrecio.getText().trim();
    String tipo          = txtCodigo1.getText().trim();
    String color         = txtCodigo4.getText().trim();
    String precioTexto   = txtCodigo2.getText().trim();
    String textoEstado   = txtCodigo3.getText().trim();

    if (codigo.isEmpty() || marca.isEmpty() || modelo.isEmpty()
            || anio.isEmpty() || tipo.isEmpty() || color.isEmpty()
            || precioTexto.isEmpty() || textoEstado.isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Complete todos los datos del vehículo antes de generar la boleta.");
        return;
    }

    double precioBase;
    try {
        precioBase = Double.parseDouble(precioTexto);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Precio base inválido.");
        return;
    }

    String boleta = ""
        + "----------- BOLETA DE VEHÍCULO -----------\n"
        + "Código     : " + codigo      + "\n"
        + "Marca      : " + marca       + "\n"
        + "Modelo     : " + modelo      + "\n"
        + "Año        : " + anio        + "\n"
        + "Tipo       : " + tipo        + "\n"
        + "Color      : " + color       + "\n"
        + "Estado     : " + textoEstado + "\n"
        + "Precio Base: S/ " + precioBase + "\n"
        + "------------------------------------------";

    JOptionPane.showMessageDialog(
            this,
            boleta,
            "Boleta de vehículo",
            JOptionPane.INFORMATION_MESSAGE
    );
    }//GEN-LAST:event_btnBoletaActionPerformed
    


    private void txtCodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3ActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
        try {
            // 1. Recoger datos
            String codigo = txtCodigo.getText().trim();
            String marca = txtTitulo.getText().trim();
            String modelo = txtAutor.getText().trim();
            
            // Validaciones básicas para evitar errores de conversión
            if(codigo.isEmpty() || marca.isEmpty() || modelo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }
            
            int anioFabricacion = Integer.parseInt(txtPrecio.getText().trim());
            String tipo = txtCodigo1.getText().trim();
            String color = txtCodigo4.getText().trim();
            double precioBase = Double.parseDouble(txtCodigo2.getText().trim());
            
            // Convertir texto a ENUM (Debe ser "DISPONIBLE", "VENDIDO", etc.)
            EstadoVehiculo estado = EstadoVehiculo.valueOf(txtCodigo3.getText().trim().toUpperCase());

            // 2. Crear objeto (Clase anónima porque Vehiculo es abstracto)
            Vehiculo vehiculo = new Vehiculo(
                    codigo, marca, modelo, color,
                    anioFabricacion, tipo, precioBase, estado
            ) { };

            // 3. GUARDAR EN GESTIONREPORTES1 (SOLUCIÓN DEL ERROR)
            GestionReportes1.agregarVehiculos(vehiculo);

            // 4. Actualizar interfaz
            listarVehiculos();
            limpiar();
            JOptionPane.showMessageDialog(this, "Vehículo registrado correctamente");

            // 5. Abrir ventana de promoción automáticamente
            admin_Promo promo = new admin_Promo(marca, precioBase);
            promo.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en los datos: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(gestionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new gestionVehiculo().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
