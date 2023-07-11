
public class Carro {
	
   private Roda roda;
   private Som som;
   
   public Carro (CarroFactory factory) {
	   roda = factory.montarRoda();
	   som = factory.montarSom();
   }
   
   public void paint() {
	   roda.paint();
	   som.paint();
   }
}
