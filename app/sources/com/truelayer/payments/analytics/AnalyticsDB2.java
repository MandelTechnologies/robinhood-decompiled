package com.truelayer.payments.analytics;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AnalyticsDB.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/AnalyticsEventDao;", "", AnalyticsStrings.BUTTON_LIST_DELETE, "", "analyticsEvent", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "getAll", "", "getFirst", "Lkotlinx/coroutines/flow/Flow;", "insert", "trimDB", "timeInMilliseconds", "", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.analytics.AnalyticsEventDao, reason: use source file name */
/* loaded from: classes6.dex */
public interface AnalyticsDB2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void delete(AnalyticsEvent analyticsEvent);

    List<AnalyticsEvent> getAll();

    Flow<AnalyticsEvent> getFirst();

    void insert(AnalyticsEvent analyticsEvent);

    void trimDB(long timeInMilliseconds);

    /* compiled from: AnalyticsDB.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/AnalyticsEventDao$Companion;", "", "()V", "MAX_DAYS", "", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.analytics.AnalyticsEventDao$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int MAX_DAYS = 7;

        private Companion() {
        }
    }

    /* compiled from: AnalyticsDB.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.analytics.AnalyticsEventDao$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ void trimDB$default(AnalyticsDB2 analyticsDB2, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trimDB");
            }
            if ((i & 1) != 0) {
                j = System.currentTimeMillis() - 604800000;
            }
            analyticsDB2.trimDB(j);
        }
    }
}
