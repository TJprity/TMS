package TransportMgmtSys.app.Repo;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import TransportMgmtSys.app.Entity.Driver;

public interface DriverRepo extends JpaRepository<Driver, UUID> {

}
