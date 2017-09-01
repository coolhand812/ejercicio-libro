/**
 * Esta clase controla libros.
 * @Joe Diaz
 * @ version 1.0
 */
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numReferencia;
    private int prestamos;
    /**
     * Este es el constructor de la clase Libro.
     * @bkTitulo Referencia para titulo
     * @bkAutor Referencia para autor
     * @bkPages Referencia para paginas
     */
    public Libro(String bkTitulo, String bkAutor, int bkPages)
    {
        titulo = bkTitulo;
        autor = bkAutor;
        paginas = bkPages;
        numReferencia = " ";
        prestamos = 0;
    }

    /**
     * Este metodo regresa el nombre del autor.
     */
    String dimeAutor()
    {
        return autor;
    }
    
    /**
     * Este metodo regresa el nombre del titulo.
     */
    String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * Este metodo regresa el numero de paginas del libro.
     */
    int dimePaginas()
    {
        return paginas;
    }
    
    /**
     * Este metodo enseña los detalles del libro en la pantalla.
     */
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
        cadDetails += ", Prestamos: ";
        cadDetails += dimePrestamos();
        return cadDetails;
    }
    
    /**
     * Este metodo cambia el numero de referencia.
     * @nRef Es una variable que recibe el numero de referencia.
     */
    String cambiaNumRef(String nRef)
    {
        int counter = nRef.length();
        if(counter >= 3)
        {
            numReferencia = nRef;
        }
        return numReferencia;
    }
    
    /**
     * Este metodo regresa el numero de referencia.
     */
    String dimeNumRef()
    {
        return numReferencia;
    }
    
    /**
     * Este metodo maneja cuantas veces se ha prestado un libro.
     */
    void libPrestar()
    {
        prestamos+=1;
    }
    
    /**
     * Este metodo regresa el numero de veces que se ha prestado un libro.
     */
    int dimePrestamos()
    {
        return prestamos;
    }
}
