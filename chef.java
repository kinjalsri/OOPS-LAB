class Chef {
    public void makeSpecialDish() {
        System.out.println("Making a generic special dish");
    }
}

class ItalianChef extends Chef {
    public void makeSpecialDish() {
        System.out.println("Making pasta");
    }
}

class ChineseChef extends Chef {
    public void makeSpecialDish() {
        System.out.println("Making dumplings");
    }
}

class MexicanChef extends Chef {
    public void makeSpecialDish() {
        System.out.println("Making tacos");
    }
}

 class RestaurantTest {
    public static void main(String[] args) {
        Chef[] chefs = {new ItalianChef(), new ChineseChef(), new MexicanChef()};
        
        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }
    }
}
