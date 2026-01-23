package com.robinhood.android.onboarding.p205ui.sdonboarding;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.odyssey.lib.BaseSdActivitySingletons;
import com.robinhood.android.odyssey.lib.BaseSdActivity_MembersInjector;
import com.robinhood.shared.store.user.UserStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdOnboardingActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SdOnboardingActivity_MembersInjector implements MembersInjector<SdOnboardingActivity> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CardManager> cardManager;
    private final Provider<BaseSdActivitySingletons> sdSingletons;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SdOnboardingActivity> create(Provider<BaseActivitySingletons> provider, Provider<BaseSdActivitySingletons> provider2, Provider<UserStore> provider3, Provider<CardManager> provider4, Provider<AnalyticsLogger> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAnalytics(SdOnboardingActivity sdOnboardingActivity, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(sdOnboardingActivity, analyticsLogger);
    }

    @JvmStatic
    public static final void injectCardManager(SdOnboardingActivity sdOnboardingActivity, CardManager cardManager) {
        INSTANCE.injectCardManager(sdOnboardingActivity, cardManager);
    }

    @JvmStatic
    public static final void injectUserStore(SdOnboardingActivity sdOnboardingActivity, UserStore userStore) {
        INSTANCE.injectUserStore(sdOnboardingActivity, userStore);
    }

    public SdOnboardingActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<BaseSdActivitySingletons> sdSingletons, Provider<UserStore> userStore, Provider<CardManager> cardManager, Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(sdSingletons, "sdSingletons");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.singletons = singletons;
        this.sdSingletons = sdSingletons;
        this.userStore = userStore;
        this.cardManager = cardManager;
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SdOnboardingActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        BaseSdActivity_MembersInjector.Companion companion2 = BaseSdActivity_MembersInjector.INSTANCE;
        BaseSdActivitySingletons baseSdActivitySingletons = this.sdSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseSdActivitySingletons, "get(...)");
        companion2.injectSdSingletons(instance, baseSdActivitySingletons);
        Companion companion3 = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion3.injectUserStore(instance, userStore);
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        companion3.injectCardManager(instance, cardManager);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion3.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: SdOnboardingActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/onboarding/ui/sdonboarding/SdOnboardingActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectUserStore", "", "instance", "injectCardManager", "injectAnalytics", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SdOnboardingActivity> create(Provider<BaseActivitySingletons> singletons, Provider<BaseSdActivitySingletons> sdSingletons, Provider<UserStore> userStore, Provider<CardManager> cardManager, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(sdSingletons, "sdSingletons");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new SdOnboardingActivity_MembersInjector(singletons, sdSingletons, userStore, cardManager, analytics);
        }

        @JvmStatic
        public final void injectUserStore(SdOnboardingActivity instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }

        @JvmStatic
        public final void injectCardManager(SdOnboardingActivity instance, CardManager cardManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            instance.setCardManager(cardManager);
        }

        @JvmStatic
        public final void injectAnalytics(SdOnboardingActivity instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
