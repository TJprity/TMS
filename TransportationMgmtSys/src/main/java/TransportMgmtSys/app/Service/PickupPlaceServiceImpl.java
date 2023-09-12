package TransportMgmtSys.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportMgmtSys.app.Entity.PickupPlace;
import TransportMgmtSys.app.Repo.PickupPlaceRepo;

@Service
public class PickupPlaceServiceImpl implements PickupPlaceService {

	@Autowired
	private PickupPlaceRepo pickupPlaceRepo;
	@Override
	public List<PickupPlace> getPickupPlace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PickupPlace addPickupPlace(PickupPlace pickupPlace) {
		// TODO Auto-generated method stub
		return pickupPlaceRepo.save(pickupPlace);
	}

}
