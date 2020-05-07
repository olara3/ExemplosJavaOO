public class BombaDeCombustivel{
    private String combustivel;
    private double precoLitro;
    private double qtdLitros;
    private double valorTotal;
    private boolean abastecendo;

    public BombaDeCombustivel(String nome, double valorLitro){
        this.combustivel = nome;
        this.precoLitro = valorLitro;
        this.abastecendo = false;
        this.qtdLitros = 0.0;
        this.valorTotal = 0.0;
    }

    public void iniciarAbastecimento(){
        abastecendo = true;
        System.out.println("Bomba "+combustivel+" Iniciando abastecimento");
        qtdLitros = 0.0;
        valorTotal = 0.0;
    }

    public void abastecerPorLitros(double qtde){
        if (abastecendo){
            this.qtdLitros = qtde;
            this.valorTotal = qtde * precoLitro;
        }
        else{
            System.out.println("Destrave abastecimento antes");
        }
    }

    public void abastecerPorValor(double valor){
        if (abastecendo){
            this.valorTotal = valor;
            this.qtdLitros = valor / precoLitro;
        }
        else{
            System.out.println("Destrave abastecimento antes");
        }
    }

    public void concluirAbastecimento(){
        abastecendo = false;
        System.out.println("| o | ------------------------------  ");
        System.out.println("| o | IsidroCorp Gas & Energy         ");
        System.out.println("| o | ------------------------------  ");
        System.out.println("| o | Combustivel :  "+combustivel);
        System.out.println("| o | Valor Litro R$ "+precoLitro);
        System.out.println("| o | Litros         "+qtdLitros);
        System.out.println("| o | Total       R$ "+valorTotal);
        System.out.println("| o | ................................");
    }
}