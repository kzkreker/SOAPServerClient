
package com.example.maven.jaxws.personservice.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.example.maven.jaxws.personservice.mapping.Person;

@XmlRootElement(name = "getAllPersonsResponse", namespace = "http://personservice.jaxws.maven.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllPersonsResponse", namespace = "http://personservice.jaxws.maven.example.com/")
public class GetAllPersonsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Person> _return;

    /**
     * 
     * @return
     *     returns List<Person>
     */
    public List<Person> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Person> _return) {
        this._return = _return;
    }

}
