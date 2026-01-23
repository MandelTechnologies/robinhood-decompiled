package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.upsell.CryptoRecurringOrderUpsellManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.notification.dagger.ProductUpsellManagerFactory;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: CryptoOrderConfirmationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0083\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "iacUpsellStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "notificationUpsellManagerFactory", "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "upsellManager", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierStore", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feeTierNotificationProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "feeTierStatusLastTimeSeenMillisPref", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroid/content/res/Resources;", "res", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderConfirmationDuxo_Factory implements Factory<CryptoOrderConfirmationDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<Clock> clock;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider;
    private final Provider<LongPreference> feeTierStatusLastTimeSeenMillisPref;
    private final Provider<CryptoFeeTierStore> feeTierStore;
    private final Provider<IacUpsellStore> iacUpsellStore;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<ProductUpsellManagerFactory> notificationUpsellManagerFactory;
    private final Provider<Resources> res;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoRecurringOrderUpsellManager> upsellManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderConfirmationDuxo_Factory create(Provider<AppType> provider, Provider<ExperimentsStore> provider2, Provider<CryptoAccountStore> provider3, Provider<AccountProvider> provider4, Provider<CryptoExperimentsStore> provider5, Provider<CurrencyPairV2Store> provider6, Provider<IacUpsellStore> provider7, Provider<EventLogger> provider8, Provider<ProductUpsellManagerFactory> provider9, Provider<CryptoRecurringOrderUpsellManager> provider10, Provider<CryptoFeeTierStore> provider11, Provider<CryptoFeeTierNotificationStatusProvider> provider12, Provider<Clock> provider13, Provider<LongPreference> provider14, Provider<MicrogramComponent.Factory> provider15, Provider<DuxoBundle> provider16, Provider<Resources> provider17, Provider<SavedStateHandle> provider18) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    @JvmStatic
    public static final CryptoOrderConfirmationDuxo newInstance(AppType appType, ExperimentsStore experimentsStore, CryptoAccountStore cryptoAccountStore, AccountProvider accountProvider, CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairV2Store currencyPairV2Store, IacUpsellStore iacUpsellStore, EventLogger eventLogger, ProductUpsellManagerFactory productUpsellManagerFactory, CryptoRecurringOrderUpsellManager cryptoRecurringOrderUpsellManager, CryptoFeeTierStore cryptoFeeTierStore, CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Clock clock, LongPreference longPreference, MicrogramComponent.Factory factory, DuxoBundle duxoBundle, Resources resources, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(appType, experimentsStore, cryptoAccountStore, accountProvider, cryptoExperimentsStore, currencyPairV2Store, iacUpsellStore, eventLogger, productUpsellManagerFactory, cryptoRecurringOrderUpsellManager, cryptoFeeTierStore, cryptoFeeTierNotificationStatusProvider, clock, longPreference, factory, duxoBundle, resources, savedStateHandle);
    }

    public CryptoOrderConfirmationDuxo_Factory(Provider<AppType> appType, Provider<ExperimentsStore> experimentsStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<AccountProvider> accountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<IacUpsellStore> iacUpsellStore, Provider<EventLogger> eventLogger, Provider<ProductUpsellManagerFactory> notificationUpsellManagerFactory, Provider<CryptoRecurringOrderUpsellManager> upsellManager, Provider<CryptoFeeTierStore> feeTierStore, Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider, Provider<Clock> clock, Provider<LongPreference> feeTierStatusLastTimeSeenMillisPref, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle, Provider<Resources> res, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(notificationUpsellManagerFactory, "notificationUpsellManagerFactory");
        Intrinsics.checkNotNullParameter(upsellManager, "upsellManager");
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.appType = appType;
        this.experimentsStore = experimentsStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.accountProvider = accountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.currencyPairStore = currencyPairStore;
        this.iacUpsellStore = iacUpsellStore;
        this.eventLogger = eventLogger;
        this.notificationUpsellManagerFactory = notificationUpsellManagerFactory;
        this.upsellManager = upsellManager;
        this.feeTierStore = feeTierStore;
        this.feeTierNotificationProvider = feeTierNotificationProvider;
        this.clock = clock;
        this.feeTierStatusLastTimeSeenMillisPref = feeTierStatusLastTimeSeenMillisPref;
        this.microgramComponentFactory = microgramComponentFactory;
        this.duxoBundle = duxoBundle;
        this.res = res;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoOrderConfirmationDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        IacUpsellStore iacUpsellStore = this.iacUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(iacUpsellStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ProductUpsellManagerFactory productUpsellManagerFactory = this.notificationUpsellManagerFactory.get();
        Intrinsics.checkNotNullExpressionValue(productUpsellManagerFactory, "get(...)");
        CryptoRecurringOrderUpsellManager cryptoRecurringOrderUpsellManager = this.upsellManager.get();
        Intrinsics.checkNotNullExpressionValue(cryptoRecurringOrderUpsellManager, "get(...)");
        CryptoFeeTierStore cryptoFeeTierStore = this.feeTierStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierStore, "get(...)");
        CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = this.feeTierNotificationProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierNotificationStatusProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        LongPreference longPreference = this.feeTierStatusLastTimeSeenMillisPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        LongPreference longPreference2 = longPreference;
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        MicrogramComponent.Factory factory2 = factory;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        Resources resources = this.res.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        Resources resources2 = resources;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(appType, experimentsStore, cryptoAccountStore, accountProvider, cryptoExperimentsStore, currencyPairV2Store, iacUpsellStore, eventLogger, productUpsellManagerFactory, cryptoRecurringOrderUpsellManager, cryptoFeeTierStore, cryptoFeeTierNotificationStatusProvider, clock, longPreference2, factory2, duxoBundle2, resources2, savedStateHandle);
    }

    /* compiled from: CryptoOrderConfirmationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008b\u0002\u0010*\u001a\u00020)2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0004H\u0007¢\u0006\u0004\b*\u0010+J\u009f\u0001\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "iacUpsellStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "notificationUpsellManagerFactory", "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "upsellManager", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierStore", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feeTierNotificationProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "feeTierStatusLastTimeSeenMillisPref", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroid/content/res/Resources;", "res", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo_Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "newInstance", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/shared/data/store/iac/IacUpsellStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderConfirmationDuxo_Factory create(Provider<AppType> appType, Provider<ExperimentsStore> experimentsStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<AccountProvider> accountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<IacUpsellStore> iacUpsellStore, Provider<EventLogger> eventLogger, Provider<ProductUpsellManagerFactory> notificationUpsellManagerFactory, Provider<CryptoRecurringOrderUpsellManager> upsellManager, Provider<CryptoFeeTierStore> feeTierStore, Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider, Provider<Clock> clock, Provider<LongPreference> feeTierStatusLastTimeSeenMillisPref, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle, Provider<Resources> res, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(notificationUpsellManagerFactory, "notificationUpsellManagerFactory");
            Intrinsics.checkNotNullParameter(upsellManager, "upsellManager");
            Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
            Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(res, "res");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderConfirmationDuxo_Factory(appType, experimentsStore, cryptoAccountStore, accountProvider, cryptoExperimentsStore, currencyPairStore, iacUpsellStore, eventLogger, notificationUpsellManagerFactory, upsellManager, feeTierStore, feeTierNotificationProvider, clock, feeTierStatusLastTimeSeenMillisPref, microgramComponentFactory, duxoBundle, res, savedStateHandle);
        }

        @JvmStatic
        public final CryptoOrderConfirmationDuxo newInstance(AppType appType, ExperimentsStore experimentsStore, CryptoAccountStore cryptoAccountStore, AccountProvider accountProvider, CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairV2Store currencyPairStore, IacUpsellStore iacUpsellStore, EventLogger eventLogger, ProductUpsellManagerFactory notificationUpsellManagerFactory, CryptoRecurringOrderUpsellManager upsellManager, CryptoFeeTierStore feeTierStore, CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider, Clock clock, LongPreference feeTierStatusLastTimeSeenMillisPref, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle, Resources res, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(notificationUpsellManagerFactory, "notificationUpsellManagerFactory");
            Intrinsics.checkNotNullParameter(upsellManager, "upsellManager");
            Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
            Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(res, "res");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderConfirmationDuxo(appType, experimentsStore, cryptoAccountStore, accountProvider, cryptoExperimentsStore, currencyPairStore, iacUpsellStore, eventLogger, notificationUpsellManagerFactory, upsellManager, feeTierStore, feeTierNotificationProvider, clock, feeTierStatusLastTimeSeenMillisPref, microgramComponentFactory, duxoBundle, res, savedStateHandle);
        }
    }
}
