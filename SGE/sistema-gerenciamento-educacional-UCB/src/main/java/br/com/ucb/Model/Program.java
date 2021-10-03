package br.com.ucb.Model;

import java.util.Scanner;

public class Program {
    // CLASSE DE TESTE

    public static void main(String[] args) {
        String nome,cpf,dataNascimento,anoEscolar,email;
        int opc,id;
        Turma novaTurma = new Turma();

        Scanner console = new Scanner(System.in);

        do{
            System.out.println("\n-------------------");
            System.out.println("         MENU");
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Matriuclar Aluno");
            System.out.println("2- Cadastrar Professor");
            System.out.println("3- Cadastrar Turmas");
            System.out.println("4- Exibir Turmas");
            System.out.println("5- Excluir Turmas");
            System.out.println("6- Exibir Relatórios Das Turmas");
            System.out.println("7- Exibir Relatórios Dos Professores");
            System.out.println("8- Exibir Alunos Matriculados");
            System.out.println("0- Sair");

            opc = console.nextInt();


            switch (opc){

                case 1:
                    System.out.println("\nID: ");
                    id = console.nextInt();
                    console.nextLine();
                    System.out.println("\nNome: ");
                    nome = console.nextLine();
                    System.out.println("\nCPF: ");
                    cpf = console.nextLine();
                    System.out.println("\nData de Nascimeto: ");
                    dataNascimento = console.nextLine();
                    System.out.println("\nAno Escolar: ");
                    anoEscolar = console.nextLine();
                    System.out.println("\nEmail: ");
                    email = console.nextLine();

                    Aluno novoAluno = new Aluno(id,nome,cpf,dataNascimento,anoEscolar,email);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 7:
                    break;
                case 8:
                    novaTurma.listarAlunos();
                    break;
                default:
                    System.out.println("\nOpção Inválida");
            }

        }while(opc != 0);
    }
}
