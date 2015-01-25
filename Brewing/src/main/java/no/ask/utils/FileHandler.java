package no.ask.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.Instant;

import no.ask.BrewType;
import no.ask.repository.enteties.BeerSmith;
import no.ask.repository.enteties.vo.BeerSmithVO;

public class FileHandler {

    public static List<BeerSmithVO> getBrewsFromFile() throws IOException, ParseException {
        List<BeerSmithVO> smith = new ArrayList<>();

        URL url = new URL("https://dl.dropboxusercontent.com/u/12952773/report.csv");
        InputStream in = url.openStream();
        InputStreamReader is = new InputStreamReader(in,"UTF-8");
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(is);
        String read = br.readLine();

        while (read != null) {
            sb.append(read);
            read = br.readLine();

        }

        BrewType bType = null;

        String replace = sb.toString().replace("\"", "");

        String[] split = replace.split("#");
        SimpleDateFormat parse = new SimpleDateFormat("dd/MM/yy");
        
        for (int i = 1; i < split.length; i++) {

            String[] brew = split[i].split(",");

//            System.out.println(brew[0]);

            String trim = brew[0].substring(0, 3).trim();
            int batchNumber = Integer.parseInt(trim + "");
            
            String name = brew[0].substring(trim.length()+1);

            String brewer = brew[1];
            String style = brew[2];
            String type = brew[3];

            if (BrewType.AllGrain.toString().equals(type)) {
                bType = BrewType.AllGrain;
            } else {
                bType = BrewType.Extract;
            }

            Date brewDateString = parse.parse(brew[4]);
            Instant brewDate = new Instant(brewDateString);
            
            Date bottleDateString = parse.parse(brew[5]);
            Instant bottleDate = new Instant(bottleDateString);
            
            Date endDateString = parse.parse(brew[6]);
            
            Instant endDate = new Instant(endDateString);

            double hops = Double.parseDouble(brew[7]);
            double grains = Double.parseDouble(brew[8]);
            double mBottlingVolume = Double.parseDouble(brew[9]);
            double mMashEff = Double.parseDouble(brew[10]);
            double mABV = Double.parseDouble(brew[11]);
            double version = Double.parseDouble(brew[12]);
            
            
            smith.add( new BeerSmithVO(1, batchNumber, name, brewer, style, bType, brewDate, bottleDate, endDate, hops, grains, mBottlingVolume, mMashEff, mABV, version) );
           
//            smith.add(new BeerSmith(batchNumber, name, brewer, style, bType, brewDate.getMillis(), bottleDate.getMillis(), endDate.getMillis(), 
//                    hops, grains, mBottlingVolume, mMashEff, mABV, version));
        }

        return smith;
    }

    public static void main(String[] args) {
        try {
            List<BeerSmithVO> brewsFromFile = FileHandler.getBrewsFromFile();
            for (BeerSmithVO beerSmithVO : brewsFromFile) {
                System.out.println(beerSmithVO.getName());
            }
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
