package kotlinx.datetime;

import com.robinhood.models.p320db.Instrument;
import com.squareup.wire.internal.MathMethods;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.internal.math2;
import kotlinx.datetime.internal.math3;
import p479j$.time.DateTimeException;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: Instant.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/datetime/Instant;", "Lkotlinx/datetime/TimeZone;", "zone", "j$/time/ZonedDateTime", "atZone", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/TimeZone;)Lj$/time/ZonedDateTime;", "", "value", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", Instrument.TYPE_UNIT, "plus", "(Lkotlinx/datetime/Instant;JLkotlinx/datetime/DateTimeUnit$TimeBased;)Lkotlinx/datetime/Instant;", "other", "Lkotlinx/datetime/DateTimeUnit;", "timeZone", "until", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lkotlinx/datetime/DateTimeUnit;Lkotlinx/datetime/TimeZone;)J", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: kotlinx.datetime.InstantJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Instant5 {
    private static final ZonedDateTime atZone(Instant instant, TimeZoneJvm2 timeZoneJvm2) {
        try {
            ZonedDateTime zonedDateTimeAtZone = instant.getValue().atZone(timeZoneJvm2.getZoneId());
            Intrinsics.checkNotNull(zonedDateTimeAtZone);
            return zonedDateTimeAtZone;
        } catch (DateTimeException e) {
            throw new DateTimeArithmeticException(e);
        }
    }

    public static final Instant plus(Instant instant, long j, DateTimeUnit.TimeBased unit) throws Exception {
        long j2;
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            j2 = j;
        } catch (Exception e) {
            e = e;
            j2 = j;
        }
        try {
            math2 math2VarMultiplyAndDivide = math3.multiplyAndDivide(j2, unit.getNanoseconds(), MathMethods.NANOS_PER_SECOND);
            p479j$.time.Instant instantPlusNanos = instant.getValue().plusSeconds(math2VarMultiplyAndDivide.getQ()).plusNanos(math2VarMultiplyAndDivide.getR());
            Intrinsics.checkNotNullExpressionValue(instantPlusNanos, "plusNanos(...)");
            return new Instant(instantPlusNanos);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            if ((exc instanceof DateTimeException) || (exc instanceof ArithmeticException)) {
                return j2 > 0 ? Instant.INSTANCE.getMAX$kotlinx_datetime() : Instant.INSTANCE.getMIN$kotlinx_datetime();
            }
            throw exc;
        }
    }

    public static final long until(Instant instant, Instant other, DateTimeUnit unit, TimeZoneJvm2 timeZone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        try {
            ZonedDateTime zonedDateTimeAtZone = atZone(instant, timeZone);
            ZonedDateTime zonedDateTimeAtZone2 = atZone(other, timeZone);
            if (unit instanceof DateTimeUnit.TimeBased) {
                return Instant6.until(instant, other, (DateTimeUnit.TimeBased) unit);
            }
            if (unit instanceof DateTimeUnit.DayBased) {
                return zonedDateTimeAtZone.until(zonedDateTimeAtZone2, ChronoUnit.DAYS) / ((DateTimeUnit.DayBased) unit).getDays();
            }
            if (unit instanceof DateTimeUnit.MonthBased) {
                return zonedDateTimeAtZone.until(zonedDateTimeAtZone2, ChronoUnit.MONTHS) / ((DateTimeUnit.MonthBased) unit).getMonths();
            }
            throw new NoWhenBranchMatchedException();
        } catch (DateTimeException e) {
            throw new DateTimeArithmeticException(e);
        } catch (ArithmeticException unused) {
            return instant.getValue().compareTo(other.getValue()) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }
}
