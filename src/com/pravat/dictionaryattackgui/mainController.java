package com.pravat.dictionaryattackgui;

import com.pravat.dictionaryattack.DictionaryAttack;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

@Deprecated
public class mainController implements javafx.fxml.Initializable, EventHandler<ActionEvent> {

	public DictionaryAttack attack = new DictionaryAttack();
	@FXML
	private Text waterMark;
	@FXML
	private Button decryptBTN;
	@FXML
	private TextField decryptText;
	@FXML
	private TextArea results;
	
	@FXML
	private RadioButton MD5;
	@FXML
	private RadioButton Base64;
	@FXML
	private RadioButton SHA1;
	@FXML
	private RadioButton SHA256;
	@FXML
	private RadioButton SHA384;
	@FXML
	private RadioButton SHA512;
	
	
	private final ToggleGroup decryptGroup = new ToggleGroup();
	

	public void initialize(URL location, ResourceBundle resources) {
		MD5.setToggleGroup(decryptGroup);
		Base64.setToggleGroup(decryptGroup);
		SHA1.setToggleGroup(decryptGroup);
		SHA256.setToggleGroup(decryptGroup);
		SHA384.setToggleGroup(decryptGroup);
		SHA512.setToggleGroup(decryptGroup);
		MD5.setSelected(true);
		
		decryptBTN.setOnAction(this);
	} 

	public void handle(ActionEvent E) {
		if(decryptText.getText().isEmpty())
		{
			results.setText("Please do not leave the textfield empty.");
			return;
		}
		try {
			String password = "";
			if(E.getSource() == decryptBTN && MD5.isSelected())
			{// we get the MD5
				String hash = decryptText.getText();
				password = attack.decryptMD5(hash);
				
				results.setText(password);
				if(!password.contains("JDICTIONARYATTACK FOUND NO PASSWORD"))
				results.setText("PASSWORD FOUND:   " + password);
			} else if (E.getSource() == decryptBTN && Base64.isSelected())
			{// we get the Base64
				String hash = decryptText.getText();
				password = attack.decryptBase64(hash);

				results.setText(password);
				if(!password.contains("JDICTIONARYATTACK FOUND NO PASSWORD"))
				results.setText("PASSWORD FOUND:   " + password);
			} else if (E.getSource() == decryptBTN && SHA1.isSelected())
			{// we get the SHA1
				String hash = decryptText.getText();
				password = attack.decryptSHA1(hash);

				results.setText(password);
				if(!password.contains("JDICTIONARYATTACK FOUND NO PASSWORD"))
				results.setText("PASSWORD FOUND:   " + password);
			} else if (E.getSource() == decryptBTN && SHA256.isSelected())
			{// we get the SHA256
				String hash = decryptText.getText();
				password = attack.decryptSHA256(hash);
				
				results.setText(password);
				if(!password.contains("JDICTIONARYATTACK FOUND NO PASSWORD"))
				results.setText("PASSWORD FOUND:: " + password);
			} else if (E.getSource() == decryptBTN && SHA384.isSelected())
			{// we get the SHA384
				String hash = decryptText.getText();
				password = attack.decryptSHA384(hash);

				results.setText(password);
				if(!password.contains("JDICTIONARYATTACK FOUND NO PASSWORD"))
				results.setText("PASSWORD FOUND:   " + password);
			} else if (E.getSource() == decryptBTN && SHA512.isSelected())
			{// we get the SHA512
				String hash = decryptText.getText();
				password = attack.decryptSHA512(hash);
				
				results.setText(password);
				if(!password.contains("JDICTIONARYATTACK FOUND NO PASSWORD"))
				results.setText("PASSWORD FOUND:   " + password);
			}
		} catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

} // end class
