package classeplanta;

public class ClassePlanta {
    String nome;
    String tipo;
    double necessidadeDeAgua;

    public ClassePlanta(String  nome, String tipo, double necessidadeDeAgua){
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
    }

    public double calcularNecessidadeDeAgua(int qtdSemanas, double area) {
        double totalAgua = necessidadeDeAgua * qtdSemanas * area;
        System.out.println("A quantidade de agua necessaria para " + qtdSemanas + "semanas para uma area de " + area + " metros quadrados e: " + totalAgua + "litros.");
        return totalAgua;
    }

    public void irrigar() {
        System.out.println("A planta "+ nome+ " foi irrigada com sucesso");
    }

    public void exibirInformacoes() {
        System.out.println("Nome da planta: " + nome);
        System.out.println("Tipo de planta: " + tipo);
        System.out.println("Necessidade de agua por metro quadrado por semana: " + necessidadeDeAgua + " litros.");
    }

    public static void main(String [] args) {
        ClassePlanta alface = new ClassePlanta("Alface", "Horta", 5.0);
        alface.exibirInformacoes();
        alface.calcularNecessidadeDeAgua(4,10);
        alface.irrigar();
    }
}
