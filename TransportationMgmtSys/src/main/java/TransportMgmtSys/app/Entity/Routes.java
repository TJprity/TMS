package TransportMgmtSys.app.Entity;

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
@Table(name = "routes")
public class Routes {
	
	@Id
	@JdbcTypeCode(org.hibernate.type.SqlTypes.VARCHAR)
	@Column(name = "RouteName", columnDefinition = "char(36)")
	private String RouteName;
	@Column(name = "from_place")
	private String From;
	@Column(name = "to_palce")
	private String To;
	private String PickupTime;
	private String DropTime;
	

}
