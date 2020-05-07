public class Livro{
    private String  titulo;
    private String  autor;
    private int     ano;
    private String  categoria;
    private int     estante;
    private int     prateleira;
    private boolean emprestado;

    // construtor
    public Livro(String ti, String au, int an, String ca, int es, int pr){
        titulo     = ti;
        autor      = au;
        ano        = an;
        categoria  = ca;
        estante    = es;
        prateleira = pr;
        emprestado = false;
    }
    
    // get = pegar/obter
    // set = atribuir/modificar/imputar valor

    public void setTitulo(String novoTitulo){
        // fazer alguma validacao
        if (novoTitulo.length() == 0 || novoTitulo == null){
            System.out.println("Erro = seu livro deve ter titulo");
            titulo = "*** sem titulo *** ";
        }
        else {
           titulo = novoTitulo;
        }
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String novoAutor){
        autor = novoAutor;
    }
    public String getAutor(){
        return autor;
    }

    public void setAno(int novoAno){
        if (novoAno < 1950){
            System.out.println("Erro - ano deve ser superior a 1950");
            ano = 1950;
        }
        else{
           ano = novoAno;
        }
    }
    public int getAno(){
        return ano;
    }

    public void setCategoria(String novacategoria){
        categoria = novacategoria;
    }
    public String getCategoria(){
        return categoria;
    }

    public void setEstante(int novaEstante){
        estante = novaEstante;
    }
    public int getEstante(){
        return estante;
    }

    public void setPrateleira(int novaprateleira){
        prateleira = novaprateleira;
    }
    public int getPrateleira(){
        return prateleira;
    }

    // dispensavel pq ja temos metodos pra isso, mas vou fazer mesmo assim
    public void setEmprestado(boolean novoemprestado){
        emprestado = novoemprestado;
    }
    // olha o detalhe!!! aqui para BOOLEAN o padrao é comçar com IS
    public boolean isEmprestado(){
        return emprestado;
    }

    void emprestar(){
        if (emprestado){
            System.out.println("Livro "+titulo+" Indisponivel para emprestimo");
        }
        else{
            emprestado = true;
            System.out.println("O livro "+titulo+" foi emprestado");            
        }
    }

    void devolver(){
        emprestado = false;
        System.out.println("Livro "+titulo+" devolvido com sucesso");
    }

    void consultarDisponibilidade(){
        if (emprestado){
            System.out.println("Livro "+titulo+" EMPRESTADO");
        }
        else{
            System.out.println("Livro "+titulo+" DISPONIVEL");
        }
    }

    String exibirInfo(){
        return titulo+ "("+autor+")/"+ano+"  P("+estante+","+prateleira+")";
    }

}