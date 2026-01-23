package com.robinhood.librobinhood.data.store.phoenix;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.phoenix.ApiUnifiedAccountV2;
import com.robinhood.models.dao.phoenix.UnifiedAccountDao;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV22;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: UnifiedAccountStore.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0 J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0 J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0 2\u0006\u0010&\u001a\u00020'J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u000bJ\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0 *\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180*0\u000bH\u0002J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0$*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180*0\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "dao", "Lcom/robinhood/models/dao/phoenix/UnifiedAccountDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/models/dao/phoenix/UnifiedAccountDao;Lcom/robinhood/store/StoreBundle;)V", "streamCachedOriginalSelfDirectedIndividualAccount", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getStreamCachedOriginalSelfDirectedIndividualAccount", "()Lkotlinx/coroutines/flow/Flow;", "streamCachedOriginalSelfDirectedIndividualAccount$delegate", "Lkotlin/Lazy;", "streamCachedAllSelfDirectedIndividualAccounts", "", "getStreamCachedAllSelfDirectedIndividualAccounts", "streamCachedAllSelfDirectedIndividualAccounts$delegate", "unifiedAccountEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/phoenix/ApiUnifiedAccountV2;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "poll", "Lio/reactivex/Completable;", "streamIndividualAccount", "Lio/reactivex/Observable;", "streamIndividualAccountOptional", "Lcom/robinhood/utils/Optional;", "getIndividualAccountForced", "Lio/reactivex/Single;", "streamAccount", "accountNumber", "", "streamAllSelfDirectedAccounts", "mapOriginalSelfDirectedIndividualAccount", "Lcom/robinhood/models/PaginatedResult;", "takeOriginalSelfDirectedIndividualAccountIfPresent", "Companion", "lib-store-unified-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class UnifiedAccountStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BonfireApi bonfireApi;
    private final UnifiedAccountDao dao;

    /* renamed from: streamCachedAllSelfDirectedIndividualAccounts$delegate, reason: from kotlin metadata */
    private final Lazy streamCachedAllSelfDirectedIndividualAccounts;

    /* renamed from: streamCachedOriginalSelfDirectedIndividualAccount$delegate, reason: from kotlin metadata */
    private final Lazy streamCachedOriginalSelfDirectedIndividualAccount;
    private final PaginatedEndpoint<Unit, ApiUnifiedAccountV2> unifiedAccountEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedAccountStore(BonfireApi bonfireApi, UnifiedAccountDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.streamCachedOriginalSelfDirectedIndividualAccount = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedAccountStore.m2649xc9a98520(this.f$0);
            }
        });
        this.streamCachedAllSelfDirectedIndividualAccounts = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedAccountStore.streamCachedAllSelfDirectedIndividualAccounts_delegate$lambda$1(this.f$0);
            }
        });
        this.unifiedAccountEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new UnifiedAccountStore2(this, null), getLogoutKillswitch(), new UnifiedAccountStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    private final Flow<UnifiedAccountV2> getStreamCachedOriginalSelfDirectedIndividualAccount() {
        return (Flow) this.streamCachedOriginalSelfDirectedIndividualAccount.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamCachedOriginalSelfDirectedIndividualAccount_delegate$lambda$0 */
    public static final SharedFlow m2649xc9a98520(UnifiedAccountStore unifiedAccountStore) {
        return FlowKt.shareIn(unifiedAccountStore.takeWhileLoggedInNullable(unifiedAccountStore.dao.getOriginalSelfDirectedIndividualUnifiedAccount()), unifiedAccountStore.getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    private final Flow<List<UnifiedAccountV2>> getStreamCachedAllSelfDirectedIndividualAccounts() {
        return (Flow) this.streamCachedAllSelfDirectedIndividualAccounts.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedFlow streamCachedAllSelfDirectedIndividualAccounts_delegate$lambda$1(UnifiedAccountStore unifiedAccountStore) {
        return FlowKt.shareIn(unifiedAccountStore.takeWhileLoggedIn(unifiedAccountStore.dao.getAllIndividualSelfDirectedUnifiedAccounts()), unifiedAccountStore.getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    public static /* synthetic */ Job refresh$default(UnifiedAccountStore unifiedAccountStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return unifiedAccountStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.unifiedAccountEndpoint, force);
    }

    public final Completable poll() {
        Completable completableIgnoreElements = asObservable(PaginatedEndpoint.DefaultImpls.pollAllPages$default(this.unifiedAccountEndpoint, Unit.INSTANCE, null, 2, null)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }

    public final Observable<UnifiedAccountV2> streamIndividualAccount() {
        return ObservablesKt.filterIsPresent(asObservable(Operators.toOptionals(getStreamCachedOriginalSelfDirectedIndividualAccount())));
    }

    public final Observable<Optional<UnifiedAccountV2>> streamIndividualAccountOptional() {
        return asObservable(Operators.toOptionals(getStreamCachedOriginalSelfDirectedIndividualAccount()));
    }

    public final Single<UnifiedAccountV2> getIndividualAccountForced() {
        return takeOriginalSelfDirectedIndividualAccountIfPresent(PaginatedEndpointKt.forceFetchAllPages(this.unifiedAccountEndpoint));
    }

    public final Observable<Optional<UnifiedAccountV2>> streamAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<Optional<UnifiedAccountV2>> observableTakeUntil = asObservable(Operators.toOptionals(this.dao.getUnifiedAccount(accountNumber))).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Flow<List<UnifiedAccountV2>> streamAllSelfDirectedAccounts() {
        return getStreamCachedAllSelfDirectedIndividualAccounts();
    }

    private final Observable<UnifiedAccountV2> mapOriginalSelfDirectedIndividualAccount(final Flow<? extends PaginatedResult<ApiUnifiedAccountV2>> flow) {
        return asObservable(new Flow<UnifiedAccountV2>() { // from class: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1$2", m3645f = "UnifiedAccountStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$mapOriginalSelfDirectedIndividualAccount$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        UnifiedAccountV2 originalSelfDirectedIndividualAccount = UnifiedAccountStore.INSTANCE.getOriginalSelfDirectedIndividualAccount(((PaginatedResult) obj).getResults());
                        if (originalSelfDirectedIndividualAccount != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(originalSelfDirectedIndividualAccount, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UnifiedAccountV2> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    private final Single<UnifiedAccountV2> takeOriginalSelfDirectedIndividualAccountIfPresent(Flow<? extends PaginatedResult<ApiUnifiedAccountV2>> flow) {
        Single<UnifiedAccountV2> singleFirstOrError = mapOriginalSelfDirectedIndividualAccount(flow).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    /* compiled from: UnifiedAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore$Companion;", "", "<init>", "()V", "getOriginalSelfDirectedIndividualAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "", "Lcom/robinhood/models/api/phoenix/ApiUnifiedAccountV2;", "filterSelfDirectedIndividualAccounts", "lib-store-unified-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final UnifiedAccountV2 getOriginalSelfDirectedIndividualAccount(List<ApiUnifiedAccountV2> list) {
            Object next;
            List<ApiUnifiedAccountV2> listFilterSelfDirectedIndividualAccounts = filterSelfDirectedIndividualAccounts(list);
            Iterator<T> it = listFilterSelfDirectedIndividualAccounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ApiUnifiedAccountV2) next).getIs_original()) {
                    break;
                }
            }
            ApiUnifiedAccountV2 apiUnifiedAccountV2 = (ApiUnifiedAccountV2) next;
            if (apiUnifiedAccountV2 == null) {
                apiUnifiedAccountV2 = (ApiUnifiedAccountV2) CollectionsKt.firstOrNull((List) listFilterSelfDirectedIndividualAccounts);
            }
            if (apiUnifiedAccountV2 != null) {
                return UnifiedAccountV22.toDbModel(apiUnifiedAccountV2);
            }
            return null;
        }

        private final List<ApiUnifiedAccountV2> filterSelfDirectedIndividualAccounts(List<ApiUnifiedAccountV2> list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ApiUnifiedAccountV2 apiUnifiedAccountV2 = (ApiUnifiedAccountV2) obj;
                if (apiUnifiedAccountV2.getBrokerage_account_type() == BrokerageAccountType.INDIVIDUAL && apiUnifiedAccountV2.getManagement_type() == ManagementType.SELF_DIRECTED) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
