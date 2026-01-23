package com.nimbusds.jose.shaded.asm;

import com.singular.sdk.internal.Constants;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;
import p479j$.util.DesugarTimeZone;

/* loaded from: classes27.dex */
public class ConvertDate {
    public static TimeZone defaultTimeZone;
    static TreeMap<String, Integer> monthsTable = new TreeMap<>(new StringCmpNS());
    static TreeMap<String, Integer> daysTable = new TreeMap<>(new StringCmpNS());
    private static HashSet<String> voidData = new HashSet<>();
    static TreeMap<String, TimeZone> timeZoneMapping = new TreeMap<>();

    static {
        voidData.add("à");
        voidData.add("at");
        voidData.add("MEZ");
        voidData.add("Uhr");
        voidData.add("h");
        voidData.add("pm");
        voidData.add("PM");
        voidData.add("am");
        voidData.add("AM");
        voidData.add("min");
        voidData.add("um");
        voidData.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            timeZoneMapping.put(str, DesugarTimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        fillMap(monthsTable, months[i], Integer.valueOf(i));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        fillMap(monthsTable, shortMonths[i2], Integer.valueOf(i2));
                        fillMap(monthsTable, shortMonths[i2].replace(".", ""), Integer.valueOf(i2));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str3 = weekdays[i3];
                    if (str3.length() != 0) {
                        fillMap(daysTable, str3, Integer.valueOf(i3));
                        fillMap(daysTable, str3.replace(".", ""), Integer.valueOf(i3));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str4 = shortWeekdays[i4];
                    if (str4.length() != 0) {
                        fillMap(daysTable, str4, Integer.valueOf(i4));
                        fillMap(daysTable, str4.replace(".", ""), Integer.valueOf(i4));
                    }
                }
            }
        }
    }

    public static class StringCmpNS implements Comparator<String> {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    private static Integer parseMonth(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = monthsTable.get(str);
        if (num != null) {
            return num;
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    private static GregorianCalendar newCalandar() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = defaultTimeZone;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    private static void fillMap(TreeMap<String, Integer> treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY).replace("û", Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY), num);
    }

    public static Date convertToDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.length() == 4 && Character.isDigit(strNextToken.charAt(0))) {
                return getYYYYMMDD(stringTokenizer, strNextToken);
            }
            if (daysTable.containsKey(strNextToken)) {
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                strNextToken = stringTokenizer.nextToken();
            }
            if (monthsTable.containsKey(strNextToken)) {
                return getMMDDYYYY(stringTokenizer, strNextToken);
            }
            if (Character.isDigit(strNextToken.charAt(0))) {
                return getDDMMYYYY(stringTokenizer, strNextToken);
            }
            return null;
        }
        throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
    }

    private static Date getYYYYMMDD(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarNewCalandar = newCalandar();
        gregorianCalendarNewCalandar.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendarNewCalandar.getTime();
        }
        gregorianCalendarNewCalandar.set(2, parseMonth(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendarNewCalandar.getTime();
        }
        String strNextToken = stringTokenizer.nextToken();
        if (Character.isDigit(strNextToken.charAt(0))) {
            if (strNextToken.length() == 5 && strNextToken.charAt(2) == 'T') {
                gregorianCalendarNewCalandar.set(5, Integer.parseInt(strNextToken.substring(0, 2)));
                return addHour(stringTokenizer, gregorianCalendarNewCalandar, strNextToken.substring(3));
            }
            gregorianCalendarNewCalandar.set(5, Integer.parseInt(strNextToken));
            return addHour(stringTokenizer, gregorianCalendarNewCalandar, null);
        }
        return gregorianCalendarNewCalandar.getTime();
    }

    private static int getYear(String str) throws NumberFormatException {
        int i = Integer.parseInt(str);
        return i < 100 ? i > 30 ? i + 2000 : i + 1900 : i;
    }

    private static Date getMMDDYYYY(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarNewCalandar = newCalandar();
        Integer num = monthsTable.get(str);
        if (num == null) {
            throw new NullPointerException("can not parse " + str + " as month");
        }
        gregorianCalendarNewCalandar.set(2, num.intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarNewCalandar.set(5, Integer.parseInt(stringTokenizer.nextToken()));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken = stringTokenizer.nextToken();
        if (Character.isLetter(strNextToken.charAt(0))) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken = stringTokenizer.nextToken();
        }
        if (strNextToken.length() == 4) {
            gregorianCalendarNewCalandar.set(1, getYear(strNextToken));
        } else if (strNextToken.length() == 2) {
            return addHour2(stringTokenizer, gregorianCalendarNewCalandar, strNextToken);
        }
        return addHour(stringTokenizer, gregorianCalendarNewCalandar, null);
    }

    private static Date getDDMMYYYY(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarNewCalandar = newCalandar();
        gregorianCalendarNewCalandar.set(5, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarNewCalandar.set(2, parseMonth(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarNewCalandar.set(1, getYear(stringTokenizer.nextToken()));
        return addHour(stringTokenizer, gregorianCalendarNewCalandar, null);
    }

    private static Date addHour(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return addHour2(stringTokenizer, calendar, str);
    }

    private static Date addHour2(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        calendar.set(11, Integer.parseInt(trySkip(stringTokenizer, str, calendar)));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String strTrySkip = trySkip(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (strTrySkip == null) {
            return calendar.getTime();
        }
        calendar.set(12, Integer.parseInt(strTrySkip));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String strTrySkip2 = trySkip(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (strTrySkip2 == null) {
            return calendar.getTime();
        }
        calendar.set(13, Integer.parseInt(strTrySkip2));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String strTrySkip3 = trySkip(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (strTrySkip3 == null) {
            return calendar.getTime();
        }
        String strTrySkip4 = trySkip(stringTokenizer, strTrySkip3, calendar);
        if (strTrySkip4.length() == 4 && Character.isDigit(strTrySkip4.charAt(0))) {
            calendar.set(1, getYear(strTrySkip4));
        }
        return calendar.getTime();
    }

    private static String trySkip(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = timeZoneMapping.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                if (!voidData.contains(str)) {
                    return str;
                }
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            }
        }
    }
}
