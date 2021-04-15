package docs;

import org.junit.jupiter.api.Test;

import static utils.RandomUtils.*;

public class RandomExamples {
    @Test
    void randomExample() {
        String randomString = getRandomString(22);
        System.out.println(randomString);

        String randomMessage = getRandomMessage(22, 100);
        System.out.println(randomMessage);

        int randomInt = getRandomInt(223333, 1000000);
        System.out.println(randomInt);

        String randomPhone = getRandomPhone();
        System.out.println(randomPhone);

        String randomEmail = getRandomEmail();
        System.out.println(randomEmail);
    }
}
