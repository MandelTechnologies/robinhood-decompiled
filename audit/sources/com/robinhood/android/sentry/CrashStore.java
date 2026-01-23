package com.robinhood.android.sentry;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.sentry.SentryEvent;
import io.sentry.protocol.SentryId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CrashStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fR\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/sentry/CrashStore;", "", "crashes", "Lkotlinx/coroutines/flow/Flow;", "", "Lio/sentry/SentryEvent;", "getCrashes", "()Lkotlinx/coroutines/flow/Flow;", AnalyticsStrings.BUTTON_LIST_DISCARD, "", "eventId", "Lio/sentry/protocol/SentryId;", "(Lio/sentry/protocol/SentryId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface CrashStore {
    Object discard(SentryId sentryId, Continuation<? super Unit> continuation);

    Flow<List<SentryEvent>> getCrashes();
}
