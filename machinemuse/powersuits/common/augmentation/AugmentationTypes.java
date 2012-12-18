package machinemuse.powersuits.common.augmentation;

public enum AugmentationTypes {

	ArmorPlate("armorPlate", "Armor Plate", 1),
	DamageShieldPassive("shieldPassive", "Passive Shielding", 2),
	DamageShieldActive("shieldActive", "Active Shielding", 3),
	SteamGenerator("steamGenerator", "Steam Generator", 4),
	BatteryElectric("batteryElectric", "Electric Battery", 5),

	;

	public static int maxid = 6;
	public String idName;
	public String englishName;
	public int id;

	private AugmentationTypes(String idName, String englishName, int id) {
		this.idName = idName;
		this.englishName = englishName;
		this.id = id;
	}

	/**
	 * For readability and ease of editing.
	 * 
	 * @param list
	 * @param type
	 */
	private static void putList(AugmentationTypes[] list, AugmentationTypes type) {
		list[type.id] = type;
	}

	/**
	 * Returns an array of augmentations that are valid for a head slot item.
	 * 
	 * @param list
	 * @param type
	 */
	public static AugmentationTypes[] validHeadAugmentations() {
		AugmentationTypes[] list =
				new AugmentationTypes[AugmentationTypes.maxid];
		putList(list, ArmorPlate);
		putList(list, DamageShieldPassive);
		putList(list, DamageShieldActive);
		putList(list, SteamGenerator);
		putList(list, BatteryElectric);
		return list;
	}

	public static AugmentationTypes[] validTorsoAugmentations() {
		AugmentationTypes[] list =
				new AugmentationTypes[AugmentationTypes.maxid];
		putList(list, ArmorPlate);
		putList(list, DamageShieldPassive);
		putList(list, DamageShieldActive);
		putList(list, BatteryElectric);
		return list;
	}

	public static AugmentationTypes[] validLegsAugmentations() {
		AugmentationTypes[] list =
				new AugmentationTypes[AugmentationTypes.maxid];
		putList(list, ArmorPlate);
		putList(list, DamageShieldPassive);
		putList(list, DamageShieldActive);
		putList(list, BatteryElectric);
		return list;
	}

	public static AugmentationTypes[] validFeetAugmentations() {
		AugmentationTypes[] list =
				new AugmentationTypes[AugmentationTypes.maxid];
		putList(list, ArmorPlate);
		putList(list, DamageShieldPassive);
		putList(list, DamageShieldActive);
		putList(list, BatteryElectric);
		return list;
	}

	public static AugmentationTypes[] validToolAugmentations() {
		AugmentationTypes[] list =
				new AugmentationTypes[AugmentationTypes.maxid];
		putList(list, BatteryElectric);
		putList(list, SteamGenerator);
		return list;
	}
}