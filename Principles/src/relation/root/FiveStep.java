package relation.root;

/**
 * @author aibinru
 * @date 24-8-7 10:35
 * @description: 5步
 */
public interface FiveStep<T> {

    void setGoal();

    void findQuestion();

    void findRoot();

    void setSchema();

    void doAction();
}
