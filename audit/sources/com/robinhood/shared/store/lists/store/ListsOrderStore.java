package com.robinhood.shared.store.lists.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiListRecord;
import com.robinhood.models.api.bonfire.ApiSaveListOrderRequest;
import com.robinhood.models.dao.ListsOrderDao;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import com.robinhood.shared.store.lists.ListsApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ListsOrderStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\rJ\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "Lcom/robinhood/store/Store;", "listsApi", "Lcom/robinhood/shared/store/lists/ListsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ListsOrderDao;", "<init>", "(Lcom/robinhood/shared/store/lists/ListsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/ListsOrderDao;)V", "getListsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/bonfire/ListsOrder;", "orderedListsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "updateOrderedListsEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/bonfire/ApiSaveListOrderRequest;", "refresh", "force", "", "getOrderedLists", "Lio/reactivex/Observable;", "saveOrderedLists", "listsOrder", "saveOrderedListWithDelay", "Lkotlinx/coroutines/Job;", "delay", "Lkotlin/time/Duration;", "saveOrderedListWithDelay-HG0u8IE", "(Lcom/robinhood/models/db/bonfire/ListsOrder;J)Lkotlinx/coroutines/Job;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ListsOrderStore extends Store {
    private final ListsOrderDao dao;
    private final Endpoint<Unit, ListsOrder> getListsEndpoint;
    private final ListsApi listsApi;
    private final Query<Unit, Optional<ListsOrder>> orderedListsQuery;
    private final PostEndpoint<ApiSaveListOrderRequest, ListsOrder> updateOrderedListsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsOrderStore(ListsApi listsApi, StoreBundle storeBundle, ListsOrderDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(listsApi, "listsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.listsApi = listsApi;
        this.dao = dao;
        this.getListsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ListsOrderStore2(this, null), getLogoutKillswitch(), new ListsOrderStore3(dao), storeBundle.getClock(), null, 16, null);
        this.orderedListsQuery = Store.create$default(this, Query.INSTANCE, "refreshOrderedListQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.shared.store.lists.store.ListsOrderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListsOrderStore.orderedListsQuery$lambda$0(this.f$0, obj);
            }
        })), new Function1() { // from class: com.robinhood.shared.store.lists.store.ListsOrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListsOrderStore.orderedListsQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.updateOrderedListsEndpoint = PostEndpoint.INSTANCE.create(new ListsOrderStore5(this, null), new ListsOrderStore6(dao));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getListsEndpoint$insert(ListsOrderDao listsOrderDao, ListsOrder listsOrder, Continuation continuation) {
        listsOrderDao.insert((ListsOrderDao) listsOrder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job orderedListsQuery$lambda$0(ListsOrderStore listsOrderStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(listsOrderStore.getListsEndpoint, Unit.INSTANCE, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow orderedListsQuery$lambda$2(ListsOrderStore listsOrderStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Flow<ListsOrder> orderedListsIds = listsOrderStore.dao.getOrderedListsIds();
        return new Flow<Optional<? extends ListsOrder>>() { // from class: com.robinhood.shared.store.lists.store.ListsOrderStore$orderedListsQuery$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.ListsOrderStore$orderedListsQuery$lambda$2$$inlined$map$1$2 */
            public static final class C399882<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListsOrderStore$orderedListsQuery$lambda$2$$inlined$map$1$2", m3645f = "ListsOrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.ListsOrderStore$orderedListsQuery$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C399882.this.emit(null, this);
                    }
                }

                public C399882(FlowCollector flowCollector) {
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
                        Optional<T> optionalM2972of = Optional.INSTANCE.m2972of((ListsOrder) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalM2972of, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends ListsOrder>> flowCollector, Continuation continuation) {
                Object objCollect = orderedListsIds.collect(new C399882(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object updateOrderedListsEndpoint$insert$3(ListsOrderDao listsOrderDao, ListsOrder listsOrder, Continuation continuation) {
        listsOrderDao.insert((ListsOrderDao) listsOrder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(ListsOrderStore listsOrderStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        listsOrderStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.getListsEndpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<Optional<ListsOrder>> getOrderedLists() {
        return this.orderedListsQuery.asObservable(Unit.INSTANCE);
    }

    /* compiled from: ListsOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/db/bonfire/ListsOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListsOrderStore$saveOrderedLists$1", m3645f = "ListsOrderStore.kt", m3646l = {82, 82}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.store.lists.store.ListsOrderStore$saveOrderedLists$1 */
    static final class C399891 extends ContinuationImpl7 implements Function2<Produce4<? super ListsOrder>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ListsOrder $listsOrder;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ListsOrderStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399891(ListsOrder listsOrder, ListsOrderStore listsOrderStore, Continuation<? super C399891> continuation) {
            super(2, continuation);
            this.$listsOrder = listsOrder;
            this.this$0 = listsOrderStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399891 c399891 = new C399891(this.$listsOrder, this.this$0, continuation);
            c399891.L$0 = obj;
            return c399891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ListsOrder> produce4, Continuation<? super Unit> continuation) {
            return ((C399891) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        
            if (r9.send(r0, r11) != r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object objPost$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                if (this.$listsOrder != null) {
                    this.this$0.dao.insert((ListsOrderDao) this.$listsOrder);
                    List<ListRecord> lists = this.$listsOrder.getLists();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lists, 10));
                    for (ListRecord listRecord : lists) {
                        arrayList.add(new ApiListRecord(listRecord.getId(), listRecord.getListType()));
                    }
                    ApiSaveListOrderRequest apiSaveListOrderRequest = new ApiSaveListOrderRequest(arrayList);
                    PostEndpoint postEndpoint = this.this$0.updateOrderedListsEndpoint;
                    this.L$0 = produce4;
                    this.label = 1;
                    objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiSaveListOrderRequest, null, this, 2, null);
                    if (objPost$default != coroutine_suspended) {
                        this.L$0 = null;
                        this.label = 2;
                    }
                    return coroutine_suspended;
                }
                CoroutineScope2.cancel$default(produce4, null, 1, null);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            Produce4 produce42 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            produce4 = produce42;
            objPost$default = obj;
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final Observable<ListsOrder> saveOrderedLists(ListsOrder listsOrder) {
        return RxFactory.DefaultImpls.rxObservable$default(this, null, new C399891(listsOrder, this, null), 1, null);
    }

    /* renamed from: saveOrderedListWithDelay-HG0u8IE, reason: not valid java name */
    public final Job m25749saveOrderedListWithDelayHG0u8IE(ListsOrder listsOrder, long delay) {
        Intrinsics.checkNotNullParameter(listsOrder, "listsOrder");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new ListsOrderStore4(this, listsOrder, delay, null), 3, null);
    }
}
