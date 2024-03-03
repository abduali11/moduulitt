package moduuli5_2;

public class main_arraylist extends Arraylist<String>{
    public static void main(String[]args){
        final main_arraylist newArraylist = new main_arraylist();

        Thread adder = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                newArraylist.addElement("Element " + i);
            }
        });


        Thread remover = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                newArraylist.removeElement("Element " + i);
            }
        });

        adder.start();
        remover.start();

           try {
                adder.join();
                remover.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("size : " + newArraylist.getSize());
    }
}