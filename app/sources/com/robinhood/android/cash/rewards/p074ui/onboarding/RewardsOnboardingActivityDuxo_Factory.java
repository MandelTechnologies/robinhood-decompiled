package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingActivityDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo;", "sweepStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RewardsOnboardingActivityDuxo_Factory implements Factory<RewardsOnboardingActivityDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Markwon> markwon;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<StaticContentStore> staticContentStore;
    private final Provider<SweepsStatusStore> sweepStatusStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RewardsOnboardingActivityDuxo_Factory create(Provider<SweepsStatusStore> provider, Provider<StaticContentStore> provider2, Provider<Markwon> provider3, Provider<DispatcherProvider> provider4, Provider<RxFactory> provider5, Provider<RxGlobalErrorHandler> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RewardsOnboardingActivityDuxo newInstance(SweepsStatusStore sweepsStatusStore, StaticContentStore staticContentStore, Markwon markwon) {
        return INSTANCE.newInstance(sweepsStatusStore, staticContentStore, markwon);
    }

    public RewardsOnboardingActivityDuxo_Factory(Provider<SweepsStatusStore> sweepStatusStore, Provider<StaticContentStore> staticContentStore, Provider<Markwon> markwon, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(sweepStatusStore, "sweepStatusStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.sweepStatusStore = sweepStatusStore;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RewardsOnboardingActivityDuxo get() {
        Companion companion = INSTANCE;
        SweepsStatusStore sweepsStatusStore = this.sweepStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsStatusStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxoNewInstance = companion.newInstance(sweepsStatusStore, staticContentStore, markwon);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rewardsOnboardingActivityDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rewardsOnboardingActivityDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rewardsOnboardingActivityDuxoNewInstance, rxGlobalErrorHandler);
        return rewardsOnboardingActivityDuxoNewInstance;
    }

    /* compiled from: RewardsOnboardingActivityDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo_Factory;", "sweepStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RewardsOnboardingActivityDuxo_Factory create(Provider<SweepsStatusStore> sweepStatusStore, Provider<StaticContentStore> staticContentStore, Provider<Markwon> markwon, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(sweepStatusStore, "sweepStatusStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RewardsOnboardingActivityDuxo_Factory(sweepStatusStore, staticContentStore, markwon, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RewardsOnboardingActivityDuxo newInstance(SweepsStatusStore sweepStatusStore, StaticContentStore staticContentStore, Markwon markwon) {
            Intrinsics.checkNotNullParameter(sweepStatusStore, "sweepStatusStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new RewardsOnboardingActivityDuxo(sweepStatusStore, staticContentStore, markwon);
        }
    }
}
