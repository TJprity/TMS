package TransportMgmtSys.app.Config;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rsa")
public record RsaKeyProps(RSAPublicKey publicKey, RSAPrivateKey privateKey) {

}
