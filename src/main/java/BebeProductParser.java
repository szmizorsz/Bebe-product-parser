import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by szabolcs on 11/02/16.
 */
public class BebeProductParser {

    private static String FILE_NAME = "/Users/szabolcs/Documents/Personal/Bebe-product-parser/src/main/resources/bebe_historical_products_20160122.txt";

    public static void main(String[] args) throws IOException {

        ProductFieldDictionaries dict = new ProductFieldDictionaries();

        File file = new File(FILE_NAME);
        List<String> lines = Files.readLines(file, Charsets.UTF_8);
        List<String> malFormedLines = new ArrayList<String>();

        for(String line : lines) {
            String[] columns = line.split("\t");

            //skip header
            if(columns[0] == "sku_id") {
                continue;
            }

            if(columns.length != 21) {
                malFormedLines.add(line);
                continue;
            }

            LineProcessor(dict, columns);
        }

        System.out.println("Nr of Lines: " + lines.size());

        dict.DictionaryInformation();

        System.out.println("\nMalformed lines: " + malFormedLines.size());
        for(String line : malFormedLines) {
            System.out.println(line);
            String[] columns = line.split("\t");
            System.out.println("Nr of columns: " + columns.length);
        }
    }

    private static void LineProcessor(ProductFieldDictionaries dict, String[] columns) {

        dict.getSku_id_dictionary().add(columns[0]);
        dict.getClass_dictionary().add(columns[1]);
        dict.getClassname_dictionary().add(columns[2]);
        dict.getDept_dictionary().add(columns[3]);
        dict.getDeptname_dictionary().add(columns[4]);
        dict.getColor_dictionary().add(columns[5]);
        dict.getMaterial_dictionary().add(columns[6]);
        dict.getColor_name_dictionary().add(columns[7]);
        dict.getPattern_dictionary().add(columns[8]);
        dict.getSize_dictionary().add(columns[9]);
        dict.getSize_system_dictionary().add(columns[10]);
        dict.getSize_type_dictionary().add(columns[11]);
        dict.getProduct_id_dictionary().add(columns[12]);
        dict.getName_dictionary().add(columns[13]);
        dict.getDescription_dictionary().add(columns[14]);
        dict.getGender_dictionary().add(columns[15]);
        dict.getBrand_dictionary().add(columns[16]);
        dict.getProduct_category_dictionary().add(columns[17]);
        dict.getCondition_dictionary().add(columns[18]);
        dict.getTicket_price_dictionary().add(columns[19]);
        dict.getCurrent_pric_dictionary().add(columns[20]);

    }
}
