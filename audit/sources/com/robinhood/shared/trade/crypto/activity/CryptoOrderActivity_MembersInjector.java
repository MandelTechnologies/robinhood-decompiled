package com.robinhood.shared.trade.crypto.activity;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.cryptoEducationTrading.prefs.HasCryptoTradingEducationRewardImpressionPref;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.education.order.OrderTypeEducationManager;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.tooltips.TooltipManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BÈ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "orderManager", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "recurringKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "hasCryptoTradingEducationRewardImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderActivity_MembersInjector implements MembersInjector<CryptoOrderActivity> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<BooleanPreference> hasCryptoTradingEducationRewardImpressionPref;
    private final Provider<CryptoOrderManager> orderManager;
    private final Provider<OrderTypeEducationManager> orderTypeEducationManager;
    private final Provider<InvestmentScheduleKeyResolver> recurringKeyResolver;
    private final Provider<RxFactory> rxFactory;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TooltipManager> tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CryptoOrderActivity> create(Provider<BaseActivitySingletons> provider, Provider<CryptoOrderManager> provider2, Provider<EnumPreference<CryptoInputMode>> provider3, Provider<CurrencyPairV2Store> provider4, Provider<CryptoExperimentsStore> provider5, Provider<CryptoAccountProvider> provider6, Provider<AccountProvider> provider7, Provider<OrderTypeEducationManager> provider8, Provider<AppType> provider9, Provider<TooltipManager> provider10, Provider<RxFactory> provider11, Provider<InvestmentScheduleKeyResolver> provider12, Provider<BooleanPreference> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final void injectAccountProvider(CryptoOrderActivity cryptoOrderActivity, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(cryptoOrderActivity, accountProvider);
    }

    @JvmStatic
    public static final void injectAppType(CryptoOrderActivity cryptoOrderActivity, AppType appType) {
        INSTANCE.injectAppType(cryptoOrderActivity, appType);
    }

    @JvmStatic
    public static final void injectCryptoAccountProvider(CryptoOrderActivity cryptoOrderActivity, CryptoAccountProvider cryptoAccountProvider) {
        INSTANCE.injectCryptoAccountProvider(cryptoOrderActivity, cryptoAccountProvider);
    }

    @JvmStatic
    public static final void injectCryptoExperimentsStore(CryptoOrderActivity cryptoOrderActivity, CryptoExperimentsStore cryptoExperimentsStore) {
        INSTANCE.injectCryptoExperimentsStore(cryptoOrderActivity, cryptoExperimentsStore);
    }

    @JvmStatic
    public static final void injectCryptoInputModePref(CryptoOrderActivity cryptoOrderActivity, EnumPreference<CryptoInputMode> enumPreference) {
        INSTANCE.injectCryptoInputModePref(cryptoOrderActivity, enumPreference);
    }

    @JvmStatic
    public static final void injectCurrencyPairStore(CryptoOrderActivity cryptoOrderActivity, CurrencyPairV2Store currencyPairV2Store) {
        INSTANCE.injectCurrencyPairStore(cryptoOrderActivity, currencyPairV2Store);
    }

    @JvmStatic
    @HasCryptoTradingEducationRewardImpressionPref
    public static final void injectHasCryptoTradingEducationRewardImpressionPref(CryptoOrderActivity cryptoOrderActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectHasCryptoTradingEducationRewardImpressionPref(cryptoOrderActivity, booleanPreference);
    }

    @JvmStatic
    public static final void injectOrderManager(CryptoOrderActivity cryptoOrderActivity, CryptoOrderManager cryptoOrderManager) {
        INSTANCE.injectOrderManager(cryptoOrderActivity, cryptoOrderManager);
    }

    @JvmStatic
    public static final void injectOrderTypeEducationManager(CryptoOrderActivity cryptoOrderActivity, OrderTypeEducationManager orderTypeEducationManager) {
        INSTANCE.injectOrderTypeEducationManager(cryptoOrderActivity, orderTypeEducationManager);
    }

    @JvmStatic
    public static final void injectRecurringKeyResolver(CryptoOrderActivity cryptoOrderActivity, InvestmentScheduleKeyResolver investmentScheduleKeyResolver) {
        INSTANCE.injectRecurringKeyResolver(cryptoOrderActivity, investmentScheduleKeyResolver);
    }

    @JvmStatic
    public static final void injectRxFactory(CryptoOrderActivity cryptoOrderActivity, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(cryptoOrderActivity, rxFactory);
    }

    @JvmStatic
    public static final void injectTooltipManager(CryptoOrderActivity cryptoOrderActivity, TooltipManager tooltipManager) {
        INSTANCE.injectTooltipManager(cryptoOrderActivity, tooltipManager);
    }

    public CryptoOrderActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<CryptoOrderManager> orderManager, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<AccountProvider> accountProvider, Provider<OrderTypeEducationManager> orderTypeEducationManager, Provider<AppType> appType, Provider<TooltipManager> tooltipManager, Provider<RxFactory> rxFactory, Provider<InvestmentScheduleKeyResolver> recurringKeyResolver, Provider<BooleanPreference> hasCryptoTradingEducationRewardImpressionPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(recurringKeyResolver, "recurringKeyResolver");
        Intrinsics.checkNotNullParameter(hasCryptoTradingEducationRewardImpressionPref, "hasCryptoTradingEducationRewardImpressionPref");
        this.singletons = singletons;
        this.orderManager = orderManager;
        this.cryptoInputModePref = cryptoInputModePref;
        this.currencyPairStore = currencyPairStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.accountProvider = accountProvider;
        this.orderTypeEducationManager = orderTypeEducationManager;
        this.appType = appType;
        this.tooltipManager = tooltipManager;
        this.rxFactory = rxFactory;
        this.recurringKeyResolver = recurringKeyResolver;
        this.hasCryptoTradingEducationRewardImpressionPref = hasCryptoTradingEducationRewardImpressionPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CryptoOrderActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        CryptoOrderManager cryptoOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderManager, "get(...)");
        companion2.injectOrderManager(instance, cryptoOrderManager);
        EnumPreference<CryptoInputMode> enumPreference = this.cryptoInputModePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        companion2.injectCryptoInputModePref(instance, enumPreference);
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        companion2.injectCurrencyPairStore(instance, currencyPairV2Store);
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        companion2.injectCryptoExperimentsStore(instance, cryptoExperimentsStore);
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        companion2.injectCryptoAccountProvider(instance, cryptoAccountProvider);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        OrderTypeEducationManager orderTypeEducationManager = this.orderTypeEducationManager.get();
        Intrinsics.checkNotNullExpressionValue(orderTypeEducationManager, "get(...)");
        companion2.injectOrderTypeEducationManager(instance, orderTypeEducationManager);
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        companion2.injectAppType(instance, appType);
        TooltipManager tooltipManager = this.tooltipManager.get();
        Intrinsics.checkNotNullExpressionValue(tooltipManager, "get(...)");
        companion2.injectTooltipManager(instance, tooltipManager);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(instance, rxFactory);
        InvestmentScheduleKeyResolver investmentScheduleKeyResolver = this.recurringKeyResolver.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleKeyResolver, "get(...)");
        companion2.injectRecurringKeyResolver(instance, investmentScheduleKeyResolver);
        BooleanPreference booleanPreference = this.hasCryptoTradingEducationRewardImpressionPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasCryptoTradingEducationRewardImpressionPref(instance, booleanPreference);
    }

    /* compiled from: CryptoOrderActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÏ\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0017\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\bH\u0007J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J#\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007J\u0018\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010/\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u00100\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u00101\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0007¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "orderManager", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "recurringKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "hasCryptoTradingEducationRewardImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectOrderManager", "", "instance", "injectCryptoInputModePref", "injectCurrencyPairStore", "injectCryptoExperimentsStore", "injectCryptoAccountProvider", "injectAccountProvider", "injectOrderTypeEducationManager", "injectAppType", "injectTooltipManager", "injectRxFactory", "injectRecurringKeyResolver", "injectHasCryptoTradingEducationRewardImpressionPref", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CryptoOrderActivity> create(Provider<BaseActivitySingletons> singletons, Provider<CryptoOrderManager> orderManager, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<AccountProvider> accountProvider, Provider<OrderTypeEducationManager> orderTypeEducationManager, Provider<AppType> appType, Provider<TooltipManager> tooltipManager, Provider<RxFactory> rxFactory, Provider<InvestmentScheduleKeyResolver> recurringKeyResolver, Provider<BooleanPreference> hasCryptoTradingEducationRewardImpressionPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(recurringKeyResolver, "recurringKeyResolver");
            Intrinsics.checkNotNullParameter(hasCryptoTradingEducationRewardImpressionPref, "hasCryptoTradingEducationRewardImpressionPref");
            return new CryptoOrderActivity_MembersInjector(singletons, orderManager, cryptoInputModePref, currencyPairStore, cryptoExperimentsStore, cryptoAccountProvider, accountProvider, orderTypeEducationManager, appType, tooltipManager, rxFactory, recurringKeyResolver, hasCryptoTradingEducationRewardImpressionPref);
        }

        @JvmStatic
        public final void injectOrderManager(CryptoOrderActivity instance, CryptoOrderManager orderManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            instance.setOrderManager(orderManager);
        }

        @JvmStatic
        public final void injectCryptoInputModePref(CryptoOrderActivity instance, EnumPreference<CryptoInputMode> cryptoInputModePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            instance.setCryptoInputModePref(cryptoInputModePref);
        }

        @JvmStatic
        public final void injectCurrencyPairStore(CryptoOrderActivity instance, CurrencyPairV2Store currencyPairStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            instance.setCurrencyPairStore(currencyPairStore);
        }

        @JvmStatic
        public final void injectCryptoExperimentsStore(CryptoOrderActivity instance, CryptoExperimentsStore cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            instance.setCryptoExperimentsStore(cryptoExperimentsStore);
        }

        @JvmStatic
        public final void injectCryptoAccountProvider(CryptoOrderActivity instance, CryptoAccountProvider cryptoAccountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            instance.setCryptoAccountProvider(cryptoAccountProvider);
        }

        @JvmStatic
        public final void injectAccountProvider(CryptoOrderActivity instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectOrderTypeEducationManager(CryptoOrderActivity instance, OrderTypeEducationManager orderTypeEducationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
            instance.setOrderTypeEducationManager(orderTypeEducationManager);
        }

        @JvmStatic
        public final void injectAppType(CryptoOrderActivity instance, AppType appType) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(appType, "appType");
            instance.setAppType(appType);
        }

        @JvmStatic
        public final void injectTooltipManager(CryptoOrderActivity instance, TooltipManager tooltipManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            instance.setTooltipManager(tooltipManager);
        }

        @JvmStatic
        public final void injectRxFactory(CryptoOrderActivity instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }

        @JvmStatic
        public final void injectRecurringKeyResolver(CryptoOrderActivity instance, InvestmentScheduleKeyResolver recurringKeyResolver) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recurringKeyResolver, "recurringKeyResolver");
            instance.setRecurringKeyResolver(recurringKeyResolver);
        }

        @JvmStatic
        @HasCryptoTradingEducationRewardImpressionPref
        public final void injectHasCryptoTradingEducationRewardImpressionPref(CryptoOrderActivity instance, BooleanPreference hasCryptoTradingEducationRewardImpressionPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasCryptoTradingEducationRewardImpressionPref, "hasCryptoTradingEducationRewardImpressionPref");
            instance.setHasCryptoTradingEducationRewardImpressionPref(hasCryptoTradingEducationRewardImpressionPref);
        }
    }
}
