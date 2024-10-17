package it.provaTask.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate; 

@Entity
@Table(name = "Progetti")
public class Progetto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "DenominazioneProgetto", nullable = false)
 	@NotBlank(message = "La denominazione del progetto non può essere null")
	@NotNull(message = "La denominazione del progetto non può essere null")
	private String name;
	
	@Column(name = "DataInizio", nullable = false)
	@NotNull(message = "La data di inizio non può essere null")
	private LocalDate dataInizio;
	
	@NotNull(message = "La data di fine non può essere null")
	@Column(name = "DataFine", nullable = false)
	private LocalDate dataFine;
	
	@OneToMany(mappedBy = "progetto")
	private List<Task> task;

	@ManyToOne
	@JoinColumn(name = "ClienteRif", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "UtenteRif", nullable = false)
	private Utente utente;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}


