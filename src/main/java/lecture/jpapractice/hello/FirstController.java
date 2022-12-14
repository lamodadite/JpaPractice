package lecture.jpapractice.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping(value = "/first-url", method = RequestMethod.GET)
    public void firstUrl() {
    }

    @ResponseBody
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello world";
    }
}
