package MedicalManagementSystem;

public class Record {
    private int recordId = 1001;
    private String recordHolderFirstName;
    private String recordHolderSecondName;
    private int recordHolderAge;
    private String recordHolderEmail;
    private String recordHolderPhoneNumber;
    private String recordHolderweight;
    private String recordHolderHeight;

    public Record(int recordId, String recordHolderFirstName, String recordHolderSecondName,
                  int recordHolderAge, String recordHolderEmail, String recordHolderPhoneNumber,
                  String recordHolderWeight, String recordHolderHeight) {
        this.recordId = recordId++;
        this.recordHolderFirstName = recordHolderFirstName;
        this.recordHolderSecondName = recordHolderSecondName;
        this.recordHolderEmail = recordHolderEmail;
        this.recordHolderAge = recordHolderAge;
        this.recordHolderHeight = recordHolderHeight;
        this.recordHolderweight = recordHolderWeight;
        this.recordHolderPhoneNumber = recordHolderPhoneNumber;

    }

    public int getRecordId() {
        return recordId;
    }

    public String getRecordHolderFirstName() {
        return recordHolderFirstName;
    }

    public String getRecordHolderSecondName() {
        return recordHolderSecondName;
    }

    public int getRecordHolderAge() {
        return recordHolderAge;
    }

    public String getRecordHolderEmail() {
        return recordHolderEmail;
    }

    public String getRecordHolderPhoneNumber() {
        return recordHolderPhoneNumber;
    }

    public String getRecordHolderWeight() {
        return recordHolderweight;
    }

    public String getRecordHolderHeight() {
        return recordHolderHeight;
    }
}
