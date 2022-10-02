/*
package xyz.przemyk.timestopper.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import xyz.przemyk.timestopper.TimeStopperMod;
import xyz.przemyk.timestopper.capabilities.control.TimeState;
import xyz.przemyk.timestopper.capabilities.control.TimeStateHandlerProvider;

public class TimeStateSwitcherItem extends Item {
    public final TimeState OTHER_STATE;

    public TimeStateSwitcherItem(TimeState timeState) {
        super((new Properties()).m_41497_(Rarity.EPIC).m_41491_(TimeStopperMod.TIME_STOPPER_ITEM_GROUP).m_41487_(1));
        this.OTHER_STATE = timeState;
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level level, Player player, InteractionHand hand) {
        boolean success = (Boolean)player.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).map((h) -> {
            if (h.timeState == TimeState.NORMAL) {
                TimeStopperMod.setTimeState(player, this.OTHER_STATE, h);
                return true;
            } else if (h.timeState == this.OTHER_STATE) {
                TimeStopperMod.setTimeState(player, TimeState.NORMAL, h);
                return true;
            } else {
                player.m_5661_(Component.m_237115_("info.timestopper.cannot_change_state"), true);
                return false;
            }
        }).orElse(false);
        return success ? InteractionResultHolder.m_19090_(player.m_21120_(hand)) : InteractionResultHolder.m_19098_(player.m_21120_(hand));
    }

    public boolean onDroppedByPlayer(ItemStack item, Player player) {
        if (player.m_150109_().m_36022_((itemStack) -> {
            return itemStack.m_41720_() == this;
        }, 0, player.f_36095_.m_39730_()) == 1) {
            player.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).ifPresent((h) -> {
                if (h.timeState == this.OTHER_STATE) {
                    TimeStopperMod.setTimeState(player, TimeState.NORMAL, h);
                }

            });
        }

        return true;
    }
}
*/