package TransportMgmtSys.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportMgmtSys.app.Entity.Routes;
import TransportMgmtSys.app.Repo.RouteRepo;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteRepo routeRepo;
	
	@Override
	public List<Routes> getRoutes() {
		// TODO Auto-generated method stub
		return routeRepo.findAll();
	}
	
	@Override
	public Routes addRoute(Routes route) {
		return routeRepo.save(route);
	}
	
}
