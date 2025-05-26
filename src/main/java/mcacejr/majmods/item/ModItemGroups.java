package mcacejr.majmods.item;

import mcacejr.majmods.McAceJrMods;
import mcacejr.majmods.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MCACEJR_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(McAceJrMods.MOD_ID, "holly_berry"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mcacejr_tab"))
                    .icon(() -> new ItemStack(ModItems.HOLLY_BERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.FLINT_ALLOY);
                    entries.add(ModItems.HOLLY_BERRY);
                    entries.add(ModBlocks.DEPTHSTONE);
                    entries.add(ModBlocks.DEPTHSTONE_BRICKS);
                    entries.add(ModBlocks.DEPTHSTONE_BRICK_STAIRS);
                    entries.add(ModBlocks.DEPTHSTONE_BRICK_SLAB);
                    entries.add(ModBlocks.DEPTHSTONE_BRICK_WALL);
                    entries.add(ModBlocks.CHISELED_DEPTHSTONE_BRICKS);
                    entries.add(ModBlocks.LICHEN_DEPTHSTONE_BRICKS);
                    entries.add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS);
                    entries.add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB);
                    entries.add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL);
                    entries.add(ModBlocks.DEPTHSTONE_LICHEN_LANTERN);
                    entries.add(ModBlocks.DEPTHSTONE_LANTERN);
                    entries.add(ModItems.STONE_CATALYST);
                    entries.add(ModItems.DEEPSLATE_CATALYST);
                    entries.add(ModItems.NETHERRACK_CAYALYST);
                    entries.add(ModBlocks.ORE_CLUSTER);
                    entries.add(ModItems.WOODEN_TRIMMINGS);
                    entries.add(ModItems.TREE_FEAST);
                    entries.add(ModItems.LEAFY_BUSHEL);
                    entries.add(ModItems.TREE_FORGED_ALLOY);
                    entries.add(ModItems.MOB_EFFIGY);
                    entries.add(ModItems.MONSTER_SOULSTONE);
                    entries.add(ModItems.MONSTROUS_TOTEM);
                    entries.add(ModItems.RESTORED_SHERD_TABLET);
                    entries.add(ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE);
                    entries.add(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(ModItems.ORE_CLUSTER_PICKAXE);
                    entries.add(ModItems.TWISTED_ROOT_AXE);
                    entries.add(ModItems.ANCIENT_SHERD_SHOVEL);
                    entries.add(ModItems.EXTRAVAGANT_GILDED_HOE);
                    entries.add(ModItems.LIVING_MOB_SWORD);
                    }).build());

    public static void registerItemGroups(){

        McAceJrMods.LOGGER.info("Registering Item Groups for " + McAceJrMods.MOD_ID);

    }

}
