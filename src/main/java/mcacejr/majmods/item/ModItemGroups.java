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
                    }).build());

    public static void registerItemGroups(){

        McAceJrMods.LOGGER.info("Registering Item Groups for " + McAceJrMods.MOD_ID);

    }

}
