package com.robinhood.android.transfers.i18n;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransfersHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "withdrawableAmountBreakdownStore", "Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InternationalTransfersHubDuxo_Factory implements Factory<InternationalTransfersHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<HistoryStore> historyStore;
    private final Provider<PaymentInstrumentStore> paymentInstrumentStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<InternationalTransfersHubStateProvider> stateProvider;
    private final Provider<WithdrawableAmountBreakdownStore> withdrawableAmountBreakdownStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternationalTransfersHubDuxo_Factory create(Provider<AccountProvider> provider, Provider<HistoryStore> provider2, Provider<PaymentInstrumentStore> provider3, Provider<RegionGateProvider> provider4, Provider<WithdrawableAmountBreakdownStore> provider5, Provider<ExperimentsStore> provider6, Provider<SavedStateHandle> provider7, Provider<InternationalTransfersHubStateProvider> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final InternationalTransfersHubDuxo newInstance(AccountProvider accountProvider, HistoryStore historyStore, PaymentInstrumentStore paymentInstrumentStore, RegionGateProvider regionGateProvider, WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, InternationalTransfersHubStateProvider internationalTransfersHubStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, historyStore, paymentInstrumentStore, regionGateProvider, withdrawableAmountBreakdownStore, experimentsStore, savedStateHandle, internationalTransfersHubStateProvider, duxoBundle);
    }

    public InternationalTransfersHubDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<HistoryStore> historyStore, Provider<PaymentInstrumentStore> paymentInstrumentStore, Provider<RegionGateProvider> regionGateProvider, Provider<WithdrawableAmountBreakdownStore> withdrawableAmountBreakdownStore, Provider<ExperimentsStore> experimentsStore, Provider<SavedStateHandle> savedStateHandle, Provider<InternationalTransfersHubStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(withdrawableAmountBreakdownStore, "withdrawableAmountBreakdownStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.historyStore = historyStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.regionGateProvider = regionGateProvider;
        this.withdrawableAmountBreakdownStore = withdrawableAmountBreakdownStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public InternationalTransfersHubDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        PaymentInstrumentStore paymentInstrumentStore = this.paymentInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore = this.withdrawableAmountBreakdownStore.get();
        Intrinsics.checkNotNullExpressionValue(withdrawableAmountBreakdownStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        InternationalTransfersHubStateProvider internationalTransfersHubStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internationalTransfersHubStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, historyStore, paymentInstrumentStore, regionGateProvider, withdrawableAmountBreakdownStore, experimentsStore, savedStateHandle, internationalTransfersHubStateProvider, duxoBundle);
    }

    /* compiled from: InternationalTransfersHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "withdrawableAmountBreakdownStore", "Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternationalTransfersHubDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<HistoryStore> historyStore, Provider<PaymentInstrumentStore> paymentInstrumentStore, Provider<RegionGateProvider> regionGateProvider, Provider<WithdrawableAmountBreakdownStore> withdrawableAmountBreakdownStore, Provider<ExperimentsStore> experimentsStore, Provider<SavedStateHandle> savedStateHandle, Provider<InternationalTransfersHubStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(withdrawableAmountBreakdownStore, "withdrawableAmountBreakdownStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InternationalTransfersHubDuxo_Factory(accountProvider, historyStore, paymentInstrumentStore, regionGateProvider, withdrawableAmountBreakdownStore, experimentsStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final InternationalTransfersHubDuxo newInstance(AccountProvider accountProvider, HistoryStore historyStore, PaymentInstrumentStore paymentInstrumentStore, RegionGateProvider regionGateProvider, WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, InternationalTransfersHubStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(withdrawableAmountBreakdownStore, "withdrawableAmountBreakdownStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InternationalTransfersHubDuxo(accountProvider, historyStore, paymentInstrumentStore, regionGateProvider, withdrawableAmountBreakdownStore, experimentsStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
