# Dosya İşlemleri Java Uygulaması

Bu basit Java uygulaması, dosya oluşturma, dosya bilgilerini alma, dosyayı okuma ve dosyaya yazma işlemlerini gerçekleştiren temel bir program içerir.

## Kullanım

1. **Dosya Oluşturma:**
   - Program, `createFile` fonksiyonu ile "student.txt" adında bir dosya oluşturur.
   - Dosya zaten varsa, "dosya zaten mevcut" mesajını görüntüler.

2. **Dosya Bilgileri Alma:**
   - `getFileInfo` fonksiyonu, oluşturulan dosyanın adını, yolunu, yazılabilir ve okunabilir olup olmadığını, dosya boyutunu (byte cinsinden) görüntüler.

3. **Dosya Okuma:**
   - `readFile` fonksiyonu, "student.txt" dosyasını okur ve her satırı ekrana yazdırır.

4. **Dosyaya Yazma:**
   - `fileWriter` fonksiyonu, "student.txt" dosyasına yeni bir satır ("AHMET") ekler.

5. **Programın Çalıştırılması:**
   - `Main` sınıfındaki `main` fonksiyonu içinde, yukarıdaki adımların tamamını gerçekleştiren fonksiyonları çağırarak programı çalıştırabilirsiniz.

## Notlar

- Dosya yollarını düzenlerken, kendi dosya sistem yolunuza uygun olarak değiştirmeyi unutmayın.

## Bağımlılıklar

Bu program, Java'nın standart kütüphanelerini kullanmaktadır. Ek bir bağımlılık gerektirmez.
