import java.util.ArrayList;
import java.util.List;


public class Concessionaria {
    private final List<Carro> carros;

    private Concessionaria() {
        carros = new ArrayList<>();
    }

    public void cadastrarCarro(Carro carro) {
        carros.add(carro);
    }

    public List<Carro> ListarCarros() {
        return carros;
    }
}