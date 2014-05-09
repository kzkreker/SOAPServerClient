/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 package com.example.maven.jaxws.personclient;

import com.example.maven.jaxws.personclient.soap.Person;
import com.example.maven.jaxws.personclient.soap.PersonSOAP;
import com.example.maven.jaxws.personclient.soap.PersonSOAPService;
import java.util.List;
 
public class PersonClient {
    public static void main(String[] args) {
            
        PersonSOAPService service = new PersonSOAPService();
        PersonSOAP port= service.getPersonSOAPPort();
        long ter;
        //добавляем нового сотрудника
        
        ter = port.addPerson(null,"Gaponov",22);
        System.out.println("New Person ID:"+ Long.toString(ter));       
        ter = port.addPerson("Bedash","Dmitry",23);
        System.out.println("New Person ID:"+ Long.toString(ter));
        ter = port.addPerson("Prus","Vitaly",23);
        System.out.println("New Person ID:"+ Long.toString(ter));
        ter = port.addPerson("Volkov","Konstantin",23);
        System.out.println("New Person ID:"+ Long.toString(ter));
        ter = port.addPerson("Semenov","Sergry",23);
        System.out.println("New Person ID:"+ Long.toString(ter));
        
        //извлекаем сотрудника по ID
        Person person = port.returnPersonById(8);
        System.out.println(person.getFirstName()+ " "+person.getLastName());
        
        //обновляем сотрудника
        try{
            boolean  resoult = port.updatePerson(null, "Petr", 40, 8);
            System.out.println("Updated:"+ Boolean.toString(resoult));
         }
        catch (Exception e) {
            e.printStackTrace();
        }
        //извлекаем сотрудника по ID
        person = port.returnPersonById(8);
        System.out.println(person.getFirstName()+ " "+person.getLastName());
        
        //удаляем сотрудника по ID
        //resoult = port.deletePersonById(3);
        //System.out.println("Delete:"+ Boolean.toString(resoult));
        
        //возврашаем список пользователей
        List<Person> persons = port.getAllPersons();
        for (Person item : persons){
            System.out.println(item.getId()+ " " + item.getFirstName()+ " "+item.getLastName()); 
        }
    }
}