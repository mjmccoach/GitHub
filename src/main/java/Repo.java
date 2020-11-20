import java.util.ArrayList;

public class Repo {
    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description) {
        this.name = name;
        this.description = description;
        this.commits = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setDescription(String string) {
        this.description = string;
    }

    public int getCommits() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }
}
