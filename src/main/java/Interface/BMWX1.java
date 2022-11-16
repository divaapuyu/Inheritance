
package Interface;

/**
 *
 * @author DIVA
 */
public class BMWX1 implements showroom{
public String  merek;
public int kcptn, hrg;

    public void kecepatan() {
        kcptn = 201;
        System.out.println("Kecepatan max = "+kcptn+" km/jam");
    }

    public void merk() {
        merek = "BMW X1";
        System.out.println("Merk = "+merek);
    }

    public void harga() {
        hrg = 737000000;
        System.out.println("Harga = Rp"+hrg);
    }
}
