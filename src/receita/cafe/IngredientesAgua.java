package receita.cafe;

public class IngredientesAgua implements Ingredientes {
    @Override
    public void adicionar() {
        System.out.println("Adicionando 100ml de água");
    }
}
