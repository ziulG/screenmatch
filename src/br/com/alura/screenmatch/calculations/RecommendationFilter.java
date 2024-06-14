package br.com.alura.screenmatch.calculations;

public class RecommendationFilter {
    public void filtrate(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Bem avaliado pelo público");
        } else {
            System.out.println("Adicione a sua lista para assistir mais tarde");
        }
    }
}
