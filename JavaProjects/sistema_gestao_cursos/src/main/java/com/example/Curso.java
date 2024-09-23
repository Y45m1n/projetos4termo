package com.example;


import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }

    //add professor no curso
    public void addProf(Professor professor){
        this.professor = professor;
    }

    //add aluno
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }   

    //lancar notas
    public void lancarNotas(String nomeAluno , double notaAluno){
        for (Aluno aluno : alunos){
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.setNota(notaAluno);
            }
        }
    }
}
