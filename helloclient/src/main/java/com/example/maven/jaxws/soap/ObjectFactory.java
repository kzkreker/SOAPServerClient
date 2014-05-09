
package com.example.maven.jaxws.personclient.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.maven.jaxws.personclient.soap package. 
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

    private final static QName _AddPersonResponse_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "addPersonResponse");
    private final static QName _NoParamExeption_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "NoParamExeption");
    private final static QName _GetAllPersons_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "getAllPersons");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "updatePersonResponse");
    private final static QName _DeletePersonByIdResponse_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "deletePersonByIdResponse");
    private final static QName _ReturnPersonById_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "returnPersonById");
    private final static QName _GetAllPersonsResponse_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "getAllPersonsResponse");
    private final static QName _ReturnPersonByIdResponse_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "returnPersonByIdResponse");
    private final static QName _AddPerson_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "addPerson");
    private final static QName _UpdatePerson_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "updatePerson");
    private final static QName _DeletePersonById_QNAME = new QName("http://personservice.jaxws.maven.example.com/", "deletePersonById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.maven.jaxws.personclient.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonServiceFault }
     * 
     */
    public PersonServiceFault createPersonServiceFault() {
        return new PersonServiceFault();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetAllPersons }
     * 
     */
    public GetAllPersons createGetAllPersons() {
        return new GetAllPersons();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link GetAllPersonsResponse }
     * 
     */
    public GetAllPersonsResponse createGetAllPersonsResponse() {
        return new GetAllPersonsResponse();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonById }
     * 
     */
    public DeletePersonById createDeletePersonById() {
        return new DeletePersonById();
    }

    /**
     * Create an instance of {@link DeletePersonByIdResponse }
     * 
     */
    public DeletePersonByIdResponse createDeletePersonByIdResponse() {
        return new DeletePersonByIdResponse();
    }

    /**
     * Create an instance of {@link ReturnPersonByIdResponse }
     * 
     */
    public ReturnPersonByIdResponse createReturnPersonByIdResponse() {
        return new ReturnPersonByIdResponse();
    }

    /**
     * Create an instance of {@link ReturnPersonById }
     * 
     */
    public ReturnPersonById createReturnPersonById() {
        return new ReturnPersonById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "NoParamExeption")
    public JAXBElement<PersonServiceFault> createNoParamExeption(PersonServiceFault value) {
        return new JAXBElement<PersonServiceFault>(_NoParamExeption_QNAME, PersonServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "getAllPersons")
    public JAXBElement<GetAllPersons> createGetAllPersons(GetAllPersons value) {
        return new JAXBElement<GetAllPersons>(_GetAllPersons_QNAME, GetAllPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "deletePersonByIdResponse")
    public JAXBElement<DeletePersonByIdResponse> createDeletePersonByIdResponse(DeletePersonByIdResponse value) {
        return new JAXBElement<DeletePersonByIdResponse>(_DeletePersonByIdResponse_QNAME, DeletePersonByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "returnPersonById")
    public JAXBElement<ReturnPersonById> createReturnPersonById(ReturnPersonById value) {
        return new JAXBElement<ReturnPersonById>(_ReturnPersonById_QNAME, ReturnPersonById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "getAllPersonsResponse")
    public JAXBElement<GetAllPersonsResponse> createGetAllPersonsResponse(GetAllPersonsResponse value) {
        return new JAXBElement<GetAllPersonsResponse>(_GetAllPersonsResponse_QNAME, GetAllPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "returnPersonByIdResponse")
    public JAXBElement<ReturnPersonByIdResponse> createReturnPersonByIdResponse(ReturnPersonByIdResponse value) {
        return new JAXBElement<ReturnPersonByIdResponse>(_ReturnPersonByIdResponse_QNAME, ReturnPersonByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personservice.jaxws.maven.example.com/", name = "deletePersonById")
    public JAXBElement<DeletePersonById> createDeletePersonById(DeletePersonById value) {
        return new JAXBElement<DeletePersonById>(_DeletePersonById_QNAME, DeletePersonById.class, null, value);
    }

}
