package vista;


import datos.DatosPreguntas;
import model.Partida;

public class Imprimir {
	
	DatosPreguntas dt=new DatosPreguntas();
	private Partida p;
	
	//Constructor
	public Imprimir() {
		super();
	}

	

	public DatosPreguntas getDt() {
		return dt;
	}



	public Partida getP() {
		return p;
	}



	public void setDt(DatosPreguntas dt) {
		this.dt = dt;
	}



	public void setP(Partida p) {
		this.p = p;
	}



	//Metodos
	//Gabriel
	public void mostrarDinero() {
		System.out.println("Tienes "+(p.getDinero()/p.getDineroPorPaquete())+" paquetes ("+p.getDinero()+")");
	}
	
	public void imprimirBienvenida() {
		System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌\r\n"
				+ "▐                                                                                                                        ▌\r\n"
				+ "▐     /$$      /$$       /$$$$$$$$       /$$              /$$$$$$         /$$$$$$        /$$      /$$       /$$$$$$$$    ▌\r\n"
				+ "▐    | $$  /$ | $$      | $$_____/      | $$             /$$__  $$       /$$__  $$      | $$$    /$$$      | $$_____/    ▌\r\n"
				+ "▐    | $$ /$$$| $$      | $$            | $$            | $$  \\__/      | $$  \\ $$      | $$$$  /$$$$      | $$          ▌\r\n"
				+ "▐    | $$/$$ $$ $$      | $$$$$         | $$            | $$            | $$  | $$      | $$ $$/$$ $$      | $$$$$       ▌\r\n"
				+ "▐    | $$$$_  $$$$      | $$__/         | $$            | $$            | $$  | $$      | $$  $$$| $$      | $$__/       ▌\r\n"
				+ "▐    | $$$/ \\  $$$      | $$            | $$            | $$    $$      | $$  | $$      | $$\\  $ | $$      | $$          ▌\r\n"
				+ "▐    | $$/   \\  $$      | $$$$$$$$      | $$$$$$$$      |  $$$$$$/      |  $$$$$$/      | $$ \\/  | $$      | $$$$$$$$    ▌\r\n"
				+ "▐    |__/     \\__/      |________/      |________/       \\______/        \\______/       |__/     |__/      |________/    ▌\r\n"
				+ "▐                                                                                                                        ▌\r\n"
				+ "▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n\n");

	}
	
	//Mei
	public void imprimirMenuPrincipal() {
		System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌\r\n"
				+ "▐                                                                                     ▌\r\n"
				+ "▐ ░▄▀▄░░░░░░█▀▀░█▀█░█░░░▀█▀░█▀▄                                                       ▌\r\n"
				+ "▐ ░█/█░░░░░░▀▀█░█▀█░█░░░░█░░█▀▄                                                       ▌\r\n"
				+ "▐ ░░▀░░▀░░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀                                                       ▌\r\n"
				+ "▐ ░▀█░░░░░░░█▀▀░█▀█░▀█▀░█▀▄░█▀█░█▀▄░░░█▀█░█░░░░░▀▀█░█░█░█▀▀░█▀▀░█▀█                   ▌\r\n"
				+ "▐ ░░█░░░░░░░█▀▀░█░█░░█░░█▀▄░█▀█░█▀▄░░░█▀█░█░░░░░░░█░█░█░█▀▀░█░█░█░█                   ▌\r\n"
				+ "▐ ░▀▀▀░▀░░░░▀▀▀░▀░▀░░▀░░▀░▀░▀░▀░▀░▀░░░▀░▀░▀▀▀░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀▀                   ▌\r\n"
				+ "▐ ░▀▀▄░░░░░░█▄█░█▀▀░▀█▀░█▀▀░█▀▄░░░▀▀█░█░█░█▀▀░█▀█░█▀▄░█▀█░█▀▄░█▀▀░█▀▀                 ▌\r\n"
				+ "▐ ░▄▀░░░░░░░█░█░█▀▀░░█░░█▀▀░█▀▄░░░░░█░█░█░█░█░█▀█░█░█░█░█░█▀▄░█▀▀░▀▀█                 ▌\r\n"
				+ "▐ ░▀▀▀░▀░░░░▀░▀░▀▀▀░░▀░░▀▀▀░▀░▀░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀▀▀                 ▌\r\n"
				+ "▐ ░▀▀█░░░░░░█▄█░█▀█░█▀▄░▀█▀░█▀▀░▀█▀░█▀▀░█▀█░█▀▄░░░▀▀█░█░█░█▀▀░█▀█░█▀▄░█▀█░█▀▄░█▀▀░█▀▀ ▌\r\n"
				+ "▐ ░░▀▄░░░░░░█░█░█░█░█░█░░█░░█▀▀░░█░░█░░░█▀█░█▀▄░░░░░█░█░█░█░█░█▀█░█░█░█░█░█▀▄░█▀▀░▀▀█ ▌\r\n"
				+ "▐ ░▀▀░░▀░░░░▀░▀░▀▀▀░▀▀░░▀▀▀░▀░░░▀▀▀░▀▀▀░▀░▀░▀░▀░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀▀▀ ▌\r\n"
				+ "▐ ░█░█░░░░░░█▀▄░█░█░█▀▀░█▀▀░█▀█░█▀▄░░░█░█░█▀█░░░▀▀█░█░█░█▀▀░█▀█░█▀▄░█▀█░█▀▄           ▌\r\n"
				+ "▐ ░░▀█░░░░░░█▀▄░█░█░▀▀█░█░░░█▀█░█▀▄░░░█░█░█░█░░░░░█░█░█░█░█░█▀█░█░█░█░█░█▀▄           ▌\r\n"
				+ "▐ ░░░▀░▀░░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀░▀░▀░▀░░░▀▀▀░▀░▀░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀           ▌\r\n"
				+ "▐ ░█▀▀░░░░░░█░░░▀█▀░█▀▀░▀█▀░█▀█░█▀▄░░░▀▀█░█░█░█▀▀░█▀█░█▀▄░█▀█░█▀▄░█▀▀░█▀▀             ▌\r\n"
				+ "▐ ░▀▀▄░░░░░░█░░░░█░░▀▀█░░█░░█▀█░█▀▄░░░░░█░█░█░█░█░█▀█░█░█░█░█░█▀▄░█▀▀░▀▀█             ▌\r\n"
				+ "▐ ░▀▀░░▀░░░░▀▀▀░▀▀▀░▀▀▀░░▀░░▀░▀░▀░▀░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀▀▀             ▌\r\n"
				+ "▐                                                                                     ▌\r\n"
				+ "▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌");

	}
	
	
	public void imprimirMenuAtrapa(){
		System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌\r\n"
				+ "▐ ░▄▀▄░░░░░░█▀▀░█▀█░█░░░▀█▀░█▀▄░░ ▌\r\n"
				+ "▐ ░█ █░░░░░░▀▀█░█▀█░█░░░░█░░█▀▄░░ ▌\r\n"
				+ "▐ ░░▀░░▀░░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░░ ▌\r\n"
				+ "▐ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▌\r\n"
				+ "▐ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▌\r\n"
				+ "▐ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▌\r\n"
				+ "▐ ░▀█░░░░░░░▀▀█░█░█░█▀▀░█▀█░█▀▄░░ ▌\r\n"
				+ "▐ ░░█░░░░░░░░░█░█░█░█░█░█▀█░█▀▄░░ ▌\r\n"
				+ "▐ ░▀▀▀░▀░░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀░▀░░ ▌\r\n"
				+ "▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌");
	}
	
	public void imprimirMenuYPortadaAtrapa() throws InterruptedException{
		System.out.println("░█░░░█▀█░█▀█░█▀▄░▀█▀░█▀█░█▀▀░░░░░░░░░\r\n"
				+ "░█░░░█░█░█▀█░█░█░░█░░█░█░█░█░░░░░░░░░\r\n"
				+ "░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀░░▀░░▀░");
		System.out.println("[███████████                                       ] 25%\n");
		Thread.sleep(1000);
		System.out.println("\n\n");
		
		System.out.println("░█░░░█▀█░█▀█░█▀▄░▀█▀░█▀█░█▀▀░░░░░░░░░\r\n"
				+ "░█░░░█░█░█▀█░█░█░░█░░█░█░█░█░░░░░░░░░\r\n"
				+ "░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀░░▀░░▀░");
		System.out.println("[█████████████████████                             ] 50%");
		Thread.sleep(1000);
		System.out.println("\n\n");
		
		System.out.println("░█░░░█▀█░█▀█░█▀▄░▀█▀░█▀█░█▀▀░░░░░░░░░\r\n"
				+ "░█░░░█░█░█▀█░█░█░░█░░█░█░█░█░░░░░░░░░\r\n"
				+ "░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀░░▀░░▀░");
		System.out.println("[█████████████████████████████████████             ] 75%");
		Thread.sleep(1000);
		System.out.println("\n\n");
		
		System.out.println("░█░░░█▀█░█▀█░█▀▄░▀█▀░█▀█░█▀▀░░░░░░░░░\r\n"
				+ "░█░░░█░█░█▀█░█░█░░█░░█░█░█░█░░░░░░░░░\r\n"
				+ "░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░▀░░▀░░▀░");
		System.out.println("[██████████████████████████████████████████████████] 100%");
		System.out.println();
		
		System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐     ░█▀█░▀█▀░█▀▄░█▀█░█▀█░█▀█░░░█░█░█▀█░░░░     ▌\r\n"
				+ "▐     ░█▀█░░█░░█▀▄░█▀█░█▀▀░█▀█░░░█░█░█░█░░░░     ▌\r\n"
				+ "▐     ░▀░▀░░▀░░▀░▀░▀░▀░▀░░░▀░▀░░░▀▀▀░▀░▀░░░░     ▌\r\n"
				+ "▐     ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░     ▌\r\n"
				+ "▐     ░░░░░░░░░░░░░░░░░░░░░░░▄▀░░░░░░░░░░░░░     ▌\r\n"
				+ "▐     ░░░░░░░░░░░░░░░░░░░░░░░▀░░░░░░░░░░░░░░     ▌\r\n"
				+ "▐     ░░░░░█▄█░▀█▀░█░░░█░░░█▀█░█▀█░░░░░░░░░░     ▌\r\n"
				+ "▐     ░░░░░█░█░░█░░█░░░█░░░█░█░█░█░░░░░░░░░░     ▌\r\n"
				+ "▐     ░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░░░░░░░     ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐                                                ▌\r\n"
				+ "▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌");
		System.out.println();
		
		Thread.sleep(1500);
		
		
		System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌\r\n"
						+ "▐ ░▄▀▄░░░░░░█▀▀░█▀█░█░░░▀█▀░█▀▄░░ ▌\r\n"
						+ "▐ ░█ █░░░░░░▀▀█░█▀█░█░░░░█░░█▀▄░░ ▌\r\n"
						+ "▐ ░░▀░░▀░░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░░ ▌\r\n"
						+ "▐ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▌\r\n"
						+ "▐ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▌\r\n"
						+ "▐ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▌\r\n"
						+ "▐ ░▀█░░░░░░░▀▀█░█░█░█▀▀░█▀█░█▀▄░░ ▌\r\n"
						+ "▐ ░░█░░░░░░░░░█░█░█░█░█░█▀█░█▀▄░░ ▌\r\n"
						+ "▐ ░▀▀▀░▀░░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀░▀░░ ▌\r\n"
						+ "▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌");


	}
	
	
	public void imprimirPreguntas(int [] paquetes, int numAle, boolean acabado) {
		int numRespuestas=4;
		System.out.println(dt.getPreguntas()[numAle].getEnunciado());
		for(int i=0; i<numRespuestas;i++) {
			if(paquetes[i]==0) {
				System.out.printf((i+1)+". "+dt.getPreguntas()[numAle].getRespuesta()[i]+"\n");
			}else {
				System.out.printf((i+1)+". "+dt.getPreguntas()[numAle].getRespuesta()[i]+"\n"
						+"   ___\n"
						+ "  |   |\n"
						+paquetes[i]+ " | € |\n"
						+ "  |___|\n\n");
			}
				
		}
	}
	
	public void imprimirVictoria() {
		System.out.println(".---------------------------------------------------------------------------------------------------------.\r\n"
				+ "|                                                                                                         |\r\n"
				+ "|                     _   _                                            _         _   _   _                |\r\n"
				+ "|                    | | | | __ _ ___       __ _  __ _ _ __   __ _  __| | ___   | | | | | |               |\r\n"
				+ "|                    | |_| |/ _` / __|     / _` |/ _` | '_ \\ / _` |/ _` |/ _ \\  | | | | | |               |\r\n"
				+ "|                    |  _  | (_| \\__ \\    | (_| | (_| | | | | (_| | (_| | (_) | |_| |_| |_|               |\r\n"
				+ "|                    |_| |_|\\__,_|___/     \\__, |\\__,_|_| |_|\\__,_|\\__,_|\\___/  (_) (_) (_)               |\r\n"
				+ "|                                          |___/                                                          |\r\n"
				+ "|                                                                                                         |\r\n"
				+ "|                                                                                                         |\r\n"
				+ "|                                    Premio: "+p.getDinero()+" €                                                    |\r\n"
				+ "|                                                                                                         |\r\n"
				+ "|                                                                                                         |\r\n"
				+ "'---------------------------------------------------------------------------------------------------------'");
	}
	
	public void imprimirDerrota() {
		System.out.println(".---------------------------------------------------------------------------------------------------------.\r\n"
				+ "|                                                                                                         |\r\n"
				+ "|     _   _                  _   _   _      _   _                                _ _     _         _      |\r\n"
				+ "|    | \\ | | ___   ___      | | | | | |    | | | | __ _ ___   _ __   ___ _ __ __| (_) __| | ___   | |     |\r\n"
				+ "|    |  \\| |/ _ \\ / _ \\     | | | | | |    | |_| |/ _` / __| | '_ \\ / _ \\ '__/ _` | |/ _` |/ _ \\  | |     |\r\n"
				+ "|    | |\\  | (_) | (_) |    |_| |_| |_|    |  _  | (_| \\__ \\ | |_) |  __/ | | (_| | | (_| | (_) | |_|     |\r\n"
				+ "|    |_| \\_|\\___/ \\___/     (_) (_) (_)    |_| |_|\\__,_|___/ | .__/ \\___|_|  \\__,_|_|\\__,_|\\___/  (_)     |\r\n"
				+ "|                                                            |_|                                          |\r\n"
				+ "|                                                                                                         |\r\n"
				+ "'---------------------------------------------------------------------------------------------------------'");
	}
	
	
	

}