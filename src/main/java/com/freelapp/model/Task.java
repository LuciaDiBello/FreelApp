package com.freelapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate; 

@Entity
@Table(name = "Tasks")
public class Task{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Descrizione", nullable = false)
 	@NotBlank(message = "La descrizione del progetto non può essere null")
	@NotNull(message = "La descrizione del progetto non può essere null")
	private String descrizione;
	
	@Column(name = "DataInizio", nullable = false)
	@NotNull(message = "La data di inizio non può essere null")
	private LocalDate dataInizio;
	
	@NotNull(message = "La data di chiusura stimata non può essere null")
	@Column(name = "DataChiusuraStimata", nullable = false)
	private LocalDate dataChiusuraStimata;
	
	@NotNull(message = "La data di chiusura definitiva non può essere null")
	@Column(name = "DataChiusuraDefinitiva", nullable = false)
	private LocalDate dataChiusuraDefinitiva;

	@Column(name = "Cronometro, nullable = false")
	@NotNull(message = "Il cronometro non può essere null")
	private int cronometro;
	
	@ManyToOne
	@JoinColumn(name = "ProgettoRif", nullable = false)
	private Progetto progetto;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataChiusuraStimata() {
		return dataChiusuraStimata;
	}

	public void setDataChiusuraStimata(LocalDate dataChiusuraStimata) {
		this.dataChiusuraStimata = dataChiusuraStimata;
	}
	
	public LocalDate getDataChiusuraDefinitiva() {
		return dataChiusuraStimata;
	}

	public void setDataChiusuraDefinitiva(LocalDate dataChiusuraStimata) {
		this.dataChiusuraStimata = dataChiusuraStimata;
	}

	public int getCronometro() {
		return cronometro;
	}

	public void setCronometro(int cronometro) {
		this.cronometro = cronometro;
	}
	
	public Progetto getProgetto() {
		return progetto;
	}

	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	
}



