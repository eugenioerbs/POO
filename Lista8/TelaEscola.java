/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import codes.Aluno;
import codes.Professor;
import codes.Turma;
import codes.Titulacao;
import codes.Turno;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;



/**
 *
 * @author Eugênio
 */
public class TelaEscola extends javax.swing.JFrame {
    
    protected Turma turma;
    protected Professor professor;
    
     
    ArrayList<Aluno> lista;
    
        public String mostrarMelhorNotaEnem () {
        double maiorNota = 0;
        String alunoMaior = "";
        
        for (Aluno a : lista) {
            if (a.getNotaEnem() > maiorNota) {
                maiorNota = a.getNotaEnem();
                alunoMaior = a.getNome();
            }
        }
        return alunoMaior;
        }
               
           
        public String listarAlunos () {
        String retorno = "";
        int totalAlunos = 0;
            
        for (Aluno a : lista){
            retorno += a.getNome() + " " + a.getMatricula() + " - Nota ENEM: " + a.getNotaEnem() + "\n";
            totalAlunos++;
        }
        return "Total de alunos: " + totalAlunos + "\n" + retorno;
        }
        
        
        public Turno identificarTurno () {
        if (jblmatutino.isSelected()) {
            return Turno.MATUTINO;
                    
        } if (jblvespertino.isSelected()){
            return Turno.VESPERTINO;
        } if (jblnoturno.isSelected()){
            return Turno.NOTURNO;
        }
        return null;
        }
        
        
        public Titulacao identificarTitulacao () {
        if (jblgraduacao.isSelected()) {
            return Titulacao.GRADUACAO;
                    
        } if (jblmestrado.isSelected()){
            return Titulacao.MESTRADO;
            
        } if (jbldoutorado.isSelected()){
            return Titulacao.DOUTORADO;
        }
        return null;
        }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
         
         

    /**
     * Creates new form TelaEscola
     */
    public TelaEscola() {
        
        initComponents();
        lista = new ArrayList<>();
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
        jLabel2 = new javax.swing.JLabel();
        jbldisciplina = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jblmatutino = new javax.swing.JRadioButton();
        jblvespertino = new javax.swing.JRadioButton();
        jblnoturno = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jblnomeprofessor = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jblemail = new javax.swing.JFormattedTextField();
        jblincluiraluno = new javax.swing.JButton();
        jbllistardadosdaturma = new javax.swing.JButton();
        jblgraduacao = new javax.swing.JRadioButton();
        jblmestrado = new javax.swing.JRadioButton();
        jbldoutorado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(758, 536));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Turma");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Disciplina:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Turno:");

        buttonGroup1.add(jblmatutino);
        jblmatutino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblmatutino.setText("Matutino");
        jblmatutino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblmatutinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jblvespertino);
        jblvespertino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblvespertino.setText("Vespertino");
        jblvespertino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblvespertinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jblnoturno);
        jblnoturno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblnoturno.setText("Noturno");
        jblnoturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblnoturnoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Professor");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Titulação:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("E-mail:");

        jblincluiraluno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblincluiraluno.setText("Incluir Aluno");
        jblincluiraluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblincluiralunoActionPerformed(evt);
            }
        });

        jbllistardadosdaturma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbllistardadosdaturma.setText("Listar Dados da Turma");
        jbllistardadosdaturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbllistardadosdaturmaActionPerformed(evt);
            }
        });

        buttonGroup2.add(jblgraduacao);
        jblgraduacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblgraduacao.setText("Graduação");

        buttonGroup2.add(jblmestrado);
        jblmestrado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblmestrado.setText("Mestrado");

        buttonGroup2.add(jbldoutorado);
        jbldoutorado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbldoutorado.setText("Doutorado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbldisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblincluiraluno, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbllistardadosdaturma, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(42, 42, 42)
                                        .addComponent(jblgraduacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jblmestrado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbldoutorado))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblmatutino, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblvespertino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblnoturno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jblnomeprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbldisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblmatutino)
                    .addComponent(jblvespertino, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblnoturno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblnomeprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblgraduacao)
                    .addComponent(jblmestrado)
                    .addComponent(jbldoutorado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblincluiraluno)
                    .addComponent(jbllistardadosdaturma))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblmatutinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblmatutinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblmatutinoActionPerformed

    private void jblvespertinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblvespertinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblvespertinoActionPerformed

    private void jblnoturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblnoturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblnoturnoActionPerformed

    private void jblincluiralunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblincluiralunoActionPerformed
        String disciplina = jbldisciplina.getText();

        Turno tu = identificarTurno();
        String nomeProfessor = jblnomeprofessor.getText();
        String emailProfessor = jblemail.getText();
        Titulacao ti = identificarTitulacao();
        
        professor = new Professor(nomeProfessor, emailProfessor, ti);
        turma = new Turma(disciplina, professor, tu);
        
        TelaAluno telaAluno = new TelaAluno(this);
        telaAluno.setVisible(true);
                 
    }//GEN-LAST:event_jblincluiralunoActionPerformed

    private void jbllistardadosdaturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbllistardadosdaturmaActionPerformed
            TelaListarAlunos telaListarAlunos = new TelaListarAlunos(this);
            telaListarAlunos.setVisible(true);
                       
    }//GEN-LAST:event_jbllistardadosdaturmaActionPerformed

    public JFormattedTextField getJblemail() {
        return jblemail;
    }

    public void setJblemail(JFormattedTextField jblemail) {
        this.jblemail = jblemail;
    }

    public JFormattedTextField getJblnomeprofessor() {
        return jblnomeprofessor;
    }

    public void setJblnomeprofessor(JFormattedTextField jblnomeprofessor) {
        this.jblnomeprofessor = jblnomeprofessor;
    }

    
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
            java.util.logging.Logger.getLogger(TelaEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JFormattedTextField jbldisciplina;
    private javax.swing.JRadioButton jbldoutorado;
    private javax.swing.JFormattedTextField jblemail;
    private javax.swing.JRadioButton jblgraduacao;
    private javax.swing.JButton jblincluiraluno;
    private javax.swing.JButton jbllistardadosdaturma;
    private javax.swing.JRadioButton jblmatutino;
    private javax.swing.JRadioButton jblmestrado;
    private javax.swing.JFormattedTextField jblnomeprofessor;
    private javax.swing.JRadioButton jblnoturno;
    private javax.swing.JRadioButton jblvespertino;
    // End of variables declaration//GEN-END:variables
}
