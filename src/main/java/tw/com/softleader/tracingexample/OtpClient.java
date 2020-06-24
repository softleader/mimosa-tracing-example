package tw.com.softleader.tracingexample;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/otp")
@FeignClient(name = "otp", url = "${feign.client.otp.url}")
public interface OtpClient {

  @GetMapping(value = "/{id}/{token}", produces = MediaType.APPLICATION_JSON_VALUE)
  Map<String, Object> getOtp(@PathVariable("id") String id, @PathVariable("token") String token);
}
