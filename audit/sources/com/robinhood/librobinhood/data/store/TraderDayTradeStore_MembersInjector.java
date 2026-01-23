package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderDayTradeStore_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderDayTradeStore_MembersInjector implements MembersInjector<TraderDayTradeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OrderStore> orderStore;

    @JvmStatic
    public static final MembersInjector<TraderDayTradeStore> create(Provider<AccountProvider> provider, Provider<InstrumentStore> provider2, Provider<OptionOrderStore> provider3, Provider<OrderStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAccountProvider(TraderDayTradeStore traderDayTradeStore, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(traderDayTradeStore, accountProvider);
    }

    @JvmStatic
    public static final void injectInstrumentStore(TraderDayTradeStore traderDayTradeStore, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(traderDayTradeStore, instrumentStore);
    }

    @JvmStatic
    public static final void injectOptionOrderStore(TraderDayTradeStore traderDayTradeStore, OptionOrderStore optionOrderStore) {
        INSTANCE.injectOptionOrderStore(traderDayTradeStore, optionOrderStore);
    }

    @JvmStatic
    public static final void injectOrderStore(TraderDayTradeStore traderDayTradeStore, OrderStore orderStore) {
        INSTANCE.injectOrderStore(traderDayTradeStore, orderStore);
    }

    public TraderDayTradeStore_MembersInjector(Provider<AccountProvider> accountProvider, Provider<InstrumentStore> instrumentStore, Provider<OptionOrderStore> optionOrderStore, Provider<OrderStore> orderStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.optionOrderStore = optionOrderStore;
        this.orderStore = orderStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TraderDayTradeStore instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion.injectAccountProvider(instance, accountProvider);
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion.injectInstrumentStore(instance, instrumentStore);
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        companion.injectOptionOrderStore(instance, optionOrderStore);
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        companion.injectOrderStore(instance, orderStore);
    }

    /* compiled from: TraderDayTradeStore_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "injectAccountProvider", "", "instance", "injectInstrumentStore", "injectOptionOrderStore", "injectOrderStore", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TraderDayTradeStore> create(Provider<AccountProvider> accountProvider, Provider<InstrumentStore> instrumentStore, Provider<OptionOrderStore> optionOrderStore, Provider<OrderStore> orderStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            return new TraderDayTradeStore_MembersInjector(accountProvider, instrumentStore, optionOrderStore, orderStore);
        }

        @JvmStatic
        public final void injectAccountProvider(TraderDayTradeStore instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectInstrumentStore(TraderDayTradeStore instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }

        @JvmStatic
        public final void injectOptionOrderStore(TraderDayTradeStore instance, OptionOrderStore optionOrderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            instance.setOptionOrderStore(optionOrderStore);
        }

        @JvmStatic
        public final void injectOrderStore(TraderDayTradeStore instance, OrderStore orderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            instance.setOrderStore(orderStore);
        }
    }
}
