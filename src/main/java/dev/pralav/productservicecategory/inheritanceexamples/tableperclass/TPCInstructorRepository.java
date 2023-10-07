package dev.pralav.productservicecategory.inheritanceexamples.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TPCInstructorRepository extends JpaRepository<Instructor, Long> {
    Instructor save(Instructor instructor);

    Instructor findInstructorById(Long Id);
}
