package inter_face;

 interface  language {
     interface greeting {
         void hello();

         void bye();

     }
 }
 class English implements language.greeting{
     @Override
     public void hello() {
         System.out.println("HEllo");
     }

     @Override
     public void bye() {
         System.out.println("BYE");

     }
 }

public class anonymous {
    public static void main(String[] args) {

        English eng  =new English();
        eng.hello();
        eng.bye();






        language.greeting BEN = new language.greeting(){

            @Override
            public void hello() {
                System.out.println("namoskar");
            }

            @Override
            public void bye() {
                System.out.println("aschi");
            }
        };


        System.out.println("___________Form Anonymous  :-____________ ");
        BEN.hello();
        BEN.bye();




        }
    }

