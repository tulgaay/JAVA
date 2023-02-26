package sabanciuniv.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseCode;
    private String name;
    private String creditScore;
    @ManyToOne
    private Instructor instructor;

    @Override
    public String toString() {
        return "Course{" +
                "courseCode=" + courseCode +
                ", name='" + name + '\'' +
                ", creditScore='" + creditScore + '\'' +
                ", instructor=" + instructor +
                ", StudentList=" + StudentList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;

        if (courseCode != course.courseCode) return false;
        if (!Objects.equals(name, course.name)) return false;
        if (!Objects.equals(creditScore, course.creditScore)) return false;
        if (!Objects.equals(instructor, course.instructor)) return false;
        return Objects.equals(StudentList, course.StudentList);
    }

    @Override
    public int hashCode() {
        int result = courseCode;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (creditScore != null ? creditScore.hashCode() : 0);
        result = 31 * result + (instructor != null ? instructor.hashCode() : 0);
        result = 31 * result + (StudentList != null ? StudentList.hashCode() : 0);
        return result;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;
    }

    public Course() {
    }

    public Course(String name, String creditScore) {
        this.name = name;
        this.creditScore = creditScore;
    }

    @ManyToMany(mappedBy = "CourseList")
    private List<Student> StudentList = new ArrayList<>();



}
