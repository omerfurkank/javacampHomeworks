package gameProject;

public class Main {

	public static void main(String[] args) {
Game game=new Game(1, "Aeo2");
Gamer gamer=new Gamer(1, "furkan", "k�l��", "1999");
Campaign campaign=new Campaign(1, "b�y�k indirim");

Sale sale=new Sale(1,1,1,1);
SaleManager manager=new SaleManager();
manager.add(sale);
	}

}
