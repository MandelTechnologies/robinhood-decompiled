package com.robinhood.android.search.search;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.search.SearchStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u009f\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/search/search/SearchDuxo;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "indexOptionsListExtendedHoursBadgeSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SearchDuxo_Factory implements Factory<SearchDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AppType> appType;
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesPositionStore> futuresPositionStore;
    private final Provider<BooleanPreference> indexOptionsListExtendedHoursBadgeSeenPref;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore;
    private final Provider<NewsFeedElementStore> newsFeedElementStore;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<RecommendationsEligibilityStore> recsEligibilityStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ScreenersStore> screenersStore;
    private final Provider<SearchStore> searchStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SearchDuxo_Factory create(Provider<AnalyticsLogger> provider, Provider<AccountProvider> provider2, Provider<AccountAccessStore> provider3, Provider<SearchStore> provider4, Provider<PositionStore> provider5, Provider<FuturesPositionStore> provider6, Provider<CryptoHoldingStore> provider7, Provider<CuratedListStore> provider8, Provider<CuratedListItemsStore> provider9, Provider<ListItemIdToUserListIdsStore> provider10, Provider<NewsFeedElementStore> provider11, Provider<RecommendationsEligibilityStore> provider12, Provider<RegionGateProvider> provider13, Provider<InstrumentStore> provider14, Provider<ScreenersStore> provider15, Provider<AppType> provider16, Provider<OptionsExtendedHoursEnabledStore> provider17, Provider<BooleanPreference> provider18, Provider<DuxoBundle> provider19, Provider<SavedStateHandle> provider20) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20);
    }

    @JvmStatic
    public static final SearchDuxo newInstance(AnalyticsLogger analyticsLogger, AccountProvider accountProvider, AccountAccessStore accountAccessStore, SearchStore searchStore, PositionStore positionStore, FuturesPositionStore futuresPositionStore, CryptoHoldingStore cryptoHoldingStore, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, NewsFeedElementStore newsFeedElementStore, RecommendationsEligibilityStore recommendationsEligibilityStore, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, ScreenersStore screenersStore, AppType appType, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, BooleanPreference booleanPreference, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(analyticsLogger, accountProvider, accountAccessStore, searchStore, positionStore, futuresPositionStore, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listItemIdToUserListIdsStore, newsFeedElementStore, recommendationsEligibilityStore, regionGateProvider, instrumentStore, screenersStore, appType, optionsExtendedHoursEnabledStore, booleanPreference, duxoBundle, savedStateHandle);
    }

    public SearchDuxo_Factory(Provider<AnalyticsLogger> analytics, Provider<AccountProvider> accountProvider, Provider<AccountAccessStore> accountAccessStore, Provider<SearchStore> searchStore, Provider<PositionStore> positionStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore, Provider<NewsFeedElementStore> newsFeedElementStore, Provider<RecommendationsEligibilityStore> recsEligibilityStore, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentStore> instrumentStore, Provider<ScreenersStore> screenersStore, Provider<AppType> appType, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<BooleanPreference> indexOptionsListExtendedHoursBadgeSeenPref, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
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
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public SearchDuxo get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        SearchStore searchStore = this.searchStore.get();
        Intrinsics.checkNotNullExpressionValue(searchStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        FuturesPositionStore futuresPositionStore = this.futuresPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresPositionStore, "get(...)");
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        ListItemIdToUserListIdsStore listItemIdToUserListIdsStore = this.listItemIdToUserListIdsStore.get();
        Intrinsics.checkNotNullExpressionValue(listItemIdToUserListIdsStore, "get(...)");
        NewsFeedElementStore newsFeedElementStore = this.newsFeedElementStore.get();
        Intrinsics.checkNotNullExpressionValue(newsFeedElementStore, "get(...)");
        RecommendationsEligibilityStore recommendationsEligibilityStore = this.recsEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsEligibilityStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        InstrumentStore instrumentStore2 = instrumentStore;
        ScreenersStore screenersStore = this.screenersStore.get();
        Intrinsics.checkNotNullExpressionValue(screenersStore, "get(...)");
        ScreenersStore screenersStore2 = screenersStore;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        AppType appType2 = appType;
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore2 = optionsExtendedHoursEnabledStore;
        BooleanPreference booleanPreference = this.indexOptionsListExtendedHoursBadgeSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(analyticsLogger, accountProvider, accountAccessStore, searchStore, positionStore, futuresPositionStore, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listItemIdToUserListIdsStore, newsFeedElementStore, recommendationsEligibilityStore, regionGateProvider, instrumentStore2, screenersStore2, appType2, optionsExtendedHoursEnabledStore2, booleanPreference2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: SearchDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0007H\u0007J¨\u0001\u0010/\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0007¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/search/search/SearchDuxo_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "indexOptionsListExtendedHoursBadgeSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/search/search/SearchDuxo;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchDuxo_Factory create(Provider<AnalyticsLogger> analytics, Provider<AccountProvider> accountProvider, Provider<AccountAccessStore> accountAccessStore, Provider<SearchStore> searchStore, Provider<PositionStore> positionStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore, Provider<NewsFeedElementStore> newsFeedElementStore, Provider<RecommendationsEligibilityStore> recsEligibilityStore, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentStore> instrumentStore, Provider<ScreenersStore> screenersStore, Provider<AppType> appType, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<BooleanPreference> indexOptionsListExtendedHoursBadgeSeenPref, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
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
            return new SearchDuxo_Factory(analytics, accountProvider, accountAccessStore, searchStore, positionStore, futuresPositionStore, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listItemIdToUserListIdsStore, newsFeedElementStore, recsEligibilityStore, regionGateProvider, instrumentStore, screenersStore, appType, optionsExtendedHoursEnabledStore, indexOptionsListExtendedHoursBadgeSeenPref, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final SearchDuxo newInstance(AnalyticsLogger analytics, AccountProvider accountProvider, AccountAccessStore accountAccessStore, SearchStore searchStore, PositionStore positionStore, FuturesPositionStore futuresPositionStore, CryptoHoldingStore cryptoHoldingStore, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, NewsFeedElementStore newsFeedElementStore, RecommendationsEligibilityStore recsEligibilityStore, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, ScreenersStore screenersStore, AppType appType, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, BooleanPreference indexOptionsListExtendedHoursBadgeSeenPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
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
            return new SearchDuxo(analytics, accountProvider, accountAccessStore, searchStore, positionStore, futuresPositionStore, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listItemIdToUserListIdsStore, newsFeedElementStore, recsEligibilityStore, regionGateProvider, instrumentStore, screenersStore, appType, optionsExtendedHoursEnabledStore, indexOptionsListExtendedHoursBadgeSeenPref, duxoBundle, savedStateHandle);
        }
    }
}
