package relation.root.impl;

import conception.basic.Goal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import relation.root.FiveStep;

/**
 * @author aibinru
 * @date 24-8-7 14:52
 * @description: 5步思考法
 * 如果没有完成上一步，则不能进入到下一步
 * 每一步都是环环相扣的
 */
@Slf4j
@Service
public class FiveStepImpl<T> implements FiveStep {

    Goal goal = new Goal();

    /**
     * 设定目标
     */
    @Override
    public void setGoal() {
        /**
         * 问题：
         * 0.【什么是】目标
         * 1.【怎么设定】目标
         * 2.目标的【作用】
         * 3.目标的【合理性】
         * 4.【分解】目标
         */
        System.out.println("【什么是】目标");
        goal.whatIsGoal();

        goal.howToSetGoal();


    }

    /**
     * 发现问题
     */
    @Override
    public void findQuestion() {
        /**
         * 实现目标有哪些问题：
         * 1.怎么准确定义问题，什么是问题
         * 描述：
         * 2.
         */
    }

    /**
     * 找到根源
     */
    @Override
    public void findRoot() {

    }

    /**
     * 制定方案
     */
    @Override
    public void setSchema() {
        /**
         * 1.追踪进度
         */
    }

    /**
     * 采取行动
     */
    @Override
    public void doAction() {

        /**
         *
         */
    }


}
