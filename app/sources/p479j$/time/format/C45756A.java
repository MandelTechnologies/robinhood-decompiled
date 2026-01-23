package p479j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p479j$.time.AbstractC45723c;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.A */
/* loaded from: classes29.dex */
public class C45756A {

    /* renamed from: a */
    public static final ConcurrentMap f6779a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b */
    public static final C45783y f6780b = new C45783y();

    /* renamed from: c */
    public static final C45756A f6781c = new C45756A();

    /* renamed from: d */
    public String mo3530d(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object objM3527a = m3527a(temporalField, locale);
        if (objM3527a instanceof C45784z) {
            return ((C45784z) objM3527a).m3592a(j, textStyle);
        }
        return null;
    }

    /* renamed from: c */
    public String mo3529c(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return mo3530d(temporalField, j, textStyle, locale);
        }
        return null;
    }

    /* renamed from: f */
    public Iterator mo3532f(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objM3527a = m3527a(temporalField, locale);
        if (!(objM3527a instanceof C45784z) || (list = (List) ((HashMap) ((C45784z) objM3527a).f6893b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: e */
    public Iterator mo3531e(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return mo3532f(temporalField, textStyle, locale);
        }
        return null;
    }

    /* renamed from: b */
    public static String m3528b(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* renamed from: a */
    public static Object m3527a(TemporalField temporalField, Locale locale) {
        Object c45784z;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        Object obj = ((ConcurrentHashMap) f6779a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        long j = 1;
        HashMap map = new HashMap();
        int i = 0;
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j2 = i;
                    map2.put(Long.valueOf(j2), eras[i]);
                    map3.put(Long.valueOf(j2), m3528b(eras[i]));
                }
                i++;
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            c45784z = new C45784z(map);
        } else {
            int i2 = 1;
            if (temporalField == ChronoField.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                int length = dateFormatSymbols2.getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                while (i2 <= length) {
                    String strM3470a = AbstractC45723c.m3470a(i2, "LLLL", locale);
                    long j3 = j;
                    long j4 = i2;
                    linkedHashMap.put(Long.valueOf(j4), strM3470a);
                    linkedHashMap2.put(Long.valueOf(j4), strM3470a.substring(0, Character.charCount(strM3470a.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j4), AbstractC45723c.m3470a(i2, "LLL", locale));
                    i2++;
                    j = j3;
                }
                long j5 = j;
                if (length > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                }
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i3 = 0; i3 < months.length; i3++) {
                    if (!months[i3].isEmpty()) {
                        long j6 = i3 + j5;
                        map4.put(Long.valueOf(j6), months[i3]);
                        map5.put(Long.valueOf(j6), m3528b(months[i3]));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(TextStyle.FULL, map4);
                    map.put(TextStyle.NARROW, map5);
                }
                HashMap map6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i < shortMonths.length) {
                    if (!shortMonths[i].isEmpty()) {
                        map6.put(Long.valueOf(i + j5), shortMonths[i]);
                    }
                    i++;
                }
                if (!map6.isEmpty()) {
                    map.put(TextStyle.SHORT, map6);
                }
                c45784z = new C45784z(map);
            } else if (temporalField == ChronoField.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap map7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                map7.put(1L, weekdays[2]);
                map7.put(2L, weekdays[3]);
                map7.put(3L, weekdays[4]);
                map7.put(4L, weekdays[5]);
                map7.put(5L, weekdays[6]);
                map7.put(6L, weekdays[7]);
                map7.put(7L, weekdays[1]);
                map.put(TextStyle.FULL, map7);
                HashMap map8 = new HashMap();
                map8.put(1L, m3528b(weekdays[2]));
                map8.put(2L, m3528b(weekdays[3]));
                map8.put(3L, m3528b(weekdays[4]));
                map8.put(4L, m3528b(weekdays[5]));
                map8.put(5L, m3528b(weekdays[6]));
                map8.put(6L, m3528b(weekdays[7]));
                map8.put(7L, m3528b(weekdays[1]));
                map.put(TextStyle.NARROW, map8);
                HashMap map9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                map9.put(1L, shortWeekdays[2]);
                map9.put(2L, shortWeekdays[3]);
                map9.put(3L, shortWeekdays[4]);
                map9.put(4L, shortWeekdays[5]);
                map9.put(5L, shortWeekdays[6]);
                map9.put(6L, shortWeekdays[7]);
                map9.put(7L, shortWeekdays[1]);
                map.put(TextStyle.SHORT, map9);
                c45784z = new C45784z(map);
            } else if (temporalField == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap map10 = new HashMap();
                HashMap map11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i < amPmStrings.length) {
                    if (!amPmStrings[i].isEmpty()) {
                        long j7 = i;
                        map10.put(Long.valueOf(j7), amPmStrings[i]);
                        map11.put(Long.valueOf(j7), m3528b(amPmStrings[i]));
                    }
                    i++;
                }
                if (!map10.isEmpty()) {
                    map.put(TextStyle.FULL, map10);
                    map.put(TextStyle.SHORT, map10);
                    map.put(TextStyle.NARROW, map11);
                }
                c45784z = new C45784z(map);
            } else {
                c45784z = "";
            }
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f6779a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, c45784z);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
