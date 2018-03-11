package cl.fonasa.soa.mensajes.cuentamedicainteroperable;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2018-03-09T12:42:07.175-04:00
 * Generated source version: 2.7.16
 * 
 */
@WebService(targetNamespace = "http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable", name = "cuentaMedicaInteroperable_ptt")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CuentaMedicaInteroperablePtt {

    @WebMethod(action = "http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable")
    @WebResult(name = "mensajeHL7Response", targetNamespace = "http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable", partName = "parameters")
    public MensajeHL7ResponseType cuentaMedicaInteroperable(
        @WebParam(partName = "parameters", name = "mensajeHL7Request", targetNamespace = "http://soa.fonasa.cl/mensajes/cuentaMedicaInteroperable")
        MensajeHL7RequestType parameters
    );
}