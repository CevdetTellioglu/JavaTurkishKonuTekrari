package _21_NesneVeSinifYapisi._25_inheritance;

public class SuperClassVeSubClass {




        //Superclass ve Subclass

        /*
        Sınıfların birbirlerinden türemeleri sonucunda superclass
        ve subclass kavramları ortaya çıkar. Bir sınıf başka bir
        sınıftan türüyorsa yani başka bir sınıfın değişkenlerini
        ve metotlarını miras alıyorsa subclass olarak adlandırılır.
        Eğer bir sınıftan başka bir sınıf miras alınıyor veya
        türetiliyorsa o sınıf superclass olarak adlandırılır.

        Kısacık bir örnekle superclass ve subclass ‘ın nasıl gözüktüğüne
        aşağıdaki kod parçasından gözatabiliriz.
        */

    public int intValue;
    public void testMethod(){
    }

    class SubClassTest extends SuperClassVeSubClass{
        public void subMethods(){
            super.testMethod();
            int value = super.intValue;
        }
    }

























}
