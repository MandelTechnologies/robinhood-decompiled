package p479j$.time.zone;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.DayOfWeek;
import p479j$.time.LocalTime;
import p479j$.time.Month;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.zone.e */
/* loaded from: classes29.dex */
public final class C45812e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a */
    public final Month f6988a;

    /* renamed from: b */
    public final byte f6989b;

    /* renamed from: c */
    public final DayOfWeek f6990c;

    /* renamed from: d */
    public final LocalTime f6991d;

    /* renamed from: e */
    public final boolean f6992e;

    /* renamed from: f */
    public final EnumC45811d f6993f;

    /* renamed from: g */
    public final ZoneOffset f6994g;

    /* renamed from: h */
    public final ZoneOffset f6995h;

    /* renamed from: i */
    public final ZoneOffset f6996i;

    public C45812e(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, EnumC45811d enumC45811d, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f6988a = month;
        this.f6989b = (byte) i;
        this.f6990c = dayOfWeek;
        this.f6991d = localTime;
        this.f6992e = z;
        this.f6993f = enumC45811d;
        this.f6994g = zoneOffset;
        this.f6995h = zoneOffset2;
        this.f6996i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45808a((byte) 3, this);
    }

    /* renamed from: b */
    public final void m3631b(DataOutput dataOutput) {
        byte b;
        int secondOfDay = this.f6992e ? OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC : this.f6991d.toSecondOfDay();
        int totalSeconds = this.f6994g.getTotalSeconds();
        int totalSeconds2 = this.f6995h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.f6996i.getTotalSeconds() - totalSeconds;
        if (secondOfDay % OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC == 0) {
            b = this.f6992e ? (byte) 24 : this.f6991d.f6676a;
        } else {
            b = 31;
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f6990c;
        dataOutput.writeInt((this.f6988a.getValue() << 28) + ((this.f6989b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f6993f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.f6995h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.f6996i.getTotalSeconds());
        }
    }

    /* renamed from: a */
    public static C45812e m3630a(DataInput dataInput) {
        EnumC45811d enumC45811d;
        LocalTime localTimeM3408of;
        int i = dataInput.readInt();
        Month monthM3422of = Month.m3422of(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekM3368of = i3 == 0 ? null : DayOfWeek.m3368of(i3);
        int i4 = (507904 & i) >>> 14;
        EnumC45811d enumC45811d2 = EnumC45811d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            long j = dataInput.readInt();
            LocalTime localTime = LocalTime.MIN;
            ChronoField.SECOND_OF_DAY.checkValidValue(j);
            int i8 = (int) (j / 3600);
            long j2 = j - (i8 * OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC);
            enumC45811d = enumC45811d2;
            localTimeM3408of = LocalTime.m3405c(i8, (int) (j2 / 60), (int) (j2 - (r14 * 60)), 0);
        } else {
            enumC45811d = enumC45811d2;
            localTimeM3408of = LocalTime.m3408of(i4 % 24, 0);
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i6 == 3 ? dataInput.readInt() : (i6 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds());
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i7 == 3 ? dataInput.readInt() : (i7 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds());
        boolean z = i4 == 24;
        Objects.requireNonNull(monthM3422of, ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS);
        Objects.requireNonNull(localTimeM3408of, "time");
        EnumC45811d enumC45811d3 = enumC45811d;
        Objects.requireNonNull(enumC45811d3, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTimeM3408of.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeM3408of.f6679d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C45812e(monthM3422of, i2, dayOfWeekM3368of, localTimeM3408of, z, enumC45811d3, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45812e) {
            C45812e c45812e = (C45812e) obj;
            if (this.f6988a == c45812e.f6988a && this.f6989b == c45812e.f6989b && this.f6990c == c45812e.f6990c && this.f6993f == c45812e.f6993f && this.f6991d.equals(c45812e.f6991d) && this.f6992e == c45812e.f6992e && this.f6994g.equals(c45812e.f6994g) && this.f6995h.equals(c45812e.f6995h) && this.f6996i.equals(c45812e.f6996i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = ((this.f6991d.toSecondOfDay() + (this.f6992e ? 1 : 0)) << 15) + (this.f6988a.ordinal() << 11) + ((this.f6989b + 32) << 5);
        DayOfWeek dayOfWeek = this.f6990c;
        return ((this.f6994g.hashCode() ^ (this.f6993f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f6995h.hashCode()) ^ this.f6996i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.f6996i.f6704a - this.f6995h.f6704a > 0 ? "Gap " : "Overlap ");
        sb.append(this.f6995h);
        sb.append(" to ");
        sb.append(this.f6996i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.f6990c;
        if (dayOfWeek != null) {
            byte b = this.f6989b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.f6988a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f6989b) - 1);
                sb.append(" of ");
                sb.append(this.f6988a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.f6988a.name());
                sb.append(' ');
                sb.append((int) this.f6989b);
            }
        } else {
            sb.append(this.f6988a.name());
            sb.append(' ');
            sb.append((int) this.f6989b);
        }
        sb.append(" at ");
        sb.append(this.f6992e ? "24:00" : this.f6991d.toString());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(this.f6993f);
        sb.append(", standard offset ");
        sb.append(this.f6994g);
        sb.append(']');
        return sb.toString();
    }
}
