import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Talles");

        nomes.remove(1);
        System.out.println("Após remover o segundo nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(2);
        System.out.println("Após remover o terceiro nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (nomes.size() > 0 && nomes.get(0).equals("Talles")) {
            System.out.println("O primeiro nome é Talles.");
        } else {
            System.out.println("O primeiro nome não é Talles.");
        }
    }
}