
public class CarroLuxoFactory implements CarroFactory{

	@Override
	public Roda montarRoda() {
		return new RodaLigaLeve();
	}

	@Override
	public Som montarSom() {
		return new CDPlayer();
	}

}
