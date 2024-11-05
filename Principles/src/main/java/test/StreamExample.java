package test;

/**
 * @author aibinru
 * @date 24-8-27 10:51
 * @description:
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 使用Stream API过滤名字长度大于3的名字，并将它们转换为大写
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3) // 使用Predicate函数式接口
                .map(String::toUpperCase) // 使用Function函数式接口
                .collect(Collectors.toList());

        System.out.println(filteredNames); // 输出: [ALICE, CHARLIE, DAVID]
    }
}

