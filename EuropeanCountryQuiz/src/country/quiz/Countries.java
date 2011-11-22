package country.quiz;

import java.util.Random;

public enum Countries {
	ALBANIA("Albánie"), ANDORRA("Andorra"), ARMENIA("Arménie"), AUSTRIA(
			"Rakousko"), AZERBAIJAN("Ázerbajdžán"), BELARUS("Bìlorusko"), BELGIUM(
			"Belgie"), BOSNIA_AND_HERCEGOVINA("Bosna a Hercegovina"), BULGARIA(
			"Bulharsko"), CROATIA("Chorvatsko"), CYPRUS("Kypr"), CZECH_REPUBLIC(
			"Èeská republika"), DENMARK("Dánsko"), ESTONIA("Estonsko"), FINLAND(
			"Finsko"), FRANCE("Francie"), GEORGIA("Gruzie"), GERMANY("Nìmecko"), GREECE(
			"Øecko"), HUNGARY("Maïarsko"), ICELAND("Island"), IRELAND("Irsko"), ITALY(
			"Itálie"), KAZAKHSTAN("Kazachstán"), LATVIA("Lotyšsko"), LIECHTENSTEIN(
			"Lichtenštejnsko"), LITHUANIA("Litva"), LUXEMBOURG("Lucembursko"), REPUBLIC_OF_MACEDONIA(
			"Makedonie"), MALTA("Malta"), MOLDOVA("Moldavsko"), MONACO("Monako"), MONTENEGRO(
			"Èerná hora"), NETHERLANDS("Nizozemsko"), NORWAY("Norsko"), POLAND(
			"Polsko"), PORTUGAL("Portugalsko"), ROMANIA("Rumunsko"), RUSSIA(
			"Rusko"), SAN_MARINO("San Marino"), SERBIA("Srbsko"), SLOVAKIA(
			"Slovensko"), SLOVENIA("Slovinsko"), SPAIN("Španìlsko"), SWEDEN(
			"Švédsko"), SWITZERLAND("Švýcarsko"), TURKEY("Turecko"), UKRAINE(
			"Ukrajina"), UNITED_KINGDOM("Spojené království"), VATICAN(
			"Vaticán");

	private final String value;

	Countries(String s) {
		this.value = s;
	}

	public Countries fromValue(String value) {
		if (value != null) {
			for (Countries c : values()) {
				if (c.value.equals(value)) {
					return c;
				}
			}
		}

		return Countries.ALBANIA;
	}

	public String toValue() {
		return value;
	}

	public static Countries getRandomCountry() {
		Random r = new Random();
		int random = r.nextInt(Countries.values().length);
		return Countries.values()[random];
	}
}
