import java.util.Scanner;

public class Posto{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcao, modo;
        double valor;

        BombaDeCombustivel b1, b2, b3;
        b1 = new BombaDeCombustivel("Alcool", 2.19);
        b2 = new BombaDeCombustivel("Gasolina", 3.49);
        b3 = new BombaDeCombustivel("Diesel", 2.99);

        do{
            System.out.println(" ----- >Digite 1 para Alcool / 2 Gasolina / 3 Diesel / 0 Sair" );
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite 1 para litros ou 2 para valor");
                    modo = teclado.nextInt();
                    System.out.println("Digite quanto");
                    valor = teclado.nextDouble();

                    b1.iniciarAbastecimento();
                    if (modo == 1){
                        b1.abastecerPorLitros(valor);
                    }
                    else{
                        b1.abastecerPorValor(valor);
                    }
                    b1.concluirAbastecimento();
                    break;
                case 2:
                    /* replicar a logica para b2 */
                    break;
                case 3:
                    /* replicar a logica para b3 */
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        } while (opcao != 0);
        
    }
}