package com.zhyyu.learn.springboot.api.testautoconfig;

/**
 * @author juror
 * @datatime 2019/9/6 11:45
 */
public class MyAutoConfigedBean {

    private int i;

    public String doSomething() {
        return "hello: " + i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
