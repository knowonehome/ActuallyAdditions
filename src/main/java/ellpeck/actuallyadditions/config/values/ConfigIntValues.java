package ellpeck.actuallyadditions.config.values;

import ellpeck.actuallyadditions.config.ConfigCategories;
import ellpeck.actuallyadditions.config.ConfigValues;

public enum ConfigIntValues{

    JAM_VILLAGER_ID("Jam Villager: ID", ConfigCategories.WORLD_GEN, 493827, 100, 1000000, "The ID of the Jam Villager"),

    LEAF_BLOWER_RANGE_SIDES("Leaf Blower: Side Range", ConfigCategories.TOOL_VALUES, 5, 1, 25, "The Leaf Blower's Range to the Sides"),
    LEAF_BLOWER_RANGE_UP("Leaf Blower: Range Up", ConfigCategories.TOOL_VALUES, 1, 1, 10, "The Leaf Blower's Range Up"),

    BLACK_QUARTZ_BASE_AMOUNT("Black Quartz Amount", ConfigCategories.WORLD_GEN, 3, 1, 50, "How big a Black Quartz Vein is at least"),
    BLACK_QUARTZ_ADD_CHANCE("Black Quartz Additional Chance", ConfigCategories.WORLD_GEN, 3, 0, 50, "How much bigger than the Base Amount a Black Quartz Vein can get"),
    BLACK_QUARTZ_CHANCE("Black Quartz Chance", ConfigCategories.WORLD_GEN, 5, 1, 150, "How often the Black Quartz tries to generate"),
    BLACK_QUARTZ_MIN_HEIGHT("Black Quartz Min Height", ConfigCategories.WORLD_GEN, 0, 0, 256, "How high the Black Quartz starts to generate"),
    BLACK_QUARTZ_MAX_HEIGHT("Black Quartz Max Height", ConfigCategories.WORLD_GEN, 25, 0, 256, "How high the Black Quartz stops to generate at"),

    COMPOST_AMOUNT("Compost: Amount Needed To Convert", ConfigCategories.MACHINE_VALUES, 10, 1, 64, "How many items are needed in the Compost to convert to Fertilizer"),
    COMPOST_TIME("Compost: Conversion Time Needed", ConfigCategories.MACHINE_VALUES, 1000, 30, 10000, "How long the Compost needs to convert to Fertilizer"),

    FISHER_TIME("Fishing Net: Time Needed", ConfigCategories.MACHINE_VALUES, 15000, 50, 500000, "How long it takes on Average until the Fishing Net catches a Fish"),

    FEEDER_REACH("Feeder: Reach", ConfigCategories.MACHINE_VALUES, 5, 1, 20, "The Radius of Action of the Feeder"),
    FEEDER_TIME("Feeder: Time Needed", ConfigCategories.MACHINE_VALUES, 100, 50, 5000, "The time spent between feeding animals with the Feeder"),
    FEEDER_THRESHOLD("Feeder: Threshold", ConfigCategories.MACHINE_VALUES, 30, 3, 500, "How many animals need to be in the area for the Feeder to stop"),

    KNIFE_DAMAGE("Knife: Max Uses", ConfigCategories.TOOL_VALUES, 100, 5, 5000, "How often the Knife can be crafted with"),

    EMERALD_HARVEST_LEVEL("Emerald: Harvest Level", ConfigCategories.TOOL_VALUES, 3, 0, 3, "What Harvest Level Emerald Tools have (0 = Wood, 1 = Stone, 2 = Iron, 3 = Diamond)"),
    EMERALD_USES("Emerald: Max Uses", ConfigCategories.TOOL_VALUES, 2000, 50, 10000, "How often Emerald Tools can be used"),
    EMERALD_ENCHANTABILITY("Emerald: Enchantability", ConfigCategories.TOOL_VALUES, 15, 1, 30, "How enchantable an Emerald Tool is"),

    OBSIDIAN_HARVEST_LEVEL("Obsidian: Harvest Level", ConfigCategories.TOOL_VALUES, 3, 0, 3, "What Harvest Level Obsidian Tools have (0 = Wood, 1 = Stone, 2 = Iron, 3 = Diamond)"),
    OBSIDIAN_USES("Obsidian: Max Uses", ConfigCategories.TOOL_VALUES, 8000, 50, 20000, "How often Obsidian Tools can be used"),
    OBSIDIAN_ENCHANTABILITY("Obsidian: Enchantability", ConfigCategories.TOOL_VALUES, 15, 1, 30, "How enchantable an Obsidian Tool is"),

    GRINDER_CRUSH_TIME("Crusher: Time", ConfigCategories.MACHINE_VALUES, 100, 10, 1000, "How long the Crusher takes to crush an item"),
    GRINDER_DOUBLE_CRUSH_TIME("Double Crusher: Time", ConfigCategories.MACHINE_VALUES, 150, 10, 1000, "How long the Double Crusher takes to crush an item"),
    FURNACE_DOUBLE_SMELT_TIME("Double Furnace: Time", ConfigCategories.MACHINE_VALUES, 80, 10, 1000, "How long the Double Furnace takes to crush an item"),

    REPAIRER_SPEED_SLOWDOWN("Repairer: Speed Slowdown", ConfigCategories.MACHINE_VALUES, 2, 1, 100, "How much slower the Item Repairer repairs"),
    HEAT_COLLECTOR_BLOCKS("Heat Collector: Blocks Needed", ConfigCategories.MACHINE_VALUES, 4, 1, 5, "How many Blocks are needed for the Heat Collector to power Machines above it"),
    HEAT_COLLECTOR_LAVA_CHANCE("Heat Collector: Random Chance", ConfigCategories.MACHINE_VALUES, 10000, 10, 100000, "The Chance of the Heat Collector destroying a Lava Block around (Default Value 2000 meaning a 1/2000 Chance!)"),

    GLASS_TIME_NEEDED("Greenhouse Glass: Time", ConfigCategories.MACHINE_VALUES, 5000, 10, 1000000, "The Time Needed for the Greenhouse Glass to grow a Plant below it"),

    BREAKER_TIME_NEEDED("Breaker and Placer: Time Needed", ConfigCategories.MACHINE_VALUES, 15, 1, 10000, "The Time Needed for the Breaker and the Placer to place or break a Block"),
    DROPPER_TIME_NEEDED("Dropper: Time Needed", ConfigCategories.MACHINE_VALUES, 10, 1, 10000, "The Time Needed for the Dropper to drop an Item"),

    CAT_DROP_CHANCE("Cat Drops: Chance", ConfigCategories.OTHER, 5000, 5, 10000000, "The 1 in X chance for a Hairy Ball to Drop from a Cat with X being this value"),

    RICE_AMOUNT("Rice Amount", ConfigCategories.WORLD_GEN, 15, 1, 100, "The Chance of Rice generating"),
    CANOLA_AMOUNT("Canola Amount", ConfigCategories.WORLD_GEN, 2, 1, 50, "The Chance of Canola generating"),

    GRINDER_ENERGY_USED("Energy Use: Crusher", ConfigCategories.MACHINE_VALUES, 40, 1, 500, "The Amount of Energy used by the Crusher per Tick"),
    GRINDER_DOUBLE_ENERGY_USED("Energy Use: Double Crusher", ConfigCategories.MACHINE_VALUES, 60, 1, 500, "The Amount of Energy used by the Double Crusher per Tick"),
    FURNACE_SOLAR_ENERGY_PRODUCED("Energy Production: Furnace Solar", ConfigCategories.MACHINE_VALUES, 15, 1, 500, "The Amount of Energy produced by the Solar per Tick"),
    HEAT_COLLECTOR_ENERGY_PRODUCED("Energy Production: Heat Collector", ConfigCategories.MACHINE_VALUES, 30, 1, 500, "The Amount of Energy produced by the Heat Collector per Tick"),
    REPAIRER_ENERGY_USED("Energy Use: Repairer", ConfigCategories.MACHINE_VALUES, 1250, 1, 5000, "The Amount of Energy used by the Repairer per Tick"),
    FURNACE_ENERGY_USED("Energy Use: Double Furnace", ConfigCategories.MACHINE_VALUES, 25, 1, 500, "The Amount of Energy used by the Double Furnace per Tick"),

    PRESS_PROCESSING_TIME("Canola Press: Processing Time", ConfigCategories.MACHINE_VALUES, 30, 1, 1000, "The Amount of time it takes to process one Canola"),
    PRESS_MB_PRODUCED("Canola Press: mB Produced", ConfigCategories.MACHINE_VALUES, 30, 1, 5000, "The Amount of Canola Oil produced from one Canola"),
    PRESS_ENERGY_USED("Energy Use: Canola Press", ConfigCategories.MACHINE_VALUES, 35, 10, 500, "The Amount of Energy used by the Canola Press per Tick"),

    BARREL_MB_PRODUCED("Fermenting Barrel: mB Produced", ConfigCategories.MACHINE_VALUES, 50, 1, 3000, "The Amount of mB produced by the Barrel per cycle"),
    BARREL_PROCESSING_TIME("Fermenting Barrel: Processing Time", ConfigCategories.MACHINE_VALUES, 100, 1, 5000, "The Amount of time it takes to process one Canola Oil to Oil"),

    COAL_GEN_ENERGY_PRODUCED("Coal Generator: Energy Produced", ConfigCategories.MACHINE_VALUES, 30, 1, 500, "The Amount of Energy generated by the Coal Generator"),

    PHANTOMFACE_RANGE("Phantomface: Default Range", ConfigCategories.MACHINE_VALUES, 16, 3, 100, "The Default Range of the Phantomface");

    public final String name;
    public final String category;
    public final int defaultValue;
    public final int min;
    public final int max;
    public final String desc;

    ConfigIntValues(String name, ConfigCategories category, int defaultValue, int min, int max, String desc){
        this.name = name;
        this.category = category.name;
        this.defaultValue = defaultValue;
        this.min = min;
        this.max = max;
        this.desc = desc;
    }

    public int getValue(){
        return ConfigValues.intValues[this.ordinal()];
    }
}