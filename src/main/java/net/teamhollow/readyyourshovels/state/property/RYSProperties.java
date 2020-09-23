package net.teamhollow.readyyourshovels.state.property;

import net.minecraft.state.property.IntProperty;

public class RYSProperties {
    /**
     * A property that specifies the acid level of an ant nest.
     */
    public static final IntProperty ACID_LEVEL = IntProperty.of("acid_level", 0, 5);
}
