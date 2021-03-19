package pbo2;
public class PBO2 {
   public static void main(String[] args) {
       Student jali = new Student();
       
       jali.input(80);
       jali.input(60);
       jali.input(70);
       System.out.println(jali.calculateAve());
       
       Student chotabim = new Student();
       chotabim.input(80);
       chotabim.input(50);
       chotabim.input(85);
       chotabim.input(65);
       chotabim.input(95);
       chotabim.input(60);
       chotabim.input(45);
       chotabim.input(75);
       System.out.println(chotabim.calculateAve());
   }
}
       class Student {
       private double score;
       private int count = 0;
            void input(double score){
                this.count ++;     
                this.score += score;
            }  
            double calculateAve() {
                return this.score / this.count;
            }
    }
    

//        Human jali = new Human("jali", 18);
//        Human chotabim = new Human("chotabim", 10);
//        Human nobita = new Human("nobita", 14);
//        
//        jali.walk();
//        jali.talk();
//        
//        chotabim.walk();
//        chotabim.talk();
//        
//        nobita.walk();
//        nobita.talk();
//    }
//}


  
   
//   class Human {
//    private String name;
//    private int age;
//    
//    Human(String name, int age) {
//        this.name = name;
//        this.age = age;
//        
//    }
//    
//   void walk() {
//       System.out.println("Human" + "(" + this.name + ")" + "is Walking");
//   }
//   void talk() {
//       System.out.println("Human" + "(" + this.name + ")" + "is Talking");
//   }
//} 