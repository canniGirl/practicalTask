import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] nameOfProduct = new String[]{"potato", "apple", "watermelon"};
        int[] productId = new int[]{7, 9, 8};
        float[] price = new float[]{78f, 30.59f, 25f};
        System.out.println("All of products : " + Arrays.toString(nameOfProduct));
        int[] customersId = new int[]{1, 3, 6};
        String[] customerNames = new String[]{"Marinett", "Adrien", "Luka"};
        String[] customerLastName = new String[]{"Dupain-Cheng", "Agreste", "Kuffen"};
        float[] customerAmountOfMoney = new float[]{58f, 250.57f, 14.90f};
        System.out.println("First name : " + Arrays.toString(customerNames) + "Last name : " + Arrays.toString(customerLastName));
        Scanner inputId = new Scanner(System.in);
        System.out.println("Enter your id");
        int firstInputCustomerId = inputId.nextInt();
        int customerIdIndex = 0;
        if (firstInputCustomerId == customersId[0]) {
            customerIdIndex = 0;
        } else if (firstInputCustomerId == customersId[1]) {
            customerIdIndex = 1;
        } else if (firstInputCustomerId == customersId[2]) {
            customerIdIndex = 2;
        }

        System.out.println("Choose product from the list : " + Arrays.toString(nameOfProduct));
        String inputProduct = inputId.next();
        int nameOfProductIndex  =0;
           if (inputProduct.equals(nameOfProduct[0])) {
                nameOfProductIndex = 0;
            } else if (inputProduct.equals(nameOfProduct[1])) {
                nameOfProductIndex = 1;
            } else if (inputProduct.equals(nameOfProduct[2])) {
                nameOfProductIndex = 2;
            }

                if (customerAmountOfMoney[customerIdIndex] < price[nameOfProductIndex]) {
                   System.out.println("Sorry , but you don't have enough money for shop . ");
                }
                else {
                    System.out.println("Succesfull shop . Thank you , have a nice day ! ");
                    customerAmountOfMoney[customerIdIndex] -= price[nameOfProductIndex];
                    System.out.println("You have " + customerAmountOfMoney[customerIdIndex] + "UAH in your pocket . ");
                    String[] boughtProduct = new String[3];
                    boughtProduct[0] = inputProduct;
                    int[] customersIdThatBoughtProduct = new int[3];
                    customersIdThatBoughtProduct[0] = firstInputCustomerId;
                }
                inputId.close();
        }
    }



