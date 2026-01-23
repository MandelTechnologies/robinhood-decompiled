package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bõ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "listsOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "expandedCuratedListIdsPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "swipeNuxProvider", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "curatedListStateProvider", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CuratedListDuxo_Factory implements Factory<CuratedListDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AppType> appType;
    private final Provider<BuySellStore> buySellStore;
    private final Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStateProvider> curatedListStateProvider;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<StringToBooleanMapPreference> expandedCuratedListIdsPref;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<ListsOrderStore> listsOrderStore;
    private final Provider<Navigator> navigator;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<PositionsV2Store> positionsV2Store;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<ScreenersStore> screenersStore;
    private final Provider<SwipeNuxProvider> swipeNuxProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CuratedListDuxo_Factory create(Provider<AppType> provider, Provider<ScreenersStore> provider2, Provider<CuratedListStore> provider3, Provider<ListsOrderStore> provider4, Provider<StringToBooleanMapPreference> provider5, Provider<CuratedListItemsStore> provider6, Provider<CuratedListItemViewModeStore> provider7, Provider<PositionsV2Store> provider8, Provider<OptionStrategyInfoStore> provider9, Provider<ExperimentsStore> provider10, Provider<BuySellStore> provider11, Provider<Navigator> provider12, Provider<SwipeNuxProvider> provider13, Provider<RegionGateProvider> provider14, Provider<AccountAccessStore> provider15, Provider<CuratedListStateProvider> provider16, Provider<DuxoBundle> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final CuratedListDuxo newInstance(AppType appType, ScreenersStore screenersStore, CuratedListStore curatedListStore, ListsOrderStore listsOrderStore, StringToBooleanMapPreference stringToBooleanMapPreference, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, PositionsV2Store positionsV2Store, OptionStrategyInfoStore optionStrategyInfoStore, ExperimentsStore experimentsStore, BuySellStore buySellStore, Navigator navigator, SwipeNuxProvider swipeNuxProvider, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, CuratedListStateProvider curatedListStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(appType, screenersStore, curatedListStore, listsOrderStore, stringToBooleanMapPreference, curatedListItemsStore, curatedListItemViewModeStore, positionsV2Store, optionStrategyInfoStore, experimentsStore, buySellStore, navigator, swipeNuxProvider, regionGateProvider, accountAccessStore, curatedListStateProvider, duxoBundle);
    }

    public CuratedListDuxo_Factory(Provider<AppType> appType, Provider<ScreenersStore> screenersStore, Provider<CuratedListStore> curatedListStore, Provider<ListsOrderStore> listsOrderStore, Provider<StringToBooleanMapPreference> expandedCuratedListIdsPref, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<PositionsV2Store> positionsV2Store, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<ExperimentsStore> experimentsStore, Provider<BuySellStore> buySellStore, Provider<Navigator> navigator, Provider<SwipeNuxProvider> swipeNuxProvider, Provider<RegionGateProvider> regionGateProvider, Provider<AccountAccessStore> accountAccessStore, Provider<CuratedListStateProvider> curatedListStateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
        Intrinsics.checkNotNullParameter(expandedCuratedListIdsPref, "expandedCuratedListIdsPref");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(swipeNuxProvider, "swipeNuxProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(curatedListStateProvider, "curatedListStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appType = appType;
        this.screenersStore = screenersStore;
        this.curatedListStore = curatedListStore;
        this.listsOrderStore = listsOrderStore;
        this.expandedCuratedListIdsPref = expandedCuratedListIdsPref;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.positionsV2Store = positionsV2Store;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.experimentsStore = experimentsStore;
        this.buySellStore = buySellStore;
        this.navigator = navigator;
        this.swipeNuxProvider = swipeNuxProvider;
        this.regionGateProvider = regionGateProvider;
        this.accountAccessStore = accountAccessStore;
        this.curatedListStateProvider = curatedListStateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CuratedListDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        ScreenersStore screenersStore = this.screenersStore.get();
        Intrinsics.checkNotNullExpressionValue(screenersStore, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        ListsOrderStore listsOrderStore = this.listsOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(listsOrderStore, "get(...)");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.expandedCuratedListIdsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemViewModeStore, "get(...)");
        PositionsV2Store positionsV2Store = this.positionsV2Store.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Store, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        SwipeNuxProvider swipeNuxProvider = this.swipeNuxProvider.get();
        Intrinsics.checkNotNullExpressionValue(swipeNuxProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountAccessStore accountAccessStore2 = accountAccessStore;
        CuratedListStateProvider curatedListStateProvider = this.curatedListStateProvider.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStateProvider, "get(...)");
        CuratedListStateProvider curatedListStateProvider2 = curatedListStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(appType, screenersStore, curatedListStore, listsOrderStore, stringToBooleanMapPreference, curatedListItemsStore, curatedListItemViewModeStore, positionsV2Store, optionStrategyInfoStore, experimentsStore, buySellStore, navigator, swipeNuxProvider, regionGateProvider2, accountAccessStore2, curatedListStateProvider2, duxoBundle);
    }

    /* compiled from: CuratedListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jö\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007H\u0007J\u0090\u0001\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "listsOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "expandedCuratedListIdsPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "swipeNuxProvider", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "curatedListStateProvider", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CuratedListDuxo_Factory create(Provider<AppType> appType, Provider<ScreenersStore> screenersStore, Provider<CuratedListStore> curatedListStore, Provider<ListsOrderStore> listsOrderStore, Provider<StringToBooleanMapPreference> expandedCuratedListIdsPref, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<PositionsV2Store> positionsV2Store, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<ExperimentsStore> experimentsStore, Provider<BuySellStore> buySellStore, Provider<Navigator> navigator, Provider<SwipeNuxProvider> swipeNuxProvider, Provider<RegionGateProvider> regionGateProvider, Provider<AccountAccessStore> accountAccessStore, Provider<CuratedListStateProvider> curatedListStateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
            Intrinsics.checkNotNullParameter(expandedCuratedListIdsPref, "expandedCuratedListIdsPref");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(swipeNuxProvider, "swipeNuxProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(curatedListStateProvider, "curatedListStateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CuratedListDuxo_Factory(appType, screenersStore, curatedListStore, listsOrderStore, expandedCuratedListIdsPref, curatedListItemsStore, curatedListItemViewModeStore, positionsV2Store, optionStrategyInfoStore, experimentsStore, buySellStore, navigator, swipeNuxProvider, regionGateProvider, accountAccessStore, curatedListStateProvider, duxoBundle);
        }

        @JvmStatic
        public final CuratedListDuxo newInstance(AppType appType, ScreenersStore screenersStore, CuratedListStore curatedListStore, ListsOrderStore listsOrderStore, StringToBooleanMapPreference expandedCuratedListIdsPref, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, PositionsV2Store positionsV2Store, OptionStrategyInfoStore optionStrategyInfoStore, ExperimentsStore experimentsStore, BuySellStore buySellStore, Navigator navigator, SwipeNuxProvider swipeNuxProvider, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, CuratedListStateProvider curatedListStateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
            Intrinsics.checkNotNullParameter(expandedCuratedListIdsPref, "expandedCuratedListIdsPref");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(swipeNuxProvider, "swipeNuxProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(curatedListStateProvider, "curatedListStateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CuratedListDuxo(appType, screenersStore, curatedListStore, listsOrderStore, expandedCuratedListIdsPref, curatedListItemsStore, curatedListItemViewModeStore, positionsV2Store, optionStrategyInfoStore, experimentsStore, buySellStore, navigator, swipeNuxProvider, regionGateProvider, accountAccessStore, curatedListStateProvider, duxoBundle);
        }
    }
}
