package sabanciuniv.model;

import jakarta.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{
    private long hourlySalary;

    public VisitingResearcher(String instructorName, String address, String phone, long hourlySalary) {
        super(instructorName, address, phone);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(long hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
    public VisitingResearcher(){}

    public long getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(long hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }
}
