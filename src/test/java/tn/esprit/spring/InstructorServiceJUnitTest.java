/*
package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Instructor;
import tn.esprit.spring.repositories.IInstructorRepository;
import tn.esprit.spring.services.InstructorServicesImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class InstructorServiceJUnitTest {

    @Mock
    private IInstructorRepository instructorRepository;  // Mock de l'instructorRepository

    @InjectMocks
    private InstructorServicesImpl instructorServices;   // Injection du mock dans le service

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Initialisation des mocks
    }

    @Test
    void testFindInstructorsByName() {
        // Création de données fictives
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("John");

        Instructor instructor2 = new Instructor();
        instructor2.setFirstName("Jane");

        // Définition du comportement du mock
        when(instructorRepository.findByfirstNameContaining("John")).thenReturn(Arrays.asList(instructor1));

        // Appel de la méthode à tester
        List<Instructor> instructors = instructorServices.findInstructorsByName("John");

        // Vérification des résultats
        assertNotNull(instructors);
        assertEquals(1, instructors.size());
        assertEquals("John", instructors.get(0).getFirstName());

        // Vérification que la méthode du repository a été appelée une fois
        verify(instructorRepository, times(1)).findByfirstNameContaining("John");
    }

    @Test
    void testFindInstructorsByExperience() {
        // Création de données fictives
        Instructor instructor1 = new Instructor();
        instructor1.setDateOfHire(LocalDate.of(2015, 1, 1));  // 9 ans d'expérience
        Instructor instructor2 = new Instructor();
        instructor2.setDateOfHire(LocalDate.of(2020, 1, 1));  // 4 ans d'expérience
        Instructor instructor3 = new Instructor();
        instructor3.setDateOfHire(LocalDate.of(2010, 1, 1));  // 14 ans d'expérience

        // Définition du comportement du mock
        when(instructorRepository.findAll()).thenReturn(Arrays.asList(instructor1, instructor2, instructor3));

        // Appel de la méthode à tester
        List<Instructor> instructors = instructorServices.findInstructorsByExperience(5);

        // Vérification des résultats
        assertNotNull(instructors);
        assertEquals(2, instructors.size()); // Seulement les instructeurs avec 5 ans ou plus d'expérience
        assertTrue(instructors.contains(instructor1)); // Devrait inclure instructor1 (9 ans)
        assertTrue(instructors.contains(instructor3)); // Devrait inclure instructor3 (14 ans)
        assertFalse(instructors.contains(instructor2)); // Ne devrait pas inclure instructor2 (4 ans)

        // Vérification que la méthode du repository a été appelée une fois
        verify(instructorRepository, times(1)).findAll();
    }
}*/
