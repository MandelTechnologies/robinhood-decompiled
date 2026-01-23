package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ApiCuratedListItem;
import com.robinhood.models.api.CuratedListItemOperation;
import com.robinhood.models.api.CuratedListItemReorderRequest;
import com.robinhood.models.api.CuratedListOperationType;
import com.robinhood.models.dao.CuratedListItemsDao;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CuratedListItemsStore.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00019B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0016\u001a\u00020\u0017JB\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%J$\u0010&\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0010J3\u0010)\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020+0\u00102\u0006\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0017J\u0016\u00103\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00104\u001a\u00020+J,\u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001007062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "Lcom/robinhood/store/Store;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListItemsDao;", "<init>", "(Lcom/robinhood/android/api/discovery/DiscoveryApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CuratedListItemsDao;)V", "listItemsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore$ListItemRequestParams;", "Lcom/robinhood/models/api/ApiCuratedListItem;", "getCuratedListsByIdQuery", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/CuratedList;", "Lcom/robinhood/models/db/CuratedListItems;", "streamCuratedListItemsOptional", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "listId", "Ljava/util/UUID;", "streamCuratedListItems", "refreshListItems", "Lio/reactivex/Completable;", "force", "", "id", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "sortOrder", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "sortDirection", "Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "localMidnight", "", "updateListItems", "items", "Lcom/robinhood/models/ui/CuratedListEligible;", "reorderListItemsWithDelay", "Lkotlinx/coroutines/Job;", "Lcom/robinhood/models/db/CuratedListItem;", "delay", "Lkotlin/time/Duration;", "reorderListItemsWithDelay-Wn2Vu4Y", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;Ljava/util/List;J)Lkotlinx/coroutines/Job;", "removeListItem", "", "listItemIdToRemove", "removeAndUpdateListItem", "listItem", "refreshAndStreamCuratedListsItems", "Lkotlinx/coroutines/flow/Flow;", "", "curatedLists", "ListItemRequestParams", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListItemsStore extends Store {
    private final CuratedListItemsDao dao;
    private final DiscoveryApi discoveryApi;
    private final Query<List<CuratedList>, List<CuratedListItems>> getCuratedListsByIdQuery;
    private final PaginatedEndpoint<ListItemRequestParams, ApiCuratedListItem> listItemsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListItemsStore(DiscoveryApi discoveryApi, StoreBundle storeBundle, CuratedListItemsDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.discoveryApi = discoveryApi;
        this.dao = dao;
        this.listItemsEndpoint = PaginatedEndpoint.Companion.createWithParams$default(PaginatedEndpoint.INSTANCE, new CuratedListItemsStore3(this, null), getLogoutKillswitch(), new CuratedListItemsStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.getCuratedListsByIdQuery = Store.create$default(this, Query.INSTANCE, "getCuratedListsByIdQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemsStore.getCuratedListsByIdQuery$lambda$1(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemsStore.getCuratedListsByIdQuery$lambda$3(this.f$0, (List) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getCuratedListsByIdQuery$lambda$1(CuratedListItemsStore curatedListItemsStore, List lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
        Iterator it = lists.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(curatedListItemsStore.getStoreScope(), completableJobJob$default, null, new CuratedListItemsStore2(curatedListItemsStore, (CuratedList) it.next(), null), 2, null);
        }
        return completableJobJob$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCuratedListsByIdQuery$lambda$3(CuratedListItemsStore curatedListItemsStore, List lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        CuratedListItemsDao curatedListItemsDao = curatedListItemsStore.dao;
        List list = lists;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string2 = ((CuratedList) it.next()).getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(string2);
        }
        return curatedListItemsDao.get(arrayList);
    }

    public final Observable<Optional<CuratedListItems>> streamCuratedListItemsOptional(UUID listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        CuratedListItemsDao curatedListItemsDao = this.dao;
        String string2 = listId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(curatedListItemsDao.get(string2))));
    }

    public final Observable<CuratedListItems> streamCuratedListItems(UUID listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return ObservablesKt.filterIsPresent(streamCuratedListItemsOptional(listId));
    }

    public static /* synthetic */ Completable refreshListItems$default(CuratedListItemsStore curatedListItemsStore, boolean z, UUID uuid, ApiCuratedList.OwnerType ownerType, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            sortOrder = null;
        }
        if ((i & 16) != 0) {
            sortDirection = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        return curatedListItemsStore.refreshListItems(z, uuid, ownerType, sortOrder, sortDirection, str);
    }

    public final Completable refreshListItems(boolean force, UUID id, ApiCuratedList.OwnerType ownerType, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, String localMidnight) {
        Flow<PaginatedResult<ApiCuratedListItem>> flowFetchAllPages;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        ListItemRequestParams listItemRequestParams = new ListItemRequestParams(id, ownerType, sortOrder, sortDirection, localMidnight);
        if (force) {
            flowFetchAllPages = this.listItemsEndpoint.forceFetchAllPages(listItemRequestParams);
        } else {
            flowFetchAllPages = this.listItemsEndpoint.fetchAllPages(listItemRequestParams);
        }
        Completable completableCache = asObservable(FlowKt.m28818catch(flowFetchAllPages, new CuratedListItemsStore5(null))).ignoreElements().cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableCache), getStoreScope());
        return completableCache;
    }

    public final Completable updateListItems(final UUID listId, final ApiCuratedList.OwnerType ownerType, List<? extends CuratedListEligible> items) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        Intrinsics.checkNotNullParameter(items, "items");
        Completable completableCache = Completables.ignoreNetworkExceptions(RxFactory.DefaultImpls.rxCompletable$default(this, null, new CuratedListItemsStore7(this, new CuratedListItemReorderRequest(listId, SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(items), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemsStore.updateListItems$lambda$4((CuratedListEligible) obj);
            }
        }))), null), 1, null)).subscribeOn(Schedulers.m3346io()).cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(completableCache, getStoreScope(), (Function0<Unit>) new Function0() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListItemsStore.updateListItems$lambda$5(this.f$0, listId, ownerType);
            }
        });
        return completableCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemReorderRequest.Item updateListItems$lambda$4(CuratedListEligible item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CuratedListItemReorderRequest.Item(item.getCuratedListItem().getObjectType(), item.getCuratedListItem().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateListItems$lambda$5(CuratedListItemsStore curatedListItemsStore, UUID uuid, ApiCuratedList.OwnerType ownerType) {
        refreshListItems$default(curatedListItemsStore, true, uuid, ownerType, null, null, null, 56, null);
        return Unit.INSTANCE;
    }

    /* renamed from: reorderListItemsWithDelay-Wn2Vu4Y, reason: not valid java name */
    public final Job m25744reorderListItemsWithDelayWn2Vu4Y(UUID listId, ApiCuratedList.OwnerType ownerType, List<CuratedListItem> items, long delay) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        Intrinsics.checkNotNullParameter(items, "items");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new CuratedListItemsStore6(this, listId, items, delay, SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(items), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemsStore.reorderListItemsWithDelay_Wn2Vu4Y$lambda$6((CuratedListItem) obj);
            }
        })), ownerType, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemReorderRequest.Item reorderListItemsWithDelay_Wn2Vu4Y$lambda$6(CuratedListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CuratedListItemReorderRequest.Item(item.getObjectType(), item.getId());
    }

    public final void removeListItem(final UUID listId, final UUID listItemIdToRemove) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listItemIdToRemove, "listItemIdToRemove");
        Observable<R> map = streamCuratedListItems(listId).take(1L).map(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore.removeListItem.1
            @Override // io.reactivex.functions.Function
            public final List<CuratedListItem> apply(CuratedListItems it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getListItems();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ScopedSubscriptionKt.subscribeIn(map, getStoreScope(), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemsStore.removeListItem$lambda$8(this.f$0, listId, listItemIdToRemove, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeListItem$lambda$8(CuratedListItemsStore curatedListItemsStore, UUID uuid, UUID uuid2, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((CuratedListItem) obj).getId(), uuid2)) {
                arrayList.add(obj);
            }
        }
        curatedListItemsStore.dao.update(uuid, arrayList);
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListItemsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$removeAndUpdateListItem$1", m3645f = "CuratedListItemsStore.kt", m3646l = {201}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$removeAndUpdateListItem$1 */
    static final class C399631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $listId;
        final /* synthetic */ CuratedListItem $listItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399631(UUID uuid, CuratedListItem curatedListItem, Continuation<? super C399631> continuation) {
            super(2, continuation);
            this.$listId = uuid;
            this.$listItem = curatedListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListItemsStore.this.new C399631(this.$listId, this.$listItem, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowTake = FlowKt.take(Context7.buffer$default(RxConvert.asFlow(CuratedListItemsStore.this.streamCuratedListItems(this.$listId)), Integer.MAX_VALUE, null, 2, null), 1);
                Flow<List<? extends CuratedListItem>> flow = new Flow<List<? extends CuratedListItem>>() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$removeAndUpdateListItem$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends CuratedListItem>> flowCollector, Continuation continuation) {
                        Object objCollect = flowTake.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$removeAndUpdateListItem$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$removeAndUpdateListItem$1$invokeSuspend$$inlined$map$1$2", m3645f = "CuratedListItemsStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$removeAndUpdateListItem$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                List<CuratedListItem> listItems = ((CuratedListItems) obj).getListItems();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(listItems, anonymousClass1) == coroutine_suspended) {
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
                final CuratedListItemsStore curatedListItemsStore = CuratedListItemsStore.this;
                final UUID uuid = this.$listId;
                final CuratedListItem curatedListItem = this.$listItem;
                FlowCollector<? super List<? extends CuratedListItem>> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore.removeAndUpdateListItem.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<CuratedListItem>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<CuratedListItem> list, Continuation<? super Unit> continuation) {
                        CuratedListItem curatedListItem2 = curatedListItem;
                        ArrayList arrayList = new ArrayList();
                        for (T t : list) {
                            if (!Intrinsics.areEqual(((CuratedListItem) t).getId(), curatedListItem2.getId())) {
                                arrayList.add(t);
                            }
                        }
                        curatedListItemsStore.dao.update(uuid, arrayList);
                        Object objUpdateList = curatedListItemsStore.discoveryApi.updateList(MapsKt.mapOf(Tuples4.m3642to(uuid, CollectionsKt.listOf(new CuratedListItemOperation(curatedListItem.getObjectType(), curatedListItem.getId(), CuratedListOperationType.DELETE, null, 8, null)))), continuation);
                        return objUpdateList == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateList : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    public final Job removeAndUpdateListItem(UUID listId, CuratedListItem listItem) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C399631(listId, listItem, null), 3, null);
    }

    public final Flow<Map<UUID, List<CuratedListItem>>> refreshAndStreamCuratedListsItems(List<CuratedList> curatedLists) {
        Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
        final Flow<List<CuratedListItems>> flowAsFlow = this.getCuratedListsByIdQuery.asFlow(curatedLists);
        return new Flow<Map<UUID, ? extends List<? extends CuratedListItem>>>() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemsStore$refreshAndStreamCuratedListsItems$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends List<? extends CuratedListItem>>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$refreshAndStreamCuratedListsItems$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$refreshAndStreamCuratedListsItems$$inlined$map$1$2", m3645f = "CuratedListItemsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$refreshAndStreamCuratedListsItems$$inlined$map$1$2$1, reason: invalid class name */
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
                        List<CuratedListItems> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (CuratedListItems curatedListItems : list) {
                            linkedHashMap.put(curatedListItems.getId(), curatedListItems.getListItems());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
    /* compiled from: CuratedListItemsStore.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore$ListItemRequestParams;", "", "id", "Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "sortOrder", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "sortDirection", "Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "localMidnight", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;Lcom/robinhood/models/api/ApiCuratedList$SortOrder;Lcom/robinhood/models/api/ApiCuratedList$SortDirection;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "getSortOrder", "()Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "getSortDirection", "()Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "getLocalMidnight", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ListItemRequestParams {
        private final UUID id;
        private final String localMidnight;
        private final ApiCuratedList.OwnerType ownerType;
        private final ApiCuratedList.SortDirection sortDirection;
        private final ApiCuratedList.SortOrder sortOrder;

        public static /* synthetic */ ListItemRequestParams copy$default(ListItemRequestParams listItemRequestParams, UUID uuid, ApiCuratedList.OwnerType ownerType, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = listItemRequestParams.id;
            }
            if ((i & 2) != 0) {
                ownerType = listItemRequestParams.ownerType;
            }
            if ((i & 4) != 0) {
                sortOrder = listItemRequestParams.sortOrder;
            }
            if ((i & 8) != 0) {
                sortDirection = listItemRequestParams.sortDirection;
            }
            if ((i & 16) != 0) {
                str = listItemRequestParams.localMidnight;
            }
            String str2 = str;
            ApiCuratedList.SortOrder sortOrder2 = sortOrder;
            return listItemRequestParams.copy(uuid, ownerType, sortOrder2, sortDirection, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiCuratedList.SortOrder getSortOrder() {
            return this.sortOrder;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiCuratedList.SortDirection getSortDirection() {
            return this.sortDirection;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLocalMidnight() {
            return this.localMidnight;
        }

        public final ListItemRequestParams copy(UUID id, ApiCuratedList.OwnerType ownerType, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, String localMidnight) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            return new ListItemRequestParams(id, ownerType, sortOrder, sortDirection, localMidnight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListItemRequestParams)) {
                return false;
            }
            ListItemRequestParams listItemRequestParams = (ListItemRequestParams) other;
            return Intrinsics.areEqual(this.id, listItemRequestParams.id) && this.ownerType == listItemRequestParams.ownerType && this.sortOrder == listItemRequestParams.sortOrder && this.sortDirection == listItemRequestParams.sortDirection && Intrinsics.areEqual(this.localMidnight, listItemRequestParams.localMidnight);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.ownerType.hashCode()) * 31;
            ApiCuratedList.SortOrder sortOrder = this.sortOrder;
            int iHashCode2 = (iHashCode + (sortOrder == null ? 0 : sortOrder.hashCode())) * 31;
            ApiCuratedList.SortDirection sortDirection = this.sortDirection;
            int iHashCode3 = (iHashCode2 + (sortDirection == null ? 0 : sortDirection.hashCode())) * 31;
            String str = this.localMidnight;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ListItemRequestParams(id=" + this.id + ", ownerType=" + this.ownerType + ", sortOrder=" + this.sortOrder + ", sortDirection=" + this.sortDirection + ", localMidnight=" + this.localMidnight + ")";
        }

        public ListItemRequestParams(UUID id, ApiCuratedList.OwnerType ownerType, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            this.id = id;
            this.ownerType = ownerType;
            this.sortOrder = sortOrder;
            this.sortDirection = sortDirection;
            this.localMidnight = str;
        }

        public final UUID getId() {
            return this.id;
        }

        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        public final ApiCuratedList.SortOrder getSortOrder() {
            return this.sortOrder;
        }

        public final ApiCuratedList.SortDirection getSortDirection() {
            return this.sortDirection;
        }

        public final String getLocalMidnight() {
            return this.localMidnight;
        }
    }
}
