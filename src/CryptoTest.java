import java.net.URLEncoder;

public class CryptoTest {
    public static void main(String[] args) throws Exception {
        Aes256 aes256 = new Aes256();
        String text = "157264";
        String cipherText = aes256.encrypt(text);
        System.out.println(text);
        System.out.println(cipherText);
        System.out.println(URLEncoder.encode(cipherText, "UTF-8")); // javascript의 encodeURIComponent와 동일
        System.out.println(aes256.decrypt(cipherText));

        // 결과
        // 157264
        // y/Sn3Iluoa3XPxt8zEUPzw==
        // y%2FSn3Iluoa3XPxt8zEUPzw%3D%3D
        // 157264
    }
}