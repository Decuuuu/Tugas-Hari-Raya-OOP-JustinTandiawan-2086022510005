import java.util.*;

public class THROOPQ2 {
    public static void main(String[] args) {
        // Menggunakan Scanner untuk input sesuai contoh soal [cite: 43, 49, 55, 61]
        try (Scanner sc = new Scanner(System.in)) {
            // Input 1: Nama Leader (Jotaro, Okuyasu, dll)
            String leader = sc.nextLine(); 

            // Input 2: Daftar nama suspek dipisahkan spasi
            String namesInput = sc.nextLine(); 
            
            String[] names = namesInput.split(" ");
            
            // Menggunakan List untuk menampung hasil tangkapan
            List<String> arrested = new ArrayList<>();
            
            // Logika filter berdasarkan "Hidden Hint" di soal [cite: 70, 71, 72, 73, 74]
            for (String name : names) {
                if (leader.equalsIgnoreCase("Jotaro")) {
                    if (name.length() <= 3) arrested.add(name); // Jotaro: Nama <= 3 huruf [cite: 71]
                } 
                else if (leader.equalsIgnoreCase("Okuyasu")) {
                    if (hasDoubleLetter(name)) arrested.add(name); // Okuyasu: Double letters [cite: 72]
                } 
                else if (leader.equalsIgnoreCase("Koichi")) {
                    if (countVowels(name) >= 3) arrested.add(name); // Koichi: >= 3 vokal [cite: 73]
                } 
                else if (leader.equalsIgnoreCase("Rohan")) {
                    if (isPalindrome(name)) arrested.add(name); // Rohan: Palindrome [cite: 74]
                } 
                else if (leader.equalsIgnoreCase("Josuke")) {
                    if (name.toLowerCase().startsWith("k")) arrested.add(name); // Josuke: Huruf depan K [cite: 70]
                }
            }
            
            // Output sesuai format dokumen [cite: 47, 48, 53, 54]
            if (arrested.isEmpty()) {
                System.out.println(leader + " exposed no one.");
            } else {
                System.out.println(leader + " exposed someone!");
            }
            System.out.println("Arrested: " + arrested);
            
        } catch (Exception e) {
            // Menghindari crash jika input tidak sesuai
        }
    }

    // Fungsi pembantu (Helper Methods)
    private static boolean hasDoubleLetter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) return true;
        }
        return false;
    }

    private static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }
}

class Stand {
    String name;
    public Stand(String name) {
        this.name = name;
    }
}