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

public class InstructorServiceMockitoTest {

    @Mock
    private IInstructorRepository instructorRepository;

    @InjectMocks
    private InstructorServicesImpl instructorServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindInstructorsByName() {
        Instructor instructor = new Instructor();
        instructor.setFirstName("John");

        when(instructorRepository.findByfirstNameContaining("John"))
                .thenReturn(Arrays.asList(instructor));

        List<Instructor> instructors = instructorServices.findInstructorsByName("John");

        assertNotNull(instructors);
        assertEquals(1, instructors.size());
        assertEquals("John", instructors.get(0).getFirstName());

        verify(instructorRepository, times(1)).findByfirstNameContaining("John");
    }

    @Test
    void testFindInstructorsByExperience() {
        Instructor instructor1 = new Instructor();
        instructor1.setDateOfHire(LocalDate.now().minusYears(10)); // 10 ans d'expérience

        Instructor instructor2 = new Instructor();
        instructor2.setDateOfHire(LocalDate.now().minusYears(3)); // 3 ans d'expérience

        when(instructorRepository.findAll()).thenReturn(Arrays.asList(instructor1, instructor2));

        List<Instructor> experiencedInstructors = instructorServices.findInstructorsByExperience(5);

        assertNotNull(experiencedInstructors);
        assertEquals(1, experiencedInstructors.size());
        assertEquals(instructor1, experiencedInstructors.get(0));

        verify(instructorRepository, times(1)).findAll();
    }
}
