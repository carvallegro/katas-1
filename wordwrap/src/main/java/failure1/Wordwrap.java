package failure1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HadrienMP on 07/06/2016.
 */
public class Wordwrap {
    public static String wrap(String toWrap, int limit) {
        List<Integer> pointsToSplit = new ArrayList<>();
        int spaceIndex = 0;
        int lastSpaceIndex = 0;
        while (lastSpaceIndex != -1) {
            spaceIndex = toWrap.indexOf(' ', lastSpaceIndex +1);

            if (spaceIndex > limit || spaceIndex == -1 && lastSpaceIndex != 0) {
                toWrap = toWrap.substring(0, lastSpaceIndex) + "\n" + toWrap.substring(lastSpaceIndex + 1, toWrap.length());
            }

            lastSpaceIndex = spaceIndex;
        }
        return toWrap;
    }
}
