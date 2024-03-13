package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DistroController {

	public DistroController() {
		
		super();
		
	}
	
	private String os() {
		
		return System.getProperty("os.name");
		
	}
	
	public void exibeDistro() {
		
		try {
			
			Process p = Runtime.getRuntime().exec("cat /etc/os-release");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			
			while (linha != null) {
				
				if (linha.contains("VERSION=")) {
					
					System.out.println(linha);
					
				}
				else if (linha.contains("NAME=")) {
					
					System.out.println(linha);
					
				}
				
				linha = buffer.readLine();
				
			}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
	}
	
}
