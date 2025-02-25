package com.eventos.api.domain.coupon;


import jakarta.persistence.*;
import jdk.jfr.Event;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Coupon {

    @GeneratedValue
    private UUID id;

    private Integer discount;
    private String code;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
