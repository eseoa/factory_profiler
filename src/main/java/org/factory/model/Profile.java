package org.factory.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "profiles")
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "name")
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    @Id
    @SequenceGenerator(name = "profiles_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profiles_sequence")
    private Long id;

    private String name;

    @Builder.Default
    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Detail> details = new ArrayList<>();

    public void addDetail(Detail detail) {
        details.add(detail);
        detail.setProfile(this);
    }
}