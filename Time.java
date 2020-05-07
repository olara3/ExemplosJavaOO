public class Time{
    private int hora;
    private int minu;
    private int segu;

    public void setTime(int hora, int minu, int segu){
        this.hora = hora;
        this.minu = minu;
        this.segu = segu;
    }

    public String exibirHoraUniversal(){
        String res;
        if (this.hora < 10){
            res = "0"+hora+ ":";
        }
        else{
            res = hora + ":";
        }

        if (minu < 10){
            res = res + "0"+minu+":";
        }
        else{
            res = res + minu + ":";
        }

        if (segu < 10){
            res = res + "0"+ segu;
        }
        else{
            res = res + segu;
        }
        return res;
    }

    public String exibirHoraPadrao(){
        String sufixo;
        int novaHora;

        if (hora == 0){
            novaHora = 12;
            sufixo = "AM";
        }
        else{
            if (hora == 12){
                novaHora = hora;
                sufixo = "PM";
            }
            else{
                if (hora > 12){
                    novaHora = hora - 12;
                    sufixo = "PM";
                }
                else{
                    novaHora = hora;
                    sufixo = "AM";
                }
            }
        }
        return novaHora+":"+minu+":"+segu+" "+sufixo;


    }
}