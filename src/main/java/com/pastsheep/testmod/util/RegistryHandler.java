package com.pastsheep.testmod.util;

import com.pastsheep.testmod.ModLeader;
import com.pastsheep.testmod.blocks.BlockItemBase;
import com.pastsheep.testmod.items.ItemBase;
import com.pastsheep.testmod.blocks.GemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, ModLeader.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS, ModLeader.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }


    //物品
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",ItemBase::new);
    public static final RegistryObject<Item> EMERALD = ITEMS.register("emerald",ItemBase::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",ItemBase::new);
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",ItemBase::new);


    //方块放置
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block",GemBlock::new);
    public static final RegistryObject<Block> EMERALD_BLOCK = BLOCKS.register("emerald_block",GemBlock::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",GemBlock::new);
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block",GemBlock::new);


    //方块拿起
    public static final RegistryObject<Item> SAPPHIRE_ITEM = ITEMS.register("sapphire_block",() -> new BlockItemBase(SAPPHIRE_BLOCK.get()));
    public static final RegistryObject<Item> EMERALD_ITEM = ITEMS.register("emerald_block",() -> new BlockItemBase(EMERALD_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby_block",() -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> TOPAZ_ITEM = ITEMS.register("topaz_block",() -> new BlockItemBase(TOPAZ_BLOCK.get()));

}
