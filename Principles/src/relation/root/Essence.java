package relation.root;

/**
 * @author aibinru
 * @date 24-8-7 10:08
 * @description: 本质，递归，第一性
 *
 */
public interface Essence<T> {

    /**
     * 1.规律-表层
     * 如何变化
     */

    void pattern(T object);

    /**
     * 2.原理-深层
     * 为什么这样变化
     */
    void deepPattern(T object);



}
