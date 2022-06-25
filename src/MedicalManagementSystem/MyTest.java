package MedicalManagementSystem;

public class MyTest {
    private  int testId;
    private  String testType;

    public MyTest(int testId, String testType) {
        this.testId = testId;
        this.testType = testType;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
