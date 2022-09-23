import java.util.List;
import java.util.stream.Stream;

public class filter {

    public static void main(String[] args) {

    List<Pessoa> lista = new Pessoa().pessoagenero();
        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("feminino"));

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("feminino"))
                .forEach(listafeminino-> System.out.println(listafeminino));




    }

}
