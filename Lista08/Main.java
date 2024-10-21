/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Main {
    private Professor professor;
    private Turma turma;
    private Aluno aluno;
    private ArrayList<Turma> turmas = new ArrayList<>();
    
    public Main () {
        
        int op;
        do {            
        String opcao = JOptionPane.showInputDialog("""
                                                   ESCOLHA
                                                   1 - Criar turma
                                                   2 - Incluir aluno
                                                   3 - Remover aluno
                                                   4 - Mostrar aluno com melhor nota
                                                   5 - Listar dados da turma""");
        op = Integer.parseInt(opcao);
        
            switch (op) {
                case 1 -> { //-----------------------------------------------------------------------------
                    String disciplina = JOptionPane.showInputDialog("Informe a disciplina:");
                    String turnoString = JOptionPane.showInputDialog("""
                                                                     Turno
                                                                     1 - Matutino
                                                                     2 - Vespertino
                                                                     3 - Noturno""");
                    int turnoInt = Integer.parseInt(turnoString);
                    Turno turno = identificarTurno(turnoInt);
                    String nomeProf = JOptionPane.showInputDialog("Informe o nome do professor: ");
                    String email = JOptionPane.showInputDialog("Informe o email do professor:");
                    String titulacaoString = JOptionPane.showInputDialog("Informe a titulação de " + nomeProf + ":\n"
                            + "1 - Graduação\n"
                            + "2 - Mestrado\n"
                            + "3 - Doutorado");
                    int titulacaoInt = Integer.parseInt(titulacaoString);
                    Titulacao titulacao = identificarTitulacao(titulacaoInt);
                    
                    try {
                        professor = new Professor(nomeProf, email, titulacao);
                        turma = new Turma(disciplina, turno, professor);
                        turmas.add(turma);
                                              
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                
                case 2 -> { //-----------------------------------------------------------------------------
                    String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    String matricula = JOptionPane.showInputDialog("Digite a matrícula de " + nomeAluno + ": ");
                    String notaString = JOptionPane.showInputDialog("Digite a nota de " + nomeAluno + ": ");
                    double nota = Double.parseDouble(notaString);
                    
                    String disciciplinaDesejada = JOptionPane.showInputDialog("Informe a turma que " + nomeAluno + " será incluíde: ");
                    
                    try {
                        aluno = new Aluno(matricula, nomeAluno, nota);
                        turma.incluirAluno(aluno, disciciplinaDesejada, turmas);
                        
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }                   
                }
                
                case 3 -> { //-----------------------------------------------------------------------------
                    String nomeAlunoRemocao = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                    String disciciplinaRemocao = JOptionPane.showInputDialog("Informe a turma que " + nomeAlunoRemocao + " será removido: ");
                    
                    turma.removerAluno(nomeAlunoRemocao, disciciplinaRemocao, turmas);
                    
                }
                
                case 4 -> { //-----------------------------------------------------------------------------
                    String turmaAlvoCalculo = JOptionPane.showInputDialog("Informe a disciplina/turma que desesa saber a melhor nota: ");
                    Aluno alunoMaiorNota = turma.obterAlunoMelhorNota(turmaAlvoCalculo, turmas);
                    
                    JOptionPane.showMessageDialog(null, " Aluno: " + alunoMaiorNota.getNome() + "\n"
                                                      + " Nota: " + alunoMaiorNota.getNota());
                    
                }
                case 5 -> { //-----------------------------------------------------------------------------
                    String disciplinaExibir = JOptionPane.showInputDialog("Informe a disciplina: ");
                    String dados = listarDadosTurma(disciplinaExibir, turmas);
                    
                    JOptionPane.showMessageDialog(null, dados);
                    
                }
                    
                default -> throw new AssertionError();
            }
            
        } while (op != 6);
        
        
        
        
        
    }//consturotr
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    
    public Turno identificarTurno (int turno) {
        switch (turno) {
            case 1 -> {
                return Turno.MATUTINO;
            }
            case 2 -> {
                return Turno.VESPERTINO;
            }
            case 3 -> {
                return Turno.NOTURNO;
            }
            default -> {
            }
        }
        return null; 
    }
    
    
    public Titulacao identificarTitulacao (int titulacaoInt) {
        switch (titulacaoInt) {
            case 1 -> {
                return Titulacao.GRADUACAO;
            }
            case 2 -> {
                return Titulacao.MESTRADO;
            }
            case 3 -> {
                return Titulacao.DOUTORADO;
            }
            default -> {
            }
        }
        return null; 
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
    
}//class
