package org.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marcin  on 24.05.2017.
 */
@Controller
public class IndexxController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getView() {
        return "index";
    }

}
