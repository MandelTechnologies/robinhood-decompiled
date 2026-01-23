package com.robinhood.librobinhood.data.store.newsfeed;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedAssetElement;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedAssetElementDao;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: NewsFeedAssetElementStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0019\u001a\u00020\fJ \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0017J\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001c\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\n\u001a*\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "Lcom/robinhood/store/Store;", "doraApi", "Lcom/robinhood/api/retrofit/DoraApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedAssetElementDao;", "<init>", "(Lcom/robinhood/api/retrofit/DoraApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/newsfeed/db/dao/NewsFeedAssetElementDao;)V", "defaultSaveElementsAction", "Lkotlin/Function3;", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/jvm/functions/Function3;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "streamNewsFeedElements", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "assetId", "streamNewsFeedElementsFromAssetList", "Lkotlinx/coroutines/flow/Flow;", "assetIds", "refresh", "force", "", "refreshWithAssetIdList", "lib-store-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class NewsFeedAssetElementStore extends Store {
    private final NewsFeedAssetElementDao dao;
    private final Function3<UUID, PaginatedResult<ApiNewsFeedElement>, Continuation<? super Unit>, Object> defaultSaveElementsAction;
    private final DoraApi doraApi;
    private final Endpoint<UUID, PaginatedResult<ApiNewsFeedElement>> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedAssetElementStore(DoraApi doraApi, StoreBundle storeBundle, NewsFeedAssetElementDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(doraApi, "doraApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.doraApi = doraApi;
        this.dao = dao;
        NewsFeedAssetElementStore2 newsFeedAssetElementStore2 = new NewsFeedAssetElementStore2(this, null);
        this.defaultSaveElementsAction = newsFeedAssetElementStore2;
        this.endpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new NewsFeedAssetElementStore3(this, null), getLogoutKillswitch(), newsFeedAssetElementStore2, storeBundle.getClock(), null, 16, null);
    }

    public final Observable<List<NewsFeedElement>> streamNewsFeedElements(UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        final Flow<List<NewsFeedAssetElement>> flow = this.dao.get(assetId);
        return asObservable(takeWhileLoggedIn(new Flow<List<? extends NewsFeedElement>>() { // from class: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElements$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElements$$inlined$map$1$2 */
            public static final class C348572<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElements$$inlined$map$1$2", m3645f = "NewsFeedAssetElementStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElements$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C348572.this.emit(null, this);
                    }
                }

                public C348572(FlowCollector flowCollector) {
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
                            arrayList.add(((NewsFeedAssetElement) it.next()).getElement());
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
            public Object collect(FlowCollector<? super List<? extends NewsFeedElement>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C348572(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }));
    }

    public final Flow<List<NewsFeedElement>> streamNewsFeedElementsFromAssetList(List<UUID> assetIds) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        final Flow<List<NewsFeedAssetElement>> byAssetList = this.dao.getByAssetList(assetIds);
        return takeWhileLoggedIn(new Flow<List<? extends NewsFeedElement>>() { // from class: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElementsFromAssetList$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElementsFromAssetList$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElementsFromAssetList$$inlined$map$1$2", m3645f = "NewsFeedAssetElementStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$streamNewsFeedElementsFromAssetList$$inlined$map$1$2$1, reason: invalid class name */
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
                            arrayList.add(((NewsFeedAssetElement) it.next()).getElement());
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
            public Object collect(FlowCollector<? super List<? extends NewsFeedElement>> flowCollector, Continuation continuation) {
                Object objCollect = byAssetList.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final void refresh(UUID assetId, boolean force) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, assetId, force, null, 4, null);
    }

    /* compiled from: NewsFeedAssetElementStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$refreshWithAssetIdList$1", m3645f = "NewsFeedAssetElementStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore$refreshWithAssetIdList$1 */
    static final class C348591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<UUID> $assetIds;
        final /* synthetic */ boolean $force;
        int label;
        final /* synthetic */ NewsFeedAssetElementStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348591(List<UUID> list, NewsFeedAssetElementStore newsFeedAssetElementStore, boolean z, Continuation<? super C348591> continuation) {
            super(2, continuation);
            this.$assetIds = list;
            this.this$0 = newsFeedAssetElementStore;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C348591(this.$assetIds, this.this$0, this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<UUID> list = this.$assetIds;
            NewsFeedAssetElementStore newsFeedAssetElementStore = this.this$0;
            boolean z = this.$force;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                newsFeedAssetElementStore.refresh((UUID) it.next(), z);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshWithAssetIdList(boolean force, List<UUID> assetIds) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C348591(assetIds, this, force, null), 3, null);
    }
}
