/*//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package xyz.przemyk.timestopper.setup;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import xyz.przemyk.timestopper.capabilities.control.TimeStateHandler;

public class TimeStopperCapabilities {
    public TimeStopperCapabilities() {
    }

    public static void init() {
        MinecraftForge.EVENT_BUS.addListener(TimeStopperCapabilities::onRegisterCapabilities);
    }

    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        event.register(TimeStateHandler.class);
    }
}
*/