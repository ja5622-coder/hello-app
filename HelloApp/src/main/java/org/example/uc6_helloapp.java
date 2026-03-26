package org.example;

public class uc6_helloapp {

        public static void main(String[] args) {

            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String output = (nameBuilder.length() > 0)
                    ? "Hello, " + nameBuilder.substring(0, nameBuilder.length() - 2) + "!"
                    : "Hello, World!";

            System.out.println(output);
        }
    }