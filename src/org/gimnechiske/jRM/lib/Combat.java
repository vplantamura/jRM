package org.gimnechiske.jRM.lib;

public class Combat {
	/* Armor type */
	public static final int AT_NONE = 0;
	public static final int AT_1 = 1; // Skin
	public static final int AT_2 = 2; // Robes
	public static final int AT_3 = 3; // Light hide
	public static final int AT_4 = 4; // Heavy hide
	public static final int AT_5 = 5; // Leather Jerkin
	public static final int AT_6 = 6; // Leather Coat
	public static final int AT_7 = 7; // Reinforced Leather Coat
	public static final int AT_8 = 8; // Reinforced Full-Length Leather Coat
	public static final int AT_9 = 9; // Leather Breastplate
	public static final int AT_10 = 10; // Leather Breastplate Greaves
	public static final int AT_11 = 11; // Half-Hide Plate
	public static final int AT_12 = 12; // Full-Hide Plate
	public static final int AT_13 = 13; // Chain Shirt
	public static final int AT_14 = 14; // Chain Shirt & Greaves
	public static final int AT_15 = 15; // Full Chain
	public static final int AT_16 = 16; // Chain Hauberk
	public static final int AT_17 = 17; // Metal Breastplate
	public static final int AT_18 = 18; // Metal Breastplate & Greaves
	public static final int AT_19 = 19; // Half Plate
	public static final int AT_20 = 20; // Full Plate
	public static final int AT_I = 21; // Flak Vest
	public static final int AT_II = 22; // Extended Flak Vest
	public static final int AT_III = 23; // Reinforce Flak Vest
	public static final int AT_IV = 24; // Reinforced Flak Armor
	public static final int AT_V = 25; // Kinetic Vest
	public static final int AT_VI = 26; // Kinetic Jacket
	public static final int AT_VII = 27; // Kinetic Suit
	public static final int AT_VIII = 28; // Combat Breastplate
	public static final int AT_IX = 29; // Combat Breastplate & Greaves
	public static final int AT_X = 30; // Full Combat Armor
	public static final int AT_POWERED = 31; // Powered (Assault) Armor
	/* Attack, damage and critical types */
	public static final int DAMAGE_STUN = 0;
	public static final int DAMAGE_BLEED = 1;
	public static final int DAMAGE_KRUSH = 2;
	public static final int DAMAGE_SLASH = 3;
	public static final int DAMAGE_PUNCTURE = 4;
	public static final int DAMAGE_BALLISTIC_PUNCTURE = 5;
	public static final int DAMAGE_BALLISTIC_SHRAPNEL = 6;
	public static final int DAMAGE_BALLISTIC_IMPACT = 7;
	public static final int DAMAGE_BALLISTIC_HOLLOWPOINT = 8;
	public static final int DAMAGE_BALLISTIC_ARMORPIERCING = 9;
	public static final int DAMAGE_BLASTER = 10;
	public static final int DAMAGE_LASER = 11;
	public static final int DAMAGE_PLASMA = 12;
	public static final int DAMAGE_BURN_THROUGH = 13;
	public static final int DAMAGE_BURST = 14;
	public static final int DAMAGE_STUNNER = 15;
	public static final int DAMAGE_GRAPPLE = 16;
	public static final int DAMAGE_MARTIAL_ARTS_STRIKE = 17;
	public static final int DAMAGE_MARTIAL_ARTS_SWEEPS = 18;
	public static final int DAMAGE_POWERED_ARMOR = 19;
	public static final int DAMAGE_TINY = 20;
	public static final int DAMAGE_LARGE_CREATURE = 21;
	public static final int DAMAGE_SUPER_LARGE_CREATURE = 22;
	public static final int DAMAGE_LARGE_ANDROID = 23;
	public static final int DAMAGE_SUPER_LARGE_ANDROID = 24;
	public static final int DAMAGE_RADIATION = 25;
	public static final int DAMAGE_SHREDDING = 26;
	public static final int DAMAGE_NEURAL = 27;
	public static final int DAMAGE_COLD = 28;
	public static final int DAMAGE_ELECTRICITY = 29;
	public static final int DAMAGE_HEAT = 30;
	public static final int DAMAGE_SCORCHED = 31;
	public static final int DAMAGE_ANDROID_SCORCH = 32;
	public static final int DAMAGE_ANDROID_PUNCTURE = 33;
	public static final int DAMAGE_ANDROID_PIERCING = 34;
	public static final int DAMAGE_ANDROID_MELEE = 35;
	public static final int DAMAGE_ANDROID_ELECTRICAL = 36;
	public static final int DAMAGE_ANDROID_BURST_RAKING = 37;
	public static final int DAMAGE_ANDROID_BURN_THROUGH = 38;
	public static final int DAMAGE_ANDROID_BLAST = 39;
	public static final int DAMAGE_ACID = 40;
	public static final int DAMAGE_HOLY_WEAPON = 41;
	public static final int DAMAGE_HOLY_SPELL = 42;
	public static final int DAMAGE_RAKING = 43;
	public static final int DAMAGE_UNBALANCE = 44;
	public static final int DAMAGE_SUBDUAL = 45;
	public static final int DAMAGE_IMPACT = 46;
	public static final int DAMAGE_NERVE_STRIKE = 47;
	public static final int DAMAGE_LOCKING_HOLD = 48;
	public static final int DAMAGE_BRAWLING = 49;
	public static final int DAMAGE_ARCANE_AETHER = 50;
	public static final int DAMAGE_ARCANE_NETHER = 51;
	/* Action related Damage */
	public static final int DAMAGE_NO_PARRY = 100;
	public static final int DAMAGE_MUST_PARRY = 101;
	public static final int DAMAGE_TARGET_PENALTY = 102;
	public static final int DAMAGE_ATTACKER_BONUS = 103;
	/* Magical effects */
	public static final int DAMAGE_PP = 110;
	public static final int DAMAGE_CORRUPTION = 111;
	/* Fumble types */
	public static final int FUMBLE_ONE_HANDED = 0;
	public static final int FUMBLE_TWO_HANDED = 1;
	public static final int FUMBLE_POLEARMS = 2;
	public static final int FUMBLE_SPEAR = 3;
	public static final int FUMBLE_MOUNTED = 4;
	public static final int FUMBLE_THROWN = 5;
	public static final int FUMBLE_MISSILE = 6;
	public static final int FUMBLE_1H_FIREARM = 7;
	public static final int FUMBLE_2H_FIREARM = 8;
	public static final int FUMBLE_MUZZLE_LOADER = 9;
	public static final int FUMBLE_REVOLVER = 10;
	public static final int FUMBLE_FULL_AUTOMATIC = 11;
	public static final int FUMBLE_SEMI_AUTOMATIC = 12;
	public static final int FUMBLE_MA_STRIKE = 13;
	public static final int FUMBLE_MA_SWEEPS = 14;
	public static final int FUMBLE_BRAWLING = 15;
	public static final int FUMBLE_ANIMAL = 16;
	public static final int FUMBLE_MINI_WEAPONS = 17;
	public static final int FUMBLE_1H_ENERGY = 18;
	public static final int FUMBLE_2H_ENERGY = 19;
	public static final int FUMBLE_FULL_AUTOMATIC_ENERGY = 20;
}
