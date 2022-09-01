import java.net.IDN;
import java.sql.SQLOutput;
import java.time.chrono.MinguoDate;
import java.util.HashSet;
import java.util.Set;
import java.util.function.LongToIntFunction;

public class StateUniversity {
    protected String name;
    protected String address;
    protected long phone;
    private Set <Student> students = new HashSet();
    private Set <Departament> departaments = new HashSet();

    public StateUniversity(String name, String address, long phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    protected Student addStudent(String name, int ID) {
        Student newStudent = new Student (name, ID);
        students.add(newStudent);

        return newStudent;
    }

    protected void removeStudent(Student newStudent) {
        students.remove(newStudent);
    }

    protected void getStudent(Student newStudent) {
        System.out.println("ID: " + newStudent.studentID + "name: " + newStudent.name);
    }

    protected Departament addDepartament(String name, StateUniversity stateUniversity) {
        Departament newDepartament = new Departament(name);
        departaments.add(newDepartament);
        System.out.println("В университет " + stateUniversity.name + " был добавлен факультет " + newDepartament.name);
        return newDepartament;
    }

    protected void removeDepartament(Departament newDepartament) {
        departaments.remove(newDepartament);
    }

    protected void getDepartament(Departament newDepartament) {
        System.out.println("name: " + newDepartament.name);
    }

    protected void getAllDepartament(){
        for (Departament str: departaments){
            System.out.println(str.name);

    }


    }
}
