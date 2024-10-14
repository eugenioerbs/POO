/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import codes.Professor;
import codes.Turma;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class TelaListarAlunos extends javax.swing.JFrame {

    private final TelaEscola telaOrigem;
    
    /**
     * Creates new form TelaListarAlunos
     * @param telaEscola
     */
    public TelaListarAlunos(TelaEscola telaEscola) {
        this.telaOrigem = telaEscola;
        initComponents();
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
        jblpainel = new javax.swing.JTextArea();
        jblcancelar = new javax.swing.JButton();
        jblconfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(496, 438));

        jblpainel.setColumns(20);
        jblpainel.setRows(5);
        jScrollPane1.setViewportView(jblpainel);

        jblcancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblcancelar.setText("Cancelar");
        jblcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblcancelarActionPerformed(evt);
            }
        });

        jblconfirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblconfirmar.setText("Confirmar");
        jblconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblconfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jblconfirmar)
                .addGap(18, 18, 18)
                .addComponent(jblcancelar)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblcancelar)
                    .addComponent(jblconfirmar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblcancelarActionPerformed

    private void jblconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblconfirmarActionPerformed
      
        jblpainel.setText(
                telaOrigem.listarAlunos() + "\n"
                + "Nota ENEM mais alta: " + telaOrigem.mostrarMelhorNotaEnem());

    }//GEN-LAST:event_jblconfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEscola telaEscola = new TelaEscola();
                new TelaListarAlunos(telaEscola).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jblcancelar;
    private javax.swing.JButton jblconfirmar;
    private javax.swing.JTextArea jblpainel;
    // End of variables declaration//GEN-END:variables
}
