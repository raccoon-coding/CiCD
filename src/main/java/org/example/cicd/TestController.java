package org.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity get() {
        System.out.println("test2");
        return ResponseEntity.ok("무중단 배포 확인 완료");
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("확인");
    }
}
