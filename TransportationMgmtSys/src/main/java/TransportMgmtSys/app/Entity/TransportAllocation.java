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
@Table(name = "transport-allocations")
public class TransportAllocation {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@JdbcTypeCode(org.hibernate.type.SqlTypes.VARCHAR)
	@Column(name = "taID", columnDefinition = "char(36)")
	private UUID taID;
	//fk
	private String Route;
	//fk
	private String Vehicle;
	//fk
	private String Driver;
	private long Mobile;
	private int TotalSeat;
	private String PickupPlace;
	private int SeatNo;
	private BigDecimal Fee;

}
