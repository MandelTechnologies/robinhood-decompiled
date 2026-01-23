package com.robinhood.librobinhood.data.store.bff;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.PaymentIntentDto;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.PaymentIntentDao;
import com.robinhood.models.p320db.bff.PaymentIntent;
import com.robinhood.models.p320db.bff.PaymentIntent3;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: PaymentIntentStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "Lcom/robinhood/store/Store;", "api", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "dao", "Lcom/robinhood/models/dao/PaymentIntentDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/models/dao/PaymentIntentDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Lcom/robinhood/store/StoreBundle;)V", "getPaymentIntents", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lbff_money_movement/service/v1/PaymentIntentDto;", "refresh", "force", "", "streamPaymentIntent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/bff/PaymentIntent;", "id", "Ljava/util/UUID;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader$annotations", "()V", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Companion", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PaymentIntentStore extends Store {
    private static final EnumSet<HistoryTransactionType> PaymentIntentTransactionTypes = EnumSet.of(HistoryTransactionType.I18N_WIRE, HistoryTransactionType.SG_BANK_TRANSFER);
    private final BffMoneyMovementService api;
    private final PaymentIntentDao dao;
    private final ExperimentsStore experimentsStore;
    private final PaginatedEndpoint<Unit, PaymentIntentDto> getPaymentIntents;
    private final HistoryLoader.Callbacks<PaymentIntent> historyLoaderCallbacks;
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final HistoryTransactionLoader transactionLoader;

    public static /* synthetic */ void getTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentStore(BffMoneyMovementService api, PaymentIntentDao dao, ExperimentsStore experimentsStore, PaymentInstrumentStore paymentInstrumentStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.experimentsStore = experimentsStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.getPaymentIntents = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new PaymentIntentStore2(this, null), getLogoutKillswitch(), new PaymentIntentStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bff.PaymentIntentStore$transactionLoader$1

            /* compiled from: PaymentIntentStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.librobinhood.data.store.bff.PaymentIntentStore$transactionLoader$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PaymentIntent.Purpose.values().length];
                    try {
                        iArr[PaymentIntent.Purpose.SG_BANK_TRANSFER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PaymentIntent.Purpose.I18N_WIRE_TRANSFER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PaymentIntent.Purpose.UNKNOWN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionType sourceType = reference.getSourceType();
                EnumSet enumSet = PaymentIntentStore.PaymentIntentTransactionTypes;
                Intrinsics.checkNotNullExpressionValue(enumSet, "access$getPaymentIntentTransactionTypes$cp(...)");
                HistoryTransactionLoader3.validateOneOf(sourceType, enumSet);
                return FlowKt.transformLatest(this.this$0.streamPaymentIntent(reference.getSourceId()), new C34455xce45d6d(null, this.this$0));
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<PaymentIntent>() { // from class: com.robinhood.librobinhood.data.store.bff.PaymentIntentStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = PaymentIntentStore.PaymentIntentTransactionTypes;
            private final EnumSet<BrokerageAccountType> supportedBrokerageAccountTypes = EnumSet.of(BrokerageAccountType.INDIVIDUAL);

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public boolean isInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaymentIntentStore.refresh$default(this.this$0, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(filter.getSince(), filter.getBefore(), PaymentIntent3.getPaymentIntentStates(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, PaymentIntent3.getPaymentIntentStates(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentIntent>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaymentIntentStore.refresh$default(this.this$0, false, 1, null);
                return this.this$0.dao.getLatest(filter.getSince(), filter.getBefore(), limit, PaymentIntent3.getPaymentIntentStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentIntent>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, PaymentIntent3.getPaymentIntentStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentIntent>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id, PaymentIntent3.getPaymentIntentStates(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentIntent>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, PaymentIntent3.getPaymentIntentStates(filter.getState()));
            }
        };
    }

    public static /* synthetic */ void refresh$default(PaymentIntentStore paymentIntentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        paymentIntentStore.refresh(z);
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getPaymentIntents, force);
    }

    public final Flow<PaymentIntent> streamPaymentIntent(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        refresh$default(this, false, 1, null);
        return FlowKt.filterNotNull(this.dao.getById(id));
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<PaymentIntent> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
