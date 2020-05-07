public class AppBiblioteca{
    public static void main(String args[]){
        Livro l1, l2, l3;

        l1 = new Livro("Java Basico","Isidro", 201, "Terror",1, 1);
        l2 = new Livro("Java Intermediario","Roberval", 2011,"Ficcao",1, 2);
        l3 = new Livro("Java Web","Adamastor");// ,2012,"Contos de fadas",1,3);

        System.out.println(l1.exibirInfo());
        //l1.titulo     = "Java Basico";
        /*l1.setTitulo("Java Basico");
        l1.setAutor("Isidro");
        l1.setCategoria("Terror");
        l1.setAno(1945);
        l1.setEstante(1);
        l1.setPrateleira(2);
        l1.setEmprestado(true);

        l2.setTitulo("");
        l2.setAutor("Isidro");
        l2.setCategoria("Suspense");
        l2.setAno(2011);
        l2.setEstante(2);
        l2.setPrateleira(3);
        l2.setEmprestado(false);

        l3.setTitulo("Java Avancado");
        l3.setAutor("Isidro");
        l3.setCategoria("Terror Gotico");
        l3.setAno(2012);
        l3.setEstante(1);
        l3.setPrateleira(4);
        l3.setEmprestado(false);
        */

        System.out.println(l1.exibirInfo());
        System.out.println(l2.exibirInfo());
        System.out.println(l3.exibirInfo());


        l1.consultarDisponibilidade();
        l2.consultarDisponibilidade();
        l3.consultarDisponibilidade();

        l1.emprestar();
        l2.emprestar();
        l3.emprestar();

        l1.devolver();
        l2.devolver();
        l3.devolver();



    }
}