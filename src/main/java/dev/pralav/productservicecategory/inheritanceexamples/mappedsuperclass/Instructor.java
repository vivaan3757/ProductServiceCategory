package dev.pralav.productservicecategory.inheritanceexamples.mappedsuperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_instructor")
public class Instructor extends User {
    private boolean isHandsome;
}
