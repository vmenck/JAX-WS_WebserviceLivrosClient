
package clazz.methods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for livro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="livro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="editora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoPublicacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livro", propOrder = {
    "nome",
    "autores",
    "editora",
    "anoPublicacao",
    "resumo"
})
public class Livro {

    protected String nome;
    protected Livro.Autores autores;
    protected String editora;
    protected Integer anoPublicacao;
    protected String resumo;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the autores property.
     * 
     * @return
     *     possible object is
     *     {@link Livro.Autores }
     *     
     */
    public Livro.Autores getAutores() {
        return autores;
    }

    /**
     * Sets the value of the autores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Livro.Autores }
     *     
     */
    public void setAutores(Livro.Autores value) {
        this.autores = value;
    }

    /**
     * Gets the value of the editora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Sets the value of the editora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditora(String value) {
        this.editora = value;
    }

    /**
     * Gets the value of the anoPublicacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * Sets the value of the anoPublicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnoPublicacao(Integer value) {
        this.anoPublicacao = value;
    }

    /**
     * Gets the value of the resumo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * Sets the value of the resumo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumo(String value) {
        this.resumo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "autor"
    })
    public static class Autores {

        protected List<String> autor;

        /**
         * Gets the value of the autor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAutor() {
            if (autor == null) {
                autor = new ArrayList<String>();
            }
            return this.autor;
        }

    }

}
