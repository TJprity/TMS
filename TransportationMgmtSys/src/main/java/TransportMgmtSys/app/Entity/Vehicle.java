package TransportMgmtSys.app.Entity;
import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vehicles")
public class Vehicle {
	@Id
	@JdbcTypeCode(org.hibernate.type.SqlTypes.VARCHAR)
	@Column(name = "RegNo", columnDefinition = "char(36)")
	private long RegNo;
	private String Name;
	private String GpsDeviceId;
	//fk
	private String RouteName;
	//fk
	private String Driver;
	private int NoOfSeat;
	private String Remarks;



}
