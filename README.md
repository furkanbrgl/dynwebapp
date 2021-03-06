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


### Spring Security Framework

Spring Boot, güvenlik ihtiyaçlarını karşılamak için Spring Security Framework’ü kullanmaktadır.
Spring Security web uygulamaları için kimliklendirme ve yetkilendirme kabiliyetleri sunan kapsamlı bir güvenlik framework’üdür.

Bütün HTTP endpoint'leri güvenlik altına alınmıştır.
Kullanıcı adı user olan, password'ü rastgele belirlenmiş ve lNFO log düzeyinde console'a yazılan  bir kullanıcı mevcuttur.


Default kullanıcı adını, password'ü ve rollerini değiştirmek mümkündür
security.user.name=user security.user.password=secret security.user.role=USER,ACTUATOR


Default Configleri ezmek için;


@Configration
SecurtyConfigration extends WebSecurityConfigurerAdapter {}

Aşağıdaki statik web resource path'leri public resource olarak erişilmektedir.

/css/** 

/js/** 

/webjars/** 

/**/favicon.ico

/images/** 
##### Usage

```<dependency>
<dependency> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-security</artifactId> </dependency>
```

### Spring Boot and E-Posta Sender
Spring Boot e-posta gönderimi için Java Mail API’sini kullanmaktadır 

E-posta gönderiminde ana sınıf Spring tarafından tanımlanmış JavaMailSender arayüzüdür 

Spring Boot JavaMailSender bean konfigürasyonunu otomatik olarak gerçekleştirir

##### Usage

```<dependency>
<dependency> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-mail</artifactId> </dependency>

spring.mail.host=localhost

spring.mail.port=1125 
spring.mail.properties.mail.smtp.connectiontimeout=5000 
spring.mail.properties.mail.smtp.timeout=3000 
spring.mail.properties.mail.smtp.writetimeout=5000
```

Spring bütün e-posta mesajları için MailMessage isimli ortak bir arayüz tanımlamıştır


SimpleMailMessage gerçekleştirimi ile metin tabanlı basit e-posta mesajları gönderilebilir

 MimeMailMessage gerçekleştirimi ile de zengin içerikli veya ek barındıran MIME mesajları gönderilebilir
 
##### Test to sended message

Geliştirme ortamında e-posta gönderimini test etmek için Dumpster veya FakeSMTP gibi basit test amaçlı SMTP sunucuları kullanılabilir

$java -jar fakeSMTP-2.0.ja


## Spring Boot Cache
Controller veya sevis katmanlarında yer alan bean lerin method ların return degerlerinin cache lenmesinde kullanılmakta.

ORM 2nd level cache kabiliyeti persistent domain nesnelerinin state lerinin ön bellekte tutulmasını saglar. (db'ye gitmez)

Spring cache ise method invokasyonlarının return degerlerinin ön bellekten getirmeyi saglar.

Spring Application Level Cache -> Controller, Service Layer
ORM/Hibernate 2nd Level Cache -> DAO Layer

Spring Boot farklı cache proverder ları desteklemektedir; 
Jcache, EhCache, Hazelcast, Redis, Caffeine

##### Usage

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
    <version>2.1.4.RELEASE</version>
</dependency>

@Cacheable("region")
```