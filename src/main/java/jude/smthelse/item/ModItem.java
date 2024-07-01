package jude.smthelse.item;

import jude.smthelse.SmthElseThen;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {

    public static Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static void addToVanillaGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SmthElseThen.MOD_ID, name), item);
    }
}
