package com.freelapp.model;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "contatore")
public class Contatore {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "start", nullable = false)
	@NotNull(message = "Start non può essere null")
	private Time start;
    
    @Column(name = "pause", nullable = false)
	@NotNull(message = "Stop non può essere null")
	private Time pause;
	
    @Column(name = "stop", nullable = false)
	@NotNull(message = "Stop non può essere null")
	private Time stop;
	
    @OneToOne(mappedBy = "contatore")
    private Task task;
	
}
