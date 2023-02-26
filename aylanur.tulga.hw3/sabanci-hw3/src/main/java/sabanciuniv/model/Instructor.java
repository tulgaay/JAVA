package sabanciuniv.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instructorId;
    private String instructorName;
    private String address;
    private String phone;
    @OneToMany(mappedBy = "instructor")
    private List<Course> InstructorCourseList = new ArrayList<>();

    public Instructor(String instructorName, String address, String phone) {
        this.instructorName = instructorName;
        this.address = address;
        this.phone = phone;
    }

    public Instructor() {
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Course> getInstructorCourseList() {
        return InstructorCourseList;
    }

    public void setInstructorCourseList(List<Course> instructorCourseList) {
        InstructorCourseList = instructorCourseList;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", instructorName='" + instructorName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", InstructorCourseList=" + InstructorCourseList +
                '}';
    }
}
