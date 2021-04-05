package pbo4;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.UUID;
public class PBO4 {
    public static void main(String[] args) {
        Mobil a = new Mobil(UUID.randomUUID().toString());
        Mobil b = new Mobil(UUID.randomUUID().toString());
        Mobil c = new Mobil(UUID.randomUUID().toString());
        
        System.out.println(a.show());
        System.out.println(b.show());
        System.out.println(c.show());
        }
    }   
    class Mobil{
        private String id;
        private String name;
        private BigDecimal price;
        private LocalDateTime expired;
        private Category category;
        
        private final String[] items = {"Mor", "Kaca", "Body", "Ban"};
        Random random = new Random();
        int rand = random.nextInt(items.length);
        
        // 1 args constrcutor
        public Mobil(String id) {
            this(id, null);
        }
        // 2 args constrcutor
        public Mobil(String id, String barang) {
            this(id, barang, new BigDecimal(650000));
        }
        // 3 args constrcutor
        public Mobil(String id, String name, BigDecimal price) {
            this(id, name, price, LocalDateTime.now().plus(3, ChronoUnit.WEEKS));
    }

    // 4 args constrcutor
        public Mobil(String id, String name, BigDecimal price, LocalDateTime expired) {
            this(id,name, price,expired, Category.OTOMOTIF);
    }

    // all args constrcutor
        public Mobil(String id, String name, BigDecimal price, LocalDateTime expired, Category category) {
        this.id        = id;
        this.name      = items[rand];
        this.price     = price;
        this.expired   = expired;
        this.category  = category;
    }

    // show data
    public String show() {
        return  "\n\n  id       = " + this.id   + "\n" +
                "  name     = " + this.name     + "\n" +
                "  price    = " + this.price    + "\n" +
                "  expired  = " + this.expired  + "\n" +
                "  cateogry = " + this.category + "\n";
    }
}

enum Category {
    OTOMOTIF
}
  
