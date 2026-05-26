package uk.co.probablyfine.bytemonkey;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

public class ByteMonkeyAgent {

    public static void premain(String agentArguments, Instrumentation instrumentation) throws UnmodifiableClassException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /* Duplicate of premain(), needed for ea-agent-loader in tests */
    public static void agentmain(String agentArguments, Instrumentation instrumentation) throws UnmodifiableClassException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
