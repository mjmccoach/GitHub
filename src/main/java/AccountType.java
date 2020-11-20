public enum AccountType {
    FREE ("Free"),
    PRO ("Pro");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getAccountType(){
        return this.value;
    }
}
