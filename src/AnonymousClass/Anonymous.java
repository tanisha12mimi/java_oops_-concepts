package AnonymousClass;

interface Animal{
    void sound();

    void sleep();
}




public interface Anonymous {
    public static void main(String[] args) {

        Animal a = new Animal(){
            @Override
            public void sleep() {
                System.out.println("cat is sleeping");
            }

            @Override
            public void sound() {
                System.out.println("dog barks");
            }
        };

     a.sleep();
     a.sound();

    }
}
