package com.lsxiao.loki.core;

/**
 * write with LokiRule
 * author:lsxiao
 * date:2017-05-25 21:55
 * github:https://github.com/lsxiao
 * zhihu:https://zhihu.com/people/lsxiao
 */

public interface Validator {
    ValidateResult check(Object o);
}