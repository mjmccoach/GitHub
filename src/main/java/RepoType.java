public enum RepoType {
    PUBLIC ("Public"),
    PRIVATE ("Private");

    private String value;

    RepoType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
//    public void setToPrivate() {
//        this.value = "Private";
//    }
}
