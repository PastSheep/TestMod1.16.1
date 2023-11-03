package com.pastsheep.testmod.items;

import com.pastsheep.testmod.ModLeader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.client.model.ModelLoader;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ModLeader.GEM_TAB));
    }
}
