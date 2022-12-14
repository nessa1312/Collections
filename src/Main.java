import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1");

        Set<ProductsList> foodBasket = new HashSet<>();

        ProductsList tomatoes = new ProductsList("Помидоры", 35.0, 25.0);
        ProductsList bread = new ProductsList("Хлеб", 45.0, 25.0);
        ProductsList eggs = new ProductsList("Яйца", 66.99, 25.0);
        ProductsList beckon = new ProductsList("Бекон", 89.0, 25.0);
        ProductsList cucumbers = new ProductsList("Огурцы", 35.0, 25.0);

        tomatoes.addProductsInFoodBasket(foodBasket);
        bread.addProductsInFoodBasket(foodBasket);
        eggs.addProductsInFoodBasket(foodBasket);
        beckon.addProductsInFoodBasket(foodBasket);
        cucumbers.addProductsInFoodBasket(foodBasket);

        foodBasket.remove(eggs);

        System.out.println("\n------------------------------------");
        System.out.println("ДЗ-2");
        System.out.println("Задание 1");

        Set<Recipe> allRecipe = new HashSet<>();
        Recipe salad = new Recipe("Салат");
        Recipe friedEgg = new Recipe("Яичница");

        salad.addRecipeInSet(allRecipe);
        friedEgg.addRecipeInSet(allRecipe);

        System.out.println("\n------------------------------------");
        System.out.println("ДЗ-2");
        System.out.println("Задание 2");

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < 21; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);
        }

        integerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerSet);

        System.out.println("\n------------------------------------");
        System.out.println("ДЗ-3");
        System.out.println("Задание 2");

        int [][] mas = new int[15][3];
        for (int i = 0; i < mas.length; i++){
            for (int h = 0; h<mas[i].length; h++){
                mas[i][h] = (int)(Math.random() * 8) + 2;
                if(h == mas[i].length - 1){
                    mas[i][h] = mas[i][h-2] * mas[i][h-1];
                    for(int q = 0; q < i; q++){
                        if(mas[i][h] == mas[q][h]){
                            if(mas[i][h-1] == mas[q][h-1]||mas[i][h-2] == mas[q][h-2]) --i;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < mas.length; i++){
            System.out.print("Задание №" + (i + 1 + " Умножить "));
            for(int h = 0; h < mas[i].length; h++){
                if(h == 0)
                    System.out.print(mas[i][h] + " на ");
                if(h == 1)
                    System.out.println(mas[i][h]);
            }
        }

        System.out.println("\n=======================================");
        System.out.println("ДЗ-3");
        System.out.println("Задание 3");

        Passport passportOne = new Passport(
                1234567890L,
                "Борисов ",
                "Кирилл ",
                "Викторович ",
                "17.08.1990");
        Passport passportTwo = new Passport(
                3987654321L,
                "Сафонов ",
                "Никита ",
                "Иванович ",
                "12.09.2001");
        Passport passportThree = new Passport(
                6578900897L,
                "Золотова ",
                "Анна ",
                "Макаровна ",
                "22.03.1978");
        Passport passportFour = new Passport(
                5678965787L,
                "Краснов ",
                "Михаил ",
                "Александрович ",
                "30.01.1997");

        HashMap<Long, Passport> passportMap = new HashMap<>();

        passportMap.put(passportOne.getNumPassport(), passportOne);
        passportMap.put(passportTwo.getNumPassport(), passportTwo);
        passportMap.put(passportThree.getNumPassport(), passportThree);
        System.out.println(passportMap);
        passportMap.put(passportFour.getNumPassport(), passportFour);
        System.out.println(passportMap);

        System.out.println(passportMap.get(5566778899L));

    }
}