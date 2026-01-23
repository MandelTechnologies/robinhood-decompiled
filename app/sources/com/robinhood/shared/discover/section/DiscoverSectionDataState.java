package com.robinhood.shared.discover.section;

import android.net.Uri;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState4;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import com.robinhood.shared.crypto.movers.CryptoDailyMoversViewState;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import com.robinhood.shared.discover.section.DiscoverRow;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DiscoverSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010)\u001a\u00020\u0017*\u00020\u0017H\u0002J\t\u0010*\u001a\u00020\u0003HÂ\u0003J\t\u0010+\u001a\u00020\u0005HÂ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b-J\t\u0010.\u001a\u00020\tHÂ\u0003J\t\u0010/\u001a\u00020\u000bHÂ\u0003J=\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u00101\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverSectionDataState;", "", "assetType", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "type", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;", "tradingOptions", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "isLoggedIn", "", "tabForCdpDeepLink", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;ZLcom/robinhood/android/navigation/keys/FragmentTab;)V", "getTradingOptions$lib_discover_externalDebug", "()Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "getStyle", "()Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "isLoading", "()Z", "title", "", "getTitle", "()Ljava/lang/String;", "description", "getDescription", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure", "cryptoChips", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "getCryptoChips", "()Lkotlinx/collections/immutable/ImmutableList;", "cryptoCards", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "getCryptoCards", "cryptoRowList", "Lcom/robinhood/shared/discover/section/DiscoverRow;", "getCryptoRowList", "appendTabOverrideToDeeplink", "component1", "component2", "component3", "component3$lib_discover_externalDebug", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class DiscoverSectionDataState {
    private static final ImmutableList3<DiscoverRow.Loading> loadingDiscoverRows;
    private final CryptoExploreState3 assetType;
    private final boolean isLoggedIn;
    private final FragmentTab tabForCdpDeepLink;
    private final CryptoTradingOptions tradingOptions;
    private final CryptoExploreState4 type;
    public static final int $stable = 8;

    /* compiled from: DiscoverSectionDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoExploreState4.values().length];
            try {
                iArr[CryptoExploreState4.DISCOVER_CHIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoExploreState4.CHP_CHIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoExploreState4.DISCOVER_CARDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoExploreState4.COIN_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final CryptoExploreState3 getAssetType() {
        return this.assetType;
    }

    /* renamed from: component2, reason: from getter */
    private final CryptoExploreState4 getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component5, reason: from getter */
    private final FragmentTab getTabForCdpDeepLink() {
        return this.tabForCdpDeepLink;
    }

    public static /* synthetic */ DiscoverSectionDataState copy$default(DiscoverSectionDataState discoverSectionDataState, CryptoExploreState3 cryptoExploreState3, CryptoExploreState4 cryptoExploreState4, CryptoTradingOptions cryptoTradingOptions, boolean z, FragmentTab fragmentTab, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoExploreState3 = discoverSectionDataState.assetType;
        }
        if ((i & 2) != 0) {
            cryptoExploreState4 = discoverSectionDataState.type;
        }
        if ((i & 4) != 0) {
            cryptoTradingOptions = discoverSectionDataState.tradingOptions;
        }
        if ((i & 8) != 0) {
            z = discoverSectionDataState.isLoggedIn;
        }
        if ((i & 16) != 0) {
            fragmentTab = discoverSectionDataState.tabForCdpDeepLink;
        }
        FragmentTab fragmentTab2 = fragmentTab;
        CryptoTradingOptions cryptoTradingOptions2 = cryptoTradingOptions;
        return discoverSectionDataState.copy(cryptoExploreState3, cryptoExploreState4, cryptoTradingOptions2, z, fragmentTab2);
    }

    /* renamed from: component3$lib_discover_externalDebug, reason: from getter */
    public final CryptoTradingOptions getTradingOptions() {
        return this.tradingOptions;
    }

    public final DiscoverSectionDataState copy(CryptoExploreState3 assetType, CryptoExploreState4 type2, CryptoTradingOptions tradingOptions, boolean isLoggedIn, FragmentTab tabForCdpDeepLink) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(tabForCdpDeepLink, "tabForCdpDeepLink");
        return new DiscoverSectionDataState(assetType, type2, tradingOptions, isLoggedIn, tabForCdpDeepLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoverSectionDataState)) {
            return false;
        }
        DiscoverSectionDataState discoverSectionDataState = (DiscoverSectionDataState) other;
        return this.assetType == discoverSectionDataState.assetType && this.type == discoverSectionDataState.type && Intrinsics.areEqual(this.tradingOptions, discoverSectionDataState.tradingOptions) && this.isLoggedIn == discoverSectionDataState.isLoggedIn && this.tabForCdpDeepLink == discoverSectionDataState.tabForCdpDeepLink;
    }

    public int hashCode() {
        int iHashCode = ((this.assetType.hashCode() * 31) + this.type.hashCode()) * 31;
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        return ((((iHashCode + (cryptoTradingOptions == null ? 0 : cryptoTradingOptions.hashCode())) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + this.tabForCdpDeepLink.hashCode();
    }

    public String toString() {
        return "DiscoverSectionDataState(assetType=" + this.assetType + ", type=" + this.type + ", tradingOptions=" + this.tradingOptions + ", isLoggedIn=" + this.isLoggedIn + ", tabForCdpDeepLink=" + this.tabForCdpDeepLink + ")";
    }

    public DiscoverSectionDataState(CryptoExploreState3 assetType, CryptoExploreState4 type2, CryptoTradingOptions cryptoTradingOptions, boolean z, FragmentTab tabForCdpDeepLink) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(tabForCdpDeepLink, "tabForCdpDeepLink");
        this.assetType = assetType;
        this.type = type2;
        this.tradingOptions = cryptoTradingOptions;
        this.isLoggedIn = z;
        this.tabForCdpDeepLink = tabForCdpDeepLink;
    }

    public /* synthetic */ DiscoverSectionDataState(CryptoExploreState3 cryptoExploreState3, CryptoExploreState4 cryptoExploreState4, CryptoTradingOptions cryptoTradingOptions, boolean z, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoExploreState3, cryptoExploreState4, (i & 4) != 0 ? null : cryptoTradingOptions, z, fragmentTab);
    }

    public final CryptoTradingOptions getTradingOptions$lib_discover_externalDebug() {
        return this.tradingOptions;
    }

    public final ApiCryptoTradingOptions3 getStyle() {
        ApiCryptoTradingOptions3 style;
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if (cryptoTradingOptions != null && (style = cryptoTradingOptions.getStyle()) != null) {
            return style;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1 || i == 2) {
            return ApiCryptoTradingOptions3.CHIP;
        }
        if (i == 3) {
            return ApiCryptoTradingOptions3.CARD;
        }
        if (i == 4) {
            return ApiCryptoTradingOptions3.LIST_ROW;
        }
        return ApiCryptoTradingOptions3.ROW;
    }

    public final boolean isLoading() {
        return this.tradingOptions == null;
    }

    public final String getTitle() {
        if (isLoading()) {
            return "------ -------";
        }
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if (cryptoTradingOptions != null) {
            return cryptoTradingOptions.getTitle();
        }
        return null;
    }

    public final String getDescription() {
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if (cryptoTradingOptions != null) {
            return cryptoTradingOptions.getDescription();
        }
        return null;
    }

    public final String getDisclosure() {
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if (cryptoTradingOptions != null) {
            return cryptoTradingOptions.getDisclosure();
        }
        return null;
    }

    public final ImmutableList<CryptoChipsComposable> getCryptoChips() {
        if (isLoading()) {
            if (!CollectionsKt.listOf((Object[]) new CryptoExploreState4[]{CryptoExploreState4.DISCOVER_CHIPS, CryptoExploreState4.CHP_CHIPS}).contains(this.type)) {
                return null;
            }
            ArrayList arrayList = new ArrayList(30);
            for (int i = 0; i < 30; i++) {
                arrayList.add(CryptoChipsComposable.Loading.INSTANCE);
            }
            return extensions2.toPersistentList(arrayList);
        }
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if ((cryptoTradingOptions != null ? cryptoTradingOptions.getStyle() : null) != ApiCryptoTradingOptions3.CHIP) {
            return null;
        }
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results = this.tradingOptions.getResults();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        for (CryptoTradingOptions.TradingOptionItem tradingOptionItem : results) {
            String title = tradingOptionItem.getTitle();
            String description = tradingOptionItem.getDescription();
            if (description == null) {
                description = tradingOptionItem.getSubtitle();
            }
            arrayList2.add(new CryptoChipsComposable.Loaded(tradingOptionItem.getLogoUrl(), title, tradingOptionItem.getPercentChange(), appendTabOverrideToDeeplink(tradingOptionItem.getDeeplink()), description, false, 32, null));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList<InstrumentPreviewCard4> getCryptoCards() {
        ApiCryptoTradingOptions3 apiCryptoTradingOptions3 = null;
        Object[] objArr = 0;
        if (isLoading()) {
            if (this.type != CryptoExploreState4.DISCOVER_CARDS) {
                return null;
            }
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(new InstrumentPreviewCard4.Loading(apiCryptoTradingOptions3, 1, objArr == true ? 1 : 0));
            }
            return extensions2.toPersistentList(arrayList);
        }
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if ((cryptoTradingOptions != null ? cryptoTradingOptions.getStyle() : null) != ApiCryptoTradingOptions3.CARD) {
            return null;
        }
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results = this.tradingOptions.getResults();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        for (CryptoTradingOptions.TradingOptionItem tradingOptionItem : results) {
            InstrumentDetails3.Chart chart = tradingOptionItem.getChart();
            if (chart == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String deeplink = tradingOptionItem.getDeeplink();
            if (deeplink == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<ChartLine> chartLines = chart.getChartLines();
            Direction pageDirection = chart.getPageDirection();
            String percentChange = tradingOptionItem.getPercentChange();
            String lastPrice = tradingOptionItem.getLastPrice();
            String subtitle = tradingOptionItem.getSubtitle();
            arrayList2.add(new CryptoDailyMoversViewState.CryptoCard(appendTabOverrideToDeeplink(deeplink), this.isLoggedIn ? Boolean.TRUE : null, tradingOptionItem.getTitle(), subtitle, lastPrice, percentChange, chartLines, pageDirection, null, 256, null));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    public final ImmutableList<DiscoverRow> getCryptoRowList() {
        if (isLoading()) {
            if (this.type == CryptoExploreState4.COIN_LIST) {
                return loadingDiscoverRows;
            }
            return null;
        }
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if ((cryptoTradingOptions != null ? cryptoTradingOptions.getStyle() : null) != ApiCryptoTradingOptions3.LIST_ROW) {
            return null;
        }
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results = this.tradingOptions.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        for (CryptoTradingOptions.TradingOptionItem tradingOptionItem : results) {
            String deeplink = tradingOptionItem.getDeeplink();
            if (deeplink == null) {
                throw new IllegalStateException("Required value was null.");
            }
            InstrumentDetails3.Chart chart = tradingOptionItem.getChart();
            Direction pageDirection = chart != null ? chart.getPageDirection() : null;
            InstrumentDetails3.Chart chart2 = tradingOptionItem.getChart();
            arrayList.add(new DiscoverRow.Loaded(pageDirection, chart2 != null ? chart2.getChartLines() : null, appendTabOverrideToDeeplink(deeplink), this.assetType == CryptoExploreState3.CRYPTO, tradingOptionItem.getLogoUrl(), tradingOptionItem.getLastPrice(), tradingOptionItem.getTitle(), tradingOptionItem.getPercentChange(), tradingOptionItem.getSubtitle(), this.isLoggedIn ? Boolean.TRUE : null));
        }
        return extensions2.toPersistentList(arrayList);
    }

    private final String appendTabOverrideToDeeplink(String str) {
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) Content.MarketIndicator.CRYPTO_TYPE, false, 2, (Object) null)) {
            return str;
        }
        String string2 = Uri.parse(str).buildUpon().appendQueryParameter("tab_override", this.tabForCdpDeepLink.name()).build().toString();
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(DiscoverRow.Loading.INSTANCE);
        }
        loadingDiscoverRows = extensions2.toPersistentList(arrayList);
    }
}
