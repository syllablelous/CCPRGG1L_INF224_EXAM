public class App {
    public static void main(String[] args) throws Exception {
        Student Russel = new Student();
        
        Russel.surname = "Rapi";
        Russel.firstName = "Russel Jerome";
        Russel.middleInitial = 'G';
        Russel.dateOfBirth = "11/27/2004";
        Russel.studentNumber = 2022104676;
        Russel.studentEmailAddress = "rapirg@students.national-u.edu.ph";
        Russel.iAmAwesome = true;
        Russel.sayMyStudentNumber();
        Russel.sayMyEmailAddress();
        Russel.amIAwesome();

    }
}
