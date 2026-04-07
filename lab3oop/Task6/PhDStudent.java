package Task6;

import java.util.Objects;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    protected boolean canAcceptPet(Animal pet) {
        return !(pet instanceof Dog);
    }

    @Override
    public String getOccupation() {
        return "PhD Student: " + getMajor() + ", research: " + researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", researchTopic='" + researchTopic + "'";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        PhDStudent that = (PhDStudent) o;
        return Objects.equals(researchTopic, that.researchTopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), researchTopic);
    }
}