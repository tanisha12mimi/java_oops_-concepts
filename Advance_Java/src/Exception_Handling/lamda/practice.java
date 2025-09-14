package Exception_Handling.lamda;

class clamlimit extends Exception {
    public clamlimit(String i) {
        super(i);
    }
}
 abstract class employee {
        int empid;
        String empNm;

        public void applyReimbursement(double ammount) {

        }}
    class Fulltimeemployee extends employee {
        int maxlimit=50000;

        @Override
        public void applyReimbursement(double ammount) {
           try {
               if (ammount>maxlimit) {
                  throw  new clamlimit("employee claims more than the limit   "+ ammount);

               }
               else {
                   System.out.println("approved");
               }
           }
           catch (clamlimit e){
            e.getMessage();
           }

        }
    }

    class Contarctemp extends employee {
        int maxlimit = 10000;

        @Override
        public void applyReimbursement(double ammount) {
            try {
                if (ammount>maxlimit) {
                    throw new clamlimit("employee claims more than the limit  " + ammount);
                }
                else{
                    System.out.println("approved" );
                }

            } catch (clamlimit e) {
                System.out.println(e.getMessage());


            }
        }
    }

            public class practice {
                public static void main(String[] args) {
                    // full -time
                    Fulltimeemployee f = new Fulltimeemployee();
                    System.out.println("Full time employee data :-   ");

                    f.applyReimbursement(60000);
                    System.out.println("_________________");

                    f.applyReimbursement(4000);


//                   // Contarctemp

                    Contarctemp C = new Contarctemp();
                    System.out.println("Conatract  employee data :-   ");

                    C.applyReimbursement(20000);
                    System.out.println("_________________");
                    C.applyReimbursement(5000);


                }
            }













