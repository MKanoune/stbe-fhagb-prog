
public class Austestklasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//testkommentar
		Text testtext = new Text();
		testtext.AddLineAtLastLine("Hallo Welt1");
		testtext.AddLineAtLastLine("Hallo Welt2");
		testtext.AddLineAtLastLine("Hallo Welt3");
		testtext.AddLineAtLastLine("Hallo Welt4");
//		testtext.AddLineAtLastLine("Hallo Welt5");
//		testtext.AddLineAtLastLine("Hallo Welt6");
		// R�ckgabe des gesamten Textes als String (bei gr��eren Texten evtl. beschr�nken auf eine bestimmte Zeilenzahl). 
		
		//System.out.println(testtext.getWholeText());
		
		//R�ckgabe der Zeile unter dem Cursor als String
		testtext.moveCursorDown();
		//System.out.println(testtext.getLineAtCursorPosition());
		
		//L�schen des Zeichens unter dem Cursor. 

//		Cursor nach rechts und links bewegen		
//		testtext.moveCursorRight();
//		testtext.moveCursorRight();
//		testtext.moveCursorLeft();
//		testtext.deleteCharAtCursor();
		System.out.println(testtext.getWholeText());

//		Ersetzen des Zeichens unter dem Cursor durch ein neues Zeichen (spezifiziert als �bergabeparameter). 
//		testtext.replaceCharAtCursor('�');
//		testtext.moveCursorRight();
//		testtext.insertStringAtCursor("chen");
//		System.out.println(testtext.getWholeText());
//		testtext.moveCursorDown();
//		System.out.println("Der Cursor befindet sich in Zeile: " + testtext.returnCursorYpos());
//		System.out.println("Der Cursor befindet sich in Spalte: " + testtext.returnCursorXpos());
//		System.out.println("L�sche dieses Zeichen jetzt");
//		testtext.deleteCharAtCursor();
//		System.out.println(testtext.getWholeText());
//		testtext.moveCursorDown();
//		testtext.deleteLineAtCursour();
//		System.out.println(testtext.getWholeText());
//		testtext.deleteLineAtCursour();
//		System.out.println(testtext.getWholeText());
//		Einf�gen einer neuen Zeile (mit spezifiziertem Inhalt) vor dem Cursor.
//		testtext.insertLineInFrontOfCursor("Das hier soll eingefuegt werden");
//		System.out.println(testtext.getWholeText());
//		System.out.println("Der Cursor befindet sich in Zeile: " + testtext.returnCursorYpos());
//		System.out.println("Der Cursor befindet sich in Spalte: " + testtext.returnCursorXpos());
//		testtext.insertLineInFrontOfCursor("Das hier soll auch eingefuegt werden");
//		System.out.println(testtext.getWholeText());
//		System.out.println("Der Cursor befindet sich in Zeile: " + testtext.returnCursorYpos());
//		System.out.println("Der Cursor befindet sich in Spalte: " + testtext.returnCursorXpos());
//		//Erfragen der L�nge der Zeile, auf der der Cursor steht (Zahl der Zeichen!). 
//		testtext.moveCursorUp();
//		System.out.println("Die Zeile unter dem Cursor ist " + testtext.getLengthOfLineAtCursor() + " Zeichen lang");
		System.out.println("Gesamtlaenge des Texts " + testtext.getLengthOfWholeText() + " Zeichen");
	}
	
	 
	

}
