package com.robinhood.analytics.api;

import com.robinhood.rosetta.eventlogging.LoggingEventBatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderAnalyticsApi.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"wrapped", "Lcom/robinhood/analytics/api/AnalyticsApi;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "lib-analytics_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.api.TraderAnalyticsApiKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class TraderAnalyticsApi2 {
    public static final AnalyticsApi<LoggingEventBatch> wrapped(final TraderAnalyticsApi traderAnalyticsApi) {
        Intrinsics.checkNotNullParameter(traderAnalyticsApi, "<this>");
        return new AnalyticsApi<LoggingEventBatch>() { // from class: com.robinhood.analytics.api.TraderAnalyticsApiKt.wrapped.1
            @Override // com.robinhood.analytics.api.AnalyticsApi
            public /* bridge */ /* synthetic */ Object track(LoggingEventBatch loggingEventBatch, Continuation continuation) {
                return track2(loggingEventBatch, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: track, reason: avoid collision after fix types in other method */
            public Object track2(LoggingEventBatch loggingEventBatch, Continuation<? super Unit> continuation) {
                Object objTrack = traderAnalyticsApi.track(loggingEventBatch, continuation);
                return objTrack == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTrack : Unit.INSTANCE;
            }
        };
    }
}
