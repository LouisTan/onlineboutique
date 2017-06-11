package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String index() {

      final Logger log = LoggerFactory.getLogger(this.getClass());

      // Log a simple message
      log.debug("debug level log");
      log.info("info level log");
      log.error("error level log");

      return "/index";
    }

    @RequestMapping("/about")
    public String about() {

       return "/about";
    }

    @RequestMapping("/admin")
    public String admin () {

      return "/admin";
    }

    @RequestMapping("/user")
    public String user () {

      return "/user";
    }

    @RequestMapping("/login")
    public String login () {

        return "/login";
    }

    @RequestMapping("/403")
    public String error403 () {

        return "/error/403";
    }

}
