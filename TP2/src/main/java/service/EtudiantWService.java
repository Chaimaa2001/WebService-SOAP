package service;

import entities.Student;
import enums.Genre;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "serviceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "listStudents")
    public List<Student>listEtudiants(){
        return List.of(
                new Student(1,"ET_Nom1","ET_PRENOM1", Genre.Homme),
                new Student(2,"ET_Nom2","ET_PRENOM2",Genre.Femme),
                new Student(3,"ET_Nom3","ET_PRENOM3",Genre.Homme)
        );
    }
}
