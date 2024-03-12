package com.direncan.matematik;

public class Matematik implements IMatematik {  //  1  //  IMatematik interfacesini implemente ettik.  //  7

//  Sonrasında ise metodları implemente etik.  //  8
    @Override
    public void toplama(int a, int b) {  //  9
        System.out.println("Toplama Sonucu : " + (a + b));
    }

    @Override
    public void cikarma(int a, int b) {  //  10
        System.out.println("Çıkarma Sonucu : " + (a - b));

    }

    @Override
    public void carpma(int a, int b) {  //  11
        System.out.println("Çarpma Sonucu : " + (a * b));

    }

    @Override
    public void bolme(int a, int b) {  //  12
        System.out.println("Bölme Sonucu : " + ((double)a / b));

    }

    /* Dikkatli inceleyecek olursak biz bu projenin main metodu bulunan bir java dosyası yazmadık. Çünkü biz bu java
    dosyalarını bir jar dosyasına dönüştürüp, jar dosyasını başka bir projeye ekleyeceğiz ve bu classları o projede
    kullanacağız. */  //  13

    /*

    Bu jar oluşturmak için:
    https://stackoverflow.com/questions/1082580/how-to-build-jars-from-intellij-properly

    Bu da jarı diğer projeye dahil etmek için:
    https://stackoverflow.com/questions/1051640/correct-way-to-add-external-jars-lib-jar-to-an-intellij-idea-project


    Mevcuttaki bir projeyi JAR dosyası olarak kaydetmek için izlenecek yol:

    File > Project Structure > Project Settings > Artifacts > Click "+" (plus sign) > Jar > From modules with dependencies...

    Select Extract to target Jar

    Click "OK"

    Click Apply / OK

     */

}
