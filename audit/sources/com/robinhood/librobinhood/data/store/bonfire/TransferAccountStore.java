package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.dao.TransferAccountDao;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount6;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TransferAccountStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0012J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0012J\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0012J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000bH\u0086@¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TransferAccountDao;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/TransferAccountDao;)V", "toDbModel", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccountsResponse;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "stream", "Lio/reactivex/Observable;", "streamFlow", "Lkotlinx/coroutines/flow/Flow;", "fetchNoActiveInternalAccounts", "Lio/reactivex/Single;", "", "fetchNoActiveIraAccounts", "fetchIfStaleThenStream", "fetchAccountsForOutgoingWires", "fetchAccountsForThirdPartyOutgoingWires", "thirdPartyOutgoingWiresInfo", "Lcom/robinhood/android/models/transfer/shared/ThirdPartyOutgoingWiresInfo;", "forceFetchAndStream", "forceFetch", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "Lkotlinx/coroutines/Job;", "force", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TransferAccountStore extends Store {
    private final TransferAccountDao dao;
    private final Endpoint<Unit, ApiTransferAccountsResponse> endpoint;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: TransferAccountStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore", m3645f = "TransferAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "forceFetch")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$forceFetch$1 */
    static final class C346151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C346151(Continuation<? super C346151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferAccountStore.this.forceFetch(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAccountStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle, TransferAccountDao dao) {
        super(storeBundle, TransferAccount.INSTANCE);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.transfersBonfireApi = transfersBonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new TransferAccountStore2(this, null), getLogoutKillswitch(), new TransferAccountStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TransferAccount> toDbModel(ApiTransferAccountsResponse apiTransferAccountsResponse) {
        List<ApiTransferAccount> results = apiTransferAccountsResponse.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(TransferAccount6.toDbModel((ApiTransferAccount) it.next()));
        }
        return arrayList;
    }

    public final Observable<List<TransferAccount>> stream() {
        return asObservable(streamFlow());
    }

    public final Flow<List<TransferAccount>> streamFlow() {
        return FlowKt.distinctUntilChanged(this.dao.getTransferAccounts());
    }

    public final Single<Boolean> fetchNoActiveInternalAccounts() {
        Observable<R> map = fetchIfStaleThenStream().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore.fetchNoActiveInternalAccounts.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<TransferAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<TransferAccount> list = accounts2;
                boolean z = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((TransferAccount) it.next()).isExternal()) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        Boolean bool = Boolean.FALSE;
        Single<Boolean> singleFirst = map.onErrorReturnItem(bool).first(bool);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return singleFirst;
    }

    public final Single<Boolean> fetchNoActiveIraAccounts() {
        Observable<R> map = fetchIfStaleThenStream().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore.fetchNoActiveIraAccounts.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<TransferAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<TransferAccount> list = accounts2;
                boolean z = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((TransferAccount) it.next()).isIra()) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        Boolean bool = Boolean.FALSE;
        Single<Boolean> singleFirst = map.onErrorReturnItem(bool).first(bool);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return singleFirst;
    }

    /* compiled from: TransferAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccountsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$fetchIfStaleThenStream$1", m3645f = "TransferAccountStore.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$fetchIfStaleThenStream$1 */
    static final class C346111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiTransferAccountsResponse>>, Object> {
        int label;

        C346111(Continuation<? super C346111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferAccountStore.this.new C346111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiTransferAccountsResponse>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<ApiTransferAccountsResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiTransferAccountsResponse>> continuation) {
            return ((C346111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = TransferAccountStore.this.endpoint;
                this.label = 1;
                obj = Endpoint8.fetch$default(endpoint, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Optional3.asOptional(obj);
        }
    }

    public final Observable<List<TransferAccount>> fetchIfStaleThenStream() {
        Observable<List<TransferAccount>> observableFlatMapObservable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C346111(null), 1, null).flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore.fetchIfStaleThenStream.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<TransferAccount>> apply(Optional<ApiTransferAccountsResponse> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                ApiTransferAccountsResponse apiTransferAccountsResponseComponent1 = optional.component1();
                if (apiTransferAccountsResponseComponent1 != null) {
                    return Observable.concat(Observable.just(TransferAccountStore.this.toDbModel(apiTransferAccountsResponseComponent1)), TransferAccountStore.this.stream()).distinctUntilChanged();
                }
                return TransferAccountStore.this.stream();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }

    /* compiled from: TransferAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$fetchAccountsForOutgoingWires$1", m3645f = "TransferAccountStore.kt", m3646l = {103, 101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$fetchAccountsForOutgoingWires$1 */
    static final class C346091 extends ContinuationImpl7 implements Function2<Produce4<? super List<? extends TransferAccount>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C346091(Continuation<? super C346091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C346091 c346091 = TransferAccountStore.this.new C346091(continuation);
            c346091.L$0 = obj;
            return c346091;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Produce4<? super List<? extends TransferAccount>> produce4, Continuation<? super Unit> continuation) {
            return invoke2((Produce4<? super List<TransferAccount>>) produce4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Produce4<? super List<TransferAccount>> produce4, Continuation<? super Unit> continuation) {
            return ((C346091) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r1.send(r3, r11) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            C346091 c346091;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                TransfersBonfireApi transfersBonfireApi = TransferAccountStore.this.transfersBonfireApi;
                TransferType transferType = TransferType.OUTGOING_WIRE;
                this.L$0 = produce4;
                this.label = 1;
                c346091 = this;
                obj = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, false, null, transferType, c346091, 3, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            c346091 = this;
            List<ApiTransferAccount> results = ((ApiTransferAccountsResponse) obj).getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(TransferAccount6.toDbModel((ApiTransferAccount) it.next()));
            }
            c346091.L$0 = null;
            c346091.label = 2;
        }
    }

    public final Observable<List<TransferAccount>> fetchAccountsForOutgoingWires() {
        return RxFactory.DefaultImpls.rxObservable$default(this, null, new C346091(null), 1, null);
    }

    public final Observable<List<TransferAccount>> fetchAccountsForThirdPartyOutgoingWires(final ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo) {
        Intrinsics.checkNotNullParameter(thirdPartyOutgoingWiresInfo, "thirdPartyOutgoingWiresInfo");
        Observable map = fetchIfStaleThenStream().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore.fetchAccountsForThirdPartyOutgoingWires.1
            @Override // io.reactivex.functions.Function
            public final List<TransferAccount> apply(List<TransferAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<TransferAccount> mutableList = CollectionsKt.toMutableList((Collection) accounts2);
                ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo2 = thirdPartyOutgoingWiresInfo;
                String paymentInstrumentId = thirdPartyOutgoingWiresInfo2.getPaymentInstrumentId();
                String str = paymentInstrumentId == null ? "" : paymentInstrumentId;
                String paymentInstrumentId2 = thirdPartyOutgoingWiresInfo2.getPaymentInstrumentId();
                String str2 = paymentInstrumentId2 == null ? "" : paymentInstrumentId2;
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT;
                ApiTransferAccount.TransferAccountStatus transferAccountStatus = ApiTransferAccount.TransferAccountStatus.APPROVED;
                String outgoingWireBankAccountName = thirdPartyOutgoingWiresInfo2.getOutgoingWireBankAccountName();
                String str3 = outgoingWireBankAccountName == null ? "Robinhood" : outgoingWireBankAccountName;
                BigDecimal bigDecimal = new BigDecimal("1000000");
                String outgoingWireBankAccountName2 = thirdPartyOutgoingWiresInfo2.getOutgoingWireBankAccountName();
                mutableList.add(new TransferAccount(str, str2, transferAccountType, transferAccountStatus, Boolean.TRUE, false, str3, "robinhood", bigDecimal, null, null, false, "", outgoingWireBankAccountName2 == null ? "Robinhood" : outgoingWireBankAccountName2, true, false, false, false, null, null, null, null, null, null, null, null, 25165824, null));
                return mutableList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<TransferAccount>> forceFetchAndStream() {
        Endpoint8.refresh$default(this.endpoint, true, null, 2, null);
        return stream();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceFetch(Continuation<? super List<ApiTransferAccount>> continuation) {
        C346151 c346151;
        if (continuation instanceof C346151) {
            c346151 = (C346151) continuation;
            int i = c346151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346151.label = i - Integer.MIN_VALUE;
            } else {
                c346151 = new C346151(continuation);
            }
        }
        Object objForceFetch$default = c346151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Unit, ApiTransferAccountsResponse> endpoint = this.endpoint;
            c346151.label = 1;
            objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, c346151, 1, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((ApiTransferAccountsResponse) objForceFetch$default).getResults();
    }

    public static /* synthetic */ Job refresh$default(TransferAccountStore transferAccountStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return transferAccountStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint8.refresh$default(this.endpoint, force, null, 2, null);
    }
}
