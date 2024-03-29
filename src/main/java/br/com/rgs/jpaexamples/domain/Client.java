package br.com.rgs.jpaexamples.domain;

import br.com.rgs.jpaexamples.domain.types.GenderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="CLIENT")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="DOCUMENT_NUMBER")
    private String docNumber;

    @Column(name="BIRTH_DATE")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name="GENDER")
    private GenderType gender;

    @Version
    @Column(name="VERSION", columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version=0L;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Order> orders;

}
