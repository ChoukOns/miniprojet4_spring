package com.ons.demo.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	
	@NotNull
	@Size (min = 4,max = 15)
	private String nomEmploye;
	
	
	
	@Min(value = 10)
	@Max(value = 10000)
	private Double salaire;
	
	/*
	 * @Temporal(TemporalType.DATE)
	 * 
	 * @DateTimeFormat(pattern = "yyyy-MM-dd")
	 * 
	 * @PastOrPresent private Date dateDebut;
	 */
	
	@ManyToOne
	private Entreprise entreprise;
	
	public Employe() {
		super();
		}
	
		public Employe(String nomEmploye, Double salaire/* , Date dateDebut */) {
		super();
		this.nomEmploye = nomEmploye;
		this.salaire = salaire;
		/* this.dateDebut = dateDebut; */
		}
	
	public Long getIdEmploye() {
		return idEmploye;
		}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
		}
		
		
		public String getNomEmploye() {
		return nomEmploye;
		}
		public void setNomEmploye(String nomEmploye) {
			this.nomEmploye = nomEmploye;
			}
		

		
			
		public Double getSalaire() {
		return salaire;
		}
		public void setSalaire(Double salaire) {
		this.salaire = salaire;
		}
		
		
		
		/*
		 * public Date getDateDébut() { return dateDebut; } public void
		 * setDateDébut(Date dateDebut) { this.dateDebut = dateDebut; }
		 */
		
		public Entreprise getEntreprise() {
			return entreprise;
		}

		public void setEntreprise(Entreprise entreprise) {
			this.entreprise = entreprise;
		}

		@Override
		public String toString() {
		return "Employee [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", salaire=" + salaire
		/* + ", dateDébut=" + dateDebut + "]" */+", entreprise=" + entreprise ;
		}

}
