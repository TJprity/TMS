package TransportMgmtSys.app.Service;

import java.util.List;

import TransportMgmtSys.app.Entity.Routes;

public interface RouteService {

	List<Routes> getRoutes();
	Routes addRoute(Routes route);
}
