package country.quiz;

import java.util.Random;

public enum Cities {
	TIRANA("Tirana"), ANDORRA_LA_VELLA("Andorra la Vella"), YEREVAN("Jerevan"), VEINNA(
			"Vídeň"), BAKU("Baku"), MINSK("Minsk"), BRUSSELS("Brusel"), SARAJEVO(
			"Sarajevo"), SOFIA("Sofia"), ZAGREB("Záhřeb"), NICOSIA("Nikósie"), PRAGUE(
			"Praha"), COPENHAGEN("Kodaň"), TALLINN("Tallinn"), HELSKINKI(
			"Helsinki"), PARIS("Paříž"), TBILISI("Zbilisi"), BERLIN("Berlín"), ATHENS(
			"Atény"), BUDAPEST("Budapešť"), REYKJAVIK("Reykjavík"), DUBLIN(
			"Dublin"), ROME("Řím"), ASTANA("Astana"), RIGA("Riga"), VADUZ(
			"Vaduz"), VILNIUS("Vilnius"), LUXEMBOURG("Lucemburk"), SKOPJE(
			"Skopje"), VALLETTA("Valletta"), CHIªINÃU("Kišiněv"), MONACO(
			"Monaco-Ville"), PODGORICA("Podgorica"), AMSTERDAM("Amsterodam"), OSLO(
			"Oslo"), WARSAW("Varšava"), LISBON("Lisabon"), BUCHAREST("Bukurešť"), MOSCOW(
			"Moskva"), SAN_MARINO("San Marino"), BELGRADE("Bělehrad"), BRATISLAVA(
			"Bratislava"), LJUBLJANA("Lublaň"), MADRID("Madrid"), STOCKHOLM(
			"Stockholm"), BERN("Bern"), ANKARA("Ankara"), KIEV("Kyjev"), LONDON(
			"Londýn"), VATICAN_CITY("Vatikán");

	private final String value;

	Cities(String s) {
		this.value = s;
	}

	public Cities fromValue(String value) {
		if (value != null) {
			for (Cities c : values()) {
				if (c.value.equals(value)) {
					return c;
				}
			}
		}

		return Cities.AMSTERDAM;
	}

	public String toValue() {
		return value;
	}

	public static Cities getRandomCity() {
		Random r = new Random();
		int random = r.nextInt(Cities.values().length);
		return Cities.values()[random];
	}
}
