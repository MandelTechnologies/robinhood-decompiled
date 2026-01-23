package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.DayOfWeek2;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDate2;
import kotlinx.datetime.internal.format.parser.Parser2;

/* compiled from: LocalDateFormat.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001e¨\u0006'"}, m3636d2 = {"Lkotlinx/datetime/format/IncompleteLocalDate;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "", "year", "monthNumber", "dayOfMonth", "isoDayOfWeek", "dayOfYear", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/LocalDate;", "toLocalDate", "()Lkotlinx/datetime/LocalDate;", "copy", "()Lkotlinx/datetime/format/IncompleteLocalDate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "getMonthNumber", "setMonthNumber", "getDayOfMonth", "setDayOfMonth", "getIsoDayOfWeek", "setIsoDayOfWeek", "getDayOfYear", "setDayOfYear", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class IncompleteLocalDate implements DateFieldContainer, Parser2<IncompleteLocalDate> {
    private Integer dayOfMonth;
    private Integer dayOfYear;
    private Integer isoDayOfWeek;
    private Integer monthNumber;
    private Integer year;

    public IncompleteLocalDate() {
        this(null, null, null, null, null, 31, null);
    }

    public IncompleteLocalDate(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.year = num;
        this.monthNumber = num2;
        this.dayOfMonth = num3;
        this.isoDayOfWeek = num4;
        this.dayOfYear = num5;
    }

    public /* synthetic */ IncompleteLocalDate(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5);
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getYear() {
        return this.year;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setYear(Integer num) {
        this.year = num;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getMonthNumber() {
        return this.monthNumber;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setMonthNumber(Integer num) {
        this.monthNumber = num;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setDayOfMonth(Integer num) {
        this.dayOfMonth = num;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getIsoDayOfWeek() {
        return this.isoDayOfWeek;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setIsoDayOfWeek(Integer num) {
        this.isoDayOfWeek = num;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public Integer getDayOfYear() {
        return this.dayOfYear;
    }

    @Override // kotlinx.datetime.format.DateFieldContainer
    public void setDayOfYear(Integer num) {
        this.dayOfYear = num;
    }

    public final LocalDate toLocalDate() {
        LocalDate localDate;
        int iIntValue;
        int iIntValue2 = ((Number) LocalDateFormatKt.requireParsedField(getYear(), "year")).intValue();
        Integer dayOfYear = getDayOfYear();
        if (dayOfYear == null) {
            localDate = new LocalDate(iIntValue2, ((Number) LocalDateFormatKt.requireParsedField(getMonthNumber(), "monthNumber")).intValue(), ((Number) LocalDateFormatKt.requireParsedField(getDayOfMonth(), "dayOfMonth")).intValue());
        } else {
            LocalDate localDatePlus = LocalDate2.plus(new LocalDate(iIntValue2, 1, 1), dayOfYear.intValue() - 1, (DateTimeUnit.DateBased) DateTimeUnit.INSTANCE.getDAY());
            if (localDatePlus.getYear() != iIntValue2) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is not a valid day of year for the year " + iIntValue2);
            }
            if (getMonthNumber() != null) {
                int monthNumber = localDatePlus.getMonthNumber();
                Integer monthNumber2 = getMonthNumber();
                if (monthNumber2 == null || monthNumber != monthNumber2.intValue()) {
                    throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is " + localDatePlus.getMonth() + ", but " + getMonthNumber() + " was specified as the month number");
                }
            }
            if (getDayOfMonth() != null) {
                int dayOfMonth = localDatePlus.getDayOfMonth();
                Integer dayOfMonth2 = getDayOfMonth();
                if (dayOfMonth2 == null || dayOfMonth != dayOfMonth2.intValue()) {
                    throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is the day " + localDatePlus.getDayOfMonth() + " of " + localDatePlus.getMonth() + ", but " + getDayOfMonth() + " was specified as the day of month");
                }
            }
            localDate = localDatePlus;
        }
        Integer isoDayOfWeek = getIsoDayOfWeek();
        if (isoDayOfWeek == null || (iIntValue = isoDayOfWeek.intValue()) == DayOfWeek2.getIsoDayNumber(localDate.getDayOfWeek())) {
            return localDate;
        }
        throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of week is " + DayOfWeek2.DayOfWeek(iIntValue) + " but the date is " + localDate + ", which is a " + localDate.getDayOfWeek());
    }

    @Override // kotlinx.datetime.internal.format.parser.Parser2
    public IncompleteLocalDate copy() {
        return new IncompleteLocalDate(getYear(), getMonthNumber(), getDayOfMonth(), getIsoDayOfWeek(), getDayOfYear());
    }

    public boolean equals(Object other) {
        if (!(other instanceof IncompleteLocalDate)) {
            return false;
        }
        IncompleteLocalDate incompleteLocalDate = (IncompleteLocalDate) other;
        return Intrinsics.areEqual(getYear(), incompleteLocalDate.getYear()) && Intrinsics.areEqual(getMonthNumber(), incompleteLocalDate.getMonthNumber()) && Intrinsics.areEqual(getDayOfMonth(), incompleteLocalDate.getDayOfMonth()) && Intrinsics.areEqual(getIsoDayOfWeek(), incompleteLocalDate.getIsoDayOfWeek()) && Intrinsics.areEqual(getDayOfYear(), incompleteLocalDate.getDayOfYear());
    }

    public int hashCode() {
        Integer year = getYear();
        int iHashCode = (year != null ? year.hashCode() : 0) * 923521;
        Integer monthNumber = getMonthNumber();
        int iHashCode2 = iHashCode + ((monthNumber != null ? monthNumber.hashCode() : 0) * 29791);
        Integer dayOfMonth = getDayOfMonth();
        int iHashCode3 = iHashCode2 + ((dayOfMonth != null ? dayOfMonth.hashCode() : 0) * 961);
        Integer isoDayOfWeek = getIsoDayOfWeek();
        int iHashCode4 = iHashCode3 + ((isoDayOfWeek != null ? isoDayOfWeek.hashCode() : 0) * 31);
        Integer dayOfYear = getDayOfYear();
        return iHashCode4 + (dayOfYear != null ? dayOfYear.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Object year = getYear();
        if (year == null) {
            year = "??";
        }
        sb.append(year);
        sb.append('-');
        Object monthNumber = getMonthNumber();
        if (monthNumber == null) {
            monthNumber = "??";
        }
        sb.append(monthNumber);
        sb.append('-');
        Object dayOfMonth = getDayOfMonth();
        if (dayOfMonth == null) {
            dayOfMonth = "??";
        }
        sb.append(dayOfMonth);
        sb.append(" (day of week is ");
        Integer isoDayOfWeek = getIsoDayOfWeek();
        sb.append(isoDayOfWeek != null ? isoDayOfWeek : "??");
        sb.append(')');
        return sb.toString();
    }
}
