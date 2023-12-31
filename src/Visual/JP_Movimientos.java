 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Visual;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Config;
import model.Eventos;
import model.Movimientos;
import model.MovimientosDAO;
import model.ProductosDAO;
import model.VentaDAO;


/**
 *
 * @author maico
 */
public class JP_Movimientos extends javax.swing.JPanel {

    VentaDAO vDao = new VentaDAO();
    Eventos event = new Eventos();
    Movimientos m = new Movimientos();
    MovimientosDAO mDao = new MovimientosDAO();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form JP_Productos
     */
    public JP_Movimientos() {
        initComponents();
        Jtf_id.setVisible(false);
    }

    public void obtenerCaja() {
        double caja = vDao.ObtenerCaja();
        Jlb_caja.setText(Double.toString(caja));
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void LimpiarJCB() {
        Jcb_movimiento.removeAllItems();
    }

    public void BuscarMovimientos(String buscar) {
        LimpiarTable();
        List<Movimientos> buscarM = mDao.BuscarMovimiento(buscar);
        modelo = (DefaultTableModel) Jtable_movimientos.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < buscarM.size(); i++) {
            ob[0] = buscarM.get(i).getId_movimiento();
            ob[1] = buscarM.get(i).getTipo_mov();
            ob[2] = buscarM.get(i).getDescripcion();
            ob[3] = buscarM.get(i).getMonto();
            ob[4] = buscarM.get(i).getId_factura();
            ob[5] = buscarM.get(i).getFecha();           

            modelo.addRow(ob);
        }
        Jtable_movimientos.setModel(modelo);
    }

    public void ListarMovimiento() {
        List<Movimientos> listarM = mDao.ListarMovimiento();
        modelo = (DefaultTableModel) Jtable_movimientos.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < listarM.size(); i++) {
            ob[0] = listarM.get(i).getId_movimiento();
            ob[1] = listarM.get(i).getTipo_mov();
            ob[2] = listarM.get(i).getDescripcion();
            ob[3] = listarM.get(i).getMonto();
            ob[4] = listarM.get(i).getId_factura();
            ob[5] = listarM.get(i).getFecha();   
            
            modelo.addRow(ob);
        }
        Jtable_movimientos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_BG = new javax.swing.JPanel();
        Jlb_descripcion = new javax.swing.JLabel();
        Jlb_precio = new javax.swing.JLabel();
        Jlb_Buscar = new javax.swing.JLabel();
        Jlb_movimiento = new javax.swing.JLabel();
        Jtf_descripcion = new javax.swing.JTextField();
        Jtf_monto = new javax.swing.JTextField();
        Jtf_id = new javax.swing.JTextField();
        Jtf_buscador = new javax.swing.JTextField();
        Jcb_movimiento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_movimientos = new javax.swing.JTable();
        Jbn_guardar = new javax.swing.JButton();
        Jbn_actualizar = new javax.swing.JButton();
        Jbn_eliminar = new javax.swing.JButton();
        Jbn_nuevo = new javax.swing.JButton();
        Jbn_generarReporte = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Jlb_caja = new javax.swing.JLabel();
        Jlb_txtCaja = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 660));

        JP_BG.setBackground(new java.awt.Color(255, 255, 255));

        Jlb_descripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_descripcion.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_descripcion.setText("Descripción:");

        Jlb_precio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_precio.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_precio.setText("Monto:");

        Jlb_Buscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_Buscar.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_Buscar.setText("Buscar:");

        Jlb_movimiento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_movimiento.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_movimiento.setText("Movimiento:");

        Jtf_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_descripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_descripcion.setBorder(null);
        Jtf_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_descripcionKeyTyped(evt);
            }
        });

        Jtf_monto.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_monto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_monto.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_monto.setBorder(null);
        Jtf_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_montoKeyTyped(evt);
            }
        });

        Jtf_id.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_id.setBorder(null);

        Jtf_buscador.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_buscador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_buscador.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_buscador.setBorder(null);
        Jtf_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_buscadorActionPerformed(evt);
            }
        });
        Jtf_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Jtf_buscadorKeyReleased(evt);
            }
        });

        Jcb_movimiento.setBackground(new java.awt.Color(255, 255, 255));
        Jcb_movimiento.setEditable(true);
        Jcb_movimiento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Jcb_movimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gastos", "Compra", "Entrada" }));

        Jtable_movimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO", " DESCRIPCIÓN", "MONTO", "ID_VENTA", "FECHA"
            }
        ));
        Jtable_movimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_movimientosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtable_movimientos);
        if (Jtable_movimientos.getColumnModel().getColumnCount() > 0) {
            Jtable_movimientos.getColumnModel().getColumn(0).setPreferredWidth(10);
            Jtable_movimientos.getColumnModel().getColumn(1).setPreferredWidth(20);
            Jtable_movimientos.getColumnModel().getColumn(3).setPreferredWidth(30);
            Jtable_movimientos.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        Jbn_guardar.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_guardar.png"))); // NOI18N
        Jbn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_guardarActionPerformed(evt);
            }
        });

        Jbn_actualizar.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_actualizar.png"))); // NOI18N
        Jbn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_actualizarActionPerformed(evt);
            }
        });

        Jbn_eliminar.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_eliminar.png"))); // NOI18N
        Jbn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_eliminarActionPerformed(evt);
            }
        });

        Jbn_nuevo.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nuevo-producto.png"))); // NOI18N
        Jbn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_nuevoActionPerformed(evt);
            }
        });

        Jbn_generarReporte.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_generarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PDF.png"))); // NOI18N
        Jbn_generarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_generarReporteActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator4.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator5.setForeground(new java.awt.Color(255, 102, 0));

        Jlb_caja.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_caja.setText("0");

        Jlb_txtCaja.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_txtCaja.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_txtCaja.setText("CAJA: $");

        javax.swing.GroupLayout JP_BGLayout = new javax.swing.GroupLayout(JP_BG);
        JP_BG.setLayout(JP_BGLayout);
        JP_BGLayout.setHorizontalGroup(
            JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BGLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP_BGLayout.createSequentialGroup()
                            .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Jlb_descripcion)
                                .addComponent(Jlb_precio))
                            .addGap(29, 29, 29)
                            .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Jtf_descripcion)
                                .addComponent(Jtf_monto)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(Jlb_movimiento)
                        .addGroup(JP_BGLayout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(Jcb_movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JP_BGLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JP_BGLayout.createSequentialGroup()
                                    .addComponent(Jbn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jbn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jbn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jbn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Jbn_generarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addComponent(Jlb_txtCaja)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JP_BGLayout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_BGLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Jlb_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jlb_Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(Jtf_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        JP_BGLayout.setVerticalGroup(
            JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BGLayout.createSequentialGroup()
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(Jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Jlb_movimiento)
                                .addComponent(Jcb_movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_BGLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Jlb_descripcion)
                                    .addComponent(Jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Jlb_precio)
                                    .addComponent(Jtf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jbn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jbn_eliminar)
                                    .addComponent(Jbn_actualizar)
                                    .addComponent(Jbn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Jbn_generarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_BGLayout.createSequentialGroup()
                                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JP_BGLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Jlb_Buscar)
                                            .addComponent(Jtf_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGap(3, 3, 3))
                            .addGroup(JP_BGLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Jlb_txtCaja)
                                    .addComponent(Jlb_caja))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Jbn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_actualizarActionPerformed
        if (!Jtf_id.getText().isEmpty()) {
            if (!Jtf_descripcion.getText().isEmpty() || !Jtf_monto.getText().isEmpty() || !Jcb_movimiento.getSelectedItem().toString().isEmpty()) {
                m.setDescripcion(Jtf_descripcion.getText());
                m.setTipo_mov(Jcb_movimiento.getSelectedItem().toString());
                m.setMonto(Double.parseDouble(Jtf_monto.getText()));
                m.setId_movimiento(Integer.parseInt(Jtf_id.getText()));

                mDao.ModificarMovimeinto(m);

                LimpiarJtf();
                LimpiarTable();
                ListarMovimiento();
            } else {
                JOptionPane.showMessageDialog(null, "No deje campos vacios!", "Message: No data", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el movimiento", "Message: No data", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Jbn_actualizarActionPerformed

    private void Jbn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_guardarActionPerformed
        if (!Jtf_descripcion.getText().isEmpty() || !Jtf_monto.getText().isEmpty() || !Jcb_movimiento.getSelectedItem().toString().isEmpty()) {
            m.setDescripcion(Jtf_descripcion.getText());
            m.setTipo_mov(Jcb_movimiento.getSelectedItem().toString());
            m.setMonto(Double.parseDouble(Jtf_monto.getText()));
            if (Jcb_movimiento.getSelectedItem().toString().equals("Entrada")) {
                double caja = vDao.ObtenerCaja();
                caja += Double.parseDouble(Jtf_monto.getText());
                vDao.ModificarCaja(caja);
            }else if(Jcb_movimiento.getSelectedItem().toString().equals("Gastos") || Jcb_movimiento.getSelectedItem().toString().equals("Compra")){
                double caja = vDao.ObtenerCaja();
                caja -= Double.parseDouble(Jtf_monto.getText());
                vDao.ModificarCaja(caja);
            }else{
                JOptionPane.showMessageDialog(null, "Elija entre las opciones", "Message: movimiento", JOptionPane.INFORMATION_MESSAGE);
            }
            mDao.RegistrarMovimiento(m);
            LimpiarJtf();
            LimpiarTable();
            ListarMovimiento();
            obtenerCaja();
            JOptionPane.showMessageDialog(null, "Movimiento registrado", "Message: Registration", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No deje campos vacios!", "Error: No data", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Jbn_guardarActionPerformed

    private void Jbn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_nuevoActionPerformed
        LimpiarJtf();
    }//GEN-LAST:event_Jbn_nuevoActionPerformed

    private void Jtable_movimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_movimientosMouseClicked
        int fila = Jtable_movimientos.rowAtPoint(evt.getPoint());
        if (Jtable_movimientos.getValueAt(fila, 2) != null) {
            Jtf_id.setText(Jtable_movimientos.getValueAt(fila, 0).toString());
            Jcb_movimiento.setSelectedItem(Jtable_movimientos.getValueAt(fila, 1).toString());
            Jtf_descripcion.setText(Jtable_movimientos.getValueAt(fila, 2).toString());
            Jtf_monto.setText(Jtable_movimientos.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_Jtable_movimientosMouseClicked

    private void Jtf_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_montoKeyTyped
        event.numberDecimalKeyPress(evt, Jtf_monto);
    }//GEN-LAST:event_Jtf_montoKeyTyped

    private void Jbn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_eliminarActionPerformed
        if (!Jtf_id.getText().isEmpty()) {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?");
            if (pregunta == 0) {
                int id = Integer.parseInt(Jtf_id.getText());
                mDao.EliminarMovimiento(id);
                LimpiarJtf();
                LimpiarTable();
                ListarMovimiento();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el movimiento", "Error: Dato vacio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Jbn_eliminarActionPerformed

    private void Jbn_generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_generarReporteActionPerformed
        try {
            pdf();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JP_Movimientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Jbn_generarReporteActionPerformed

    private void Jtf_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_descripcionKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_Jtf_descripcionKeyTyped

    private void Jtf_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_buscadorActionPerformed

    private void Jtf_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_buscadorKeyReleased
        BuscarMovimientos(Jtf_buscador.getText());
    }//GEN-LAST:event_Jtf_buscadorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_BG;
    private javax.swing.JButton Jbn_actualizar;
    private javax.swing.JButton Jbn_eliminar;
    private javax.swing.JButton Jbn_generarReporte;
    private javax.swing.JButton Jbn_guardar;
    private javax.swing.JButton Jbn_nuevo;
    public javax.swing.JComboBox<String> Jcb_movimiento;
    private javax.swing.JLabel Jlb_Buscar;
    private javax.swing.JLabel Jlb_caja;
    private javax.swing.JLabel Jlb_descripcion;
    private javax.swing.JLabel Jlb_movimiento;
    private javax.swing.JLabel Jlb_precio;
    private javax.swing.JLabel Jlb_txtCaja;
    private javax.swing.JTable Jtable_movimientos;
    private javax.swing.JTextField Jtf_buscador;
    private javax.swing.JTextField Jtf_descripcion;
    private javax.swing.JTextField Jtf_id;
    private javax.swing.JTextField Jtf_monto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
    private void LimpiarJtf() {
        Jtf_descripcion.setText("");
        Jtf_monto.setText("");
    }

    private void pdf() throws FileNotFoundException {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");

            File directorio = new File(ruta + "/Documents/facturas");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    JOptionPane.showMessageDialog(null, "Directorio creado en documentos", "Message: DIR", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear el directorio", "ERROR: DIR", JOptionPane.ERROR_MESSAGE);
                }
            }

            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Documents/facturas/Movimientos.pdf"));
            documento.open();

            //Image img = Image.getInstance("scr/Image/Clientes.png");
            Paragraph fech = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fech.add(Chunk.NEWLINE);
            Date date = new Date();
            fech.add("Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(date) + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            //Encabezado.addCell(img);
            Config conf = new Config();
            ProductosDAO proDao = new ProductosDAO();
            conf = proDao.BuscarDatos();

            String ruc = "" + conf.getCc();
            String nom = "" + conf.getNombre();
            String tel = "" + conf.getTelefono();
            String dir = "" + conf.getDireccion();

            PdfPCell cell1 = new PdfPCell(new Phrase(""));
            cell1.setBorder(0);
            Encabezado.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase("Ruc: " + ruc + "\nNombre: " + nom + "\nTelefono: " + tel + "\nDireccion: " + dir));
            cell2.setBorder(0);
            Encabezado.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(fech);
            cell3.setBorder(0);
            Encabezado.addCell(cell3);

            PdfPCell cell4 = new PdfPCell(new Phrase(""));
            cell4.setBorder(0);
            Encabezado.addCell(cell4);

            documento.add(Encabezado);

            Paragraph pro = new Paragraph();
            pro.add(Chunk.NEWLINE);
            pro.add("Productos existentes" + "\n\n");
            pro.setAlignment(Element.ALIGN_CENTER);
            documento.add(pro);

            //productos
            PdfPTable tablaPro = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaPro = new float[]{10f, 50f, 15f, 20f};
            Encabezado.setWidths(ColumnaPro);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell pro1 = new PdfPCell(new Phrase("Movimiento", negrita));
            PdfPCell pro2 = new PdfPCell(new Phrase("Descrip.", negrita));
            PdfPCell pro3 = new PdfPCell(new Phrase("Monto", negrita));
            PdfPCell pro4 = new PdfPCell(new Phrase("Fecha", negrita));
            pro1.setBorder(0);
            pro2.setBorder(0);
            pro4.setBorder(0);
            pro4.setBorder(0);
            pro1.setBackgroundColor(BaseColor.DARK_GRAY);
            pro2.setBackgroundColor(BaseColor.DARK_GRAY);
            pro3.setBackgroundColor(BaseColor.DARK_GRAY);
            pro4.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaPro.addCell(pro1);
            tablaPro.addCell(pro2);
            tablaPro.addCell(pro3);
            tablaPro.addCell(pro4);

            List<Movimientos> listarD = mDao.ListarMovimiento();
            for (int i = 0; i < listarD.size(); i++) {
                String movimiento = listarD.get(i).getTipo_mov();
                String descrip = listarD.get(i).getDescripcion();
                String monto = "" + listarD.get(i).getMonto();
                String fecha = listarD.get(i).getFecha();
                tablaPro.addCell(movimiento);
                tablaPro.addCell(descrip);
                tablaPro.addCell(monto);
                tablaPro.addCell(fecha);
            }

            documento.add(tablaPro);

            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Ferelinares\n\n");
            firma.add("-----------------------------");
            firma.setAlignment(Element.ALIGN_CENTER);
            documento.add(firma);

            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su Compra <3");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            documento.add(mensaje);

            documento.close();
            Desktop.getDesktop().open(new File(ruta + "/Documents/facturas/Movimientos.pdf"));

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: pdf", JOptionPane.ERROR_MESSAGE);
        }
    }
}
