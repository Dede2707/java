import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class belanja {
    public static void main(String[] args) {
        // belanja
        String input = JOptionPane.showInputDialog("Total belanja:");
        double totalBelanja = Double.parseDouble(input);
        
        double diskon = (totalBelanja < 100000) ? (totalBelanja * 0.05) : (totalBelanja * 0.10);
        
        // Setelah diskon
        double Diskon = totalBelanja - diskon;

        // Format currency
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String Hasil = "Total belanja: " + format.format(totalBelanja) + "\nDiskon: " + format.format(diskon) + "\nTotal Bayar: " + format.format(Diskon);
        //hasil
        JOptionPane.showMessageDialog(null, Hasil);
    }
}
