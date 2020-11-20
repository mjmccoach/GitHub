public class Commit {
    private String description;
    private int uniqueId;

    public Commit(String description, int uniqueId){
        this.description = description;
        this.uniqueId = uniqueId;
    }

    public String getDescription(){
        return this.description;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }

    public void setDescription(String string){
        this.description =  string;
    }
}
