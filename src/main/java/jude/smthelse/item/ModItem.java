package jude.smthelse.item;

import jude.smthelse.SmthElseThen;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {

    public static Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings()));
    public static Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SmthElseThen.MOD_ID, name), item);
    }
}
