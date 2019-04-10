package TestUtils;

import java.util.Random;

public class CommonUtils {

	//get alpha numeric string based on the length 
	public String getRandomString(int stringLength) {		
		final String stringCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(stringLength);
        for (int i = 0; i < stringBuilder.capacity(); i++)
            stringBuilder.append(stringCharacters.charAt(random.nextInt(stringCharacters.length())));
        return stringBuilder.toString();
	}
}
