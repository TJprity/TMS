package TransportMgmtSys.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportMgmtSys.app.Entity.Driver;
import TransportMgmtSys.app.Repo.DriverRepo;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepo driverRepo;
	
	@Override
	public Driver addDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepo.save(driver);
	}

}
