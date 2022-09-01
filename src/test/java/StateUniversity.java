import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StateUniversity {

    protected String name;

    protected String address;

    protected long phone;

    private ArrayList<Student> students = new ArrayList<>();

    private ArrayList<Department> departaments = new ArrayList<>();

    public StateUniversity(String name, String address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    protected Student addStudent(String name, int ID) {
        Student newStudent = new Student(name, ID);
        students.add(newStudent);
        return newStudent;
    }

    protected void removeStudent(Student newStudent) {
        students.remove(newStudent);
    }

    protected void getStudent(Student newStudent) {
        System.out.println("ID: " + newStudent.studentID + "name: " + newStudent.name);
    }

    protected Department addDepartament(String name, StateUniversity stateUniversity) {
        Department newDepartament = new Department(name);
        departaments.add(newDepartament);
        System.out.println("В университет " + stateUniversity.name + " был добавлен факультет " + newDepartament.name);
        return newDepartament;
    }

    protected void removeDepartament(Department newDepartament) {
        departaments.remove(newDepartament);
    }

    protected void getDepartament(Department newDepartament) {
        System.out.println("name: " + newDepartament.name);
    }

    protected void getAllDepartament() {
        for (Department str : departaments) {
            System.out.println(str.name);
        }
    }
}
