
package cl.fonasa.soa.mensajes.cuentamedicainteroperable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.fonasa.soa.mensajes.cuentamedicainteroperable package. 
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

    private final static QName _MensajeHL7Response_QNAME = new QName("http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable", "mensajeHL7Response");
    private final static QName _MensajeHL7Request_QNAME = new QName("http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable", "mensajeHL7Request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.fonasa.soa.mensajes.cuentamedicainteroperable
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MensajeHL7ResponseType }
     * 
     */
    public MensajeHL7ResponseType createMensajeHL7ResponseType() {
        return new MensajeHL7ResponseType();
    }

    /**
     * Create an instance of {@link MensajeHL7RequestType }
     * 
     */
    public MensajeHL7RequestType createMensajeHL7RequestType() {
        return new MensajeHL7RequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeHL7ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable", name = "mensajeHL7Response")
    public JAXBElement<MensajeHL7ResponseType> createMensajeHL7Response(MensajeHL7ResponseType value) {
        return new JAXBElement<MensajeHL7ResponseType>(_MensajeHL7Response_QNAME, MensajeHL7ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeHL7RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable", name = "mensajeHL7Request")
    public JAXBElement<MensajeHL7RequestType> createMensajeHL7Request(MensajeHL7RequestType value) {
        return new JAXBElement<MensajeHL7RequestType>(_MensajeHL7Request_QNAME, MensajeHL7RequestType.class, null, value);
    }

}
