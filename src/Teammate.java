public class Teammate {

    @Override
    public String toString() {
        return "Teammate{" +
                "name='" + name + '\'' +
                ", hasRring=" + hasRring +
                '}';
    }

    private String name;
    private boolean hasRring;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasRring() {
        return hasRring;
    }

    public void setHasRring(boolean hasRring) {
        this.hasRring = hasRring;
    }

    public Teammate(String name, boolean hasRring) {
        this.name = name;
        this.hasRring = hasRring;
    }
}
