
public class Principal {

	private static Carro montarCarro(String tipo){
        Carro carro = null;
        CarroFactory factory;
        
        switch(tipo){
            case "luxo":
            	System.out.println("===================================");
            	System.out.println("Montando Carro de Luxo:");
            	factory = new CarroLuxoFactory();
                carro = new Carro(factory);
                System.out.println("Carro de Luxo Montado");
                System.out.println("-----------------------------------");
                break;
            case "popular":
            	System.out.println("===================================");
            	System.out.println("Montando Carro Popular:");
            	factory = new CarroPopularFactory();
                carro = new Carro(factory);
                System.out.println("Carro Popular Montado");
                System.out.println("-----------------------------------");
                break;
        }
        return carro;
    }
    public static void main(String[] args){
    	System.out.println("===================================");
    	System.out.println("Montando Carros:");
    	System.out.println("-----------------------------------");
        Carro c1 = montarCarro ("luxo");
        c1.paint();
        Carro c2 = montarCarro ("popular");
        c2.paint();
        System.out.println("===================================");
        System.out.println("Carros Montados");
        System.out.println("-----------------------------------");
    }
}
