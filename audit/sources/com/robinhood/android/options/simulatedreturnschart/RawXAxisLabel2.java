package com.robinhood.android.options.simulatedreturnschart;

import com.plaid.internal.EnumC7081g;
import io.jsonwebtoken.Claims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZoneJvm2;
import kotlinx.datetime.TimeZoneKt;

/* compiled from: RawXAxisLabel.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0013"}, m3636d2 = {"getRawXAxisLabels", "", "Lcom/robinhood/android/options/simulatedreturnschart/RawXAxisLabel;", "now", "Lkotlinx/datetime/Instant;", Claims.EXPIRATION, "numGridlines", "", "bounds", "Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "timezone", "Lkotlinx/datetime/TimeZone;", "isUkOrApac", "", "getMiddleValues", "start", "end", "getMonthTimestamp", "monthNumber", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturnschart.RawXAxisLabelKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RawXAxisLabel2 {
    public static final List<RawXAxisLabel> getRawXAxisLabels(Instant now, Instant exp, int i, Bounds bounds, TimeZoneJvm2 timezone, boolean z) {
        ArrayList arrayList;
        LocalDateTime localDateTime;
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(exp, "exp");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.SECONDS;
        Instant instantM28851minusLRDsOJo = exp.m28851minusLRDsOJo(Duration3.toDuration(1, durationUnitJvm));
        LocalDateTime localDateTime2 = TimeZoneKt.toLocalDateTime(now, timezone);
        long jM28850minus5sfh64U = bounds.getMaxX().m28850minus5sfh64U(bounds.getMinX());
        LocalDateTime localDateTime3 = TimeZoneKt.toLocalDateTime(instantM28851minusLRDsOJo, timezone);
        int year = (localDateTime2.getYear() * 12) + localDateTime2.getMonthNumber();
        int year2 = ((localDateTime3.getYear() * 12) + localDateTime3.getMonthNumber()) - 1;
        DurationUnitJvm durationUnitJvm2 = DurationUnitJvm.DAYS;
        if (Duration.m28727compareToLRDsOJo(jM28850minus5sfh64U, Duration3.toDuration(1, durationUnitJvm2)) < 0) {
            Instant instantM28851minusLRDsOJo2 = now.m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getMinute(), DurationUnitJvm.MINUTES)).m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getSecond(), durationUnitJvm)).m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getNanosecond(), DurationUnitJvm.NANOSECONDS));
            DurationUnitJvm durationUnitJvm3 = DurationUnitJvm.HOURS;
            Instant instantM28852plusLRDsOJo = instantM28851minusLRDsOJo2.m28852plusLRDsOJo(Duration3.toDuration(1, durationUnitJvm3));
            List<Integer> middleValues = getMiddleValues(0, (int) Math.floor(Duration.m28758toDoubleimpl(instantM28851minusLRDsOJo.m28850minus5sfh64U(instantM28852plusLRDsOJo), durationUnitJvm3)), i);
            ArrayList<Instant> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(middleValues, 10));
            Iterator<T> it = middleValues.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Duration.Companion companion2 = Duration.INSTANCE;
                arrayList2.add(instantM28852plusLRDsOJo.m28852plusLRDsOJo(Duration3.toDuration(iIntValue, DurationUnitJvm.HOURS)));
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (Instant instant : arrayList2) {
                arrayList.add(new RawXAxisLabel(instant, DateFormat.getTimeString(instant, timezone, z)));
            }
        } else if (Duration.m28727compareToLRDsOJo(jM28850minus5sfh64U, Duration3.toDuration(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, durationUnitJvm2)) >= 0 || year2 - year >= i) {
            List<Integer> middleValues2 = getMiddleValues(year, year2, i);
            ArrayList<Instant> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(middleValues2, 10));
            Iterator<T> it2 = middleValues2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(getMonthTimestamp(((Number) it2.next()).intValue(), timezone));
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (Instant instant2 : arrayList3) {
                arrayList.add(new RawXAxisLabel(instant2, DateFormat.getMonthString(instant2, timezone)));
            }
        } else {
            Instant instantM28852plusLRDsOJo2 = now.m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getHour(), DurationUnitJvm.HOURS)).m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getMinute(), DurationUnitJvm.MINUTES)).m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getSecond(), durationUnitJvm)).m28851minusLRDsOJo(Duration3.toDuration(localDateTime2.getNanosecond(), DurationUnitJvm.NANOSECONDS)).m28852plusLRDsOJo(Duration3.toDuration(1, durationUnitJvm2));
            int iFloor = (int) Math.floor(Duration.m28758toDoubleimpl(instantM28851minusLRDsOJo.m28850minus5sfh64U(instantM28852plusLRDsOJo2), durationUnitJvm2));
            boolean z2 = false;
            List<Integer> middleValues3 = getMiddleValues(0, iFloor, i);
            ArrayList<Instant> arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(middleValues3, 10));
            Iterator<T> it3 = middleValues3.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                Duration.Companion companion3 = Duration.INSTANCE;
                arrayList4.add(instantM28852plusLRDsOJo2.m28852plusLRDsOJo(Duration3.toDuration(iIntValue2, DurationUnitJvm.DAYS)));
            }
            Instant instant3 = (Instant) CollectionsKt.lastOrNull((List) arrayList4);
            if (instant3 != null && (localDateTime = TimeZoneKt.toLocalDateTime(instant3, timezone)) != null && localDateTime.getYear() == localDateTime2.getYear()) {
                z2 = true;
            }
            boolean z3 = !z2;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            for (Instant instant4 : arrayList4) {
                arrayList5.add(new RawXAxisLabel(instant4, DateFormat.getDateString(instant4, timezone, z3, z)));
            }
            arrayList = arrayList5;
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(new RawXAxisLabel(exp, "EXP")));
    }

    private static final List<Integer> getMiddleValues(int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 <= i3) {
            return CollectionsKt.toList(new PrimitiveRanges2(i, i2));
        }
        List<Integer> list = CollectionsKt.toList(RangesKt.reversed(RangesKt.step(RangesKt.downTo(i2, i), Math.max((int) Math.ceil(i4 / (i3 + 1.0d)), 1))));
        if (list.size() <= i3 + 1 || list.get(0).intValue() != i) {
            return list.size() > i3 ? CollectionsKt.dropLast(list, 1) : list;
        }
        return CollectionsKt.dropLast(CollectionsKt.drop(list, 1), 1);
    }

    private static final Instant getMonthTimestamp(int i, TimeZoneJvm2 timeZoneJvm2) {
        return TimeZoneKt.toInstant(new LocalDateTime(i / 12, (i % 12) + 1, 1, 0, 0, 0, 0), timeZoneJvm2);
    }
}
