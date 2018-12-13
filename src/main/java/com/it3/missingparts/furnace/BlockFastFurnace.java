package com.it3.missingparts.furnace;


import com.it3.missingparts.MissingParts;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockFastFurnace extends Block {

    public static final ResourceLocation FAST_FURNACE = new ResourceLocation(MissingParts.MODID, "fast_furnace");

    public BlockFastFurnace() {
        super(Material.IRON);

        // missingparts.fast_furnace
        setRegistryName(FAST_FURNACE);
        setUnlocalizedName(MissingParts.MODID + ".fast_furnace");     // Used for localization (en_US.lang)
        setHarvestLevel("pickaxe",0);
        setCreativeTab(MissingParts.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
