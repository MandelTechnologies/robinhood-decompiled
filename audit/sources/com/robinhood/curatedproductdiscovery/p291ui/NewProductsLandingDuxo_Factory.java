package com.robinhood.curatedproductdiscovery.p291ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewProductsLandingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "slipEligibilityStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NewProductsLandingDuxo_Factory implements Factory<NewProductsLandingDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RoundupEnrollmentStore> roundupEnrollmentStore;
    private final Provider<SlipEligibilityStore> slipEligibilityStore;
    private final Provider<NewProductsLandingStateProvider> stateProvider;
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<SweepsInterestStore> sweepInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final NewProductsLandingDuxo_Factory create(Provider<AccountProvider> provider, Provider<SweepEnrollmentStore> provider2, Provider<SweepsInterestStore> provider3, Provider<SlipEligibilityStore> provider4, Provider<RoundupEnrollmentStore> provider5, Provider<RegionGateProvider> provider6, Provider<DuxoBundle> provider7, Provider<NewProductsLandingStateProvider> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final NewProductsLandingDuxo newInstance(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore, SlipEligibilityStore slipEligibilityStore, RoundupEnrollmentStore roundupEnrollmentStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle, NewProductsLandingStateProvider newProductsLandingStateProvider) {
        return INSTANCE.newInstance(accountProvider, sweepEnrollmentStore, sweepsInterestStore, slipEligibilityStore, roundupEnrollmentStore, regionGateProvider, duxoBundle, newProductsLandingStateProvider);
    }

    public NewProductsLandingDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<SweepsInterestStore> sweepInterestStore, Provider<SlipEligibilityStore> slipEligibilityStore, Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle, Provider<NewProductsLandingStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
        Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepInterestStore = sweepInterestStore;
        this.slipEligibilityStore = slipEligibilityStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.regionGateProvider = regionGateProvider;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public NewProductsLandingDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        SlipEligibilityStore slipEligibilityStore = this.slipEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(slipEligibilityStore, "get(...)");
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(roundupEnrollmentStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        NewProductsLandingStateProvider newProductsLandingStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(newProductsLandingStateProvider, "get(...)");
        return companion.newInstance(accountProvider, sweepEnrollmentStore, sweepsInterestStore, slipEligibilityStore, roundupEnrollmentStore, regionGateProvider, duxoBundle, newProductsLandingStateProvider);
    }

    /* compiled from: NewProductsLandingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "slipEligibilityStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingStateProvider;", "newInstance", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo;", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NewProductsLandingDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<SweepsInterestStore> sweepInterestStore, Provider<SlipEligibilityStore> slipEligibilityStore, Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle, Provider<NewProductsLandingStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
            Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new NewProductsLandingDuxo_Factory(accountProvider, sweepEnrollmentStore, sweepInterestStore, slipEligibilityStore, roundupEnrollmentStore, regionGateProvider, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final NewProductsLandingDuxo newInstance(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepInterestStore, SlipEligibilityStore slipEligibilityStore, RoundupEnrollmentStore roundupEnrollmentStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle, NewProductsLandingStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
            Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new NewProductsLandingDuxo(accountProvider, sweepEnrollmentStore, sweepInterestStore, slipEligibilityStore, roundupEnrollmentStore, regionGateProvider, duxoBundle, stateProvider);
        }
    }
}
