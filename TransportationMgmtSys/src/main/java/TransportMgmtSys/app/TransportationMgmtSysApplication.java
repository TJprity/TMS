package TransportMgmtSys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import TransportMgmtSys.app.Config.RsaKeyProps;

@EnableConfigurationProperties(RsaKeyProps.class)
@SpringBootApplication
public class TransportationMgmtSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportationMgmtSysApplication.class, args);
	}

}
