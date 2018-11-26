package Strings;

public class strings {
	private String name;
	private String text;

	public strings() {
		name = " ";
		text = " ";
	}

	public void setName(String newName) {
		name = newName;
	}

	public void newText(String newText) {
		text = newText;
	}

	public String lastName() {
		return name.substring(name.indexOf(" ") + 1, name.length());
	}

	public int charfirst() {
		String first = name.substring(0, name.indexOf(" "));
		return first.length();
	}

	public boolean charX() {
		return name.contains("X");
	}

	public int Length() {
	
		int word = 0;
		if (text.length() == 1 && text.charAt(text.length()- 1) == ' ');
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				word++;
			}
		}
		return word;
	}

}
