package tw.com.softleader.tracingexample;

import feign.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class TracingExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(TracingExampleApplication.class, args);
  }

  /**
   * @see <a
   *     hred="https://github.com/opentracing-contrib/java-spring-jaeger#trace-id-not-propagated-via-the-feign-client">
   *     Trace id not propagated via the Feign client</a>
   * @return
   */
  @Bean
  public Client feignClient() {
    return new Client.Default(null, null);
  }
}
