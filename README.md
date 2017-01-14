![Alt text](/rsrc/icon.png)
# Overview
JDictionaryAttack(or Java DictionaryAttack) is a Java-based application that is decrypt a hashed password.
Proper documentation is provided below the README.

If you want to add more words to the DictionaryAttack, then you may add new words in the wordlist.txt file with each new word being another line.

# Download Setup
- Clone or download this repository as a zip file
- Extract the downloaded zip file
- Find and open the "JDictionaryAttack.jar" file inside the unzipped folder
- Finished!

# Dependencies
JDictionaryAttack utilizes two forms.
- The first form is an editable source code for programmers to code
- The second form is a default GUI to make an easy-to-use interface for the user
	- The default form is the JDictionaryAttack.jar file
	- The jar file MUST be in the same directory as the original source. 
	- The wordlist.txt file is neccessary to be in the same directory as when downloaded
	
# Default GUI Overlook
![Alt text](/rsrc/gui.PNG)

# Source Code Setup
- Copy and paste the entire JDictionaryAttack's "com" folder into your project's "src" folder
- Copy and paste the entire JDictionaryAttack's "lib" folder in your project's main directory
- Go to your IDE, go to the project's properties in the IDE, go to the Java Build Path, then go to the Libraries and add
  all of the .jar files from the lib folder to your project.

# Documentation
Import the DictionaryAttack class
```
import com.shadowsych.dictionaryattack.DictionaryAttack
```
Make a DictionaryAttack instance
```
DictionaryAttack attack = new DictionaryAttack();
```
Decryption possiblities
```
attack.decryptMD5("098f6bcd4621d373cade4e832627b4f6");//decrypts md5 hashes (returns "test")
attack.decryptBase64("dGVzdA=="); //decrypts base64 hashes (returns "test")
attack.decryptSHA1("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3");//decrypts SHA1 hashes (returns "test")
attack.decryptSHA256("9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08");//decrypts SHA256 hashes (returns "test")
attack.decryptSHA384("768412320f7b0aa5812fce428dc4706b3cae50e02a64caa16a782249bfe8efc4b7ef1ccb126255d196047dfedf17a0a9");//decrypts SHA384 hashes (returns "test")
attack.decryptSHA512("ee26b0dd4af7e749aa1a8ee3c10ae9923f618980772e473f8819a5d4940e0db27ac185f8a0e1d5f84f88bc887fd67b143732c304cc5fa9ad8e6f57f50028a8ff");//decrypts SHA512 hashes (returns "test")
```

# Credits
- https://github.com/npapernot for the wordlist.txt file and this program's inspiration

# DISCLAIMER
JDICTIONARY ATTACK IS A PROJECT MADE FOR EDUCATIONAL PURPOSES AND BUSINESS PURPOSES. THIS PRODUCT IS NOT INTENDED FOR MALICIOUS ACTS AND WILL NOT BE HELD ACCOUNTABLE FOR ANY ACTIVITIES CONDUCTED IN THIS APPLICATION.

