package _01_Sequencial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MessageBox_v1 {
    public static void main(String[] args){
        String nome, anoNascimento;
        int ano, idade;
        nome = JOptionPane.showInputDialog("Digite seu nome:");

        anoNascimento = JOptionPane.showInputDialog("Digite seu ano de nascimento:");

        ano = Integer.parseInt(anoNascimento);

        idade = 2026 - ano;

        JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nIdade: " + idade + " anos" );
    }
}
