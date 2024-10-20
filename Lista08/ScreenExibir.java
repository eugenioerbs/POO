/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import codes.Aluno;
import codes.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class ScreenExibir extends javax.swing.JFrame {

    private ScreenEscola telaOrigem;
    
    /**
     * Creates new form ScreenExibir
     * @param screenEscola
     */
    
    public ScreenExibir(ScreenEscola screenEscola) {
        this.telaOrigem = screenEscola;
        initComponents();
        
    }//construtor
    
    
    public Aluno obterAlunoMelhorNota (String discuplina, ArrayList<Turma> turmas) {
        double maiorNota = Integer.MIN_VALUE;
        boolean turmaEncontrada = false;
        
        for (Turma a : turmas) {
            if (a.getDisciplina().equalsIgnoreCase(discuplina)) {
                for (Aluno b : a.getAlunos()) {
                    if (b.getNota() > maiorNota) {
                        maiorNota = b.getNota();
                    }
                }
                turmaEncontrada = true;
            }
        }
        
        Aluno alunoDonoMaiorNota = null;
        
        if (turmaEncontrada != false) {
            for (Turma c : turmas) {
                if (c.getDisciplina().equalsIgnoreCase(discuplina)) {
                    for (Aluno d : c.getAlunos()) {
                        if (d.getNota() == maiorNota) {
                            alunoDonoMaiorNota = d;
                            break;
                        }
                    }
                }
            }
            
        } else if (turmaEncontrada != true) {
            JOptionPane.showMessageDialog(null, "Turma não foi encontrada");
        }
        
        return alunoDonoMaiorNota;
    }
    
    
    public String listarDadosTurma (String disciplina, ArrayList<Turma> turmas) {
        StringBuilder dados = new StringBuilder();
        
        for (Turma a : turmas) {
            if (a.getDisciplina().equalsIgnoreCase(disciplina)) {
                dados.append("Turma: ").append(a.getDisciplina()).append("\n")
                .append("Turno: ").append(a.getTurno()).append("\n")
                .append("-----------------------------------------------------------\n")
                .append("Professor: ").append(a.getProfessor().getNome()).append("\n")
                .append("Titulação: ").append(a.getProfessor().getTitulacao()).append("\n")
                .append("------------------------------------------------------------\n");
                for (Aluno b : a.getAlunos()) {
                    dados.append(b.getNome()).append("  -  ").append(b.getMatricula()).append("  -  Nota: ").append(b.getNota()).append("\n");
                }
            }
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
        jblpainel = new javax.swing.JTextArea();
        jblconfirmar = new javax.swing.JButton();
        jblvoltar = new javax.swing.JButton();
        jbltelinha = new javax.swing.JTextField();
        jblmelhornota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(613, 501));

        jblpainel.setColumns(20);
        jblpainel.setRows(5);
        jScrollPane1.setViewportView(jblpainel);

        jblconfirmar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jblconfirmar.setText("Exibir Dados");
        jblconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblconfirmarActionPerformed(evt);
            }
        });

        jblvoltar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jblvoltar.setText("Voltar");
        jblvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblvoltarActionPerformed(evt);
            }
        });

        jbltelinha.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jblmelhornota.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jblmelhornota.setText("Melhor nota");
        jblmelhornota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblmelhornotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbltelinha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jblconfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jblmelhornota)
                        .addGap(18, 18, 18)
                        .addComponent(jblvoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblconfirmar)
                    .addComponent(jblvoltar)
                    .addComponent(jbltelinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblmelhornota))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblconfirmarActionPerformed
        String disciplina = jbltelinha.getText();
        String dados = listarDadosTurma(disciplina, telaOrigem.turmas);
        jblpainel.setText(dados);
        
    }//GEN-LAST:event_jblconfirmarActionPerformed

    private void jblmelhornotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblmelhornotaActionPerformed
        String turmaAlvoCalculo = jbltelinha.getText();
        Aluno alunoMaiorNota = obterAlunoMelhorNota(turmaAlvoCalculo, telaOrigem.turmas);
                    
        jblpainel.setText(" Aluno: " + alunoMaiorNota.getNome() + "\n"
                        + " Nota: " + alunoMaiorNota.getNota());
        
    }//GEN-LAST:event_jblmelhornotaActionPerformed

    private void jblvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblvoltarActionPerformed
        dispose();
        
    }//GEN-LAST:event_jblvoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jblconfirmar;
    private javax.swing.JButton jblmelhornota;
    private javax.swing.JTextArea jblpainel;
    private javax.swing.JTextField jbltelinha;
    private javax.swing.JButton jblvoltar;
    // End of variables declaration//GEN-END:variables
}
