
package Interface;

/**
 *
 * @author DIVA
 * kecepatan, merk, harga
 */
public class toyotavios implements showroom{
public String  merek;
public int kcptn, hrg;

    public void kecepatan() {
        kcptn = 170;
        System.out.println("Kecepatan max = "+kcptn+" km/jam");
    }

    public void merk() {
        merek = "Toyota Vios";
        System.out.println("Merk = "+merek);
    }

    public void harga() {
        hrg = 355000000;
        System.out.println("Harga = Rp"+hrg);
    }
}
