import java.util.ArrayList;

public class Repo {
    private String name;
    private String description;
    private repoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description) {
        this.name = name;
        this.description = description;
        this.commits = new ArrayList<>();
    }
}
