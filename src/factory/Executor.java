package factory;

    public  class Executor {
        public static void main(String[] args) {

            Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
            sandwich.makeUp();
        }
    }
