package com.robinhood.analytics.dao;

import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PerformanceMetricDao.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"spanStatus", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "getSpanStatus", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;)Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "lib-analytics_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.dao.PerformanceMetricDaoKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class PerformanceMetricDao4 {

    /* compiled from: PerformanceMetricDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.dao.PerformanceMetricDaoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerformanceMetricEventData.Status.values().length];
            try {
                iArr[PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceMetricEventData.Status.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PerformanceMetricEventData.Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PerformanceMetricEventData.Status.ABORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceMetricSpanEventData.Status getSpanStatus(PerformanceMetricEventData.Status status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
        }
        if (i == 2) {
            return PerformanceMetricSpanEventData.Status.COMPLETED;
        }
        if (i == 3) {
            return PerformanceMetricSpanEventData.Status.FAILED;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return PerformanceMetricSpanEventData.Status.ABORTED;
    }
}
