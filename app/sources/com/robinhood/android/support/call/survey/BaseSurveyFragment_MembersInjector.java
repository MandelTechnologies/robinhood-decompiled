package com.robinhood.android.support.call.survey;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.support.call.PendingSnackbarManager;
import com.robinhood.contentful.StaticContentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSurveyFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/BaseSurveyFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "pendingSnackbarManager", "Lcom/robinhood/android/support/call/PendingSnackbarManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BaseSurveyFragment_MembersInjector implements MembersInjector<BaseSurveyFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<PendingSnackbarManager> pendingSnackbarManager;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<BaseSurveyFragment> create(Provider<BaseFragmentSingletons> provider, Provider<EventLogger> provider2, Provider<StaticContentStore> provider3, Provider<PendingSnackbarManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectEventLogger(BaseSurveyFragment baseSurveyFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(baseSurveyFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectPendingSnackbarManager(BaseSurveyFragment baseSurveyFragment, PendingSnackbarManager pendingSnackbarManager) {
        INSTANCE.injectPendingSnackbarManager(baseSurveyFragment, pendingSnackbarManager);
    }

    @JvmStatic
    public static final void injectStaticContentStore(BaseSurveyFragment baseSurveyFragment, StaticContentStore staticContentStore) {
        INSTANCE.injectStaticContentStore(baseSurveyFragment, staticContentStore);
    }

    public BaseSurveyFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<StaticContentStore> staticContentStore, Provider<PendingSnackbarManager> pendingSnackbarManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(pendingSnackbarManager, "pendingSnackbarManager");
        this.singletons = singletons;
        this.eventLogger = eventLogger;
        this.staticContentStore = staticContentStore;
        this.pendingSnackbarManager = pendingSnackbarManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseSurveyFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        companion2.injectStaticContentStore(instance, staticContentStore);
        PendingSnackbarManager pendingSnackbarManager = this.pendingSnackbarManager.get();
        Intrinsics.checkNotNullExpressionValue(pendingSnackbarManager, "get(...)");
        companion2.injectPendingSnackbarManager(instance, pendingSnackbarManager);
    }

    /* compiled from: BaseSurveyFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/BaseSurveyFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "pendingSnackbarManager", "Lcom/robinhood/android/support/call/PendingSnackbarManager;", "injectEventLogger", "", "instance", "injectStaticContentStore", "injectPendingSnackbarManager", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<BaseSurveyFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<StaticContentStore> staticContentStore, Provider<PendingSnackbarManager> pendingSnackbarManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(pendingSnackbarManager, "pendingSnackbarManager");
            return new BaseSurveyFragment_MembersInjector(singletons, eventLogger, staticContentStore, pendingSnackbarManager);
        }

        @JvmStatic
        public final void injectEventLogger(BaseSurveyFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectStaticContentStore(BaseSurveyFragment instance, StaticContentStore staticContentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            instance.setStaticContentStore(staticContentStore);
        }

        @JvmStatic
        public final void injectPendingSnackbarManager(BaseSurveyFragment instance, PendingSnackbarManager pendingSnackbarManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pendingSnackbarManager, "pendingSnackbarManager");
            instance.setPendingSnackbarManager(pendingSnackbarManager);
        }
    }
}
