package com.truelayer.payments.analytics;

import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TrueLayerAnalyticsImpl.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$filteredFlow$1", m3645f = "TrueLayerAnalyticsImpl.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$filteredFlow$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TrueLayerAnalyticsImpl3 extends ContinuationImpl7 implements Function2<AnalyticsEvents, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    TrueLayerAnalyticsImpl3(Continuation<? super TrueLayerAnalyticsImpl3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrueLayerAnalyticsImpl3 trueLayerAnalyticsImpl3 = new TrueLayerAnalyticsImpl3(continuation);
        trueLayerAnalyticsImpl3.L$0 = obj;
        return trueLayerAnalyticsImpl3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AnalyticsEvents analyticsEvents, Continuation<? super Unit> continuation) {
        return ((TrueLayerAnalyticsImpl3) create(analyticsEvents, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        TrueLayerAnalytics.AnalyticsContext analyticsContext;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AnalyticsEvents analyticsEvents = (AnalyticsEvents) this.L$0;
        boolean z = analyticsEvents instanceof AnalyticsEvents.SDKStarted;
        if (z ? true : analyticsEvents instanceof AnalyticsEvents.ProviderSelectionLoaded) {
            if (z) {
                TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
                TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
                if (analyticsContext2 != null) {
                    analyticsContext2.setAmountInMinor(null);
                }
                TrueLayerAnalytics.AnalyticsContext analyticsContext3 = companion.getAnalyticsContext();
                if (analyticsContext3 != null) {
                    analyticsContext3.setProviderCountryCode(null);
                }
            }
            if ((analyticsEvents instanceof AnalyticsEvents.ProviderSelectionLoaded) && (analyticsContext = TrueLayerAnalytics.INSTANCE.getAnalyticsContext()) != null) {
                analyticsContext.setProviderCountryCode(((AnalyticsEvents.ProviderSelectionLoaded) analyticsEvents).getCountryCode());
            }
            TrueLayerAnalytics.AnalyticsContext analyticsContext4 = TrueLayerAnalytics.INSTANCE.getAnalyticsContext();
            if (analyticsContext4 != null) {
                analyticsContext4.setProviderId(null);
            }
        } else if (analyticsEvents instanceof AnalyticsEvents.ProviderSelected) {
            TrueLayerAnalytics.Companion companion2 = TrueLayerAnalytics.INSTANCE;
            TrueLayerAnalytics.AnalyticsContext analyticsContext5 = companion2.getAnalyticsContext();
            if (analyticsContext5 != null) {
                analyticsContext5.setProviderId(analyticsEvents.getProviderId());
            }
            TrueLayerAnalytics.AnalyticsContext analyticsContext6 = companion2.getAnalyticsContext();
            if (analyticsContext6 != null) {
                analyticsContext6.setProviderCountryCode(((AnalyticsEvents.ProviderSelected) analyticsEvents).getProviderCountryCode());
            }
        }
        return Unit.INSTANCE;
    }
}
