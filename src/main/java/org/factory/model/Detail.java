package org.factory.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "details")
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "name")
@NoArgsConstructor
@AllArgsConstructor
public class Detail {

    @Id
    @SequenceGenerator(name = "details_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "details_sequence")
    private Long id;

    private String name;

    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

}
