package com.robinhood.android.referral.rewardoffers.offerDetails;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.referral.rewardoffers.offerDetails.eventlogging.RewardOfferDetailsEventLoggingDelegate;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RewardOfferDetailsV1Fragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "singletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "genericComposeSingletons", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/referral/rewardoffers/offerDetails/eventlogging/RewardOfferDetailsEventLoggingDelegate;", "loggingDelegate", "Lcom/robinhood/userleap/UserLeapManager;", "userLeapManager", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "instance", "", "injectMembers", "(Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment;)V", "Ljavax/inject/Provider;", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RewardOfferDetailsV1Fragment_MembersInjector implements MembersInjector<RewardOfferDetailsV1Fragment> {
    private final Provider<Clock> clock;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<RewardOfferDetailsEventLoggingDelegate> loggingDelegate;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RewardOfferDetailsV1Fragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<Clock> provider3, Provider<RewardOfferDetailsEventLoggingDelegate> provider4, Provider<SurveyManager3> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    @ElapsedRealtime
    public static final void injectClock(RewardOfferDetailsV1Fragment rewardOfferDetailsV1Fragment, Clock clock) {
        INSTANCE.injectClock(rewardOfferDetailsV1Fragment, clock);
    }

    @JvmStatic
    public static final void injectLoggingDelegate(RewardOfferDetailsV1Fragment rewardOfferDetailsV1Fragment, RewardOfferDetailsEventLoggingDelegate rewardOfferDetailsEventLoggingDelegate) {
        INSTANCE.injectLoggingDelegate(rewardOfferDetailsV1Fragment, rewardOfferDetailsEventLoggingDelegate);
    }

    @JvmStatic
    public static final void injectUserLeapManager(RewardOfferDetailsV1Fragment rewardOfferDetailsV1Fragment, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(rewardOfferDetailsV1Fragment, surveyManager3);
    }

    public RewardOfferDetailsV1Fragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Clock> clock, Provider<RewardOfferDetailsEventLoggingDelegate> loggingDelegate, Provider<SurveyManager3> userLeapManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(loggingDelegate, "loggingDelegate");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.clock = clock;
        this.loggingDelegate = loggingDelegate;
        this.userLeapManager = userLeapManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardOfferDetailsV1Fragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        companion3.injectClock(instance, clock);
        RewardOfferDetailsEventLoggingDelegate rewardOfferDetailsEventLoggingDelegate = this.loggingDelegate.get();
        Intrinsics.checkNotNullExpressionValue(rewardOfferDetailsEventLoggingDelegate, "get(...)");
        companion3.injectLoggingDelegate(instance, rewardOfferDetailsEventLoggingDelegate);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion3.injectUserLeapManager(instance, surveyManager3);
    }

    /* compiled from: RewardOfferDetailsV1Fragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment_MembersInjector$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "singletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "genericComposeSingletons", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/referral/rewardoffers/offerDetails/eventlogging/RewardOfferDetailsEventLoggingDelegate;", "loggingDelegate", "Lcom/robinhood/userleap/UserLeapManager;", "userLeapManager", "Ldagger/MembersInjector;", "Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;", "instance", "", "injectClock", "(Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment;Lj$/time/Clock;)V", "injectLoggingDelegate", "(Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment;Lcom/robinhood/android/referral/rewardoffers/offerDetails/eventlogging/RewardOfferDetailsEventLoggingDelegate;)V", "injectUserLeapManager", "(Lcom/robinhood/android/referral/rewardoffers/offerDetails/RewardOfferDetailsV1Fragment;Lcom/robinhood/userleap/UserLeapManager;)V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RewardOfferDetailsV1Fragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Clock> clock, Provider<RewardOfferDetailsEventLoggingDelegate> loggingDelegate, Provider<SurveyManager3> userLeapManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(loggingDelegate, "loggingDelegate");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new RewardOfferDetailsV1Fragment_MembersInjector(singletons, genericComposeSingletons, clock, loggingDelegate, userLeapManager);
        }

        @JvmStatic
        @ElapsedRealtime
        public final void injectClock(RewardOfferDetailsV1Fragment instance, Clock clock) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clock, "clock");
            instance.setClock(clock);
        }

        @JvmStatic
        public final void injectLoggingDelegate(RewardOfferDetailsV1Fragment instance, RewardOfferDetailsEventLoggingDelegate loggingDelegate) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(loggingDelegate, "loggingDelegate");
            instance.setLoggingDelegate(loggingDelegate);
        }

        @JvmStatic
        public final void injectUserLeapManager(RewardOfferDetailsV1Fragment instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }
    }
}
