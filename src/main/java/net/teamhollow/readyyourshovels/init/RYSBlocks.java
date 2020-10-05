package net.teamhollow.readyyourshovels.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teamhollow.readyyourshovels.ReadyYourShovels;
import net.teamhollow.readyyourshovels.block.AntNestBlock;
import net.teamhollow.readyyourshovels.block.vanilla.*;
import net.teamhollow.readyyourshovels.tag.RYSBlockTags;

public class RYSBlocks {
    public static final Block DIRT_BRICKS = register("dirt_bricks",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).requiresTool()
                    .hardness(1.0F).resistance(1.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block DIRT_BRICK_SLAB = register("dirt_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(DIRT_BRICKS)));
    public static final Block DIRT_BRICK_STAIRS = register("dirt_brick_stairs",
            new PublicStairsBlock(DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIRT_BRICKS)));
    public static final Block DIRT_BRICK_WALL = register("dirt_brick_wall",
            new WallBlock(FabricBlockSettings.copy(DIRT_BRICKS)));

    public static final Block SMOOTH_DIRT = register("smooth_dirt",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).requiresTool()
                    .hardness(1.0F).resistance(1.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block SMOOTH_DIRT_SLAB = register("smooth_dirt_slab",
            new SlabBlock(FabricBlockSettings.copy(SMOOTH_DIRT)));
    public static final Block SMOOTH_DIRT_STAIRS = register("smooth_dirt_stairs",
            new PublicStairsBlock(SMOOTH_DIRT.getDefaultState(), FabricBlockSettings.copy(SMOOTH_DIRT)));
    public static final Block SMOOTH_DIRT_WALL = register("smooth_dirt_wall",
            new WallBlock(FabricBlockSettings.copy(SMOOTH_DIRT)));

    public static final Block TOUGH_DIRT = register("tough_dirt",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).requiresTool()
                    .hardness(1.0F).resistance(1.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block TOUGH_DIRT_SLAB = register("tough_dirt_slab",
            new SlabBlock(FabricBlockSettings.copy(TOUGH_DIRT)));
    public static final Block TOUGH_DIRT_STAIRS = register("tough_dirt_stairs",
            new PublicStairsBlock(TOUGH_DIRT.getDefaultState(), FabricBlockSettings.copy(TOUGH_DIRT)));
    public static final Block TOUGH_DIRT_WALL = register("tough_dirt_wall",
            new WallBlock(FabricBlockSettings.copy(TOUGH_DIRT)));

    public static final Block PEAT_BLOCK = register("peat_block",
            new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).breakByTool(FabricToolTags.PICKAXES)
                    .requiresTool().strength(1.5F, 6.0F)));
    public static final Block PEAT_BRICKS = register("peat_bricks",
            new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).breakByTool(FabricToolTags.PICKAXES)
                    .requiresTool().strength(2.0F, 6.0F)));
    public static final Block PEAT_BRICK_SLAB = register("peat_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(PEAT_BRICKS)));
    public static final Block PEAT_BRICK_STAIRS = register("peat_brick_stairs",
            new PublicStairsBlock(PEAT_BRICKS.getDefaultState(), FabricBlockSettings.copy(PEAT_BRICKS)));
    public static final Block PEAT_BRICK_WALL = register("peat_brick_wall",
            new WallBlock(FabricBlockSettings.copy(PEAT_BRICKS)));
    public static final Block CRACKED_PEAT_BRICKS = register("cracked_peat_bricks",
            new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).breakByTool(FabricToolTags.PICKAXES)
                    .requiresTool().strength(1.5F, 6.0F)));
    public static final Block CHISELED_PEAT_BRICKS = register("chiseled_peat_bricks",
            new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).breakByTool(FabricToolTags.PICKAXES)
                    .requiresTool().strength(1.5F, 6.0F)));

    public static final Block ANT_NEST = register(AntNestBlock.id, new AntNestBlock());

    public static final Block CLAY_DEPOSIT = register("clay_deposit",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).requiresTool()
                    .hardness(1.0F).resistance(1.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block GOLD_DEPOSIT = register("gold_deposit",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS, 2).requiresTool()
                    .hardness(2.0F).resistance(2.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block IRON_DEPOSIT = register("iron_deposit",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS, 1).requiresTool()
                    .hardness(1.5F).resistance(2.0F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block PEAT_DEPOSIT = register("peat_deposit",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).requiresTool()
                    .hardness(1.0F).resistance(1.5F).sounds(BlockSoundGroup.GRAVEL)));

    public static final Block REGOLITH = register("regolith",
            new Block(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS, 2).requiresTool()
                    .hardness(2.0F).resistance(2.5F).sounds(BlockSoundGroup.GRAVEL)));

    public static final Block OAK_PLANTER_BOX = register("oak_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_PLANTER_BOX = register("birch_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_PLANTER_BOX = register("spruce_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_PLANTER_BOX = register("dark_oak_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_PLANTER_BOX = register("acacia_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_PLANTER_BOX = register("jungle_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_PLANTER_BOX = register("crimson_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_PLANTER_BOX = register("warped_planter_box", new Block(FabricBlockSettings
            .of(Material.WOOD).hardness(2.5F).resistance(2.5F).sounds(BlockSoundGroup.WOOD)));

    public RYSBlocks() {}

    public static boolean blockIsOfPlanterBox(BlockState blockState) {
        return blockState.isIn(RYSBlockTags.PLANTER_BOXES);
    };

    public static Block register(String id, Block block, boolean registerItem) {
        Identifier identifier = new Identifier(ReadyYourShovels.MOD_ID, id);

        Block registeredBlock = Registry.register(Registry.BLOCK, identifier, block);
        if (registerItem) {
            int maxCount = 64;
            if (block instanceof SignBlock) maxCount = 16;

            Registry.register(Registry.ITEM, identifier, new BlockItem(registeredBlock, new Item.Settings().maxCount(maxCount).group(ReadyYourShovels.ITEM_GROUP)));
        }

        return registeredBlock;
    }
    public static Block register(String id, Block block) {
        return register(id, block, true);
    }
}
