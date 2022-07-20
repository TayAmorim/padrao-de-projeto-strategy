package receita.cafe;

public class PrensaFrancesa {
    private static Ingredientes ingredientes;

    public static void setIngredientes(Ingredientes ingredientes) {
        PrensaFrancesa.ingredientes = ingredientes;
    }

    public static Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setComportamento(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public static void adicionar() {ingredientes.adicionar();
    }
}
