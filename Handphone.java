public class Handphone extends Perangkat {
    protected boolean fingerprint = false;

    // constructor
    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        System.out.println("hp ini memiliki " + drive + "... " + processor + " finger : " + fingerprint);
    }

    public void telfon(int no_hp) {
        System.out.println("hp berhasil " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println(" handphone berhasil mengirim sms ke no " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("handphone berhasil mengirim sms ke no " + no_hp1 + "dan" + no_hp2);
    }
}
