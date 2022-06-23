package si.amine.jpa_entity_mappings.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //OneToOne
/*    @OneToOne(cascade = CascadeType.ALL)
    private Item item;*/

    //Join Table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "customer_item",
            joinColumns = {@JoinColumn(name = "customer_id")},
            inverseJoinColumns = {@JoinColumn(name = "item_id")}
    )
    private Item item;
    public Customer(String name) {
        this.name = name;
    }
}
