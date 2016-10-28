package object;

/**
 * Created by carvallegro on 28/10/16.
 */
public class QualityStrategy {
    private static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED_BRIE = "Aged Brie";
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public static void updateItem(Item item) {
        if (isItemImmutable(item)) {
            return;
        }

        updateFreshItemQuality(item);

        item.sellIn = item.sellIn - 1;

        updateOutdatedItemQuality(item);

        boundarizeQuality(item);

    }

    private static boolean isItemImmutable(Item item) {
        return item.name.equals(SULFURAS);
    }

    private static void updateFreshItemQuality(Item item) {
        if (item.name.equals(AGED_BRIE)) {
            item.quality = item.quality + 1;

        } else if (item.name.equals(BACKSTAGE_PASSES)) {
            backstageFreshQuality(item);
        } else {
            item.quality = item.quality - 1;
            if (item.name.equals(CONJURED_MANA_CAKE) && item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    private static void backstageFreshQuality(Item item) {
        item.quality = item.quality + 1;
        if (item.sellIn < 11) {
            if (item.quality < MAX_QUALITY) {
                item.quality = item.quality + 1;
            }
        }
        if (item.sellIn < 6) {
            if (item.quality < MAX_QUALITY) {
                item.quality = item.quality + 1;
            }
        }
    }

    private static void updateOutdatedItemQuality(Item item) {
        if (item.sellIn < 0) {
            if (item.name.equals(AGED_BRIE)) {
                item.quality = Math.min(MAX_QUALITY, item.quality + 1);
            } else if (item.name.equals(BACKSTAGE_PASSES)) {
                item.quality = 0;
            } else {
                item.quality = item.quality - 1;
                if (item.name.equals(CONJURED_MANA_CAKE)) {
                    item.quality = item.quality - 1;
                }
            }
        }
    }

    private static void boundarizeQuality(Item item) {
        item.quality = Math.max(MIN_QUALITY, item.quality);
        item.quality = Math.min(MAX_QUALITY, item.quality);
    }

}
