package com.robinhood.android.performancelogger;

import android.os.Parcelable;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: PerformanceMetricTrigger.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;", "Landroid/os/Parcelable;", "performanceMetricName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "getPerformanceMetricName", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "performanceMetricContextualId", "Ljava/util/UUID;", "getPerformanceMetricContextualId", "()Ljava/util/UUID;", "performanceMetricContext", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "getPerformanceMetricContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface PerformanceMetricTrigger extends Parcelable {
    PerformanceMetricEventData.Context getPerformanceMetricContext();

    UUID getPerformanceMetricContextualId();

    PerformanceMetricEventData.Name getPerformanceMetricName();

    /* compiled from: PerformanceMetricTrigger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static UUID getPerformanceMetricContextualId(PerformanceMetricTrigger performanceMetricTrigger) {
            return null;
        }

        public static PerformanceMetricEventData.Context getPerformanceMetricContext(PerformanceMetricTrigger performanceMetricTrigger) {
            return new PerformanceMetricEventData.Context(false, false, false, null, null, null, null, null, null, null, null, null, 4095, null);
        }
    }
}
