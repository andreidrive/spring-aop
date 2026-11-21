package andrei.dev.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;

@Aspect
@Component
public class NotNullArgsAspect {

    private final static String SPACE = " ";

    @Around("@annotation(notNullArgs)")
    public Object checkNull(ProceedingJoinPoint pjp, NotNullArgs notNullArgs) throws Throwable {
        List<String> nullArgNames = getNullArgNames(pjp.getArgs());

        if (!nullArgNames.isEmpty()) {
            throw new IllegalArgumentException(pjp.getSignature().getName() + SPACE + nullArgNames + " are null");
        }
        return pjp.proceed();
    }

    public List<String> getNullArgNames(Object[] args) {
        if (args == null) {
            return List.of();
        }
        return IntStream.range(0, args.length)
                .filter(i -> args[i] == null)
                .mapToObj(i -> "arg[" + i + "]")
                .toList();
    }
}
