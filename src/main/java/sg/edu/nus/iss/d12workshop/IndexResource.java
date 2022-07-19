package sg.edu.nus.iss.d12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// page 14 of slides

@Controller
@RequestMapping(path={"/indexresource" , "/indexresource.html"})
public class IndexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        return "indexresource";

    }
    
}
