public class Main {
    public static void main(String[] args) {

        StateUniversity BSU = new StateUniversity("BSU", "Pushkina 2b", 532321);
        Departament dep = BSU.addDepartament("Институт инженерных технологий", BSU);
        Departament dep1 = BSU.addDepartament("Факультет Автоматизации", BSU);
        Departament dep2 = BSU.addDepartament("Факультет Ручника", BSU);
        Departament dep3 = BSU.addDepartament("Факультет Гибрида", BSU);
        BSU.getAllDepartament();
        BSU.removeDepartament(dep3);
        Instructor SS = dep.addInstructor("Инструктор");
        dep.getInstructor(SS);
        }

    }
