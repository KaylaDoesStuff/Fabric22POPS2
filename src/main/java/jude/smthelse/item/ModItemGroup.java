package jude.smthelse.item;

import jude.smthelse.SmthElseThen;
import jude.smthelse.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup MYTHRIL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SmthElseThen.MOD_ID, "mythril"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mythril"))
                    .icon(() -> new ItemStack(ModItem.MYTHRIL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItem.MYTHRIL_INGOT);
                        entries.add(ModItem.RAW_MYTHRIL);
                        entries.add(ModItem.CIRNO_FUMO);

                        entries.add(ModBlock.MYTHRIL_BLOCK);
                    }).build());

}
