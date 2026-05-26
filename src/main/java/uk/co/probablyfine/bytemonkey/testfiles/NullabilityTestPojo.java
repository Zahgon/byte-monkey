package uk.co.probablyfine.bytemonkey.testfiles;

public class NullabilityTestPojo {

    private String name;

    public NullabilityTestPojo(String name) {
        this.name = name;
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName1stArg(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName2ndArg(int i, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNameNoArgs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNamePrimitiveArgs(int i, int i2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
