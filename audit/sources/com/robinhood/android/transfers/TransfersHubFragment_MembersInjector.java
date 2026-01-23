package com.robinhood.android.transfers;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.transferhub.preferences.TransfersHubMicrogramHeightPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.FloatPreference;
import com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransfersHubFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/TransfersHubFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transfersHubMicrogramHeightPref", "Lcom/robinhood/prefs/FloatPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TransfersHubFragment_MembersInjector implements MembersInjector<TransfersHubFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CancelSummaryBadgeManager> cancelSummaryBadgeManager;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<FloatPreference> transfersHubMicrogramHeightPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<TransfersHubFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<EventLogger> provider3, Provider<CancelSummaryBadgeManager> provider4, Provider<ExperimentsStore> provider5, Provider<FloatPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAnalytics(TransfersHubFragment transfersHubFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(transfersHubFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectCancelSummaryBadgeManager(TransfersHubFragment transfersHubFragment, CancelSummaryBadgeManager cancelSummaryBadgeManager) {
        INSTANCE.injectCancelSummaryBadgeManager(transfersHubFragment, cancelSummaryBadgeManager);
    }

    @JvmStatic
    public static final void injectEventLogger(TransfersHubFragment transfersHubFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(transfersHubFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(TransfersHubFragment transfersHubFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(transfersHubFragment, experimentsStore);
    }

    @JvmStatic
    @TransfersHubMicrogramHeightPref
    public static final void injectTransfersHubMicrogramHeightPref(TransfersHubFragment transfersHubFragment, FloatPreference floatPreference) {
        INSTANCE.injectTransfersHubMicrogramHeightPref(transfersHubFragment, floatPreference);
    }

    public TransfersHubFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<CancelSummaryBadgeManager> cancelSummaryBadgeManager, Provider<ExperimentsStore> experimentsStore, Provider<FloatPreference> transfersHubMicrogramHeightPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transfersHubMicrogramHeightPref, "transfersHubMicrogramHeightPref");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.cancelSummaryBadgeManager = cancelSummaryBadgeManager;
        this.experimentsStore = experimentsStore;
        this.transfersHubMicrogramHeightPref = transfersHubMicrogramHeightPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TransfersHubFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        CancelSummaryBadgeManager cancelSummaryBadgeManager = this.cancelSummaryBadgeManager.get();
        Intrinsics.checkNotNullExpressionValue(cancelSummaryBadgeManager, "get(...)");
        companion2.injectCancelSummaryBadgeManager(instance, cancelSummaryBadgeManager);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        FloatPreference floatPreference = this.transfersHubMicrogramHeightPref.get();
        Intrinsics.checkNotNullExpressionValue(floatPreference, "get(...)");
        companion2.injectTransfersHubMicrogramHeightPref(instance, floatPreference);
    }

    /* compiled from: TransfersHubFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/TransfersHubFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transfersHubMicrogramHeightPref", "Lcom/robinhood/prefs/FloatPreference;", "injectAnalytics", "", "instance", "injectEventLogger", "injectCancelSummaryBadgeManager", "injectExperimentsStore", "injectTransfersHubMicrogramHeightPref", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TransfersHubFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<CancelSummaryBadgeManager> cancelSummaryBadgeManager, Provider<ExperimentsStore> experimentsStore, Provider<FloatPreference> transfersHubMicrogramHeightPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(transfersHubMicrogramHeightPref, "transfersHubMicrogramHeightPref");
            return new TransfersHubFragment_MembersInjector(singletons, analytics, eventLogger, cancelSummaryBadgeManager, experimentsStore, transfersHubMicrogramHeightPref);
        }

        @JvmStatic
        public final void injectAnalytics(TransfersHubFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(TransfersHubFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectCancelSummaryBadgeManager(TransfersHubFragment instance, CancelSummaryBadgeManager cancelSummaryBadgeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
            instance.setCancelSummaryBadgeManager(cancelSummaryBadgeManager);
        }

        @JvmStatic
        public final void injectExperimentsStore(TransfersHubFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        @TransfersHubMicrogramHeightPref
        public final void injectTransfersHubMicrogramHeightPref(TransfersHubFragment instance, FloatPreference transfersHubMicrogramHeightPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transfersHubMicrogramHeightPref, "transfersHubMicrogramHeightPref");
            instance.setTransfersHubMicrogramHeightPref(transfersHubMicrogramHeightPref);
        }
    }
}
