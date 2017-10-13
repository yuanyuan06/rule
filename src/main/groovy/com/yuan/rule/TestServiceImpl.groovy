package com.yuan.rule

import com.yuan.base.TestService
import org.springframework.stereotype.Service

@Service("testService")
class TestServiceImpl implements TestService {

    static {
        println "come in"
    }

    @Override
    void sayHelo() {
        println "hello world"
    }
}
