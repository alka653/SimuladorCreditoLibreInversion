package libreinversionvariable;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.NumberFormat;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Adriann Sanchez
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cantidadMeses = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        valorPrestamo = new javax.swing.JTextField();
        simularBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalIntereses = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalCancelado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        variable = new javax.swing.JRadioButton();
        fijo = new javax.swing.JRadioButton();
        promedioIntereses = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalSeguro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        totalCanceladoConSeguro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Users\\Adriann Sanchez\\Descargas\\vector_w_i_ribbon_alphabet_logo.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Bank");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("New");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel1.setText("Cantidad de meses(*)");

        cantidadMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadMesesActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor del préstamo  (*)");

        valorPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPrestamoActionPerformed(evt);
            }
        });

        simularBtn.setText("Simular cuotas");
        simularBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBtnMouseClicked(evt);
            }
        });
        simularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnPrincipal(evt);
            }
        });

        jLabel7.setText("Total intereses cancelado");

        totalIntereses.setEditable(false);
        totalIntereses.setBackground(new java.awt.Color(204, 204, 204));
        totalIntereses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalInteresesActionPerformed(evt);
            }
        });

        jLabel8.setText("Total cancelado");

        totalCancelado.setEditable(false);
        totalCancelado.setBackground(new java.awt.Color(204, 204, 204));
        totalCancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCanceladoActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de crédito (*)");

        buttonGroup1.add(variable);
        variable.setSelected(true);
        variable.setText("Variable");
        variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableActionPerformed(evt);
            }
        });

        buttonGroup1.add(fijo);
        fijo.setText("Fijo");

        promedioIntereses.setEditable(false);
        promedioIntereses.setBackground(new java.awt.Color(204, 204, 204));
        promedioIntereses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioInteresesActionPerformed(evt);
            }
        });

        jLabel10.setText("Promedio intereses");

        totalSeguro.setEditable(false);
        totalSeguro.setBackground(new java.awt.Color(204, 204, 204));
        totalSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSeguroActionPerformed(evt);
            }
        });

        jLabel11.setText("Total seguro");

        totalCanceladoConSeguro.setEditable(false);
        totalCanceladoConSeguro.setBackground(new java.awt.Color(204, 204, 204));
        totalCanceladoConSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCanceladoConSeguroActionPerformed(evt);
            }
        });

        jLabel12.setText("Total cancelado con seguro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(variable)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fijo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(valorPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalIntereses, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(promedioIntereses, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalCanceladoConSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(simularBtn)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cantidadMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(valorPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(variable)
                            .addComponent(fijo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(totalIntereses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(totalCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(totalCanceladoConSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(promedioIntereses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(totalSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(simularBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Desarrollado por Adriann Felipe Sanchez Sierra");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuota #", "Interés", "Valor Interés", "Abono a capital", "Cuota con interés", "Valor seguro de vida", "Cuota con seguro", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadMesesActionPerformed

    private void valorPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPrestamoActionPerformed
  
    private void calcBtnPrincipal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnPrincipal
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        DefaultCategoryDataset graph = new DefaultCategoryDataset();
        Logic logic = new Logic();
        float tasa_interes = (float) 5;
        float porcentaje_seguro = (float) 0.0012;
        DefaultTableModel jtable = (DefaultTableModel) jTable.getModel();
        String cantidad_cuotas = cantidadMeses.getText();
        String valor_prestamo = valorPrestamo.getText();
        variable.setActionCommand("variable");
        fijo.setActionCommand("fijo");
        ButtonModel btn_group_option = buttonGroup1.getSelection();
        String option = (String) btn_group_option.getActionCommand();
        jtable.setRowCount(0);
        if(logic.validate_int(cantidad_cuotas) && logic.validate_int(valor_prestamo)){
            double valor = Integer.parseInt(valor_prestamo);
            double total_intereses_cancelado = 0;
            double total_cancelado = 0;
            float suma_interes = 0;
            double total_seguro = 0;
            double valor_seguro = valor * porcentaje_seguro;
            int numero_cuota = Integer.parseInt(cantidad_cuotas);
            double array_data_cuota[] = new double[numero_cuota];
            double array_data_interes[] = new double[numero_cuota];
            double valor_base = 0;
            if(numero_cuota >= 12 && (valor >= 20000000 && valor <= 50000000)){
                for(int i = numero_cuota; i > 0; i--){
                    String response[] = logic.calc_cuota(valor, i, tasa_interes, option, (numero_cuota - i));
                    tasa_interes = Float.parseFloat(response[5]);
                    valor = Double.parseDouble(response[6]);
                    total_intereses_cancelado += Double.parseDouble(response[7]);
                    total_cancelado += Double.parseDouble(response[8]);
                    array_data_cuota[(numero_cuota - i)] = Double.parseDouble(response[10]);
                    array_data_interes[(numero_cuota - i)] = Double.parseDouble(response[7]);
                    suma_interes += Float.parseFloat(response[9]);
                    if(i == 1){
                        valor_seguro = 0;
                    }
                    valor_base += Double.parseDouble(response[10]);
                    total_seguro += valor_seguro;
                    jtable.addRow(new Object[]{(numero_cuota - i) + 1, response[0], response[1], response[2], response[3], formatter.format(valor_seguro), formatter.format(Double.parseDouble(response[8]) + valor_seguro), response[4]});
                }
                double interesPromedio = suma_interes / numero_cuota;
                totalIntereses.setText(formatter.format(total_intereses_cancelado));
                totalCancelado.setText(formatter.format(total_cancelado));
                promedioIntereses.setText(Double.toString(logic.redondearDecimales(interesPromedio, 2))+" %");
                totalSeguro.setText(formatter.format(total_seguro));
                totalCanceladoConSeguro.setText(formatter.format(total_seguro + total_cancelado));
                for(int i = 0; i < array_data_cuota.length; i++){
                    graph.addValue(array_data_cuota[i], "Abono a capital", Integer.toString(i + 1));
                    graph.addValue(array_data_interes[i], "Interés", Integer.toString(i + 1));
                }
                JFreeChart chart = ChartFactory.createLineChart("Gráfica de crédito "+option+" a "+cantidad_cuotas+" meses", "No. Cuotas", "Valor cuotas", graph, PlotOrientation.VERTICAL, true, true, false);
                JFrame frame = new JFrame("Gráfica");
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ChartPanel chart_panel = new ChartPanel(chart);
                JPanel panel = new JPanel();
                panel.setPreferredSize(new Dimension(600, 300));
                chart_panel.setPreferredSize(new Dimension(600, 300));
                frame.getContentPane().add(chart_panel);
                frame.pack();
                frame.setVisible(true);
            }else{
                showMessage("Los montos son erróneos", "ERROR");
            }
        }else{
            showMessage("Hay campos vacíos o erróneos", "ERROR");
        }
    }//GEN-LAST:event_calcBtnPrincipal

    private void totalInteresesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalInteresesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalInteresesActionPerformed
    
    private void calcBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBtnMouseClicked
        
    }//GEN-LAST:event_calcBtnMouseClicked

    private void totalCanceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCanceladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCanceladoActionPerformed

    private void variableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_variableActionPerformed

    private void promedioInteresesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioInteresesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioInteresesActionPerformed

    private void totalSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSeguroActionPerformed

    private void totalCanceladoConSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCanceladoConSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCanceladoConSeguroActionPerformed
    public void showMessage(String message, String type){
        JOptionPane.showMessageDialog(null, message, type, JOptionPane.ERROR_MESSAGE);
    }
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cantidadMeses;
    private javax.swing.JRadioButton fijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField promedioIntereses;
    private javax.swing.JButton simularBtn;
    private javax.swing.JTextField totalCancelado;
    private javax.swing.JTextField totalCanceladoConSeguro;
    private javax.swing.JTextField totalIntereses;
    private javax.swing.JTextField totalSeguro;
    private javax.swing.JTextField valorPrestamo;
    private javax.swing.JRadioButton variable;
    // End of variables declaration//GEN-END:variables
}
