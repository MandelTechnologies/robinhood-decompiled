package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackOnboardingFlowDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo;", "merchantOfferStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FlatCashbackOnboardingFlowDuxo_Factory implements Factory<FlatCashbackOnboardingFlowDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MerchantOfferStore> merchantOfferStore;
    private final Provider<RealProductMarketingStore> realProductMarketingStore;
    private final Provider<FlatCashbackOnboardingFlowStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FlatCashbackOnboardingFlowDuxo_Factory create(Provider<MerchantOfferStore> provider, Provider<FlatCashbackOnboardingFlowStateProvider> provider2, Provider<DuxoBundle> provider3, Provider<RealProductMarketingStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final FlatCashbackOnboardingFlowDuxo newInstance(MerchantOfferStore merchantOfferStore, FlatCashbackOnboardingFlowStateProvider flatCashbackOnboardingFlowStateProvider, DuxoBundle duxoBundle, RealProductMarketingStore realProductMarketingStore) {
        return INSTANCE.newInstance(merchantOfferStore, flatCashbackOnboardingFlowStateProvider, duxoBundle, realProductMarketingStore);
    }

    public FlatCashbackOnboardingFlowDuxo_Factory(Provider<MerchantOfferStore> merchantOfferStore, Provider<FlatCashbackOnboardingFlowStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<RealProductMarketingStore> realProductMarketingStore) {
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        this.merchantOfferStore = merchantOfferStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.realProductMarketingStore = realProductMarketingStore;
    }

    @Override // javax.inject.Provider
    public FlatCashbackOnboardingFlowDuxo get() {
        Companion companion = INSTANCE;
        MerchantOfferStore merchantOfferStore = this.merchantOfferStore.get();
        Intrinsics.checkNotNullExpressionValue(merchantOfferStore, "get(...)");
        FlatCashbackOnboardingFlowStateProvider flatCashbackOnboardingFlowStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(flatCashbackOnboardingFlowStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        RealProductMarketingStore realProductMarketingStore = this.realProductMarketingStore.get();
        Intrinsics.checkNotNullExpressionValue(realProductMarketingStore, "get(...)");
        return companion.newInstance(merchantOfferStore, flatCashbackOnboardingFlowStateProvider, duxoBundle, realProductMarketingStore);
    }

    /* compiled from: FlatCashbackOnboardingFlowDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo_Factory;", "merchantOfferStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "newInstance", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FlatCashbackOnboardingFlowDuxo_Factory create(Provider<MerchantOfferStore> merchantOfferStore, Provider<FlatCashbackOnboardingFlowStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<RealProductMarketingStore> realProductMarketingStore) {
            Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
            return new FlatCashbackOnboardingFlowDuxo_Factory(merchantOfferStore, stateProvider, duxoBundle, realProductMarketingStore);
        }

        @JvmStatic
        public final FlatCashbackOnboardingFlowDuxo newInstance(MerchantOfferStore merchantOfferStore, FlatCashbackOnboardingFlowStateProvider stateProvider, DuxoBundle duxoBundle, RealProductMarketingStore realProductMarketingStore) {
            Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
            return new FlatCashbackOnboardingFlowDuxo(merchantOfferStore, stateProvider, duxoBundle, realProductMarketingStore);
        }
    }
}
