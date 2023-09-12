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
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@JdbcTypeCode(org.hibernate.type.SqlTypes.VARCHAR)
	@Column(name = "studentID", columnDefinition = "char(36)")
	private UUID studentID;
	private String ClassNo;
	private String StudentName;
	//fk
	private String Route;
	//fk
	private String Vehicle;


}
