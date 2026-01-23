package kotlinx.datetime.format;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.internal.format.parser.Parser2;
import kotlinx.datetime.internal.math;

/* compiled from: LocalDateTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010$\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001e\u0010'\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010-\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u00104\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00107\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001e\u0010:\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR\u001e\u0010=\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR\u001e\u0010@\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001aR\u001e\u0010C\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u001a¨\u0006D"}, m3636d2 = {"Lkotlinx/datetime/format/IncompleteLocalDateTime;", "", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/TimeFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "Lkotlinx/datetime/format/IncompleteLocalDate;", InquiryField.DateField.TYPE, "Lkotlinx/datetime/format/IncompleteLocalTime;", "time", "<init>", "(Lkotlinx/datetime/format/IncompleteLocalDate;Lkotlinx/datetime/format/IncompleteLocalTime;)V", "Lkotlinx/datetime/LocalDateTime;", "toLocalDateTime", "()Lkotlinx/datetime/LocalDateTime;", "copy", "()Lkotlinx/datetime/format/IncompleteLocalDateTime;", "Lkotlinx/datetime/format/IncompleteLocalDate;", "getDate", "()Lkotlinx/datetime/format/IncompleteLocalDate;", "Lkotlinx/datetime/format/IncompleteLocalTime;", "getTime", "()Lkotlinx/datetime/format/IncompleteLocalTime;", "", "getDayOfMonth", "()Ljava/lang/Integer;", "setDayOfMonth", "(Ljava/lang/Integer;)V", "dayOfMonth", "getDayOfYear", "setDayOfYear", "dayOfYear", "getIsoDayOfWeek", "setIsoDayOfWeek", "isoDayOfWeek", "getMonthNumber", "setMonthNumber", "monthNumber", "getYear", "setYear", "year", "Lkotlinx/datetime/format/AmPmMarker;", "getAmPm", "()Lkotlinx/datetime/format/AmPmMarker;", "setAmPm", "(Lkotlinx/datetime/format/AmPmMarker;)V", "amPm", "Lkotlinx/datetime/internal/DecimalFraction;", "value", "getFractionOfSecond", "()Lkotlinx/datetime/internal/DecimalFraction;", "setFractionOfSecond", "(Lkotlinx/datetime/internal/DecimalFraction;)V", "fractionOfSecond", "getHour", "setHour", "hour", "getHourOfAmPm", "setHourOfAmPm", "hourOfAmPm", "getMinute", "setMinute", "minute", "getNanosecond", "setNanosecond", "nanosecond", "getSecond", "setSecond", "second", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.format.IncompleteLocalDateTime, reason: use source file name */
/* loaded from: classes14.dex */
public final class LocalDateTimeFormat3 implements DateFieldContainer, TimeFieldContainer, Parser2<LocalDateTimeFormat3> {
    private final IncompleteLocalDate date;
    private final IncompleteLocalTime time;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalDateTimeFormat3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
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

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getYear() {
        return this.date.getYear();
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

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setMonthNumber(Integer num) {
        this.date.setMonthNumber(num);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setNanosecond(Integer num) {
        this.time.setNanosecond(num);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public void setSecond(Integer num) {
        this.time.setSecond(num);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setYear(Integer num) {
        this.date.setYear(num);
    }

    public LocalDateTimeFormat3(IncompleteLocalDate date, IncompleteLocalTime time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.date = date;
        this.time = time;
    }

    public /* synthetic */ LocalDateTimeFormat3(IncompleteLocalDate incompleteLocalDate, IncompleteLocalTime incompleteLocalTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IncompleteLocalDate(null, null, null, null, null, 31, null) : incompleteLocalDate, (i & 2) != 0 ? new IncompleteLocalTime(null, null, null, null, null, null, 63, null) : incompleteLocalTime);
    }

    public final LocalDateTime toLocalDateTime() {
        return new LocalDateTime(this.date.toLocalDate(), this.time.toLocalTime());
    }

    @Override // kotlinx.datetime.internal.format.parser.Parser2
    public LocalDateTimeFormat3 copy() {
        return new LocalDateTimeFormat3(this.date.copy(), this.time.copy());
    }
}
