package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Slf4j
@RestController //
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass()); // 또는 LogTestController.class, @Slf4j 어노테이션을 넣어주면 이 코드 안넣어도 됨

    @RequestMapping("log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // 중요!!
        log.info(" info log" + name); // 이렇게 사용하면 안된다. +를 사용하면 더하기 연산이 일어나기 때문에 쓸데 없는 자원을 사용하게 됨.

        // 로그 레벨 아래 순서대로 레벨임.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }

}
