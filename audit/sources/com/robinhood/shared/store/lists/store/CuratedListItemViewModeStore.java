package com.robinhood.shared.store.lists.store;

import androidx.room.RoomDatabase;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.dao.CuratedListItemViewModeDao;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItemViewMode;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.lists.prefs.OptionsWatchlistViewModePref;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* compiled from: CuratedListItemViewModeStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u0011J\u0016\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0013J\u0014\u0010\u001b\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fJ\u001c\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListItemViewModeDao;", "optionsWatchlistViewModePref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CuratedListItemViewModeDao;Lcom/robinhood/prefs/StringPreference;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/db/CuratedListItemViewMode;", "", "saveAllViewModesAction", "", "streamUniversalViewMode", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/CuratedListViewMode;", "streamDefaultViewMode", "listId", "Ljava/util/UUID;", "streamCuratedListItemViewModeOrDefault", "streamCuratedListItemViewModes", "updateViewMode", "viewMode", "syncViewModes", "followedLists", "Lcom/robinhood/models/api/ApiCuratedList;", "updateAllViewModes", "followedUserLists", "Lcom/robinhood/models/db/CuratedList;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListItemViewModeStore extends Store {
    private final CuratedListItemViewModeDao dao;
    private StringPreference optionsWatchlistViewModePref;
    private final Function1<CuratedListItemViewMode, Unit> saveAction;
    private final Function1<List<CuratedListItemViewMode>, Unit> saveAllViewModesAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListItemViewModeStore(StoreBundle storeBundle, final CuratedListItemViewModeDao dao, @OptionsWatchlistViewModePref StringPreference optionsWatchlistViewModePref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsWatchlistViewModePref, "optionsWatchlistViewModePref");
        this.dao = dao;
        this.optionsWatchlistViewModePref = optionsWatchlistViewModePref;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<CuratedListItemViewMode, Unit>() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CuratedListItemViewMode curatedListItemViewMode) {
                m25742invoke(curatedListItemViewMode);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25742invoke(CuratedListItemViewMode curatedListItemViewMode) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert((CuratedListItemViewModeDao) curatedListItemViewMode);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        final LogoutKillswitch logoutKillswitch2 = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase2 = ((Store) this).roomDatabase;
        this.saveAllViewModesAction = new Function1<List<? extends CuratedListItemViewMode>, Unit>() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$special$$inlined$safeSave$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CuratedListItemViewMode> list) {
                m25743invoke(list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25743invoke(List<? extends CuratedListItemViewMode> list) {
                if (!logoutKillswitch2.isLoggedOut()) {
                    try {
                        dao.deleteAndInsert(list);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch2.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase2.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
    }

    public final Observable<Optional<CuratedListViewMode>> streamUniversalViewMode() {
        final Flow<List<CuratedListItemViewMode>> flow = this.dao.get();
        return asObservable(takeWhileLoggedIn(new Flow<Optional<? extends CuratedListViewMode>>() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$streamUniversalViewMode$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$streamUniversalViewMode$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$streamUniversalViewMode$$inlined$map$1$2", m3645f = "CuratedListItemViewModeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$streamUniversalViewMode$$inlined$map$1$2$1, reason: invalid class name */
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
                    Optional optionalAsOptional;
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
                        if (list.isEmpty()) {
                            optionalAsOptional = Optional2.INSTANCE;
                        } else {
                            CuratedListViewMode viewMode = ((CuratedListItemViewMode) list.get(0)).getViewMode();
                            List list2 = list;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                optionalAsOptional = Optional3.asOptional(viewMode);
                            } else {
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((CuratedListItemViewMode) it.next()).getViewMode() != viewMode) {
                                        optionalAsOptional = Optional2.INSTANCE;
                                        break;
                                    }
                                }
                                optionalAsOptional = Optional3.asOptional(viewMode);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Optional<? extends CuratedListViewMode>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }));
    }

    public static /* synthetic */ Observable streamDefaultViewMode$default(CuratedListItemViewModeStore curatedListItemViewModeStore, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return curatedListItemViewModeStore.streamDefaultViewMode(uuid);
    }

    public final Observable<CuratedListViewMode> streamDefaultViewMode(UUID listId) {
        CuratedList.Companion companion = CuratedList.INSTANCE;
        if (Intrinsics.areEqual(listId, companion.getFUTURE_IPOS_LIST_ID()) || Intrinsics.areEqual(listId, companion.getFUTURES_OUTRIGHT_LIST_ID())) {
            Observable<CuratedListViewMode> observableJust = Observable.just(CuratedListViewMode.LAST_PRICE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        Observable map = streamUniversalViewMode().map(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore.streamDefaultViewMode.1
            @Override // io.reactivex.functions.Function
            public final CuratedListViewMode apply(Optional<? extends CuratedListViewMode> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedListViewMode curatedListViewModeComponent1 = optional.component1();
                return curatedListViewModeComponent1 == null ? CuratedListViewMode.LAST_PRICE : curatedListViewModeComponent1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<CuratedListViewMode> streamCuratedListItemViewModeOrDefault(final UUID listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Observable<CuratedListViewMode> observableSwitchMap = ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.get(listId)))).switchMap(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore.streamCuratedListItemViewModeOrDefault.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CuratedListViewMode> apply(Optional<CuratedListItemViewMode> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedListItemViewMode curatedListItemViewModeComponent1 = optional.component1();
                if (curatedListItemViewModeComponent1 == null) {
                    return CuratedListItemViewModeStore.this.streamDefaultViewMode(listId);
                }
                Observable observableJust = Observable.just(curatedListItemViewModeComponent1.getViewMode());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<List<CuratedListItemViewMode>> streamCuratedListItemViewModes() {
        return asObservable(takeWhileLoggedIn(this.dao.get()));
    }

    public final void updateViewMode(final UUID listId, final CuratedListViewMode viewMode) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        Observable observableSubscribeOn = Observable.fromCallable(new Callable() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore.updateViewMode.1
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() {
                call();
                return Unit.INSTANCE;
            }

            @Override // java.util.concurrent.Callable
            public final void call() {
                CuratedListItemViewModeStore.this.saveAction.invoke(new CuratedListItemViewMode(listId, viewMode));
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(observableSubscribeOn, getStoreScope());
    }

    public final void syncViewModes(final List<ApiCuratedList> followedLists) {
        Intrinsics.checkNotNullParameter(followedLists, "followedLists");
        Observable observableSubscribeOn = Observables.INSTANCE.combineLatest(streamDefaultViewMode$default(this, null, 1, null), asObservable(takeWhileLoggedIn(this.dao.get()))).take(1L).map(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore.syncViewModes.1
            @Override // io.reactivex.functions.Function
            public final List<CuratedListItemViewMode> apply(Tuples2<? extends CuratedListViewMode, ? extends List<CuratedListItemViewMode>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                CuratedListViewMode curatedListViewModeComponent1 = tuples2.component1();
                List<CuratedListItemViewMode> listComponent2 = tuples2.component2();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listComponent2, 10)), 16));
                for (T t : listComponent2) {
                    linkedHashMap.put(((CuratedListItemViewMode) t).getCuratedListId(), t);
                }
                List<ApiCuratedList> list = followedLists;
                ArrayList arrayList = new ArrayList();
                for (ApiCuratedList apiCuratedList : list) {
                    UUID id = apiCuratedList.getId();
                    CuratedListItemViewMode curatedListItemViewMode = (CuratedListItemViewMode) linkedHashMap.get(id);
                    if (curatedListItemViewMode == null) {
                        if (apiCuratedList.getOwner_type() == ApiCuratedList.OwnerType.ROBINHOOD && Intrinsics.areEqual(apiCuratedList.getAllowed_object_types(), SetsKt.setOf(CuratedListObjectType.FUTURES_CONTRACT))) {
                            curatedListItemViewMode = new CuratedListItemViewMode(id, CuratedListViewMode.FUTURES_MARGIN_REQUIREMENT);
                        } else {
                            curatedListItemViewMode = apiCuratedList.getOwner_type() == ApiCuratedList.OwnerType.CUSTOM ? new CuratedListItemViewMode(id, curatedListViewModeComponent1) : null;
                        }
                    }
                    if (curatedListItemViewMode != null) {
                        arrayList.add(curatedListItemViewMode);
                    }
                }
                return arrayList;
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(observableSubscribeOn, getStoreScope(), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemViewModeStore.syncViewModes$lambda$3(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncViewModes$lambda$3(CuratedListItemViewModeStore curatedListItemViewModeStore, List list) {
        Function1<List<CuratedListItemViewMode>, Unit> function1 = curatedListItemViewModeStore.saveAllViewModesAction;
        Intrinsics.checkNotNull(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public final void updateAllViewModes(final CuratedListViewMode viewMode, List<CuratedList> followedUserLists) {
        Object next;
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        Intrinsics.checkNotNullParameter(followedUserLists, "followedUserLists");
        List<CuratedList> list = followedUserLists;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CuratedList) next).isOptionsWatchlist()) {
                    break;
                }
            }
        }
        if (((CuratedList) next) != null) {
            this.optionsWatchlistViewModePref.set(viewMode.toString());
        }
        final List list2 = SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemViewModeStore.updateAllViewModes$lambda$5(viewMode, (CuratedList) obj);
            }
        }));
        Completable completableSubscribeOn = Completable.fromAction(new Action() { // from class: com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore.updateAllViewModes.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                CuratedListItemViewModeStore.this.saveAllViewModesAction.invoke(list2);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(completableSubscribeOn, getStoreScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemViewMode updateAllViewModes$lambda$5(CuratedListViewMode curatedListViewMode, CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        return new CuratedListItemViewMode(curatedList.getId(), curatedListViewMode);
    }
}
