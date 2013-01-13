package ${package};

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author $Author$
 * @version $Rev$
 */
@Controller
@RequestMapping("/rest")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello1/{name}", headers = "Accept=application/json")
    public @ResponseBody
    ViewPerson sayHello(@PathVariable String name) {
        ViewPerson view = new ViewPerson(name);
        return view;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello2/{name}", headers = "Accept=application/json")
    public @ResponseBody
    ViewPerson sayHelloWithAge(@PathVariable String name, @RequestParam(required = true) int age) {
        ViewPerson view = new ViewPerson(name, age);
        return view;
    }
}