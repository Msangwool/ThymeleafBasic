package com.example.demo.basic.Ajax;

import com.example.demo.basic.Ajax.dto.AjaxDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {
    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "index";
    }

    @PostMapping("/ex02") // HTTP POST 요청을 처리하는 메서드
    // @ResponseBody: 메서드가 반환하는 데이터를 HTTP 응답 본문(response body)으로 전송함을 나타냄
    public @ResponseBody String ex02() {
        System.out.println("AjaxController.ex02");
        return "안녕하세요"; // 리턴값이 그대로 출력됨
    }

    @GetMapping("/ex03")
    public @ResponseBody String ex03(@RequestParam("param1") String param1, @RequestParam("param2") String param2) {
        System.out.println("");
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex03메서드 호출 완료"; // 리턴값이 그대로 출력됨
    }

    @PostMapping("/ex04")
    public @ResponseBody String ex04(@RequestParam("param1") String param1, @RequestParam("param2") String param2) {
        System.out.println("");
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex04메서드 호출 완료"; // 리턴값이 그대로 출력됨
    }

    @GetMapping("/ex05")
    public @ResponseBody AjaxDto ex05(@ModelAttribute AjaxDto ajaxDto) { // @modelAttribute: Model 객체에 추가하여 뷰에서 사용할 수 있도록 합니다.
        System.out.println("ajaxDTO = " + ajaxDto);
        return ajaxDto;
    }

    @PostMapping("/ex06")
    public @ResponseBody AjaxDto ex06(@ModelAttribute AjaxDto ajaxDto) { // @modelAttribute: Model 객체에 추가하여 뷰에서 사용할 수 있도록 합니다.
        System.out.println("ajaxDTO = " + ajaxDto);
        return ajaxDto;
    }

    @PostMapping("/ex07")
    public @ResponseBody AjaxDto ex07(@RequestBody AjaxDto ajaxDto) {
        System.out.println("ajaxDTO = " + ajaxDto);
        return ajaxDto;
    }

    @PostMapping("/ex08")
    public @ResponseBody List<AjaxDto> ex08(@RequestBody AjaxDto ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        List<AjaxDto> dtoList = new ArrayList<>();
        dtoList.add(new AjaxDto("data1", "data11"));
        dtoList.add(new AjaxDto("data2", "data22"));
        return dtoList;
    }

    @PostMapping("/ex09")
    public ResponseEntity<AjaxDto> ex09(@RequestBody AjaxDto ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ResponseEntity.ok().body(ajaxDTO);
//        return ResponseEntity.badRequest().body(ajaxDTO);
        // 상태 코드만 테스트
    }

    @PostMapping("/ex10")
    public ResponseEntity<List<AjaxDto>> ex10(@RequestBody AjaxDto ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        List<AjaxDto> dtoList = new ArrayList<>();
        dtoList.add(new AjaxDto("data1", "data11"));
        dtoList.add(new AjaxDto("data2", "data22"));
        dtoList.add(ajaxDTO);
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

}
