package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.lib.upgrade.api.GoldUpgradeApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: FinalTermsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "goldUpgradeApi", "Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "showPlanSelector", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FinalTermsDuxo_Factory implements Factory<FinalTermsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<CoroutineDispatcher> defaultDispatcher;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldUpgradeApi> goldUpgradeApi;
    private final Provider<BooleanPreference> showPlanSelector;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FinalTermsDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<AccountProvider> provider2, Provider<AgreementsStore> provider3, Provider<CreditCardStore> provider4, Provider<GoldUpgradeApi> provider5, Provider<CoroutineDispatcher> provider6, Provider<BooleanPreference> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final FinalTermsDuxo newInstance(ExperimentsStore experimentsStore, AccountProvider accountProvider, AgreementsStore agreementsStore, CreditCardStore creditCardStore, GoldUpgradeApi goldUpgradeApi, CoroutineDispatcher coroutineDispatcher, BooleanPreference booleanPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(experimentsStore, accountProvider, agreementsStore, creditCardStore, goldUpgradeApi, coroutineDispatcher, booleanPreference, duxoBundle);
    }

    public FinalTermsDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<AccountProvider> accountProvider, Provider<AgreementsStore> agreementsStore, Provider<CreditCardStore> creditCardStore, Provider<GoldUpgradeApi> goldUpgradeApi, Provider<CoroutineDispatcher> defaultDispatcher, Provider<BooleanPreference> showPlanSelector, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(goldUpgradeApi, "goldUpgradeApi");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(showPlanSelector, "showPlanSelector");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.accountProvider = accountProvider;
        this.agreementsStore = agreementsStore;
        this.creditCardStore = creditCardStore;
        this.goldUpgradeApi = goldUpgradeApi;
        this.defaultDispatcher = defaultDispatcher;
        this.showPlanSelector = showPlanSelector;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FinalTermsDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        GoldUpgradeApi goldUpgradeApi = this.goldUpgradeApi.get();
        Intrinsics.checkNotNullExpressionValue(goldUpgradeApi, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        BooleanPreference booleanPreference = this.showPlanSelector.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(experimentsStore, accountProvider, agreementsStore, creditCardStore, goldUpgradeApi, coroutineDispatcher, booleanPreference, duxoBundle);
    }

    /* compiled from: FinalTermsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "goldUpgradeApi", "Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "showPlanSelector", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FinalTermsDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<AccountProvider> accountProvider, Provider<AgreementsStore> agreementsStore, Provider<CreditCardStore> creditCardStore, Provider<GoldUpgradeApi> goldUpgradeApi, Provider<CoroutineDispatcher> defaultDispatcher, Provider<BooleanPreference> showPlanSelector, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(goldUpgradeApi, "goldUpgradeApi");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(showPlanSelector, "showPlanSelector");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FinalTermsDuxo_Factory(experimentsStore, accountProvider, agreementsStore, creditCardStore, goldUpgradeApi, defaultDispatcher, showPlanSelector, duxoBundle);
        }

        @JvmStatic
        public final FinalTermsDuxo newInstance(ExperimentsStore experimentsStore, AccountProvider accountProvider, AgreementsStore agreementsStore, CreditCardStore creditCardStore, GoldUpgradeApi goldUpgradeApi, CoroutineDispatcher defaultDispatcher, BooleanPreference showPlanSelector, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(goldUpgradeApi, "goldUpgradeApi");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(showPlanSelector, "showPlanSelector");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FinalTermsDuxo(experimentsStore, accountProvider, agreementsStore, creditCardStore, goldUpgradeApi, defaultDispatcher, showPlanSelector, duxoBundle);
        }
    }
}
