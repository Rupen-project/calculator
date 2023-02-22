package com.iiitb.calculator;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class Calculator {

    @RequestMapping(value = "/power",method = RequestMethod.POST)
    public double power(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        double input2 = Double.parseDouble((String) payload.get("input2"));
        res = Math.pow(input1,input2);
        return res  ;
    }



}