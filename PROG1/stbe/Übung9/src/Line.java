
class Line {
	private StringBuffer lineText;

	/**
	 * Standardkonstruktor
	 */
	public Line(){}
	
	/**
	 * Konstruktor erstellt Zeile mit �bergebenem Text
	 * @param lineText Text f�r die Zeile
	 */
	public Line(String lineText){
		this.lineText = new StringBuffer(lineText);
	}

	/**
	 * Gibt den aktuellen Text der Zeile zur�ck
	 * @return Text der Zeile
	 */
	public String getLineText() {
		return lineText.toString();
	}

	public void setLineText(String lineText) {
		this.lineText = new StringBuffer(lineText);
	}
	
	/**
	 * L�scht ein Zeichen an eine bestimmten Stelle
	 * @param xPos Stelle an der das Zeichen gel�scht werden
	 */
	void deleteCharAtPos(int pos){
		lineText.deleteCharAt(pos);
	}
	
	/**
	 * Ersetzt ein Zeichen an einer Position mit einem anderen Zeichen
	 * @param pos Position des zu ersetzten Zeichen
	 * @param replaceChar Zeichen durch das ersetzt wird
	 */
	void replaceCharAtPos(int pos, char replaceChar){
		lineText.replace(pos, pos + 1, String.valueOf(replaceChar));
	}
	
	/**
	 * F�gt ein Zeichen an einer Position ein
	 * @param pos Position zum Einf�gen
	 * @param insertChar Zeichen das eingef�gt werden soll
	 */
	void insertAtPos(int pos, char insertChar){
		lineText.insert(pos, insertChar);
	}
	
	/**
	 * F�gt eine Zeichenkette an einer Position ein
	 * @param pos Position zum Einf�gen
	 * @param insertString Zeichenkette die eingef�gt werden soll
	 */
	void insertAtPos(int pos, String insertString){
		lineText.insert(pos, insertString);
	}
}
