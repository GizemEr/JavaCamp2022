package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Car {
	@Id//PK(Primary Key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Id otomatik artar
	@Column(name="id")
	private int id;
	
	@Column(name = "plate", unique = true)
	private String plate; //plate : plaka
	
	@Column(name = "dailyPrice")
	private double dailyPrice;
	
	@Column(name = "modelYear")
	private int modelYear;
	
	@Column(name = "state")
	private int state; //arabanın durumu 1- Available 2 - Rented 3 - Maintenance(Bakım)
	
	@ManyToOne
	@JoinColumn(name = "model_id")
	private Model model;
}
