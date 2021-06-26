import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mytestTest {



    @Test
    void sayHi() {
        new mytest().sayHi();


    }

    @Test
    void test1() {
        new mytest().test();
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }
}