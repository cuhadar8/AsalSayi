
public class Main {
	
	public static boolean isPrime(int number) {  //boolean tipinde, gönderilen sayının asal olup olmadığını veren
												//bir metot tanımladım	
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		for(int i = 2; i < 100; i++) {       
			if(isPrime(i))                          //Daha sonra bu metodun içine 2 den 100 e kadar olan tüm sayıları
				System.out.print(i + " ");          //for döngüsüyle gönderdim
		}
	}
}
