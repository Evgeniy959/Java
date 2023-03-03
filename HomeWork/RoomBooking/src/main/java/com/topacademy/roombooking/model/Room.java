package com.topacademy.roombooking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "room_number")
    private String roomNumber;
    @Column(name = "persons_count")
    private int  personsCount;
    @Column(name = "start_date")
    //private LocalTime start;
    private LocalDateTime start;
    @Column(name = "end_date")
    //private LocalTime end;
    private LocalDateTime end;
    /*@Column(name = "is_booked")
    private boolean isBooked;*/


}
