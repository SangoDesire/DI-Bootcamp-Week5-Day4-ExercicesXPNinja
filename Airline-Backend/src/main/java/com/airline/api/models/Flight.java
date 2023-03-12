package com.airline.api.models;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Flight implements Serializable {
    @Id
    private Long id;
    private String flightNumber;
    private String origin;
    private String destination;
    private String departDay;
    private String departTime;
    private String arriveDay;
    private String arriveTime;
    private double price;
}
