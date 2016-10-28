package object;

import object.TexttestFixture;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseTest {
    public static final String GOLDEN_MASTER_PATH = "/home/carvallegro/projects/coding_dojo/katas-HMP/gilded_rose/src/test/java/object/golden-master.txt";

    @Test
    public void golden_master() throws IOException {
        List<String> goldenMaster = Files.readAllLines(Paths.get(GOLDEN_MASTER_PATH), StandardCharsets.UTF_8);
        System.out.println(String.join("\n", goldenMaster));

        List<String> output = TexttestFixture.runGoldenMaster(new String[] {});
        output.remove(output.size() - 1);

        Assertions.assertThat(output).isEqualTo(goldenMaster);
    }

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

}
