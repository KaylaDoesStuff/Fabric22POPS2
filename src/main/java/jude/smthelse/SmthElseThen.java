package jude.smthelse;

import jude.smthelse.item.ModItem;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmthElseThen implements ModInitializer {
	public static final String MOD_ID = "smthelsethen";
	public static final Logger LOGGER = LoggerFactory.getLogger("smthelsethen");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItem.registerModItems();
	}
}
