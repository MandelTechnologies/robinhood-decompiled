package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiUserListItem;
import com.robinhood.models.dao.ListItemIdToUserListIdsDao;
import com.robinhood.models.p320db.ListItemIdToUserListIds;
import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ListItemIdToUserListIdsStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\u00152\u0006\u0010\u0013\u001a\u00020\u000eJ,\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\r0\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000fJ,\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\r0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000fJ\u0010\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eJ\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a \u0012\u0004\u0012\u00020\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "Lcom/robinhood/store/Store;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ListItemIdToUserListIdsDao;", "<init>", "(Lcom/robinhood/android/api/discovery/DiscoveryApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/ListItemIdToUserListIdsDao;)V", "getUserItemsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/ApiUserListItem;", "stream", "Lio/reactivex/Observable;", "listItemId", "streamCo", "Lkotlinx/coroutines/flow/Flow;", "listItemIds", "refresh", "force", "", "fetch", "Lio/reactivex/Completable;", "addListId", "listId", "removeListId", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ListItemIdToUserListIdsStore extends Store {
    private final ListItemIdToUserListIdsDao dao;
    private final DiscoveryApi discoveryApi;
    private final Endpoint<Unit, Map<UUID, List<ApiUserListItem>>> getUserItemsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemIdToUserListIdsStore(DiscoveryApi discoveryApi, StoreBundle storeBundle, ListItemIdToUserListIdsDao dao) {
        super(storeBundle, StaleConfig.Companion.of$default(StaleConfig.INSTANCE, Durations.INSTANCE.getONE_MINUTE(), null, 2, null));
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.discoveryApi = discoveryApi;
        this.dao = dao;
        this.getUserItemsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ListItemIdToUserListIdsStore2(this, null), getLogoutKillswitch(), new ListItemIdToUserListIdsStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<List<UUID>> stream(UUID listItemId) {
        Intrinsics.checkNotNullParameter(listItemId, "listItemId");
        final Flow<List<ListItemIdToUserListIds>> flow = this.dao.get(listItemId);
        return asObservable(takeWhileLoggedIn(new Flow<List<? extends UUID>>() { // from class: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$1$2 */
            public static final class C399832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$1$2", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C399832.this.emit(null, this);
                    }
                }

                public C399832(FlowCollector flowCollector) {
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
                        ListItemIdToUserListIds listItemIdToUserListIds = (ListItemIdToUserListIds) CollectionsKt.firstOrNull((List) obj);
                        List<UUID> userListIds = listItemIdToUserListIds != null ? listItemIdToUserListIds.getUserListIds() : null;
                        if (userListIds == null) {
                            userListIds = CollectionsKt.emptyList();
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(userListIds, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C399832(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }));
    }

    public final Flow<List<UUID>> streamCo(UUID listItemId) {
        Intrinsics.checkNotNullParameter(listItemId, "listItemId");
        final Flow<List<ListItemIdToUserListIds>> co2 = this.dao.getCo(listItemId);
        return new Flow<List<? extends UUID>>() { // from class: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$1$2 */
            public static final class C399852<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$1$2", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C399852.this.emit(null, this);
                    }
                }

                public C399852(FlowCollector flowCollector) {
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
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            CollectionsKt.addAll(arrayList, ((ListItemIdToUserListIds) it.next()).getUserListIds());
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = co2.collect(new C399852(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<Map<UUID, List<UUID>>> stream(final List<UUID> listItemIds) {
        Intrinsics.checkNotNullParameter(listItemIds, "listItemIds");
        final Flow<List<ListItemIdToUserListIds>> flow = this.dao.get(listItemIds);
        return asObservable(new Flow<Map<UUID, List<? extends UUID>>>() { // from class: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, List<? extends UUID>>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C399842(flowCollector, listItemIds), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$2$2 */
            public static final class C399842<T> implements FlowCollector {
                final /* synthetic */ List $listItemIds$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$2$2", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$stream$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C399842.this.emit(null, this);
                    }
                }

                public C399842(FlowCollector flowCollector, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$listItemIds$inlined = list;
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
                        List<ListItemIdToUserListIds> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (ListItemIdToUserListIds listItemIdToUserListIds : list) {
                            Tuples2 tuples2M3642to = Tuples4.m3642to(listItemIdToUserListIds.getListItemId(), listItemIdToUserListIds.getUserListIds());
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                        for (UUID uuid : this.$listItemIds$inlined) {
                            if (!mutableMap.containsKey(uuid)) {
                                mutableMap.put(uuid, CollectionsKt.emptyList());
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(mutableMap, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    public final Flow<Map<UUID, List<UUID>>> streamCo(final List<UUID> listItemIds) {
        Intrinsics.checkNotNullParameter(listItemIds, "listItemIds");
        final Flow<List<ListItemIdToUserListIds>> co2 = this.dao.getCo(listItemIds);
        return new Flow<Map<UUID, List<? extends UUID>>>() { // from class: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$2$2 */
            public static final class C399862<T> implements FlowCollector {
                final /* synthetic */ List $listItemIds$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$2$2", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$streamCo$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C399862.this.emit(null, this);
                    }
                }

                public C399862(FlowCollector flowCollector, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$listItemIds$inlined = list;
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
                        List<ListItemIdToUserListIds> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (ListItemIdToUserListIds listItemIdToUserListIds : list) {
                            Tuples2 tuples2M3642to = Tuples4.m3642to(listItemIdToUserListIds.getListItemId(), listItemIdToUserListIds.getUserListIds());
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                        for (UUID uuid : this.$listItemIds$inlined) {
                            if (!mutableMap.containsKey(uuid)) {
                                mutableMap.put(uuid, CollectionsKt.emptyList());
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(mutableMap, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Map<UUID, List<? extends UUID>>> flowCollector, Continuation continuation) {
                Object objCollect = co2.collect(new C399862(flowCollector, listItemIds), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ void refresh$default(ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        listItemIdToUserListIdsStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint8.refresh$default(this.getUserItemsEndpoint, force, null, 2, null);
    }

    /* compiled from: ListItemIdToUserListIdsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$fetch$1", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$fetch$1 */
    static final class C399871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C399871(Continuation<? super C399871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ListItemIdToUserListIdsStore.this.new C399871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = ListItemIdToUserListIdsStore.this.getUserItemsEndpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable fetch() {
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C399871(null), 1, null);
    }

    public final void addListId(final UUID listItemId, final UUID listId) {
        Intrinsics.checkNotNullParameter(listItemId, "listItemId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Observable<List<UUID>> observableTake = stream(listItemId).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedSubscriptionKt.subscribeIn(observableTake, getStoreScope(), new Function1() { // from class: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListItemIdToUserListIdsStore.addListId$lambda$7(listId, this, listItemId, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListId$lambda$7(UUID uuid, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, UUID uuid2, List list) {
        Intrinsics.checkNotNull(list);
        listItemIdToUserListIdsStore.dao.insert((ListItemIdToUserListIdsDao) new ListItemIdToUserListIds(uuid2, CollectionsKt.plus((Collection<? extends UUID>) list, uuid)));
        return Unit.INSTANCE;
    }

    public final void removeListId(final UUID listItemId, final UUID listId) {
        Intrinsics.checkNotNullParameter(listItemId, "listItemId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Observable<List<UUID>> observableTake = stream(listItemId).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedSubscriptionKt.subscribeIn(observableTake, getStoreScope(), new Function1() { // from class: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListItemIdToUserListIdsStore.removeListId$lambda$8(listId, this, listItemId, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeListId$lambda$8(UUID uuid, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, UUID uuid2, List list) {
        Intrinsics.checkNotNull(list);
        listItemIdToUserListIdsStore.dao.insert((ListItemIdToUserListIdsDao) new ListItemIdToUserListIds(uuid2, CollectionsKt.minus(list, uuid)));
        return Unit.INSTANCE;
    }
}
