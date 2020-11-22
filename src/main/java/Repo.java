import java.util.ArrayList;
import java.util.HashMap;

public class Repo {
    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, RepoType repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
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

    public String getRepoType() {
        return this.repoType.getValue();
    }

    public RepoType setToPrivate(Repo repo) {
        return repo.repoType = repoType.PRIVATE;
    }

    public RepoType setToPublic(Repo repo) {
        return repo.repoType = repoType.PUBLIC;
    }

    public void revertCommit() {
        int index = this.commits.size() -1;
        this.commits.remove(index);
    }
}
