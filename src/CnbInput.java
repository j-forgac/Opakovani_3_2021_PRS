import java.util.HashMap;

public class CnbInput {
	String input = "Austrálie]dolar]1]AUD]16.043!" +
			"Brazílie]real]1]BRL]4.012!" +
			"Bulharsko]lev]1]BGN]12.992!" +
			"Čína]žen-min-pi]1]CNY]3.410!" +
			"Dánsko]koruna]1]DKK]3.416!" +
			"EMU]euro]1]EUR]25.410!" +
			"Filipíny]peso]100]PHP]43.571!" +
			"Hongkong]dolar]1]HKD]2.823!" +
			"Chorvatsko]kuna]1]HRK]3.382!" +
			"Indie]rupie]100]INR]29.404!" +
			"Indonesie]rupie]1000]IDR]1.546!" +
			"Island]koruna]100]ISK]17.077!" +
			"Izrael]nový šekel]1]ILS]6.803!" +
			"Japonsko]jen]100]JPY]19.734!" +
			"Jižní Afrika]rand]1]ZAR]1.477!" +
			"Kanada]dolar]1]CAD]17.470!" +
			"Korejská republika]won]100]KRW]1.847!" +
			"Maďarsko]forint]100]HUF]7.094!" +
			"Malajsie]ringgit]1]MYR]5.253!" +
			"Mexiko]peso]1]MXN]1.072!" +
			"MMF]ZPČ]1]XDR]30.974!" +
			"Norsko]koruna]1]NOK]2.557!" +
			"Nový Zéland]dolar]1]NZD]15.238!" +
			"Polsko]zlotý]1]PLN]5.589!" +
			"Rumunsko]leu]1]RON]5.137!" +
			"Rusko]rubl]100]RUB]30.549!" +
			"Singapur]dolar]1]SGD]16.189!" +
			"Švédsko]koruna]1]SEK]2.505!" +
			"Švýcarsko]frank]1]CHF]23.720!" +
			"Thajsko]baht]100]THB]65.073!" +
			"Turecko]lira]1]TRY]2.478!" +
			"USA]dolar]1]USD]21.975!" +
			"Velká Británie]libra]1]GBP]29.884";

	public HashMap<String,Float> getInput(){
		HashMap<String,Float> exchangeRate = new HashMap<>();
		String[] input2 = input.split("!");
		String[][] output = new String[input2.length][];
		for(int x = 0; x<input2.length;x++){
			output[x] = input2[x].split("]");
			exchangeRate.put(output[x][3],Float.parseFloat(output[x][4])/Float.parseFloat(output[x][2]));
		}
		return exchangeRate;
	}
}
