package Model;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "TB_Rent_Book")
public class RentBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;




}
