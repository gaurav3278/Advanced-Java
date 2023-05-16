import java.sql.*;
import java.util.*;
import java.util.Date;

public class DateTimeSql {
    public static void main(String[] args) {
        Date javaDate = new Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        System.out.println("The SQL Date is: " + sqlDate.toString());
        Time sqlTime =  new Time(javaTime); 
        System.out.println("The SQL Time is: " + sqlTime.toString());
    }
}
