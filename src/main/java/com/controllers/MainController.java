package com.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {

      final Logger log = LoggerFactory.getLogger(this.getClass());

      // Log a simple message
      log.debug("debug level log");
      log.info("info level log");
      log.error("error level log");

      return "index";
  }

}
