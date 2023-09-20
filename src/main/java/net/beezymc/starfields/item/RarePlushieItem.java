package net.beezymc.starfields.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class RarePlushieItem extends Item {
	public RarePlushieItem() {
		super(new Item.Settings().maxCount(64).rarity(Rarity.RARE));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendTooltip(ItemStack itemstack, World world, List<Text> list, TooltipContext flag) {
		super.appendTooltip(itemstack, world, list, flag);
		list.add(Text.literal("Can be placed on an item frame"));
	}
}