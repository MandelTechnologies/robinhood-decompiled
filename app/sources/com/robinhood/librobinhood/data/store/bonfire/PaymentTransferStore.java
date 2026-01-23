package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.HasTransferredFundsToRhcPref;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.PaymentTransferDao;
import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import com.robinhood.models.p320db.NonOriginatedAchTransfer2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.p320db.bonfire.PaymentTransfer2;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.SepaCreditTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.transfers.api.ApiPaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.ApiPaymentTransferUpdateResponse;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: PaymentTransferStore.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0018J#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010!J3\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0(2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00162\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000204078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020=0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R,\u0010A\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140@\u0012\u0004\u0012\u00020\r0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR&\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR&\u0010E\u001a\u0014\u0012\u0004\u0012\u00020D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010BR\u0017\u0010G\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020-0K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0K8\u0006¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020\r0K8\u0006¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010OR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\r0K8\u0006¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010OR\u0017\u0010V\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bV\u0010H\u001a\u0004\bW\u0010J¨\u0006X"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/models/dao/PaymentTransferDao;", "paymentTransferDao", "Lcom/robinhood/prefs/BooleanPreference;", "hasTransferredFundsToRhcPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/models/dao/PaymentTransferDao;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "page", "", "checkHasTransferredFundsIntoRhc", "(Ljava/util/List;)V", "Ljava/util/UUID;", "id", "", "force", "Lio/reactivex/Observable;", "getPaymentTransfer", "(Ljava/util/UUID;Z)Lio/reactivex/Observable;", "refreshPaginated", "(Z)V", "Lcom/robinhood/transfers/models/db/AchTransfer;", "getAchTransfer", "getAchTransfers", "(Z)Lio/reactivex/Observable;", "Lio/reactivex/Completable;", "abortAchTransfer", "(Ljava/util/UUID;)Lio/reactivex/Completable;", "cancelTransfer", "", "rhsAccountNumber", "j$/time/Instant", "since", "forceRefresh", "Lkotlinx/coroutines/flow/Flow;", "getLatestDepositForAccount", "(Ljava/lang/String;Lj$/time/Instant;Z)Lkotlinx/coroutines/flow/Flow;", "getRhyFundingTransfers", "()Lio/reactivex/Observable;", "Lcom/robinhood/models/db/NonOriginatedAchTransfer;", "getNonOriginatedAchTransfer", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "Lcom/robinhood/models/dao/PaymentTransferDao;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/transfers/api/ApiPaymentTransfer;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/api/PaginatedEndpoint;", "paginatedEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "abortEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/transfers/api/ApiPaymentTransferUpdateResponse;", "cancelEndpoint", "Lcom/robinhood/android/moria/db/Query;", "Lkotlin/Pair;", "paymentTransferQuery", "Lcom/robinhood/android/moria/db/Query;", "rhsOaTransfersQuery", "Lcom/robinhood/android/models/transfer/shared/AccountType;", "queryByAccountType", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "nonOriginatedAchTransferHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getNonOriginatedAchTransferHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "rhsNoaHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getRhsNoaHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "rhsOaHistoryLoaderCallbacks", "getRhsOaHistoryLoaderCallbacks", "rhyTransferHistoryLoaderCallbacks", "getRhyTransferHistoryLoaderCallbacks", "rhceTransferHistoryLoaderCallbacks", "getRhceTransferHistoryLoaderCallbacks", "sepaCreditHistoryTransactionLoader", "getSepaCreditHistoryTransactionLoader", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PaymentTransferStore extends Store {
    private final PostEndpoint<UUID, Unit> abortEndpoint;
    private final PostEndpoint<UUID, ApiPaymentTransferUpdateResponse> cancelEndpoint;
    private final Endpoint<UUID, ApiPaymentTransfer> endpoint;
    private final BooleanPreference hasTransferredFundsToRhcPref;
    private final HistoryTransactionLoader nonOriginatedAchTransferHistoryTransactionLoader;
    private final PaginatedEndpoint<Unit, ApiPaymentTransfer> paginatedEndpoint;
    private final PaymentTransferDao paymentTransferDao;
    private final Query<Tuples2<UUID, Boolean>, PaymentTransfer> paymentTransferQuery;
    private final Query<AccountType, List<PaymentTransfer>> queryByAccountType;
    private final HistoryLoader.Callbacks<PaymentTransfer> rhceTransferHistoryLoaderCallbacks;
    private final HistoryLoader.Callbacks<NonOriginatedAchTransfer> rhsNoaHistoryLoaderCallbacks;
    private final HistoryLoader.Callbacks<AchTransfer> rhsOaHistoryLoaderCallbacks;
    private final Query<Boolean, List<PaymentTransfer>> rhsOaTransfersQuery;
    private final HistoryLoader.Callbacks<PaymentTransfer> rhyTransferHistoryLoaderCallbacks;
    private final HistoryTransactionLoader sepaCreditHistoryTransactionLoader;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentTransferStore(TransfersBonfireApi transfersBonfireApi, PaymentTransferDao paymentTransferDao, @HasTransferredFundsToRhcPref BooleanPreference hasTransferredFundsToRhcPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(paymentTransferDao, "paymentTransferDao");
        Intrinsics.checkNotNullParameter(hasTransferredFundsToRhcPref, "hasTransferredFundsToRhcPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.paymentTransferDao = paymentTransferDao;
        this.hasTransferredFundsToRhcPref = hasTransferredFundsToRhcPref;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PaymentTransferStore$endpoint$1(transfersBonfireApi), getLogoutKillswitch(), new PaymentTransferStore$endpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        PaymentTransferStore$paginatedEndpoint$1 paymentTransferStore$paginatedEndpoint$1 = new PaymentTransferStore$paginatedEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        PaymentTransferStore$paginatedEndpoint$2 paymentTransferStore$paginatedEndpoint$2 = new PaymentTransferStore$paginatedEndpoint$2(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.paginatedEndpoint = companion.create(paymentTransferStore$paginatedEndpoint$1, logoutKillswitch, paymentTransferStore$paginatedEndpoint$2, clock, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.abortEndpoint = companion2.create(new PaymentTransferStore$abortEndpoint$1(transfersBonfireApi), new PaymentTransferStore$abortEndpoint$2(this, null));
        this.cancelEndpoint = companion2.create(new PaymentTransferStore$cancelEndpoint$1(transfersBonfireApi), new PaymentTransferStore$cancelEndpoint$2(this, null));
        Query.Companion companion3 = Query.INSTANCE;
        this.paymentTransferQuery = Store.create$default(this, companion3, "getPaymentTransfer", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentTransferStore.paymentTransferQuery$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentTransferStore.paymentTransferQuery$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.rhsOaTransfersQuery = Store.create$default(this, companion3, "getRhsOaTransfers", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentTransferStore.rhsOaTransfersQuery$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentTransferStore.rhsOaTransfersQuery$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, false, 8, null);
        this.queryByAccountType = Store.create$default(this, companion3, "getPaymentTransfersByAccountType", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentTransferStore.queryByAccountType$lambda$4(this.f$0, (AccountType) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentTransferStore.queryByAccountType$lambda$5(this.f$0, (AccountType) obj);
            }
        }, false, 8, null);
        this.nonOriginatedAchTransferHistoryTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$nonOriginatedAchTransferHistoryTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.NON_ORIGINATED_REDIRECTED_ACH_TRANSFER}));
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getNonOriginatedAchTransfer(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<MinervaTransaction.NonOriginatedAch>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$nonOriginatedAchTransferHistoryTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MinervaTransaction.NonOriginatedAch> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$nonOriginatedAchTransferHistoryTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$nonOriginatedAchTransferHistoryTransactionLoader$1$load$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$nonOriginatedAchTransferHistoryTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                MinervaTransaction.NonOriginatedAch nonOriginatedAch = new MinervaTransaction.NonOriginatedAch((NonOriginatedAchTransfer) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(nonOriginatedAch, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
        this.rhsNoaHistoryLoaderCallbacks = new HistoryLoader.Callbacks<NonOriginatedAchTransfer>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.NON_ORIGINATED_REDIRECTED_ACH_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            private final boolean getOnlyRedirectedRhsNoas(HistoryLoader.Filter filter) {
                return Intrinsics.areEqual(filter.getTypes(), EnumSet.of(HistoryTransactionType.NON_ORIGINATED_REDIRECTED_ACH_TRANSFER));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return FlowKt.filterNotNull(this.this$0.paymentTransferDao.countTotalRhsNoa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), getOnlyRedirectedRhsNoas(filter), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.paymentTransferDao.countLaterRhsNoa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, getOnlyRedirectedRhsNoas(filter), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<NonOriginatedAchTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                final Flow<List<PaymentTransfer>> latestRhsNoa = this.this$0.paymentTransferDao.getLatestRhsNoa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), limit, getOnlyRedirectedRhsNoas(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends NonOriginatedAchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends NonOriginatedAchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = latestRhsNoa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toNonOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<NonOriginatedAchTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow<List<PaymentTransfer>> laterRhsNoa = this.this$0.paymentTransferDao.getLaterRhsNoa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, getOnlyRedirectedRhsNoas(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends NonOriginatedAchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends NonOriginatedAchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = laterRhsNoa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLater$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLater$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getLater$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toNonOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<NonOriginatedAchTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow<List<PaymentTransfer>> rhsNoa = this.this$0.paymentTransferDao.getRhsNoa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, getOnlyRedirectedRhsNoas(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends NonOriginatedAchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$get$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends NonOriginatedAchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = rhsNoa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$get$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$get$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$get$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toNonOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<NonOriginatedAchTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow<List<PaymentTransfer>> earlierRhsNoa = this.this$0.paymentTransferDao.getEarlierRhsNoa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, getOnlyRedirectedRhsNoas(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends NonOriginatedAchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends NonOriginatedAchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = earlierRhsNoa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsNoaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toNonOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
        this.rhsOaHistoryLoaderCallbacks = new HistoryLoader.Callbacks<AchTransfer>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.ORIGINATED_ACH_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            private final Set<String> accountNumbersForFilter(HistoryLoader.Filter filter) {
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                if (supportedAccountNumbers.isEmpty()) {
                    return null;
                }
                return supportedAccountNumbers;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return FlowKt.filterNotNull(this.this$0.paymentTransferDao.countTotalRhsOa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), accountNumbersForFilter(filter), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return FlowKt.filterNotNull(this.this$0.paymentTransferDao.countLaterRhsOa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, accountNumbersForFilter(filter), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AchTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                final Flow<List<PaymentTransfer>> latestRhsOa = this.this$0.paymentTransferDao.getLatestRhsOa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), limit, accountNumbersForFilter(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends AchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends AchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = latestRhsOa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLatest$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AchTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                final Flow<List<PaymentTransfer>> laterRhsOa = this.this$0.paymentTransferDao.getLaterRhsOa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, accountNumbersForFilter(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends AchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends AchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = laterRhsOa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLater$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLater$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getLater$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AchTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                final Flow<List<PaymentTransfer>> rhsOa = this.this$0.paymentTransferDao.getRhsOa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, accountNumbersForFilter(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends AchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$get$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends AchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = rhsOa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$get$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$get$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$get$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AchTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                final Flow<List<PaymentTransfer>> earlierRhsOa = this.this$0.paymentTransferDao.getEarlierRhsOa(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, accountNumbersForFilter(filter), filter.getIsFilteringByGoldDepositBoost());
                return new Flow<List<? extends AchTransfer>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends AchTransfer>> flowCollector, Continuation continuation) {
                        Object objCollect = earlierRhsOa.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhsOaHistoryLoaderCallbacks$1$getEarlier$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(PaymentTransfers5.toOriginatedAchTransfer((PaymentTransfer) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
        this.rhyTransferHistoryLoaderCallbacks = new HistoryLoader.Callbacks<PaymentTransfer>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhyTransferHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.DEBIT_CARD_TRANSFER, HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER, HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER, HistoryTransactionType.INTERNAL_TRANSFER, HistoryTransactionType.INSTANT_BANK_TRANSFER, HistoryTransactionType.CHECK_TRANSFER, HistoryTransactionType.INCOMING_WIRE, HistoryTransactionType.OUTGOING_WIRE, HistoryTransactionType.UK_BANK_TRANSFER, HistoryTransactionType.UK_OPEN_BANKING_TRANSFER, HistoryTransactionType.ROLLOVER_ACH);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.JOINT_TENANCY_WITH_ROS, BrokerageAccountType.ISA_STOCKS_AND_SHARES);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                PaymentTransferDao paymentTransferDao2 = this.this$0.paymentTransferDao;
                Set<TransferState> paymentTransferStates = PaymentTransfer2.getPaymentTransferStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                boolean zIsFilteringByAccountNumber = filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes());
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return FlowKt.filterNotNull(paymentTransferDao2.countTotalRhyTransfer(paymentTransferStates, since, before, zIsFilteringByAccountNumber, supportedAccountNumbers, staticFilter != null ? staticFilter.getRhyAccountId() : null, filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                PaymentTransferDao paymentTransferDao2 = this.this$0.paymentTransferDao;
                Set<TransferState> paymentTransferStates = PaymentTransfer2.getPaymentTransferStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                boolean zIsFilteringByAccountNumber = filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes());
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return FlowKt.filterNotNull(paymentTransferDao2.countLaterRhyTransfer(paymentTransferStates, since, before, zIsFilteringByAccountNumber, supportedAccountNumbers, staticFilter != null ? staticFilter.getRhyAccountId() : null, timestamp, id, filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                PaymentTransferDao paymentTransferDao2 = this.this$0.paymentTransferDao;
                Set<TransferState> paymentTransferStates = PaymentTransfer2.getPaymentTransferStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                boolean zIsFilteringByAccountNumber = filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes());
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return paymentTransferDao2.getLatestRhyTransfer(paymentTransferStates, since, before, zIsFilteringByAccountNumber, supportedAccountNumbers, staticFilter != null ? staticFilter.getRhyAccountId() : null, limit, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                PaymentTransferDao paymentTransferDao2 = this.this$0.paymentTransferDao;
                Set<TransferState> paymentTransferStates = PaymentTransfer2.getPaymentTransferStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                boolean zIsFilteringByAccountNumber = filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes());
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return paymentTransferDao2.getLaterRhyTransfer(paymentTransferStates, since, before, zIsFilteringByAccountNumber, supportedAccountNumbers, staticFilter != null ? staticFilter.getRhyAccountId() : null, timestamp, id, limit, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                PaymentTransferDao paymentTransferDao2 = this.this$0.paymentTransferDao;
                Set<TransferState> paymentTransferStates = PaymentTransfer2.getPaymentTransferStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                boolean zIsFilteringByAccountNumber = filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes());
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return paymentTransferDao2.getRhyTransfer(paymentTransferStates, since, before, zIsFilteringByAccountNumber, supportedAccountNumbers, staticFilter != null ? staticFilter.getRhyAccountId() : null, timestamp, id, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                PaymentTransferDao paymentTransferDao2 = this.this$0.paymentTransferDao;
                Set<TransferState> paymentTransferStates = PaymentTransfer2.getPaymentTransferStates(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                boolean zIsFilteringByAccountNumber = filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes());
                Set<String> supportedAccountNumbers = filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes());
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return paymentTransferDao2.getEarlierRhyTransfer(paymentTransferStates, since, before, zIsFilteringByAccountNumber, supportedAccountNumbers, staticFilter != null ? staticFilter.getRhyAccountId() : null, timestamp, id, limit, filter.getIsFilteringByGoldDepositBoost());
            }
        };
        this.rhceTransferHistoryLoaderCallbacks = new HistoryLoader.Callbacks<PaymentTransfer>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$rhceTransferHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.SEPA_CREDIT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return FlowKt.filterNotNull(this.this$0.paymentTransferDao.countTotalRhceTransfer(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return FlowKt.filterNotNull(this.this$0.paymentTransferDao.countLaterRhceTransfer(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return this.this$0.paymentTransferDao.getLatestRhceTransfer(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return this.this$0.paymentTransferDao.getLaterRhceTransfer(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return this.this$0.paymentTransferDao.getRhceTransfer(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PaymentTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return this.this$0.paymentTransferDao.getEarlierRhceTransfer(PaymentTransfer2.getPaymentTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }
        };
        this.sepaCreditHistoryTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$sepaCreditHistoryTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.SEPA_CREDIT);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getPaymentTransfer$default(this.this$0, reference.getSourceId(), false, 2, null)), Integer.MAX_VALUE, null, 2, null);
                return new Flow<SepaCreditTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$sepaCreditHistoryTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super SepaCreditTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$sepaCreditHistoryTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$sepaCreditHistoryTransactionLoader$1$load$$inlined$map$1$2", m3645f = "PaymentTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$sepaCreditHistoryTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                SepaCreditTransaction sepaCreditTransaction = new SepaCreditTransaction((PaymentTransfer) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(sepaCreditTransaction, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job paymentTransferQuery$lambda$0(PaymentTransferStore paymentTransferStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return Endpoint.DefaultImpls.refresh$default(paymentTransferStore.endpoint, (UUID) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paymentTransferQuery$lambda$1(PaymentTransferStore paymentTransferStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return paymentTransferStore.paymentTransferDao.getPaymentTransfer((UUID) tuples2.component1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job rhsOaTransfersQuery$lambda$2(PaymentTransferStore paymentTransferStore, boolean z) {
        return PaginatedEndpointKt.refreshAllPages(paymentTransferStore.paginatedEndpoint, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow rhsOaTransfersQuery$lambda$3(PaymentTransferStore paymentTransferStore, boolean z) {
        return paymentTransferStore.paymentTransferDao.getRhsOa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryByAccountType$lambda$4(PaymentTransferStore paymentTransferStore, AccountType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.refreshAllPages$default(paymentTransferStore.paginatedEndpoint, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryByAccountType$lambda$5(PaymentTransferStore paymentTransferStore, AccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return PaymentTransferDao.DefaultImpls.getTransfersByAccountType$default(paymentTransferStore.paymentTransferDao, accountType, accountType, null, 4, null);
    }

    public static /* synthetic */ Observable getPaymentTransfer$default(PaymentTransferStore paymentTransferStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return paymentTransferStore.getPaymentTransfer(uuid, z);
    }

    public final Observable<PaymentTransfer> getPaymentTransfer(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.paymentTransferQuery.asObservable(Tuples4.m3642to(id, Boolean.valueOf(force)));
    }

    public final void refreshPaginated(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.paginatedEndpoint, force);
    }

    public static /* synthetic */ Observable getAchTransfer$default(PaymentTransferStore paymentTransferStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return paymentTransferStore.getAchTransfer(uuid, z);
    }

    public final Observable<AchTransfer> getAchTransfer(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable map = this.paymentTransferQuery.asObservable(Tuples4.m3642to(id, Boolean.valueOf(force))).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore.getAchTransfer.1
            @Override // io.reactivex.functions.Function
            public final AchTransfer apply(PaymentTransfer p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return PaymentTransfers5.toOriginatedAchTransfer(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Observable getAchTransfers$default(PaymentTransferStore paymentTransferStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return paymentTransferStore.getAchTransfers(z);
    }

    public final Observable<List<AchTransfer>> getAchTransfers(boolean force) {
        Observable map = this.rhsOaTransfersQuery.asObservable(Boolean.valueOf(force)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore.getAchTransfers.1
            @Override // io.reactivex.functions.Function
            public final List<AchTransfer> apply(List<PaymentTransfer> paymentTransfers) {
                Intrinsics.checkNotNullParameter(paymentTransfers, "paymentTransfers");
                List<PaymentTransfer> list = paymentTransfers;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(PaymentTransfers5.toOriginatedAchTransfer((PaymentTransfer) it.next()));
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: PaymentTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$abortAchTransfer$1", m3645f = "PaymentTransferStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$abortAchTransfer$1 */
    static final class C345241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345241(UUID uuid, Continuation<? super C345241> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentTransferStore.this.new C345241(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = PaymentTransferStore.this.abortEndpoint;
                UUID uuid = this.$id;
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable abortAchTransfer(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C345241(id, null), 1, null);
    }

    /* compiled from: PaymentTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$cancelTransfer$1", m3645f = "PaymentTransferStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$cancelTransfer$1 */
    static final class C345251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345251(UUID uuid, Continuation<? super C345251> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentTransferStore.this.new C345251(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = PaymentTransferStore.this.cancelEndpoint;
                UUID uuid = this.$id;
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable cancelTransfer(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C345251(id, null), 1, null);
    }

    public static /* synthetic */ Flow getLatestDepositForAccount$default(PaymentTransferStore paymentTransferStore, String str, Instant instant, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return paymentTransferStore.getLatestDepositForAccount(str, instant, z);
    }

    public final Flow<PaymentTransfer> getLatestDepositForAccount(String rhsAccountNumber, Instant since, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        PaginatedEndpointKt.refreshAllPages(this.paginatedEndpoint, forceRefresh);
        return this.paymentTransferDao.getLatestDepositForAccount(rhsAccountNumber, since);
    }

    public final Observable<List<PaymentTransfer>> getRhyFundingTransfers() {
        return this.queryByAccountType.asObservable(AccountType.RHY_ACCOUNT);
    }

    public final Observable<NonOriginatedAchTransfer> getNonOriginatedAchTransfer(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable map = this.paymentTransferQuery.asObservable(Tuples4.m3642to(id, Boolean.FALSE)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore.getNonOriginatedAchTransfer.1
            @Override // io.reactivex.functions.Function
            public final NonOriginatedAchTransfer apply(PaymentTransfer paymentTransfer) {
                Intrinsics.checkNotNullParameter(paymentTransfer, "paymentTransfer");
                ApiPaymentTransferDetails details = paymentTransfer.getDetails();
                ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer apiNonOriginatedAchTransfer = details instanceof ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer ? (ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer) details : null;
                if (apiNonOriginatedAchTransfer == null) {
                    throw new ClassCastException("Invalid NOA details for transfer. Id: " + paymentTransfer.getId());
                }
                return NonOriginatedAchTransfer2.toDbModel(apiNonOriginatedAchTransfer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHasTransferredFundsIntoRhc(List<PaymentTransfer> page) {
        if (this.hasTransferredFundsToRhcPref.get()) {
            return;
        }
        List<PaymentTransfer> list = page;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (PaymentTransfer paymentTransfer : list) {
            if (paymentTransfer.getTransferType() == TransferType.SEPA_CREDIT && paymentTransfer.getAdjustment().getDirection() == Money.Direction.CREDIT) {
                this.hasTransferredFundsToRhcPref.set(true);
                return;
            }
        }
    }

    public final HistoryTransactionLoader getNonOriginatedAchTransferHistoryTransactionLoader() {
        return this.nonOriginatedAchTransferHistoryTransactionLoader;
    }

    public final HistoryLoader.Callbacks<NonOriginatedAchTransfer> getRhsNoaHistoryLoaderCallbacks() {
        return this.rhsNoaHistoryLoaderCallbacks;
    }

    public final HistoryLoader.Callbacks<AchTransfer> getRhsOaHistoryLoaderCallbacks() {
        return this.rhsOaHistoryLoaderCallbacks;
    }

    public final HistoryLoader.Callbacks<PaymentTransfer> getRhyTransferHistoryLoaderCallbacks() {
        return this.rhyTransferHistoryLoaderCallbacks;
    }

    public final HistoryLoader.Callbacks<PaymentTransfer> getRhceTransferHistoryLoaderCallbacks() {
        return this.rhceTransferHistoryLoaderCallbacks;
    }

    public final HistoryTransactionLoader getSepaCreditHistoryTransactionLoader() {
        return this.sepaCreditHistoryTransactionLoader;
    }
}
