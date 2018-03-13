import java.util.*;

public class Week4Task3and4{

    public static class Student implements Comparable<Student>{
        String name;
        double mark;
        Student(String name, double mark){
            this.name = name;
            this.mark = mark;
        }
        public int compareTo(Student s){
            if (this.mark == s.mark) {
                return this.name.compareTo(s.name);
            } else {
                return  (s.mark - this.mark) > 0 ? 1 : -1;
            }
        }
    }

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = scan.nextInt();
        // Declare a list of students
        List<Student> studentList = new ArrayList<Student>();
        // Input N students to studentList
        for(int i = 0; i < N; i++){
            System.out.print("Enter name and score for student " + (i+1) + ": ");
            studentList.add(new Student(scan.next(), scan.nextInt()));
        }
        scan.close();
        // Call the sorting method
        Collections.sort(studentList);
        // Output the sorted list
        System.out.println("Sorted list:");
        for(int i = 0; i < studentList.size(); i++){
            System.out.printf("%s %s\n", studentList.get(i).name, studentList.get(i).mark);
        }
    }

     
     
}
