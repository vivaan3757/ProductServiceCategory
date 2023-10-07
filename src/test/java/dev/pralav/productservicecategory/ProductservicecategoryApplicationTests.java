package dev.pralav.productservicecategory;

import dev.pralav.productservicecategory.inheritanceexamples.tableperclass.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductservicecategoryApplicationTests {
    @Autowired
    private TPCMentorRepository tpcMentorRepository;
    @Autowired
    private TPCUserRepository tpcUserRepository;
    @Autowired
    private TPCInstructorRepository tpcInstructorRepository;
    @Test
    void contextLoads() {
    }


    @Test
    void testDifferentInheritance() {
        User user = new User();
        user.setEmail("pralav@gamil.com");
        user.setPassword("passcode");
        tpcUserRepository.save(user);

        Mentor mentor = new Mentor();
        mentor.setEmail("saha@gmail.com");
        mentor.setPassword("Password");
        mentor.setNoOfMentees(10);
        mentor.setNoOfSessions(69);
        tpcMentorRepository.save(mentor);

        Instructor instructor = new Instructor();
        instructor.setEmail("ps@gmail.com");
        instructor.setPassword("monitor");
        instructor.setHandsome(true);
        tpcInstructorRepository.save(instructor);
    }

}
