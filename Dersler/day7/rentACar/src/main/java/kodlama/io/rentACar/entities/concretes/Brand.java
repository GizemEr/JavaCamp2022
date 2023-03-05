package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;//veriyi bir yere kaydetmek tutmak gelmeli akla

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	
	@Id//PK(Primary Key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Id otomatik artar
	@Column(name="id")
	private int id; 
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "brand")  //modelde brandid 1 tane var, mappedby bu ilişkilendirme model nesnesinde angi alanla ilişkilendiriliyor
	 private List<Model> models;

}

//Brand --> id,name,quantity
//GetAllBrandsResponse --> id,name
//mapping denir