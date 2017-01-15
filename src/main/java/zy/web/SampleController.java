package zy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    Map home() {
        Map map = new HashMap<String,String>();
        map.put("Why","Happy");
        return map;
    }

}