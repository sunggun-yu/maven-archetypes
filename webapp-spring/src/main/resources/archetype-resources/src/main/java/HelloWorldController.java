package $package;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author $Author$
 * @version $Rev$
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView helloWord(HttpServletRequest request,
            HttpServletResponse response) {
        String message = "Hello World! : ${artifactId} : Created by maven-archetype-webapp-spring";
        return new ModelAndView("hello", "message", message);
    }
}