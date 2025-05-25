package mcacejr.majmods.item;

import mcacejr.majmods.McAceJrMods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SnowballItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FLINT_ALLOY = registerItem("flint_alloy", new Item(new FabricItemSettings()));
    public static final Item HOLLY_BERRY = registerItem("holly_berry", new Item(new FabricItemSettings().food(ModFoodComponents.HOLLY_BERRY_FOOD_COMP)));


    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(McAceJrMods.MOD_ID, name), item);

    }

    public static void registerModItems() {

        McAceJrMods.LOGGER.info("Registering Mod Items" + McAceJrMods.MOD_ID);

    }

}
