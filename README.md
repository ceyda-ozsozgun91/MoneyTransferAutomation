# Money Transfer Automation

Bu proje, Testinium Gelişim hedefleri Belirleme uygulamasındaki 2. aşama olan Otomasyon testi için yazılmıştır. 
hazırladığım mini test caselerin otomatik testlerini gerçekleştirmek amacıyla geliştirilmiş bir **Test Otomasyon Projesidir**.
Money Transfer Automation, **Selenium, Cucumber (BDD), TestNG** gibi popüler test otomasyon araçlarını içeren modüler bir mimariye sahiptir.

---

## 📌 Proje İçeriği
- **Web Test Otomasyonu**: Selenium WebDriver kullanarak UI testleri
- **BDD Yaklaşımı**: Cucumber ve Gherkin kullanılarak anlaşılır test senaryoları
- **Test Raporlama**: TestNG Default Reports ve Cucumber HTML Reports ile detaylı test raporları
- **CI/CD Entegrasyonu**: Projede şu an sürekli entegrasyon aracı kullanılmamaktadır

---

## 🚀 Kurulum

### 1️⃣ Gerekli Bağımlılıkları Yükleyin
Projeyi çalıştırmadan önce aşağıdaki bağımlılıkların sisteminizde yüklü olduğundan emin olun:

- **Java JDK 11+**
- **Maven 3+**
- **IntelliJ IDEA veya Eclipse** (Önerilen: IntelliJ IDEA)
- **Google Chrome & ChromeDriver** (Güncel sürüm önerilir)

### 2️⃣ Projeyi Klonlayın
```bash
git clone https://github.com/ceyda-ozsozgun91/MoneyTransferAutomation.git
cd MoneyTransferAutomation/WebProjectBase
```

### 3️⃣ Maven Bağımlılıklarını İndirin
```bash
mvn clean install
```

---

## 🔹 Proje Yapısı
```
WebProjectBase
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── testrunners  (Test çalıştırma sınıfları)
│   │   │   │   ├── Runner.java  (Testleri çalıştıran ana sınıf)
│   │   │   ├── util  (Yardımcı sınıflar ve konfigürasyon yöneticisi)
│   │   │   │   ├── ConfigReader.java  (Konfigürasyon dosyalarını okur)
│   │   │   │   ├── DriverFactory.java  (WebDriver yönetimini sağlar)
│   │   │   │   ├── ElementHelper.java  (Web elementleri ile işlemleri kolaylaştırır)
│   │   │   │   ├── Hooks.java  (Test başlatma ve sonlandırma işlemlerini yönetir)
│   ├── test
│   │   ├── java
│   │   │   ├── features  (Cucumber senaryolarını içerir)
│   │   │   ├── pages  (Page Object Model yapısına göre düzenlenmiş sayfa sınıfları)
│   │   │   ├── stepdefinitions  (Test adımları ve aksiyonları barındırır)
│   │   ├── resources
│   │   │   ├── config.properties (testin başlangıç url'i ve timeout verilerini barındırır)
│   │   │   ├── testng.xml (Test çalıştırma konfigürasyonu)
│── pom.xml (Maven bağımlılıkları)
│── README.md (Bu dosya)
```

---

## ✅ Testleri Çalıştırma

### 1️⃣ TestNG ile Test Çalıştırma
```bash
mvn test
```
veya src/test/resources/TestNG.xml dosyasından sağ click yapıp Run seçeneği ile çalıştır.

### 2️⃣ Cucumber Feature Dosyalarını Çalıştırma
```bash
mvn test -Dcucumber.options="src/test/resources/features"
```

---

## 📊 Test Raporları
Test çalıştırmaları sonrasında aşağıdaki raporlar oluşturulmaktadır:

1. **TestNG Default Reports**:
   - `test-output/index.html` dosyasını tarayıcınızda açarak inceleyebilirsiniz.(target/site içinde )

2. **Cucumber HTML Reports**:
   - `Reports/CucumberReport/Reports.html` dosyasını açarak detaylı senaryo raporlarını görüntüleyebilirsiniz. (Reports/CucumberReport içinde)

---

## 🔗 Faydalı Bağlantılar
- **Selenium WebDriver:** [https://www.selenium.dev/](https://www.selenium.dev/)
- **Cucumber:** [https://cucumber.io/](https://cucumber.io/)
- **TestNG:** [https://testng.org/](https://testng.org/)

---
