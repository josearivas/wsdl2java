
package cl.fonasa.soa.mensajes.cuentamedicainteroperable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mensajeHL7ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mensajeHL7ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tramaDatos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensajeHL7ResponseType", propOrder = {
    "tramaDatos"
})
public class MensajeHL7ResponseType {

    @XmlElement(required = true)
    protected String tramaDatos;

    /**
     * Gets the value of the tramaDatos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramaDatos() {
        return tramaDatos;
    }

    /**
     * Sets the value of the tramaDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramaDatos(String value) {
        this.tramaDatos = value;
    }

}
