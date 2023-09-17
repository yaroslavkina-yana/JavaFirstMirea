package com.company.yaroslavkina;

public class Main {
    public static void main(String[] args){
        int[] x = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < 4; i++){
            sum=sum + x[i];
        }
        System.out.println(sum);
        {
            int[] y = {1, 2, 3, 4};
            int u = 0;
            int i = 0;
            while (i < 4){
                u = u + y[i];
                i++;
            }
            System.out.println(u);
            {
                int[] z = {1, 2, 3, 4};
                int sum1 = 0;
                int o = 0;
                do {
                    sum1 = sum1 +z[o];
                    o++;
                }
                while (o < 4);
                System.out.println(sum1);
            }
        }
    }
}
