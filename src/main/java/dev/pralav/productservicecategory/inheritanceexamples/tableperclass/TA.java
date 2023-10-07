package dev.pralav.productservicecategory.inheritanceexamples.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name =  "tbc_TA")
public class TA extends User {
    private double averageRating;
}
