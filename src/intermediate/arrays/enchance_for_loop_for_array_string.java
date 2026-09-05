package intermediate.arrays;

public class enchance_for_loop_for_array_string {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "Honey";
        s1.rollno = 21;
        s1.marks = 76;

        Student s2 = new Student();
        s2.rollno = 22;
        s2.name = "Honvith";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno = 23;
        s3.name = "Gundu";
        s3.marks = 95;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

       System.out.println("no"+" "+"name"+" "+"marks");
       System.out.println("￬"+ "    "+"￬"+"    "+"￬");
        for(Student stud : students){
            System.out.println(stud.rollno + " " + stud.name + ":" + stud.marks);
        }
    }
}
