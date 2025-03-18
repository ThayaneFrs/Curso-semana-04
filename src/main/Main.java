package main;

import arvore.Arvores;

public class Main {
    public static void main(String[] args) {
        Arvores arvores = new Arvores("Carvalho", "Folhosa", 5.0);
        arvores.exibirInformacoes();
        System.out.println("Oxigenio produzido: " + arvores.calcularOxigenio() + " gramas por dia");

    }

    }

