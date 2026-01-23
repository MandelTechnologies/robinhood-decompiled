package com.robinhood.android.retirement.onboarding;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpFlowActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RetirementSignUpFlowActivity_MembersInjector implements MembersInjector<RetirementSignUpFlowActivity> {
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<RetirementOnboardingStore> retirementOnboardingStore;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RetirementSignUpFlowActivity> create(Provider<BaseActivitySingletons> provider, Provider<RetirementOnboardingStore> provider2, Provider<SurveyManager3> provider3, Provider<MarginSubscriptionStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectMarginSubscriptionStore(RetirementSignUpFlowActivity retirementSignUpFlowActivity, MarginSubscriptionStore marginSubscriptionStore) {
        INSTANCE.injectMarginSubscriptionStore(retirementSignUpFlowActivity, marginSubscriptionStore);
    }

    @JvmStatic
    public static final void injectRetirementOnboardingStore(RetirementSignUpFlowActivity retirementSignUpFlowActivity, RetirementOnboardingStore retirementOnboardingStore) {
        INSTANCE.injectRetirementOnboardingStore(retirementSignUpFlowActivity, retirementOnboardingStore);
    }

    @JvmStatic
    public static final void injectUserLeapManager(RetirementSignUpFlowActivity retirementSignUpFlowActivity, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(retirementSignUpFlowActivity, surveyManager3);
    }

    public RetirementSignUpFlowActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<RetirementOnboardingStore> retirementOnboardingStore, Provider<SurveyManager3> userLeapManager, Provider<MarginSubscriptionStore> marginSubscriptionStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        this.singletons = singletons;
        this.retirementOnboardingStore = retirementOnboardingStore;
        this.userLeapManager = userLeapManager;
        this.marginSubscriptionStore = marginSubscriptionStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RetirementSignUpFlowActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        RetirementOnboardingStore retirementOnboardingStore = this.retirementOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementOnboardingStore, "get(...)");
        companion2.injectRetirementOnboardingStore(instance, retirementOnboardingStore);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        companion2.injectMarginSubscriptionStore(instance, marginSubscriptionStore);
    }

    /* compiled from: RetirementSignUpFlowActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "injectRetirementOnboardingStore", "", "instance", "injectUserLeapManager", "injectMarginSubscriptionStore", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RetirementSignUpFlowActivity> create(Provider<BaseActivitySingletons> singletons, Provider<RetirementOnboardingStore> retirementOnboardingStore, Provider<SurveyManager3> userLeapManager, Provider<MarginSubscriptionStore> marginSubscriptionStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            return new RetirementSignUpFlowActivity_MembersInjector(singletons, retirementOnboardingStore, userLeapManager, marginSubscriptionStore);
        }

        @JvmStatic
        public final void injectRetirementOnboardingStore(RetirementSignUpFlowActivity instance, RetirementOnboardingStore retirementOnboardingStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
            instance.setRetirementOnboardingStore(retirementOnboardingStore);
        }

        @JvmStatic
        public final void injectUserLeapManager(RetirementSignUpFlowActivity instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }

        @JvmStatic
        public final void injectMarginSubscriptionStore(RetirementSignUpFlowActivity instance, MarginSubscriptionStore marginSubscriptionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            instance.setMarginSubscriptionStore(marginSubscriptionStore);
        }
    }
}
