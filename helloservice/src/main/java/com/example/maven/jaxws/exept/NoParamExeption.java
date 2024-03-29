package com.example.maven.jaxws.exept;
import javax.xml.ws.WebFault;
@WebFault(faultBean = "com.example.maven.jaxws.exept.PersonServiceFaultBean")
public class NoParamExeption extends Exception {
    private static final long serialVersionUID = -6647544772732631047L;
    private final PersonServiceFault fault;
        
    public NoParamExeption(String message, PersonServiceFault fault) {
        super(message);
        this.fault = fault;
    }

    public NoParamExeption(String message, PersonServiceFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public PersonServiceFault getFaultInfo() {
        return fault;
    }
}
