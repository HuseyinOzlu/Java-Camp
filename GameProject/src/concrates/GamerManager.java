package concrates;

import abstracts.GamerServices;
import entities.Gamer;

public class GamerManager implements GamerServices {

	@Override
	public  void add(Gamer Gamer) {
		if (GamerCheckManager.checkIfRealPerson(Gamer)) {
			System.out.println(Gamer.getFirstName() + " isimli yeni �ye eklendi.");
		} else {
			System.out.println("L�tfen bilgilerinizi dogru giriniz.");
		}}
	@Override
	public void delete(Gamer gamer) {
			System.out.println("Oyuncu silindi : "+ gamer.getFirstName());
	}
	
	@Override
	public void update(Gamer gamer) {
			System.out.println("Bilgileriniz g�ncellendi : "+ gamer.getFirstName());
		}

}
