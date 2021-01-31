
package com.mycompany.usjt_ccp1an_pla_estruturas_de_repeticao_parte2;

import javax.swing.JOptionPane;

public class EstruturasDeRepeticaoParte2 {

    public static void main(String[] args) {
                        
        //Exercicio 02
        /*Escreva um programa que recebe a idade, a altura e o peso de várias pessoas. Ele
        calcula e exibe:
        - a quantidade de pessoas com idade superior a 50 anos.
        - a média das alturas das pessoas com idade entre 10 e 20 anos, inclusive.
        - o percentual de pessoas com peso inferior a 40 quilos entre todas as pessoas
        analisadas.
        O programa encerra sua execução quando a idade digitada for igual a zero.
        */
                
        //declaracao das variaveis
        /*int idade;
        double altura, peso;

        int idadeMais50 = 0, pesoMenor40 = 0, totalPessoas = 0, qtdeAlturas10E20 = 0;
        double somaAlturas10E20 = 0;
        
        //entrada com captura de dados + calculo programa 
        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));                    
            if (idade != 0) {
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura"));
                peso = Double.parseDouble(JOptionPane.showInputDialog("Digite peso"));
                if (idade > 50) {
                    idadeMais50++;
                }

                if (idade >= 10 && idade <= 20) {
                    qtdeAlturas10E20++;
                    somaAlturas10E20 += altura;
                }
                if (peso < 40) {
                    pesoMenor40++;
                }

                totalPessoas++;

            }
        } while (idade != 0);
        
        double mediaAlturas10E20;
        mediaAlturas10E20 = somaAlturas10E20 / qtdeAlturas10E20;
        
        //saida
        JOptionPane.showMessageDialog(null, "Pessoas com mais de 50 anos: " + idadeMais50);
        JOptionPane.showMessageDialog(null, "Média de alturas (entre 10 e 20 anos): " + mediaAlturas10E20);
        JOptionPane.showMessageDialog(null, "Percentual pessoas com menos de 40 quilos: " + (pesoMenor40 / totalPessoas));

        
        //Exercicio 01
        /*Professores de uma instituição desejam calcular a média geral de notas de suas
        turmas. Sua missão é escrever um programa simples que os ajude nesta tarefa. Como
        cada turma tem uma quantidade de alunos diferente, o programa deve permitir que o
        professor que o estiver utilizando informe quantos alunos a turma dele tem. A seguir,
        o programa deve permitir que o professor digite cada nota e, ao final, exibir a média.
        */
        
        //delcaração das variaveis
        /*int n;
        int nota;
        double somaFinal = 0;
        
        //entrada (captura de dados pelo usuario)
        n = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos?"));

        //calculo programa + captura de dados
        for (int cont = 1; cont <= n; cont++ ){
            nota = Integer.parseInt(JOptionPane.showInputDialog ("Qual é a nota?"));
            //somaFinal = somaFinal + nota;
            somaFinal += nota;
        }
         //somaFinal = somaFinal / n;
         somaFinal /= n;
        
        //saída
         JOptionPane.showMessageDialog(null, "Media final: " + somaFinal);*/
        
        /*ou 
        
        double mediaFinal;
        mediaFinal = somaFinal / n;
        
        //saida
         JOptionPane.showMessageDialog(null, "Media final: " + mediaFinal);*/
        
        /*ou
        
        //saida
         JOptionPane.showMessageDialog(null, "Media final: " + (somaFinal / n);*/
        
        
        //Exercicio 03
        /*Escreva um programa que auxilia o DETRAN a saber o total de recursos
        arrecadados com a aplicação de multas de trânsito. O programa lê as seguintes
        informações para cada motorista:
        - número da carteira de motorista
        - número de multas
        - valor de cada uma das multas
        Deseja-se saber o valor da dívida de cada motorista e, ao final da leitura, o total de
        recursos arrecadados (a soma de todos os totais de multas de cada motorista).
        Também é preciso informar o número da carteira do motorista que levou mais multas.
        O programa encerra execução quando o número da carteira de motorista digitado for
        igual a zero.
        */
        
        //declarou as variaveis
        int cartMotorista, qtdeMultas;
        double valorMulta, somaDividaIndiv, somaDividaGeral = 0;
        int cartMaiorInfrator = -1;
        int qtdeMultasMaiorInfrator = 0;
        
        //entrada com captura de dados + calculo programa 
        do{
            cartMotorista = Integer.parseInt(JOptionPane.showInputDialog("Digite a carteira"));
            if (cartMotorista != 0){
                qtdeMultas = Integer.parseInt (JOptionPane.showInputDialog("Quantas multas?"));
                if (qtdeMultas > qtdeMultasMaiorInfrator){
                    cartMaiorInfrator = cartMotorista;
                    qtdeMultasMaiorInfrator = qtdeMultas;
                }
                somaDividaIndiv = 0;
                int contQtdeMultas = 1;
                while (contQtdeMultas <= qtdeMultas){
                    valorMulta = Double.parseDouble(JOptionPane.showInputDialog("Valor da multa?"));
                    somaDividaIndiv += valorMulta;
                    contQtdeMultas++;
                }
                somaDividaGeral += somaDividaIndiv;
                
            }
        
        }while (cartMotorista != 0);
        
    }
}
