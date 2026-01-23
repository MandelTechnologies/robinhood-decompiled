package com.robinhood.android.gold.downgrade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.margin.api.InterestRatesApi;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.GoldValuePropsStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDowngradeLoadingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo;", "marginSubscriptionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "interestRatesApi", "Lcom/robinhood/android/lib/margin/api/InterestRatesApi;", "goldValuePropsStore", "Lcom/robinhood/librobinhood/data/store/GoldValuePropsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldDowngradeLoadingDuxo_Factory implements Factory<GoldDowngradeLoadingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<GoldValuePropsStore> goldValuePropsStore;
    private final Provider<InterestRatesApi> interestRatesApi;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<StaticContentStore> staticContentStore;
    private final Provider<SweepsInterestStore> sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldDowngradeLoadingDuxo_Factory create(Provider<MarginSubscriptionStore> provider, Provider<StaticContentStore> provider2, Provider<InterestRatesApi> provider3, Provider<GoldValuePropsStore> provider4, Provider<SweepsInterestStore> provider5, Provider<DispatcherProvider> provider6, Provider<RxFactory> provider7, Provider<RxGlobalErrorHandler> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final GoldDowngradeLoadingDuxo newInstance(MarginSubscriptionStore marginSubscriptionStore, StaticContentStore staticContentStore, InterestRatesApi interestRatesApi, GoldValuePropsStore goldValuePropsStore, SweepsInterestStore sweepsInterestStore) {
        return INSTANCE.newInstance(marginSubscriptionStore, staticContentStore, interestRatesApi, goldValuePropsStore, sweepsInterestStore);
    }

    public GoldDowngradeLoadingDuxo_Factory(Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StaticContentStore> staticContentStore, Provider<InterestRatesApi> interestRatesApi, Provider<GoldValuePropsStore> goldValuePropsStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(interestRatesApi, "interestRatesApi");
        Intrinsics.checkNotNullParameter(goldValuePropsStore, "goldValuePropsStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.staticContentStore = staticContentStore;
        this.interestRatesApi = interestRatesApi;
        this.goldValuePropsStore = goldValuePropsStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public GoldDowngradeLoadingDuxo get() {
        Companion companion = INSTANCE;
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        InterestRatesApi interestRatesApi = this.interestRatesApi.get();
        Intrinsics.checkNotNullExpressionValue(interestRatesApi, "get(...)");
        GoldValuePropsStore goldValuePropsStore = this.goldValuePropsStore.get();
        Intrinsics.checkNotNullExpressionValue(goldValuePropsStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        GoldDowngradeLoadingDuxo goldDowngradeLoadingDuxoNewInstance = companion.newInstance(marginSubscriptionStore, staticContentStore, interestRatesApi, goldValuePropsStore, sweepsInterestStore);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(goldDowngradeLoadingDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(goldDowngradeLoadingDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(goldDowngradeLoadingDuxoNewInstance, rxGlobalErrorHandler);
        return goldDowngradeLoadingDuxoNewInstance;
    }

    /* compiled from: GoldDowngradeLoadingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo_Factory;", "marginSubscriptionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "interestRatesApi", "Lcom/robinhood/android/lib/margin/api/InterestRatesApi;", "goldValuePropsStore", "Lcom/robinhood/librobinhood/data/store/GoldValuePropsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo;", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldDowngradeLoadingDuxo_Factory create(Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StaticContentStore> staticContentStore, Provider<InterestRatesApi> interestRatesApi, Provider<GoldValuePropsStore> goldValuePropsStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(interestRatesApi, "interestRatesApi");
            Intrinsics.checkNotNullParameter(goldValuePropsStore, "goldValuePropsStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new GoldDowngradeLoadingDuxo_Factory(marginSubscriptionStore, staticContentStore, interestRatesApi, goldValuePropsStore, sweepsInterestStore, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final GoldDowngradeLoadingDuxo newInstance(MarginSubscriptionStore marginSubscriptionStore, StaticContentStore staticContentStore, InterestRatesApi interestRatesApi, GoldValuePropsStore goldValuePropsStore, SweepsInterestStore sweepsInterestStore) {
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(interestRatesApi, "interestRatesApi");
            Intrinsics.checkNotNullParameter(goldValuePropsStore, "goldValuePropsStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            return new GoldDowngradeLoadingDuxo(marginSubscriptionStore, staticContentStore, interestRatesApi, goldValuePropsStore, sweepsInterestStore);
        }
    }
}
