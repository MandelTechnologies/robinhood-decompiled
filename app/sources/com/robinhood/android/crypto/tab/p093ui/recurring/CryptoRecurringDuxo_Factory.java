package com.robinhood.android.crypto.tab.p093ui.recurring;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.store.base.InvestmentScheduleStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoRecurringDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoRecurringDuxo_Factory implements Factory<CryptoRecurringDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolver;
    private final Provider<InvestmentScheduleStore> investmentScheduleStore;
    private final Provider<RegionGateProvider> regionGateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoRecurringDuxo_Factory create(Provider<AppType> provider, Provider<DuxoBundle> provider2, Provider<InvestmentScheduleKeyResolver> provider3, Provider<AccountProvider> provider4, Provider<InvestmentScheduleStore> provider5, Provider<RegionGateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoRecurringDuxo newInstance(AppType appType, DuxoBundle duxoBundle, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, AccountProvider accountProvider, InvestmentScheduleStore investmentScheduleStore, RegionGateProvider regionGateProvider) {
        return INSTANCE.newInstance(appType, duxoBundle, investmentScheduleKeyResolver, accountProvider, investmentScheduleStore, regionGateProvider);
    }

    public CryptoRecurringDuxo_Factory(Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolver, Provider<AccountProvider> accountProvider, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.appType = appType;
        this.duxoBundle = duxoBundle;
        this.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
        this.accountProvider = accountProvider;
        this.investmentScheduleStore = investmentScheduleStore;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoRecurringDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        InvestmentScheduleKeyResolver investmentScheduleKeyResolver = this.investmentScheduleKeyResolver.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleKeyResolver, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        InvestmentScheduleStore investmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return companion.newInstance(appType, duxoBundle, investmentScheduleKeyResolver, accountProvider, investmentScheduleStore, regionGateProvider);
    }

    /* compiled from: CryptoRecurringDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoRecurringDuxo_Factory create(Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolver, Provider<AccountProvider> accountProvider, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new CryptoRecurringDuxo_Factory(appType, duxoBundle, investmentScheduleKeyResolver, accountProvider, investmentScheduleStore, regionGateProvider);
        }

        @JvmStatic
        public final CryptoRecurringDuxo newInstance(AppType appType, DuxoBundle duxoBundle, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, AccountProvider accountProvider, InvestmentScheduleStore investmentScheduleStore, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new CryptoRecurringDuxo(appType, duxoBundle, investmentScheduleKeyResolver, accountProvider, investmentScheduleStore, regionGateProvider);
        }
    }
}
