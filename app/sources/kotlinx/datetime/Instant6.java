package kotlinx.datetime;

import com.robinhood.models.p320db.Instrument;
import com.squareup.wire.internal.MathMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.internal.math3;

/* compiled from: Instant.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lkotlinx/datetime/Instant;", "other", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", Instrument.TYPE_UNIT, "", "until", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lkotlinx/datetime/DateTimeUnit$TimeBased;)J", "Lkotlinx/datetime/TimeZone;", "timeZone", "", "daysUntil", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lkotlinx/datetime/TimeZone;)I", "value", "plus", "(Lkotlinx/datetime/Instant;ILkotlinx/datetime/DateTimeUnit$TimeBased;)Lkotlinx/datetime/Instant;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.InstantKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Instant6 {
    public static final long until(Instant instant, Instant other, DateTimeUnit.TimeBased unit) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            return math3.multiplyAddAndDivide(other.getEpochSeconds() - instant.getEpochSeconds(), MathMethods.NANOS_PER_SECOND, other.getNanosecondsOfSecond() - instant.getNanosecondsOfSecond(), unit.getNanoseconds());
        } catch (ArithmeticException unused) {
            return instant.compareTo(other) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public static final int daysUntil(Instant instant, Instant other, TimeZoneJvm2 timeZone) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return math3.clampToInt(Instant5.until(instant, other, DateTimeUnit.INSTANCE.getDAY(), timeZone));
    }

    public static final Instant plus(Instant instant, int i, DateTimeUnit.TimeBased unit) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return Instant5.plus(instant, i, unit);
    }
}
