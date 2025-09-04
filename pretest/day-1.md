## 🧠 **Pre-Test Backend Engineer (Java, OOP, Spring Boot)**

---

### 🔸 **A. Pilihan Ganda (5 Soal)**

1. Apa yang menjadi tanggung jawab utama seorang Backend Engineer?

   - A. Mendesain UI
   - **B. Mengelola logika aplikasi dan komunikasi data dengan database**
   - C. Membuat animasi
   - D. Membuat desain grafis

2. Dalam OOP Java, konsep **encapsulation** berarti:

   - A. Menyembunyikan detail implementasi dan menyediakan akses lewat method
   - **B. Mewarisi method dari class lain**
   - C. Menambahkan method ke dalam class
   - D. Menghubungkan dua class yang berbeda

3. `@Autowired` pada Spring Boot digunakan untuk:

   - A. Menjalankan program utama
   - B. Menyimpan konfigurasi properties
   - **C. Meng-inject dependency otomatis ke dalam bean**
   - D. Mendaftarkan endpoint baru

4. Mengapa sebaiknya logika bisnis diletakkan di service layer?

   - **A. Agar controller lebih ringan dan fokus pada request/response**
   - B. Agar lebih cepat dalam compile
   - C. Karena controller tidak mendukung operasi logika
   - D. Agar dapat digunakan langsung tanpa testing

5. Di bawah ini adalah cara yang benar membuat endpoint di Spring Boot:

   - A. `@Route("/api")`
   - B. `@Mapping("/api")`
   - **C. `@GetMapping("/api")`**
   - D. `@WebRoute("/api")`

---

### 🔸 **B. True / False (5 Soal)**

6. Dalam arsitektur backend, service biasanya dipanggil langsung dari frontend. **FALSE**
7. Constructor Injection adalah cara yang direkomendasikan untuk dependency injection di Spring. **TRUE**
8. `@Service` digunakan untuk menandai sebuah class sebagai penyedia logika bisnis. **TRUE**
9. Semua logika bisa ditaruh dalam controller agar tidak perlu membuat banyak file. **FALSE**
10. Spring Boot memerlukan `main()` method untuk menjalankan aplikasinya. **TRUE**

---

### 🔸 **C. Jawaban Singkat Penjelasan (10 Soal)**

11. Jelaskan apa itu Backend dan bagaimana perannya dalam aplikasi.
Backend adalah bagian dari aplikasi yang berjalan di server dan bertugas mengatur logika, proses bisnis, autentikasi, komunikasi dengan database, serta menyediakan API untuk frontend.
12. Apa perbedaan antara class dan object dalam Java?
Class adalah sebuah blueprint yang memiliki atribute dan method untuk membuat sebuah object/entitas
13. Sebutkan dan jelaskan 2 prinsip OOP lainnya selain encapsulation.
Inheritance: pewarisan sifat dari class parent ke class child, agar attribute dan method bisa digunakan kembali.
Polymorphism: kemampuan object untuk memiliki banyak bentuk (method yang sama dapat berperilaku berbeda).
14. Mengapa kita menggunakan annotation `@RestController`?
Penanda class yang menangani request web (@controller) dan response data (@responsebody)
15. Apa keuntungan menggunakan Spring Boot dibanding membuat server dari nol di Java?
Auto configuration yang membuat proses pembuatan menjadi lebih cepat
16. Jelaskan cara kerja dependency injection di Spring Boot secara sederhana.
Spring secara otomatis membuat bean dan menyuntikkannya ke constructor atau field sehingga tidak perlu membuat object dengan "new"
17. Apa manfaat memisahkan controller dan service dalam arsitektur aplikasi?
Agar struktur code lebih terstruktur (clean architecture) dimana controller fokus pada penanganan request dan response, sedangkan service fokus pada logika bisnis
18. Jelaskan apa yang terjadi jika Anda tidak menambahkan `@Service` pada class yang berisi logika.
Class tidak dikenali Spring sebagai service dan logikanya tidak dapat di inject ke controller
19. Apa itu `@RequestParam` dan kapan digunakan?
Mengambil data dari query parameter url
20. Bagaimana cara menghubungkan controller ke service menggunakan constructor?
Menggunakan constructor injection

---

### 🔸 **D. Koreksi Kode (5 Soal)**

> Jelaskan kesalahan dan berikan versi yang benar.

21.

```java
@RestController
public class HelloController {
    // helloService not defined
    private final HelloService helloService;
    // make constructor
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); 
    }
}
```

22.

```java
public class Person {
    // private modifier for attribute
    private String name;

    // public modifier for constructor
    public Person(String name) {
        this.name = name;
    }
}
```

23.

```java
@RestController
public class GreetController {
    // request body doesnt have data type
    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name;
    }
}
```

24.

```java
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// controller
@RestController
public class InfoController {
    // define the InfoService object so that this class can use the get method, which returns the getInfo method from the Info object
    // can also use autowired
    // private final InfoService infoService;
    // public InfoController(InfoService infoService) {
    //     this.infoService = infoService;
    // }
    @AutoWired
    InfoService info;

    @GetMapping("/info")
    public String get() {
        return info.getInfo();
    }
}
```

25.

```java
@RestController
public class MathController {
    // parameters must be marked with @RequestParam to indicate where they come from
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
```
