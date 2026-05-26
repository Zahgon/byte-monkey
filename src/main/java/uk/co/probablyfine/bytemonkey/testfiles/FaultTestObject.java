package uk.co.probablyfine.bytemonkey.testfiles;

import java.io.IOException;

public class FaultTestObject {

    public void printSomething() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void printSomethingElse() throws IllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void printAndThrowNonPublicException() throws ExceptionWithNoPublicConstructor {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void safePrint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ExceptionWithNoPublicConstructor extends RuntimeException {

        // No constructor for you!
        private ExceptionWithNoPublicConstructor() {
        }
    }
}
