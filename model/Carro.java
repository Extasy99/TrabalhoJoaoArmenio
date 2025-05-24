//sistema de revenda de carros
//criar classe carro com atributos principais

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int ano;
    private double preco;
    

//construtor: inicializar os atributos 
    public Carro(String marca, String modelo, String cor, String placa, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this. ano =ano;
        this.preco = preco;
    }

//getters e setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
//substituindo um metodo herdado
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}