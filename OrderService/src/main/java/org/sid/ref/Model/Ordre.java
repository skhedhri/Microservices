package org.sid.ref.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Ordre implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private StateEnum state;
    private Long consumerId;
    private Long restaurentId;
    @OneToMany(mappedBy = "ordre")
    private Collection<OrderLineItems> itemsCollections;
}
