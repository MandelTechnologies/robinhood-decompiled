package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsWelcomeFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "merchantRewardWelcomePref", "Lcom/robinhood/prefs/BooleanPreference;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MerchantRewardsWelcomeFragment_MembersInjector implements MembersInjector<MerchantRewardsWelcomeFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<Markwon> markwon;
    private final Provider<BooleanPreference> merchantRewardWelcomePref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<MerchantRewardsWelcomeFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BooleanPreference> provider2, Provider<EventLogger> provider3, Provider<Markwon> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectEventLogger(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(merchantRewardsWelcomeFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectMarkwon(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(merchantRewardsWelcomeFragment, markwon);
    }

    @JvmStatic
    @MerchantRewardWelcomePref
    public static final void injectMerchantRewardWelcomePref(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectMerchantRewardWelcomePref(merchantRewardsWelcomeFragment, booleanPreference);
    }

    public MerchantRewardsWelcomeFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BooleanPreference> merchantRewardWelcomePref, Provider<EventLogger> eventLogger, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(merchantRewardWelcomePref, "merchantRewardWelcomePref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.singletons = singletons;
        this.merchantRewardWelcomePref = merchantRewardWelcomePref;
        this.eventLogger = eventLogger;
        this.markwon = markwon;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MerchantRewardsWelcomeFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        BooleanPreference booleanPreference = this.merchantRewardWelcomePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectMerchantRewardWelcomePref(instance, booleanPreference);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
    }

    /* compiled from: MerchantRewardsWelcomeFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "merchantRewardWelcomePref", "Lcom/robinhood/prefs/BooleanPreference;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "injectMerchantRewardWelcomePref", "", "instance", "injectEventLogger", "injectMarkwon", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<MerchantRewardsWelcomeFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BooleanPreference> merchantRewardWelcomePref, Provider<EventLogger> eventLogger, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(merchantRewardWelcomePref, "merchantRewardWelcomePref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new MerchantRewardsWelcomeFragment_MembersInjector(singletons, merchantRewardWelcomePref, eventLogger, markwon);
        }

        @JvmStatic
        @MerchantRewardWelcomePref
        public final void injectMerchantRewardWelcomePref(MerchantRewardsWelcomeFragment instance, BooleanPreference merchantRewardWelcomePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(merchantRewardWelcomePref, "merchantRewardWelcomePref");
            instance.setMerchantRewardWelcomePref(merchantRewardWelcomePref);
        }

        @JvmStatic
        public final void injectEventLogger(MerchantRewardsWelcomeFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectMarkwon(MerchantRewardsWelcomeFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }
    }
}
