
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numReferencia;
    
    public Libro(String bkTitulo, String bkAutor, int bkPages)
    {
        titulo = bkTitulo;
        autor = bkAutor;
        paginas = bkPages;
        numReferencia = "";
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
        String cadDetails = " ";
        cadDetails += "Titulo: ";
        cadDetails += dimeTitulo();
        cadDetails += ", Autor: ";
        cadDetails += dimeAutor();
        cadDetails += ", Paginas: ";
        cadDetails += dimePaginas();
        int counter = numReferencia.length();
        if(counter > 0)
        {
            cadDetails += ", num de ref: ";
            cadDetails += dimeNumRef();
        }
        else
            cadDetails += ", num de ref: ";
            cadDetails += "ZZZ";
        return cadDetails;
    }
    
    String cambiaNumRef(String nRef)
    {
        numReferencia = nRef;
        return numReferencia;
    }
    
    String dimeNumRef()
    {
        return numReferencia;
    }
}
