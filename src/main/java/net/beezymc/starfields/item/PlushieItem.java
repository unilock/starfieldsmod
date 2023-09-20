package net.beezymc.starfields.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class PlushieItem extends Item {
	public PlushieItem() {
		super(new FabricItemSettings().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendTooltip(ItemStack itemstack, World world, List<Text> list, TooltipContext flag) {
		super.appendTooltip(itemstack, world, list, flag);
		list.add(Text.literal("Can be placed on an item frame"));
	}
}
