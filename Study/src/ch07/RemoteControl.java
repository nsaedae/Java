package ch07;

public interface RemoteControl {
	
	// 추상메서드
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}
