/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import codes.FormaPagamento;
import codes.Gasto;
import codes.TipoGasto;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class ScreenGasto extends javax.swing.JFrame {

    private Gasto gasto;
    ArrayList<Gasto> gastos = new ArrayList();
    
    /**
     * Creates new form ScreenGasto
     */
    
    public ScreenGasto() {
        initComponents();
    }//construtor
    
    
    public TipoGasto identificarTipoGasto () {
           if (JBLREMEDIO.isSelected()) {
                return TipoGasto.REMEDIO;
                
            } else if (JBLROUPA.isSelected()) {
                return TipoGasto.ROUPA;
                
            } else if (JBLREFEICAO.isSelected()) {
                return TipoGasto.REFEICAO;
                
            }
            return null;
    }
    
    
    public FormaPagamento identificarFormaPagamento () {
           if (JBLDINHEIRO.isSelected()) {
                return FormaPagamento.DINHEIRO;
                
            } else if (JBLCHEQUE.isSelected()) {
                return FormaPagamento.CHEQUE;
                
            } else if (JBLCARTAO.isSelected()) {
                return FormaPagamento.CARTAO;
                
            } else if (JBLCHEQUEPRE.isSelected()) {
                return FormaPagamento.CHEQUEPRE;
                
            }          
            return null;
    }
    
    
    public String calcularTotalGastos (ArrayList<Gasto> gastos) {
        StringBuilder dados = new StringBuilder();
        
        double totalRemedio = 0;        
        double totalRoupa = 0;
        double totalRefeicao = 0;
        
        double totalDinheiro = 0;
        double totalCheque = 0;
        double totalCartao = 0;
        double totalChequePre = 0;

        for (Gasto a : gastos) {
            if (a.getTipoGasto() == TipoGasto.REMEDIO) {
                totalRemedio += a.getValor();
                
            } else if (a.getTipoGasto() == TipoGasto.ROUPA) {
                totalRoupa += a.getValor();
                
            } else if (a.getTipoGasto() == TipoGasto.REFEICAO) {
                totalRefeicao += a.getValor();
            }
            
        }
        
        for (Gasto a : gastos) {
            if (a.getFormaPagamento() == FormaPagamento.DINHEIRO) {
                totalDinheiro += a.getValor();
               
            } else if (a.getFormaPagamento() == FormaPagamento.CHEQUE) {
                totalCheque += a.getValor();
               
            } else if (a.getFormaPagamento() == FormaPagamento.CARTAO) {
                totalCartao += a.getValor();
               
            } else if (a.getFormaPagamento() == FormaPagamento.CHEQUEPRE) {
                totalChequePre += a.getValor();              
            }
            
        }
        
        dados.append("Total gastos remédio: R$").append(totalRemedio).append("\n")
        .append("Total gastos roupa: R$").append(totalRoupa).append("\n")
        .append("Total gastos refeição: R$").append(totalRefeicao).append("\n")
        .append("\n")
        .append("Total gastos no dinheiro: R$").append(totalDinheiro).append("\n")
        .append("Total gastos no cheque: R$").append(totalCheque).append("\n")
        .append("Total gastos no cartão: R$").append(totalCartao).append("\n")
        .append("Total gastos no cheque pré: R$").append(totalChequePre).append("\n");
       
        return dados.toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBLDINHEIRO = new javax.swing.JRadioButton();
        JBLCHEQUE = new javax.swing.JRadioButton();
        JBLCARTAO = new javax.swing.JRadioButton();
        JBLCHEQUEPRE = new javax.swing.JRadioButton();
        JBLREFEICAO = new javax.swing.JRadioButton();
        JBLREMEDIO = new javax.swing.JRadioButton();
        JBLROUPA = new javax.swing.JRadioButton();
        JBLVALOR = new javax.swing.JTextField();
        JBLREGISTRARGASTO = new javax.swing.JButton();
        JBLCALCULARTOTAL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JBLPAINEL = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(633, 520));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel1.setText("Tipo do gasto");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel3.setText("Valor");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel4.setText("Forma de pagamento");

        buttonGroup2.add(JBLDINHEIRO);
        JBLDINHEIRO.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLDINHEIRO.setText("Dinheiro");

        buttonGroup2.add(JBLCHEQUE);
        JBLCHEQUE.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLCHEQUE.setText("Cheque");

        buttonGroup2.add(JBLCARTAO);
        JBLCARTAO.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLCARTAO.setText("Cartão");

        buttonGroup2.add(JBLCHEQUEPRE);
        JBLCHEQUEPRE.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLCHEQUEPRE.setText("Cheque pré");

        buttonGroup1.add(JBLREFEICAO);
        JBLREFEICAO.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLREFEICAO.setText("Refeição");

        buttonGroup1.add(JBLREMEDIO);
        JBLREMEDIO.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLREMEDIO.setText("Remédio");
        JBLREMEDIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLREMEDIOActionPerformed(evt);
            }
        });

        buttonGroup1.add(JBLROUPA);
        JBLROUPA.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLROUPA.setText("Roupa");

        JBLREGISTRARGASTO.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLREGISTRARGASTO.setText("Registrar gasto");
        JBLREGISTRARGASTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLREGISTRARGASTOActionPerformed(evt);
            }
        });

        JBLCALCULARTOTAL.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        JBLCALCULARTOTAL.setText("Calcular Total");
        JBLCALCULARTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLCALCULARTOTALActionPerformed(evt);
            }
        });

        JBLPAINEL.setColumns(20);
        JBLPAINEL.setRows(5);
        jScrollPane1.setViewportView(JBLPAINEL);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel2.setText("Controle de Gastos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JBLVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(JBLREMEDIO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBLROUPA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBLREFEICAO))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(JBLDINHEIRO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBLCHEQUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBLCARTAO)
                                .addGap(18, 18, 18)
                                .addComponent(JBLCHEQUEPRE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBLREGISTRARGASTO)
                        .addGap(18, 18, 18)
                        .addComponent(JBLCALCULARTOTAL)
                        .addGap(23, 23, 23))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JBLDINHEIRO)
                    .addComponent(JBLCHEQUE)
                    .addComponent(JBLCARTAO)
                    .addComponent(JBLCHEQUEPRE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JBLREMEDIO)
                    .addComponent(JBLROUPA)
                    .addComponent(JBLREFEICAO))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JBLVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBLCALCULARTOTAL)
                    .addComponent(JBLREGISTRARGASTO))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBLREMEDIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLREMEDIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBLREMEDIOActionPerformed

    private void JBLREGISTRARGASTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLREGISTRARGASTOActionPerformed
                    TipoGasto tipoGasto = identificarTipoGasto();
                    LocalDate data = LocalDate.now();
                    String valorString = JBLVALOR.getText();
                    double valor = Double.parseDouble(valorString);
                    FormaPagamento formaPagamento = identificarFormaPagamento();
                    
                    try {
                        gasto = new Gasto(tipoGasto, data, valor, formaPagamento);
                        gastos.add(gasto);
                        JOptionPane.showMessageDialog(null, "Gasto registrado :)");
                        
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    
    }//GEN-LAST:event_JBLREGISTRARGASTOActionPerformed

    private void JBLCALCULARTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLCALCULARTOTALActionPerformed
                    String dados = gasto.calcularTotalGastos(gastos);
                    JBLPAINEL.setText(dados);
                    
    }//GEN-LAST:event_JBLCALCULARTOTALActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLCALCULARTOTAL;
    private javax.swing.JRadioButton JBLCARTAO;
    private javax.swing.JRadioButton JBLCHEQUE;
    private javax.swing.JRadioButton JBLCHEQUEPRE;
    private javax.swing.JRadioButton JBLDINHEIRO;
    private javax.swing.JTextArea JBLPAINEL;
    private javax.swing.JRadioButton JBLREFEICAO;
    private javax.swing.JButton JBLREGISTRARGASTO;
    private javax.swing.JRadioButton JBLREMEDIO;
    private javax.swing.JRadioButton JBLROUPA;
    private javax.swing.JTextField JBLVALOR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
