package Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name = "TB_Student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID registration;
    @Column(name = "name")
    private String name;
    @Column(name = "course")
    private String course;
    @OneToMany
    private Set<RentBookModel> rentBookModels = new HashSet<>();

    public StudentModel() {
    }

    public StudentModel(UUID registration, String name, String course, Set<RentBookModel> rentBookModels) {
        this.registration = registration;
        this.name = name;
        this.course = course;
        this.rentBookModels = rentBookModels;
    }

    public UUID getRegistration() {
        return registration;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String curso) {
        this.course = curso;
    }

    public Set<RentBookModel> getRentBookModels() {
        return rentBookModels;
    }

    public void setRentBookModels(Set<RentBookModel> rentBookModels) {
        this.rentBookModels = rentBookModels;
    }
}
