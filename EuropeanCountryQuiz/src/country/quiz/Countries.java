package country.quiz;

import java.util.Random;

public enum Countries {
	ALBANIA("Alb�nie"), ANDORRA("Andorra"), ARMENIA("Arm�nie"), AUSTRIA(
			"Rakousko"), AZERBAIJAN("�zerbajd��n"), BELARUS("B�lorusko"), BELGIUM(
			"Belgie"), BOSNIA_AND_HERCEGOVINA("Bosna a Hercegovina"), BULGARIA(
			"Bulharsko"), CROATIA("Chorvatsko"), CYPRUS("Kypr"), CZECH_REPUBLIC(
			"�esk� republika"), DENMARK("D�nsko"), ESTONIA("Estonsko"), FINLAND(
			"Finsko"), FRANCE("Francie"), GEORGIA("Gruzie"), GERMANY("N�mecko"), GREECE(
			"�ecko"), HUNGARY("Ma�arsko"), ICELAND("Island"), IRELAND("Irsko"), ITALY(
			"It�lie"), KAZAKHSTAN("Kazachst�n"), LATVIA("Loty�sko"), LIECHTENSTEIN(
			"Lichten�tejnsko"), LITHUANIA("Litva"), LUXEMBOURG("Lucembursko"), REPUBLIC_OF_MACEDONIA(
			"Makedonie"), MALTA("Malta"), MOLDOVA("Moldavsko"), MONACO("Monako"), MONTENEGRO(
			"�ern� hora"), NETHERLANDS("Nizozemsko"), NORWAY("Norsko"), POLAND(
			"Polsko"), PORTUGAL("Portugalsko"), ROMANIA("Rumunsko"), RUSSIA(
			"Rusko"), SAN_MARINO("San Marino"), SERBIA("Srbsko"), SLOVAKIA(
			"Slovensko"), SLOVENIA("Slovinsko"), SPAIN("�pan�lsko"), SWEDEN(
			"�v�dsko"), SWITZERLAND("�v�carsko"), TURKEY("Turecko"), UKRAINE(
			"Ukrajina"), UNITED_KINGDOM("Spojen� kr�lovstv�"), VATICAN(
			"Vatic�n");

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
