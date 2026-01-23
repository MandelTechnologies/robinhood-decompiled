package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.librobinhood.data.store.MerchantRewardUserStateStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: MerchantRewardsOverviewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¡\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantRewardUserStateStore;", "merchantRewardUserStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralEligibilityStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MerchantRewardsOverviewDuxo_Factory implements Factory<MerchantRewardsOverviewDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MerchantOfferStore> merchantOfferStore;
    private final Provider<MerchantRewardUserStateStore> merchantRewardUserStateStore;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MerchantRewardsOverviewDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<MerchantOfferStore> provider2, Provider<MerchantRewardUserStateStore> provider3, Provider<RhyAccountStore> provider4, Provider<MinervaAccountStore> provider5, Provider<RhyReferralEligibilityStore> provider6, Provider<SavedStateHandle> provider7, Provider<Clock> provider8, Provider<DispatcherProvider> provider9, Provider<RxFactory> provider10, Provider<RxGlobalErrorHandler> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final MerchantRewardsOverviewDuxo newInstance(ExperimentsStore experimentsStore, MerchantOfferStore merchantOfferStore, MerchantRewardUserStateStore merchantRewardUserStateStore, RhyAccountStore rhyAccountStore, MinervaAccountStore minervaAccountStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, SavedStateHandle savedStateHandle, Clock clock) {
        return INSTANCE.newInstance(experimentsStore, merchantOfferStore, merchantRewardUserStateStore, rhyAccountStore, minervaAccountStore, rhyReferralEligibilityStore, savedStateHandle, clock);
    }

    public MerchantRewardsOverviewDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<MerchantOfferStore> merchantOfferStore, Provider<MerchantRewardUserStateStore> merchantRewardUserStateStore, Provider<RhyAccountStore> rhyAccountStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(merchantRewardUserStateStore, "merchantRewardUserStateStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.experimentsStore = experimentsStore;
        this.merchantOfferStore = merchantOfferStore;
        this.merchantRewardUserStateStore = merchantRewardUserStateStore;
        this.rhyAccountStore = rhyAccountStore;
        this.minervaAccountStore = minervaAccountStore;
        this.rhyReferralEligibilityStore = rhyReferralEligibilityStore;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public MerchantRewardsOverviewDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        MerchantOfferStore merchantOfferStore = this.merchantOfferStore.get();
        Intrinsics.checkNotNullExpressionValue(merchantOfferStore, "get(...)");
        MerchantRewardUserStateStore merchantRewardUserStateStore = this.merchantRewardUserStateStore.get();
        Intrinsics.checkNotNullExpressionValue(merchantRewardUserStateStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        RhyReferralEligibilityStore rhyReferralEligibilityStore = this.rhyReferralEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralEligibilityStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        MerchantRewardsOverviewDuxo merchantRewardsOverviewDuxoNewInstance = companion.newInstance(experimentsStore, merchantOfferStore, merchantRewardUserStateStore, rhyAccountStore, minervaAccountStore, rhyReferralEligibilityStore, savedStateHandle, clock);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(merchantRewardsOverviewDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(merchantRewardsOverviewDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(merchantRewardsOverviewDuxoNewInstance, rxGlobalErrorHandler);
        return merchantRewardsOverviewDuxoNewInstance;
    }

    /* compiled from: MerchantRewardsOverviewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J©\u0001\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJO\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantRewardUserStateStore;", "merchantRewardUserStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralEligibilityStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo_Factory;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/librobinhood/data/store/MerchantRewardUserStateStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;)Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MerchantRewardsOverviewDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<MerchantOfferStore> merchantOfferStore, Provider<MerchantRewardUserStateStore> merchantRewardUserStateStore, Provider<RhyAccountStore> rhyAccountStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
            Intrinsics.checkNotNullParameter(merchantRewardUserStateStore, "merchantRewardUserStateStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new MerchantRewardsOverviewDuxo_Factory(experimentsStore, merchantOfferStore, merchantRewardUserStateStore, rhyAccountStore, minervaAccountStore, rhyReferralEligibilityStore, savedStateHandle, clock, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final MerchantRewardsOverviewDuxo newInstance(ExperimentsStore experimentsStore, MerchantOfferStore merchantOfferStore, MerchantRewardUserStateStore merchantRewardUserStateStore, RhyAccountStore rhyAccountStore, MinervaAccountStore minervaAccountStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, SavedStateHandle savedStateHandle, Clock clock) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
            Intrinsics.checkNotNullParameter(merchantRewardUserStateStore, "merchantRewardUserStateStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new MerchantRewardsOverviewDuxo(experimentsStore, merchantOfferStore, merchantRewardUserStateStore, rhyAccountStore, minervaAccountStore, rhyReferralEligibilityStore, savedStateHandle, clock);
        }
    }
}
