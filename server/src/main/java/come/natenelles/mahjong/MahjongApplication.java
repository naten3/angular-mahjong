package come.natenelles.mahjong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author Rob Winch
 */
@SpringBootApplication
public class MahjongApplication {

	public static void main(String[] args) {
		SpringApplication.run(MahjongApplication.class, args);
	}
}
