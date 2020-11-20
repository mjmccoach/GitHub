public enum RepoType {
    PUBLIC ("Public"),
    PRIVATE ("Private");

    private final String value;

    RepoType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
