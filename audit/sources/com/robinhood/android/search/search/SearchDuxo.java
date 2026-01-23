package com.robinhood.android.search.search;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.models.event.api.bonfire.ApiEventContractSearchItem;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesProductSearchItem;
import com.robinhood.android.models.futures.api.bonfire.FuturesSearchItem;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.regiongate.CryptoBitstampUkUpsellRegionGate;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.ToolbarSearchIconRegionGate;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.search.SearchDuxo;
import com.robinhood.android.search.search.SearchViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.prefs.IndexOptionsListExtendedHoursBadgeSeenPref;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.models.api.search.SearchResponse;
import com.robinhood.models.api.search.extensions.SearchResponses;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.newsfeed.p334db.NewsFeedLocation;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
import com.robinhood.models.p320db.recentSearch.RecentSearch2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.search.SearchStore;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.store.search.SearchStore4;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001uB«\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\b\b\u0001\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+¢\u0006\u0004\b,\u0010-J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020;H\u0016J\b\u0010=\u001a\u00020;H\u0016J\u000e\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u000202J\u0010\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u000205J\u0014\u0010B\u001a\u00020;2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002020DJ\u0016\u0010E\u001a\u00020;2\u0006\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020HJ\u0016\u0010I\u001a\u00020;2\u0006\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020HJ\u000e\u0010J\u001a\u00020;2\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020;2\u0006\u0010K\u001a\u00020LJ\u0006\u0010N\u001a\u00020;J\r\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\bYJ\u001f\u0010\\\u001a\u0004\u0018\u00010]2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_H\u0001¢\u0006\u0004\ba\u0010bJ\u001b\u0010c\u001a\b\u0012\u0004\u0012\u00020d0_2\u0006\u0010S\u001a\u00020TH\u0001¢\u0006\u0002\beJ\u001b\u0010f\u001a\b\u0012\u0004\u0012\u00020d0_2\u0006\u0010S\u001a\u00020TH\u0001¢\u0006\u0002\bgJ!\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0_0i2\u0006\u0010S\u001a\u00020TH\u0001¢\u0006\u0002\bjJ7\u0010k\u001a\u00020;2\b\b\u0002\u0010l\u001a\u00020m2\u000e\b\u0002\u0010n\u001a\b\u0012\u0004\u0012\u00020;0o2\u000e\b\u0002\u0010p\u001a\b\u0012\u0004\u0012\u00020;0oH\u0001¢\u0006\u0002\bqJ\u0016\u0010r\u001a\b\u0012\u0004\u0012\u0002050i2\u0006\u0010s\u001a\u00020tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u0001020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010O\u001a\u00020P*\u00020H8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020T8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Z\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006v"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/search/search/SearchViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "indexOptionsListExtendedHoursBadgeSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/store/search/SearchStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/store/futures/FuturesPositionStore;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "searchRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "logged", "", "listId", "Ljava/util/UUID;", "getListId", "()Ljava/util/UUID;", "onCreate", "", "onStart", "onResume", "search", "query", "swapDiscoverAndRecentSearch", "displayRecentSearch", "updateExcludedTemplates", "excludedTemplates", "Lkotlinx/collections/immutable/ImmutableList;", "addSecurityToList", "curatedListId", "security", "Lcom/robinhood/models/db/Security;", "removeSecurityFromList", "saveRecentSearch", "recentSearch", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "deleteRecentSearch", "refreshNewsFeed", "itemOperationObjectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getItemOperationObjectType$feature_search_externalRelease", "(Lcom/robinhood/models/db/Security;)Lcom/robinhood/models/api/CuratedListObjectType;", "searchSource", "Lcom/robinhood/store/search/SearchSource;", "getSearchSource$feature_search_externalRelease", "()Lcom/robinhood/store/search/SearchSource;", "getNewsFeedLocation", "Lcom/robinhood/models/newsfeed/db/NewsFeedLocation;", "getNewsFeedLocation$feature_search_externalRelease", "isUniversalSearch", "()Z", "getScrollTargetIndex", "", "elements", "", "Lcom/robinhood/android/newsfeed/model/Element;", "getScrollTargetIndex$feature_search_externalRelease", "(Ljava/util/List;)Ljava/lang/Integer;", "contentTypesBySource", "Lcom/robinhood/models/api/search/SearchContentType;", "contentTypesBySource$feature_search_externalRelease", "contentTypesBySourceWithIndices", "contentTypesBySourceWithIndices$feature_search_externalRelease", "streamContentTypes", "Lkotlinx/coroutines/flow/Flow;", "streamContentTypes$feature_search_externalRelease", "regionGateRunner", "regionGate", "Lcom/robinhood/android/regiongate/RegionGate;", "allowed", "Lkotlin/Function0;", "restricted", "regionGateRunner$feature_search_externalRelease", "streamAccountFeatureAccess", "accountFeature", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchDuxo extends BaseDuxo4<SearchViewState> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final AnalyticsLogger analytics;
    private final AppType appType;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final FuturesPositionStore futuresPositionStore;
    private final BooleanPreference indexOptionsListExtendedHoursBadgeSeenPref;
    private final InstrumentStore instrumentStore;
    private final ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;
    private boolean logged;
    private final NewsFeedElementStore newsFeedElementStore;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final PositionStore positionStore;
    private final RecommendationsEligibilityStore recsEligibilityStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final ScreenersStore screenersStore;
    private final PublishRelay<String> searchRelay;
    private final SearchStore searchStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SearchFragmentKey.Source.values().length];
            try {
                iArr[SearchFragmentKey.Source.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchFragmentKey.Source.UNIVERSAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchFragmentKey.Source.RETIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchFragmentKey.Source.JOINT_ACCOUNTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SearchFragmentKey.TargetSection.values().length];
            try {
                iArr2[SearchFragmentKey.TargetSection.MARKET_INDICATORS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SearchFragmentKey.TargetSection.LISTS_CHIP_GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SearchFragmentKey.TargetSection.EDUCATION_CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SearchStore4.values().length];
            try {
                iArr3[SearchStore4.UNIVERSAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SearchStore4.RETIREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SearchStore4.CRYPTO_TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SearchStore4.JOINT_ACCOUNTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[SearchStore4.CRYPTO_RHC.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[SearchStore4.PERPETUALS_RHC.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AccountFeature.values().length];
            try {
                iArr4[AccountFeature.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[AccountFeature.CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[AccountFeature.EVENT_CONTRACTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[AccountFeature.FUTURES.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[AccountFeature.OPTIONS_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDuxo(AnalyticsLogger analytics, AccountProvider accountProvider, AccountAccessStore accountAccessStore, SearchStore searchStore, PositionStore positionStore, FuturesPositionStore futuresPositionStore, CryptoHoldingStore cryptoHoldingStore, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, NewsFeedElementStore newsFeedElementStore, RecommendationsEligibilityStore recsEligibilityStore, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, ScreenersStore screenersStore, AppType appType, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, @IndexOptionsListExtendedHoursBadgeSeenPref BooleanPreference indexOptionsListExtendedHoursBadgeSeenPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SearchViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -1, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
        Intrinsics.checkNotNullParameter(recsEligibilityStore, "recsEligibilityStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(indexOptionsListExtendedHoursBadgeSeenPref, "indexOptionsListExtendedHoursBadgeSeenPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analytics = analytics;
        this.accountProvider = accountProvider;
        this.accountAccessStore = accountAccessStore;
        this.searchStore = searchStore;
        this.positionStore = positionStore;
        this.futuresPositionStore = futuresPositionStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.newsFeedElementStore = newsFeedElementStore;
        this.recsEligibilityStore = recsEligibilityStore;
        this.regionGateProvider = regionGateProvider;
        this.instrumentStore = instrumentStore;
        this.screenersStore = screenersStore;
        this.appType = appType;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.indexOptionsListExtendedHoursBadgeSeenPref = indexOptionsListExtendedHoursBadgeSeenPref;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.searchRelay = publishRelayCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getListId() {
        return ((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getListId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        SearchDuxo searchDuxo;
        super.onCreate();
        applyMutation(new C281071(null));
        Observables observables = Observables.INSTANCE;
        Observable<String> observableDistinctUntilChanged = this.searchRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableRefCount = observables.combineLatest(observableDistinctUntilChanged, asObservable(streamContentTypes$feature_search_externalRelease(getSearchSource$feature_search_externalRelease()))).switchMap(new Function() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$searchResultObservable$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<String, SearchStore3>> apply(Tuples2<String, ? extends List<? extends SearchContentType>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                final String strComponent1 = tuples2.component1();
                List<? extends SearchContentType> listComponent2 = tuples2.component2();
                if (!this.this$0.logged) {
                    Intrinsics.checkNotNull(strComponent1);
                    if (strComponent1.length() > 0) {
                        this.this$0.logged = true;
                        this.this$0.analytics.logUserAction(AnalyticsStrings.USER_ACTION_SEARCH_TYPED);
                    }
                }
                SearchStore searchStore = this.this$0.searchStore;
                Intrinsics.checkNotNull(strComponent1);
                return SearchStore.search$default(searchStore, strComponent1, listComponent2, null, this.this$0.getSearchSource$feature_search_externalRelease(), false, null, 52, null).map(new Function() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$searchResultObservable$1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<String, SearchStore3> apply(SearchStore3 result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        return Tuples4.m3642to(strComponent1, result);
                    }
                });
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.onCreate$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        if (getListId() == null) {
            Observable map = observableRefCount.map(new Function() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object objComponent2 = ((Tuples2) it).component2();
                    Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
                    SearchStore3 searchStore3 = (SearchStore3) objComponent2;
                    SearchStore3.Success success = searchStore3 instanceof SearchStore3.Success ? (SearchStore3.Success) searchStore3 : null;
                    return Optional3.asOptional(success != null ? success.getResponses() : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((SearchDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable map2 = ObservablesKt.filterIsPresent(map).switchMap(new C281124()).map(new Function() { // from class: com.robinhood.android.search.search.SearchDuxo.onCreate.5
                @Override // io.reactivex.functions.Function
                public final Set<UUID> apply(Map<UUID, ? extends List<UUID>> items) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<UUID, ? extends List<UUID>> entry : items.entrySet()) {
                        if (!entry.getValue().isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return linkedHashMap.keySet();
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, map2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.onCreate$lambda$2(this.f$0, (Set) obj);
                }
            });
        }
        refreshNewsFeed();
        if (isUniversalSearch()) {
            searchDuxo = this;
            regionGateRunner$feature_search_externalRelease$default(searchDuxo, null, new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchDuxo.onCreate$lambda$4(this.f$0);
                }
            }, new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchDuxo.onCreate$lambda$5(this.f$0);
                }
            }, 1, null);
            Observable observableSwitchMap = asObservable(searchDuxo.searchStore.streamRecentSearches(15)).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.search.search.SearchDuxo.onCreate.9

                /* compiled from: SearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$9$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$9$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
                    final /* synthetic */ List<RecentSearch.RecentSearchResult> $recentSearches;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<RecentSearch.RecentSearchResult> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$recentSearches = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recentSearches, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
                        return ((AnonymousClass1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        SearchViewState searchViewState = (SearchViewState) this.L$0;
                        List<RecentSearch.RecentSearchResult> list = this.$recentSearches;
                        Intrinsics.checkNotNull(list);
                        return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, list, false, null, null, null, null, false, false, false, null, null, -8388609, 3, null);
                    }
                }

                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends List<Instrument>> apply(List<RecentSearch.RecentSearchResult> recentSearches) {
                    Intrinsics.checkNotNullParameter(recentSearches, "recentSearches");
                    SearchDuxo.this.applyMutation(new AnonymousClass1(recentSearches, null));
                    ArrayList arrayList = new ArrayList();
                    for (T t : recentSearches) {
                        if (((RecentSearch.RecentSearchResult) t).getItem() instanceof RecentSearch2.Instrument) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(StringsKt.toUuid(((RecentSearch.RecentSearchResult) it.next()).getId()));
                    }
                    return SearchDuxo.this.instrumentStore.getInstruments(arrayList2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.onCreate$lambda$8(this.f$0, (List) obj);
                }
            });
        } else {
            searchDuxo = this;
            applyMutation(new C2810811(null));
        }
        LifecycleHost.DefaultImpls.bind$default(this, searchDuxo.screenersStore.getScreenersData(true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.onCreate$lambda$9(this.f$0, (ScreenersStore.ScreenersData) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(searchDuxo.regionGateProvider, CryptoRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.onCreate$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(searchDuxo.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.onCreate$lambda$11(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C2810915(null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C2811016(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2811117(null));
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$1 */
    static final class C281071 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C281071(Continuation<? super C281071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281071 c281071 = SearchDuxo.this.new C281071(continuation);
            c281071.L$0 = obj;
            return c281071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
            return ((C281071) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SearchViewState searchViewState = (SearchViewState) this.L$0;
                boolean z = SearchDuxo.this.getListId() == null;
                String accountNumber = ((SearchFragmentKey) SearchDuxo.INSTANCE.getArgs((HasSavedState) SearchDuxo.this)).getAccountNumber();
                final SearchDuxo searchDuxo = SearchDuxo.this;
                return SearchViewState.copy$default(searchViewState, null, z, null, null, null, null, accountNumber, null, new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return searchDuxo.getScrollTargetIndex$feature_search_externalRelease((List) obj2);
                    }
                }, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, SearchDuxo.this.appType, null, -323, 2, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SearchDuxo searchDuxo, Tuples2 tuples2) {
        String str = (String) tuples2.component1();
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        SearchStore3 searchStore3 = (SearchStore3) objComponent2;
        if (searchStore3 instanceof SearchStore3.Loading) {
            searchDuxo.applyMutation(new SearchDuxo$onCreate$2$1(str, null));
        } else if (searchStore3 instanceof SearchStore3.Success) {
            searchDuxo.applyMutation(new SearchDuxo$onCreate$2$2(str, searchStore3, null));
        } else {
            if (!(searchStore3 instanceof SearchStore3.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            searchDuxo.applyMutation(new SearchDuxo$onCreate$2$3(str, searchStore3, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$4 */
    static final class C281124<T, R> implements Function {
        C281124() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$0(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends Map<UUID, List<UUID>>> apply(List<? extends SearchResponse> responses) {
            Intrinsics.checkNotNullParameter(responses, "responses");
            Sequence map = SequencesKt.map(CollectionsKt.asSequence(SearchResponses.getInstruments(responses)), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.C281124.apply$lambda$0((Instrument) obj);
                }
            });
            Sequence map2 = SequencesKt.map(CollectionsKt.asSequence(SearchResponses.getCurrencyPairs(responses)), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.C281124.apply$lambda$1((UiCurrencyPair) obj);
                }
            });
            Sequence map3 = SequencesKt.map(CollectionsKt.asSequence(SearchResponses.getActiveFutures(responses)), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.C281124.apply$lambda$2((FuturesSearchItem) obj);
                }
            });
            Sequence map4 = SequencesKt.map(CollectionsKt.asSequence(SearchResponses.getNonActiveFutures(responses)), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$4$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.C281124.apply$lambda$3((FuturesSearchItem) obj);
                }
            });
            List<UUID> list = SequencesKt.toList(SequencesKt.plus(SequencesKt.plus(SequencesKt.plus(SequencesKt.plus(map, map2), map3), map4), SequencesKt.map(CollectionsKt.asSequence(SearchResponses.getIndexes(responses)), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$4$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.C281124.apply$lambda$4((Index) obj);
                }
            })));
            if (!list.isEmpty()) {
                ListItemIdToUserListIdsStore.refresh$default(SearchDuxo.this.listItemIdToUserListIdsStore, false, 1, null);
                return SearchDuxo.this.listItemIdToUserListIdsStore.stream(list);
            }
            Observable observableJust = Observable.just(MapsKt.emptyMap());
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$1(UiCurrencyPair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$2(FuturesSearchItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$3(FuturesSearchItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$4(Index it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(SearchDuxo searchDuxo, Set set) {
        searchDuxo.applyMutation(new SearchDuxo$onCreate$6$1(set, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(final SearchDuxo searchDuxo) {
        Observable<Boolean> observableOnErrorReturnItem = searchDuxo.recsEligibilityStore.getEligibility().toObservable().onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(searchDuxo, observableOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.onCreate$lambda$4$lambda$3(this.f$0, (Boolean) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4$lambda$3(SearchDuxo searchDuxo, Boolean bool) {
        searchDuxo.applyMutation(new SearchDuxo$onCreate$7$1$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(SearchDuxo searchDuxo) {
        searchDuxo.applyMutation(new SearchDuxo$onCreate$8$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(SearchDuxo searchDuxo, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Instrument) obj).getAffiliateTradability() != Tradability.TRADABLE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Instrument) it.next()).getId().toString());
        }
        searchDuxo.applyMutation(new SearchDuxo$onCreate$10$1(arrayList2, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$11", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$11 */
    static final class C2810811 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C2810811(Continuation<? super C2810811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2810811 c2810811 = new C2810811(continuation);
            c2810811.L$0 = obj;
            return c2810811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
            return ((C2810811) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SearchViewState searchViewState = (SearchViewState) this.L$0;
            return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, SearchViewState.RecyclerViewItemsFetched.copy$default(searchViewState.getRecyclerViewItemsFetched(), true, false, false, 6, null), false, false, false, null, null, -268435457, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(SearchDuxo searchDuxo, ScreenersStore.ScreenersData screenersData) {
        Intrinsics.checkNotNullParameter(screenersData, "screenersData");
        searchDuxo.applyMutation(new SearchDuxo$onCreate$12$1(screenersData, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(SearchDuxo searchDuxo, boolean z) {
        searchDuxo.applyMutation(new SearchDuxo$onCreate$13$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$11(SearchDuxo searchDuxo, boolean z) {
        searchDuxo.applyMutation(new SearchDuxo$onCreate$14$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$15", m3645f = "SearchDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$15 */
    static final class C2810915 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2810915(Continuation<? super C2810915> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchDuxo.this.new C2810915(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2810915) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowConnectWhen$default = Operators.connectWhen$default(SearchDuxo.this.futuresPositionStore.streamAllPositions(), Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(SearchDuxo.this.regionGateProvider, FuturesTradingRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), null, 2, null);
                Flow<Map<UUID, ? extends UiFuturesPosition>> flow = new Flow<Map<UUID, ? extends UiFuturesPosition>>() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$15$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Map<UUID, ? extends UiFuturesPosition>> flowCollector, Continuation continuation) {
                        Object objCollect = flowConnectWhen$default.collect(new C281022(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$15$invokeSuspend$$inlined$map$1$2 */
                    public static final class C281022<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$15$invokeSuspend$$inlined$map$1$2", m3645f = "SearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$15$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C281022.this.emit(null, this);
                            }
                        }

                        public C281022(FlowCollector flowCollector) {
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
                                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                                for (T t : list) {
                                    linkedHashMap.put(((UiFuturesPosition) t).getContractId(), t);
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SearchDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresPositions", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$15$2", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$15$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiFuturesPosition>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchDuxo searchDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiFuturesPosition> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<UUID, UiFuturesPosition>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, UiFuturesPosition> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$15$2$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$15$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
                final /* synthetic */ Map<UUID, UiFuturesPosition> $futuresPositions;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<UUID, UiFuturesPosition> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$futuresPositions = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$futuresPositions, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
                    return ((AnonymousClass1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, extensions2.toImmutableMap(this.$futuresPositions), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -33, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$16", m3645f = "SearchDuxo.kt", m3646l = {346}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$16 */
    static final class C2811016 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2811016(Continuation<? super C2811016> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchDuxo.this.new C2811016(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2811016) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountProvider.DefaultImpls.refresh$default(SearchDuxo.this.accountProvider, false, 1, null);
                final Flow flowStreamAccountFeatureAccess = SearchDuxo.this.streamAccountFeatureAccess(AccountFeature.CRYPTO);
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Boolean>() { // from class: com.robinhood.android.search.search.SearchDuxo$onCreate$16$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamAccountFeatureAccess.collect(new C281032(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$16$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C281032<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$16$invokeSuspend$$inlined$filter$1$2", m3645f = "SearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$16$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C281032.this.emit(null, this);
                            }
                        }

                        public C281032(FlowCollector flowCollector) {
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
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                }, new SearchDuxo$onCreate$16$invokeSuspend$$inlined$flatMapLatest$1(null, SearchDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(SearchDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: SearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", CryptoDetailSource.HOLDINGS, "", "Ljava/util/UUID;", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$16$3", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$16$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiCryptoHolding>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SearchDuxo searchDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = searchDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiCryptoHolding> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<UUID, UiCryptoHolding>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, UiCryptoHolding> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$16$3$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$16$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
                final /* synthetic */ Map<UUID, UiCryptoHolding> $holdings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<UUID, UiCryptoHolding> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$holdings = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$holdings, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
                    return ((AnonymousClass1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, this.$holdings, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -17, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$17", m3645f = "SearchDuxo.kt", m3646l = {359}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$17 */
    static final class C2811117 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2811117(Continuation<? super C2811117> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchDuxo.this.new C2811117(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2811117) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(SearchDuxo.this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled(), Context7.buffer$default(RxConvert.asFlow(SearchDuxo.this.indexOptionsListExtendedHoursBadgeSeenPref.getChanges()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SearchDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "isIndexOptionsExtendedHoursEnabled", "indexOptionsListExtendedHoursBadgeSeen"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$17$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$17$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0 && !this.Z$1);
            }
        }

        /* compiled from: SearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showIndexOptionsListBadge", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$17$2", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$17$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ SearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchDuxo searchDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onCreate$17$2$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.search.SearchDuxo$onCreate$17$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
                final /* synthetic */ boolean $showIndexOptionsListBadge;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$showIndexOptionsListBadge = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$showIndexOptionsListBadge, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
                    return ((AnonymousClass1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, this.$showIndexOptionsListBadge, false, false, null, null, -536870913, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        String str = (String) getSavedStateHandle().get("user_last_query");
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return;
        }
        search(str);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        Observable<List<Position>> individualAccountPositions;
        super.onResume();
        if (getListId() != null) {
            CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
            UUID listId = getListId();
            Intrinsics.checkNotNull(listId);
            CuratedListItemsStore.refreshListItems$default(curatedListItemsStore, true, listId, ApiCuratedList.OwnerType.CUSTOM, null, null, null, 56, null);
            CuratedListItemsStore curatedListItemsStore2 = this.curatedListItemsStore;
            UUID listId2 = getListId();
            Intrinsics.checkNotNull(listId2);
            LifecycleHost.DefaultImpls.bind$default(this, curatedListItemsStore2.streamCuratedListItems(listId2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchDuxo.onResume$lambda$12(this.f$0, (CuratedListItems) obj);
                }
            });
        }
        String accountNumber = ((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber != null) {
            this.positionStore.refreshAccount(accountNumber, false);
            individualAccountPositions = this.positionStore.getAccountPositions(accountNumber, true);
        } else {
            this.positionStore.refreshIndividualAccount(false);
            individualAccountPositions = this.positionStore.getIndividualAccountPositions(true);
        }
        Observable<R> map = individualAccountPositions.map(new Function() { // from class: com.robinhood.android.search.search.SearchDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final Map<UUID, Position> apply(List<Position> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<Position> list = it;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (T t : list) {
                    linkedHashMap.put(((Position) t).getInstrument(), t);
                }
                return linkedHashMap;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.onResume$lambda$13(this.f$0, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(SearchDuxo searchDuxo, CuratedListItems curatedListItems) {
        Intrinsics.checkNotNullParameter(curatedListItems, "curatedListItems");
        searchDuxo.applyMutation(new SearchDuxo$onResume$1$1(curatedListItems, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(SearchDuxo searchDuxo, Map map) {
        searchDuxo.applyMutation(new SearchDuxo$onResume$3$1(map, null));
        return Unit.INSTANCE;
    }

    public final void search(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        getSavedStateHandle().set("user_last_query", query);
        this.searchRelay.accept(query);
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$swapDiscoverAndRecentSearch$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$swapDiscoverAndRecentSearch$1 */
    static final class C281171 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
        final /* synthetic */ boolean $displayRecentSearch;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C281171(boolean z, Continuation<? super C281171> continuation) {
            super(2, continuation);
            this.$displayRecentSearch = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281171 c281171 = new C281171(this.$displayRecentSearch, continuation);
            c281171.L$0 = obj;
            return c281171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
            return ((C281171) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, this.$displayRecentSearch, null, null, null, null, false, false, false, null, null, -16777217, 3, null);
        }
    }

    public static /* synthetic */ void swapDiscoverAndRecentSearch$default(SearchDuxo searchDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        searchDuxo.swapDiscoverAndRecentSearch(z);
    }

    public final void swapDiscoverAndRecentSearch(boolean displayRecentSearch) {
        applyMutation(new C281171(displayRecentSearch, null));
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$updateExcludedTemplates$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$updateExcludedTemplates$1 */
    static final class C281181 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
        final /* synthetic */ ImmutableList<String> $excludedTemplates;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C281181(ImmutableList<String> immutableList, Continuation<? super C281181> continuation) {
            super(2, continuation);
            this.$excludedTemplates = immutableList;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281181 c281181 = new C281181(this.$excludedTemplates, continuation);
            c281181.L$0 = obj;
            return c281181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
            return ((C281181) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, this.$excludedTemplates, -1, 1, null);
        }
    }

    public final void updateExcludedTemplates(ImmutableList<String> excludedTemplates) {
        Intrinsics.checkNotNullParameter(excludedTemplates, "excludedTemplates");
        applyMutation(new C281181(excludedTemplates, null));
    }

    public final void addSecurityToList(UUID curatedListId, final Security security) {
        Intrinsics.checkNotNullParameter(curatedListId, "curatedListId");
        Intrinsics.checkNotNullParameter(security, "security");
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.addToList(curatedListId, security, getItemOperationObjectType$feature_search_externalRelease(security)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchDuxo.addSecurityToList$lambda$14(this.f$0, security);
            }
        }, new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.addSecurityToList$lambda$15(this.f$0, security, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSecurityToList$lambda$14(SearchDuxo searchDuxo, Security security) {
        searchDuxo.applyMutation(new SearchDuxo$addSecurityToList$1$1(security, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSecurityToList$lambda$15(SearchDuxo searchDuxo, Security security, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        searchDuxo.applyMutation(new SearchDuxo$addSecurityToList$2$1(security, t, null));
        return Unit.INSTANCE;
    }

    public final void removeSecurityFromList(UUID curatedListId, final Security security) {
        Intrinsics.checkNotNullParameter(curatedListId, "curatedListId");
        Intrinsics.checkNotNullParameter(security, "security");
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.removeFromList(curatedListId, security.getId(), getItemOperationObjectType$feature_search_externalRelease(security)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchDuxo.removeSecurityFromList$lambda$16(this.f$0, security);
            }
        }, new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.removeSecurityFromList$lambda$17(this.f$0, security, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSecurityFromList$lambda$16(SearchDuxo searchDuxo, Security security) {
        searchDuxo.applyMutation(new SearchDuxo$removeSecurityFromList$1$1(security, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSecurityFromList$lambda$17(SearchDuxo searchDuxo, Security security, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        searchDuxo.applyMutation(new SearchDuxo$removeSecurityFromList$2$1(security, t, null));
        return Unit.INSTANCE;
    }

    public final void saveRecentSearch(RecentSearch.RecentSearchResult recentSearch) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        this.searchStore.saveRecentSearch(recentSearch);
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$deleteRecentSearch$1", m3645f = "SearchDuxo.kt", m3646l = {529}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchDuxo$deleteRecentSearch$1 */
    static final class C281061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecentSearch.RecentSearchResult $recentSearch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C281061(RecentSearch.RecentSearchResult recentSearchResult, Continuation<? super C281061> continuation) {
            super(2, continuation);
            this.$recentSearch = recentSearchResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchDuxo.this.new C281061(this.$recentSearch, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C281061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SearchStore searchStore = SearchDuxo.this.searchStore;
                    RecentSearch.RecentSearchResult recentSearchResult = this.$recentSearch;
                    this.label = 1;
                    if (searchStore.deleteRecentSearch(recentSearchResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                SearchDuxo.this.applyMutation(new AnonymousClass1(null));
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$deleteRecentSearch$1$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchDuxo$deleteRecentSearch$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
                return ((AnonymousClass1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, new UiEvent(Unit.INSTANCE), null, null, null, false, false, false, null, null, -33554433, 3, null);
            }
        }
    }

    public final void deleteRecentSearch(RecentSearch.RecentSearchResult recentSearch) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C281061(recentSearch, null), 3, null);
    }

    public final void refreshNewsFeed() {
        String string2 = getNewsFeedLocation$feature_search_externalRelease().toString();
        LifecycleHost.DefaultImpls.bind$default(this, this.newsFeedElementStore.refresh(true, string2, NewsFeedLocation.DISCOVER.getServerValue()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchDuxo.refreshNewsFeed$lambda$18(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.refreshNewsFeed$lambda$19(this.f$0, (Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.newsFeedElementStore.streamNewsFeedElements(string2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.refreshNewsFeed$lambda$20(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNewsFeed$lambda$18(SearchDuxo searchDuxo) {
        searchDuxo.applyMutation(new SearchDuxo$refreshNewsFeed$1$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNewsFeed$lambda$19(SearchDuxo searchDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        searchDuxo.applyMutation(new SearchDuxo$refreshNewsFeed$2$1(t, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNewsFeed$lambda$20(SearchDuxo searchDuxo, List elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        searchDuxo.applyMutation(new SearchDuxo$refreshNewsFeed$3$1(elements, null));
        return Unit.INSTANCE;
    }

    public final CuratedListObjectType getItemOperationObjectType$feature_search_externalRelease(Security security) {
        Intrinsics.checkNotNullParameter(security, "<this>");
        if (security instanceof UiCurrencyPair) {
            return CuratedListObjectType.CURRENCY_PAIR;
        }
        if (security instanceof Instrument) {
            return CuratedListObjectType.INSTRUMENT;
        }
        if (!(security instanceof ApiFuturesContractSearchItem) && !(security instanceof ApiFuturesProductSearchItem)) {
            if (security instanceof ApiEventContractSearchItem) {
                return CuratedListObjectType.UNKNOWN;
            }
            if (security instanceof FuturesContract) {
                return CuratedListObjectType.FUTURES_CONTRACT;
            }
            if (security instanceof Index) {
                return CuratedListObjectType.INDEX;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(security);
            throw new ExceptionsH();
        }
        return CuratedListObjectType.FUTURES_CONTRACT;
    }

    public final SearchStore4 getSearchSource$feature_search_externalRelease() {
        int i = WhenMappings.$EnumSwitchMapping$0[((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSource().ordinal()];
        if (i == 1) {
            return SearchStore4.CRYPTO_TRADER;
        }
        if (i == 2) {
            return SearchStore4.UNIVERSAL;
        }
        if (i == 3) {
            return SearchStore4.RETIREMENT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return SearchStore4.JOINT_ACCOUNTS;
    }

    public final NewsFeedLocation getNewsFeedLocation$feature_search_externalRelease() {
        int i = WhenMappings.$EnumSwitchMapping$0[((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSource().ordinal()];
        if (i == 1) {
            return NewsFeedLocation.CRYPTO;
        }
        if (i == 2) {
            return NewsFeedLocation.DISCOVER;
        }
        if (i == 3) {
            return NewsFeedLocation.RETIREMENT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return NewsFeedLocation.LEGACY;
    }

    private final boolean isUniversalSearch() {
        int i = WhenMappings.$EnumSwitchMapping$0[((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSource().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Integer getScrollTargetIndex$feature_search_externalRelease(List<? extends Element> elements) {
        Class cls;
        Intrinsics.checkNotNullParameter(elements, "elements");
        SearchFragmentKey.TargetSection targetSection = ((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getTargetSection();
        if (targetSection == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[targetSection.ordinal()];
        if (i == 1) {
            cls = Element.MarketIndicators.class;
        } else if (i == 2) {
            cls = Element.ListPreview.class;
        } else {
            if (i != 3) {
                return null;
            }
            cls = Element.EducationCarousel.class;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
        Iterator<? extends Element> it = elements.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (orCreateKotlinClass.isInstance(it.next())) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public final List<SearchContentType> contentTypesBySource$feature_search_externalRelease(SearchStore4 searchSource) {
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        switch (WhenMappings.$EnumSwitchMapping$2[searchSource.ordinal()]) {
            case 1:
                return SearchContentType.INSTANCE.getUNIVERSAL_CONTENT_TYPES_PARAM();
            case 2:
                return SearchContentType.INSTANCE.getRETIREMENT_CONTENT_TYPES_PARAM();
            case 3:
                return SearchContentType.INSTANCE.getCRYPTO_TRADER_CONTENT_TYPES_PARAM();
            case 4:
                return SearchContentType.INSTANCE.getJOINT_ACCOUNT_CONTENT_TYPES_PARAM();
            case 5:
            case 6:
                return CollectionsKt.emptyList();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final List<SearchContentType> contentTypesBySourceWithIndices$feature_search_externalRelease(SearchStore4 searchSource) {
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        switch (WhenMappings.$EnumSwitchMapping$2[searchSource.ordinal()]) {
            case 1:
                return CollectionsKt.plus((Collection<? extends SearchContentType>) SearchContentType.INSTANCE.getUNIVERSAL_CONTENT_TYPES_PARAM(), SearchContentType.MARKET_INDEXES);
            case 2:
                return CollectionsKt.plus((Collection<? extends SearchContentType>) SearchContentType.INSTANCE.getRETIREMENT_CONTENT_TYPES_PARAM(), SearchContentType.MARKET_INDEXES);
            case 3:
                return SearchContentType.INSTANCE.getCRYPTO_TRADER_CONTENT_TYPES_PARAM();
            case 4:
                return CollectionsKt.plus((Collection<? extends SearchContentType>) SearchContentType.INSTANCE.getJOINT_ACCOUNT_CONTENT_TYPES_PARAM(), SearchContentType.MARKET_INDEXES);
            case 5:
            case 6:
                return CollectionsKt.emptyList();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Flow<List<SearchContentType>> streamContentTypes$feature_search_externalRelease(SearchStore4 searchSource) {
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        return FlowKt.combine(streamAccountFeatureAccess(AccountFeature.CRYPTO), streamAccountFeatureAccess(AccountFeature.CRYPTO_SEARCH_FOR_BITSTAMP_UK_UPSELL), streamAccountFeatureAccess(AccountFeature.FUTURES), streamAccountFeatureAccess(AccountFeature.EVENT_CONTRACTS), streamAccountFeatureAccess(AccountFeature.OPTIONS_SUPPORTED), new SearchDuxo$streamContentTypes$1(this, searchSource, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void regionGateRunner$feature_search_externalRelease$default(SearchDuxo searchDuxo, RegionGate regionGate, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            regionGate = ToolbarSearchIconRegionGate.INSTANCE;
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        searchDuxo.regionGateRunner$feature_search_externalRelease(regionGate, function0, function02);
    }

    public final void regionGateRunner$feature_search_externalRelease(RegionGate regionGate, final Function0<Unit> allowed, final Function0<Unit> restricted) {
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        Intrinsics.checkNotNullParameter(allowed, "allowed");
        Intrinsics.checkNotNullParameter(restricted, "restricted");
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, regionGate, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchDuxo.regionGateRunner$lambda$24(allowed, restricted, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit regionGateRunner$lambda$24(Function0 function0, Function0 function02, boolean z) {
        if (z) {
            function0.invoke();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamAccountFeatureAccess(AccountFeature accountFeature) {
        RegionGate regionGate;
        String accountNumber = ((SearchFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        int i = WhenMappings.$EnumSwitchMapping$3[accountFeature.ordinal()];
        if (i == 1) {
            regionGate = CryptoRegionGate.INSTANCE;
        } else if (i == 2) {
            regionGate = CryptoBitstampUkUpsellRegionGate.INSTANCE;
        } else if (i == 3) {
            regionGate = EventContractsRegionGate.INSTANCE;
        } else if (i == 4) {
            regionGate = FuturesTradingRegionGate.INSTANCE;
        } else if (i == 5) {
            regionGate = OptionsRegionGate.INSTANCE;
        } else {
            regionGate = ToolbarSearchIconRegionGate.INSTANCE;
        }
        if (accountNumber != null) {
            return this.accountAccessStore.getFeatureAccess(accountNumber, accountFeature);
        }
        final Flow<List<Account>> allSelfDirectedIndividualAccountsForced = this.accountProvider.getAllSelfDirectedIndividualAccountsForced();
        return FlowKt.transformLatest(new Flow<Account>() { // from class: com.robinhood.android.search.search.SearchDuxo$streamAccountFeatureAccess$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = allSelfDirectedIndividualAccountsForced.collect(new C281052(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.search.search.SearchDuxo$streamAccountFeatureAccess$$inlined$map$1$2 */
            public static final class C281052<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$streamAccountFeatureAccess$$inlined$map$1$2", m3645f = "SearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.search.search.SearchDuxo$streamAccountFeatureAccess$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C281052.this.emit(null, this);
                    }
                }

                public C281052(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((Account) next).isOriginal()) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
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
        }, new SearchDuxo$streamAccountFeatureAccess$$inlined$flatMapLatest$1(null, this, regionGate, accountFeature));
    }

    /* compiled from: SearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/search/search/SearchDuxo;", "Lcom/robinhood/android/search/contracts/SearchFragmentKey;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SearchDuxo, SearchFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SearchFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SearchFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SearchFragmentKey getArgs(SearchDuxo searchDuxo) {
            return (SearchFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, searchDuxo);
        }
    }
}
