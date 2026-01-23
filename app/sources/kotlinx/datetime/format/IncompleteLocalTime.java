package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.TimeFieldContainer;
import kotlinx.datetime.internal.format.parser.Parser2;
import kotlinx.datetime.internal.math;

/* compiled from: LocalTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 ¨\u0006."}, m3636d2 = {"Lkotlinx/datetime/format/IncompleteLocalTime;", "Lkotlinx/datetime/format/TimeFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "", "hour", "hourOfAmPm", "Lkotlinx/datetime/format/AmPmMarker;", "amPm", "minute", "second", "nanosecond", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/format/AmPmMarker;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/LocalTime;", "toLocalTime", "()Lkotlinx/datetime/LocalTime;", "copy", "()Lkotlinx/datetime/format/IncompleteLocalTime;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getHour", "()Ljava/lang/Integer;", "setHour", "(Ljava/lang/Integer;)V", "getHourOfAmPm", "setHourOfAmPm", "Lkotlinx/datetime/format/AmPmMarker;", "getAmPm", "()Lkotlinx/datetime/format/AmPmMarker;", "setAmPm", "(Lkotlinx/datetime/format/AmPmMarker;)V", "getMinute", "setMinute", "getSecond", "setSecond", "getNanosecond", "setNanosecond", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class IncompleteLocalTime implements TimeFieldContainer, Parser2<IncompleteLocalTime> {
    private AmPmMarker amPm;
    private Integer hour;
    private Integer hourOfAmPm;
    private Integer minute;
    private Integer nanosecond;
    private Integer second;

    public IncompleteLocalTime() {
        this(null, null, null, null, null, null, 63, null);
    }

    public IncompleteLocalTime(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5) {
        this.hour = num;
        this.hourOfAmPm = num2;
        this.amPm = amPmMarker;
        this.minute = num3;
        this.second = num4;
        this.nanosecond = num5;
    }

    public /* synthetic */ IncompleteLocalTime(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : amPmMarker, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public math getFractionOfSecond() {
        return TimeFieldContainer.DefaultImpls.getFractionOfSecond(this);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setFractionOfSecond(math mathVar) {
        TimeFieldContainer.DefaultImpls.setFractionOfSecond(this, mathVar);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getHour() {
        return this.hour;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setHour(Integer num) {
        this.hour = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getHourOfAmPm() {
        return this.hourOfAmPm;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setHourOfAmPm(Integer num) {
        this.hourOfAmPm = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public AmPmMarker getAmPm() {
        return this.amPm;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setAmPm(AmPmMarker amPmMarker) {
        this.amPm = amPmMarker;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getMinute() {
        return this.minute;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setMinute(Integer num) {
        this.minute = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getSecond() {
        return this.second;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setSecond(Integer num) {
        this.second = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getNanosecond() {
        return this.nanosecond;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setNanosecond(Integer num) {
        this.nanosecond = num;
    }

    public final LocalTime toLocalTime() {
        int iIntValue;
        int iIntValue2;
        Integer hour = getHour();
        if (hour != null) {
            iIntValue = hour.intValue();
            Integer hourOfAmPm = getHourOfAmPm();
            if (hourOfAmPm != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = hourOfAmPm.intValue())) {
                throw new IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + iIntValue + ", but hour-of-am-pm is " + iIntValue2).toString());
            }
            AmPmMarker amPm = getAmPm();
            if (amPm != null) {
                if ((amPm == AmPmMarker.f7053PM) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + amPm).toString());
                }
            }
        } else {
            Integer hourOfAmPm2 = getHourOfAmPm();
            Integer numValueOf = null;
            if (hourOfAmPm2 != null) {
                int iIntValue3 = hourOfAmPm2.intValue();
                AmPmMarker amPm2 = getAmPm();
                if (amPm2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (amPm2 != AmPmMarker.f7053PM ? 0 : 12));
                }
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
        }
        int iIntValue4 = ((Number) LocalDateFormatKt.requireParsedField(getMinute(), "minute")).intValue();
        Integer second = getSecond();
        int iIntValue5 = second != null ? second.intValue() : 0;
        Integer nanosecond = getNanosecond();
        return new LocalTime(iIntValue, iIntValue4, iIntValue5, nanosecond != null ? nanosecond.intValue() : 0);
    }

    @Override // kotlinx.datetime.internal.format.parser.Parser2
    public IncompleteLocalTime copy() {
        return new IncompleteLocalTime(getHour(), getHourOfAmPm(), getAmPm(), getMinute(), getSecond(), getNanosecond());
    }

    public boolean equals(Object other) {
        if (!(other instanceof IncompleteLocalTime)) {
            return false;
        }
        IncompleteLocalTime incompleteLocalTime = (IncompleteLocalTime) other;
        return Intrinsics.areEqual(getHour(), incompleteLocalTime.getHour()) && Intrinsics.areEqual(getHourOfAmPm(), incompleteLocalTime.getHourOfAmPm()) && getAmPm() == incompleteLocalTime.getAmPm() && Intrinsics.areEqual(getMinute(), incompleteLocalTime.getMinute()) && Intrinsics.areEqual(getSecond(), incompleteLocalTime.getSecond()) && Intrinsics.areEqual(getNanosecond(), incompleteLocalTime.getNanosecond());
    }

    public int hashCode() {
        Integer hour = getHour();
        int iIntValue = (hour != null ? hour.intValue() : 0) * 31;
        Integer hourOfAmPm = getHourOfAmPm();
        int iIntValue2 = iIntValue + ((hourOfAmPm != null ? hourOfAmPm.intValue() : 0) * 31);
        AmPmMarker amPm = getAmPm();
        int iHashCode = iIntValue2 + ((amPm != null ? amPm.hashCode() : 0) * 31);
        Integer minute = getMinute();
        int iIntValue3 = iHashCode + ((minute != null ? minute.intValue() : 0) * 31);
        Integer second = getSecond();
        int iIntValue4 = iIntValue3 + ((second != null ? second.intValue() : 0) * 31);
        Integer nanosecond = getNanosecond();
        return iIntValue4 + (nanosecond != null ? nanosecond.intValue() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strPadStart;
        StringBuilder sb = new StringBuilder();
        Object hour = getHour();
        if (hour == null) {
            hour = "??";
        }
        sb.append(hour);
        sb.append(':');
        Object minute = getMinute();
        if (minute == null) {
            minute = "??";
        }
        sb.append(minute);
        sb.append(':');
        Integer second = getSecond();
        sb.append(second != null ? second : "??");
        sb.append('.');
        Integer nanosecond = getNanosecond();
        if (nanosecond != null) {
            String strValueOf = String.valueOf(nanosecond.intValue());
            strPadStart = StringsKt.padStart(strValueOf, 9 - strValueOf.length(), '0');
            if (strPadStart == null) {
                strPadStart = "???";
            }
        }
        sb.append(strPadStart);
        return sb.toString();
    }
}
