package start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import relation.root.FiveStep;
import relation.root.impl.FiveStepImpl;

/**
 * @author aibinru
 * @date 24-8-7 11:02
 * @description:
 */
@Slf4j
public class Do {

    @Autowired
    FiveStep fiveStep = new FiveStepImpl();

    public void start(){
        log.info("第一步：设定目标");
        fiveStep.setGoal();

        log.info("第二步：发现问题");
        fiveStep.findQuestion();

        log.info("第三步：找到根源");
        fiveStep.findRoot();

        log.info("第四步：定制方案");
        fiveStep.setSchema();

        log.info("第五步：采取实践");
        fiveStep.doAction();
    }

    public static void main(String[] args) {
        //启动一个任务
        new Do().start();
    }
}
