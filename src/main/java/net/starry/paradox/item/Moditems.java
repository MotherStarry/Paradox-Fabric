package net.starry.paradox.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starry.paradox.Paradox;

public class Moditems {
    public static final Item FLAG_OF_HELL = registerItem("flag_of_hell", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Paradox.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Paradox.LOGGER.info("Hi, We are registering items for " + Paradox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FLAG_OF_HELL);
        });
    }
}
