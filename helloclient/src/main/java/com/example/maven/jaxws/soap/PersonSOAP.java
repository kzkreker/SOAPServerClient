
package com.example.maven.jaxws.personclient.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PersonSOAP", targetNamespace = "http://personservice.jaxws.maven.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonSOAP {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws NoParamExeption
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.UpdatePersonResponse")
    public boolean updatePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        long arg3)
        throws NoParamExeption
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.maven.jaxws.personclient.soap.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "returnPersonById", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.ReturnPersonById")
    @ResponseWrapper(localName = "returnPersonByIdResponse", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.ReturnPersonByIdResponse")
    public Person returnPersonById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePersonById", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.DeletePersonById")
    @ResponseWrapper(localName = "deletePersonByIdResponse", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.DeletePersonByIdResponse")
    public boolean deletePersonById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.example.maven.jaxws.personclient.soap.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPersons", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.GetAllPersons")
    @ResponseWrapper(localName = "getAllPersonsResponse", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.GetAllPersonsResponse")
    public List<Person> getAllPersons();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://personservice.jaxws.maven.example.com/", className = "com.example.maven.jaxws.personclient.soap.AddPersonResponse")
    public long addPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
