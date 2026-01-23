package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderDetailDuxo_Factory implements Factory<CryptoOrderDetailDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<CryptoTradingBottomSheetService> bottomSheetService;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoOrderStore> cryptoOrderStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter;
    private final Provider<ProfitAndLossDetailStore> profitAndLossDetailStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoOrderDetailStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderDetailDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoOrderDetailStateProvider> provider2, Provider<AppType> provider3, Provider<CryptoAccountStore> provider4, Provider<CryptoOrderStore> provider5, Provider<CryptoExperimentsStore> provider6, Provider<EventLogger> provider7, Provider<ExperimentsStore> provider8, Provider<CryptoTradingBottomSheetService> provider9, Provider<LocalizedDateTimeFormatter> provider10, Provider<ProfitAndLossDetailStore> provider11, Provider<AccountProvider> provider12, Provider<SavedStateHandle> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final CryptoOrderDetailDuxo newInstance(DuxoBundle duxoBundle, CryptoOrderDetailStateProvider cryptoOrderDetailStateProvider, AppType appType, CryptoAccountStore cryptoAccountStore, CryptoOrderStore cryptoOrderStore, CryptoExperimentsStore cryptoExperimentsStore, EventLogger eventLogger, ExperimentsStore experimentsStore, CryptoTradingBottomSheetService cryptoTradingBottomSheetService, LocalizedDateTimeFormatter localizedDateTimeFormatter, ProfitAndLossDetailStore profitAndLossDetailStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(duxoBundle, cryptoOrderDetailStateProvider, appType, cryptoAccountStore, cryptoOrderStore, cryptoExperimentsStore, eventLogger, experimentsStore, cryptoTradingBottomSheetService, localizedDateTimeFormatter, profitAndLossDetailStore, accountProvider, savedStateHandle);
    }

    public CryptoOrderDetailDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoOrderDetailStateProvider> stateProvider, Provider<AppType> appType, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoOrderStore> cryptoOrderStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<AccountProvider> accountProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.appType = appType;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoOrderStore = cryptoOrderStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.bottomSheetService = bottomSheetService;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoOrderDetailDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoOrderDetailStateProvider cryptoOrderDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderDetailStateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoOrderStore cryptoOrderStore = this.cryptoOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CryptoTradingBottomSheetService cryptoTradingBottomSheetService = this.bottomSheetService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingBottomSheetService, "get(...)");
        LocalizedDateTimeFormatter localizedDateTimeFormatter = this.localizedDateTimeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(localizedDateTimeFormatter, "get(...)");
        ProfitAndLossDetailStore profitAndLossDetailStore = this.profitAndLossDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossDetailStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(duxoBundle, cryptoOrderDetailStateProvider, appType, cryptoAccountStore, cryptoOrderStore, cryptoExperimentsStore, eventLogger, experimentsStore, cryptoTradingBottomSheetService, localizedDateTimeFormatter, profitAndLossDetailStore, accountProvider, savedStateHandle);
    }

    /* compiled from: CryptoOrderDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jp\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderDetailDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoOrderDetailStateProvider> stateProvider, Provider<AppType> appType, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoOrderStore> cryptoOrderStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<AccountProvider> accountProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderDetailDuxo_Factory(duxoBundle, stateProvider, appType, cryptoAccountStore, cryptoOrderStore, cryptoExperimentsStore, eventLogger, experimentsStore, bottomSheetService, localizedDateTimeFormatter, profitAndLossDetailStore, accountProvider, savedStateHandle);
        }

        @JvmStatic
        public final CryptoOrderDetailDuxo newInstance(DuxoBundle duxoBundle, CryptoOrderDetailStateProvider stateProvider, AppType appType, CryptoAccountStore cryptoAccountStore, CryptoOrderStore cryptoOrderStore, CryptoExperimentsStore cryptoExperimentsStore, EventLogger eventLogger, ExperimentsStore experimentsStore, CryptoTradingBottomSheetService bottomSheetService, LocalizedDateTimeFormatter localizedDateTimeFormatter, ProfitAndLossDetailStore profitAndLossDetailStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderDetailDuxo(duxoBundle, stateProvider, appType, cryptoAccountStore, cryptoOrderStore, cryptoExperimentsStore, eventLogger, experimentsStore, bottomSheetService, localizedDateTimeFormatter, profitAndLossDetailStore, accountProvider, savedStateHandle);
        }
    }
}
