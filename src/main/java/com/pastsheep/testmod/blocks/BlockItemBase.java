package com.pastsheep.testmod.blocks;

import com.pastsheep.testmod.ModLeader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ModLeader.GEM_TAB));
    }
}
