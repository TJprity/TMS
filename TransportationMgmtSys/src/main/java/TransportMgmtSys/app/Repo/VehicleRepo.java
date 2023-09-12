package TransportMgmtSys.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import TransportMgmtSys.app.Entity.Vehicle;
//@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Number> {

}
