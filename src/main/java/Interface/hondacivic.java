
package Interface;

/**
 *
 * @author DIVA
 */
public class hondacivic implements showroom{
public String  merek;
public int kcptn, hrg;

    public void kecepatan() {
        kcptn = 235;
        System.out.println("Kecepatan max = "+kcptn+" km/jam");
    }

    public void merk() {
        merek = "Honda Civix";
        System.out.println("Merk = "+merek);
    }

    public void harga() {
        hrg = 587000000;
        System.out.println("Harga = Rp"+hrg);
    }
}
