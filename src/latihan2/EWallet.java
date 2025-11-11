package latihan2;

// Implementasikan class EWallet implements Pembayaran
public class EWallet implements Pembayaran {
     private String nomorTelepon;
    // Constructor dan implement methods
    public EWallet(String nomorTelepon){

    }
    @Override
    public void prosesPembayaran(double jumlah){
        System.out.println("Procecing E-Wallet paymetn: Rp "+ jumlah);
        System.out.println("Payment successful via E-Wallet");
    }

    @Override
    public String getMetodePembayaran() {
        return "E-Wallet";
    }
}
