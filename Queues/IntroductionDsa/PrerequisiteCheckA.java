public class PrerequisiteCheckA {

    public static boolean hasCompletedAllPrerequisites(int[] completedCourses, int[] prerequisites) {

        for (int i = 0; i < prerequisites.length; i++) {

            boolean found = false;

            for (int j = 0; j < completedCourses.length; j++) {

                if (prerequisites[i] == completedCourses[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] completed = {101, 102, 103, 104};
        int[] prereq = {101, 104};

        boolean result = hasCompletedAllPrerequisites(completed, prereq);

        System.out.println("Eligible for Course: " + result);
    }
}
