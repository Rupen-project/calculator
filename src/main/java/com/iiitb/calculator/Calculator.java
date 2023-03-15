package com.iiitb.calculator;

import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@CrossOrigin("*")
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