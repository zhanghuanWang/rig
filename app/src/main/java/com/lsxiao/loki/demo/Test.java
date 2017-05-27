package com.lsxiao.loki.demo;

import com.lsxiao.loki.core.annotation.Rule;

/**
 * write with Loki
 * author:lsxiao
 * date:2017-05-28 04:21
 * github:https://github.com/lsxiao
 * zhihu:https://zhihu.com/people/lsxiao
 */

public class Test {
    @Rule(value = "int|between:10,30", name = "age")
    public String age;

    @Rule("notnull|min:3|when_eq:age,=,18")
    public String name;

    @Rule("filled")
    public String getCity() {
        return "NewYork";
    }
}
