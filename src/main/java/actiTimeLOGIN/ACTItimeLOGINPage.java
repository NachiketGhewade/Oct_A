package actiTimeLOGIN;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public abstract class ACTItimeLOGINPage {

	abstract public void Actiusername() throws EncryptedDocumentException, IOException;


	abstract public void Actipassword() throws EncryptedDocumentException, IOException;


	abstract public void ActiLogin(); 


}
