package br.com.ucb.Model;

import java.util.ArrayList;


// GUSTAVO
public class Turma {
   private Integer id;
   ArrayList<Aluno> listaDeAlunos;

   public Turma(){
      this.listaDeAlunos = new ArrayList<>();
   }

   void insereAluno(Aluno novoAluno){
      listaDeAlunos.add(novoAluno);
   }

   void listarAlunos(){
      System.out.println("Lista De Alunos");

      for(Aluno a:listaDeAlunos){
         a.listar();
      }
   }
}
