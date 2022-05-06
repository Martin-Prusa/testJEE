package data;

import java.util.Arrays;
import java.util.List;

public class DomainsLoader {
    public List<Integer> getPrices() {
        return Arrays.stream(("\"1\";\"AltaVista.com\";\"$3,300,000\";\"1998\"\n" +
                "\"2\";\"Asseenontv.com\";\"$5,100,000\";\"2000\"\n" +
                "\"3\";\"Beer.com\";\"$7,000,000\";\"2004\"\n" +
                "\"4\";\"Business.com\";\"$7,500,000\";\"1999\"\n" +
                "\"5\";\"Candy.com\";\"$3,000,000\";\"1009\"\n" +
                "\"6\";\"Casino.com\";\"$5,500,000\";\"2003\"\n" +
                "\"7\";\"Clothes.com\";\"$4,900,000\";\"2008\"\n" +
                "\"8\";\"Diamond.com\";\"$7,500,000\";\"2006\"\n" +
                "\"9\";\"Fb.com\";\"$8,500,000\";\"2010\"\n" +
                "\"10\";\"Fund.com\";\"£9,990,000\";\"2008\"\n" +
                "\"11\";\"GiftCard.com\";\"$4,000,000\";\"2012\"\n" +
                "\"12\";\"Hotels.com \";\"$11,000,000\";\"2001\"\n" +
                "\"13\";\"iCloud.com\";\"$6,000,000\";\"2011\"\n" +
                "\"14\";\"IG.com\";\"$4,600,000\";\"2013\"\n" +
                "\"15\";\"Insurance.com \";\"$35,600,000\";\"2010\"\n" +
                "\"16\";\"Insure.com \";\"$16,000,000\";\"2009\"\n" +
                "\"17\";\"Internet.com \";\"$18,000,000\";\"2009\"\n" +
                "\"18\";\"Loans.com\";\"$3,000,000\";\"2000\"\n" +
                "\"19\";\"Medicare.com\";\"$4,800,000\";\"2014\"\n" +
                "\"20\";\"Mi.com\";\"$3,600,000\";\"2014\"\n" +
                "\"21\";\"Porn.com\";\"$9,500,000\";\"2007\"\n" +
                "\"22\";\"PrivateJet.com \";\"$30,100,000\";\"2012\"\n" +
                "\"23\";\"Sex.com\";\"$14,000,000\";\"2010\"\n" +
                "\"24\";\"Slots.com \";\"$5,500,000\";\"2010\"\n" +
                "\"25\";\"Toys.com\";\"$5,100,000\";\"2009\"\n" +
                "\"26\";\"VacationRentals.com \";\"$35,000,000\";\"2007\"\n" +
                "\"27\";\"Whisky.com\";\"$3,100,000\";\"2013\"\n" +
                "\"28\";\"Yp.com\";\"$3,800,000\";\"2008\"")
                .split("\n"))
                .map(i -> i.split(";"))
                .map(i -> Integer.parseInt(i[2].replaceAll("\\$", "").replaceAll(",", "").replaceAll("\"", "").replaceAll("£", "")))
                .toList();

    }
}
