package com.pastsheep.testmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GemBlock extends Block {
    public GemBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f) //硬度等级和防爆等级
                .sound(SoundType.METAL) //踩上去的声音
                .harvestLevel(2) // 获取等级
                .setRequiresTool() // 只能用工具挖掘
                .harvestTool(ToolType.PICKAXE) // 挖掘工具
                .setLightLevel(value -> 15) //发光等级
        );
    }
}
