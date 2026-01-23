package com.robinhood.librobinhood.data.store;

import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.CryptoCashInterestStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.dao.CryptoCashInterestDao;
import com.robinhood.models.crypto.dao.CryptoCashInterestPaymentDao;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestMembershipDetails;
import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestPayment;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoCashInterestPaymentTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import moneytree.p510v1.GetMembershipDetailsRequestDto;
import moneytree.p510v1.GetMembershipDetailsResponseDto;
import moneytree.p510v1.GetMonthlyInterestHistoryRequestDto;
import moneytree.p510v1.GetMonthlyInterestHistoryResponseDto;
import moneytree.p510v1.InterestService;
import moneytree.p510v1.ListMonthlyInterestHistoryRequestDto;
import moneytree.p510v1.ListMonthlyInterestHistoryResponseDto;
import moneytree.p510v1.MembershipIntentionDto;
import moneytree.p510v1.MembershipService;
import moneytree.p510v1.UpdateMembershipRequestDto;
import moneytree.p510v1.UpdateMembershipResponseDto;
import moneytree.p510v1.VendorDto;
import p479j$.time.Instant;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001CB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J \u00101\u001a\u0002022\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u000204J&\u00105\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00106\u001a\u000207H\u0086@¢\u0006\u0002\u00108J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020%0,2\u0006\u0010:\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u001d0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010;\u001a\u00020<¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020%0@¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006D"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "Lcom/robinhood/store/Store;", "membershipService", "Lmoneytree/v1/MembershipService;", "interestService", "Lmoneytree/v1/InterestService;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoCashInterestDao;", "interestPaymentDao", "Lcom/robinhood/models/crypto/dao/CryptoCashInterestPaymentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lmoneytree/v1/MembershipService;Lmoneytree/v1/InterestService;Lcom/robinhood/models/crypto/dao/CryptoCashInterestDao;Lcom/robinhood/models/crypto/dao/CryptoCashInterestPaymentDao;Lcom/robinhood/store/StoreBundle;)V", "detailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lmoneytree/v1/GetMembershipDetailsRequestDto;", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "enrollmentEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lmoneytree/v1/UpdateMembershipRequestDto;", "Lmoneytree/v1/UpdateMembershipResponseDto;", "historyDetailEndpoint", "Lmoneytree/v1/GetMonthlyInterestHistoryRequestDto;", "Lmoneytree/v1/GetMonthlyInterestHistoryResponseDto;", "requestIdsToMaxUpdatedAts", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "Lcom/robinhood/librobinhood/data/store/RequestId;", "", "historyEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore$AllPaymentsRequestArgs;", "Lcom/robinhood/idl/Response;", "Lmoneytree/v1/ListMonthlyInterestHistoryResponseDto;", "maxUpdatedAt", "", "Lcom/robinhood/models/crypto/db/interest/CryptoCashInterestPayment;", "getMaxUpdatedAt", "(Ljava/util/Collection;)J", "detailsQuery", "Lcom/robinhood/android/moria/db/Query;", "historyQuery", "streamMembershipDetails", "Lkotlinx/coroutines/flow/Flow;", "vendorDto", "Lmoneytree/v1/VendorDto;", "currencyDto", "Lcom/robinhood/rosetta/common/CurrencyDto;", "refreshMembershipDetails", "", "force", "", "updateEnrollment", "intention", "Lmoneytree/v1/MembershipIntentionDto;", "(Lmoneytree/v1/VendorDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lmoneytree/v1/MembershipIntentionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashInterestPayment", "paymentId", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "AllPaymentsRequestArgs", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoCashInterestStore extends Store {
    private final CryptoCashInterestDao dao;
    private final Endpoint<GetMembershipDetailsRequestDto, GetMembershipDetailsResponseDto> detailsEndpoint;
    private final Query<GetMembershipDetailsRequestDto, GetMembershipDetailsResponseDto> detailsQuery;
    private final PostEndpoint<UpdateMembershipRequestDto, UpdateMembershipResponseDto> enrollmentEndpoint;
    private final Endpoint<GetMonthlyInterestHistoryRequestDto, GetMonthlyInterestHistoryResponseDto> historyDetailEndpoint;
    private final IdlPaginatedResponseEndpoint<AllPaymentsRequestArgs, Response<ListMonthlyInterestHistoryResponseDto>> historyEndpoint;
    private final HistoryLoader.Callbacks<CryptoCashInterestPayment> historyLoaderCallbacks;
    private final Query<GetMonthlyInterestHistoryRequestDto, CryptoCashInterestPayment> historyQuery;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final CryptoCashInterestPaymentDao interestPaymentDao;
    private final InterestService interestService;
    private final MembershipService membershipService;
    private final ConcurrentHashMap<UUID, Long> requestIdsToMaxUpdatedAts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCashInterestStore(MembershipService membershipService, InterestService interestService, CryptoCashInterestDao dao, CryptoCashInterestPaymentDao interestPaymentDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(membershipService, "membershipService");
        Intrinsics.checkNotNullParameter(interestService, "interestService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(interestPaymentDao, "interestPaymentDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.membershipService = membershipService;
        this.interestService = interestService;
        this.dao = dao;
        this.interestPaymentDao = interestPaymentDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<GetMembershipDetailsRequestDto, GetMembershipDetailsResponseDto> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new CryptoCashInterestStore$detailsEndpoint$1(membershipService), getLogoutKillswitch(), new CryptoCashInterestStore$detailsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.detailsEndpoint = endpointCreateWithParams$default;
        this.enrollmentEndpoint = PostEndpoint.INSTANCE.create(new CryptoCashInterestStore$enrollmentEndpoint$1(membershipService), new CryptoCashInterestStore$enrollmentEndpoint$2(null));
        Endpoint<GetMonthlyInterestHistoryRequestDto, GetMonthlyInterestHistoryResponseDto> endpointCreate$default = Endpoint.Companion.create$default(companion, new CryptoCashInterestStore$historyDetailEndpoint$1(interestService), getLogoutKillswitch(), new CryptoCashInterestStore$historyDetailEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.historyDetailEndpoint = endpointCreate$default;
        this.requestIdsToMaxUpdatedAts = new ConcurrentHashMap<>();
        this.historyEndpoint = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(IdlPaginatedResponseEndpoint.INSTANCE, new CryptoCashInterestStore$historyEndpoint$1(this, null), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCashInterestStore.historyEndpoint$lambda$0((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCashInterestStore.historyEndpoint$lambda$1((Response) obj);
            }
        }, getLogoutKillswitch(), new CryptoCashInterestStore$historyEndpoint$4(this, null), storeBundle.getClock(), null, 64, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.detailsQuery = Store.create$default(this, companion2, "moneyTreeMembershipDetailsQuery", CollectionsKt.listOf(new RefreshEach(new CryptoCashInterestStore$detailsQuery$1(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCashInterestStore.detailsQuery$lambda$4(this.f$0, (GetMembershipDetailsRequestDto) obj);
            }
        }, false, 8, null);
        this.historyQuery = Store.create$default(this, companion2, "moneyTreeHistoryQuery", CollectionsKt.listOf(new RefreshEach(new CryptoCashInterestStore$historyQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCashInterestStore.historyQuery$lambda$6(this.f$0, (GetMonthlyInterestHistoryRequestDto) obj);
            }
        }, false, 8, null);
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.CRYPTO_CASH_INTEREST_PAYMENT);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.interestPaymentDao.getCryptoCashInterestPayment(reference.getSourceId()));
                return new Flow<CryptoCashInterestPaymentTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoCashInterestPaymentTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoCashInterestStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                CryptoCashInterestPaymentTransaction cryptoCashInterestPaymentTransaction = new CryptoCashInterestPaymentTransaction((CryptoCashInterestPayment) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoCashInterestPaymentTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<CryptoCashInterestPayment>() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.CRYPTO_CASH_INTEREST_PAYMENT);
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes = SetsKt.emptySet();

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(0);
                }
                refreshPaginated();
                return FlowKt.filterNotNull(this.this$0.interestPaymentDao.countTotal(filter.getSince(), filter.getBefore()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.interestPaymentDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoCashInterestPayment>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                refreshPaginated();
                return this.this$0.interestPaymentDao.getLatest(filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoCashInterestPayment>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.interestPaymentDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoCashInterestPayment>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.interestPaymentDao.get(filter.getSince(), filter.getBefore(), timestamp, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoCashInterestPayment>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.interestPaymentDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            private final void refreshPaginated() {
                IdlPaginatedResponseEndpoint idlPaginatedResponseEndpoint = this.this$0.historyEndpoint;
                UUID uuidNewRequestId = CryptoCashInterestStoreKt.newRequestId();
                Intrinsics.checkNotNullExpressionValue(uuidNewRequestId, "access$newRequestId(...)");
                idlPaginatedResponseEndpoint.refreshAllPages(new CryptoCashInterestStore.AllPaymentsRequestArgs(uuidNewRequestId, new ListMonthlyInterestHistoryRequestDto(null, 0, null, null, 15, null)), false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor historyEndpoint$lambda$0(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return CryptoCashInterestStoreKt.toIdlPaginationCursor(((ListMonthlyInterestHistoryResponseDto) response.getData()).getPrevious_cursor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor historyEndpoint$lambda$1(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return CryptoCashInterestStoreKt.toIdlPaginationCursor(((ListMonthlyInterestHistoryResponseDto) response.getData()).getNext_cursor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getMaxUpdatedAt(Collection<CryptoCashInterestPayment> collection) {
        Long l = (Long) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(collection), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(CryptoCashInterestStore._get_maxUpdatedAt_$lambda$2((CryptoCashInterestPayment) obj));
            }
        }));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _get_maxUpdatedAt_$lambda$2(CryptoCashInterestPayment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCreatedAt().toEpochMilli();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow detailsQuery$lambda$4(CryptoCashInterestStore cryptoCashInterestStore, GetMembershipDetailsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Flow<CryptoCashInterestMembershipDetails> cryptoCashInterestMembershipDetails = cryptoCashInterestStore.dao.getCryptoCashInterestMembershipDetails(request.getVendor(), request.getCurrency());
        return new Flow<GetMembershipDetailsResponseDto>() { // from class: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$detailsQuery$lambda$4$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GetMembershipDetailsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = cryptoCashInterestMembershipDetails.collect(new C336872(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$detailsQuery$lambda$4$$inlined$map$1$2 */
            public static final class C336872<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCashInterestStore$detailsQuery$lambda$4$$inlined$map$1$2", m3645f = "CryptoCashInterestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoCashInterestStore$detailsQuery$lambda$4$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336872.this.emit(null, this);
                    }
                }

                public C336872(FlowCollector flowCollector) {
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
                        CryptoCashInterestMembershipDetails cryptoCashInterestMembershipDetails = (CryptoCashInterestMembershipDetails) obj;
                        GetMembershipDetailsResponseDto membershipDetails = cryptoCashInterestMembershipDetails != null ? cryptoCashInterestMembershipDetails.getMembershipDetails() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(membershipDetails, anonymousClass1) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow historyQuery$lambda$6(CryptoCashInterestStore cryptoCashInterestStore, GetMonthlyInterestHistoryRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoCashInterestStore.interestPaymentDao.getCryptoCashInterestPayment(StringsKt.toUuid(it.getPayment_id()));
    }

    public final Flow<GetMembershipDetailsResponseDto> streamMembershipDetails(VendorDto vendorDto, CurrencyDto currencyDto) {
        Intrinsics.checkNotNullParameter(vendorDto, "vendorDto");
        Intrinsics.checkNotNullParameter(currencyDto, "currencyDto");
        return this.detailsQuery.asFlow(new GetMembershipDetailsRequestDto(vendorDto, currencyDto));
    }

    public static /* synthetic */ void refreshMembershipDetails$default(CryptoCashInterestStore cryptoCashInterestStore, VendorDto vendorDto, CurrencyDto currencyDto, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        cryptoCashInterestStore.refreshMembershipDetails(vendorDto, currencyDto, z);
    }

    public final void refreshMembershipDetails(VendorDto vendorDto, CurrencyDto currencyDto, boolean force) {
        Intrinsics.checkNotNullParameter(vendorDto, "vendorDto");
        Intrinsics.checkNotNullParameter(currencyDto, "currencyDto");
        Endpoint.DefaultImpls.refresh$default(this.detailsEndpoint, new GetMembershipDetailsRequestDto(vendorDto, currencyDto), force, null, 4, null);
    }

    public final Object updateEnrollment(VendorDto vendorDto, CurrencyDto currencyDto, MembershipIntentionDto membershipIntentionDto, Continuation<? super UpdateMembershipResponseDto> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.enrollmentEndpoint, new UpdateMembershipRequestDto(membershipIntentionDto, vendorDto, currencyDto), null, continuation, 2, null);
    }

    public final Flow<CryptoCashInterestPayment> getCashInterestPayment(UUID paymentId) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        return FlowKt.filterNotNull(this.historyQuery.asFlow(new GetMonthlyInterestHistoryRequestDto(Uuids.safeToString(paymentId))));
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final HistoryLoader.Callbacks<CryptoCashInterestPayment> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoCashInterestStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore$AllPaymentsRequestArgs;", "", "requestId", "Ljava/util/UUID;", "Lcom/robinhood/librobinhood/data/store/RequestId;", "request", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "<init>", "(Ljava/util/UUID;Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;)V", "getRequestId", "()Ljava/util/UUID;", "getRequest", "()Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class AllPaymentsRequestArgs {
        private final ListMonthlyInterestHistoryRequestDto request;
        private final UUID requestId;

        public static /* synthetic */ AllPaymentsRequestArgs copy$default(AllPaymentsRequestArgs allPaymentsRequestArgs, UUID uuid, ListMonthlyInterestHistoryRequestDto listMonthlyInterestHistoryRequestDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = allPaymentsRequestArgs.requestId;
            }
            if ((i & 2) != 0) {
                listMonthlyInterestHistoryRequestDto = allPaymentsRequestArgs.request;
            }
            return allPaymentsRequestArgs.copy(uuid, listMonthlyInterestHistoryRequestDto);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final ListMonthlyInterestHistoryRequestDto getRequest() {
            return this.request;
        }

        public final AllPaymentsRequestArgs copy(UUID requestId, ListMonthlyInterestHistoryRequestDto request) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(request, "request");
            return new AllPaymentsRequestArgs(requestId, request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllPaymentsRequestArgs)) {
                return false;
            }
            AllPaymentsRequestArgs allPaymentsRequestArgs = (AllPaymentsRequestArgs) other;
            return Intrinsics.areEqual(this.requestId, allPaymentsRequestArgs.requestId) && Intrinsics.areEqual(this.request, allPaymentsRequestArgs.request);
        }

        public int hashCode() {
            return (this.requestId.hashCode() * 31) + this.request.hashCode();
        }

        public String toString() {
            return "AllPaymentsRequestArgs(requestId=" + this.requestId + ", request=" + this.request + ")";
        }

        public AllPaymentsRequestArgs(UUID requestId, ListMonthlyInterestHistoryRequestDto request) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(request, "request");
            this.requestId = requestId;
            this.request = request;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final ListMonthlyInterestHistoryRequestDto getRequest() {
            return this.request;
        }
    }
}
