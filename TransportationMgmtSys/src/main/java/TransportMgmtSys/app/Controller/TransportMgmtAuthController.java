package TransportMgmtSys.app.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TransportMgmtSys.app.Service.TokenService;

@RestController
@RequestMapping("/auth/v1")
public class TransportMgmtAuthController {

	private static final Logger LOG = LoggerFactory.getLogger(TransportMgmtAuthController.class);

    private final TokenService tokenService;

    public TransportMgmtAuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
        LOG.debug("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted: {}", token);
        return token;
    }

}
