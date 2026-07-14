public class StoreDataInVariables {
    public static void main(String[] args) {
        // Storing different types of data in variables
        String studentName = "Alice Smith";
        int studentAge = 20;
        char studentGrade = 'A';
        double gpa = 3.85;
        boolean isEnrolled = true;

        System.out.println("=== Student Data Stored in Variables ===");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);
        System.out.println("GPA: " + gpa);
        System.out.println("Currently Enrolled: " + isEnrolled);
        
        // Modifying stored data
        gpa = 3.95;
        System.out.println("Updated GPA: " + gpa);
    }
}
