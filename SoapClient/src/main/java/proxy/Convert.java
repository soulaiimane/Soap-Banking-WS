
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour convert complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="convert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="montant" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convert", propOrder = {
    "montant"
})
public class Convert {

    protected Double montant;

    /**
     * Obtient la valeur de la propriété montant.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontant(Double value) {
        this.montant = value;
    }

}
