package come.natenelles.mahjong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;
import org.springframework.web.context.annotation.SessionScope;

import java.util.concurrent.atomic.AtomicLong;

@EnableRedisHttpSession
@Configuration
public class SessionConfig {

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        return new LettuceConnectionFactory();
    }

    @Bean
    public HttpSessionIdResolver httpSessionIdResolver() {
        return HeaderHttpSessionIdResolver.xAuthToken(); // <3>
    }

    AtomicLong idGenerator = new AtomicLong();

    @Bean
    @SessionScope
    public UserDetails userDetails() {
        return new UserDetails(idGenerator.incrementAndGet());
    }
}
