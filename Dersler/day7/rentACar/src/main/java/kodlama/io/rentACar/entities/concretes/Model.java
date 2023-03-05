package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="models")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {
	@Id//PK(Primary Key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Id otomatik artar
	@Column(name="id")
	private int id; 
	
	@Column(name="name")
	private String name;
	
	@ManyToOne  //Model'deki brand ile ilişkilendirilen id kaç kere tekrarlanıyor  : çok kere
	@JoinColumn(name ="brand_id") //iki tablonun birbiriyle join olması
	private Brand brand; //1 modelin 1 markası olabilir o yüzden private brand nesnesi oluşturmalıyız
	
	@OneToMany(mappedBy =  "model")//model alanı ile ilişkilendirilicek 
	private List<Car> cars; //Bir modelin birçok arabası olabilir
	
}
