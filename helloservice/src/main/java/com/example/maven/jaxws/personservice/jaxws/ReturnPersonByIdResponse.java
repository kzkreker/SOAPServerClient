
package com.example.maven.jaxws.personservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.example.maven.jaxws.personservice.mapping.Person;

@XmlRootElement(name = "returnPersonByIdResponse", namespace = "http://personservice.jaxws.maven.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnPersonByIdResponse", namespace = "http://personservice.jaxws.maven.example.com/")
public class ReturnPersonByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private Person _return;

    /**
     * 
     * @return
     *     returns Person
     */
    public Person getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Person _return) {
        this._return = _return;
    }

}
