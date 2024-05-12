import java.util.*;

public class MadLibsGenrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String story = "On a dark night, Captain [silly name1] blasted off in their trusty spaceship, the [adjective] Rocket. Their mission: to find the legendary planet of [food1]. But danger lurked! A band of [number] grumpy [plural noun] blocked their path. Captain [silly name2] grabbed their [weapon] and yelled, 'Prepare to be defeated, space slugs!'  Will Captain [silly name3] find the delicious [food2]? Only time will tell!";

        String PartsOfSpeech[] = { "silly name1", "adjective", "food1", "number", "plural noun", "silly name2",
                "weapon", "silly name3", "food2" };
        int n = PartsOfSpeech.length;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a(n) " + PartsOfSpeech[i] + " :");
            String new_word = sc.nextLine();
            story = story.replace("[" + PartsOfSpeech[i] + "]", new_word);
        }

        System.out.println("Your Mad Libs stroy : ");
        System.out.println(story);

        sc.close();
    }
}
