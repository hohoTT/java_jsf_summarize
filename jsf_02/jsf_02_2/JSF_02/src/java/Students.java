import java.beans.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Students implements Serializable {

    private List<Student> students;
   
    public Students() {
    }

    public List<Student> getStudents() {
        students = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            int age = (int) (Math.random()*10 + 10);
            student.setName("name" + age);
            student.setAge(age);
            students.add(student);
        }
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
