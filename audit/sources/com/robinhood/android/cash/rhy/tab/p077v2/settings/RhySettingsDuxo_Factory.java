package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhySettingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B»\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "googlePayManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "midlands", "Lcom/robinhood/api/retrofit/Midlands;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "rhyAccountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "showCardNumberPref", "Lcom/robinhood/prefs/BooleanPreference;", "alwaysShowAddToGPayPref", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhySettingsDuxo_Factory implements Factory<RhySettingsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BooleanPreference> alwaysShowAddToGPayPref;
    private final Provider<CashCushionStatusStore> cashCushionStatusStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<GooglePayManager> googlePayManager;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<LocationProtectionManager> locationProtectionManager;
    private final Provider<MatchaTreatmentStore> matchaTreatmentStore;
    private final Provider<Midlands> midlands;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<RhyAccountRoutingDetailsStore> rhyAccountRoutingDetailsStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhySuvManger> rhySuvManger;
    private final Provider<RoundupEnrollmentStore> roundupEnrollmentStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<BooleanPreference> showCardNumberPref;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhySettingsDuxo_Factory create(Provider<GooglePayManager> provider, Provider<RhySuvManger> provider2, Provider<LocationProtectionManager> provider3, Provider<Midlands> provider4, Provider<MinervaAccountStore> provider5, Provider<PaymentCardStore> provider6, Provider<RhyAccountRoutingDetailsStore> provider7, Provider<RhyAccountStore> provider8, Provider<RoundupEnrollmentStore> provider9, Provider<InstrumentStore> provider10, Provider<CurrencyPairStore> provider11, Provider<DirectDepositRelationshipStore> provider12, Provider<UserStore> provider13, Provider<CashCushionStatusStore> provider14, Provider<AccountProvider> provider15, Provider<EventLogger> provider16, Provider<MatchaTreatmentStore> provider17, Provider<BooleanPreference> provider18, Provider<BooleanPreference> provider19, Provider<DispatcherProvider> provider20, Provider<RxFactory> provider21, Provider<RxGlobalErrorHandler> provider22) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22);
    }

    @JvmStatic
    public static final RhySettingsDuxo newInstance(GooglePayManager googlePayManager, RhySuvManger rhySuvManger, LocationProtectionManager locationProtectionManager, Midlands midlands, MinervaAccountStore minervaAccountStore, PaymentCardStore paymentCardStore, RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, RhyAccountStore rhyAccountStore, RoundupEnrollmentStore roundupEnrollmentStore, InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, DirectDepositRelationshipStore directDepositRelationshipStore, UserStore userStore, CashCushionStatusStore cashCushionStatusStore, AccountProvider accountProvider, EventLogger eventLogger, MatchaTreatmentStore matchaTreatmentStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2) {
        return INSTANCE.newInstance(googlePayManager, rhySuvManger, locationProtectionManager, midlands, minervaAccountStore, paymentCardStore, rhyAccountRoutingDetailsStore, rhyAccountStore, roundupEnrollmentStore, instrumentStore, currencyPairStore, directDepositRelationshipStore, userStore, cashCushionStatusStore, accountProvider, eventLogger, matchaTreatmentStore, booleanPreference, booleanPreference2);
    }

    public RhySettingsDuxo_Factory(Provider<GooglePayManager> googlePayManager, Provider<RhySuvManger> rhySuvManger, Provider<LocationProtectionManager> locationProtectionManager, Provider<Midlands> midlands, Provider<MinervaAccountStore> minervaAccountStore, Provider<PaymentCardStore> paymentCardStore, Provider<RhyAccountRoutingDetailsStore> rhyAccountRoutingDetailsStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<InstrumentStore> instrumentStore, Provider<CurrencyPairStore> currencyPairStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<UserStore> userStore, Provider<CashCushionStatusStore> cashCushionStatusStore, Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<BooleanPreference> showCardNumberPref, Provider<BooleanPreference> alwaysShowAddToGPayPref, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
        Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
        Intrinsics.checkNotNullParameter(midlands, "midlands");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(rhyAccountRoutingDetailsStore, "rhyAccountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(showCardNumberPref, "showCardNumberPref");
        Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.googlePayManager = googlePayManager;
        this.rhySuvManger = rhySuvManger;
        this.locationProtectionManager = locationProtectionManager;
        this.midlands = midlands;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.rhyAccountRoutingDetailsStore = rhyAccountRoutingDetailsStore;
        this.rhyAccountStore = rhyAccountStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.instrumentStore = instrumentStore;
        this.currencyPairStore = currencyPairStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.userStore = userStore;
        this.cashCushionStatusStore = cashCushionStatusStore;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.showCardNumberPref = showCardNumberPref;
        this.alwaysShowAddToGPayPref = alwaysShowAddToGPayPref;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RhySettingsDuxo get() {
        Companion companion = INSTANCE;
        GooglePayManager googlePayManager = this.googlePayManager.get();
        Intrinsics.checkNotNullExpressionValue(googlePayManager, "get(...)");
        RhySuvManger rhySuvManger = this.rhySuvManger.get();
        Intrinsics.checkNotNullExpressionValue(rhySuvManger, "get(...)");
        LocationProtectionManager locationProtectionManager = this.locationProtectionManager.get();
        Intrinsics.checkNotNullExpressionValue(locationProtectionManager, "get(...)");
        Midlands midlands = this.midlands.get();
        Intrinsics.checkNotNullExpressionValue(midlands, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore = this.rhyAccountRoutingDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountRoutingDetailsStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(roundupEnrollmentStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        CashCushionStatusStore cashCushionStatusStore = this.cashCushionStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(cashCushionStatusStore, "get(...)");
        CashCushionStatusStore cashCushionStatusStore2 = cashCushionStatusStore;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountProvider accountProvider2 = accountProvider;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        EventLogger eventLogger2 = eventLogger;
        MatchaTreatmentStore matchaTreatmentStore = this.matchaTreatmentStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTreatmentStore, "get(...)");
        MatchaTreatmentStore matchaTreatmentStore2 = matchaTreatmentStore;
        BooleanPreference booleanPreference = this.showCardNumberPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.alwaysShowAddToGPayPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        RhySettingsDuxo rhySettingsDuxoNewInstance = companion.newInstance(googlePayManager, rhySuvManger, locationProtectionManager, midlands, minervaAccountStore, paymentCardStore, rhyAccountRoutingDetailsStore, rhyAccountStore, roundupEnrollmentStore, instrumentStore, currencyPairStore, directDepositRelationshipStore, userStore, cashCushionStatusStore2, accountProvider2, eventLogger2, matchaTreatmentStore2, booleanPreference2, booleanPreference3);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rhySettingsDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rhySettingsDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rhySettingsDuxoNewInstance, rxGlobalErrorHandler);
        return rhySettingsDuxoNewInstance;
    }

    /* compiled from: RhySettingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¼\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00072\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0007H\u0007J \u0001\u00102\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0007¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo_Factory;", "googlePayManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "midlands", "Lcom/robinhood/api/retrofit/Midlands;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "rhyAccountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "showCardNumberPref", "Lcom/robinhood/prefs/BooleanPreference;", "alwaysShowAddToGPayPref", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhySettingsDuxo_Factory create(Provider<GooglePayManager> googlePayManager, Provider<RhySuvManger> rhySuvManger, Provider<LocationProtectionManager> locationProtectionManager, Provider<Midlands> midlands, Provider<MinervaAccountStore> minervaAccountStore, Provider<PaymentCardStore> paymentCardStore, Provider<RhyAccountRoutingDetailsStore> rhyAccountRoutingDetailsStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<InstrumentStore> instrumentStore, Provider<CurrencyPairStore> currencyPairStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<UserStore> userStore, Provider<CashCushionStatusStore> cashCushionStatusStore, Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<BooleanPreference> showCardNumberPref, Provider<BooleanPreference> alwaysShowAddToGPayPref, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
            Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
            Intrinsics.checkNotNullParameter(midlands, "midlands");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(rhyAccountRoutingDetailsStore, "rhyAccountRoutingDetailsStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(showCardNumberPref, "showCardNumberPref");
            Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RhySettingsDuxo_Factory(googlePayManager, rhySuvManger, locationProtectionManager, midlands, minervaAccountStore, paymentCardStore, rhyAccountRoutingDetailsStore, rhyAccountStore, roundupEnrollmentStore, instrumentStore, currencyPairStore, directDepositRelationshipStore, userStore, cashCushionStatusStore, accountProvider, eventLogger, matchaTreatmentStore, showCardNumberPref, alwaysShowAddToGPayPref, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RhySettingsDuxo newInstance(GooglePayManager googlePayManager, RhySuvManger rhySuvManger, LocationProtectionManager locationProtectionManager, Midlands midlands, MinervaAccountStore minervaAccountStore, PaymentCardStore paymentCardStore, RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, RhyAccountStore rhyAccountStore, RoundupEnrollmentStore roundupEnrollmentStore, InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, DirectDepositRelationshipStore directDepositRelationshipStore, UserStore userStore, CashCushionStatusStore cashCushionStatusStore, AccountProvider accountProvider, EventLogger eventLogger, MatchaTreatmentStore matchaTreatmentStore, BooleanPreference showCardNumberPref, BooleanPreference alwaysShowAddToGPayPref) {
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
            Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
            Intrinsics.checkNotNullParameter(midlands, "midlands");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(rhyAccountRoutingDetailsStore, "rhyAccountRoutingDetailsStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(showCardNumberPref, "showCardNumberPref");
            Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
            return new RhySettingsDuxo(googlePayManager, rhySuvManger, locationProtectionManager, midlands, minervaAccountStore, paymentCardStore, rhyAccountRoutingDetailsStore, rhyAccountStore, roundupEnrollmentStore, instrumentStore, currencyPairStore, directDepositRelationshipStore, userStore, cashCushionStatusStore, accountProvider, eventLogger, matchaTreatmentStore, showCardNumberPref, alwaysShowAddToGPayPref);
        }
    }
}
