package Java_Base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = timeFormat.format(date);
        System.out.println("当前时间为： "+time);

        //Calendar类获取当前时间
        Calendar calendar = Calendar.getInstance();
        System.out.println("当前时间为： "+calendar.getTime());
        System.out.println("今年为： "+calendar.get(Calendar.YEAR));

        //打印8月日历（应用（忽略））
        int year,month;
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        if(args.length>=1) {
            try {
                year = Integer.parseInt(args[0]);
                if(year<0||year>5000) {
                    System.out.println("第一个参数是0-5000的数值");
                    System.exit(0);}
            }catch(NumberFormatException e){
                System.out.println("参数代表年份和月份，必须是数字!");

            }
        }
        if(args.length>=2) {
            try {
                month = Integer.parseInt(args[1]);
                if(month<=0||month>12) {
                    System.out.println("第二个参数是1-12内的数值");
                    System.exit(0);}
            }catch(NumberFormatException e){
                System.out.println("参数代表的是年份和月份，必须是数字！");
                System.exit(0);
            }
        }
        String b[] = new String[42];
        calendar.set(year,month-1,1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;//1号是星期几
        int days = 0;
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            days = 31;
        }
        if(month==4||month==6||month==9||month==11) {
            days = 30;
        }
        if(month==2) {
            if(year%4==0&&year%100!=0||year%400==0) {
                days = 29;
            }else {
                days = 28;
            }
        }
        int j;
        for(j=0;j<42;j++)
            b[j]=" ";
        for(j=0;j<days;j++) {
            b[j+dayOfWeek] = String.valueOf(j+1);
        }
        System.out.println("\t\t"+year+"年"+month+"月");
        System.out.println("\t日\t一\t二\t三\t四\t五\t六");
        for(j=0;j<42;j++) {
            if(j!=0&&j%7==0)
                System.out.println();
            if(b[j].length()==1)
                System.out.print("");
            System.out.print("\t"+b[j]);
        }
    }

}

