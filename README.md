### Spring Boot Actuator

Uygulama ile ilgili durum bilgisine erişim, Çalışma zamanında log konfigürasyonuna erişim, JVM’e yüklenen sınıflar, heap hafıza miktarı, Veritabanı/önbellek miktarı, İşletim sistemindeki process sayısı, disk kapasitesi.
```bash
/info   - Uygulamaya özel bir bilgi görüntüler
/dump   - Thread dump almayı sağlar
/trace  - Uygulamaya yapılmış son 100 HTTP isteğini görüntüler
/health - Uygulamanın sağlıklı çalışıp çalışmadığını sorgulamayı sağlar
/env    - Uygulamanın ortam değişkenlerini ve değerlerini listeler

localhost:8080/actuator/health
```
##### Usage

```<dependency>
 <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter- actuator</artifactId> </dependency>
```

### Java Server Pages (JSP) 
Dinamik web sayfaları geliştirmek için kullanılır.
Spring Boot’un önerisi dinamik web sayfaları için JSP yerine Thymeleaf, FreeMarker gibi template engine’ler kullanılmasıdır. 
##### Usage
JSP sayfaları src/main/webapp dizini altında bir lokasyonda oluşturulmalıdır. 
Dolayısı ile pom.xml içerisinde projenin packaging tipi war olmalıdır.
JSP sayfalarını çözümleyen built-in ViewResolver bean’ına prefix ve suffix tanımları yapılarak kod içerisinde tekrar eden path bilgileri ortadan kaldırılabilir.

spring.mvc.view.prefix=/WEB-INF/jsp/

spring.mvc.view.suffix=.jsp
 
```<dependency>
<dependency> <groupId>org.apache.tomcat.embed</groupId> <artifactId>tomcat-embed-jasper</artifactId> </dependency>
<dependency> <groupId>javax.servlet</groupId> <artifactId>jstl</artifactId> </dependency>
```
### Thymeleaf
Spring Boot dinamik web sayfaları geliştirmek için JSP’ye alternatif diğer şablon motorları (template engine) için otomatik konfigürasyon kabiliyeti sunar 

Varsayılan durumda şablon dosyaları classpath altında /templates isimli bir dizin altında aranı

Şablon dosyalarının içeriği ön bellekte tutulabilmektedir.
spring.thymeleaf.cache=true
Şablon motoru ile ilgili starter eklendiğinde view resolution kabiliyeti de otomatik olarak devreye girer .
spring.thymeleaf.enabled=true 

### H2 Veritabanı
Açık kaynak kodlu ve kullanımı oldukça kolay bir SQL veritabanıdır.
Java tabanlıdır, veriyi dosya sisteminde saklar.
Gömülü veya harici bir process şeklinde çalıştırılabilir.
Tarayıcı üzerinden console erişimi sunar
Tarayıcı üzerinden H2’nin console’una erişmek ve veritabanı üzerinde işlemler yapmak mümkündür.Spring Boot H2 console’u otomatik olarak aktive eder 

```<dependency>
<dependency> <groupId>com.h2database</groupId> <artifactId>h2</artifactId> <scope>runtime</scope> </dependency>

http://localhost:8080/h2-console
```
