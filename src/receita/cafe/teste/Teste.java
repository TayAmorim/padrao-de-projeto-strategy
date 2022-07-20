package receita.cafe.teste;

import receita.cafe.*;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ingredientes agua = new IngredientesAgua();
        Ingredientes cafeGrao = new IngredientesCafeGrao();
        Ingredientes cafeMoido = new IngredientesCafeMoido();

        PrensaFrancesa prensaFrancesa = new PrensaFrancesa();

        System.out.println("** Preparando 50g de café ? **");


        PrensaFrancesa.setIngredientes(cafeGrao);
        for (int i = 0; i < 5; i++) {
            PrensaFrancesa.adicionar();
        }
        PrensaFrancesa.setIngredientes(cafeMoido);
        PrensaFrancesa.adicionar();

        PrensaFrancesa.setIngredientes(agua);
        for (int i = 0; i < 5; i++) {
            PrensaFrancesa.adicionar();
        }

    }
}
