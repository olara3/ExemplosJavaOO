public class AppTelevisao{
    public static void main(String args[]){
        Televisao t, t2;

        

        t = new Televisao();
        t.marca    = "Samsung";
        t.voltagem = 110;
        t.tela     = 55;
        t.estado   = 'N';
        t.ligada   = false;
        t.canal    = 1;
        t.volume   = 0;

        t2 = new Televisao();
        t2.marca = "Panasonic";
        t2.voltagem = 220;
        t2.tela = 26;
        t2.estado = 'U';
        t2.ligada = false;
        t2.canal = 5;
        t2.volume = 10;

        t.ligar();
        t.aumentarVolume();
        t.aumentarVolume();

        t2.aumentarVolume();
        t2.ligar();
        t2.aumentarVolume();

        String infoT1 = t.obterInfo();
        System.out.println(infoT1);
        
        System.out.println(t2.obterInfo());


    }
}