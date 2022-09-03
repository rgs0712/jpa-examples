package br.com.rgs.jpaexamples.domain;

import br.com.rgs.jpaexamples.domain.types.RequestStatusType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "REQUEST")
public class Request implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name="CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name="LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

    @Column(name="TOTAL")
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @Column(name="REQUEST_STATUS")
    private RequestStatusType requestStatus;

    @Version
    @Column(name="VERSION", columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version=0L;

}
