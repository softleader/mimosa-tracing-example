package tw.com.softleader.tracingexample;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

  final OtpClient otpClient;

  @GetMapping("/{name}")
  public Map<String, Object> hello(@PathVariable("name") String name) {
    return otpClient.getOtp(name, name);
  }
}
