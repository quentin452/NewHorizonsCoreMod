package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;

import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import gregtech.api.enums.ItemList;

public class ScriptEnderIO implements IScriptLoader {

    @Override
    public String getScriptName() {
        return "EnderIO";
    }

    @Override
    public List<String> getDependencies() {
        return Arrays.asList("EnderIO", "appliedenergistics2", "Avaritia");
    }

    @Override
    public void loadRecipes() {
        ItemStack teleportStaff = getModItem("EnderIO", "itemTeleportStaff", 1);
        ItemStack denseEnergyCell = getModItem("appliedenergistics2", "tile.BlockDenseEnergyCell", 1);
        ItemStack energyCell = getModItem("appliedenergistics2", "tile.BlockEnergyCell", 1);
        ItemStack staffOfTravelling = getModItem("EnderIO", "itemTravelStaff", 1, wildcard);
        ItemStack endestPearl = getModItem("Avaritia", "Endest_Pearl", 1);
        ItemStack fieldGeneratorZPM = ItemList.Field_Generator_ZPM.get(1);

        ExtremeCraftingManager.getInstance().addExtremeShapedOreRecipe(
                teleportStaff,
                "      aaa",
                "     abca",
                "    abcba",
                "   abcba ",
                "   daba  ",
                "  deda   ",
                " dfd     ",
                "dfd      ",
                " d       ",
                'a',
                "plateDenseObsidian",
                'b',
                denseEnergyCell,
                'c',
                energyCell,
                'd',
                staffOfTravelling,
                'e',
                endestPearl,
                'f',
                fieldGeneratorZPM);
    }
}