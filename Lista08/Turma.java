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

public class Turma {
    private String disciplina;
    private Turno turno;
    public ArrayList<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    
    public Turma (String disciplina, Turno turno, Professor professor) {
        setDisciplina(disciplina);
        setTurno(turno);
        alunos = new ArrayList<>();
        setProfessor(professor);
        
    }//construtor

    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    public void incluirAluno (Aluno aluno, String disciplina, ArrayList<Turma> turmas) {
        boolean turmaEncontrada = false;
        
        for (Turma a : turmas) {
            if (a.getDisciplina().equalsIgnoreCase(disciplina)) {
                alunos.add(aluno);
                turmaEncontrada = true;
                break;
            }
        }
        
        if (turmaEncontrada != false) {
            JOptionPane.showMessageDialog(null, "Aluno foi incluído em " + disciplina + "!");
        } else if (turmaEncontrada != true) {
            JOptionPane.showMessageDialog(null, "Turma não foi encontrada");
        }
    }
    
    
    public void removerAluno (String nome, String disciplina, ArrayList<Turma> turmas) {
        boolean turmaEncontrada = false;
        
        for (Turma a : turmas) {
            if (a.getDisciplina().equalsIgnoreCase(disciplina)) {
                for (Aluno b : a.getAlunos()) {
                    if (b.getNome().equalsIgnoreCase(nome)) {
                        a.alunos.remove(b);
                        break;
                    }
                }
                turmaEncontrada = true;
            }
        }
        
        if (turmaEncontrada != false) {
            JOptionPane.showMessageDialog(null, nome + " foi removido de " + disciplina + " com sucesso!");
        } else if (turmaEncontrada != true) {
            JOptionPane.showMessageDialog(null, disciplina + " não foi encontrada");
        }      
    }
    
    
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
    
    
    
    
            
            
            
}//classe
