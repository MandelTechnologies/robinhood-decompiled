package com.robinhood.android.lib.transfers;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.librobinhood.data.store.bonfire.TransferPrecreateStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.prefs.StringToLongMapPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFactoryForV2_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/TransferFactoryForV2_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "paymentMethodLastUsagesPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "transferPrecreateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferPrecreateStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "requestFactory", "Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class TransferFactoryForV2_Factory implements Factory<TransferFactoryForV2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<EventLogger> eventLogger;
    private final Provider<StringToLongMapPreference> paymentMethodLastUsagesPref;
    private final Provider<CreateTransferV2RequestFactory> requestFactory;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;
    private final Provider<TransferV2LimitsStore> transferLimitsStore;
    private final Provider<TransferPrecreateStore> transferPrecreateStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<WonkaServiceManager> wonkaServiceManager;

    @JvmStatic
    public static final TransferFactoryForV2_Factory create(Provider<StringToLongMapPreference> provider, Provider<TransferPrecreateStore> provider2, Provider<TransfersBonfireApi> provider3, Provider<EventLogger> provider4, Provider<CreateTransferV2RequestFactory> provider5, Provider<SuvWorkflowManager> provider6, Provider<BffMoneyMovementService> provider7, Provider<WonkaServiceManager> provider8, Provider<TransferV2LimitsStore> provider9, Provider<BaseSortingHatStore> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final TransferFactoryForV2 newInstance(StringToLongMapPreference stringToLongMapPreference, TransferPrecreateStore transferPrecreateStore, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, CreateTransferV2RequestFactory createTransferV2RequestFactory, SuvWorkflowManager suvWorkflowManager, BffMoneyMovementService bffMoneyMovementService, WonkaServiceManager wonkaServiceManager, TransferV2LimitsStore transferV2LimitsStore, BaseSortingHatStore baseSortingHatStore) {
        return INSTANCE.newInstance(stringToLongMapPreference, transferPrecreateStore, transfersBonfireApi, eventLogger, createTransferV2RequestFactory, suvWorkflowManager, bffMoneyMovementService, wonkaServiceManager, transferV2LimitsStore, baseSortingHatStore);
    }

    public TransferFactoryForV2_Factory(Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<TransferPrecreateStore> transferPrecreateStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<EventLogger> eventLogger, Provider<CreateTransferV2RequestFactory> requestFactory, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<WonkaServiceManager> wonkaServiceManager, Provider<TransferV2LimitsStore> transferLimitsStore, Provider<BaseSortingHatStore> sortingHatStore) {
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(transferPrecreateStore, "transferPrecreateStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.transferPrecreateStore = transferPrecreateStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.requestFactory = requestFactory;
        this.suvWorkflowManager = suvWorkflowManager;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.wonkaServiceManager = wonkaServiceManager;
        this.transferLimitsStore = transferLimitsStore;
        this.sortingHatStore = sortingHatStore;
    }

    @Override // javax.inject.Provider
    public TransferFactoryForV2 get() {
        Companion companion = INSTANCE;
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        TransferPrecreateStore transferPrecreateStore = this.transferPrecreateStore.get();
        Intrinsics.checkNotNullExpressionValue(transferPrecreateStore, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        CreateTransferV2RequestFactory createTransferV2RequestFactory = this.requestFactory.get();
        Intrinsics.checkNotNullExpressionValue(createTransferV2RequestFactory, "get(...)");
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        WonkaServiceManager wonkaServiceManager = this.wonkaServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(wonkaServiceManager, "get(...)");
        TransferV2LimitsStore transferV2LimitsStore = this.transferLimitsStore.get();
        Intrinsics.checkNotNullExpressionValue(transferV2LimitsStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        return companion.newInstance(stringToLongMapPreference, transferPrecreateStore, transfersBonfireApi, eventLogger, createTransferV2RequestFactory, suvWorkflowManager, bffMoneyMovementService, wonkaServiceManager, transferV2LimitsStore, baseSortingHatStore);
    }

    /* compiled from: TransferFactoryForV2_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/TransferFactoryForV2_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2_Factory;", "paymentMethodLastUsagesPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "transferPrecreateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferPrecreateStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "requestFactory", "Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "newInstance", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferFactoryForV2_Factory create(Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<TransferPrecreateStore> transferPrecreateStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<EventLogger> eventLogger, Provider<CreateTransferV2RequestFactory> requestFactory, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<WonkaServiceManager> wonkaServiceManager, Provider<TransferV2LimitsStore> transferLimitsStore, Provider<BaseSortingHatStore> sortingHatStore) {
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(transferPrecreateStore, "transferPrecreateStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            return new TransferFactoryForV2_Factory(paymentMethodLastUsagesPref, transferPrecreateStore, transfersBonfireApi, eventLogger, requestFactory, suvWorkflowManager, bffMoneyMovementService, wonkaServiceManager, transferLimitsStore, sortingHatStore);
        }

        @JvmStatic
        public final TransferFactoryForV2 newInstance(StringToLongMapPreference paymentMethodLastUsagesPref, TransferPrecreateStore transferPrecreateStore, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, CreateTransferV2RequestFactory requestFactory, SuvWorkflowManager suvWorkflowManager, BffMoneyMovementService bffMoneyMovementService, WonkaServiceManager wonkaServiceManager, TransferV2LimitsStore transferLimitsStore, BaseSortingHatStore sortingHatStore) {
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(transferPrecreateStore, "transferPrecreateStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            return new TransferFactoryForV2(paymentMethodLastUsagesPref, transferPrecreateStore, transfersBonfireApi, eventLogger, requestFactory, suvWorkflowManager, bffMoneyMovementService, wonkaServiceManager, transferLimitsStore, sortingHatStore);
        }
    }
}
