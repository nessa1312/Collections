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

        System.out.println("\n Д/З коллекции №3");
        System.out.println("ДЗ-1");
        System.out.println("Задание 1");

        PhoneBook phonebook1 = new PhoneBook("+12345678900", "Королев");
        PhoneBook phonebook2 = new PhoneBook("+00987654321", "Дмитриев");
        PhoneBook phonebook3 = new PhoneBook("+673579487", "Кузнецов");
        PhoneBook phonebook4 = new PhoneBook("+65161565", "Мельников");
        PhoneBook phonebook5 = new PhoneBook("+6516156165", "Беликов");
        PhoneBook phonebook6 = new PhoneBook("+6516156165", "Зайцев");
        PhoneBook phonebook7 = new PhoneBook("+343454678", "Волков");
        PhoneBook phonebook8 = new PhoneBook("1343654787", "Медведев");
        PhoneBook phonebook9 = new PhoneBook("3243566", "Архипов");
        PhoneBook phonebook10 = new PhoneBook("565768797866", "Сокол");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(phonebook1.getName(), phonebook1.getNumber());
        hashMap.put(phonebook2.getName(), phonebook2.getNumber());
        hashMap.put(phonebook3.getName(), phonebook3.getNumber());
        hashMap.put(phonebook4.getName(), phonebook4.getNumber());
        hashMap.put(phonebook5.getName(), phonebook5.getNumber());
        hashMap.put(phonebook6.getName(), phonebook6.getNumber());
        hashMap.put(phonebook7.getName(), phonebook7.getNumber());
        hashMap.put(phonebook8.getName(), phonebook8.getNumber());
        hashMap.put(phonebook9.getName(), phonebook9.getNumber());
        hashMap.put(phonebook10.getName(), phonebook10.getNumber());

        System.out.println(hashMap);

        System.out.println("\n-----------------------------------");
        System.out.println("ДЗ-1");
        System.out.println("Задание 2");

        salad.addProductInRecipe(tomatoes, 1);
        salad.addProductInRecipe(cucumbers, 1);
        friedEgg.addProductInRecipe(eggs, 3);
        friedEgg.addProductInRecipe(beckon, 1);

        System.out.println("\n-----------------------------------");
        System.out.println("ДЗ-1");
        System.out.println("Задание 3");

        Task3 task3 = new Task3();
        task3.addInTask3("12", 12);
        System.out.println(task3.taskMap);
        task3.addInTask3("12", 13);
        System.out.println(task3.taskMap);

        System.out.println("\n-----------------------------------");
        System.out.println("ДЗ-2");
        System.out.println("Задание 1");

        Map<String, List<Integer>> hW3Task1 = new HashMap<>();
        List<Integer> integerList = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList2 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList3 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList4 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList5 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        hW3Task1.put("One", integerList);
        hW3Task1.put("Two", integerList2);
        hW3Task1.put("Three", integerList3);
        hW3Task1.put("Four", integerList4);
        hW3Task1.put("Five", integerList5);
        System.out.println(hW3Task1);

        Map<String, Integer> targetHW3Task1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> target : hW3Task1.entrySet()) {
            targetHW3Task1.put(target.getKey(), calcSumOfList(target.getValue()));
        }
        System.out.println(targetHW3Task1);

        System.out.println("\n-----------------------------------");
        System.out.println("ДЗ-2");
        System.out.println("Задание 2");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 10; i++) {
            String s = "String" + i;
            linkedHashMap.put(i, s);
        }
        System.out.println(linkedHashMap);


    }

    public static int calcSumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}