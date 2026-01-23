package com.robinhood.shared.store.lists.store;

import androidx.room.RoomDatabase;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CreateOrUpdateListRequest;
import com.robinhood.models.api.CuratedListItemOperation;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.CuratedListOperationType;
import com.robinhood.models.api.CuratedListQuickAddRequest;
import com.robinhood.models.dao.CuratedListDao;
import com.robinhood.models.dao.FollowedCuratedListIdDao;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedList3;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.FollowedCuratedListId;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import retrofit2.Response;
import timber.log.Timber;

/* compiled from: CuratedListStore.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001[BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)2\u0006\u0010,\u001a\u00020\u001bJ\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020+0)2\u0006\u0010,\u001a\u00020\u001bJ\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+000/J\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+000)2\u0006\u00102\u001a\u000203J\u001e\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010,\u001a\u00020\u001b2\u0006\u00102\u001a\u000203J\u000e\u00108\u001a\u00020\u00172\u0006\u00106\u001a\u000207J\u0012\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+000/J\u0012\u0010:\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010;\u001a\u00020\u001bJ\u0012\u0010<\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010;\u001a\u00020\u001bJ\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020+0>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@J\u0012\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0)J\u0016\u0010C\u001a\u0002052\u0006\u0010,\u001a\u00020\u001b2\u0006\u00102\u001a\u000203J\u001e\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u001e\u0010J\u001a\u0002052\u0006\u0010E\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020IJ\u0010\u0010C\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u001bH\u0002J \u0010L\u001a\u0002052\u0018\u0010M\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020O000NJD\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00160>2\u0006\u0010;\u001a\u00020\u001b2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VJ\u000e\u0010W\u001a\u00020\u00172\u0006\u0010X\u001a\u00020YJ\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020+0>2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001b \u001c*\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001d\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00160$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "Lcom/robinhood/store/Store;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListDao;", "followedCuratedListIdDao", "Lcom/robinhood/models/dao/FollowedCuratedListIdDao;", "<init>", "(Lcom/robinhood/android/api/discovery/DiscoveryApi;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CuratedListDao;Lcom/robinhood/models/dao/FollowedCuratedListIdDao;)V", "saveCuratedListAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiCuratedList;", "", "deletedCuratedListRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "saveCuratedListsAndDeleteFollowsAction", "Lkotlin/Function2;", "Lcom/robinhood/models/PaginatedResult;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "listEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/store/lists/store/CuratedListStore$ListEndpointParams;", "followedListEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "streamCuratedListOptional", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/CuratedList;", "id", "streamCuratedList", "streamCuratedLists", "Lkotlinx/coroutines/flow/Flow;", "", "streamCuratedListsByOwnerType", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "refreshList", "Lio/reactivex/Completable;", "force", "", "refreshFollowedLists", "streamFollowedCuratedListsInOrder", "followList", "listId", "unfollowList", "createCuratedList", "Lio/reactivex/Single;", "listName", "", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "streamDeletedLists", "deleteList", "addToList", "curatedListId", "security", "Lcom/robinhood/models/db/Security;", "objectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "removeFromList", "itemId", "updateLists", "listIdToItemOperationMap", "", "Lcom/robinhood/models/api/CuratedListItemOperation;", "updateList", "newDisplayName", "newEmoji", "newSortOrder", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "newSortDirection", "Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "updateAllViewModes", "viewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", "addItemToRecentlyEditedList", "ListEndpointParams", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListStore extends Store {
    private final CuratedListItemViewModeStore curatedListItemViewModeStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListDao dao;
    private final BehaviorRelay<Set<UUID>> deletedCuratedListRelay;
    private final DiscoveryApi discoveryApi;
    private final FollowedCuratedListIdDao followedCuratedListIdDao;
    private final PaginatedEndpoint<Unit, ApiCuratedList> followedListEndpoint;
    private final Endpoint<ListEndpointParams, ApiCuratedList> listEndpoint;
    private final ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;
    private final Function1<ApiCuratedList, Unit> saveCuratedListAction;
    private final Function2<PaginatedResult<ApiCuratedList>, Continuation<? super Unit>, Object> saveCuratedListsAndDeleteFollowsAction;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListStore(DiscoveryApi discoveryApi, UserStore userStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, StoreBundle storeBundle, final CuratedListDao dao, FollowedCuratedListIdDao followedCuratedListIdDao) {
        super(storeBundle, CuratedList.INSTANCE);
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(followedCuratedListIdDao, "followedCuratedListIdDao");
        this.discoveryApi = discoveryApi;
        this.userStore = userStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.dao = dao;
        this.followedCuratedListIdDao = followedCuratedListIdDao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveCuratedListAction = new Function1<ApiCuratedList, Unit>() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiCuratedList apiCuratedList) {
                m25748invoke(apiCuratedList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25748invoke(ApiCuratedList apiCuratedList) {
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
        BehaviorRelay<Set<UUID>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(SetsKt.emptySet());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.deletedCuratedListRelay = behaviorRelayCreateDefault;
        CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1 curatedListStore$saveCuratedListsAndDeleteFollowsAction$1 = new CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1(this, null);
        this.saveCuratedListsAndDeleteFollowsAction = curatedListStore$saveCuratedListsAndDeleteFollowsAction$1;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        CuratedListStore$listEndpoint$1 curatedListStore$listEndpoint$1 = new CuratedListStore$listEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        CuratedListStore$listEndpoint$2 curatedListStore$listEndpoint$2 = new CuratedListStore$listEndpoint$2(this, null);
        Clock clock = storeBundle.getClock();
        Duration duration = Durations.FIVE_MINUTES;
        this.listEndpoint = companion.create(curatedListStore$listEndpoint$1, logoutKillswitch2, curatedListStore$listEndpoint$2, clock, new DefaultStaleDecider(duration, storeBundle.getClock()));
        this.followedListEndpoint = PaginatedEndpoint.INSTANCE.create(new CuratedListStore$followedListEndpoint$1(this, null), getLogoutKillswitch(), curatedListStore$saveCuratedListsAndDeleteFollowsAction$1, storeBundle.getClock(), new DefaultStaleDecider(duration, storeBundle.getClock()));
    }

    public final Observable<Optional<CuratedList>> streamCuratedListOptional(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        CuratedListDao curatedListDao = this.dao;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(curatedListDao.get(string2))));
    }

    public final Observable<CuratedList> streamCuratedList(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return ObservablesKt.filterIsPresent(streamCuratedListOptional(id));
    }

    public final Flow<List<CuratedList>> streamCuratedLists() {
        return takeWhileLoggedIn(this.dao.get());
    }

    public final Observable<List<CuratedList>> streamCuratedListsByOwnerType(ApiCuratedList.OwnerType ownerType) {
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        return asObservable(takeWhileLoggedIn(this.dao.getByOwnerType(ownerType)));
    }

    public final Completable refreshList(boolean force, UUID id, ApiCuratedList.OwnerType ownerType) {
        Completable completableRxCompletable$default;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        if (force) {
            completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new CuratedListStore$refreshList$completable$1(this, id, ownerType, null), 1, null);
        } else {
            completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new CuratedListStore$refreshList$completable$2(this, id, ownerType, null), 1, null);
        }
        Completable completableCache = completableRxCompletable$default.cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableCache), getStoreScope());
        return completableCache;
    }

    public final void refreshFollowedLists(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.followedListEndpoint, force);
    }

    public final Flow<List<CuratedList>> streamFollowedCuratedListsInOrder() {
        return takeWhileLoggedIn(this.followedCuratedListIdDao.getFollowedCuratedListsInOrder());
    }

    public final Observable<?> followList(final UUID listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Observable<?> observableRefCount = this.userStore.getUser().take(1L).observeOn(Schedulers.m3346io()).switchMapCompletable(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$followList$obs$1

            /* compiled from: CuratedListStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$followList$obs$1$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$followList$obs$1$1 */
            static final class C399741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $listId;
                final /* synthetic */ User $user;
                int label;
                final /* synthetic */ CuratedListStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C399741(CuratedListStore curatedListStore, UUID uuid, User user, Continuation<? super C399741> continuation) {
                    super(2, continuation);
                    this.this$0 = curatedListStore;
                    this.$listId = uuid;
                    this.$user = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C399741(this.this$0, this.$listId, this.$user, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C399741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
                        UUID uuid = this.$listId;
                        UUID id = this.$user.getId();
                        this.label = 1;
                        if (discoveryApi.followList(uuid, id, this) == coroutine_suspended) {
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

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                CuratedListStore curatedListStore = this.this$0;
                return RxFactory.DefaultImpls.rxCompletable$default(curatedListStore, null, new C399741(curatedListStore, listId, user, null), 1, null);
            }
        }).toObservable().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        ScopedSubscriptionKt.subscribeIn(observableRefCount, getStoreScope(), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListStore.followList$lambda$0(obj);
            }
        }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListStore.followList$lambda$1((Throwable) obj);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListStore.followList$lambda$2(this.f$0, listId);
            }
        });
        return observableRefCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit followList$lambda$0(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit followList$lambda$2(CuratedListStore curatedListStore, UUID uuid) {
        CuratedListDao curatedListDao = curatedListStore.dao;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        curatedListDao.updateFollowStatus(true, string2);
        curatedListStore.followedCuratedListIdDao.insert((FollowedCuratedListIdDao) new FollowedCuratedListId(0, uuid, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit followList$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Observable<?> unfollowList(final UUID listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Observable<?> observableRefCount = this.userStore.getUser().take(1L).observeOn(Schedulers.m3346io()).switchMapCompletable(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$unfollowList$obs$1

            /* compiled from: CuratedListStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$unfollowList$obs$1$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$unfollowList$obs$1$1 */
            static final class C399771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $listId;
                final /* synthetic */ User $user;
                int label;
                final /* synthetic */ CuratedListStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C399771(CuratedListStore curatedListStore, UUID uuid, User user, Continuation<? super C399771> continuation) {
                    super(2, continuation);
                    this.this$0 = curatedListStore;
                    this.$listId = uuid;
                    this.$user = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C399771(this.this$0, this.$listId, this.$user, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C399771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
                        UUID uuid = this.$listId;
                        UUID id = this.$user.getId();
                        this.label = 1;
                        obj = discoveryApi.unfollowList(uuid, id, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Response response = (Response) obj;
                    if (!response.isSuccessful()) {
                        throw new Exception("Failed to unfollow list: " + response.message());
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                CuratedListStore curatedListStore = this.this$0;
                return RxFactory.DefaultImpls.rxCompletable$default(curatedListStore, null, new C399771(curatedListStore, listId, user, null), 1, null);
            }
        }).toObservable().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        ScopedSubscriptionKt.subscribeIn(observableRefCount, getStoreScope(), new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListStore.unfollowList$lambda$3(obj);
            }
        }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListStore.unfollowList$lambda$4((Throwable) obj);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListStore.unfollowList$lambda$5(this.f$0, listId);
            }
        });
        return observableRefCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unfollowList$lambda$3(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unfollowList$lambda$5(CuratedListStore curatedListStore, UUID uuid) {
        CuratedListDao curatedListDao = curatedListStore.dao;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        curatedListDao.updateFollowStatus(false, string2);
        curatedListStore.followedCuratedListIdDao.deleteFollowedListId(uuid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unfollowList$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCuratedList;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$createCuratedList$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$createCuratedList$1 */
    static final class C399711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCuratedList>, Object> {
        final /* synthetic */ String $emoji;
        final /* synthetic */ String $listName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399711(String str, String str2, Continuation<? super C399711> continuation) {
            super(2, continuation);
            this.$listName = str;
            this.$emoji = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399711(this.$listName, this.$emoji, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCuratedList> continuation) {
            return ((C399711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DiscoveryApi discoveryApi = CuratedListStore.this.discoveryApi;
            CreateOrUpdateListRequest createOrUpdateListRequest = new CreateOrUpdateListRequest(this.$listName, this.$emoji, null, null, 12, null);
            this.label = 1;
            Object objCreateList = discoveryApi.createList(createOrUpdateListRequest, this);
            return objCreateList == coroutine_suspended ? coroutine_suspended : objCreateList;
        }
    }

    public final Single<CuratedList> createCuratedList(String listName, String emoji) {
        Intrinsics.checkNotNullParameter(listName, "listName");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Single<CuratedList> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C399711(listName, emoji, null), 1, null).subscribeOn(Schedulers.m3346io()).doOnSuccess(new Consumer() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.createCuratedList.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiCuratedList apiCuratedList) {
                Function1 function1 = CuratedListStore.this.saveCuratedListAction;
                Intrinsics.checkNotNull(apiCuratedList);
                function1.invoke(apiCuratedList);
                CuratedListStore.this.refreshFollowedLists(true);
            }
        }).map(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.createCuratedList.3
            @Override // io.reactivex.functions.Function
            public final CuratedList apply(ApiCuratedList p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return CuratedList3.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Set<UUID>> streamDeletedLists() {
        Observable<Set<UUID>> observableHide = this.deletedCuratedListRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final Completable deleteList(final UUID id, ApiCuratedList.OwnerType ownerType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        Completable completableCache = RxFactory.DefaultImpls.rxCompletable$default(this, null, new CuratedListStore$deleteList$completable$1(this, id, ownerType, null), 1, null).subscribeOn(Schedulers.m3346io()).cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(completableCache, getStoreScope(), (Function0<Unit>) new Function0() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListStore.deleteList$lambda$6(this.f$0, id);
            }
        }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListStore.deleteList$lambda$7((Throwable) obj);
            }
        });
        return completableCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteList$lambda$6(CuratedListStore curatedListStore, UUID uuid) {
        curatedListStore.refreshFollowedLists(true);
        curatedListStore.deleteList(uuid);
        Set<UUID> value = curatedListStore.deletedCuratedListRelay.getValue();
        Intrinsics.checkNotNull(value);
        curatedListStore.deletedCuratedListRelay.accept(SetsKt.plus(value, uuid));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteList$lambda$7(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Completable addToList(final UUID curatedListId, final Security security, CuratedListObjectType objectType) {
        Intrinsics.checkNotNullParameter(curatedListId, "curatedListId");
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C399691(curatedListId, CollectionsKt.listOf(new CuratedListItemOperation(objectType, security.getId(), CuratedListOperationType.CREATE, null, 8, null)), null), 1, null).subscribeOn(Schedulers.m3346io()).doOnComplete(new Action() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.addToList.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                CuratedListStore curatedListStore = CuratedListStore.this;
                UUID uuid = curatedListId;
                ApiCuratedList.OwnerType ownerType = ApiCuratedList.OwnerType.CUSTOM;
                curatedListStore.refreshList(true, uuid, ownerType);
                CuratedListItemsStore.refreshListItems$default(CuratedListStore.this.curatedListItemsStore, true, curatedListId, ownerType, null, null, null, 56, null);
                CuratedListStore.this.listItemIdToUserListIdsStore.addListId(security.getId(), curatedListId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$addToList$1", m3645f = "CuratedListStore.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$addToList$1 */
    static final class C399691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $curatedListId;
        final /* synthetic */ List<CuratedListItemOperation> $itemOperations;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399691(UUID uuid, List<CuratedListItemOperation> list, Continuation<? super C399691> continuation) {
            super(2, continuation);
            this.$curatedListId = uuid;
            this.$itemOperations = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399691(this.$curatedListId, this.$itemOperations, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DiscoveryApi discoveryApi = CuratedListStore.this.discoveryApi;
                Map<UUID, List<CuratedListItemOperation>> mapMapOf = MapsKt.mapOf(Tuples4.m3642to(this.$curatedListId, this.$itemOperations));
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

    public final Completable removeFromList(final UUID curatedListId, final UUID itemId, CuratedListObjectType objectType) {
        Intrinsics.checkNotNullParameter(curatedListId, "curatedListId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C399751(curatedListId, CollectionsKt.listOf(new CuratedListItemOperation(objectType, itemId, CuratedListOperationType.DELETE, null, 8, null)), null), 1, null).subscribeOn(Schedulers.m3346io()).doOnComplete(new Action() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.removeFromList.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                CuratedListStore.this.refreshList(true, curatedListId, ApiCuratedList.OwnerType.CUSTOM);
                CuratedListStore.this.curatedListItemsStore.removeListItem(curatedListId, itemId);
                CuratedListStore.this.listItemIdToUserListIdsStore.removeListId(itemId, curatedListId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$removeFromList$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$removeFromList$1 */
    static final class C399751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $curatedListId;
        final /* synthetic */ List<CuratedListItemOperation> $itemOperations;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399751(UUID uuid, List<CuratedListItemOperation> list, Continuation<? super C399751> continuation) {
            super(2, continuation);
            this.$curatedListId = uuid;
            this.$itemOperations = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399751(this.$curatedListId, this.$itemOperations, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DiscoveryApi discoveryApi = CuratedListStore.this.discoveryApi;
                Map<UUID, List<CuratedListItemOperation>> mapMapOf = MapsKt.mapOf(Tuples4.m3642to(this.$curatedListId, this.$itemOperations));
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

    private final void deleteList(UUID listId) {
        CuratedListDao curatedListDao = this.dao;
        String string2 = listId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        curatedListDao.deleteList(string2);
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$updateLists$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$updateLists$1 */
    static final class C399811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<UUID, List<CuratedListItemOperation>> $listIdToItemOperationMap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C399811(Map<UUID, ? extends List<CuratedListItemOperation>> map, Continuation<? super C399811> continuation) {
            super(2, continuation);
            this.$listIdToItemOperationMap = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399811(this.$listIdToItemOperationMap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DiscoveryApi discoveryApi = CuratedListStore.this.discoveryApi;
                Map<UUID, List<CuratedListItemOperation>> map = this.$listIdToItemOperationMap;
                this.label = 1;
                if (discoveryApi.updateList(map, this) == coroutine_suspended) {
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

    public final Completable updateLists(Map<UUID, ? extends List<CuratedListItemOperation>> listIdToItemOperationMap) {
        Intrinsics.checkNotNullParameter(listIdToItemOperationMap, "listIdToItemOperationMap");
        Completable completableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C399811(listIdToItemOperationMap, null), 1, null).subscribeOn(Schedulers.m3346io()).doOnComplete(new Action() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.updateLists.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                CuratedListStore.this.listItemIdToUserListIdsStore.refresh(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    public static /* synthetic */ Single updateList$default(CuratedListStore curatedListStore, UUID uuid, String str, String str2, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            sortOrder = null;
        }
        if ((i & 16) != 0) {
            sortDirection = null;
        }
        return curatedListStore.updateList(uuid, str, str2, sortOrder, sortDirection);
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCuratedList;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$updateList$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$updateList$1 */
    static final class C399791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCuratedList>, Object> {
        final /* synthetic */ UUID $listId;
        final /* synthetic */ String $newDisplayName;
        final /* synthetic */ String $newEmoji;
        final /* synthetic */ ApiCuratedList.SortDirection $newSortDirection;
        final /* synthetic */ ApiCuratedList.SortOrder $newSortOrder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399791(UUID uuid, String str, String str2, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, Continuation<? super C399791> continuation) {
            super(2, continuation);
            this.$listId = uuid;
            this.$newDisplayName = str;
            this.$newEmoji = str2;
            this.$newSortOrder = sortOrder;
            this.$newSortDirection = sortDirection;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399791(this.$listId, this.$newDisplayName, this.$newEmoji, this.$newSortOrder, this.$newSortDirection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCuratedList> continuation) {
            return ((C399791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DiscoveryApi discoveryApi = CuratedListStore.this.discoveryApi;
            UUID uuid = this.$listId;
            CreateOrUpdateListRequest createOrUpdateListRequest = new CreateOrUpdateListRequest(this.$newDisplayName, this.$newEmoji, this.$newSortOrder, this.$newSortDirection);
            this.label = 1;
            Object objUpdateList = discoveryApi.updateList(uuid, createOrUpdateListRequest, this);
            return objUpdateList == coroutine_suspended ? coroutine_suspended : objUpdateList;
        }
    }

    public final Single<ApiCuratedList> updateList(UUID listId, String newDisplayName, String newEmoji, ApiCuratedList.SortOrder newSortOrder, ApiCuratedList.SortDirection newSortDirection) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Single<ApiCuratedList> singleDoOnSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C399791(listId, newDisplayName, newEmoji, newSortOrder, newSortDirection, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.updateList.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiCuratedList apiCuratedList) {
                Function1 function1 = CuratedListStore.this.saveCuratedListAction;
                Intrinsics.checkNotNull(apiCuratedList);
                function1.invoke(apiCuratedList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$updateAllViewModes$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$updateAllViewModes$1 */
    static final class C399781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CuratedListViewMode $viewMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399781(CuratedListViewMode curatedListViewMode, Continuation<? super C399781> continuation) {
            super(2, continuation);
            this.$viewMode = curatedListViewMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399781(this.$viewMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<CuratedList>> flowStreamFollowedCuratedListsInOrder = CuratedListStore.this.streamFollowedCuratedListsInOrder();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamFollowedCuratedListsInOrder, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((CuratedList) obj2).isRobinhoodList()) {
                        arrayList.add(obj2);
                    }
                }
                CuratedListStore curatedListStore = CuratedListStore.this;
                curatedListStore.curatedListItemViewModeStore.updateAllViewModes(this.$viewMode, arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateAllViewModes(CuratedListViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C399781(viewMode, null), 3, null);
    }

    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCuratedList;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$addItemToRecentlyEditedList$1", m3645f = "CuratedListStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListStore$addItemToRecentlyEditedList$1 */
    static final class C399661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCuratedList>, Object> {
        final /* synthetic */ CuratedListQuickAddRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399661(CuratedListQuickAddRequest curatedListQuickAddRequest, Continuation<? super C399661> continuation) {
            super(2, continuation);
            this.$request = curatedListQuickAddRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListStore.this.new C399661(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCuratedList> continuation) {
            return ((C399661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DiscoveryApi discoveryApi = CuratedListStore.this.discoveryApi;
            CuratedListQuickAddRequest curatedListQuickAddRequest = this.$request;
            this.label = 1;
            Object objQuickAddItemToList = discoveryApi.quickAddItemToList(curatedListQuickAddRequest, this);
            return objQuickAddItemToList == coroutine_suspended ? coroutine_suspended : objQuickAddItemToList;
        }
    }

    public final Single<CuratedList> addItemToRecentlyEditedList(final Security security, CuratedListObjectType objectType) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Single<CuratedList> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C399661(new CuratedListQuickAddRequest(security.getId(), objectType), null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.addItemToRecentlyEditedList.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiCuratedList apiCuratedList) {
                Function1 function1 = CuratedListStore.this.saveCuratedListAction;
                Intrinsics.checkNotNull(apiCuratedList);
                function1.invoke(apiCuratedList);
                CuratedListItemsStore.refreshListItems$default(CuratedListStore.this.curatedListItemsStore, true, apiCuratedList.getId(), apiCuratedList.getOwner_type(), null, null, null, 56, null);
                CuratedListStore.this.listItemIdToUserListIdsStore.addListId(security.getId(), apiCuratedList.getId());
            }
        }).map(new Function() { // from class: com.robinhood.shared.store.lists.store.CuratedListStore.addItemToRecentlyEditedList.3
            @Override // io.reactivex.functions.Function
            public final CuratedList apply(ApiCuratedList p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return CuratedList3.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CuratedListStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListStore$ListEndpointParams;", "", "id", "Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;)V", "getId", "()Ljava/util/UUID;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ListEndpointParams {
        private final UUID id;
        private final ApiCuratedList.OwnerType ownerType;

        public static /* synthetic */ ListEndpointParams copy$default(ListEndpointParams listEndpointParams, UUID uuid, ApiCuratedList.OwnerType ownerType, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = listEndpointParams.id;
            }
            if ((i & 2) != 0) {
                ownerType = listEndpointParams.ownerType;
            }
            return listEndpointParams.copy(uuid, ownerType);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        public final ListEndpointParams copy(UUID id, ApiCuratedList.OwnerType ownerType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            return new ListEndpointParams(id, ownerType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListEndpointParams)) {
                return false;
            }
            ListEndpointParams listEndpointParams = (ListEndpointParams) other;
            return Intrinsics.areEqual(this.id, listEndpointParams.id) && this.ownerType == listEndpointParams.ownerType;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.ownerType.hashCode();
        }

        public String toString() {
            return "ListEndpointParams(id=" + this.id + ", ownerType=" + this.ownerType + ")";
        }

        public ListEndpointParams(UUID id, ApiCuratedList.OwnerType ownerType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            this.id = id;
            this.ownerType = ownerType;
        }

        public final UUID getId() {
            return this.id;
        }

        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }
    }
}
