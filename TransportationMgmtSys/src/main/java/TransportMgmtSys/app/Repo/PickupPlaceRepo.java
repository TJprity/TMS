package TransportMgmtSys.app.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import TransportMgmtSys.app.Entity.PickupPlace;

//@Repository
public interface PickupPlaceRepo extends JpaRepository<PickupPlace, UUID> {

}
