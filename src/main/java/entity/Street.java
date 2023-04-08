package entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false,unique = false)
    private String nameOfStreet;
    @OneToMany(mappedBy = "street", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Shop> shops;

}
