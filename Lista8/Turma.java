/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author everbs
 */





public class Turma {
    private String disciplina;
    private ArrayList<Aluno> lista;
    private Professor professor;
    private Turno turno;
    
    public Turma(String disciplina, Professor professor, Turno turno){
        setDisciplina(disciplina);
        lista = new ArrayList<Aluno>();
        setProfessor(professor);
        setTurno(turno);
        
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos () {
        return lista;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
   
    
    public Titulacao identificarTitulacao (int titulacaoInt){
        switch (titulacaoInt) {
            case 1:
                return Titulacao.GRADUACAO;                
                
            case 2:
                return Titulacao.MESTRADO;
                
            case 3:
                return Titulacao.DOUTORADO;
                
            default:
                throw new AssertionError();
        }
    }
    
    public Turno identificarTurno (int turnoInt){
        switch (turnoInt) {
            case 1:
                return Turno.MATUTINO;               
                
            case 2:
                return Turno.VESPERTINO;
                
            case 3:
                return Turno.NOTURNO;               
            default:
                throw new AssertionError();
        }
    }
    
    public void incluirAluno (Aluno a) {
        if (a == null) {
            throw new IllegalArgumentException("Aluno deve ser informado");
        }
        if (buscar(a.getMatricula(), a.getNome()) != null) {
            throw new IllegalArgumentException("Aluno já existe na lista");
        }
        lista.add(a);
    }
    
    public Aluno buscar (int matricula, String nome) {
        for (Aluno a : lista) {
            if (a.getMatricula() == matricula && a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }       
        return null;
    }
    
    public void removerAluno (int matricula, String nome) {
        Aluno aRemover = buscar(matricula, nome);
        if (aRemover == null) {
            throw new IllegalArgumentException("Aluno deve ser informado");
        }
        lista.remove(aRemover);
    }
    
    public String listarAlunos () {
        String retorno = "";
        for (Aluno a : lista){
            retorno += a.getNome() + " " + a.getNotaEnem() + "\n";
        }
        return retorno;
    }
    
    public Aluno mostrarMelhorNotaEnem () {
        double maiorNota = 0;
        Aluno alunoMaior = null;
        
        for (Aluno a : lista) {
            if (a.getNotaEnem() > maiorNota) {
                maiorNota = a.getNotaEnem();
                alunoMaior = a;
            }
        }
        return alunoMaior;
    }
    
}//classe
    
