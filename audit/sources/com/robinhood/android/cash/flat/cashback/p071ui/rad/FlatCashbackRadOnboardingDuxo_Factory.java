package com.robinhood.android.cash.flat.cashback.p071ui.rad;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackRadOnboardingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo;", "realProductMarketingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FlatCashbackRadOnboardingDuxo_Factory implements Factory<FlatCashbackRadOnboardingDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RealProductMarketingStore> realProductMarketingStore;
    private final Provider<FlatCashbackRadOnboardingStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FlatCashbackRadOnboardingDuxo_Factory create(Provider<RealProductMarketingStore> provider, Provider<FlatCashbackRadOnboardingStateProvider> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final FlatCashbackRadOnboardingDuxo newInstance(RealProductMarketingStore realProductMarketingStore, FlatCashbackRadOnboardingStateProvider flatCashbackRadOnboardingStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(realProductMarketingStore, flatCashbackRadOnboardingStateProvider, duxoBundle);
    }

    public FlatCashbackRadOnboardingDuxo_Factory(Provider<RealProductMarketingStore> realProductMarketingStore, Provider<FlatCashbackRadOnboardingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.realProductMarketingStore = realProductMarketingStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FlatCashbackRadOnboardingDuxo get() {
        Companion companion = INSTANCE;
        RealProductMarketingStore realProductMarketingStore = this.realProductMarketingStore.get();
        Intrinsics.checkNotNullExpressionValue(realProductMarketingStore, "get(...)");
        FlatCashbackRadOnboardingStateProvider flatCashbackRadOnboardingStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(flatCashbackRadOnboardingStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(realProductMarketingStore, flatCashbackRadOnboardingStateProvider, duxoBundle);
    }

    /* compiled from: FlatCashbackRadOnboardingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo_Factory;", "realProductMarketingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FlatCashbackRadOnboardingDuxo_Factory create(Provider<RealProductMarketingStore> realProductMarketingStore, Provider<FlatCashbackRadOnboardingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FlatCashbackRadOnboardingDuxo_Factory(realProductMarketingStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final FlatCashbackRadOnboardingDuxo newInstance(RealProductMarketingStore realProductMarketingStore, FlatCashbackRadOnboardingStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FlatCashbackRadOnboardingDuxo(realProductMarketingStore, stateProvider, duxoBundle);
        }
    }
}
