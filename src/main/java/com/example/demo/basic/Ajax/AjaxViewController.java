package com.example.demo.basic.Ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class AjaxViewController {
    @GetMapping("/ajax-ex-01") // 해당 경로로 GET 요청이 들어올 때
    // ajaxEx01() 메서드 호출
    public String ajaxEx01() {
        // 컨트롤러에서 반환하는 문자열은 View Resolver를 사용하여 해당 문자열을 뷰(View) 이름으로 해석하고,
        // 뷰 이름에 해당하는 템플릿을 찾아서 렌더링함
        // 컨트롤러는 요청을 받아 처리한 후, 뷰 이름을 반환하는 역할을 함
        return "ajax/ajax-ex-01"; // 해당 문자열 반환 .html 로
//        return ""; // 빈값이면 파일을 못 찾기 때문에 500 에러가 난다
    }

    @GetMapping("/ajax-ex-02")
    public String ajaxEx02() {
        return "ajax/ajax-ex-02";
    }

    @GetMapping("/ajax-ex-03")
    public String ajaxEx03() {
        return "ajax/ajax-ex-03";
    }

    @GetMapping("/ajax-ex-04")
    public String ajaxEx04() {
        return "ajax/ajax-ex-04";
    }

    @GetMapping("/ajax-ex-05")
    public String ajaxEx05() {
        return "ajax/ajax-ex-05";
    }

    @GetMapping("/ajax-ex-06")
    public String ajaxEx06() {
        return "ajax/ajax-ex-06";
    }

    @GetMapping("/ajax-ex-07")
    public String ajaxEx07() {
        return "ajax/ajax-ex-07";
    }

    @GetMapping("/ajax-ex-08")
    public String ajaxEx08() {
        return "ajax/ajax-ex-08";
    }

    @GetMapping("/ajax-ex-09")
    public String ajaxEx09() {
        return "ajax/ajax-ex-09";
    }

    @GetMapping("/ajax-ex-10")
    public String ajaxEx10() {
        return "ajax/ajax-ex-10";
    }

}
