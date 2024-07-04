package jude.smthelse.block;

import jude.smthelse.SmthElseThen;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlock {

    public static Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static Block MYTHRIL_ORE = registerBlock("mythril_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f)));
    public static Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f)));

    public static Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5f)));
    public static Block TITANIUM_ORE = registerBlock("titanium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SmthElseThen.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SmthElseThen.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SmthElseThen.LOGGER.info("Registering Blocks for " + SmthElseThen.MOD_ID);
    }
}
