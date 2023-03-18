public class Escolha {
    String text;// texto digitado
    String textmos; //texto mostrado na tela
    Capitulo pcap;//referencia ao objeto capitulo recebendo escolhas no conceito de hierarquia

    Escolha(String text, Capitulo pcap, String textmos)
    {
        
        this.text = text;
        this.textmos = textmos;
        this.pcap = pcap;
    }
}
