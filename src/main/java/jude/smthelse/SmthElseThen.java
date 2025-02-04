package jude.smthelse;

import jude.smthelse.item.ModItem;
import jude.smthelse.block.ModBlock;
import jude.smthelse.item.ModItemGroup;
import jude.smthelse.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmthElseThen implements ModInitializer {
	public static final String MOD_ID = "smthelsethen";
	public static final Logger LOGGER = LoggerFactory.getLogger("smthelsethen");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItem.registerModItems();
		ModBlock.registerModBlocks();
		ModItemGroup.registerModGroups();
		ModWorldGeneration.generateModWorldGen();
	}
}
