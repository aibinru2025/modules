package relation.root;

import org.springframework.stereotype.Service;

/**
 * @author aibinru
 * @date 24-8-7 10:35
 * @description: 5步
 */
public interface FiveStep<T> {

    /**
     * 设定目标
     */
    void setGoal();

    /**
     * 发现问题
     */
    void findQuestion();

    /**
     * 找到问题的根源
     */
    void findRoot();

    /**
     * 制定方案
     */
    void setSchema();

    /**
     * 采取行动
     */
    void doAction();
}
