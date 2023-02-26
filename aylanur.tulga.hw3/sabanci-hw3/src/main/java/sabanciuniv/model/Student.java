package sabanciuniv.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private String birtday;

    public Student(String name, String birtday, String address, String gender) {
        this.name = name;
        this.birtday = birtday;
        this.address = address;
        this.gender = gender;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", birtday='" + birtday + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", CourseList=" + CourseList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (studentId != student.studentId) return false;
        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(birtday, student.birtday)) return false;
        if (!Objects.equals(address, student.address)) return false;
        if (!Objects.equals(gender, student.gender)) return false;
        return Objects.equals(CourseList, student.CourseList);
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (birtday != null ? birtday.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (CourseList != null ? CourseList.hashCode() : 0);
        return result;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(List<Course> courseList) {
        CourseList = courseList;
    }



    private String address;
    private String gender;

@ManyToMany
    private List<Course> CourseList = new ArrayList<>();


}
