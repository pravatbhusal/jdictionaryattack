package com.pravat.dictionaryattack;


import java.io.*;
import java.security.NoSuchAlgorithmException;

import com.pravat.jencrypt.JEncrypt;

public class DictionaryAttack {

	private JEncrypt encrypt = new JEncrypt();
	
	private final static String workingDir = System.getProperty("user.dir");
	private File dictionaryFile = new File(workingDir + "\\wordlist.txt");
	private BufferedReader readDictionary;
	
	public static void main(String[] args)
	{
		
	}
	
	public DictionaryAttack()
	{
		try {
			readDictionary = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(dictionaryFile))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String decryptMD5(String MD5) throws IOException, NoSuchAlgorithmException
	{
		//buffered reader reset
	    readDictionary = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(dictionaryFile))));
	    
		String line = null;
		String password = null;
		while ((line = readDictionary.readLine()) != null)
		{ //iterate through each line in the dictionary file
			
			//if hash just equals to the encrypted password
			if(MD5.equalsIgnoreCase(encrypt.encryptMD5(line)))
			{
				password = line;
			}
			
			//if hash equals to to the reversed line
			String reversed_line = new StringBuilder(line).reverse().toString();
			if(MD5.equalsIgnoreCase(encrypt.encryptMD5(reversed_line)))
			{
				password = reversed_line;
			}
			
			//if hash equals to the line without vowels
			String line_without_vowels = line.replaceAll("[AEIOUaeiou]", "");
			if(MD5.equalsIgnoreCase(encrypt.encryptMD5(line_without_vowels)))
			{
				password = line_without_vowels;
			}
		}
		if(password == null)
		{
			password = "JDICTIONARYATTACK FOUND NO PASSWORD FOR THE MD5 HASH.";
			return password;
		}
		return password;
	}
	public String decryptBase64(String Base64) throws IOException, NoSuchAlgorithmException
	{
		return encrypt.decryptBase64(Base64);
	}
	public String decryptSHA1(String SHA1) throws IOException, NoSuchAlgorithmException
	{
		//buffered reader reset
	    readDictionary = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(dictionaryFile))));
	    
		String line = null;
		String password = null;
		while ((line = readDictionary.readLine()) != null)
		{ //iterate through each line in the dictionary file
			
			//if hash just equals to the encrypted password
			if(SHA1.equalsIgnoreCase(encrypt.encryptSHA1(line)))
			{
				password = line;
			}
			
			//if hash equals to to the reversed line
			String reversed_line = new StringBuilder(line).reverse().toString();
			if(SHA1.equalsIgnoreCase(encrypt.encryptSHA1(reversed_line)))
			{
				password = reversed_line;
			}
			
			//if hash equals to the line without vowels
			String line_without_vowels = line.replaceAll("[AEIOUaeiou]", "");
			if(SHA1.equalsIgnoreCase(encrypt.encryptSHA1(line_without_vowels)))
			{
				password = line_without_vowels;
			}
		}
		if(password == null)
		{
			password = "JDICTIONARYATTACK FOUND NO PASSWORD FOR THE SHA1 HASH.";
			return password;
		}
		return password;
	}
	public String decryptSHA256(String SHA256) throws IOException, NoSuchAlgorithmException
	{
		//buffered reader reset
	    readDictionary = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(dictionaryFile))));
	    
		String line = null;
		String password = null;
		while ((line = readDictionary.readLine()) != null)
		{ //iterate through each line in the dictionary file
			
			//if hash just equals to the encrypted password
			if(SHA256.equalsIgnoreCase(encrypt.encryptSHA256(line)))
			{
				password = line;
			}
			
			//if hash equals to to the reversed line
			String reversed_line = new StringBuilder(line).reverse().toString();
			if(SHA256.equalsIgnoreCase(encrypt.encryptSHA256(reversed_line)))
			{
				password = reversed_line;
			}
			
			//if hash equals to the line without vowels
			String line_without_vowels = line.replaceAll("[AEIOUaeiou]", "");
			if(SHA256.equalsIgnoreCase(encrypt.encryptSHA256(line_without_vowels)))
			{
				password = line_without_vowels;
			}
		}
		if(password == null)
		{
			password = "JDICTIONARYATTACK FOUND NO PASSWORD FOR THE SHA256 HASH.";
			return password;
		}
		return password;
	}
	public String decryptSHA384(String SHA384) throws IOException, NoSuchAlgorithmException
	{
		//buffered reader reset
		readDictionary = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(dictionaryFile))));
	    
		String line = null;
		String password = null;
		while ((line = readDictionary.readLine()) != null)
		{ //iterate through each line in the dictionary file
			
			//if hash just equals to the encrypted password
			if(SHA384.equalsIgnoreCase(encrypt.encryptSHA384(line)))
			{
				password = line;
			}
			
			//if hash equals to to the reversed line
			String reversed_line = new StringBuilder(line).reverse().toString();
			if(SHA384.equalsIgnoreCase(encrypt.encryptSHA384(reversed_line)))
			{
				password = reversed_line;
			}
			
			//if hash equals to the line without vowels
			String line_without_vowels = line.replaceAll("[AEIOUaeiou]", "");
			if(SHA384.equalsIgnoreCase(encrypt.encryptSHA384(line_without_vowels)))
			{
				password = line_without_vowels;
			}
		}
		if(password == null)
		{
			password = "JDICTIONARYATTACK FOUND NO PASSWORD FOR THE SHA384 HASH.";
			return password;
		}
		return password;
	}
	public String decryptSHA512(String SHA512) throws IOException, NoSuchAlgorithmException
	{
		//buffered reader reset
		readDictionary = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(dictionaryFile))));
	    
		String line = null;
		String password = null;
		while ((line = readDictionary.readLine()) != null)
		{ //iterate through each line in the dictionary file
			
			//if hash just equals to the encrypted password
			if(SHA512.equalsIgnoreCase(encrypt.encryptSHA512(line, "")))
			{
				password = line;
			}
			
			//if hash equals to to the reversed line
			String reversed_line = new StringBuilder(line).reverse().toString();
			if(SHA512.equalsIgnoreCase(encrypt.encryptSHA512(reversed_line, "")))
			{
				password = reversed_line;
			}
			
			//if hash equals to the line without vowels
			String line_without_vowels = line.replaceAll("[AEIOUaeiou]", "");
			if(SHA512.equalsIgnoreCase(encrypt.encryptSHA512(line_without_vowels, "")))
			{
				password = line_without_vowels;
			}
		}
		if(password == null)
		{
			password = "JDICTIONARYATTACK FOUND NO PASSWORD FOR THE SHA512 HASH.";
			return password;
		}
		return password;
	}
}
