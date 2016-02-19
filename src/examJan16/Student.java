package examJan16;

public class Student {

    public static final int GRADE_COUNT = 4;

    public String name;
    public int[] grades;


    public Student(String name){
        this.name = name;
        grades = new int[GRADE_COUNT];
    }

    public void setGrade(int gradeIndex, int grade){
        this.grades[gradeIndex] = grade;
    }


    public String toString() {

        //return "{"+this.name+": ["+this.grades[0]+","+this.grades[1]+","+this.grades[2]+","+this.grades[3]+"]}";

        StringBuilder sb = new StringBuilder("{");

        sb.append(this.name + ": [");

        for (int pos = 0; pos < this.grades.length; pos++) {

            if (pos == this.grades.length - 1) {
                sb.append(this.grades[pos] + "]}");
            } else {
                sb.append(this.grades[pos] + ", ");
            }

        }

        return sb.toString();
    }

    public double averageGrade(){
        double a= this.grades[0]+this.grades[1]+this.grades[2]+this.grades[3];
        double f= a/(this.grades.length);
        return f;

    }



    public static void main(String args[]){

        Student student = new Student("Anna Ericsson");

        student.setGrade(0,3);
        student.setGrade(1,4);
        student.setGrade(2,5);
        student.setGrade(3,5);


        System.out.println(student);
        System.out.println(student.averageGrade());
    }
}
