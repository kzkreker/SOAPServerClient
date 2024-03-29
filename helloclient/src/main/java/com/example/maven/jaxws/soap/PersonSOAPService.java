
package com.example.maven.jaxws.personclient.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PersonSOAPService", targetNamespace = "http://personservice.jaxws.maven.example.com/", wsdlLocation = "http://localhost:34215/helloservice/PersonSOAPService?wsdl")
public class PersonSOAPService
    extends Service
{

    private final static URL PERSONSOAPSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.example.maven.jaxws.personclient.soap.PersonSOAPService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.example.maven.jaxws.personclient.soap.PersonSOAPService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:34215/helloservice/PersonSOAPService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:34215/helloservice/PersonSOAPService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PERSONSOAPSERVICE_WSDL_LOCATION = url;
    }

    public PersonSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonSOAPService() {
        super(PERSONSOAPSERVICE_WSDL_LOCATION, new QName("http://personservice.jaxws.maven.example.com/", "PersonSOAPService"));
    }

    /**
     * 
     * @return
     *     returns PersonSOAP
     */
    @WebEndpoint(name = "PersonSOAPPort")
    public PersonSOAP getPersonSOAPPort() {
        return super.getPort(new QName("http://personservice.jaxws.maven.example.com/", "PersonSOAPPort"), PersonSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonSOAP
     */
    @WebEndpoint(name = "PersonSOAPPort")
    public PersonSOAP getPersonSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://personservice.jaxws.maven.example.com/", "PersonSOAPPort"), PersonSOAP.class, features);
    }

}
