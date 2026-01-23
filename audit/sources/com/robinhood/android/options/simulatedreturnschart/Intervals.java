package com.robinhood.android.options.simulatedreturnschart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.Instant;

/* compiled from: Intervals.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"getTimestamps", "", "Lkotlinx/datetime/Instant;", "now", "expiration", "getInterval", "Lkotlin/time/Duration;", "timeToExpiration", "getInterval-LRDsOJo", "(J)J", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturnschart.IntervalsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Intervals {
    public static final List<Instant> getTimestamps(Instant now, Instant expiration) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        long jM28850minus5sfh64U = expiration.m28850minus5sfh64U(now);
        long jM17020getIntervalLRDsOJo = m17020getIntervalLRDsOJo(jM28850minus5sfh64U);
        int iM28729divLRDsOJo = (int) Duration.m28729divLRDsOJo(jM28850minus5sfh64U, jM17020getIntervalLRDsOJo);
        Instant instantM28851minusLRDsOJo = expiration.m28851minusLRDsOJo(Duration.m28757timesUwyO8pc(jM17020getIntervalLRDsOJo, iM28729divLRDsOJo));
        List listDistinct = CollectionsKt.distinct(CollectionsKt.listOf((Object[]) new Instant[]{now, instantM28851minusLRDsOJo}));
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(1, iM28729divLRDsOJo);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
        Iterator<Integer> it = primitiveRanges2.iterator();
        while (it.hasNext()) {
            arrayList.add(instantM28851minusLRDsOJo.m28852plusLRDsOJo(Duration.m28757timesUwyO8pc(jM17020getIntervalLRDsOJo, ((PrimitiveIterators6) it).nextInt())));
        }
        return CollectionsKt.plus((Collection) listDistinct, (Iterable) arrayList);
    }

    /* renamed from: getInterval-LRDsOJo, reason: not valid java name */
    public static final long m17020getIntervalLRDsOJo(long j) {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.MINUTES;
        if (Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(5, durationUnitJvm)) < 0) {
            return Duration3.toDuration(1, DurationUnitJvm.SECONDS);
        }
        if (Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(30, durationUnitJvm)) < 0) {
            return Duration3.toDuration(5, DurationUnitJvm.SECONDS);
        }
        if (Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(90, durationUnitJvm)) < 0) {
            return Duration3.toDuration(15, DurationUnitJvm.SECONDS);
        }
        if (Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(360, durationUnitJvm)) < 0) {
            return Duration3.toDuration(1, durationUnitJvm);
        }
        DurationUnitJvm durationUnitJvm2 = DurationUnitJvm.HOURS;
        if (Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(24, durationUnitJvm2)) < 0) {
            return Duration3.toDuration(5, durationUnitJvm);
        }
        DurationUnitJvm durationUnitJvm3 = DurationUnitJvm.DAYS;
        return Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(3, durationUnitJvm3)) < 0 ? Duration3.toDuration(15, durationUnitJvm) : Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(14, durationUnitJvm3)) < 0 ? Duration3.toDuration(1, durationUnitJvm2) : Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(42, durationUnitJvm3)) < 0 ? Duration3.toDuration(3, durationUnitJvm2) : Duration.m28727compareToLRDsOJo(j, Duration3.toDuration(365, durationUnitJvm3)) < 0 ? Duration3.toDuration(1, durationUnitJvm3) : Duration3.toDuration(7, durationUnitJvm3);
    }
}
