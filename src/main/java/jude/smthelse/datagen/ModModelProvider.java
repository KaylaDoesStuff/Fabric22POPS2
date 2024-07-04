package jude.smthelse.datagen;

import jude.smthelse.block.ModBlock;
import jude.smthelse.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.DEEPSLATE_MYTHRIL_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.TITANIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItem.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItem.MYTHRIL_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItem.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItem.CIRNO_FUMO, Models.GENERATED);

        itemModelGenerator.register(ModItem.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItem.RAW_TITANIUM, Models.GENERATED);
    }
}
