package Model;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "TB_Student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;


}
