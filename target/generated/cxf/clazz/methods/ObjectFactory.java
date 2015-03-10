
package clazz.methods;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clazz.methods package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarLivrosPorAutorResponse_QNAME = new QName("http://methods.clazz/", "listarLivrosPorAutorResponse");
    private final static QName _ListarLivrosPorAutor_QNAME = new QName("http://methods.clazz/", "listarLivrosPorAutor");
    private final static QName _ListarLivrosResponse_QNAME = new QName("http://methods.clazz/", "listarLivrosResponse");
    private final static QName _ListarLivros_QNAME = new QName("http://methods.clazz/", "listarLivros");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clazz.methods
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link ListarLivros }
     * 
     */
    public ListarLivros createListarLivros() {
        return new ListarLivros();
    }

    /**
     * Create an instance of {@link ListarLivrosResponse }
     * 
     */
    public ListarLivrosResponse createListarLivrosResponse() {
        return new ListarLivrosResponse();
    }

    /**
     * Create an instance of {@link ListarLivrosPorAutor }
     * 
     */
    public ListarLivrosPorAutor createListarLivrosPorAutor() {
        return new ListarLivrosPorAutor();
    }

    /**
     * Create an instance of {@link ListarLivrosPorAutorResponse }
     * 
     */
    public ListarLivrosPorAutorResponse createListarLivrosPorAutorResponse() {
        return new ListarLivrosPorAutorResponse();
    }

    /**
     * Create an instance of {@link Livro.Autores }
     * 
     */
    public Livro.Autores createLivroAutores() {
        return new Livro.Autores();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivrosPorAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://methods.clazz/", name = "listarLivrosPorAutorResponse")
    public JAXBElement<ListarLivrosPorAutorResponse> createListarLivrosPorAutorResponse(ListarLivrosPorAutorResponse value) {
        return new JAXBElement<ListarLivrosPorAutorResponse>(_ListarLivrosPorAutorResponse_QNAME, ListarLivrosPorAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivrosPorAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://methods.clazz/", name = "listarLivrosPorAutor")
    public JAXBElement<ListarLivrosPorAutor> createListarLivrosPorAutor(ListarLivrosPorAutor value) {
        return new JAXBElement<ListarLivrosPorAutor>(_ListarLivrosPorAutor_QNAME, ListarLivrosPorAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://methods.clazz/", name = "listarLivrosResponse")
    public JAXBElement<ListarLivrosResponse> createListarLivrosResponse(ListarLivrosResponse value) {
        return new JAXBElement<ListarLivrosResponse>(_ListarLivrosResponse_QNAME, ListarLivrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://methods.clazz/", name = "listarLivros")
    public JAXBElement<ListarLivros> createListarLivros(ListarLivros value) {
        return new JAXBElement<ListarLivros>(_ListarLivros_QNAME, ListarLivros.class, null, value);
    }

}
