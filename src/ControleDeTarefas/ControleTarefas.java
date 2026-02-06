package ControleDeTarefas;

import java.util.Scanner;

public class ControleTarefas {
    public static void main(String[] args) {

        /*
        * fazer uma lista de tarefas fixas
        * mudar valor de false para verdadeiro quando marcar como concluído
        **/

        Scanner scanner = new Scanner(System.in);


        String[] tarefas = new String[3];
        boolean[] concluidas = new boolean[3];

        for (int i = 0; i < tarefas.length ; i++){
            System.out.print("Digite suas tarefa " + (i + 1) + ": ");
            tarefas[i] = scanner.nextLine();
            concluidas[i] = false;
        }

        int escolha;

        do {

            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("---------------------------------------------");

            System.out.println("1- Concluir primeira tarefa");
            System.out.println("2- Concluir segunda tarefa");
            System.out.println("3- Concluir terceira tarefa");
            System.out.println("4- Ver status das tarefas");
            System.out.println("0- sair");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                case 2:
                case 3:

                    int indice = escolha -1;
                    if (!concluidas[indice]){
                        concluidas[indice] = true;
                        System.out.println(tarefas[indice] + " :concluída");
                    }else {
                        System.out.println(tarefas[indice] + " já foi feita");
                    }
                    break;
                case 4:
                    for (int a = 0; a < tarefas.length; a++)
                    System.out.println("Tarefas" + tarefas[a]+ ": " + (concluidas[a] ? "Concluída" : "Pendente"));
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }while (escolha !=0);
        scanner.close();
    }
}
