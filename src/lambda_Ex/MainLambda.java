package lambda_Ex;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class MainLambda {
    static Logger log = LoggerFactory.getLogger(MainLambda.class);
    public static void main(String[] args) {
        FunVoidVoid fvv = () -> log.debug("lambda test..."); // 익명 클래스
        fvv.hello();

        FunIntInt fii = (x, y) -> x + y;
        log.debug("result : " + fii.exe(3, 4));

        fii = (x, y) -> x - y;
        log.debug("result" + fii.exe(10, 4));

        fii = (x,y)->{
            int sum1 = 0;
            int sum2 =0;
            for (int i = 1; i <= x; i++) {
                sum1 += i;
            }

            for (int i = 1; i <= y; i++) {
                sum2 +=i;
            }

            return sum1 + sum2;
        };

        System.out.println("result : " + fii.exe(5, 10));

        FunVoidString fvs = (name) -> System.out.println(name.toUpperCase());
        fvs.hello("goodee");
        fvs = (name) -> System.out.println(name.substring(0, 1));
        fvs.hello("goodee");
    }
}
