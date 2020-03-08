package pl.sda.covid_dataset;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    private Path path;

    public void openFile(String filename) {

        path = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(path);
            List<Record> records = new ArrayList<>();
            lines.remove(0);

            for (String line: lines) {
                String[] columns = line.split(",");
                Record record = new Record();
                record.setSno(Integer.parseInt(columns[0]));
                record.setDate(columns[1]);
                record.setProwince(columns[2]);
                record.setCountry(columns[3]);
                record.setLastUpdate(columns[4]);
                record.setConfirmed(Double.parseDouble(columns[5]));
                record.setDeaths(Double.parseDouble(columns[6]));
                record.setRecovered(Double.parseDouble(columns[7]));
                records.add(record);



                // tworze obiekt Record, uzupełniam go danymi
                // dodaje obiekt Record na liste Record
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("covidDataset.json"), records);


        } catch (IOException e) {
            e.printStackTrace();
        }

//        ObjectMapper objectMapper = new ObjectMapper();
//
//        objectMapper.writeValue(new File("covidDataset.json"), columns);

    }
}
