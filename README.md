# N11-Task
Kullanılan diller === Java / Gherkin

Kullanılan araçlar, Ide ve kütüphaneler === Maven / Selenium / Cucumber / TestNG  / Intelij / GitHub

Test için kullanılan browser === Mozilla Firefox

Test edilen web sitesi === n11.com

Beklenen sonuç : Ürünleri Favoriye ekleme ve silme fonksiyonlarının işlevselliği 

Öncelikle Projenin senaryoları ve adımları sırasıyla yazılmıştır.

Proje'deki web elementlerinin locater'ları pages klasöründeki "N11WebElementsPage" isimli java dosyasında saklanmaktadır ve dolayısıyla Page Factory kullanılmıştır.

Buradaki veriler Step-definitions dosyasındaki featurese bağlı metotlarda adım adım kullanılmıştır.

Projenin koşturulması yani run edilebilmesi için Cukes.runner dosyası oluşturulmuş ve buradan cucumber raporu alınması sağlanmıştır.

Kullanıcı adı ve parola için yeni bir class'ın içinde private değişkenler atanarak, datalar koruma altına alınmıştır.

Projedeki her senaryonun sonunda otomasyonun screenShot alması sağlanmış ve Target klasörünün altındaki cucumber-report.html içine match edilmiştir.
