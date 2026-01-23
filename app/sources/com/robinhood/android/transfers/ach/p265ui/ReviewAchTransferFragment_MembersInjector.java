package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewAchTransferFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ReviewAchTransferFragment_MembersInjector implements MembersInjector<ReviewAchTransferFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CardManager> cardManager;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ReviewAchTransferFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<CardManager> provider3, Provider<EventLogger> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectEventLogger(ReviewAchTransferFragment reviewAchTransferFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(reviewAchTransferFragment, eventLogger);
    }

    public ReviewAchTransferFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<CardManager> cardManager, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.singletons = singletons;
        this.analytics = analytics;
        this.cardManager = cardManager;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReviewAchTransferFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        BaseReviewAchTransferFragment_MembersInjector.Companion companion2 = BaseReviewAchTransferFragment_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        companion2.injectCardManager(instance, cardManager);
        Companion companion3 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
    }

    /* compiled from: ReviewAchTransferFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "injectEventLogger", "", "instance", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ReviewAchTransferFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<CardManager> cardManager, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new ReviewAchTransferFragment_MembersInjector(singletons, analytics, cardManager, eventLogger);
        }

        @JvmStatic
        public final void injectEventLogger(ReviewAchTransferFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
