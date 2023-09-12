package TransportMgmtSys.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportMgmtSys.app.Entity.TransportAllocation;
import TransportMgmtSys.app.Repo.TransportAllocationRepo;
@Service
public class TransportAllocationServiceImpl implements TransportAllocationService {

	
	@Autowired
	private TransportAllocationRepo transportAllocationRepo;
	
	@Override
	public TransportAllocation addTansportAllocation(TransportAllocation transAloc) {
		// TODO Auto-generated method stub
		return transportAllocationRepo.save(transAloc);
	}

}
