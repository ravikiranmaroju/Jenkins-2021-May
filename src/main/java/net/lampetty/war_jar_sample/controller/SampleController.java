package net.lampetty.war_jar_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController extends BaseController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return hello();
    }
}
