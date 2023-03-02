package com.tonnie.microservice.vehicle.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
@Entity
public class Vehicle {

    @Id
    @Column
    @GeneratedValue
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "COD_CUSTOMER", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    private String customerId;

    @Column(name = "COD_TELEMETRY_PROFILE", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    private String telemetryProfileId;

    @Column(name = "COD_CURRENT_DRIVER", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    private String driverId;

    @Column(name = "NUM_PLATE", updatable = false, nullable = false, columnDefinition = "VARCHAR(10)")
    private String numPlate;

    @Column(name = "TXT_COLOR", updatable = false)
    private String color;

    @Column(name = "TXT_VIN", updatable = false)
    private String vin;
}
