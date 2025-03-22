import java.util.Objects;

public class TeamMember {
    private String fullName;
    private String team;
    private String goalsAndObjectives;
    private String favoriteQuote;
    private int learningOutcomes;
    private int id;
    private static int counter = 1;

    public TeamMember(String fullName, String team, String goalsAndObjectives, String favoriteQuote, int learningOutcomes) {
        this.fullName = fullName;
        this.team = team;
        this.goalsAndObjectives = goalsAndObjectives;
        this.favoriteQuote = favoriteQuote;
        this.learningOutcomes = learningOutcomes;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTeam() {
        return team;
    }

    public String getGoalsAndObjectives() {
        return goalsAndObjectives;
    }

    public String getFavoriteQuote() {
        return favoriteQuote;
    }

    public int getLearningOutcomes() {
        return learningOutcomes;
    }

    public int getId() {
        return id;
    }

    public void setLearningOutcomes(int learningOutcomes) {
        this.learningOutcomes = learningOutcomes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TeamMember that = (TeamMember) o;
        return learningOutcomes == that.learningOutcomes && id == that.id && Objects.equals(fullName, that.fullName) && Objects.equals(team, that.team) && Objects.equals(goalsAndObjectives, that.goalsAndObjectives) && Objects.equals(favoriteQuote, that.favoriteQuote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, team, goalsAndObjectives, favoriteQuote, learningOutcomes, id);
    }

    @Override
    public String toString() {
        return id + ". ФИО: " + fullName + ", Команда: " + team + ", Цели и задачи: " + goalsAndObjectives + ", Любимая цитата: " + favoriteQuote + ", Результаты обучения: " + learningOutcomes ;
    }
}
