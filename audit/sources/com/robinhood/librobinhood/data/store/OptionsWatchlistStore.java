package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CuratedListItemOperation;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.CuratedListOperationType;
import com.robinhood.models.api.OptionCuratedListQuickAddRequest;
import com.robinhood.models.dao.CuratedListDao;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedList3;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: OptionsWatchlistStore.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u0015J\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00152\u0006\u0010 \u001a\u00020!J&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0#0\u00160\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0%J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00152\u0006\u0010 \u001a\u00020!J \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0#0\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,J$\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0/0\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,J\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u0015J$\u00101\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0/0/0\u0015J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u0017032\u0006\u00104\u001a\u000205J\u0016\u00106\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "Lcom/robinhood/store/Store;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListDao;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/android/api/discovery/DiscoveryApi;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CuratedListDao;)V", "saveCuratedListAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiCuratedList;", "", "streamList", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/CuratedList;", "refreshItems", "Lio/reactivex/Completable;", "force", "", "streamAllItems", "Lcom/robinhood/models/db/CuratedListItems;", "streamItemByStrategyCode", "Lcom/robinhood/models/db/CuratedListItem;", "strategyCode", "", "streamItemsByStrategyCodes", "", "strategyCodes", "", "streamWatchlistItemState", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "streamWatchlistItemStates", "streamActiveItemCount", "", "optionsWatchlistId", "Ljava/util/UUID;", "streamItemCounts", "streamGroupedItemCounts", "Lkotlin/Pair;", "getOptionWatchlistId", "getOptionWatchlistIdAndItemCounts", "addItem", "Lio/reactivex/Single;", "request", "Lcom/robinhood/models/api/OptionCuratedListQuickAddRequest;", "removeItem", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionsWatchlistStore extends Store {
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final CuratedListDao dao;
    private final DiscoveryApi discoveryApi;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final Function1<ApiCuratedList, Unit> saveCuratedListAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsWatchlistStore(CuratedListItemsStore curatedListItemsStore, CuratedListStore curatedListStore, DiscoveryApi discoveryApi, OptionStrategyInfoStore optionStrategyInfoStore, StoreBundle storeBundle, final CuratedListDao dao) {
        super(storeBundle, CuratedList.INSTANCE);
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListStore = curatedListStore;
        this.discoveryApi = discoveryApi;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveCuratedListAction = new Function1<ApiCuratedList, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiCuratedList apiCuratedList) {
                m22702invoke(apiCuratedList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22702invoke(ApiCuratedList apiCuratedList) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiCuratedList);
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
    }

    public final Observable<Optional<CuratedList>> streamList() {
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.getOptionsWatchlist())));
    }

    public static /* synthetic */ Completable refreshItems$default(OptionsWatchlistStore optionsWatchlistStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return optionsWatchlistStore.refreshItems(z);
    }

    public final Completable refreshItems(final boolean force) {
        Completable completableSwitchMapCompletable = streamList().switchMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.refreshItems.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Optional<CuratedList> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedList curatedListComponent1 = optional.component1();
                if (curatedListComponent1 != null) {
                    return CuratedListItemsStore.refreshListItems$default(OptionsWatchlistStore.this.curatedListItemsStore, force, curatedListComponent1.getId(), curatedListComponent1.getOwnerType(), null, null, null, 56, null);
                }
                return Completable.complete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        return completableSwitchMapCompletable;
    }

    public final Observable<Optional<CuratedListItems>> streamAllItems() {
        Observable observableSwitchMap = streamList().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamAllItems.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<CuratedListItems>> apply(Optional<CuratedList> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedList curatedListComponent1 = optional.component1();
                if (curatedListComponent1 != null) {
                    return OptionsWatchlistStore.this.curatedListItemsStore.streamCuratedListItemsOptional(curatedListComponent1.getId());
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Optional<CuratedListItem>> streamItemByStrategyCode(final String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Observable map = streamAllItems().map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamItemByStrategyCode.1
            @Override // io.reactivex.functions.Function
            public final Optional<CuratedListItem> apply(Optional<CuratedListItems> optional) {
                List<CuratedListItem> listItems;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedListItems curatedListItemsComponent1 = optional.component1();
                CuratedListItem curatedListItem = null;
                if (curatedListItemsComponent1 != null && (listItems = curatedListItemsComponent1.getListItems()) != null) {
                    String str = strategyCode;
                    Iterator<T> it = listItems.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (Intrinsics.areEqual(((CuratedListItem) next).getStrategyCode(), str)) {
                            curatedListItem = next;
                            break;
                        }
                    }
                    curatedListItem = curatedListItem;
                }
                return Optional3.asOptional(curatedListItem);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Optional<List<CuratedListItem>>> streamItemsByStrategyCodes(final Set<String> strategyCodes) {
        Intrinsics.checkNotNullParameter(strategyCodes, "strategyCodes");
        Observable map = streamAllItems().map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamItemsByStrategyCodes.1
            @Override // io.reactivex.functions.Function
            public final Optional<List<CuratedListItem>> apply(Optional<CuratedListItems> optional) {
                ArrayList arrayList;
                List<CuratedListItem> listItems;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedListItems curatedListItemsComponent1 = optional.component1();
                if (curatedListItemsComponent1 == null || (listItems = curatedListItemsComponent1.getListItems()) == null) {
                    arrayList = null;
                } else {
                    Set<String> set = strategyCodes;
                    arrayList = new ArrayList();
                    for (T t : listItems) {
                        if (CollectionsKt.contains(set, ((CuratedListItem) t).getStrategyCode())) {
                            arrayList.add(t);
                        }
                    }
                }
                return Optional3.asOptional(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<OptionWatchlistItemState> streamWatchlistItemState(String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Observable map = streamItemByStrategyCode(strategyCode).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamWatchlistItemState.1
            @Override // io.reactivex.functions.Function
            public final OptionWatchlistItemState apply(Optional<CuratedListItem> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                if (optional.component1() != null) {
                    return OptionWatchlistItemState.ADDED;
                }
                return OptionWatchlistItemState.NOT_ADDED;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<OptionWatchlistItemState>> streamWatchlistItemStates(final List<String> strategyCodes) {
        Intrinsics.checkNotNullParameter(strategyCodes, "strategyCodes");
        Observable map = streamItemsByStrategyCodes(CollectionsKt.toSet(strategyCodes)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamWatchlistItemStates.1
            /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List<OptionWatchlistItemState> apply(Optional<? extends List<CuratedListItem>> curatedListItems) {
                Set setEmptySet;
                Intrinsics.checkNotNullParameter(curatedListItems, "curatedListItems");
                List<CuratedListItem> orNull = curatedListItems.getOrNull();
                if (orNull != null) {
                    List<CuratedListItem> list = orNull;
                    LinkedHashSet linkedHashSet = list instanceof Collection ? new LinkedHashSet(list.size()) : new LinkedHashSet();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((CuratedListItem) it.next()).getStrategyCode());
                    }
                    setEmptySet = Collections.unmodifiableSet(linkedHashSet);
                    Intrinsics.checkNotNullExpressionValue(setEmptySet, "unmodifiableSet(...)");
                    if (setEmptySet == null) {
                        setEmptySet = SetsKt.emptySet();
                    }
                }
                List<String> list2 = strategyCodes;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(setEmptySet.contains((String) it2.next()) ? OptionWatchlistItemState.ADDED : OptionWatchlistItemState.NOT_ADDED);
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Observable streamActiveItemCount$default(OptionsWatchlistStore optionsWatchlistStore, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return optionsWatchlistStore.streamActiveItemCount(uuid);
    }

    public final Observable<Integer> streamActiveItemCount(UUID optionsWatchlistId) {
        Observable<CuratedListItems> observableSwitchMap;
        if (optionsWatchlistId != null) {
            observableSwitchMap = this.curatedListItemsStore.streamCuratedListItems(optionsWatchlistId);
        } else {
            Observable<R> map = streamList().map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$streamActiveItemCount$$inlined$mapDistinctNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CuratedList curatedList = (CuratedList) ((Optional) it).getOrNull();
                    return Optional3.asOptional(curatedList != null ? curatedList.getId() : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C34170x35bf22ac<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            final CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
            observableSwitchMap = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$streamActiveItemCount$itemsObs$2
                @Override // io.reactivex.functions.Function
                public final Observable<CuratedListItems> apply(UUID p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return curatedListItemsStore.streamCuratedListItems(p0);
                }
            });
        }
        Observable<Integer> observableDistinctUntilChanged2 = observableSwitchMap.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamActiveItemCount.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Integer> apply(CuratedListItems curatedListItems) {
                Intrinsics.checkNotNullParameter(curatedListItems, "curatedListItems");
                List<CuratedListItem> listItems = curatedListItems.getListItems();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listItems, 10));
                Iterator<T> it = listItems.iterator();
                while (it.hasNext()) {
                    String strategyCode = ((CuratedListItem) it.next()).getStrategyCode();
                    Intrinsics.checkNotNull(strategyCode);
                    arrayList.add(strategyCode);
                }
                OptionStrategyInfoStore.refresh$default(OptionsWatchlistStore.this.optionStrategyInfoStore, arrayList, false, 2, null);
                return OptionsWatchlistStore.this.optionStrategyInfoStore.streamUiStrategyInfo(arrayList).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamActiveItemCount.1.1
                    @Override // io.reactivex.functions.Function
                    public final Integer apply(List<UiOptionStrategyInfo> strategyInfoList) {
                        OptionInstrument optionInstrument;
                        Intrinsics.checkNotNullParameter(strategyInfoList, "strategyInfoList");
                        List<UiOptionStrategyInfo> list = strategyInfoList;
                        int i = 0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it2 = list.iterator();
                            int i2 = 0;
                            while (it2.hasNext()) {
                                UiOptionStrategyLeg uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.firstOrNull((List) ((UiOptionStrategyInfo) it2.next()).getLegs());
                                if (((uiOptionStrategyLeg == null || (optionInstrument = uiOptionStrategyLeg.getOptionInstrument()) == null) ? false : optionInstrument.isActive()) && (i2 = i2 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                            i = i2;
                        }
                        return Integer.valueOf(i);
                    }
                });
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged2;
    }

    public static /* synthetic */ Observable streamItemCounts$default(OptionsWatchlistStore optionsWatchlistStore, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return optionsWatchlistStore.streamItemCounts(uuid);
    }

    public final Observable<Integer> streamItemCounts(UUID optionsWatchlistId) {
        Observable<Optional<CuratedListItems>> observableSwitchMap;
        if (optionsWatchlistId != null) {
            observableSwitchMap = this.curatedListItemsStore.streamCuratedListItemsOptional(optionsWatchlistId);
        } else {
            Observable<R> map = streamList().map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$streamItemCounts$$inlined$mapDistinctNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CuratedList curatedList = (CuratedList) ((Optional) it).getOrNull();
                    return Optional3.asOptional(curatedList != null ? curatedList.getId() : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C34172xa7542b71<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            final CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
            observableSwitchMap = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$streamItemCounts$itemsObs$2
                @Override // io.reactivex.functions.Function
                public final Observable<Optional<CuratedListItems>> apply(UUID p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return curatedListItemsStore.streamCuratedListItemsOptional(p0);
                }
            });
        }
        Observable map2 = observableSwitchMap.map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamItemCounts.1
            @Override // io.reactivex.functions.Function
            public final Integer apply(Optional<CuratedListItems> optional) {
                List<CuratedListItem> listItems;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CuratedListItems curatedListItemsComponent1 = optional.component1();
                return Integer.valueOf((curatedListItemsComponent1 == null || (listItems = curatedListItemsComponent1.getListItems()) == null) ? 0 : listItems.size());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public static /* synthetic */ Observable streamGroupedItemCounts$default(OptionsWatchlistStore optionsWatchlistStore, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return optionsWatchlistStore.streamGroupedItemCounts(uuid);
    }

    public final Observable<Tuples2<Integer, Integer>> streamGroupedItemCounts(UUID optionsWatchlistId) {
        Observable<CuratedListItems> observableSwitchMap;
        if (optionsWatchlistId == null) {
            Observable<R> map = streamList().map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$streamGroupedItemCounts$$inlined$mapDistinctNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CuratedList curatedList = (CuratedList) ((Optional) it).getOrNull();
                    return Optional3.asOptional(curatedList != null ? curatedList.getId() : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C34171x6fb551cb<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            final CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
            observableSwitchMap = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$streamGroupedItemCounts$itemsObs$2
                @Override // io.reactivex.functions.Function
                public final Observable<CuratedListItems> apply(UUID p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return curatedListItemsStore.streamCuratedListItems(p0);
                }
            });
        } else {
            observableSwitchMap = this.curatedListItemsStore.streamCuratedListItems(optionsWatchlistId);
        }
        Observable<Tuples2<Integer, Integer>> observableDistinctUntilChanged2 = observableSwitchMap.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamGroupedItemCounts.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Integer, Integer>> apply(CuratedListItems curatedListItems) {
                Intrinsics.checkNotNullParameter(curatedListItems, "curatedListItems");
                List<CuratedListItem> listItems = curatedListItems.getListItems();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listItems, 10));
                Iterator<T> it = listItems.iterator();
                while (it.hasNext()) {
                    String strategyCode = ((CuratedListItem) it.next()).getStrategyCode();
                    Intrinsics.checkNotNull(strategyCode);
                    arrayList.add(strategyCode);
                }
                OptionStrategyInfoStore.refresh$default(OptionsWatchlistStore.this.optionStrategyInfoStore, arrayList, false, 2, null);
                return OptionsWatchlistStore.this.optionStrategyInfoStore.streamUiStrategyInfo(arrayList).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.streamGroupedItemCounts.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Integer, Integer> apply(List<UiOptionStrategyInfo> strategyInfoList) {
                        int i;
                        OptionInstrument optionInstrument;
                        OptionInstrument optionInstrument2;
                        Intrinsics.checkNotNullParameter(strategyInfoList, "strategyInfoList");
                        List<UiOptionStrategyInfo> list = strategyInfoList;
                        boolean z = list instanceof Collection;
                        int i2 = 0;
                        if (z && list.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator<T> it2 = list.iterator();
                            i = 0;
                            while (it2.hasNext()) {
                                UiOptionStrategyLeg uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.firstOrNull((List) ((UiOptionStrategyInfo) it2.next()).getLegs());
                                if (((uiOptionStrategyLeg == null || (optionInstrument = uiOptionStrategyLeg.getOptionInstrument()) == null) ? false : optionInstrument.isActive()) && (i = i + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        if (!z || !list.isEmpty()) {
                            Iterator<T> it3 = list.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                UiOptionStrategyLeg uiOptionStrategyLeg2 = (UiOptionStrategyLeg) CollectionsKt.firstOrNull((List) ((UiOptionStrategyInfo) it3.next()).getLegs());
                                if (((uiOptionStrategyLeg2 == null || (optionInstrument2 = uiOptionStrategyLeg2.getOptionInstrument()) == null) ? false : optionInstrument2.isExpired()) && (i3 = i3 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                            i2 = i3;
                        }
                        return Tuples4.m3642to(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                });
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged2;
    }

    public final Observable<UUID> getOptionWatchlistId() {
        Observable<UUID> observableTake = ObservablesKt.filterIsPresent(streamList()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.getOptionWatchlistId.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(CuratedList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return observableTake;
    }

    public final Observable<Tuples2<UUID, Tuples2<Integer, Integer>>> getOptionWatchlistIdAndItemCounts() {
        Observable<Tuples2<UUID, Tuples2<Integer, Integer>>> observableTake = getOptionWatchlistId().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.getOptionWatchlistIdAndItemCounts.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<UUID, Tuples2<Integer, Integer>>> apply(final UUID optionWatchlistId) {
                Intrinsics.checkNotNullParameter(optionWatchlistId, "optionWatchlistId");
                return OptionsWatchlistStore.this.streamGroupedItemCounts(optionWatchlistId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.getOptionWatchlistIdAndItemCounts.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<UUID, Tuples2<Integer, Integer>> apply(Tuples2<Integer, Integer> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(optionWatchlistId, it);
                    }
                });
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return observableTake;
    }

    /* compiled from: OptionsWatchlistStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCuratedList;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsWatchlistStore$addItem$1", m3645f = "OptionsWatchlistStore.kt", m3646l = {201}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$addItem$1 */
    static final class C341731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCuratedList>, Object> {
        final /* synthetic */ OptionCuratedListQuickAddRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341731(OptionCuratedListQuickAddRequest optionCuratedListQuickAddRequest, Continuation<? super C341731> continuation) {
            super(2, continuation);
            this.$request = optionCuratedListQuickAddRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsWatchlistStore.this.new C341731(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCuratedList> continuation) {
            return ((C341731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            DiscoveryApi discoveryApi = OptionsWatchlistStore.this.discoveryApi;
            OptionCuratedListQuickAddRequest optionCuratedListQuickAddRequest = this.$request;
            this.label = 1;
            Object objQuickAddItemToOptionWatchlist = discoveryApi.quickAddItemToOptionWatchlist(optionCuratedListQuickAddRequest, this);
            return objQuickAddItemToOptionWatchlist == coroutine_suspended ? coroutine_suspended : objQuickAddItemToOptionWatchlist;
        }
    }

    public final Single<CuratedList> addItem(OptionCuratedListQuickAddRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<CuratedList> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C341731(request, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.addItem.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiCuratedList apiCuratedList) {
                Function1 function1 = OptionsWatchlistStore.this.saveCuratedListAction;
                Intrinsics.checkNotNull(apiCuratedList);
                function1.invoke(apiCuratedList);
                CuratedListItemsStore.refreshListItems$default(OptionsWatchlistStore.this.curatedListItemsStore, true, apiCuratedList.getId(), apiCuratedList.getOwner_type(), null, null, null, 56, null);
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.addItem.3
            @Override // io.reactivex.functions.Function
            public final CuratedList apply(ApiCuratedList p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return CuratedList3.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Completable removeItem(final String strategyCode, final UUID optionsWatchlistId) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(optionsWatchlistId, "optionsWatchlistId");
        Completable completableFlatMapCompletable = this.curatedListItemsStore.streamCuratedListItems(optionsWatchlistId).take(1L).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.removeItem.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(CuratedListItems items) {
                T next;
                final UUID id;
                Intrinsics.checkNotNullParameter(items, "items");
                List<CuratedListItem> listItems = items.getListItems();
                String str = strategyCode;
                Iterator<T> it = listItems.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((CuratedListItem) next).getStrategyCode(), str)) {
                        break;
                    }
                }
                CuratedListItem curatedListItem = next;
                if (curatedListItem == null || (id = curatedListItem.getId()) == null) {
                    return Completable.complete();
                }
                List listListOf = CollectionsKt.listOf(new CuratedListItemOperation(CuratedListObjectType.OPTION_STRATEGY, id, CuratedListOperationType.DELETE, null, 8, null));
                OptionsWatchlistStore optionsWatchlistStore = OptionsWatchlistStore.this;
                Completable completableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(optionsWatchlistStore, null, new AnonymousClass1(optionsWatchlistStore, optionsWatchlistId, listListOf, null), 1, null).subscribeOn(Schedulers.m3346io());
                final OptionsWatchlistStore optionsWatchlistStore2 = OptionsWatchlistStore.this;
                final UUID uuid = optionsWatchlistId;
                return completableSubscribeOn.doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.OptionsWatchlistStore.removeItem.1.2
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        optionsWatchlistStore2.curatedListStore.refreshList(true, uuid, ApiCuratedList.OwnerType.CUSTOM);
                        optionsWatchlistStore2.curatedListItemsStore.removeListItem(uuid, id);
                    }
                });
            }

            /* compiled from: OptionsWatchlistStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsWatchlistStore$removeItem$1$1", m3645f = "OptionsWatchlistStore.kt", m3646l = {224}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.OptionsWatchlistStore$removeItem$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ List<CuratedListItemOperation> $itemOperations;
                final /* synthetic */ UUID $optionsWatchlistId;
                int label;
                final /* synthetic */ OptionsWatchlistStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsWatchlistStore optionsWatchlistStore, UUID uuid, List<CuratedListItemOperation> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsWatchlistStore;
                    this.$optionsWatchlistId = uuid;
                    this.$itemOperations = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$optionsWatchlistId, this.$itemOperations, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
                        Map<UUID, List<CuratedListItemOperation>> mapMapOf = MapsKt.mapOf(Tuples4.m3642to(this.$optionsWatchlistId, this.$itemOperations));
                        this.label = 1;
                        if (discoveryApi.updateList(mapMapOf, this) == coroutine_suspended) {
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
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return completableFlatMapCompletable;
    }
}
