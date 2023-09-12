package TransportMgmtSys.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import TransportMgmtSys.app.Entity.Routes;

//@Repository
public interface RouteRepo extends JpaRepository<Routes, String> {

}
