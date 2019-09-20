package com.algaworks.cursojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class TesteBean {
	private HtmlInputText inputText;
	private HtmlCommandButton commandButton;

	public void testar() {
		boolean[] disabledOption = new boolean[] {false, true};
		String [] styleOption    = new String[]  {"" ,"background-color: red; color: white"};

		int i = inputText.isDisabled() ? 0 : 1;

		inputText.setDisabled(disabledOption[i]);
		commandButton.setStyle(styleOption[i]);
	}

	public HtmlInputText getInputText() {
		return inputText;
	}

	public void setInputText(HtmlInputText inputText) {
		this.inputText = inputText;
	}

	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
}
