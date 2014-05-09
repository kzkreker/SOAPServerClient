package  com.example.maven.jaxws.personservice; 

import com.example.maven.jaxws.dao.PostgresDAO;
import com.example.maven.jaxws.exept.PersonServiceFault;
import com.example.maven.jaxws.exept.NoParamExeption;
import com.example.maven.jaxws.personservice.mapping.Person;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService  
public class PersonSOAP  {
   /*
    * Данная функция добовляет пользователя
    */  
    
    @WebMethod(operationName = "addPerson")
    public long addPerson(String FirstName, String LastName, int Age) {
        long personId;
        try {
            PostgresDAO dao = new  PostgresDAO();
            return dao.addPerson(FirstName, LastName, Age);
       }
       catch (Exception e){
           return 0;
       }

    }
    /*
    * Данная функция обновляет пользователя по его идентификатору
    */
    @WebMethod(operationName = "updatePerson")
    public boolean updatePerson(String FirstName, String LastName, int Age, long Person_Id) throws NoParamExeption {
           if (FirstName==null || FirstName.trim().isEmpty()){
            PersonServiceFault fault = PersonServiceFault.defaultInstance();
            throw new NoParamExeption("personName is not specified", fault);           
           }
            PostgresDAO dao = new  PostgresDAO();
            return dao.updatePerson(FirstName, LastName, Age, Person_Id);
    }
   /*
    * Данная функция возвращает пользователя по его идентификатору
    */
    @WebMethod(operationName = "returnPersonById")
    public Person returnPersonById(long Person_Id) {
        try {      
            PostgresDAO dao = new  PostgresDAO();
            return dao.returnPersonById(Person_Id);
       }
       catch (Exception e) {
           return null;
       }
    }        
   /*
    * Данная функция удаляет пользователя по его идентификатору
    */
    @WebMethod(operationName = "deletePersonById")
    public boolean deletePersonById(long Person_Id) {
        try {
            PostgresDAO dao = new  PostgresDAO();
            return dao.deletePersonById(Person_Id);       
       }
       catch (Exception e){
           return false;
       }
    }
    /*
    * Данная функция возвращает всех пользователей
    */    
    @WebMethod(operationName = "getAllPersons")
    public List<Person> getAllPersons() {
        try {
            System.out.println("Whe are here!!!");
            PostgresDAO dao = new  PostgresDAO();
            return dao.getAllPerson();       
       }
       catch (Exception e){
           System.out.println("Or Whe are here!!!");
           return null;
       }
    }
}