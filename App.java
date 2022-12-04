public class App {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("adata", 2, 1);
        perangkat1.informasi();

        laptop laptop1 = new laptop("SEAGATE", 8, 2, true);
        laptop1.informasi();
        laptop1.bukaGame("dota 2");
        laptop1.kirimEmail("niceyuk@gmail.com");
        laptop1.kirimEmail("ilzadk@gmail.com", "ilzadzul@gmail.com");

        Handphone hp = new Handphone("sandis", 3, 2,false );
        hp.informasi();
        hp.telfon(628122122);
        hp.kirimSMS(628521120);
        hp.kirimSMS(628122122, 628521120);

    }
}
