
package proxy;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="compte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="datecreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "datecreation",
    "solde"
})
public class Compte {

    protected int code;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datecreation;
    protected Double solde;

    /**
     * Obtient la valeur de la propri�t� code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * D�finit la valeur de la propri�t� code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propri�t� datecreation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatecreation() {
        return datecreation;
    }

    /**
     * D�finit la valeur de la propri�t� datecreation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatecreation(XMLGregorianCalendar value) {
        this.datecreation = value;
    }

    /**
     * Obtient la valeur de la propri�t� solde.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSolde() {
        return solde;
    }

    /**
     * D�finit la valeur de la propri�t� solde.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSolde(Double value) {
        this.solde = value;
    }

}
