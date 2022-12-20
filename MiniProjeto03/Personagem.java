public class Personagem {

    String Nome;
    int Habilidade;

    public Personagem(String NomePersonagem, int EnergiaPersonagem) {
        this.Nome = NomePersonagem;
        this.Habilidade = 100;
    }

    public void ModificadorDeEnergia(int EnergiaNojogo) {

        this.Habilidade = Habilidade + EnergiaNojogo;

        if (Habilidade > 100) {
            Habilidade = 100;
        }

        if (Habilidade < 0) {
            Habilidade = 0;

        }

        if (Habilidade == 0) {
            System.out.println();
            System.out.println(Nome
                    + " não resistiu e perdeu toda sua vida");
        }

    }

}
