package com.example.myfirstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
@Slf4j
public class FirstController {

    @GetMapping("/test")
    public String test(@RequestHeader("data") String header){
        System.out.println("Request 1st controller.(sout)");
        log.info("Request first controller.(log)");
        log.info(header);
        return "This is the first service.";
    }
    @GetMapping("/test2")
    public String test2(@RequestHeader("firstreq") String header){
        System.out.println("Request 1st controller.(sout)");
        log.info(header);

        return "This is the second method of first service.";
    }
    @GetMapping("/header/test")
//    public ResponseEntity test3(@RequestHeader("X-PHOTO-VER") String apiversion){
      public ResponseEntity test3(){
        return ResponseEntity.ok("ok");
    }
}
