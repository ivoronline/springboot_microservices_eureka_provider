package com.ivoronline.springboot_microservices_eureka_provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("Provider")
  String provider() {
    return "Hello from Provider";
  }

}
