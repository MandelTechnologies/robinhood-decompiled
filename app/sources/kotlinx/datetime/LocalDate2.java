package kotlinx.datetime;

import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.internal.mathJvm;
import p479j$.time.DateTimeException;

/* compiled from: LocalDate.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/LocalDate;", "", "value", "Lkotlinx/datetime/DateTimeUnit$DateBased;", Instrument.TYPE_UNIT, "plus", "(Lkotlinx/datetime/LocalDate;ILkotlinx/datetime/DateTimeUnit$DateBased;)Lkotlinx/datetime/LocalDate;", "", "(Lkotlinx/datetime/LocalDate;JLkotlinx/datetime/DateTimeUnit$DateBased;)Lkotlinx/datetime/LocalDate;", "epochDay", "j$/time/LocalDate", "ofEpochDayChecked", "(J)Lj$/time/LocalDate;", "minEpochDay", "J", "maxEpochDay", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: kotlinx.datetime.LocalDateJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class LocalDate2 {
    private static final long minEpochDay = p479j$.time.LocalDate.MIN.toEpochDay();
    private static final long maxEpochDay = p479j$.time.LocalDate.MAX.toEpochDay();

    public static final LocalDate plus(LocalDate localDate, int i, DateTimeUnit.DateBased unit) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return plus(localDate, i, unit);
    }

    public static final LocalDate plus(LocalDate localDate, long j, DateTimeUnit.DateBased unit) throws Exception {
        p479j$.time.LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            if (unit instanceof DateTimeUnit.DayBased) {
                localDatePlusMonths = ofEpochDayChecked(mathJvm.safeAdd(localDate.getValue().toEpochDay(), mathJvm.safeMultiply(j, ((DateTimeUnit.DayBased) unit).getDays())));
            } else if (unit instanceof DateTimeUnit.MonthBased) {
                localDatePlusMonths = localDate.getValue().plusMonths(mathJvm.safeMultiply(j, ((DateTimeUnit.MonthBased) unit).getMonths()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new LocalDate(localDatePlusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new DateTimeArithmeticException("The result of adding " + j + " of " + unit + " to " + localDate + " is out of LocalDate range.", e);
        }
    }

    private static final p479j$.time.LocalDate ofEpochDayChecked(long j) {
        long j2 = minEpochDay;
        if (j > maxEpochDay || j2 > j) {
            throw new DateTimeException("The resulting day " + j + " is out of supported LocalDate range.");
        }
        p479j$.time.LocalDate localDateOfEpochDay = p479j$.time.LocalDate.ofEpochDay(j);
        Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
        return localDateOfEpochDay;
    }
}
