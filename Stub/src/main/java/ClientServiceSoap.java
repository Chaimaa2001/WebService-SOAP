import stub.EtudiantWService;
import stub.ServiceWeb;
import stub.Student;

import java.util.List;

public class ClientServiceSoap {
    public static void main(String[] args) {
        EtudiantWService wsdl=new ServiceWeb().getEtudiantWServicePort();
        List<Student>liste=wsdl.listStudents();
        liste.forEach(
                elm->{
                    System.out.println(elm.getNom()+"-----------"+elm.getPrenom());
                }
        );
    }
}
