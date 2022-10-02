//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper;

import java.util.Iterator;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.TickingBlockEntity;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.PacketDistributor;
import xyz.przemyk.timestopper.capabilities.control.TimeState;
import xyz.przemyk.timestopper.capabilities.control.TimeStateHandler;
import xyz.przemyk.timestopper.capabilities.control.TimeStateHandlerProvider;
import xyz.przemyk.timestopper.items.TimeStateSwitcherItem;
import xyz.przemyk.timestopper.network.PacketChangeTimeState;
import xyz.przemyk.timestopper.network.TimeStopperPacketHandler;
import xyz.przemyk.timestopper.setup.TimeStopperCapabilities;
import xyz.przemyk.timestopper.setup.TimeStopperItems;

@Mod("timestopper")
public class TimeStopperMod {
    public static final String MODID = "timestopper";
    public static final float TIME_FIELD_SIZE = 12.0F;
    public static final AABB scan = new AABB(-6.0D, -6.0D, -6.0D, 6.0D, 6.0D, 6.0D);
    public static final CreativeModeTab TIME_STOPPER_ITEM_GROUP = new CreativeModeTab("timestopper") {
        public ItemStack m_6976_() {
            return ((TimeStateSwitcherItem)TimeStopperItems.STOPPER.get()).m_7968_();
        }
    };

    public TimeStopperMod() {
        TimeStopperPacketHandler.init();
        TimeStopperItems.init();
        TimeStopperCapabilities.init();
    }

    public static boolean canUpdateEntity(Entity entity) {
        AABB toScan = scan.m_82383_(entity.m_20182_());
        if ((Boolean)entity.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).map((h) -> {
            return h.timeState == TimeState.STOPPED;
        }).orElse(false)) {
            return true;
        } else {
            Iterator var2 = entity.f_19853_.m_45976_(Player.class, toScan).iterator();

            Player playerEntity;
            do {
                if (!var2.hasNext()) {
                    return true;
                }

                playerEntity = (Player)var2.next();
            } while(playerEntity == entity || !(Boolean)playerEntity.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).map((h) -> {
                return h.timeState == TimeState.STOPPED;
            }).orElse(false));

            return false;
        }
    }

    public static void setTimeState(Player player, TimeState timeState, TimeStateHandler timeStateHandler) {
        timeStateHandler.timeState = timeState;
        player.m_5661_(timeStateHandler.timeState.toTextComponent(), true);
        if (!player.f_19853_.f_46443_) {
            TimeStopperPacketHandler.INSTANCE.send(PacketDistributor.ALL.noArg(), new PacketChangeTimeState(timeState, player.m_20148_()));
        }

    }

    public static void updateBlockEntity(TickingBlockEntity tickingBlockEntity, Level level) {
        TimeState timeState = TimeState.NORMAL;
        Iterator var3 = level.m_45976_(Player.class, scan.m_82338_(tickingBlockEntity.m_142689_())).iterator();

        while(var3.hasNext()) {
            Player playerEntity = (Player)var3.next();
            TimeState newTimeState = (TimeState)playerEntity.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).map((handler) -> {
                return handler.timeState;
            }).orElse(TimeState.NORMAL);
            if (newTimeState.ordinal() > timeState.ordinal()) {
                timeState = newTimeState;
            }
        }

        switch(timeState) {
            case NORMAL:
                tickingBlockEntity.m_142224_();
                break;
            case SLOW:
                if (level.m_46467_() % 2L == 0L) {
                    tickingBlockEntity.m_142224_();
                }
                break;
            case FAST:
                tickingBlockEntity.m_142224_();
                tickingBlockEntity.m_142224_();
        }

    }

    public static void updateEntity(Entity entity) {
        TimeState timeState = TimeState.NORMAL;
        Iterator var2 = entity.f_19853_.m_45976_(Player.class, scan.m_82383_(entity.m_20182_())).iterator();

        while(var2.hasNext()) {
            Player playerEntity = (Player)var2.next();
            if (entity != playerEntity) {
                TimeState newTimeState = (TimeState)playerEntity.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).map((handler) -> {
                    return handler.timeState == TimeState.STOPPED && (Boolean)entity.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).map((handlerEntity) -> {
                        return handlerEntity.timeState == TimeState.STOPPED;
                    }).orElse(false) ? TimeState.NORMAL : handler.timeState;
                }).orElse(TimeState.NORMAL);
                if (newTimeState.ordinal() > timeState.ordinal()) {
                    timeState = newTimeState;
                }
            }
        }

        switch(timeState) {
            case NORMAL:
                entity.m_8119_();
                break;
            case SLOW:
                if (entity.f_19853_.m_46467_() % 2L == 0L) {
                    entity.m_8119_();
                }
                break;
            case FAST:
                entity.m_8119_();
                entity.m_8119_();
        }

    }
}
*/