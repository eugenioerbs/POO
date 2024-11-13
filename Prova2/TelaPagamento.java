/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import codes.Comanda;
import codes.Dinheiro;
import codes.Pagamento;




/**
 *
 * @author Eugênio
 */
public class TelaPagamento extends javax.swing.JFrame {


    private Comanda comanda;
    private Dinheiro dinheiro;
    private Pagamento pagamento;
    
    
    /**
     * Creates new form TelaPagamento
     * @param comanda
     */
    public TelaPagamento(Comanda comanda) {
        this.comanda = comanda;
        initComponents();
        
    }//construtor -----------------------------------------
    
     public void pagar (Comanda comand) {
     jblpainel.setText("Comanda paga");
        
    }
    
    public void pagar (Comanda comand, Dinheiro dinheiro) {
        if (dinheiro.getValorPago() == comand.calcularValorComanda(comand)) {
            jblpainel.setText("Comanda paga\n" + "Valor pago: " + dinheiro.getValorPago() + " | Valor da comanda: " + comand.calcularValorComanda(comand));
                    
        } else if (dinheiro.getValorPago() > comand.calcularValorComanda(comand)) {
            jblpainel.setText("Pago a mais, valor do troco: " + calcularTroco(comand, dinheiro) + "\n"
                    + "Valor pago: " + dinheiro.getValorPago() + "Valor da comanda: " + comand.calcularValorComanda(comand));
            
        } else if (dinheiro.getValorPago() < comand.calcularValorComanda(comand)) {
            jblpainel.setText("Faltou dinheiro, faltam R$" + calcularTroco(comand, dinheiro) + "\n"
            + "Valor pago: " + dinheiro.getValorPago() + " | Valor da comanda: " + comand.calcularValorComanda(comand));
            
        }       
    }
    
    
    public double calcularDesconto (Comanda comand) {
        double valorComanda = comand.calcularValorComanda(comand);
        
        double desconto = (valorComanda * 10) / 100;
      
        return valorComanda - desconto;
    }
    
    
    public double calcularTroco (Comanda comand, Dinheiro dinheiro) { //troco e tambem se caso exceda o valor a mais
        double troco = 0;
        
        if (dinheiro.getValorPago() > comand.calcularValorComanda(comand)) {
            troco = dinheiro.getValorPago() - comand.calcularValorComanda(comand);
        } else if (dinheiro.getValorPago() < comand.calcularValorComanda(comand)) {
            troco = comand.calcularValorComanda(comand) - dinheiro.getValorPago(); //valor que falta para completar o pagamento
        }
        
        return troco;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jblpainel = new javax.swing.JTextArea();
        jblvoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jbldinheiro = new javax.swing.JRadioButton();
        jblcartao = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jblvalorpagamento = new javax.swing.JTextField();
        jblpagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela pagamento");
        setMinimumSize(new java.awt.Dimension(573, 525));

        jblpainel.setColumns(20);
        jblpainel.setRows(5);
        jScrollPane1.setViewportView(jblpainel);

        jblvoltar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jblvoltar.setText("Voltar");
        jblvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblvoltarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setText("Forma de pagamento");

        buttonGroup1.add(jbldinheiro);
        jbldinheiro.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jbldinheiro.setText("Dinheiro");
        jbldinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbldinheiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jblcartao);
        jblcartao.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jblcartao.setText("Cartão");
        jblcartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblcartaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addComponent(jbldinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblcartao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jbldinheiro)
                    .addComponent(jblcartao))
                .addGap(16, 16, 16))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Valor do pagamento");

        jblvalorpagamento.setEnabled(false);
        jblvalorpagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblvalorpagamentoActionPerformed(evt);
            }
        });

        jblpagar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jblpagar.setText("Pagar");
        jblpagar.setEnabled(false);
        jblpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblpagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jblvalorpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jblpagar)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblvalorpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jblpagar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jblvoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jblvoltar)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblcartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblcartaoActionPerformed
        jblpagar.setEnabled(true);
        
    }//GEN-LAST:event_jblcartaoActionPerformed

    private void jbldinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbldinheiroActionPerformed
            jblvalorpagamento.setEnabled(true);
            jblpagar.setEnabled(true);
            
    }//GEN-LAST:event_jbldinheiroActionPerformed

    private void jblvalorpagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblvalorpagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblvalorpagamentoActionPerformed

    private void jblpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblpagarActionPerformed
            pagamento = new Pagamento(comanda);
            dinheiro = new Dinheiro(comanda, Double.parseDouble(jblvalorpagamento.getText()));
            
            
            if (jbldinheiro.isSelected()) {
                pagar(comanda, dinheiro);
            } else if (jblcartao.isSelected()) {
                jblpainel.setText("Comanda paga");
            }
                    
                    
    }//GEN-LAST:event_jblpagarActionPerformed

    private void jblvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblvoltarActionPerformed
        dispose();
        
    }//GEN-LAST:event_jblvoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jblcartao;
    private javax.swing.JRadioButton jbldinheiro;
    private javax.swing.JButton jblpagar;
    private javax.swing.JTextArea jblpainel;
    private javax.swing.JTextField jblvalorpagamento;
    private javax.swing.JButton jblvoltar;
    // End of variables declaration//GEN-END:variables
}