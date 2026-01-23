package p479j$.time.zone;

import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p479j$.time.AbstractC45723c;
import p479j$.time.Clock;
import p479j$.time.DayOfWeek;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.Month;
import p479j$.time.ZoneOffset;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.TemporalAdjusters;

/* loaded from: classes29.dex */
public final class ZoneRules implements Serializable {

    /* renamed from: i */
    public static final long[] f6967i = new long[0];

    /* renamed from: j */
    public static final C45812e[] f6968j = new C45812e[0];

    /* renamed from: k */
    public static final LocalDateTime[] f6969k = new LocalDateTime[0];

    /* renamed from: l */
    public static final C45809b[] f6970l = new C45809b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a */
    public final long[] f6971a;

    /* renamed from: b */
    public final ZoneOffset[] f6972b;

    /* renamed from: c */
    public final long[] f6973c;

    /* renamed from: d */
    public final LocalDateTime[] f6974d;

    /* renamed from: e */
    public final ZoneOffset[] f6975e;

    /* renamed from: f */
    public final C45812e[] f6976f;

    /* renamed from: g */
    public final TimeZone f6977g;

    /* renamed from: h */
    public final transient ConcurrentMap f6978h = new ConcurrentHashMap();

    /* renamed from: a */
    public static Object m3618a(LocalDateTime localDateTime, C45809b c45809b) {
        LocalDateTime localDateTime2 = c45809b.f6983b;
        if (c45809b.m3629c()) {
            if (localDateTime.isBefore(localDateTime2)) {
                return c45809b.f6984c;
            }
            if (!localDateTime.isBefore(c45809b.f6983b.m3400m(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds()))) {
                return c45809b.f6985d;
            }
        } else {
            if (!localDateTime.isBefore(localDateTime2)) {
                return c45809b.f6985d;
            }
            if (localDateTime.isBefore(c45809b.f6983b.m3400m(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds()))) {
                return c45809b.f6984c;
            }
        }
        return c45809b;
    }

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, C45812e[] c45812eArr) {
        this.f6971a = jArr;
        this.f6972b = zoneOffsetArr;
        this.f6973c = jArr2;
        this.f6975e = zoneOffsetArr2;
        this.f6976f = c45812eArr;
        if (jArr2.length == 0) {
            this.f6974d = f6969k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jArr2.length) {
                int i2 = i + 1;
                C45809b c45809b = new C45809b(jArr2[i], zoneOffsetArr2[i], zoneOffsetArr2[i2]);
                if (c45809b.m3629c()) {
                    arrayList.add(c45809b.f6983b);
                    arrayList.add(c45809b.f6983b.m3400m(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds()));
                } else {
                    arrayList.add(c45809b.f6983b.m3400m(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds()));
                    arrayList.add(c45809b.f6983b);
                }
                i = i2;
            }
            this.f6974d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f6977g = null;
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f6972b = zoneOffsetArr;
        long[] jArr = f6967i;
        this.f6971a = jArr;
        this.f6973c = jArr;
        this.f6974d = f6969k;
        this.f6975e = zoneOffsetArr;
        this.f6976f = f6968j;
        this.f6977g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {m3620g(timeZone.getRawOffset())};
        this.f6972b = zoneOffsetArr;
        long[] jArr = f6967i;
        this.f6971a = jArr;
        this.f6973c = jArr;
        this.f6974d = f6969k;
        this.f6975e = zoneOffsetArr;
        this.f6976f = f6968j;
        this.f6977g = timeZone;
    }

    /* renamed from: g */
    public static ZoneOffset m3620g(int i) {
        return ZoneOffset.ofTotalSeconds(i / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45808a(this.f6977g != null ? (byte) 100 : (byte) 1, this);
    }

    public boolean isFixedOffset() {
        C45809b c45809b;
        TimeZone timeZone = this.f6977g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.f6977g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            C45809b c45809b2 = null;
            if (this.f6977g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int iM3619c = m3619c(epochSecond, getOffset(instantNow));
                C45809b[] c45809bArrM3621b = m3621b(iM3619c);
                int length = c45809bArrM3621b.length - 1;
                while (true) {
                    if (length >= 0) {
                        c45809b = c45809bArrM3621b[length];
                        if (epochSecond > c45809b.f6982a) {
                            break;
                        }
                        length--;
                    } else if (iM3619c > 1800) {
                        C45809b[] c45809bArrM3621b2 = m3621b(iM3619c - 1);
                        for (int length2 = c45809bArrM3621b2.length - 1; length2 >= 0; length2--) {
                            c45809b = c45809bArrM3621b2[length2];
                            if (epochSecond <= c45809b.f6982a) {
                            }
                        }
                        long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().millis() / 1000) + 31968000);
                        int offset = this.f6977g.getOffset((epochSecond - 1) * 1000);
                        long epochDay = LocalDate.m3377of(1800, 1, 1).toEpochDay() * 86400;
                        while (true) {
                            if (epochDay > jMin) {
                                break;
                            }
                            int offset2 = this.f6977g.getOffset(jMin * 1000);
                            if (offset != offset2) {
                                int iM3619c2 = m3619c(jMin, m3620g(offset2));
                                C45809b[] c45809bArrM3621b3 = m3621b(iM3619c2 + 1);
                                int length3 = c45809bArrM3621b3.length - 1;
                                while (true) {
                                    if (length3 < 0) {
                                        C45809b[] c45809bArrM3621b4 = m3621b(iM3619c2);
                                        c45809b2 = c45809bArrM3621b4[c45809bArrM3621b4.length - 1];
                                        break;
                                    }
                                    c45809b2 = c45809bArrM3621b3[length3];
                                    if (epochSecond > c45809b2.f6982a) {
                                        break;
                                    }
                                    length3--;
                                }
                            } else {
                                jMin -= 7776000;
                            }
                        }
                    }
                }
                c45809b2 = c45809b;
            } else if (this.f6973c.length != 0) {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.f6973c;
                long j = jArr[jArr.length - 1];
                if (this.f6976f.length <= 0 || epochSecond2 <= j) {
                    int iBinarySearch = Arrays.binarySearch(this.f6973c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i = iBinarySearch - 1;
                        long j2 = this.f6973c[i];
                        ZoneOffset[] zoneOffsetArr = this.f6975e;
                        c45809b2 = new C45809b(j2, zoneOffsetArr[i], zoneOffsetArr[iBinarySearch]);
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.f6975e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iM3619c3 = m3619c(epochSecond2, zoneOffset);
                    C45809b[] c45809bArrM3621b5 = m3621b(iM3619c3);
                    int length4 = c45809bArrM3621b5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i2 = iM3619c3 - 1;
                            if (i2 > m3619c(j, zoneOffset)) {
                                C45809b[] c45809bArrM3621b6 = m3621b(i2);
                                c45809b2 = c45809bArrM3621b6[c45809bArrM3621b6.length - 1];
                            }
                        } else {
                            C45809b c45809b3 = c45809bArrM3621b5[length4];
                            if (epochSecond2 > c45809b3.f6982a) {
                                c45809b2 = c45809b3;
                                break;
                            }
                            length4--;
                        }
                    }
                }
            }
            if (c45809b2 != null) {
                return false;
            }
        } else if (this.f6973c.length != 0) {
            return false;
        }
        return true;
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.f6977g;
        if (timeZone != null) {
            return m3620g(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f6973c.length == 0) {
            return this.f6972b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f6976f.length > 0) {
            if (epochSecond > this.f6973c[r7.length - 1]) {
                C45809b[] c45809bArrM3621b = m3621b(m3619c(epochSecond, this.f6975e[r7.length - 1]));
                C45809b c45809b = null;
                for (int i = 0; i < c45809bArrM3621b.length; i++) {
                    c45809b = c45809bArrM3621b[i];
                    if (epochSecond < c45809b.f6982a) {
                        return c45809b.f6984c;
                    }
                }
                return c45809b.f6985d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f6973c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f6975e[iBinarySearch + 1];
    }

    /* renamed from: e */
    public final List m3623e(LocalDateTime localDateTime) {
        Object objM3622d = m3622d(localDateTime);
        if (!(objM3622d instanceof C45809b)) {
            return Collections.singletonList((ZoneOffset) objM3622d);
        }
        C45809b c45809b = (C45809b) objM3622d;
        return c45809b.m3629c() ? Collections.EMPTY_LIST : AbstractC45723c.m3471b(new Object[]{c45809b.f6984c, c45809b.f6985d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.m3395c(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r8.toLocalTime().m3417r() <= r0.toLocalTime().m3417r()) goto L44;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3622d(LocalDateTime localDateTime) {
        Object obj = null;
        int i = 0;
        if (this.f6977g != null) {
            C45809b[] c45809bArrM3621b = m3621b(localDateTime.getYear());
            if (c45809bArrM3621b.length == 0) {
                return m3620g(this.f6977g.getOffset(localDateTime.toEpochSecond(this.f6972b[0]) * 1000));
            }
            int length = c45809bArrM3621b.length;
            while (i < length) {
                C45809b c45809b = c45809bArrM3621b[i];
                Object objM3618a = m3618a(localDateTime, c45809b);
                if ((objM3618a instanceof C45809b) || objM3618a.equals(c45809b.f6984c)) {
                    return objM3618a;
                }
                i++;
                obj = objM3618a;
            }
            return obj;
        }
        if (this.f6973c.length == 0) {
            return this.f6972b[0];
        }
        if (this.f6976f.length > 0) {
            LocalDateTime localDateTime2 = this.f6974d[r0.length - 1];
            if (localDateTime2 == null) {
                long epochDay = localDateTime.mo3394a().toEpochDay();
                long epochDay2 = localDateTime2.mo3394a().toEpochDay();
                if (epochDay <= epochDay2) {
                    if (epochDay == epochDay2) {
                    }
                }
                C45809b[] c45809bArrM3621b2 = m3621b(localDateTime.getYear());
                int length2 = c45809bArrM3621b2.length;
                while (i < length2) {
                    C45809b c45809b2 = c45809bArrM3621b2[i];
                    Object objM3618a2 = m3618a(localDateTime, c45809b2);
                    if ((objM3618a2 instanceof C45809b) || objM3618a2.equals(c45809b2.f6984c)) {
                        return objM3618a2;
                    }
                    i++;
                    obj = objM3618a2;
                }
                return obj;
            }
            localDateTime.getClass();
        }
        int iBinarySearch = Arrays.binarySearch(this.f6974d, localDateTime);
        if (iBinarySearch == -1) {
            return this.f6975e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f6974d;
            if (iBinarySearch < objArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i2])) {
                    iBinarySearch = i2;
                }
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime[] localDateTimeArr = this.f6974d;
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime4 = localDateTimeArr[iBinarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f6975e;
            int i3 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i3];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new C45809b(localDateTime3, zoneOffset, zoneOffset2);
            }
            return new C45809b(localDateTime4, zoneOffset, zoneOffset2);
        }
        return this.f6975e[(iBinarySearch / 2) + 1];
    }

    /* renamed from: b */
    public final C45809b[] m3621b(int i) {
        LocalDate localDateM3378of;
        C45809b[] c45809bArr = f6970l;
        Integer numValueOf = Integer.valueOf(i);
        C45809b[] c45809bArr2 = (C45809b[]) ((ConcurrentHashMap) this.f6978h).get(numValueOf);
        if (c45809bArr2 != null) {
            return c45809bArr2;
        }
        int i2 = 0;
        if (this.f6977g != null) {
            if (i < 1800) {
                return c45809bArr;
            }
            long epochSecond = LocalDateTime.m3391of(i - 1, 12, 31, 0, 0).toEpochSecond(this.f6972b[0]);
            long j = 1000;
            int offset = this.f6977g.getOffset(epochSecond * 1000);
            long j2 = 31968000 + epochSecond;
            while (epochSecond < j2) {
                long j3 = epochSecond + 7776000;
                long j4 = j;
                if (offset != this.f6977g.getOffset(j3 * j4)) {
                    while (j3 - epochSecond > 1) {
                        long j5 = epochSecond;
                        long jFloorDiv = Math.floorDiv(j3 + epochSecond, 2L);
                        if (this.f6977g.getOffset(jFloorDiv * j4) == offset) {
                            epochSecond = jFloorDiv;
                        } else {
                            j3 = jFloorDiv;
                            epochSecond = j5;
                        }
                    }
                    long j6 = epochSecond;
                    epochSecond = this.f6977g.getOffset(j6 * j4) != offset ? j6 : j3;
                    ZoneOffset zoneOffsetM3620g = m3620g(offset);
                    int offset2 = this.f6977g.getOffset(epochSecond * j4);
                    ZoneOffset zoneOffsetM3620g2 = m3620g(offset2);
                    if (m3619c(epochSecond, zoneOffsetM3620g2) == i) {
                        c45809bArr = (C45809b[]) Arrays.copyOf(c45809bArr, c45809bArr.length + 1);
                        c45809bArr[c45809bArr.length - 1] = new C45809b(epochSecond, zoneOffsetM3620g, zoneOffsetM3620g2);
                    }
                    offset = offset2;
                } else {
                    epochSecond = j3;
                }
                j = j4;
            }
            if (1916 <= i && i < 2100) {
                ((ConcurrentHashMap) this.f6978h).putIfAbsent(numValueOf, c45809bArr);
            }
            return c45809bArr;
        }
        int i3 = 1;
        C45812e[] c45812eArr = this.f6976f;
        C45809b[] c45809bArr3 = new C45809b[c45812eArr.length];
        while (i2 < c45812eArr.length) {
            C45812e c45812e = c45812eArr[i2];
            byte b = c45812e.f6989b;
            if (b < 0) {
                Month month = c45812e.f6988a;
                localDateM3378of = LocalDate.m3378of(i, month, month.length(IsoChronology.INSTANCE.isLeapYear(i)) + 1 + c45812e.f6989b);
                DayOfWeek dayOfWeek = c45812e.f6990c;
                if (dayOfWeek != null) {
                    localDateM3378of = localDateM3378of.with(TemporalAdjusters.previousOrSame(dayOfWeek));
                }
            } else {
                localDateM3378of = LocalDate.m3378of(i, c45812e.f6988a, b);
                DayOfWeek dayOfWeek2 = c45812e.f6990c;
                if (dayOfWeek2 != null) {
                    localDateM3378of = localDateM3378of.with(TemporalAdjusters.nextOrSame(dayOfWeek2));
                }
            }
            if (c45812e.f6992e) {
                localDateM3378of = localDateM3378of.plusDays(1L);
            }
            LocalDateTime localDateTimeM3393of = LocalDateTime.m3393of(localDateM3378of, c45812e.f6991d);
            EnumC45811d enumC45811d = c45812e.f6993f;
            ZoneOffset zoneOffset = c45812e.f6994g;
            ZoneOffset zoneOffset2 = c45812e.f6995h;
            int i4 = AbstractC45810c.f6986a[enumC45811d.ordinal()];
            int i5 = i3;
            if (i4 == i5) {
                localDateTimeM3393of = localDateTimeM3393of.m3400m(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i4 == 2) {
                localDateTimeM3393of = localDateTimeM3393of.m3400m(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            c45809bArr3[i2] = new C45809b(localDateTimeM3393of, c45812e.f6995h, c45812e.f6996i);
            i2++;
            i3 = i5;
        }
        if (i < 2100) {
            ((ConcurrentHashMap) this.f6978h).putIfAbsent(numValueOf, c45809bArr3);
        }
        return c45809bArr3;
    }

    /* renamed from: f */
    public final boolean m3624f(Instant instant) {
        ZoneOffset zoneOffsetM3620g;
        TimeZone timeZone = this.f6977g;
        if (timeZone != null) {
            zoneOffsetM3620g = m3620g(timeZone.getRawOffset());
        } else if (this.f6973c.length == 0) {
            zoneOffsetM3620g = this.f6972b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f6971a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetM3620g = this.f6972b[iBinarySearch + 1];
        }
        return !zoneOffsetM3620g.equals(getOffset(instant));
    }

    /* renamed from: c */
    public static int m3619c(long j, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j + zoneOffset.getTotalSeconds(), OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            if (Objects.equals(this.f6977g, zoneRules.f6977g) && Arrays.equals(this.f6971a, zoneRules.f6971a) && Arrays.equals(this.f6972b, zoneRules.f6972b) && Arrays.equals(this.f6973c, zoneRules.f6973c) && Arrays.equals(this.f6975e, zoneRules.f6975e) && Arrays.equals(this.f6976f, zoneRules.f6976f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f6977g) ^ Arrays.hashCode(this.f6971a)) ^ Arrays.hashCode(this.f6972b)) ^ Arrays.hashCode(this.f6973c)) ^ Arrays.hashCode(this.f6975e)) ^ Arrays.hashCode(this.f6976f);
    }

    public final String toString() {
        TimeZone timeZone = this.f6977g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f6972b[r0.length - 1] + "]";
    }
}
