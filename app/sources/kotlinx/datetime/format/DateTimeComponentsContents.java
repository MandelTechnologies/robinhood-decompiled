package kotlinx.datetime.format;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.parser.Parser2;
import kotlinx.datetime.internal.math;

/* compiled from: DateTimeComponents.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005B3\b\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010+\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010.\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001e\u00101\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001e\u00104\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001e\u00107\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\u001e\u0010=\u001a\u0004\u0018\u0001088\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010G\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*R\u001e\u0010J\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R\u001e\u0010M\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R\u001e\u0010P\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R\u001e\u0010S\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010*R\u001e\u0010T\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010Z\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bX\u0010(\"\u0004\bY\u0010*R\u001e\u0010]\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b[\u0010(\"\u0004\b\\\u0010*R\u001e\u0010`\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b^\u0010(\"\u0004\b_\u0010*¨\u0006a"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeComponentsContents;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/TimeFieldContainer;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "", "Lkotlinx/datetime/internal/format/parser/Copyable;", "Lkotlinx/datetime/format/IncompleteLocalDate;", InquiryField.DateField.TYPE, "Lkotlinx/datetime/format/IncompleteLocalTime;", "time", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "offset", "", "timeZoneId", "<init>", "(Lkotlinx/datetime/format/IncompleteLocalDate;Lkotlinx/datetime/format/IncompleteLocalTime;Lkotlinx/datetime/format/IncompleteUtcOffset;Ljava/lang/String;)V", "copy", "()Lkotlinx/datetime/format/DateTimeComponentsContents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/format/IncompleteLocalDate;", "getDate", "()Lkotlinx/datetime/format/IncompleteLocalDate;", "Lkotlinx/datetime/format/IncompleteLocalTime;", "getTime", "()Lkotlinx/datetime/format/IncompleteLocalTime;", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "getOffset", "()Lkotlinx/datetime/format/IncompleteUtcOffset;", "Ljava/lang/String;", "getTimeZoneId", "()Ljava/lang/String;", "setTimeZoneId", "(Ljava/lang/String;)V", "getDayOfMonth", "()Ljava/lang/Integer;", "setDayOfMonth", "(Ljava/lang/Integer;)V", "dayOfMonth", "getDayOfYear", "setDayOfYear", "dayOfYear", "getIsoDayOfWeek", "setIsoDayOfWeek", "isoDayOfWeek", "getMonthNumber", "setMonthNumber", "monthNumber", "getYear", "setYear", "year", "Lkotlinx/datetime/format/AmPmMarker;", "getAmPm", "()Lkotlinx/datetime/format/AmPmMarker;", "setAmPm", "(Lkotlinx/datetime/format/AmPmMarker;)V", "amPm", "Lkotlinx/datetime/internal/DecimalFraction;", "value", "getFractionOfSecond", "()Lkotlinx/datetime/internal/DecimalFraction;", "setFractionOfSecond", "(Lkotlinx/datetime/internal/DecimalFraction;)V", "fractionOfSecond", "getHour", "setHour", "hour", "getHourOfAmPm", "setHourOfAmPm", "hourOfAmPm", "getMinute", "setMinute", "minute", "getNanosecond", "setNanosecond", "nanosecond", "getSecond", "setSecond", "second", "isNegative", "()Ljava/lang/Boolean;", "setNegative", "(Ljava/lang/Boolean;)V", "getMinutesOfHour", "setMinutesOfHour", "minutesOfHour", "getSecondsOfMinute", "setSecondsOfMinute", "secondsOfMinute", "getTotalHoursAbs", "setTotalHoursAbs", "totalHoursAbs", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DateTimeComponentsContents implements DateFieldContainer, TimeFieldContainer, UtcOffsetFieldContainer, Parser2<DateTimeComponentsContents> {
    private final IncompleteLocalDate date;
    private final IncompleteUtcOffset offset;
    private final IncompleteLocalTime time;
    private String timeZoneId;

    public DateTimeComponentsContents() {
        this(null, null, null, null, 15, null);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public AmPmMarker getAmPm() {
        return this.time.getAmPm();
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getDayOfMonth() {
        return this.date.getDayOfMonth();
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getDayOfYear() {
        return this.date.getDayOfYear();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public math getFractionOfSecond() {
        return this.time.getFractionOfSecond();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getHour() {
        return this.time.getHour();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getHourOfAmPm() {
        return this.time.getHourOfAmPm();
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getIsoDayOfWeek() {
        return this.date.getIsoDayOfWeek();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getMinute() {
        return this.time.getMinute();
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public Integer getMinutesOfHour() {
        return this.offset.getMinutesOfHour();
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getMonthNumber() {
        return this.date.getMonthNumber();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getNanosecond() {
        return this.time.getNanosecond();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public Integer getSecond() {
        return this.time.getSecond();
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public Integer getSecondsOfMinute() {
        return this.offset.getSecondsOfMinute();
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public Integer getTotalHoursAbs() {
        return this.offset.getTotalHoursAbs();
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getYear() {
        return this.date.getYear();
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    /* renamed from: isNegative */
    public Boolean getIsNegative() {
        return this.offset.getIsNegative();
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setAmPm(AmPmMarker amPmMarker) {
        this.time.setAmPm(amPmMarker);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setDayOfMonth(Integer num) {
        this.date.setDayOfMonth(num);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setDayOfYear(Integer num) {
        this.date.setDayOfYear(num);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setFractionOfSecond(math mathVar) {
        this.time.setFractionOfSecond(mathVar);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setHour(Integer num) {
        this.time.setHour(num);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setHourOfAmPm(Integer num) {
        this.time.setHourOfAmPm(num);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setIsoDayOfWeek(Integer num) {
        this.date.setIsoDayOfWeek(num);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setMinute(Integer num) {
        this.time.setMinute(num);
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setMinutesOfHour(Integer num) {
        this.offset.setMinutesOfHour(num);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setMonthNumber(Integer num) {
        this.date.setMonthNumber(num);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setNanosecond(Integer num) {
        this.time.setNanosecond(num);
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setNegative(Boolean bool) {
        this.offset.setNegative(bool);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setSecond(Integer num) {
        this.time.setSecond(num);
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setSecondsOfMinute(Integer num) {
        this.offset.setSecondsOfMinute(num);
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public void setTotalHoursAbs(Integer num) {
        this.offset.setTotalHoursAbs(num);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setYear(Integer num) {
        this.date.setYear(num);
    }

    public DateTimeComponentsContents(IncompleteLocalDate date, IncompleteLocalTime time, IncompleteUtcOffset offset, String str) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.date = date;
        this.time = time;
        this.offset = offset;
        this.timeZoneId = str;
    }

    public /* synthetic */ DateTimeComponentsContents(IncompleteLocalDate incompleteLocalDate, IncompleteLocalTime incompleteLocalTime, IncompleteUtcOffset incompleteUtcOffset, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IncompleteLocalDate(null, null, null, null, null, 31, null) : incompleteLocalDate, (i & 2) != 0 ? new IncompleteLocalTime(null, null, null, null, null, null, 63, null) : incompleteLocalTime, (i & 4) != 0 ? new IncompleteUtcOffset(null, null, null, null, 15, null) : incompleteUtcOffset, (i & 8) != 0 ? null : str);
    }

    public final IncompleteLocalDate getDate() {
        return this.date;
    }

    public final IncompleteLocalTime getTime() {
        return this.time;
    }

    public final IncompleteUtcOffset getOffset() {
        return this.offset;
    }

    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final void setTimeZoneId(String str) {
        this.timeZoneId = str;
    }

    @Override // kotlinx.datetime.internal.format.parser.Parser2
    public DateTimeComponentsContents copy() {
        return new DateTimeComponentsContents(this.date.copy(), this.time.copy(), this.offset.copy(), this.timeZoneId);
    }

    public boolean equals(Object other) {
        if (!(other instanceof DateTimeComponentsContents)) {
            return false;
        }
        DateTimeComponentsContents dateTimeComponentsContents = (DateTimeComponentsContents) other;
        return Intrinsics.areEqual(dateTimeComponentsContents.date, this.date) && Intrinsics.areEqual(dateTimeComponentsContents.time, this.time) && Intrinsics.areEqual(dateTimeComponentsContents.offset, this.offset) && Intrinsics.areEqual(dateTimeComponentsContents.timeZoneId, this.timeZoneId);
    }

    public int hashCode() {
        int iHashCode = (this.date.hashCode() ^ this.time.hashCode()) ^ this.offset.hashCode();
        String str = this.timeZoneId;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }
}
