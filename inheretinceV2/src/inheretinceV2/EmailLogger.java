package inheretinceV2;

public class EmailLogger extends Logger {
	@Override // Bunu yazmasan da olur ama kod okunurlu�u i�in gerekli
	public void log() {
		System.out.println("Email yolland�");
	}
}
