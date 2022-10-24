package kodlamaio.core.logging;

public class FileLogger implements Logger{
	@Override //bunun bir interfaceden yada abstractan geldiğini söyler
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
		
	}
	
}
