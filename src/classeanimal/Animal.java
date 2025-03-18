package classeanimal;

public class Animal {
    String nome;
    String habitat;
    String som;
    String tipoDeAlimentacao;

    public Animal(String nome, String habitat, String som, String tipoDeAlimentacao){
        this.habitat = habitat;
        this.nome = nome;
        this.som = som;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void mover (){
        System.out.println(nome+ " esta se movendo no habitat " + habitat + ".");

    }
    public void emitirSom(){
        System.out.println(nome+ " faz o som: " + som);
    }

    public void alimentar() {
        if (tipoDeAlimentacao.equalsIgnoreCase("herbivoro")) {
            System.out.println(nome+" se alimenta de plantas.");
             }
        else if (tipoDeAlimentacao.equalsIgnoreCase("carnivoro")){
            System.out.println(" se alimenta de carne.");}
        else {
            System.out.println(nome+ " tem um tipo de alimentacao desconhecido.");

        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Habitat: " + habitat);
        System.out.println("Som " + som);
        System.out.println("Tipo de alimentacao: " + tipoDeAlimentacao);

    }

    public static void main(String[] args){
        Animal cavalo = new Animal("Cavalo", "Semideserto", "Relincha", "herbivoro");
        cavalo.exibirInformacoes();
        cavalo.mover();
        cavalo.emitirSom();
        cavalo.alimentar();

        System.out.println();

        Animal leao = new Animal("Leao", "Savana", "Rugido", "carnivoro");
        leao.exibirInformacoes();
        leao.mover();
        leao.emitirSom();
        leao.alimentar();
    }


}
