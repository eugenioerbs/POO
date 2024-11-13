/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import codes.Comanda;
import codes.Item;

/**
 *
 * @author Eugênio
 */
public class TelaExibirComanda extends javax.swing.JFrame {

    private Comanda comanda;
    /**
     * Creates new form TelaExibirComanda
     * @param comanda
     */
    
    
    public TelaExibirComanda(Comanda comanda) {
        this.comanda = comanda;
        initComponents();
    }//construtor--------------------------------

    public String exibir (Comanda comand) {
        StringBuilder dados = new StringBuilder();
        
        for (Item a : comand.getItens()) {
            dados.append("Nome: ").append(a.getNome()).append("\n")
            .append("Valor: ").append(a.getValor()).append("\n")
            .append("------------------------------------------------------\n");
        }
       
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jblpainel2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jblvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jblpainel2.setColumns(20);
        jblpainel2.setRows(5);
        jScrollPane1.setViewportView(jblpainel2);

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButton1.setText("Exibir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jblvoltar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jblvoltar.setText("Voltar");
        jblvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jblvoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jblvoltar))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            jblpainel2.setText(exibir(comanda));
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jblvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblvoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jblvoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jblpainel2;
    private javax.swing.JButton jblvoltar;
    // End of variables declaration//GEN-END:variables
}
