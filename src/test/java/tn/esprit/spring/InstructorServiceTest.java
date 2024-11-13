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

public class InstructorServiceTest {

    private IInstructorRepository instructorRepository;

    @InjectMocks
    private InstructorServicesImpl instructorServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Initializes the mocks
    }

    @Test
    void testFindInstructorsByName() {
        // Create mock data
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("John");

        Instructor instructor2 = new Instructor();
        instructor2.setFirstName("Jane");

        // Define mock behavior for the repository method
        when(instructorRepository.findByfirstNameContaining("John")).thenReturn(Arrays.asList(instructor1));

        // Call the method you want to test
        List<Instructor> instructors = instructorServices.findInstructorsByName("John");

        // Validate the result
        assertNotNull(instructors);
        assertEquals(1, instructors.size());
        assertEquals("John", instructors.get(0).getFirstName());

        // Verify the repository method was called
        verify(instructorRepository, times(1)).findByfirstNameContaining("John");
    }

    @Test
    void testFindInstructorsByName_NotFound() {
        // Define mock behavior when no instructors are found with the given name
        when(instructorRepository.findByfirstNameContaining("NonExistentName")).thenReturn(Arrays.asList());

        // Call the method with a name that doesn't exist in the repository
        List<Instructor> instructors = instructorServices.findInstructorsByName("NonExistentName");

        // Validate the result
        assertNotNull(instructors);
        assertEquals(0, instructors.size()); // No instructors should be found

        // Verify the repository method was called
        verify(instructorRepository, times(1)).findByfirstNameContaining("NonExistentName");
    }

    @Test
    void testFindInstructorsByExperience() {
        // Create mock data
        Instructor instructor1 = new Instructor();
        instructor1.setDateOfHire(LocalDate.of(2015, 1, 1));  // 9 years of experience
        Instructor instructor2 = new Instructor();
        instructor2.setDateOfHire(LocalDate.of(2020, 1, 1));  // 4 years of experience
        Instructor instructor3 = new Instructor();
        instructor3.setDateOfHire(LocalDate.of(2010, 1, 1));  // 14 years of experience

        // Define mock behavior for the repository method
        when(instructorRepository.findAll()).thenReturn(Arrays.asList(instructor1, instructor2, instructor3));

        // Call the method with a minimum years of experience filter
        List<Instructor> instructors = instructorServices.findInstructorsByExperience(5);

        // Validate the result
        assertNotNull(instructors);
        assertEquals(2, instructors.size()); // Only instructors with 5 or more years of experience should be included
        assertTrue(instructors.contains(instructor1)); // Should include instructor1 (9 years)
        assertTrue(instructors.contains(instructor3)); // Should include instructor3 (14 years)
        assertFalse(instructors.contains(instructor2)); // Should not include instructor2 (4 years)

        // Verify the repository method was called
        verify(instructorRepository, times(1)).findAll();
    }

    @Test
    void testFindInstructorsByExperience_NotFound() {
        // Create mock data where no instructors have sufficient experience
        Instructor instructor1 = new Instructor();
        instructor1.setDateOfHire(LocalDate.of(2018, 1, 1));  // 6 years of experience
        Instructor instructor2 = new Instructor();
        instructor2.setDateOfHire(LocalDate.of(2022, 1, 1));  // 2 years of experience

        // Define mock behavior for the repository method
        when(instructorRepository.findAll()).thenReturn(Arrays.asList(instructor1, instructor2));

        // Call the method with a minimum years of experience filter
        List<Instructor> instructors = instructorServices.findInstructorsByExperience(10);

        // Validate the result
        assertNotNull(instructors);
        assertEquals(0, instructors.size()); // No instructors should meet the experience requirement

        // Verify the repository method was called
        verify(instructorRepository, times(1)).findAll();
    }
}
*/
