package com.pastsheep.testmod.util;

import com.pastsheep.testmod.ModLeader;
import com.pastsheep.testmod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, ModLeader.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }


    //物品
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",ItemBase::new);

}
