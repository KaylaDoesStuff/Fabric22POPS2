package jude.smthelse.datagen;

import jude.smthelse.block.ModBlock;
import jude.smthelse.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> MYTHRIL_SMELTABLE = List.of(ModItem.RAW_MYTHRIL, ModBlock.MYTHRIL_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, MYTHRIL_SMELTABLE, RecipeCategory.MISC, ModItem.MYTHRIL_INGOT, 0.7f, 200, "mythril");
        offerBlasting(exporter, MYTHRIL_SMELTABLE, RecipeCategory.MISC, ModItem.MYTHRIL_INGOT, 0.7f, 100, "mythril");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItem.MYTHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlock.MYTHRIL_BLOCK);
    }
}
