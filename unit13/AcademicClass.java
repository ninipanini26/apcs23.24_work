import java.util.*;
public class AcademicClass{
    private static ArrayList<Student> comSciClass;
    private static Teacher drkessner; 
    
    public AcademicClass(){
       comSciClass = new ArrayList<Student>();
    }
    
    public void setTeacher(String name, String subject){
        drkessner = new Teacher("Dr Kessner", "Computer Science");
    }

    public void addStudent(String name, int favNumber){
        Student student = new Student(name, favNumber);
        comSciClass.add(student);
    }
    
    public ArrayList<String> classInfo(){
        ArrayList<String> classInfo = new ArrayList<>();
        for(Student student: comSciClass){
            classInfo.add(student.getName());
        }
        classInfo.add(drkessner.getName());
        classInfo.add(drkessner.getSubject());
        return classInfo;
    }
    
    public ArrayList <String> favNumberSimilar(int n){
        ArrayList<String> favNumberSimilar = new ArrayList<>();
        for(Student student: comSciClass){
            if(student.getFavNumber() == n){
                favNumberSimilar.add(student.getName());
            }
        }return favNumberSimilar;
    }
    
    public ArrayList<String> oddNumber(){
        ArrayList <String> oddNumber = new ArrayList<>();
        for(Student student: comSciClass){
            if(student.getFavNumber() %2 != 0){
                oddNumber.add(student.getName());
            }
        }return oddNumber;
    }
      public static void main(String[] args){
        AcademicClass academicClass = new AcademicClass();
academicClass.addStudent("Nina", 4);
        academicClass.addStudent("Nola", 4);
        academicClass.addStudent("Mia", 6);
        academicClass.addStudent("Jane", 7);
        academicClass.addStudent("Wynter", 8);
        academicClass.setTeacher("Dr Kessner", "Computer Science");
           System.out.println(academicClass.classInfo());
          System.out.println(academicClass.favNumberSimilar(4));
           System.out.println(academicClass.oddNumber());
      }
}

    
    
