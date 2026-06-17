package OOPS.Polymorphism;
// Run Time Polymorphism  --- RunTime Polymorphism is achieved through Method Overridding

// Run time polyMorphism execute on run time
 class Lion {
    public void sound() {
        System.out.println("Lion makes sounds");
    }
}

    class Tiger extends Lion {
        @Override
        public void sound() {
            System.out.println("Roar");
        }
    }

    public  class Run{
        public static void main(String[] args) {
          Lion tiger = new Tiger();
            tiger.sound();
        }
    }




