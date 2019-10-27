package pl.jnowacki.StreamExercise;

import org.junit.Test;

public class StreamTest {
    @Test
    public void test() {
        fillTheAArguments((a, b, c, d, e) -> {
            return String.format("%d,%d,%d,%d,%d", a, b, c, d, e);
        });
        sumSth((a, b, c, d, e) -> {
            return String.valueOf(a + b + c + d + e);
        });
        writeFunc((a, b, c, d, e) -> {
            int sum = a+b+c+d+e;
            return String.format("%d + %d + %d+%d+%d=%d", a, b, c, d, e, sum);
        });
    }

    public void fillTheAArguments(MyFuncInter inter) {
        System.out.println(inter.doSth(3, 5, 1, 6, 7));

    }

    public void sumSth(MyFuncInter inter) {
        System.out.println(inter.doSth(3, 5, 1, 6, 7));
    }
    public void writeFunc(MyFuncInter inter) {
        System.out.println(inter.doSth(3, 5, 1, 6, 4));
    }


}

