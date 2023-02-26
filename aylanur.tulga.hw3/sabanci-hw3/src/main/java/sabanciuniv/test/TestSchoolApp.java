package sabanciuniv.test;


import jakarta.persistence.EntityManager;
import sabanciuniv.model.*;
import sabanciuniv.utility.EntityManagerUtils;

public class TestSchoolApp {
    public static void main(String[] args) {
        saveTestData();
    }

    private static void saveTestData() {
        Student student1 = new Student("Koray Guney", "05.06.1988", "Maslak/Istanbul", "M");
        Student student2 = new Student("Ali Veli", "24.02.1996", "Besiktas/Istanbul", "M");
        Student student3 = new Student("Ayse Simsek", "15.09.2000", "Kadikoy/Istanbul", "F");

        Instructor visitingResearcher1 = new VisitingResearcher("Koray Guney","Altunizade/Istanbul", "5346789898", 500);
        Instructor visitingResearcher2 = new VisitingResearcher("Ahmet Demirel","Tuzla/Istanbul", "5346789045", 500);
        Instructor permanentInstructor1 = new PermanentInstructor("Ali Gul","Sisli/Istanbul", "5327889045", 25000);

        Course course1= new Course("Matematik","4");
        Course course2 = new Course("Fizik","4");
        Course course3 = new Course("Edebiyat","5");

        course1.setInstructor(visitingResearcher1);
        course2.setInstructor(visitingResearcher1);
        course3.setInstructor(permanentInstructor1);

        student1.getCourseList().add(course1);
        student1.getCourseList().add(course2);
        student1.getCourseList().add(course3);
        student2.getCourseList().add(course2);
        student2.getCourseList().add(course3);
        student3.getCourseList().add(course1);
        student3.getCourseList().add(course2);



        visitingResearcher1.getInstructorCourseList().add(course1);
        visitingResearcher2.getInstructorCourseList().add(course2);
        permanentInstructor1.getInstructorCourseList().add(course3);

        EntityManager entityManager = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student1);
            entityManager.persist(student3);
            entityManager.persist(student3);

            entityManager.persist(visitingResearcher1);
            entityManager.persist(visitingResearcher2);

            entityManager.persist(course1);
            entityManager.persist(course2);
            entityManager.persist(course3);






            entityManager.getTransaction().commit();
            System.out.println("All data persisted!...");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(entityManager);
        }
    }
    }



