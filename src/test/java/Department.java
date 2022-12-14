import java.util.HashSet;
import java.util.Set;

public class Department {

    protected String name;

    private final Set<Instructor> instructors = new HashSet();

    public Department(String name) {
        this.name = name;
    }

    protected Instructor addInstructor(String name) {
        Instructor instructor = new Instructor(name);
        return instructor;
    }

    protected void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);
    }

    protected void getInstructor(Instructor instructor) {
        System.out.println("name :" + instructor.name);
    }

    protected void getAllInstructor() {
        for (Instructor instr : instructors) {
            System.out.println(instr.name);
        }
    }
}
