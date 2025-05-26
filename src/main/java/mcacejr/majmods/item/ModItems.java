package mcacejr.majmods.item;

import mcacejr.majmods.McAceJrMods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item FLINT_ALLOY = registerItem("flint_alloy",
            new Item(new FabricItemSettings()));
    public static final Item HOLLY_BERRY = registerItem("holly_berry",
            new Item(new FabricItemSettings().food(ModFoodComponents.HOLLY_BERRY_FOOD_COMP)));

    public static final Item LEGENDARY_UPGRADE_SMITHING_TEMPLATE = registerItem("legendary_upgrade_smithing_template",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item LEGENDARY_REPAIR_SMITHING_TEMPLATE = registerItem("legendary_repair_smithing_template",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    public static final Item STONE_CATALYST = registerItem("stone_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item DEEPSLATE_CATALYST = registerItem("deepslate_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NETHERRACK_CAYALYST = registerItem("netherrack_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item WOODEN_TRIMMINGS = registerItem("wooden_trimmings",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TREE_FEAST = registerItem("tree_feast",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item LEAFY_BUSHEL = registerItem("leafy_bushel",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TREE_FORGED_ALLOY = registerItem("tree_forged_alloy",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MOB_EFFIGY = registerItem("mob_effigy",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MONSTER_SOULSTONE = registerItem("monster_soulstone",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MONSTROUS_TOTEM = registerItem("monstrous_totem",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item RESTORED_SHERD_TABLET = registerItem("restored_sherd_tablet",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item ORE_CLUSTER_PICKAXE = registerItem("ore_cluster_pickaxe",
            new PickaxeItem(ModToolMaterial.LEGENDARY, 1, -2.4f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item TWISTED_ROOT_AXE = registerItem("twisted_root_axe",
            new AxeItem(ModToolMaterial.LEGENDARY, 7, -3.0f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item ANCIENT_SHERD_SHOVEL = registerItem("ancient_sherd_shovel",
            new ShovelItem(ModToolMaterial.LEGENDARY, 1, -2.4f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item EXTRAVAGANT_GILDED_HOE = registerItem("extravagant_gilded_hoe",
            new HoeItem(ModToolMaterial.LEGENDARY, -5, 0f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item LIVING_MOB_SWORD = registerItem("living_mob_sword",
            new SwordItem(ModToolMaterial.LEGENDARY, 4, -2.4f, new FabricItemSettings().rarity(Rarity.EPIC)));


    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(McAceJrMods.MOD_ID, name), item);

    }

    public static void registerModItems() {

        McAceJrMods.LOGGER.info("Registering Mod Items" + McAceJrMods.MOD_ID);

    }

}
