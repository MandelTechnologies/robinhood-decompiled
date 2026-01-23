package com.robinhood.android.futures.detail.p140ui.duxo;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesLocaleStore;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bõ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresLocaleStore", "Lcom/robinhood/store/futures/FuturesLocaleStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "listItemIdToUserListStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "shouldShowFuturesDetailsFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "shouldShowLadderButtonTooltipPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesDetailDuxo_Factory implements Factory<FuturesDetailDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesLocaleStore> futuresLocaleStore;
    private final Provider<FuturesMarketDataStore> futuresMarketDataStore;
    private final Provider<FuturesOrderStore> futuresOrderStore;
    private final Provider<FuturesProductStore> futuresProductStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<FuturesTradingHoursStore> futuresTradingHoursStore;
    private final Provider<ListItemIdToUserListIdsStore> listItemIdToUserListStore;
    private final Provider<Navigator> navigator;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RhdCostBasisStore> rhdCostBasisStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> shouldShowFuturesDetailsFtuxPref;
    private final Provider<BooleanPreference> shouldShowLadderButtonTooltipPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesDetailDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<FuturesAccountStore> provider2, Provider<FuturesContractStore> provider3, Provider<FuturesLocaleStore> provider4, Provider<FuturesMarketDataStore> provider5, Provider<FuturesOrderStore> provider6, Provider<FuturesProductStore> provider7, Provider<FuturesQuoteStore> provider8, Provider<FuturesTradingHoursStore> provider9, Provider<ListItemIdToUserListIdsStore> provider10, Provider<RhdCostBasisStore> provider11, Provider<RegionGateProvider> provider12, Provider<Navigator> provider13, Provider<BooleanPreference> provider14, Provider<BooleanPreference> provider15, Provider<SavedStateHandle> provider16, Provider<DuxoBundle> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final FuturesDetailDuxo newInstance(ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesLocaleStore futuresLocaleStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderStore futuresOrderStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore, FuturesTradingHoursStore futuresTradingHoursStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, RhdCostBasisStore rhdCostBasisStore, RegionGateProvider regionGateProvider, Navigator navigator, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(experimentsStore, futuresAccountStore, futuresContractStore, futuresLocaleStore, futuresMarketDataStore, futuresOrderStore, futuresProductStore, futuresQuoteStore, futuresTradingHoursStore, listItemIdToUserListIdsStore, rhdCostBasisStore, regionGateProvider, navigator, booleanPreference, booleanPreference2, savedStateHandle, duxoBundle);
    }

    public FuturesDetailDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesLocaleStore> futuresLocaleStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesProductStore> futuresProductStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListStore, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<RegionGateProvider> regionGateProvider, Provider<Navigator> navigator, Provider<BooleanPreference> shouldShowFuturesDetailsFtuxPref, Provider<BooleanPreference> shouldShowLadderButtonTooltipPref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListStore, "listItemIdToUserListStore");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(shouldShowFuturesDetailsFtuxPref, "shouldShowFuturesDetailsFtuxPref");
        Intrinsics.checkNotNullParameter(shouldShowLadderButtonTooltipPref, "shouldShowLadderButtonTooltipPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresLocaleStore = futuresLocaleStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresOrderStore = futuresOrderStore;
        this.futuresProductStore = futuresProductStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.listItemIdToUserListStore = listItemIdToUserListStore;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.regionGateProvider = regionGateProvider;
        this.navigator = navigator;
        this.shouldShowFuturesDetailsFtuxPref = shouldShowFuturesDetailsFtuxPref;
        this.shouldShowLadderButtonTooltipPref = shouldShowLadderButtonTooltipPref;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FuturesDetailDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesLocaleStore futuresLocaleStore = this.futuresLocaleStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresLocaleStore, "get(...)");
        FuturesMarketDataStore futuresMarketDataStore = this.futuresMarketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketDataStore, "get(...)");
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderStore, "get(...)");
        FuturesProductStore futuresProductStore = this.futuresProductStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresProductStore, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesTradingHoursStore futuresTradingHoursStore = this.futuresTradingHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresTradingHoursStore, "get(...)");
        ListItemIdToUserListIdsStore listItemIdToUserListIdsStore = this.listItemIdToUserListStore.get();
        Intrinsics.checkNotNullExpressionValue(listItemIdToUserListIdsStore, "get(...)");
        RhdCostBasisStore rhdCostBasisStore = this.rhdCostBasisStore.get();
        Intrinsics.checkNotNullExpressionValue(rhdCostBasisStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        BooleanPreference booleanPreference = this.shouldShowFuturesDetailsFtuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.shouldShowLadderButtonTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(experimentsStore, futuresAccountStore, futuresContractStore, futuresLocaleStore, futuresMarketDataStore, futuresOrderStore, futuresProductStore, futuresQuoteStore, futuresTradingHoursStore, listItemIdToUserListIdsStore, rhdCostBasisStore, regionGateProvider, navigator, booleanPreference2, booleanPreference4, savedStateHandle2, duxoBundle);
    }

    /* compiled from: FuturesDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jö\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0007H\u0007J\u0090\u0001\u0010(\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresLocaleStore", "Lcom/robinhood/store/futures/FuturesLocaleStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "listItemIdToUserListStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "shouldShowFuturesDetailsFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "shouldShowLadderButtonTooltipPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesDetailDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesLocaleStore> futuresLocaleStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesProductStore> futuresProductStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListStore, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<RegionGateProvider> regionGateProvider, Provider<Navigator> navigator, Provider<BooleanPreference> shouldShowFuturesDetailsFtuxPref, Provider<BooleanPreference> shouldShowLadderButtonTooltipPref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(listItemIdToUserListStore, "listItemIdToUserListStore");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(shouldShowFuturesDetailsFtuxPref, "shouldShowFuturesDetailsFtuxPref");
            Intrinsics.checkNotNullParameter(shouldShowLadderButtonTooltipPref, "shouldShowLadderButtonTooltipPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesDetailDuxo_Factory(experimentsStore, futuresAccountStore, futuresContractStore, futuresLocaleStore, futuresMarketDataStore, futuresOrderStore, futuresProductStore, futuresQuoteStore, futuresTradingHoursStore, listItemIdToUserListStore, rhdCostBasisStore, regionGateProvider, navigator, shouldShowFuturesDetailsFtuxPref, shouldShowLadderButtonTooltipPref, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final FuturesDetailDuxo newInstance(ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesLocaleStore futuresLocaleStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderStore futuresOrderStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore, FuturesTradingHoursStore futuresTradingHoursStore, ListItemIdToUserListIdsStore listItemIdToUserListStore, RhdCostBasisStore rhdCostBasisStore, RegionGateProvider regionGateProvider, Navigator navigator, BooleanPreference shouldShowFuturesDetailsFtuxPref, BooleanPreference shouldShowLadderButtonTooltipPref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(listItemIdToUserListStore, "listItemIdToUserListStore");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(shouldShowFuturesDetailsFtuxPref, "shouldShowFuturesDetailsFtuxPref");
            Intrinsics.checkNotNullParameter(shouldShowLadderButtonTooltipPref, "shouldShowLadderButtonTooltipPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesDetailDuxo(experimentsStore, futuresAccountStore, futuresContractStore, futuresLocaleStore, futuresMarketDataStore, futuresOrderStore, futuresProductStore, futuresQuoteStore, futuresTradingHoursStore, listItemIdToUserListStore, rhdCostBasisStore, regionGateProvider, navigator, shouldShowFuturesDetailsFtuxPref, shouldShowLadderButtonTooltipPref, savedStateHandle, duxoBundle);
        }
    }
}
