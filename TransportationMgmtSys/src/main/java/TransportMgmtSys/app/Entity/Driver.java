package TransportMgmtSys.app.Entity;

import java.math.BigDecimal;
import java.util.UUID;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name = "drivers")
public class Driver {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@JdbcTypeCode(org.hibernate.type.SqlTypes.VARCHAR)
	@Column(name = "DriverID", columnDefinition = "char(36)")
	private UUID DriverID;
	private String Name;
	private String Address;
	private long Mobile;
	private String Email;
	private BigDecimal Salary;
	private String License;
	private String DoJ;
	private String DoB;
	private String StateIssue;
	private String ExpirationDate;
	private String StartDate;
	private String EndDate;
	private String EmployerName;
	private String EmployerAddress;
	private long EmployerPhone;
	//fk
	private String RouteName;
	private String Remarks;


}
