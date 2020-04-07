package suporte;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateUtils {

	public static String getDataHora() {
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		return formatter.format(data);
	}

	public static String getDataBR() {
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		return formatter.format(data);
	}

	public static String getData(String formato) {
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
		return formatter.format(data);
	}

	public static String getDataRetroativaBR(int dias) {
		LocalDateTime data = LocalDateTime.now().plusDays(Long.valueOf(dias));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		return formatter.format(data);
	}

	public static String inverterValor(String dataOrigem) {
		String data = "";
		for (int i = 1; i <= dataOrigem.length(); i++) {
			data += dataOrigem.charAt(dataOrigem.length() - i);
		}
		return data;
	}

	public static String inverterData(String dataOrigem) {
		String data = "";
		data += dataOrigem.substring(4, 8);
		data += dataOrigem.substring(2, 4);
		data += dataOrigem.substring(0, 2);
		return data;
	}

	public static String getDataRetroativa(int dias, String formato) {
		LocalDateTime data = LocalDateTime.now().plusDays(Long.valueOf(dias));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
		return formatter.format(data);
	}

	public static String calculaDataDiaUtil(int dias, String formato) {
		int dia = dias;
		boolean naoAcharDiaUtil = true;
		LocalDateTime data = null;
		while (naoAcharDiaUtil) {
			data = LocalDateTime.now().plusDays(Long.valueOf(dia));
			if (data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY) {
				if (dias > 0) {
					dia++;
				} else {
					dia--;
				}
			} else {
				naoAcharDiaUtil = false;
			}
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
		return formatter.format(data);
	}

	public static DayOfWeek retornarDiaDaSemana(int dias) {
		LocalDateTime data = LocalDateTime.now().plusDays(Long.valueOf(dias));
		return data.getDayOfWeek();
	}
}
