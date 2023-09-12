package TransportMgmtSys.app.Service;

import java.util.List;

import TransportMgmtSys.app.Entity.PickupPlace;

public interface PickupPlaceService {

	List<PickupPlace> getPickupPlace();
	PickupPlace addPickupPlace(PickupPlace pickupPlace);
}
