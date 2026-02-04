public class task3{
    public static void main(String[] args){
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());     
        System.out.println(t.toStandard());      

        Time t2 = new Time(5, 24, 33);
        t.add(t2);
        System.out.println("after changes: ");
        System.out.println(t.toUniversal());     
        System.out.println(t.toStandard());      
    }
}

class Time{
    int hour;
    int minute;
    int second;

    Time(int h, int m, int s){
        second = s % 60;
        if (second < 0) second += 60;

        int extra_min = s / 60;
        if (s < 0) extra_min--;

        minute = (m + extra_min) % 60;
        if (minute < 0) minute += 60;

        int extra_hour = (m + extra_min) / 60;
        if ((m + extra_min) < 0) extra_hour--;

        hour = (h + extra_hour) % 24;
        if (hour < 0) hour += 24;
    }

    String toUniversal(){
        String result = "";

        if (hour < 10) result += "0";
        result += hour + ":";

        if (minute < 10) result += "0";
        result += minute + ":";

        if (second < 10) result += "0";
        result += second;

        return result;
    }

    String toStandard(){
        String result = "";
        String period = "AM";

        int display_hour = hour;

        if (hour == 0) {
            display_hour = 12;
            period = "AM";
        }
        else if (hour == 12) {
            display_hour = 12;
            period = "PM";
        }
        else if (hour > 12) {
            display_hour = hour - 12;
            period = "PM";
        }

        if (display_hour < 10) result += "0";
        result += display_hour + ":";

        if (minute < 10) result += "0";
        result += minute + ":";

        if (second < 10) result += "0";
        result += second + " " + period;

        return result;
    }

    void add(Time other){
        int total_seconds = second + other.second;
        second = total_seconds % 60;
        int carry_min = total_seconds / 60;

        int total_minutes = minute + other.minute + carry_min;
        minute = total_minutes % 60;
        int carry_hour = total_minutes / 60;

        int total_hours = hour + other.hour + carry_hour;
        hour = total_hours % 24;
    }
}