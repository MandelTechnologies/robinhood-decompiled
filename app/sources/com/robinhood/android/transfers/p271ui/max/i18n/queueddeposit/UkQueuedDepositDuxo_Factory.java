package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.TransferRequestCreator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.sortinghat.SortingHatApi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "ukCreateTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "mcwTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class UkQueuedDepositDuxo_Factory implements Factory<UkQueuedDepositDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<CardManager> cardManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FxRatesProvider> fxRatesProvider;
    private final Provider<TransferRequestCreator> mcwTransferRequestCreator;
    private final Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SortingHatApi> sortingHatApi;
    private final Provider<UkQueuedDepositStateProvider> stateProvider;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<InternationalCreateTransferRequestFactory> ukCreateTransferRequestFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final UkQueuedDepositDuxo_Factory create(Provider<UkQueuedDepositStateProvider> provider, Provider<AccountProvider> provider2, Provider<EventLogger> provider3, Provider<ExperimentsStore> provider4, Provider<FxRatesProvider> provider5, Provider<TransfersBonfireApi> provider6, Provider<PaymentInstrumentBonfireApi> provider7, Provider<InternationalCreateTransferRequestFactory> provider8, Provider<TransferRequestCreator> provider9, Provider<SortingHatApi> provider10, Provider<CardManager> provider11, Provider<DuxoBundle> provider12, Provider<SavedStateHandle> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final UkQueuedDepositDuxo newInstance(UkQueuedDepositStateProvider ukQueuedDepositStateProvider, AccountProvider accountProvider, EventLogger eventLogger, ExperimentsStore experimentsStore, FxRatesProvider fxRatesProvider, TransfersBonfireApi transfersBonfireApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory, TransferRequestCreator transferRequestCreator, SortingHatApi sortingHatApi, CardManager cardManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(ukQueuedDepositStateProvider, accountProvider, eventLogger, experimentsStore, fxRatesProvider, transfersBonfireApi, paymentInstrumentBonfireApi, internationalCreateTransferRequestFactory, transferRequestCreator, sortingHatApi, cardManager, duxoBundle, savedStateHandle);
    }

    public UkQueuedDepositDuxo_Factory(Provider<UkQueuedDepositStateProvider> stateProvider, Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<FxRatesProvider> fxRatesProvider, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<InternationalCreateTransferRequestFactory> ukCreateTransferRequestFactory, Provider<TransferRequestCreator> mcwTransferRequestCreator, Provider<SortingHatApi> sortingHatApi, Provider<CardManager> cardManager, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(ukCreateTransferRequestFactory, "ukCreateTransferRequestFactory");
        Intrinsics.checkNotNullParameter(mcwTransferRequestCreator, "mcwTransferRequestCreator");
        Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.stateProvider = stateProvider;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.fxRatesProvider = fxRatesProvider;
        this.transfersBonfireApi = transfersBonfireApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.ukCreateTransferRequestFactory = ukCreateTransferRequestFactory;
        this.mcwTransferRequestCreator = mcwTransferRequestCreator;
        this.sortingHatApi = sortingHatApi;
        this.cardManager = cardManager;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public UkQueuedDepositDuxo get() {
        Companion companion = INSTANCE;
        UkQueuedDepositStateProvider ukQueuedDepositStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(ukQueuedDepositStateProvider, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        FxRatesProvider fxRatesProvider = this.fxRatesProvider.get();
        Intrinsics.checkNotNullExpressionValue(fxRatesProvider, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory = this.ukCreateTransferRequestFactory.get();
        Intrinsics.checkNotNullExpressionValue(internationalCreateTransferRequestFactory, "get(...)");
        TransferRequestCreator transferRequestCreator = this.mcwTransferRequestCreator.get();
        Intrinsics.checkNotNullExpressionValue(transferRequestCreator, "get(...)");
        SortingHatApi sortingHatApi = this.sortingHatApi.get();
        Intrinsics.checkNotNullExpressionValue(sortingHatApi, "get(...)");
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(ukQueuedDepositStateProvider, accountProvider, eventLogger, experimentsStore, fxRatesProvider, transfersBonfireApi, paymentInstrumentBonfireApi, internationalCreateTransferRequestFactory, transferRequestCreator, sortingHatApi, cardManager, duxoBundle, savedStateHandle);
    }

    /* compiled from: UkQueuedDepositDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jp\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "ukCreateTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "mcwTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UkQueuedDepositDuxo_Factory create(Provider<UkQueuedDepositStateProvider> stateProvider, Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<FxRatesProvider> fxRatesProvider, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<InternationalCreateTransferRequestFactory> ukCreateTransferRequestFactory, Provider<TransferRequestCreator> mcwTransferRequestCreator, Provider<SortingHatApi> sortingHatApi, Provider<CardManager> cardManager, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(ukCreateTransferRequestFactory, "ukCreateTransferRequestFactory");
            Intrinsics.checkNotNullParameter(mcwTransferRequestCreator, "mcwTransferRequestCreator");
            Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new UkQueuedDepositDuxo_Factory(stateProvider, accountProvider, eventLogger, experimentsStore, fxRatesProvider, transfersBonfireApi, paymentInstrumentBonfireApi, ukCreateTransferRequestFactory, mcwTransferRequestCreator, sortingHatApi, cardManager, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final UkQueuedDepositDuxo newInstance(UkQueuedDepositStateProvider stateProvider, AccountProvider accountProvider, EventLogger eventLogger, ExperimentsStore experimentsStore, FxRatesProvider fxRatesProvider, TransfersBonfireApi transfersBonfireApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, InternationalCreateTransferRequestFactory ukCreateTransferRequestFactory, TransferRequestCreator mcwTransferRequestCreator, SortingHatApi sortingHatApi, CardManager cardManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(ukCreateTransferRequestFactory, "ukCreateTransferRequestFactory");
            Intrinsics.checkNotNullParameter(mcwTransferRequestCreator, "mcwTransferRequestCreator");
            Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new UkQueuedDepositDuxo(stateProvider, accountProvider, eventLogger, experimentsStore, fxRatesProvider, transfersBonfireApi, paymentInstrumentBonfireApi, ukCreateTransferRequestFactory, mcwTransferRequestCreator, sortingHatApi, cardManager, duxoBundle, savedStateHandle);
        }
    }
}
