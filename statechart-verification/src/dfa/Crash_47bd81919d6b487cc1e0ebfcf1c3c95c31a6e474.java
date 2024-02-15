import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Crash_47bd81919d6b487cc1e0ebfcf1c3c95c31a6e474 {
    static final String base64Bytes = String.join("", "rO0ABXNyABNqYXZhLnV0aWwuQXJyYXlMaXN0eIHSHZnHYZ0DAAFJAARzaXpleHAAAAAGdwQAAAAGc3IAEWphdmEubGFuZy5JbnRlZ2VyEuKgpPeBhzgCAAFJAAV2YWx1ZXhyABBqYXZhLmxhbmcuTnVtYmVyhqyVHQuU4IsCAAB4cAAAAAVzcQB+AAIAAAAHc3EAfgACAAAABHNxAH4AAgAAAABxAH4AB3EAfgAHeA==");

    public static void main(String[] args) throws Throwable {
        Crash_47bd81919d6b487cc1e0ebfcf1c3c95c31a6e474.class.getClassLoader().setDefaultAssertionStatus(true);
        try {
            Method fuzzerInitialize = testcases.simulator2.TestFuzzer.class.getMethod("fuzzerInitialize");
            fuzzerInitialize.invoke(null);
        } catch (NoSuchMethodException ignored) {
            try {
                Method fuzzerInitialize = testcases.simulator2.TestFuzzer.class.getMethod("fuzzerInitialize", String[].class);
                fuzzerInitialize.invoke(null, (Object) args);
            } catch (NoSuchMethodException ignored1) {
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                System.exit(1);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(1);
        }
        com.code_intelligence.jazzer.api.CannedFuzzedDataProvider input = new com.code_intelligence.jazzer.api.CannedFuzzedDataProvider(base64Bytes);
        testcases.simulator2.TestFuzzer.fuzzerTestOneInput(input);
    }
}