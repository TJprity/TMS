package TransportMgmtSys.app.Service;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtEncoder;

public interface TokenService {

	public String generateToken(Authentication authentication);

}
