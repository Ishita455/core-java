package com.company.assignmentday19productproject;

import com.company.assignment17.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) throws IOException
    {
        Integer productId;
        String productName;
        String productDescription;
        Double productPrice;
        Scanner scanner = new Scanner(System.in);
        int choice;
        Integer noOfProduct = 0;
        ArrayList<Product> p = new ArrayList<>();

        System.out.println("______________Product Details____________");
        System.out.println("0: Add no of Product");
        System.out.println("1: Add Product");
        System.out.println("2: Search Product");
        System.out.println("3: Update Product");
        System.out.println("4: Delete Product");
        System.out.println("5: Display Product");
        System.out.println("99: Exit");

        System.out.println("Enter the Choice");
        choice = scanner.nextInt();

        while (true){

            switch (choice){

                case 0:
                    System.out.println("Enter the no of Products");
                    noOfProduct = scanner.nextInt();
                    scanner.nextLine();
                    break;

                case 1:
                    System.out.println("Enter the Product Details");

                    for (int i =0; i<noOfProduct; i++){

                        System.out.println("Enter the product ID");
                        productId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the Product Name");
                        productName = scanner.nextLine();
                        System.out.println("Enter the Product description");
                        productDescription = scanner.nextLine();
                        System.out.println("Enter the Product Price");
                        productPrice = scanner.nextDouble();
                        scanner.nextLine();

                        Product tempPro = new Product(productId,productName,productDescription,productPrice);
                        p.add(tempPro);
                        boolean result = addProduct(p.get(i));
                        if(result) {
                            System.out.println("Product Added Successfully");
                        }
                        else{
                            System.out.println("Product not added! Try Again");
                        }

                    }
                    break;

                case 2:
                    System.out.println("Search the Product with ID");
                    productId = scanner.nextInt();
                    Product proResult = readProduct(productId);
                    if(proResult == null){
                        System.out.println("Product not found "+productId);
                    }
                    else {
                        System.out.println("Product Id:"+proResult.productId+" product Name: "+proResult.productName+" Product Description: "+proResult.productDescription+" Product Price: "+proResult.productPrice);
                    }
                    break;

                case 3:
                    System.out.println("Search the Product with ID");
                    productId = scanner.nextInt();
                    scanner.nextLine();
                    Product proResult1 = readProduct(productId);
                    if(proResult1 == null){
                        System.out.println("Product not found "+productId);
                    }else {
                        System.out.println("Enter your new Product name");
                        proResult1.productName = scanner.nextLine();
                        System.out.println("Enter the new Product Description");
                        proResult1.productDescription = scanner.nextLine();
                        System.out.println("Enter the Product Price");
                        proResult1.productPrice = scanner.nextDouble();
                        scanner.nextLine();
                        addProduct(proResult1);
                        System.out.println("Successfully updated");

                    }
                    break;
                case 4:
                    System.out.println("Delete Product Details");
                    System.out.println("Enter the Product Id to be Deleted");
                    productId = scanner.nextInt();
                    scanner.nextLine();
                    boolean s=false;

                    Product proResult2 = readProduct(productId);
                    if (proResult2 == null){
                        System.out.println("Product not found"+productId);
                    }
                    else {
                        File file = new File(productId+".ser");
                        s = file.delete();
                    }
                    if(s){
                        System.out.println(proResult2.productId+"Successfully deleted");
                    }
                    break;

                case 5:
                    System.out.println("Product Display");

                    break;

                case 99:
                    System.out.println("Existing the Application");
                    System.exit(0);
                    break;

                default:   System.out.println("Try Again!");
                break;
            }
        }
    }
    public static boolean addProduct(Product product){

        try {
            FileOutputStream file = new FileOutputStream(product.productId+".ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(product);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
            return true;

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static Product readProduct(Integer productId) throws IOException {
        Product pro = null;
        FileInputStream file = null;
        ObjectInputStream in = null;
        try {
            file = new FileInputStream(productId+".ser");
            in = new ObjectInputStream(file);
            pro = (Product) in.readObject();
            System.out.println("Object has been deserialized");


        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            in.close();
            file.close();
        }
        return pro;
    }
}
