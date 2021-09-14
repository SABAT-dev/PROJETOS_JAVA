package exercicio;
import javax.swing.*;

public class EntradaDeDados {
    public static void main(String[] args) {
        String canetas = JOptionPane.showInputDialog("Informe a quantidade de canetas: ");
        String pessoas = JOptionPane.showInputDialog("Informe quantas pessoas: ");

        double canetasConvertidas = Double.parseDouble(canetas);
        double pessoasConvertidas = Double.parseDouble(pessoas);

        int divisao = (int) (canetasConvertidas / pessoasConvertidas);
        double resto = canetasConvertidas % pessoasConvertidas;

        int resposta_divisao = JOptionPane.showConfirmDialog(null,
                "Deseja ver o resultado da divisão?");
        if (resposta_divisao == 0){
            JOptionPane.showMessageDialog(null,
                    "O resultado da divisão é " + divisao);
        } else if (resposta_divisao == 1){
            System.out.println("Não quiz ver o resultado");
        }
        else {
            System.out.println("Cancelou...");
        }

        int resposta_resto = JOptionPane.showConfirmDialog(null,
                "Deseja ver o resultado do resto?");
        if (resposta_resto == 0){
            JOptionPane.showMessageDialog(null,
                    "O resultado do resto é " + resto);
        } else if (resposta_resto == 1){
            System.out.println("Não quiz ver o resultado");
        }
        else {
            System.out.println("Cancelou...");
        }
    }
}
