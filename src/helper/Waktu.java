package helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Waktu {

    public Waktu() {
         throw new AssertionError("Utility class cannot be instantiated");
    }
    
    public static String dateParseToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String dateString = sdf.format(date);
        return dateString;
    }
    
    public static Date stringToDate(String dateString){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(dateString);
            return date;
        } catch (ParseException e) {
        }
        return null;
    }
    
     public static java.util.Date sqlDateToDate(java.sql.Date sqlDate){
        java.util.Date date = new java.sql.Date(sqlDate.getTime());
        return date;
    }
    
    public static java.sql.Date dateToSqlDate(Date utilDate){
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        return sqlDate;
    }
    
}
