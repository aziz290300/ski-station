package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tn.esprit.spring.entities.Instructor;
import tn.esprit.spring.services.InstructorServicesImpl;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InstructorServiceJUnitTest {

    private InstructorServicesImpl instructorServices;

    @BeforeEach
    void setUp() {
        instructorServices = new InstructorServicesImpl();
    }

    @Test
    void testFindInstructorsByExperience() {
        // Préparation des données pour tester la logique métier directement
        Instructor instructor1 = new Instructor();
        instructor1.setDateOfHire(LocalDate.now().minusYears(10)); // 10 ans d'expérience

        Instructor instructor2 = new Instructor();
        instructor2.setDateOfHire(LocalDate.now().minusYears(4)); // 4 ans d'expérience

        instructorServices.addInstructor(instructor1); // Méthode fictive pour ajouter les instructeurs
        instructorServices.addInstructor(instructor2);

        List<Instructor> experiencedInstructors = instructorServices.findInstructorsByExperience(5);

        assertNotNull(experiencedInstructors);
        assertEquals(1, experiencedInstructors.size());
        assertEquals(instructor1, experiencedInstructors.get(0));
    }

    @Test
    void testFindInstructorsByName() {
        Instructor instructor = new Instructor();
        instructor.setFirstName("John");

        instructorServices.addInstructor(instructor); // Méthode fictive pour ajouter l'instructeur

        List<Instructor> instructors = instructorServices.findInstructorsByName("John");

        assertNotNull(instructors);
        assertEquals(1, instructors.size());
        assertEquals("John", instructors.get(0).getFirstName());
    }
}
