package arvore;

public class Arvores {
    String nome;
    String tipo;
    double altura;

    public Arvores(String nome, String tipo, double altura){
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " metros");
    }

        public double calcularOxigenio(){
            return altura*10;
        }



}
