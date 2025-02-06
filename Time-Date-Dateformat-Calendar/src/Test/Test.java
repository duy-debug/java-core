package Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
  public static void main(String[] args) {
    // Hàm lấy thời gian hiện tại
    long t1 = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      System.out.println("Test");
    }
    long t2 = System.currentTimeMillis();
    System.out.println("Trước khi chạy for: " +t1);
    System.out.println("Sau khi chạy for: " +t2);
    System.out.println("Thời gian: " +(t2-t1)/1000+"s");
    System.out.println("Thời gian: " +(t2-t1)+"mls");
    //TimeUnit đổi sang giây
    System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000*365)+ "s");
    System.out.println("13h = " +TimeUnit.HOURS.toSeconds(13) + "s");
    //Date
    Date d = new Date(System.currentTimeMillis());
    System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
    // Calendar
    Calendar c = Calendar.getInstance();
    System.out.println(c.get(Calendar.DATE) + "-" +(c.get(Calendar.MONTH)+1) + "-" +c.get(Calendar.YEAR));
    c.add(Calendar.HOUR, -30);
    System.out.println(c.get(Calendar.DATE) + "-" +(c.get(Calendar.MONTH)+1) + "-" +c.get(Calendar.YEAR));
    // DateFormat
    DateFormat df = new SimpleDateFormat();
    System.out.println(df.format(d));

    df = new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");
    System.out.println(df.format(d));
  }
}
