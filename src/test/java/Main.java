import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StateUniversity bsu = new StateUniversity("BSU", "Pushkina 2b", 532321);
        Department dep = bsu.addDepartament("Институт инженерных технологий", bsu);
        Department dep1 = bsu.addDepartament("Факультет Автоматизации", bsu);
        Department dep2 = bsu.addDepartament("Факультет Ручника", bsu);
        Department dep3 = bsu.addDepartament("Факультет Гибрида", bsu);
        bsu.getAllDepartament();
        bsu.removeDepartament(dep3);
        Instructor instructor = dep.addInstructor("Инструктор");
        dep.getInstructor(instructor);
        Scanner console = new Scanner(System.in);
        System.out.println("Введите департамент");
        String departmentName = console.nextLine();
        Department newDepartment = bsu.addDepartament(departmentName, bsu);
        bsu.getDepartament(newDepartment);
    }
}
