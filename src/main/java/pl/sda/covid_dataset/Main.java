package pl.sda.covid_dataset;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();
        fileUtils.openFile("2019_nCoV_data.csv");

        String s = "1,01/22/2020 12:00:00,Anhui,China,01/22/2020 12:00:00,1.0,0.0,0.0";
        String[] tab = s.split(",");
        System.out.println(tab[1]);


    }
}
