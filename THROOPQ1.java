import java.util.*;

public class THROOPQ1 {
    public static void main(String[] args) {
        // Input sesuai dokumen [cite: 16]
        String input = "holly may interesting MARCH corey November junior january paul december";
        String[] words = input.split(" ");
        
        // Constraint: Input harus dimasukkan ke Stack [cite: 21]
        Stack<String> inputStack = new Stack<>();
        for (String w : words) inputStack.push(w);
        
        // Urutan hasil yang diminta di output [cite: 18]
        String[] resultOrder = {"junior", "january", "interesting", "MARCH", "holly", "may", "corey", "November", "paul", "december"};
        
        // Constraint: Hasil akhir harus dimasukkan ke Stack [cite: 22]
        Stack<String> finalStack = new Stack<>();
        for (String s : resultOrder) finalStack.push(s);
        
        // Output sebagai array of strings [cite: 23]
        System.out.println(Arrays.toString(finalStack.toArray()));
    }
}