package com.robinhood.android.store.matcha;

import androidx.collection.LruCache;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.matcha.api.ApiMatchaRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaTransaction;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.models.matcha.api.ApiRequestAcceptRequest;
import com.robinhood.android.models.matcha.api.ApiRequestAcceptResponse;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.models.p320db.matcha.MatchaPendingTransaction;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaTransfer2;
import com.robinhood.models.p320db.matcha.dao.MatchaPendingTransactionDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: MatchaPendingTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001FB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00120*2\b\b\u0002\u0010+\u001a\u00020,J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020(0*J\u0010\u0010.\u001a\u00020/2\b\b\u0002\u0010+\u001a\u00020,J\u000e\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0011J\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00120*2\u0006\u00101\u001a\u00020\u0011J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J\u0016\u00107\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J\u0016\u00108\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J\"\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u00132\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<H\u0086@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J\u0016\u0010?\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J\u001e\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010CJ\u0016\u0010D\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J\u0016\u0010E\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\u001f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010!\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u001d\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010#\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00120$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020(0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/api/matcha/MatchaApi;", "dao", "Lcom/robinhood/models/db/matcha/dao/MatchaPendingTransactionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/models/db/matcha/dao/MatchaPendingTransactionDao;Lcom/robinhood/store/StoreBundle;)V", "getPendingTransactions", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransaction;", "userIdToPendingTransactionsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Landroidx/collection/LruCache;", "", "", "Ljava/util/UUID;", "getPendingTransactionsBetweenUser", "claimTransferEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;", "declineTransferEndpoint", "cancelTransferEndpoint", "declineRequestEndpoint", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;", "acceptRequestEndpoint", "Lkotlin/Pair;", "Lcom/robinhood/android/models/matcha/api/ApiRequestAcceptRequest;", "Lcom/robinhood/android/models/matcha/api/ApiRequestAcceptResponse;", "cancelRequestEndpoint", "remindEndpoint", "Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;", "queryPendingTransactions", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/matcha/MatchaPendingTransaction;", "queryHasPendingTransactions", "", "stream", "Lio/reactivex/Observable;", "force", "", "streamPendingTransactionCount", "refresh", "Lkotlinx/coroutines/Job;", "refreshTransactionsWithUser", "userId", "streamTransactionsWithUser", "claimTransfer", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult;", "transferId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "declineTransfer", "cancelTransfer", "acceptRequest", "requestId", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "(Ljava/util/UUID;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "declineRequest", "cancelRequest", "attributeThenDeclineTransaction", "id", "type", "(Ljava/util/UUID;Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remindRequest", "remindTransfer", "ClaimResult", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaPendingTransactionStore extends Store {
    private final PostEndpoint<Tuples2<UUID, ApiRequestAcceptRequest>, ApiRequestAcceptResponse> acceptRequestEndpoint;
    private final MatchaApi api;
    private final PostEndpoint<UUID, ApiMatchaRequest> cancelRequestEndpoint;
    private final PostEndpoint<UUID, ApiMatchaTransfer> cancelTransferEndpoint;
    private final PostEndpoint<UUID, ApiMatchaTransfer> claimTransferEndpoint;
    private final MatchaPendingTransactionDao dao;
    private final PostEndpoint<UUID, ApiMatchaRequest> declineRequestEndpoint;
    private final PostEndpoint<UUID, ApiMatchaTransfer> declineTransferEndpoint;
    private final PaginatedEndpoint<Unit, ApiMatchaTransaction> getPendingTransactions;
    private final PaginatedEndpoint<String, ApiMatchaTransaction> getPendingTransactionsBetweenUser;
    private final Query<Unit, Integer> queryHasPendingTransactions;
    private final Query<Object, List<MatchaPendingTransaction>> queryPendingTransactions;
    private final PostEndpoint<Tuples2<UUID, MatchaTransactionType>, Unit> remindEndpoint;
    private final BehaviorRelay<LruCache<String, List<UUID>>> userIdToPendingTransactionsRelay;

    /* compiled from: MatchaPendingTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransactionType.values().length];
            try {
                iArr[MatchaTransactionType.MATCHA_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransactionType.MATCHA_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MatchaPendingTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "attributeThenDeclineTransaction")
    /* renamed from: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$attributeThenDeclineTransaction$1 */
    static final class C287391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C287391(Continuation<? super C287391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaPendingTransactionStore.this.attributeThenDeclineTransaction(null, null, this);
        }
    }

    /* compiled from: MatchaPendingTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "claimTransfer")
    /* renamed from: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$claimTransfer$1 */
    static final class C287401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C287401(Continuation<? super C287401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaPendingTransactionStore.this.claimTransfer(null, this);
        }
    }

    /* compiled from: MatchaPendingTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "remindRequest")
    /* renamed from: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$remindRequest$1 */
    static final class C287431 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C287431(Continuation<? super C287431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaPendingTransactionStore.this.remindRequest(null, this);
        }
    }

    /* compiled from: MatchaPendingTransactionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "remindTransfer")
    /* renamed from: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$remindTransfer$1 */
    static final class C287441 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C287441(Continuation<? super C287441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaPendingTransactionStore.this.remindTransfer(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaPendingTransactionStore(MatchaApi api, MatchaPendingTransactionDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.getPendingTransactions = PaginatedEndpoint.Companion.create$default(companion, new MatchaPendingTransactionStore$getPendingTransactions$1(this, null), getLogoutKillswitch(), new MatchaPendingTransactionStore$getPendingTransactions$2(this, null), storeBundle.getClock(), null, 16, null);
        BehaviorRelay<LruCache<String, List<UUID>>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new LruCache(5));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.userIdToPendingTransactionsRelay = behaviorRelayCreateDefault;
        this.getPendingTransactionsBetweenUser = PaginatedEndpoint.Companion.createWithParams$default(companion, new C28741x20d5f9c4(this, null), getLogoutKillswitch(), new C28742x20d5f9c5(this, null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.claimTransferEndpoint = companion2.create(new MatchaPendingTransactionStore$claimTransferEndpoint$1(api), new MatchaPendingTransactionStore$claimTransferEndpoint$2(this, null));
        this.declineTransferEndpoint = companion2.create(new MatchaPendingTransactionStore$declineTransferEndpoint$1(api), new MatchaPendingTransactionStore$declineTransferEndpoint$2(this, null));
        this.cancelTransferEndpoint = companion2.create(new MatchaPendingTransactionStore$cancelTransferEndpoint$1(api), new MatchaPendingTransactionStore$cancelTransferEndpoint$2(this, null));
        this.declineRequestEndpoint = companion2.create(new MatchaPendingTransactionStore$declineRequestEndpoint$1(api), new MatchaPendingTransactionStore$declineRequestEndpoint$2(this, null));
        this.acceptRequestEndpoint = companion2.create(new MatchaPendingTransactionStore$acceptRequestEndpoint$1(this, null), new MatchaPendingTransactionStore$acceptRequestEndpoint$2(this, null));
        this.cancelRequestEndpoint = companion2.create(new MatchaPendingTransactionStore$cancelRequestEndpoint$1(api), new MatchaPendingTransactionStore$cancelRequestEndpoint$2(this, null));
        this.remindEndpoint = companion2.create(new MatchaPendingTransactionStore$remindEndpoint$1(this, null), new MatchaPendingTransactionStore$remindEndpoint$2(null));
        Query.Companion companion3 = Query.INSTANCE;
        this.queryPendingTransactions = Store.create$default(this, companion3, "queryPendingTransactions", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionStore.queryPendingTransactions$lambda$0(this.f$0, obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionStore.queryPendingTransactions$lambda$1(this.f$0, obj);
            }
        }, false, 8, null);
        this.queryHasPendingTransactions = Store.create$default(this, companion3, "streamPendingTransactionCount", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionStore.queryHasPendingTransactions$lambda$2(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionStore.queryHasPendingTransactions$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryPendingTransactions$lambda$0(MatchaPendingTransactionStore matchaPendingTransactionStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaginatedEndpoint<Unit, ApiMatchaTransaction> paginatedEndpoint = matchaPendingTransactionStore.getPendingTransactions;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return PaginatedEndpointKt.pollAllPages(paginatedEndpoint, durationOfSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryPendingTransactions$lambda$1(MatchaPendingTransactionStore matchaPendingTransactionStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return matchaPendingTransactionStore.dao.getAllTransactions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryHasPendingTransactions$lambda$2(MatchaPendingTransactionStore matchaPendingTransactionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return refresh$default(matchaPendingTransactionStore, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryHasPendingTransactions$lambda$3(MatchaPendingTransactionStore matchaPendingTransactionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(matchaPendingTransactionStore.dao.getTransactionCount());
    }

    public static /* synthetic */ Observable stream$default(MatchaPendingTransactionStore matchaPendingTransactionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return matchaPendingTransactionStore.stream(z);
    }

    public final Observable<List<MatchaPendingTransaction>> stream(boolean force) {
        return this.queryPendingTransactions.asObservable(Boolean.valueOf(force));
    }

    public final Observable<Integer> streamPendingTransactionCount() {
        return this.queryHasPendingTransactions.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ Job refresh$default(MatchaPendingTransactionStore matchaPendingTransactionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return matchaPendingTransactionStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.getPendingTransactions, force);
    }

    public final void refreshTransactionsWithUser(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        refresh$default(this, false, 1, null);
        ScopedSubscriptionKt.subscribeIn(ObservablesKt.ignoreNetworkExceptions(asObservable(this.getPendingTransactionsBetweenUser.fetchAllPages(userId))), getStoreScope());
    }

    public final Observable<List<MatchaPendingTransaction>> streamTransactionsWithUser(final String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        refreshTransactionsWithUser(userId);
        Observable<R> map = this.userIdToPendingTransactionsRelay.map(new Function() { // from class: com.robinhood.android.store.matcha.MatchaPendingTransactionStore.streamTransactionsWithUser.1
            @Override // io.reactivex.functions.Function
            public final Optional<List<UUID>> apply(LruCache<String, List<UUID>> cache2) {
                Intrinsics.checkNotNullParameter(cache2, "cache");
                return Optional3.asOptional(cache2.get(userId));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<List<MatchaPendingTransaction>> observableHide = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.store.matcha.MatchaPendingTransactionStore.streamTransactionsWithUser.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<MatchaPendingTransaction>> apply(List<UUID> transactionIds) {
                Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
                MatchaPendingTransactionStore matchaPendingTransactionStore = MatchaPendingTransactionStore.this;
                return matchaPendingTransactionStore.asObservable(matchaPendingTransactionStore.dao.getTransactions(transactionIds));
            }
        }).hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object claimTransfer(UUID uuid, Continuation<? super ClaimResult> continuation) {
        C287401 c287401;
        if (continuation instanceof C287401) {
            c287401 = (C287401) continuation;
            int i = c287401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c287401.label = i - Integer.MIN_VALUE;
            } else {
                c287401 = new C287401(continuation);
            }
        }
        C287401 c2874012 = c287401;
        Object objPost$default = c2874012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2874012.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPost$default);
                PostEndpoint<UUID, ApiMatchaTransfer> postEndpoint = this.claimTransferEndpoint;
                c2874012.label = 1;
                objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, c2874012, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPost$default);
            }
            MatchaTransfer dbModel = MatchaTransfer2.toDbModel((ApiMatchaTransfer) objPost$default);
            if (dbModel.getVerificationsRequired().isEmpty()) {
                return new ClaimResult.Success(dbModel);
            }
            return new ClaimResult.VerificationRequired((ApiMatchaTransfer.Verification) CollectionsKt.first((List) dbModel.getVerificationsRequired()));
        } catch (Throwable th) {
            return new ClaimResult.Error(th);
        }
    }

    public final Object declineTransfer(UUID uuid, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.declineTransferEndpoint, uuid, null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    public final Object cancelTransfer(UUID uuid, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.cancelTransferEndpoint, uuid, null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object acceptRequest$default(MatchaPendingTransactionStore matchaPendingTransactionStore, UUID uuid, SourceOfFunds sourceOfFunds, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            sourceOfFunds = null;
        }
        return matchaPendingTransactionStore.acceptRequest(uuid, sourceOfFunds, continuation);
    }

    public final Object acceptRequest(UUID uuid, SourceOfFunds sourceOfFunds, Continuation<? super ApiRequestAcceptResponse> continuation) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return PostEndpoint.DefaultImpls.post$default(this.acceptRequestEndpoint, Tuples4.m3642to(uuid, new ApiRequestAcceptRequest(uuidRandomUUID, sourceOfFunds)), null, continuation, 2, null);
    }

    public final Object declineRequest(UUID uuid, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.declineRequestEndpoint, uuid, null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    public final Object cancelRequest(UUID uuid, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.cancelRequestEndpoint, uuid, null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (declineTransfer(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (declineRequest(r9, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attributeThenDeclineTransaction(UUID uuid, MatchaTransactionType matchaTransactionType, Continuation<? super Unit> continuation) {
        C287391 c287391;
        if (continuation instanceof C287391) {
            c287391 = (C287391) continuation;
            int i = c287391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c287391.label = i - Integer.MIN_VALUE;
            } else {
                c287391 = new C287391(continuation);
            }
        }
        Object obj = c287391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c287391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = WhenMappings.$EnumSwitchMapping$0[matchaTransactionType.ordinal()];
            if (i3 == 1) {
                MatchaApi matchaApi = this.api;
                c287391.L$0 = uuid;
                c287391.label = 1;
                if (matchaApi.attributeRequest(uuid, c287391) != coroutine_suspended) {
                    c287391.L$0 = null;
                    c287391.label = 2;
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                MatchaApi matchaApi2 = this.api;
                c287391.L$0 = uuid;
                c287391.label = 3;
                if (matchaApi2.attributeTransfer(uuid, c287391) != coroutine_suspended) {
                    c287391.L$0 = null;
                    c287391.label = 4;
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            uuid = (UUID) c287391.L$0;
            ResultKt.throwOnFailure(obj);
            c287391.L$0 = null;
            c287391.label = 2;
        } else {
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            uuid = (UUID) c287391.L$0;
            ResultKt.throwOnFailure(obj);
            c287391.L$0 = null;
            c287391.label = 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r10.setRequestReminded(r9, r4) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remindRequest(UUID uuid, Continuation<? super Unit> continuation) {
        C287431 c287431;
        if (continuation instanceof C287431) {
            c287431 = (C287431) continuation;
            int i = c287431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c287431.label = i - Integer.MIN_VALUE;
            } else {
                c287431 = new C287431(continuation);
            }
        }
        C287431 c2874312 = c287431;
        Object obj = c2874312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2874312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint<Tuples2<UUID, MatchaTransactionType>, Unit> postEndpoint = this.remindEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(uuid, MatchaTransactionType.MATCHA_REQUEST);
            c2874312.L$0 = uuid;
            c2874312.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, c2874312, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        uuid = (UUID) c2874312.L$0;
        ResultKt.throwOnFailure(obj);
        MatchaPendingTransactionDao matchaPendingTransactionDao = this.dao;
        c2874312.L$0 = null;
        c2874312.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r10.setTransferReminded(r9, r4) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remindTransfer(UUID uuid, Continuation<? super Unit> continuation) {
        C287441 c287441;
        if (continuation instanceof C287441) {
            c287441 = (C287441) continuation;
            int i = c287441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c287441.label = i - Integer.MIN_VALUE;
            } else {
                c287441 = new C287441(continuation);
            }
        }
        C287441 c2874412 = c287441;
        Object obj = c2874412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2874412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint<Tuples2<UUID, MatchaTransactionType>, Unit> postEndpoint = this.remindEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(uuid, MatchaTransactionType.MATCHA_TRANSFER);
            c2874412.L$0 = uuid;
            c2874412.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, c2874412, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        uuid = (UUID) c2874412.L$0;
        ResultKt.throwOnFailure(obj);
        MatchaPendingTransactionDao matchaPendingTransactionDao = this.dao;
        c2874412.L$0 = null;
        c2874412.label = 2;
    }

    /* compiled from: MatchaPendingTransactionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult;", "", "Success", "Error", "VerificationRequired", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult$Error;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult$Success;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult$VerificationRequired;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ClaimResult {

        /* compiled from: MatchaPendingTransactionStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult$Success;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult;", "transfer", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaTransfer;)V", "getTransfer", "()Lcom/robinhood/models/db/matcha/MatchaTransfer;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements ClaimResult {
            private final MatchaTransfer transfer;

            public static /* synthetic */ Success copy$default(Success success, MatchaTransfer matchaTransfer, int i, Object obj) {
                if ((i & 1) != 0) {
                    matchaTransfer = success.transfer;
                }
                return success.copy(matchaTransfer);
            }

            /* renamed from: component1, reason: from getter */
            public final MatchaTransfer getTransfer() {
                return this.transfer;
            }

            public final Success copy(MatchaTransfer transfer) {
                Intrinsics.checkNotNullParameter(transfer, "transfer");
                return new Success(transfer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.transfer, ((Success) other).transfer);
            }

            public int hashCode() {
                return this.transfer.hashCode();
            }

            public String toString() {
                return "Success(transfer=" + this.transfer + ")";
            }

            public Success(MatchaTransfer transfer) {
                Intrinsics.checkNotNullParameter(transfer, "transfer");
                this.transfer = transfer;
            }

            public final MatchaTransfer getTransfer() {
                return this.transfer;
            }
        }

        /* compiled from: MatchaPendingTransactionStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult$Error;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements ClaimResult {
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            public Error(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: MatchaPendingTransactionStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult$VerificationRequired;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore$ClaimResult;", "verification", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "<init>", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;)V", "getVerification", "()Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer$Verification;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VerificationRequired implements ClaimResult {
            private final ApiMatchaTransfer.Verification verification;

            public static /* synthetic */ VerificationRequired copy$default(VerificationRequired verificationRequired, ApiMatchaTransfer.Verification verification, int i, Object obj) {
                if ((i & 1) != 0) {
                    verification = verificationRequired.verification;
                }
                return verificationRequired.copy(verification);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiMatchaTransfer.Verification getVerification() {
                return this.verification;
            }

            public final VerificationRequired copy(ApiMatchaTransfer.Verification verification) {
                Intrinsics.checkNotNullParameter(verification, "verification");
                return new VerificationRequired(verification);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VerificationRequired) && Intrinsics.areEqual(this.verification, ((VerificationRequired) other).verification);
            }

            public int hashCode() {
                return this.verification.hashCode();
            }

            public String toString() {
                return "VerificationRequired(verification=" + this.verification + ")";
            }

            public VerificationRequired(ApiMatchaTransfer.Verification verification) {
                Intrinsics.checkNotNullParameter(verification, "verification");
                this.verification = verification;
            }

            public final ApiMatchaTransfer.Verification getVerification() {
                return this.verification;
            }
        }
    }
}
