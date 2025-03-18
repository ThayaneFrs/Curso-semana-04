package emissaodecarbono;

public class EmissaoDeCarbono {
    private String atividade;
    private double quantidadeEmissao;

    public EmissaoDeCarbono(String atividade, double quantidadeEmissao) {
        this.atividade = atividade;
        this.quantidadeEmissao = quantidadeEmissao;
    }

    public double calcularEmissaoCO2(double minutos) {
        double horas = minutos / 60;
        return horas * quantidadeEmissao;
    }

    public void exibirInformacoes() {
        System.out.println("Atividade: " + atividade);
        System.out.println("Emissao de CO2 por hora: " + quantidadeEmissao + " kg");

    }

    public static void main(String[] args) {

        EmissaoDeCarbono atividadeDirigir = new EmissaoDeCarbono("Dirigir", 0.2);

        atividadeDirigir.exibirInformacoes();

        double emissao = atividadeDirigir.calcularEmissaoCO2(120);

        System.out.println("Emissao de CO2 para 120 minutos: " + emissao + " kg");


    }

}
