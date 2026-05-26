package uk.co.probablyfine.bytemonkey.testfiles;

import java.io.IOException;
import java.util.Random;

public class TryCatchTestObject {

    public String multipleTryCatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sourceIndependentTryCatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sourceDependentTryCatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String purelyResilientTryCatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getProperty(String key, Boolean isCacheActivated) throws MissingPropertyException {
        return null;
    }

    private String format(String arg) throws MissingPropertyException {
        return null;
    }

    private String getArgument() throws IOException {
        return null;
    }

    private boolean getCacheAvailability() {
        Random random = new Random();
        return random.nextDouble() < 0.5;
    }

    private String getPropertyFromFile(String key) {
        return "property_from_file";
    }

    private String getPropertyFromCache(String key) throws MissingPropertyException {
        return "property_from_cache";
    }

    public static class CacheDisableException extends RuntimeException {
    }

    public static void main(String[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
