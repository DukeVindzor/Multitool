package com.theblockworlds.multitool.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.theblockworlds.multitool.base.MultiToolEvent;

public class MultiToolDuplicationEvent extends MultiToolEvent {
	private ItemStack items;
	
	public MultiToolDuplicationEvent(Block block, Player player, ItemStack items) {
		super(block, player);
		this.items = items;
	}
	
	public ItemStack getItemStack() {
		return items;
	}
}
