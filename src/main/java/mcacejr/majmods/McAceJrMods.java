package mcacejr.majmods;

import mcacejr.majmods.block.ModBlocks;
import mcacejr.majmods.item.ModItemGroups;
import mcacejr.majmods.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class McAceJrMods implements ModInitializer {
	public static final String MOD_ID = "majmods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}