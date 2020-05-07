public class TimeTeste{
    public static void main(String args[]){
        Time t = new Time();
        t.setTime(20,18,32);

        System.out.println(t.exibirHoraUniversal());
        System.out.println(t.exibirHoraPadrao());

        t.setTime(0,20,35);
        System.out.println(t.exibirHoraPadrao());

        t.setTime(12,35,52);
        System.out.println(t.exibirHoraPadrao());

        t.setTime(9,22,45);
        System.out.println(t.exibirHoraPadrao());

    }
}