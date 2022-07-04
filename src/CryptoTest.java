import java.net.URLEncoder;

public class CryptoTest {
    public static void main(String[] args) throws Exception {
        Aes256 aes256 = new Aes256();
        String text = "75354";
        String cipherText = aes256.encrypt(text);
        System.out.println(text);
        System.out.println(cipherText);
        System.out.println(URLEncoder.encode(cipherText, "UTF-8")); // javascript의 encodeURIComponent와 동일
        System.out.println(aes256.decrypt(cipherText));


        String text2 = "90737";
        String cipherText2 = aes256.encrypt(text2);
        System.out.println(text2);
        System.out.println(cipherText2);
        System.out.println(URLEncoder.encode(cipherText2, "UTF-8")); // javascript의 encodeURIComponent와 동일
        System.out.println(aes256.decrypt(cipherText2));
    }
}