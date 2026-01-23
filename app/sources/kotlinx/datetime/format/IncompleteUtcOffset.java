package kotlinx.datetime.format;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.UtcOffsetJvm;
import kotlinx.datetime.UtcOffsetJvm2;
import kotlinx.datetime.internal.format.parser.Parser2;

/* compiled from: UtcOffsetFormat.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006&"}, m3636d2 = {"Lkotlinx/datetime/format/IncompleteUtcOffset;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "", "isNegative", "", "totalHoursAbs", "minutesOfHour", "secondsOfMinute", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/UtcOffset;", "toUtcOffset", "()Lkotlinx/datetime/UtcOffset;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "copy", "()Lkotlinx/datetime/format/IncompleteUtcOffset;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setNegative", "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "getTotalHoursAbs", "()Ljava/lang/Integer;", "setTotalHoursAbs", "(Ljava/lang/Integer;)V", "getMinutesOfHour", "setMinutesOfHour", "getSecondsOfMinute", "setSecondsOfMinute", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class IncompleteUtcOffset implements UtcOffsetFieldContainer, Parser2<IncompleteUtcOffset> {
    private Boolean isNegative;
    private Integer minutesOfHour;
    private Integer secondsOfMinute;
    private Integer totalHoursAbs;

    public IncompleteUtcOffset() {
        this(null, null, null, null, 15, null);
    }

    public IncompleteUtcOffset(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.isNegative = bool;
        this.totalHoursAbs = num;
        this.minutesOfHour = num2;
        this.secondsOfMinute = num3;
    }

    public /* synthetic */ IncompleteUtcOffset(Boolean bool, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    /* renamed from: isNegative, reason: from getter */
    public Boolean getIsNegative() {
        return this.isNegative;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setNegative(Boolean bool) {
        this.isNegative = bool;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public Integer getTotalHoursAbs() {
        return this.totalHoursAbs;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setTotalHoursAbs(Integer num) {
        this.totalHoursAbs = num;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public Integer getMinutesOfHour() {
        return this.minutesOfHour;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setMinutesOfHour(Integer num) {
        this.minutesOfHour = num;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public Integer getSecondsOfMinute() {
        return this.secondsOfMinute;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setSecondsOfMinute(Integer num) {
        this.secondsOfMinute = num;
    }

    public final UtcOffsetJvm toUtcOffset() {
        int i = Intrinsics.areEqual(getIsNegative(), Boolean.TRUE) ? -1 : 1;
        Integer totalHoursAbs = getTotalHoursAbs();
        Integer numValueOf = totalHoursAbs != null ? Integer.valueOf(totalHoursAbs.intValue() * i) : null;
        Integer minutesOfHour = getMinutesOfHour();
        Integer numValueOf2 = minutesOfHour != null ? Integer.valueOf(minutesOfHour.intValue() * i) : null;
        Integer secondsOfMinute = getSecondsOfMinute();
        return UtcOffsetJvm2.UtcOffset(numValueOf, numValueOf2, secondsOfMinute != null ? Integer.valueOf(secondsOfMinute.intValue() * i) : null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof IncompleteUtcOffset)) {
            return false;
        }
        IncompleteUtcOffset incompleteUtcOffset = (IncompleteUtcOffset) other;
        return Intrinsics.areEqual(getIsNegative(), incompleteUtcOffset.getIsNegative()) && Intrinsics.areEqual(getTotalHoursAbs(), incompleteUtcOffset.getTotalHoursAbs()) && Intrinsics.areEqual(getMinutesOfHour(), incompleteUtcOffset.getMinutesOfHour()) && Intrinsics.areEqual(getSecondsOfMinute(), incompleteUtcOffset.getSecondsOfMinute());
    }

    public int hashCode() {
        Boolean isNegative = getIsNegative();
        int iHashCode = isNegative != null ? isNegative.hashCode() : 0;
        Integer totalHoursAbs = getTotalHoursAbs();
        int iHashCode2 = iHashCode + (totalHoursAbs != null ? totalHoursAbs.hashCode() : 0);
        Integer minutesOfHour = getMinutesOfHour();
        int iHashCode3 = iHashCode2 + (minutesOfHour != null ? minutesOfHour.hashCode() : 0);
        Integer secondsOfMinute = getSecondsOfMinute();
        return iHashCode3 + (secondsOfMinute != null ? secondsOfMinute.hashCode() : 0);
    }

    @Override // kotlinx.datetime.internal.format.parser.Parser2
    public IncompleteUtcOffset copy() {
        return new IncompleteUtcOffset(getIsNegative(), getTotalHoursAbs(), getMinutesOfHour(), getSecondsOfMinute());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean isNegative = getIsNegative();
        sb.append(isNegative != null ? isNegative.booleanValue() ? "-" : "+" : PlaceholderUtils.XXShortPlaceholderText);
        Object totalHoursAbs = getTotalHoursAbs();
        if (totalHoursAbs == null) {
            totalHoursAbs = "??";
        }
        sb.append(totalHoursAbs);
        sb.append(':');
        Object minutesOfHour = getMinutesOfHour();
        if (minutesOfHour == null) {
            minutesOfHour = "??";
        }
        sb.append(minutesOfHour);
        sb.append(':');
        Integer secondsOfMinute = getSecondsOfMinute();
        sb.append(secondsOfMinute != null ? secondsOfMinute : "??");
        return sb.toString();
    }
}
