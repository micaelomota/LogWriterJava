package source;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogWriter {
	
	// NOME DO ARQUIVO QUE ARMAZENA O LOG
	private String logName;
	
	// FileOutputStream É A CLASSE QUE INSTÂNCIA O OBJETO
	// QUE REPRESENTA UM ARQUIVO.
	private FileOutputStream file;
	
	// CONSTRUTOR DEFAULT
	public LogWriter() {
		this.logName = "default_log";
	}
	
	// CONSTRUTOR CUSTOMIZADO
	public LogWriter(String logName){
		this.logName = logName;
	}

	
	public String getLogName() {
		return logName;
	}


	public void setLogName(String logName) {
		this.logName = logName;
	}

	// RETORNA A DATA E HORA ATUAL FORMATAS
	public String getCurrentDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");			
		Date data = new Date();
		return dateFormat.format(data);
	}
	
	// FECHA INSTÂNCIA DO ARQUIVO
	public void closeFile(){
		try {
			this.file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ESCREVE O TEXTO NO LOG
	public void write(String text){
		try {
			// CRIANDO/ABRINDO UM ARQUIVO EXISTENTE
			this.file = new FileOutputStream(this.logName + ".txt", true);
			
			// CRIANDO OBJETO CAPAZ DE ESCREVER NO ARQUIVO
			PrintWriter escritor = new PrintWriter(this.file);
			
			// INSERINDO A DATA E HORA + O TEXTO
			escritor.println(this.getCurrentDate() +" - "+ text);
			
			System.out.println("Escrevendo: " + text);
			
			
			// FECHAR PRIMEIRO O ESCRITOR E DEPOIS O ARQUIVO
			escritor.close();
			this.closeFile();
			
		
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
