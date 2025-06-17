package functionsaux;

import java.time.LocalDate;

public class Auxiliar {
	
	public static int calcularIdade(LocalDate data) {
		if(data.getMonthValue() < LocalDate.now().getMonthValue()) {
        	return LocalDate.now().getYear() - data.getYear();
        }
        else if(data.getMonthValue() == LocalDate.now().getMonthValue()) {
        	if(data.getDayOfMonth() <= LocalDate.now().getDayOfMonth()) {
        		return LocalDate.now().getYear() - data.getYear();
        	}
        	else {
        		return LocalDate.now().getYear() - data.getYear() - 1;
        	}
        }
        else {
        	return LocalDate.now().getYear() - data.getYear() - 1;
        }
	}

}
