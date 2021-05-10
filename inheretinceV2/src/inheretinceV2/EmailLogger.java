package inheretinceV2;

public class EmailLogger extends Logger {
	@Override // Bunu yazmasan da olur ama kod okunurluðu için gerekli
	public void log() {
		System.out.println("Email yollandý");
	}
}
