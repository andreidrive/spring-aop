package andrei.dev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"andrei.dev.service", "andrei.dev.aspect"})
@EnableAspectJAutoProxy
public class AppConfig {
}
