public class IntervalWorkout {
    private Workout[] workouts;
    private int reps;
    private int breakTime;

    public IntervalWorkout(Workout[] workouts, int reps, int breakTime) {

        this.workouts = workouts;
        this.reps = reps;
        this.breakTime = breakTime;
    }

    public void createInterval() {
        System.out.println("****************************");
        System.out.println("Interval Workout - BEGIN !!!!");
        System.out.println("****************************");


        for (int i = 1; i < reps; i++) {

            System.out.println("============================");
            System.out.println("Round " + i + " : ");

            for (Workout workout : workouts) // reminder: do not use curlies
                System.out.println(workout.getExercise());

            if (i < reps) {
                System.out.println("============================");
                System.out.println("DO THE BREAK (" + breakTime + " SECONDS)");
            }
        }
        System.out.println("****************************");
        System.out.println(" CONGRATS - YOU ARE DONE !!!");
        System.out.println("****************************");

    }
}
