package darty;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public class GildedRose {
    public static final String CONJURED = "Conjured Mana Cake";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final int QUALITY_MAX = 50;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            // => Gestion du backstage passes & Aged Brie
            if (items[i].name.equals(AGED_BRIE)
                    || items[i].name.equals(BACKSTAGE_PASS)) {
                if (items[i].quality < QUALITY_MAX) {
                    items[i].quality = items[i].quality + 1;
                }
                if (items[i].name.equals(BACKSTAGE_PASS)) {
                    if (items[i].sellIn < 11 && items[i].quality < QUALITY_MAX) {
                        items[i].quality = items[i].quality + 1;
                    }


                    if (items[i].sellIn < 6 && items[i].quality < QUALITY_MAX) {
                        items[i].quality = items[i].quality + 1;
                    }


                }
            } else if (!items[i].name.equals(SULFURAS)) {
                // produits standards (ne se bonifient)
                items[i].quality = items[i].quality - 1;
                if (CONJURED.equals(items[i].name)) {
                    items[i].quality = items[i].quality - 1;
                }
            }


            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(AGED_BRIE)) {
                    if (!items[i].name.equals(BACKSTAGE_PASS)) {
                        if (!items[i].name.equals(SULFURAS)) {
                            items[i].quality = items[i].quality - 1;
                            if (CONJURED.equals(items[i].name)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < QUALITY_MAX) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }

            if (items[i].quality < 0) items[i].quality = 0;

        }

    }
}
