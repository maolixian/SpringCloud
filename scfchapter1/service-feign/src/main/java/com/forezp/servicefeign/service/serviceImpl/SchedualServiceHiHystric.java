package com.forezp.servicefeign.service.serviceImpl;

import com.forezp.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * created by maolixian on 2018/9/19
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
