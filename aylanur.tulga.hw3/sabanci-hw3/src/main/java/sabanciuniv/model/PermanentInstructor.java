package sabanciuniv.model;

import jakarta.persistence.Entity;

@Entity
public class PermanentInstructor extends Instructor{
    private long fixedSalary;

    public PermanentInstructor(String instructorName, String address, String phone, long fixedSalary) {
        super(instructorName, address, phone);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(long fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(){}

    public long getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(long fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                '}';
    }
}
