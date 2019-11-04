package visitor.exercise;

import java.util.Calendar;

public class Vet implements IVisitor {

	@Override
	public String visit(Dog dog) {
		if (dog.illness().equals("slight illness")) {
			System.out.println("The dog must rest.");
			Calendar calendar = Calendar.getInstance();
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int year = calendar.get(Calendar.YEAR);
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			return ("Date: " + day + "/" + month + "/" + year + ". Time: " + hour + ":" + minute + ".");
		} else if (dog.illness().equals("serious illness")) {
			System.out.println("The dog must go through surgery.");
			Calendar tiempo = Calendar.getInstance();
			int mes = tiempo.get(Calendar.MONTH) + 1;
			int dia = tiempo.get(Calendar.DAY_OF_MONTH);
			int anio = tiempo.get(Calendar.YEAR);
			int hora = tiempo.get(Calendar.HOUR_OF_DAY);
			int minuto = tiempo.get(Calendar.MINUTE);
			return ("Date: " + dia + "/" + mes + "/" + anio + ". Time: " + hora + ":" + minuto + ".");
		} else {
			return "The dog is healthy.";
		}
	}

	@Override
	public String visit(Cat cat) {
		if (cat.illness().equals("slight illness")) {
			System.out.println("The cat must rest.");
			Calendar calendar = Calendar.getInstance();
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int year = calendar.get(Calendar.YEAR);
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			return ("Date: " + day + "/" + month + "/" + year + ". Time: " + hour + ":" + minute + ".");
		} else if (cat.illness().equals("serious illness")) {
			System.out.println("The cat must go through surgery.");
			Calendar tiempo = Calendar.getInstance();
			int mes = tiempo.get(Calendar.MONTH) + 1;
			int dia = tiempo.get(Calendar.DAY_OF_MONTH);
			int anio = tiempo.get(Calendar.YEAR);
			int hora = tiempo.get(Calendar.HOUR_OF_DAY);
			int minuto = tiempo.get(Calendar.MINUTE);
			return ("Date: " + dia + "/" + mes + "/" + anio + ". Time: " + hora + ":" + minuto + ".");
		} else {
			return "The cat is healthy.";
		}
	}

	@Override
	public String visit(Horse horse) {
		if (horse.illness().equals("slight illness")) {
			System.out.println("The horse must rest.");
			Calendar calendar = Calendar.getInstance();
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int year = calendar.get(Calendar.YEAR);
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			return ("Date: " + day + "/" + month + "/" + year + ". Time: " + hour + ":" + minute + ".");
		} else if (horse.illness().equals("serious illness")) {
			System.out.println("The horse must go through surgery.");
			Calendar tiempo = Calendar.getInstance();
			int mes = tiempo.get(Calendar.MONTH) + 1;
			int dia = tiempo.get(Calendar.DAY_OF_MONTH);
			int anio = tiempo.get(Calendar.YEAR);
			int hora = tiempo.get(Calendar.HOUR_OF_DAY);
			int minuto = tiempo.get(Calendar.MINUTE);
			return ("Date: " + dia + "/" + mes + "/" + anio + ". Time: " + hora + ":" + minuto + ".");
		} else {
			return "The horse is healthy.";
		}
	}

}