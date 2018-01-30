import java.util.Scanner;
import java.security.SecureRandom;
import java.math.BigInteger;


class RSA{
	
    BigInteger p;
    BigInteger q;
    BigInteger n;
    BigInteger phi;
    BigInteger e;
    BigInteger d;
    int bitlength = 512;  
	
    RSA(){
	SecureRandom r = new SecureRandom();
	p = BigInteger.probablePrime(bitlength*2, r);
	q = BigInteger.probablePrime(bitlength*2, r);
	n = p.multiply(q);
	phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
	e =  BigInteger.probablePrime(bitlength,r) ;  // BigInteger.valueOf(3)
	BigInteger phiGCDe = phi.gcd(e);
	while (phiGCDe.compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0)
		e.add(BigInteger.ONE);
	d = e.modInverse(phi);
    }

    byte[] encrypt(byte[] message)
    {
	BigInteger encrypt = new BigInteger(message);
	encrypt = encrypt.modPow(e,n);
	byte[] encrypted = encrypt.toByteArray();
	return encrypted;
    }

    byte[] decrypt(byte[] cipher)
    {
	BigInteger decrypt = new BigInteger(cipher);
	decrypt = decrypt.modPow(d,n);
	byte[] message = decrypt.toByteArray();
	return message;
    }

    public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
		String msg = new String();
		System.out.println("Enter the message : ");
		msg = s.nextLine();
		//for (int i=0;i<100;i++)
		//	msg = msg + "a";
		System.out.println("Message is : "+msg);		
		byte[] message = msg.getBytes();
		System.out.println("\n Message in Bytes : ");
		for (byte b : message)
			System.out.print(b+" ");
		System.out.print('\n');		
		RSA rsa = new RSA();
		System.out.println("\n Public Key : " + rsa.e + " , " + rsa.n);
		System.out.println("\n Private Key : " + rsa.d + " , " + rsa.n);
		byte[] encrypted = rsa.encrypt(message);
		System.out.println("\n Encrypted String in Bytes : ");
		for (byte b : encrypted)
			System.out.print(b+" ");
		System.out.print('\n');	
		System.out.println("Encrypted byte length:"+encrypted.length);
		System.out.println("\n Encrypted String  : "+new String(encrypted));
		byte[] decrypted = rsa.decrypt(encrypted);
                System.out.println("\n Decrypted String in Bytes : ");
		for (byte b : decrypted)
			System.out.print(b+" ");
		System.out.print('\n');	
		System.out.println("\n Decrypted String  : "+new String(decrypted));
    }

}
