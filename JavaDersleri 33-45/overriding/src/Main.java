public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[] {
                new OgretmenKrediManager(),new TarimKrediManager(), new OgrenciKrediManager()
        };
        for (BaseKrediManager krediManeger:krediManagers){
            System.out.println(krediManeger.hesapla(1000));
        }
    }
}