package TransportMgmtSys.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TransportMgmtSys.app.Entity.PickupPlace;
import TransportMgmtSys.app.Entity.Routes;
import TransportMgmtSys.app.Entity.Student;
import TransportMgmtSys.app.Entity.TransportAllocation;
import TransportMgmtSys.app.Entity.Vehicle;
import TransportMgmtSys.app.Service.DriverService;
import TransportMgmtSys.app.Service.PickupPlaceService;
import TransportMgmtSys.app.Service.RouteService;
import TransportMgmtSys.app.Service.StudentService;
import TransportMgmtSys.app.Service.TransportAllocationService;
import TransportMgmtSys.app.Service.VehicleService;
import TransportMgmtSys.app.Entity.Driver;


@RestController
@RequestMapping("/api/v1")
public class TransportMgmtController {
	
	@Autowired
	private RouteService routeSrv;
	@Autowired
	private PickupPlaceService pickupPlaceSrv;
	@Autowired
	private DriverService driverSrv;
	@Autowired
	private VehicleService vehicleSrv;
	@Autowired
	private StudentService studentSrv;
	@Autowired
	private TransportAllocationService transportAllocationSrv;
	
	@GetMapping("/routes")
	public List<Routes> getRoutes(){
		return routeSrv.getRoutes();
	}
	
	@PostMapping("/add-route")
	public Routes addRoute(@RequestBody Routes route) {
		return routeSrv.addRoute(route);
//		return "new route added"+route;
	}
	
	@PostMapping("/add-pickup-place")
	public PickupPlace addPickupPlace(@RequestBody PickupPlace pickupPlace) {
//		return "new PickupPlace added"+pickupPlace;
		return pickupPlaceSrv.addPickupPlace(pickupPlace);
	}
	
	@PostMapping("/add-driver")
	public Driver addDriver(@RequestBody Driver driver) {
//		return "new Driver added"+driver;
		return driverSrv.addDriver(driver);
	}
	
	@PostMapping("/add-vehicle")
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
//		return "new Vehicle added"+vehicle;
		return vehicleSrv.addVehicle(vehicle);
	}

	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
//		return "new Student added"+student;
		return studentSrv.addStudent(student);
	}
	
	@PostMapping("/edit-transport-allocation")
	public TransportAllocation editTransportAllocation(@RequestBody TransportAllocation TAlloc) {
//		return "new TransportAllocation edited"+TAlloc;
		return transportAllocationSrv.addTansportAllocation(TAlloc);
	}
}
