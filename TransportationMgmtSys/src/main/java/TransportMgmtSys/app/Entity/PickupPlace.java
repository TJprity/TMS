package TransportMgmtSys.app.Entity;
import java.math.BigDecimal;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "pickup-places")
public class PickupPlace {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@JdbcTypeCode(org.hibernate.type.SqlTypes.VARCHAR)
	@Column(name = "pickupID", columnDefinition = "char(36)")
	private UUID pickupID;
	//fk
	private String Route;
	private String PickupForm;
	private String PickupTo;
	private BigDecimal Fee;


}
