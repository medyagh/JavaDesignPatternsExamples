package CommandPattern;

public class ActionOpen implements ActionListenerCommand {
	private Document adoc;

	public ActionOpen(Document doc) {
		this.adoc = doc;
	}

	@Override
	public void execute() {
		adoc.Open();
	}
}