// Piña Becerra Victor Osvaldo
package front_end;

import back_end.ListaCircular;
import back_end.Nodo;
import back_end.Proceso;
import javax.swing.JOptionPane;


public class GUIVentanaPrincipal extends javax.swing.JFrame {
    private final ListaCircular lista = new ListaCircular();
    private Nodo nodoNavegacionActual = null;
    
   
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUIVentanaPrincipal.class.getName());

   
    public GUIVentanaPrincipal() {
        initComponents();
     
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrioridad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBusquedaId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnInsertarInicio = new javax.swing.JButton();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarPosicion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnRemoverInicio = new javax.swing.JButton();
        btnRemoverFinal = new javax.swing.JButton();
        btnRemoverPosicion = new javax.swing.JButton();
        btnVaciarLista = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnMostrarInicio = new javax.swing.JButton();
        btnMostrarFinal = new javax.swing.JButton();
        btnMostrarPosicion = new javax.swing.JButton();
        btnBuscarId = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        txtId.addActionListener(this::txtIdActionPerformed);

        jLabel2.setText("Nombre: ");

        txtNombre.addActionListener(this::txtNombreActionPerformed);

        jLabel3.setText("Prioridad (1-10):");

        jLabel4.setText("Posicion / ID Busqueda:");

        jLabel5.setText("ID Buscar: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtBusquedaId, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtBusquedaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        lblEstado.setText("Navegación:   Lista Vacía.");

        txtAreaLog.setEditable(false);
        txtAreaLog.setColumns(20);
        txtAreaLog.setRows(5);
        jScrollPane1.setViewportView(txtAreaLog);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEstado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel7.setText("Insercion.");

        btnInsertarInicio.setText("Insertar Inicio.");
        btnInsertarInicio.addActionListener(this::btnInsertarInicioActionPerformed);

        btnInsertarFinal.setText("Insertar Final.");
        btnInsertarFinal.addActionListener(this::btnInsertarFinalActionPerformed);

        btnInsertarPosicion.setText("Insertar Posicion.");
        btnInsertarPosicion.addActionListener(this::btnInsertarPosicionActionPerformed);

        jLabel8.setText("Remocion.");

        btnRemoverInicio.setText("Remover Inicio.");
        btnRemoverInicio.addActionListener(this::btnRemoverInicioActionPerformed);

        btnRemoverFinal.setText("Remover Final.");
        btnRemoverFinal.addActionListener(this::btnRemoverFinalActionPerformed);

        btnRemoverPosicion.setText("Remover Posicion.");
        btnRemoverPosicion.addActionListener(this::btnRemoverPosicionActionPerformed);

        btnVaciarLista.setText("Vaciar Lista.");
        btnVaciarLista.addActionListener(this::btnVaciarListaActionPerformed);

        jLabel9.setText("Busqueda.");

        btnMostrarInicio.setText("Mostrar Inicio.");
        btnMostrarInicio.addActionListener(this::btnMostrarInicioActionPerformed);

        btnMostrarFinal.setText("Mostrar Final.");
        btnMostrarFinal.addActionListener(this::btnMostrarFinalActionPerformed);

        btnMostrarPosicion.setText("Mostrar Posicion.");
        btnMostrarPosicion.addActionListener(this::btnMostrarPosicionActionPerformed);

        btnBuscarId.setText("Buscar por ID.");
        btnBuscarId.addActionListener(this::btnBuscarIdActionPerformed);

        jLabel10.setText("Transito Circular.");

        btnSiguiente.setText("SIguiente.");
        btnSiguiente.addActionListener(this::btnSiguienteActionPerformed);

        btnAnterior.setText("Anterior.");
        btnAnterior.addActionListener(this::btnAnteriorActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverInicio)
                            .addComponent(btnInsertarInicio)
                            .addComponent(btnMostrarInicio)))
                    .addComponent(jLabel10))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoverFinal)
                    .addComponent(btnInsertarFinal)
                    .addComponent(btnMostrarFinal)
                    .addComponent(btnSiguiente))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior)
                    .addComponent(btnInsertarPosicion)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverPosicion)
                            .addComponent(btnMostrarPosicion))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarId)
                            .addComponent(btnVaciarLista))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnInsertarInicio)
                    .addComponent(btnInsertarFinal)
                    .addComponent(btnInsertarPosicion))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnRemoverInicio)
                    .addComponent(btnRemoverFinal)
                    .addComponent(btnRemoverPosicion)
                    .addComponent(btnVaciarLista))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnMostrarInicio)
                    .addComponent(btnMostrarFinal)
                    .addComponent(btnMostrarPosicion)
                    .addComponent(btnBuscarId))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
    try {
            Proceso p = capturarProceso();
            lista.insertarAlPrincipio(p);
            sincronizarVista(lista.getPrimero());
            log("Insertado al principio: " + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
    try {
            Proceso p = capturarProceso();
            lista.insertarAlFinal(p);
            sincronizarVista(lista.getUltimo());
            log("Insertado al final: " + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPosicionActionPerformed
    try {
            int pos = Integer.parseInt(txtPosicion.getText().trim());
            Proceso p = capturarProceso();
            lista.insertarPorPosicion(p, pos);
            sincronizarVista(lista.obtenerNodoPorPosicion(pos));
            log("Insertado en posición " + pos + ": " + p);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La posición debe ser un número entero válido.", "Atención", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarPosicionActionPerformed

    private void btnRemoverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverInicioActionPerformed
     try {
            Proceso rem = lista.removerAlPrincipio();
            sincronizarVista(lista.getPrimero());
            log("Removido del principio: " + rem);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverInicioActionPerformed

    private void btnRemoverFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFinalActionPerformed
    try {
            Proceso rem = lista.removerAlFinal();
            sincronizarVista(lista.getUltimo());
            log("Removido del final: " + rem);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverFinalActionPerformed

    private void btnRemoverPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPosicionActionPerformed
    try {
            int pos = Integer.parseInt(txtPosicion.getText().trim());
            Proceso rem = lista.removerPorPosicion(pos);
            sincronizarVista(lista.getPrimero());
            log("Removido de posición " + pos + ": " + rem);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La posición debe ser un número entero válido.", "Atención", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverPosicionActionPerformed

    private void btnVaciarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarListaActionPerformed
     try {
            lista.vaciar();
            sincronizarVista(null);
            log("La lista se ha vaciado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVaciarListaActionPerformed

    private void btnMostrarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInicioActionPerformed
     try {
            Proceso p = lista.mostrarAlPrincipio();
            nodoNavegacionActual = lista.getPrimero();
            actualizarEstadoUI();
            log("Consulta (Inicio): " + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarInicioActionPerformed

    private void btnMostrarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFinalActionPerformed
    try {
            Proceso p = lista.mostrarAlFinal();
            nodoNavegacionActual = lista.getUltimo();
            actualizarEstadoUI();
            log("Consulta (Final): " + p);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarFinalActionPerformed

    private void btnMostrarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPosicionActionPerformed
    try {
            int pos = Integer.parseInt(txtPosicion.getText().trim());
            Proceso p = lista.mostrarPorPosicion(pos);
            nodoNavegacionActual = lista.obtenerNodoPorPosicion(pos);
            actualizarEstadoUI();
            log("Consulta (Posición " + pos + "): " + p);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La posición debe ser un número entero válido.", "Atención", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarPosicionActionPerformed

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
     try {
            int id = Integer.parseInt(txtBusquedaId.getText().trim());
            ListaCircular.ResultadoBusqueda res = lista.buscarPorId(id);
            if (res != null) {
                nodoNavegacionActual = lista.obtenerNodoPorPosicion(res.posicion());
                actualizarEstadoUI();
                log("¡Encontrado! En posición " + res.posicion() + ": " + res.proceso());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con el ID " + id, "Sin Coincidencias", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de búsqueda debe ser un número entero.", "Atención", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
    try {
            if (lista.estaVacia()) throw new IllegalStateException("La lista está vacía.");
            nodoNavegacionActual = (nodoNavegacionActual == null) ? lista.getPrimero() : nodoNavegacionActual.getSiguiente();
            actualizarEstadoUI();
            log("Avanzó (Siguiente ->) : " + nodoNavegacionActual.getDato());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
    try {
            if (lista.estaVacia()) throw new IllegalStateException("La lista está vacía.");
            nodoNavegacionActual = (nodoNavegacionActual == null) ? lista.getUltimo() : nodoNavegacionActual.getAnterior();
            actualizarEstadoUI();
            log("Retrocedió (<- Anterior) : " + nodoNavegacionActual.getDato());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    
    public static void main(String args[]) {
        
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> new GUIVentanaPrincipal().setVisible(true));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JButton btnInsertarPosicion;
    private javax.swing.JButton btnMostrarFinal;
    private javax.swing.JButton btnMostrarInicio;
    private javax.swing.JButton btnMostrarPosicion;
    private javax.swing.JButton btnRemoverFinal;
    private javax.swing.JButton btnRemoverInicio;
    private javax.swing.JButton btnRemoverPosicion;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVaciarLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextArea txtAreaLog;
    private javax.swing.JTextField txtBusquedaId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPosicion;
    private javax.swing.JTextField txtPrioridad;
    // End of variables declaration//GEN-END:variables

    
    private Proceso capturarProceso() {
        int id = Integer.parseInt(txtId.getText().trim());
        String nombre = txtNombre.getText().trim();
        int prioridad = Integer.parseInt(txtPrioridad.getText().trim());
        return new Proceso(id, nombre, prioridad);
    }

    private void sincronizarVista(Nodo nuevoActual) {
        if (lista.estaVacia()) {
            nodoNavegacionActual = null;
        } else if (nuevoActual != null) {
            nodoNavegacionActual = nuevoActual;
        } else {
            nodoNavegacionActual = lista.getPrimero();
        }
        actualizarEstadoUI();
    }

    private void actualizarEstadoUI() {
        if (lblEstado == null) return;
        
        if (lista.estaVacia() || nodoNavegacionActual == null) {
            lblEstado.setText("Navegación: Lista Vacía [0 Elementos]");
        } else {
            String tag = "";
            if (nodoNavegacionActual == lista.getPrimero() && nodoNavegacionActual == lista.getUltimo()) {
                tag = " [PRIMERO y ÚLTIMO]";
            } else if (nodoNavegacionActual == lista.getPrimero()) {
                tag = " [PRIMERO]";
            } else if (nodoNavegacionActual == lista.getUltimo()) {
                tag = " [ÚLTIMO]";
            }
            lblEstado.setText("Nodo Apuntado: (" + nodoNavegacionActual.getDato().toString() + ")" + tag + " | Total: " + lista.getTamanio());
        }
    }

    private void log(String mensaje) {
        if (txtAreaLog != null) {
            txtAreaLog.append("> " + mensaje + "\n");
            txtAreaLog.setCaretPosition(txtAreaLog.getDocument().getLength());
        }
    }



}
