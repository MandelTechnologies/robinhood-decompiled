package kotlin.time;

import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

/* compiled from: longSaturatedMath.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\n\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m3636d2 = {"", "value", "Lkotlin/time/Duration;", "infinityOfSign", "(J)J", "valueNs", "origin", "Lkotlin/time/DurationUnit;", Instrument.TYPE_UNIT, "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "origin1", "origin2", "saturatingOriginsDiff", "value1", "value2", "saturatingFiniteDiff", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlin.time.LongSaturatedMathKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class longSaturatedMath {
    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.INSTANCE.m28766getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m28765getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long j, long j2, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return Duration.m28762unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    public static final long saturatingOriginsDiff(long j, long j2, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return Duration.INSTANCE.m28767getZEROUwyO8pc();
            }
            return Duration.m28762unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return infinityOfSign(j);
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, DurationUnitJvm durationUnitJvm) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            DurationUnitJvm durationUnitJvm2 = DurationUnitJvm.MILLISECONDS;
            if (durationUnitJvm.compareTo(durationUnitJvm2) < 0) {
                long jConvertDurationUnit = DurationUnitJvm2.convertDurationUnit(1L, durationUnitJvm2, durationUnitJvm);
                long j4 = (j / jConvertDurationUnit) - (j2 / jConvertDurationUnit);
                long j5 = (j % jConvertDurationUnit) - (j2 % jConvertDurationUnit);
                Duration.Companion companion = Duration.INSTANCE;
                return Duration.m28755plusLRDsOJo(Duration3.toDuration(j4, durationUnitJvm2), Duration3.toDuration(j5, durationUnitJvm));
            }
            return Duration.m28762unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        return Duration3.toDuration(j3, durationUnitJvm);
    }
}
