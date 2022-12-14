package lecture.jpapractice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/hello-spring")
    public String helloSpring() {
        return "hello spring";
    }

    @GetMapping("/hello-rest")
    public String helloRest() {
        return "hello rest";
    }

    @GetMapping("/api/helloworld")
    public String helloRestApi() {
        return "hello rest api";
    }
}
