package fundamentos;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 1000000L;
		
		System.out.println(b.byteValue()); //pegando o valor
		System.out.println(s.toString()); // convertendo para String
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString());// convertendo para string
		
		Character c = '$';
		System.out.println(c);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 1231.7545;
		System.out.println(d);
	}

}
