package org.xujin.sc.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: xujin
 **/
@Component
public class HelloFeignProviderHystrix implements HelloFeignService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World!";
    }

    @Override
    public String customFilter(@RequestParam(value = "name") String name) {
        return "Custom Filter";
    }

}