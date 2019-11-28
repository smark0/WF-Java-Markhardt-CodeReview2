public class Workout {
    public String exercise;
    public String description;
    public int duration;
    public String position;

    public Workout(String exercise, String description, int duration, String position) {
        this.exercise = exercise;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String getExercise() {
        return exercise;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "\n" + this.getExercise() + "               " + "DURATION: " + this.getDuration()+
                " SEC.\n----------------------------------------\nDESCRIPTION: " + this.getDescription();
    }
}


