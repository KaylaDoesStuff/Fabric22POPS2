package jude.smthelse.datagen;

import jude.smthelse.block.ModBlock;
import jude.smthelse.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlock.MYTHRIL_BLOCK);
        addDrop(ModBlock.TITANIUM_BLOCK);

        addDrop(ModBlock.MYTHRIL_ORE, copperLikeOreDrops(ModBlock.MYTHRIL_ORE, ModItem.RAW_MYTHRIL));
        addDrop(ModBlock.TITANIUM_ORE, oreDrops(ModBlock.TITANIUM_ORE, ModItem.RAW_TITANIUM));
        addDrop(ModBlock.DEEPSLATE_MYTHRIL_ORE, copperLikeOreDrops(ModBlock.DEEPSLATE_MYTHRIL_ORE, ModItem.RAW_MYTHRIL));

    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootTableEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 5f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
