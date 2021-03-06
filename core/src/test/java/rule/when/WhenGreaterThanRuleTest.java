package rule.when;

import com.lsxiao.rig.core.rule.BaseRule;
import com.lsxiao.rig.core.rule.RelyAble;
import com.lsxiao.rig.core.rule.WhenAble;
import com.lsxiao.rig.core.rule.when.WhenGreaterThanRule;

import junit.framework.TestCase;

/**
 * write with Rig
 * author:lsxiao
 * date:2017-06-09 14:20
 * github:https://github.com/lsxiao
 * zhihu:https://zhihu.com/people/lsxiao
 */

public class WhenGreaterThanRuleTest extends TestCase {

    public void testClass() throws Exception {
        assertTrue(BaseRule.class.isAssignableFrom(WhenGreaterThanRule.class));
        assertTrue(WhenAble.class.isAssignableFrom(WhenGreaterThanRule.class));
        assertTrue(RelyAble.class.isAssignableFrom(WhenGreaterThanRule.class));
    }

    public void testName() throws Exception {
        assertTrue(WhenGreaterThanRule.Companion.getNames().contains("when_gt"));
    }
}
