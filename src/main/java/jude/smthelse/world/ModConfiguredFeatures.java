package jude.smthelse.world;

import jude.smthelse.SmthElseThen;
import jude.smthelse.block.ModBlock;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> MYTHRIL_ORE_KEY = registerKey("mythril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldMythrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlock.MYTHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlock.DEEPSLATE_MYTHRIL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlock.TITANIUM_ORE.getDefaultState()));

        register(context, MYTHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMythrilOres, 12));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(SmthElseThen.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
