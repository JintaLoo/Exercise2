import  java.io.*;
import java.lang.Math;
import java.math.BigDecimal;


public class Task5
{
    public static void main(String[] args)
    {
        double product=9.99;
        System.out.println("Product = "+product);
        //VAT of 23%
        double vat=((double) 23/100)+1;
        System.out.println("VAT = "+vat);
        //calculate original price
        double originalPrice=(product/vat);
        System.out.println("Original Price = "+originalPrice);
        //calculate 10,000 pcs of this product
        double sold=product*10000;
        System.out.println("Product sold 10,000 pcs = "+sold);
        //calculate Product sold 10,000 pcs exclude VAT
        double soldExcludeVat=originalPrice*10000;
        System.out.println("Product sold 10,000 pcs exclude VAT = "+soldExcludeVat);
        double Difference=sold-soldExcludeVat;
        System.out.println("Difference between price with VAT and without VAT = "+Difference);

        System.out.println("");
        //Using Big Decimal class
        BigDecimal bdproduct = new BigDecimal("9.99");
        System.out.println("(BigDecimal)Product = "+product);

        BigDecimal bdvat = new BigDecimal("1.23");
        System.out.println("(BigDecimal)VAT = "+bdvat);

        BigDecimal bdoriginalPrice = bdproduct.divideToIntegralValue(bdvat);
        System.out.println("(BigDecimal)Original Price = "+bdoriginalPrice);

        BigDecimal bdNumberSoldProduct = new BigDecimal("10000");

        BigDecimal bdsold = bdproduct.multiply(bdNumberSoldProduct);
        System.out.println("(BigDecimal)Product sold 10,000 pcs = "+bdsold);

        BigDecimal bdsoldExcludeVat = bdoriginalPrice.multiply(bdNumberSoldProduct);
        System.out.println("(BigDecimal)Product with out VAT sold 10,000 pcs = "+bdsoldExcludeVat);

        BigDecimal bdDifference = bdsold.subtract(bdsoldExcludeVat);
        System.out.println("(BigDecimal)Difference between price with VAT and without VAT = "+bdDifference);




    }
}
