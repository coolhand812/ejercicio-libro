
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String bkTitulo, String bkAutor, int bkPages)
    {
        titulo = bkTitulo;
        autor = bkAutor;
        paginas = bkPages;
    }

    String dimeAutor()
    {
        return autor;
    }
    
    String dimeTitulo()
    {
        return titulo;
    }
    
    int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
        String cadDetails = "Titulo: ";
        cadDetails += dimeTitulo();
        cadDetails += ", Autor: ";
        cadDetails += dimeAutor();
        cadDetails += ", Paginas: ";
        cadDetails += dimePaginas();
        return cadDetails;
    }
}
