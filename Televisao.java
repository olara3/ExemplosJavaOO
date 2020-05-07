public class Televisao{
    // elementos que descrevem a TV
    String  marca;
    int     voltagem;
    int     tela;
    char    estado; // N-nova U-usada A-avariada
    boolean ligada;
    int     canal;
    int     volume;

    // funcionalidades
    void ligar(){
        ligada = true;
        System.out.println("A tv "+marca+" esta ligada");
    }

    void aumentarVolume(){
        if (ligada == true){
            volume++;
            System.out.println("A tv "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Para aumentar, antes ligue a TV "+marca);
        }
    }

    String obterInfo(){
        return "TV:"+marca+" ("+ligada+")  CH:"+canal+"  VOL:"+volume;
    }
}