package cl.fonasa.soa.mensajes.cuentamedicainteroperable;

public class Run {

	public static void main(String[] args) {
		System.setProperty("javax.net.ssl.keyStore","C:/Users/mijao/Desktop/soaint_test.jks");
		System.setProperty("javax.net.ssl.keyStorePassword","");
		//System.setProperty("javax.net.ssl.trustStore","C:/Users/mijao/Desktop/soaint_test.jks");
	    /*System.setProperty("javax.net.ssl.trustStorePassword","changeit");
	    System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump","true");
	    System.setProperty("javax.net.ssl.keyStore","/home/john/yydats-keys.jks");
	    System.setProperty("javax.net.ssl.keyStorePassword","changeit");*/			
		
		// TODO Auto-generated method stub
		System.out.println("VAMOS 1");
		FONASAcuentaMedicaInteroperableSEC service = new FONASAcuentaMedicaInteroperableSEC();					
		
		System.out.println("VAMOS 2");
		CuentaMedicaInteroperablePtt client = service.getCuentaMedicaInteroperableBindQSPort();				
		
		System.out.println("VAMOS 3");
		MensajeHL7RequestType request = new MensajeHL7RequestType();
		System.out.println("VAMOS 4");
		request.setTramaDatos("p");
		
		System.out.println("VAMOS 5");
		MensajeHL7ResponseType response = client.cuentaMedicaInteroperable(request);		
						
		System.out.println("VAMOS 6");		
		System.out.println("RESPONSE: " + response.toString());
								
	}

}
