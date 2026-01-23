package com.truelayer.payments.analytics.store;

import com.truelayer.payments.analytics.configuration.AnalyticsNetworkConfiguration;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AnalyticsStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH¦@¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/analytics/store/AnalyticsStore;", "", "add", "", "analyticsEvent", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "getFirst", "Lkotlinx/coroutines/flow/Flow;", "remove", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsStore {
    Object add(AnalyticsEvent analyticsEvent, AnalyticsNetworkConfiguration analyticsNetworkConfiguration, Continuation<? super Unit> continuation);

    Object close(Continuation<? super Unit> continuation);

    Object getAll(Continuation<? super List<AnalyticsEvent>> continuation);

    Flow<AnalyticsEvent> getFirst();

    Object remove(AnalyticsEvent analyticsEvent, Continuation<? super Unit> continuation);
}
