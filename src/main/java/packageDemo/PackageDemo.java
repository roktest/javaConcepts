package packageDemo;

import java.util.Random;

public class PackageDemo {

    /**
     * packages are simple container that groups
     * related java elements
     *
     * two tipes
     * -built in: starts with java, can be used but can't be modified, pre-written included in java
     * -created by developers: starts with custom words, can be used and modified
     *
     * names should be unique and lower case
     *
     * they can be used by importing those
     * import  the.package.name.*; // it is not a good practice to use *
     *
     * if the classes has the same name but on different packages
     * import java.util.Date; // simple date formats
     * import java.sql.Date; // this is specific for sql
     *
     */

    public static void main(String[] args) {

        Random random = new Random();

        //this will print int numbers from 0 to 89. and if i add one it will print 0-90 int
        System.out.println(random.nextInt(90)+1);

    }




}
