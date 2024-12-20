package Q2.LP39;

public class CLLP39 {
    private int yearBirth, monthBirth, dayBirth,
            yearNow, monthNow, dayNow, timeMonths, timeDays;
    private double timeSleep;
    public CLLP39()
    {
    yearBirth = 0;
    monthBirth = 0;
    dayBirth = 0;
    yearNow = 0;
    monthNow = 0;
    dayNow = 0;
    timeSleep = 0;
    }
    public CLLP39(int birthYear, int birthMonth, int birthDay, int nowYear, int nowMonth, int nowDay, double hoursSleep)
    {
        yearBirth = birthYear;
        monthBirth = birthMonth;
        dayBirth = birthDay;
        yearNow = nowYear;
        monthNow = nowMonth;
        dayNow = nowDay;
        timeSleep = hoursSleep;
    }

    public void setLengthsSleep(){
        timeMonths = ((yearNow - yearBirth) * 12) + (monthNow - monthBirth);
        timeDays = (timeMonths * 30) + (dayNow - dayBirth);
    }
}
