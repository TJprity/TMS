package TransportMgmtSys.app.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import TransportMgmtSys.app.Entity.Student;
//@Repository
public interface StudentRepo extends JpaRepository<Student, UUID> {
	
}
