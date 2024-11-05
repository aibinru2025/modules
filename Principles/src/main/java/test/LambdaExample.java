package test;

/**
 * @author aibinru
 * @date 24-8-27 10:31
 * @description:
 */
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 使用Lambda表达式打印每个名字
        names.forEach(name -> System.out.println(name));
    }
}

