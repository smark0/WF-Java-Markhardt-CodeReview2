public class main {
    private static Workout[] workouts = {
            new Workout("Push-Ups", "Place your hands on the floor. " +
                    "Raise up onto your toes so that all of your body weight is on your hands and your feet. " +
                    "Bend your elbows and lower your chest down toward the floor. " +
                    "Then, push off the floor and extend them so that you return to starting position.", 30, "floor"),
            new Workout("Planks", "Start on the floor on your hands and knees. " +
                    "Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. " +
                    "Maintain a straight line from heels through the top of your head, looking down at the floor. " +
                    "Now, tighten your abs and hold.", 90, "floor"),
            new Workout("Squats", "Stand with feet a little wider than shoulder-width apart, " +
                    "hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, " +
                    "palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, "standup"),
            new Workout("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. " +
                    "Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  " +
                    "Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. " +
                    "Return to the starting position and repeat. ", 60, "floor"),
            new Workout("Leg Curl", "Stand up on, shift your weight to  one feet and" +
                    " pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, "standup"),
            new Workout("Sidewards Back Stretch", "Go into standing position, put your hands on your" +
                    " hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, "standup"),
    };

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("Welcome to the Workout Database!");
        System.out.println("--------------------------------");
        showWorkouts();
        Workout[] intervalWorkout = {workouts[0],workouts[1],workouts[2]};
        IntervalWorkout iWorkout = new IntervalWorkout(intervalWorkout,5,45);
        iWorkout.createInterval();


    }

    public static void showWorkouts() {
        for (Workout workout : workouts) {
            System.out.println(workout);
        }
    }
}
