package com.robinhood.android.search.selector;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.cortex.models.asset.AssetDigestPopularInstruments;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.equities.contracts.tradeladder.TradeLadderContract;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesProductSearchItem;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.UiIndexOptionChainSearchItem;
import com.robinhood.models.p355ui.UiOptionChainSearchItem;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartFragmentKey;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SearchSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000H&\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem;", "", "isTheSameAs", "", "other", "Header", "SecurityRow", "Lcom/robinhood/android/search/selector/SearchItem$Header;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.selector.SearchItem, reason: use source file name */
/* loaded from: classes5.dex */
public interface SearchSelectorViewState3 {
    boolean isTheSameAs(SearchSelectorViewState3 other);

    /* compiled from: SearchSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$Header;", "Lcom/robinhood/android/search/selector/SearchItem;", "displayName", "", "<init>", "(Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "isTheSameAs", "", "other", "component1", "copy", "equals", "", "hashCode", "", "toString", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.selector.SearchItem$Header, reason: from toString */
    public static final /* data */ class Header implements SearchSelectorViewState3 {
        private final String displayName;

        public static /* synthetic */ Header copy$default(Header header, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = header.displayName;
            }
            return header.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public final Header copy(String displayName) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new Header(displayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Header) && Intrinsics.areEqual(this.displayName, ((Header) other).displayName);
        }

        public int hashCode() {
            return this.displayName.hashCode();
        }

        public String toString() {
            return "Header(displayName=" + this.displayName + ")";
        }

        public Header(String displayName) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.displayName = displayName;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        @Override // com.robinhood.android.search.selector.SearchSelectorViewState3
        public boolean isTheSameAs(SearchSelectorViewState3 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Intrinsics.areEqual(this, other);
        }
    }

    /* compiled from: SearchSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0019\u001a\u001b\u001c\u001d\u001e\u001f B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u000b!\"#$%&'()*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/selector/SearchItem;", "displayName", "", "symbol", "id", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getDisplayName", "()Ljava/lang/String;", "getSymbol", "getId", "()Ljava/util/UUID;", "isTheSameAs", "", "other", "curatedListChipItem", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "getCuratedListChipItem", "()Lcom/robinhood/android/common/ui/CuratedListChipItem;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "OptionsSearchResultItem", "IndexOptionsSearchResultItem", "AdvancedChartResultItem", "TradingTrendsChartResultItem", "CompanyFinancialsResultItem", "LadderChartResultItem", "BwAdvanceChartResultItem", "CopilotResultItem", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$AdvancedChartResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$Crypto;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$Equity;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesContractItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesProductItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$CompanyFinancialsResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$CopilotResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$IndexOptionsSearchResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$LadderChartResultItem$Equity;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$OptionsSearchResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$TradingTrendsChartResultItem;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow */
    public static abstract class SecurityRow implements SearchSelectorViewState3 {
        private final String displayName;
        private final UUID id;
        private final String symbol;

        public /* synthetic */ SecurityRow(String str, String str2, UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uuid);
        }

        public abstract IntentKey getIntentKey();

        private SecurityRow(String str, String str2, UUID uuid) {
            this.displayName = str;
            this.symbol = str2;
            this.id = uuid;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.selector.SearchSelectorViewState3
        public boolean isTheSameAs(SearchSelectorViewState3 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof SecurityRow) {
                return Intrinsics.areEqual(this.id, ((SecurityRow) other).id);
            }
            return false;
        }

        public CuratedListChipItem getCuratedListChipItem() {
            return new CuratedListChipItem(this.id, this.symbol, ApiCuratedList.OwnerType.UNKNOWN, null, null, null, null, true, false, null, false, 1400, null);
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$OptionsSearchResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "accountNumber", "", "optionsSearchSelectorLaunchMode", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "uiOptionChainSearchItem", "Lcom/robinhood/models/ui/UiOptionChainSearchItem;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;Lcom/robinhood/models/ui/UiOptionChainSearchItem;)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionsSearchSelectorLaunchMode", "()Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "getUiOptionChainSearchItem", "()Lcom/robinhood/models/ui/UiOptionChainSearchItem;", "intentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "getIntentKey", "()Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$OptionsSearchResultItem, reason: from toString */
        public static final /* data */ class OptionsSearchResultItem extends SecurityRow {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String accountNumber;
            private final OptionChainIntentKey intentKey;
            private final SearchSelectorLaunchMode.Options optionsSearchSelectorLaunchMode;
            private final UiOptionChainSearchItem uiOptionChainSearchItem;

            public static /* synthetic */ OptionsSearchResultItem copy$default(OptionsSearchResultItem optionsSearchResultItem, String str, SearchSelectorLaunchMode.Options options, UiOptionChainSearchItem uiOptionChainSearchItem, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = optionsSearchResultItem.accountNumber;
                }
                if ((i & 2) != 0) {
                    options = optionsSearchResultItem.optionsSearchSelectorLaunchMode;
                }
                if ((i & 4) != 0) {
                    uiOptionChainSearchItem = optionsSearchResultItem.uiOptionChainSearchItem;
                }
                return optionsSearchResultItem.copy(str, options, uiOptionChainSearchItem);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchSelectorLaunchMode.Options getOptionsSearchSelectorLaunchMode() {
                return this.optionsSearchSelectorLaunchMode;
            }

            /* renamed from: component3, reason: from getter */
            public final UiOptionChainSearchItem getUiOptionChainSearchItem() {
                return this.uiOptionChainSearchItem;
            }

            public final OptionsSearchResultItem copy(String accountNumber, SearchSelectorLaunchMode.Options optionsSearchSelectorLaunchMode, UiOptionChainSearchItem uiOptionChainSearchItem) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionsSearchSelectorLaunchMode, "optionsSearchSelectorLaunchMode");
                Intrinsics.checkNotNullParameter(uiOptionChainSearchItem, "uiOptionChainSearchItem");
                return new OptionsSearchResultItem(accountNumber, optionsSearchSelectorLaunchMode, uiOptionChainSearchItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OptionsSearchResultItem)) {
                    return false;
                }
                OptionsSearchResultItem optionsSearchResultItem = (OptionsSearchResultItem) other;
                return Intrinsics.areEqual(this.accountNumber, optionsSearchResultItem.accountNumber) && Intrinsics.areEqual(this.optionsSearchSelectorLaunchMode, optionsSearchResultItem.optionsSearchSelectorLaunchMode) && Intrinsics.areEqual(this.uiOptionChainSearchItem, optionsSearchResultItem.uiOptionChainSearchItem);
            }

            public int hashCode() {
                return (((this.accountNumber.hashCode() * 31) + this.optionsSearchSelectorLaunchMode.hashCode()) * 31) + this.uiOptionChainSearchItem.hashCode();
            }

            public String toString() {
                return "OptionsSearchResultItem(accountNumber=" + this.accountNumber + ", optionsSearchSelectorLaunchMode=" + this.optionsSearchSelectorLaunchMode + ", uiOptionChainSearchItem=" + this.uiOptionChainSearchItem + ")";
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SearchSelectorLaunchMode.Options getOptionsSearchSelectorLaunchMode() {
                return this.optionsSearchSelectorLaunchMode;
            }

            public final UiOptionChainSearchItem getUiOptionChainSearchItem() {
                return this.uiOptionChainSearchItem;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionsSearchResultItem(String accountNumber, SearchSelectorLaunchMode.Options optionsSearchSelectorLaunchMode, UiOptionChainSearchItem uiOptionChainSearchItem) {
                super(uiOptionChainSearchItem.getInstrument().getDisplayName(), uiOptionChainSearchItem.getInstrument().getSymbol(), uiOptionChainSearchItem.getInstrument().getId(), null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionsSearchSelectorLaunchMode, "optionsSearchSelectorLaunchMode");
                Intrinsics.checkNotNullParameter(uiOptionChainSearchItem, "uiOptionChainSearchItem");
                this.accountNumber = accountNumber;
                this.optionsSearchSelectorLaunchMode = optionsSearchSelectorLaunchMode;
                this.uiOptionChainSearchItem = uiOptionChainSearchItem;
                this.intentKey = INSTANCE.createOptionChainIntentKey(accountNumber, uiOptionChainSearchItem, optionsSearchSelectorLaunchMode.getOptionChainLaunchMode());
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public OptionChainIntentKey getIntentKey() {
                return this.intentKey;
            }

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$OptionsSearchResultItem$Companion;", "", "<init>", "()V", "createOptionChainIntentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "accountNumber", "", "uiOptionChainSearchItem", "Lcom/robinhood/models/ui/UiOptionChainSearchItem;", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$OptionsSearchResultItem$Companion, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final OptionChainIntentKey createOptionChainIntentKey(String accountNumber, UiOptionChainSearchItem uiOptionChainSearchItem, OptionChainLaunchMode optionChainLaunchMode) {
                    return new OptionChainIntentKey(uiOptionChainSearchItem.getInstrument().getId(), new OptionChainIdLaunchMode.SingleChainId(uiOptionChainSearchItem.getOptionChainId()), optionChainLaunchMode, extensions2.persistentListOf(), null, null, null, false, accountNumber, null, 720, null);
                }
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$IndexOptionsSearchResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "accountNumber", "", "optionsSearchSelectorLaunchMode", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "uiOptionChainSearchItem", "Lcom/robinhood/models/ui/UiIndexOptionChainSearchItem;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;Lcom/robinhood/models/ui/UiIndexOptionChainSearchItem;)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionsSearchSelectorLaunchMode", "()Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "getUiOptionChainSearchItem", "()Lcom/robinhood/models/ui/UiIndexOptionChainSearchItem;", "intentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "getIntentKey", "()Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$IndexOptionsSearchResultItem, reason: from toString */
        public static final /* data */ class IndexOptionsSearchResultItem extends SecurityRow {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String accountNumber;
            private final OptionChainIntentKey intentKey;
            private final SearchSelectorLaunchMode.Options optionsSearchSelectorLaunchMode;
            private final UiIndexOptionChainSearchItem uiOptionChainSearchItem;

            public static /* synthetic */ IndexOptionsSearchResultItem copy$default(IndexOptionsSearchResultItem indexOptionsSearchResultItem, String str, SearchSelectorLaunchMode.Options options, UiIndexOptionChainSearchItem uiIndexOptionChainSearchItem, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = indexOptionsSearchResultItem.accountNumber;
                }
                if ((i & 2) != 0) {
                    options = indexOptionsSearchResultItem.optionsSearchSelectorLaunchMode;
                }
                if ((i & 4) != 0) {
                    uiIndexOptionChainSearchItem = indexOptionsSearchResultItem.uiOptionChainSearchItem;
                }
                return indexOptionsSearchResultItem.copy(str, options, uiIndexOptionChainSearchItem);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchSelectorLaunchMode.Options getOptionsSearchSelectorLaunchMode() {
                return this.optionsSearchSelectorLaunchMode;
            }

            /* renamed from: component3, reason: from getter */
            public final UiIndexOptionChainSearchItem getUiOptionChainSearchItem() {
                return this.uiOptionChainSearchItem;
            }

            public final IndexOptionsSearchResultItem copy(String accountNumber, SearchSelectorLaunchMode.Options optionsSearchSelectorLaunchMode, UiIndexOptionChainSearchItem uiOptionChainSearchItem) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionsSearchSelectorLaunchMode, "optionsSearchSelectorLaunchMode");
                Intrinsics.checkNotNullParameter(uiOptionChainSearchItem, "uiOptionChainSearchItem");
                return new IndexOptionsSearchResultItem(accountNumber, optionsSearchSelectorLaunchMode, uiOptionChainSearchItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IndexOptionsSearchResultItem)) {
                    return false;
                }
                IndexOptionsSearchResultItem indexOptionsSearchResultItem = (IndexOptionsSearchResultItem) other;
                return Intrinsics.areEqual(this.accountNumber, indexOptionsSearchResultItem.accountNumber) && Intrinsics.areEqual(this.optionsSearchSelectorLaunchMode, indexOptionsSearchResultItem.optionsSearchSelectorLaunchMode) && Intrinsics.areEqual(this.uiOptionChainSearchItem, indexOptionsSearchResultItem.uiOptionChainSearchItem);
            }

            public int hashCode() {
                return (((this.accountNumber.hashCode() * 31) + this.optionsSearchSelectorLaunchMode.hashCode()) * 31) + this.uiOptionChainSearchItem.hashCode();
            }

            public String toString() {
                return "IndexOptionsSearchResultItem(accountNumber=" + this.accountNumber + ", optionsSearchSelectorLaunchMode=" + this.optionsSearchSelectorLaunchMode + ", uiOptionChainSearchItem=" + this.uiOptionChainSearchItem + ")";
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SearchSelectorLaunchMode.Options getOptionsSearchSelectorLaunchMode() {
                return this.optionsSearchSelectorLaunchMode;
            }

            public final UiIndexOptionChainSearchItem getUiOptionChainSearchItem() {
                return this.uiOptionChainSearchItem;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IndexOptionsSearchResultItem(String accountNumber, SearchSelectorLaunchMode.Options optionsSearchSelectorLaunchMode, UiIndexOptionChainSearchItem uiOptionChainSearchItem) {
                super(uiOptionChainSearchItem.getIndex().getDisplayName(), uiOptionChainSearchItem.getIndex().getSymbol(), uiOptionChainSearchItem.getIndex().getId(), null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionsSearchSelectorLaunchMode, "optionsSearchSelectorLaunchMode");
                Intrinsics.checkNotNullParameter(uiOptionChainSearchItem, "uiOptionChainSearchItem");
                this.accountNumber = accountNumber;
                this.optionsSearchSelectorLaunchMode = optionsSearchSelectorLaunchMode;
                this.uiOptionChainSearchItem = uiOptionChainSearchItem;
                this.intentKey = INSTANCE.createOptionChainIntentKey(accountNumber, uiOptionChainSearchItem, optionsSearchSelectorLaunchMode.getOptionChainLaunchMode());
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public OptionChainIntentKey getIntentKey() {
                return this.intentKey;
            }

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$IndexOptionsSearchResultItem$Companion;", "", "<init>", "()V", "createOptionChainIntentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "accountNumber", "", "uiOptionChainSearchItem", "Lcom/robinhood/models/ui/UiIndexOptionChainSearchItem;", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$IndexOptionsSearchResultItem$Companion, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final OptionChainIntentKey createOptionChainIntentKey(String accountNumber, UiIndexOptionChainSearchItem uiOptionChainSearchItem, OptionChainLaunchMode optionChainLaunchMode) {
                    return new OptionChainIntentKey(null, new OptionChainIdLaunchMode.MultipleChainIds(uiOptionChainSearchItem.getIndex().getTradableChainIds()), optionChainLaunchMode, extensions2.persistentListOf(), null, null, null, false, accountNumber, null, 720, null);
                }
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$AdvancedChartResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "instrument", "Lcom/robinhood/models/db/Instrument;", "backToStockDetailPage", "", "<init>", "(Lcom/robinhood/models/db/Instrument;Z)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getBackToStockDetailPage", "()Z", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$AdvancedChartResultItem, reason: from toString */
        public static final /* data */ class AdvancedChartResultItem extends SecurityRow {
            private final boolean backToStockDetailPage;
            private final Instrument instrument;
            private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

            public static /* synthetic */ AdvancedChartResultItem copy$default(AdvancedChartResultItem advancedChartResultItem, Instrument instrument, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = advancedChartResultItem.instrument;
                }
                if ((i & 2) != 0) {
                    z = advancedChartResultItem.backToStockDetailPage;
                }
                return advancedChartResultItem.copy(instrument, z);
            }

            /* renamed from: component1, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getBackToStockDetailPage() {
                return this.backToStockDetailPage;
            }

            public final AdvancedChartResultItem copy(Instrument instrument, boolean backToStockDetailPage) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return new AdvancedChartResultItem(instrument, backToStockDetailPage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdvancedChartResultItem)) {
                    return false;
                }
                AdvancedChartResultItem advancedChartResultItem = (AdvancedChartResultItem) other;
                return Intrinsics.areEqual(this.instrument, advancedChartResultItem.instrument) && this.backToStockDetailPage == advancedChartResultItem.backToStockDetailPage;
            }

            public int hashCode() {
                return (this.instrument.hashCode() * 31) + Boolean.hashCode(this.backToStockDetailPage);
            }

            public String toString() {
                return "AdvancedChartResultItem(instrument=" + this.instrument + ", backToStockDetailPage=" + this.backToStockDetailPage + ")";
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final boolean getBackToStockDetailPage() {
                return this.backToStockDetailPage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdvancedChartResultItem(Instrument instrument, boolean z) {
                super(instrument.getDisplayName(), instrument.getSymbol(), instrument.getId(), null);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.instrument = instrument;
                this.backToStockDetailPage = z;
                this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new AdvancedChartFragmentKey(instrument.getId(), instrument, null, z, null, null, 52, null), false, 2, null);
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                return this.intentKey;
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$TradingTrendsChartResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$TradingTrendsChartResultItem, reason: from toString */
        public static final /* data */ class TradingTrendsChartResultItem extends SecurityRow {
            private final Instrument instrument;
            private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

            public static /* synthetic */ TradingTrendsChartResultItem copy$default(TradingTrendsChartResultItem tradingTrendsChartResultItem, Instrument instrument, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = tradingTrendsChartResultItem.instrument;
                }
                return tradingTrendsChartResultItem.copy(instrument);
            }

            /* renamed from: component1, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final TradingTrendsChartResultItem copy(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return new TradingTrendsChartResultItem(instrument);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TradingTrendsChartResultItem) && Intrinsics.areEqual(this.instrument, ((TradingTrendsChartResultItem) other).instrument);
            }

            public int hashCode() {
                return this.instrument.hashCode();
            }

            public String toString() {
                return "TradingTrendsChartResultItem(instrument=" + this.instrument + ")";
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TradingTrendsChartResultItem(Instrument instrument) {
                super(instrument.getDisplayName(), instrument.getSymbol(), instrument.getId(), null);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.instrument = instrument;
                this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.TRADING_TRENDS_ONBOARDING, false, 22, null), false, 2, null);
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                return this.intentKey;
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$CompanyFinancialsResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$CompanyFinancialsResultItem, reason: from toString */
        public static final /* data */ class CompanyFinancialsResultItem extends SecurityRow {
            private final Instrument instrument;
            private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

            public static /* synthetic */ CompanyFinancialsResultItem copy$default(CompanyFinancialsResultItem companyFinancialsResultItem, Instrument instrument, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = companyFinancialsResultItem.instrument;
                }
                return companyFinancialsResultItem.copy(instrument);
            }

            /* renamed from: component1, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final CompanyFinancialsResultItem copy(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return new CompanyFinancialsResultItem(instrument);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompanyFinancialsResultItem) && Intrinsics.areEqual(this.instrument, ((CompanyFinancialsResultItem) other).instrument);
            }

            public int hashCode() {
                return this.instrument.hashCode();
            }

            public String toString() {
                return "CompanyFinancialsResultItem(instrument=" + this.instrument + ")";
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompanyFinancialsResultItem(Instrument instrument) {
                super(instrument.getDisplayName(), instrument.getSymbol(), instrument.getId(), null);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.instrument = instrument;
                this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.COMPANY_FINANCIALS_ONBOARDING, false, 22, null), false, 2, null);
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                return this.intentKey;
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$LadderChartResultItem;", "", "Equity", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$LadderChartResultItem$Equity;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$LadderChartResultItem */
        public interface LadderChartResultItem {

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$LadderChartResultItem$Equity;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$LadderChartResultItem;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "intentKey", "Lcom/robinhood/android/equities/contracts/tradeladder/TradeLadderContract;", "getIntentKey", "()Lcom/robinhood/android/equities/contracts/tradeladder/TradeLadderContract;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$LadderChartResultItem$Equity, reason: from toString */
            public static final /* data */ class Equity extends SecurityRow implements LadderChartResultItem {
                private final Instrument instrument;
                private final TradeLadderContract intentKey;

                public static /* synthetic */ Equity copy$default(Equity equity, Instrument instrument, int i, Object obj) {
                    if ((i & 1) != 0) {
                        instrument = equity.instrument;
                    }
                    return equity.copy(instrument);
                }

                /* renamed from: component1, reason: from getter */
                public final Instrument getInstrument() {
                    return this.instrument;
                }

                public final Equity copy(Instrument instrument) {
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    return new Equity(instrument);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Equity) && Intrinsics.areEqual(this.instrument, ((Equity) other).instrument);
                }

                public int hashCode() {
                    return this.instrument.hashCode();
                }

                public String toString() {
                    return "Equity(instrument=" + this.instrument + ")";
                }

                public final Instrument getInstrument() {
                    return this.instrument;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Equity(Instrument instrument) {
                    super(instrument.getDisplayName(), instrument.getDisplaySymbol(), instrument.getId(), null);
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    this.instrument = instrument;
                    String string2 = instrument.getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    this.intentKey = new TradeLadderContract(string2, "marketing", true);
                }

                @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
                public TradeLadderContract getIntentKey() {
                    return this.intentKey;
                }
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem;", "", "Equity", "Crypto", "FuturesContractItem", "FuturesProductItem", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$Crypto;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$Equity;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesContractItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesProductItem;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$BwAdvanceChartResultItem */
        public interface BwAdvanceChartResultItem {

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$Equity;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$BwAdvanceChartResultItem$Equity, reason: from toString */
            public static final /* data */ class Equity extends SecurityRow implements BwAdvanceChartResultItem {
                private final Instrument instrument;
                private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

                public static /* synthetic */ Equity copy$default(Equity equity, Instrument instrument, int i, Object obj) {
                    if ((i & 1) != 0) {
                        instrument = equity.instrument;
                    }
                    return equity.copy(instrument);
                }

                /* renamed from: component1, reason: from getter */
                public final Instrument getInstrument() {
                    return this.instrument;
                }

                public final Equity copy(Instrument instrument) {
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    return new Equity(instrument);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Equity) && Intrinsics.areEqual(this.instrument, ((Equity) other).instrument);
                }

                public int hashCode() {
                    return this.instrument.hashCode();
                }

                public String toString() {
                    return "Equity(instrument=" + this.instrument + ")";
                }

                public final Instrument getInstrument() {
                    return this.instrument;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Equity(Instrument instrument) {
                    super(instrument.getDisplayName(), instrument.getDisplaySymbol(), instrument.getId(), null);
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    this.instrument = instrument;
                    this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.ADVANCED_CHART, false, 22, null), false, 2, null);
                }

                @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
                public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                    return this.intentKey;
                }
            }

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$Crypto;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$BwAdvanceChartResultItem$Crypto, reason: from toString */
            public static final /* data */ class Crypto extends SecurityRow implements BwAdvanceChartResultItem {
                private final UiCurrencyPair currencyPair;
                private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

                public static /* synthetic */ Crypto copy$default(Crypto crypto2, UiCurrencyPair uiCurrencyPair, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uiCurrencyPair = crypto2.currencyPair;
                    }
                    return crypto2.copy(uiCurrencyPair);
                }

                /* renamed from: component1, reason: from getter */
                public final UiCurrencyPair getCurrencyPair() {
                    return this.currencyPair;
                }

                public final Crypto copy(UiCurrencyPair currencyPair) {
                    Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                    return new Crypto(currencyPair);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Crypto) && Intrinsics.areEqual(this.currencyPair, ((Crypto) other).currencyPair);
                }

                public int hashCode() {
                    return this.currencyPair.hashCode();
                }

                public String toString() {
                    return "Crypto(currencyPair=" + this.currencyPair + ")";
                }

                public final UiCurrencyPair getCurrencyPair() {
                    return this.currencyPair;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Crypto(UiCurrencyPair currencyPair) {
                    super(currencyPair.getDisplayName(), currencyPair.getDisplaySymbol(), currencyPair.getId(), null);
                    Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                    this.currencyPair = currencyPair;
                    this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(currencyPair.getId(), null, null, InstrumentDetailSource.ADVANCED_CHART, false, 22, null), false, 2, null);
                }

                @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
                public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                    return this.intentKey;
                }
            }

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesContractItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem;", "futuresContract", "Lcom/robinhood/android/models/futures/api/bonfire/ApiFuturesContractSearchItem;", "<init>", "(Lcom/robinhood/android/models/futures/api/bonfire/ApiFuturesContractSearchItem;)V", "getFuturesContract", "()Lcom/robinhood/android/models/futures/api/bonfire/ApiFuturesContractSearchItem;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesContractItem, reason: from toString */
            public static final /* data */ class FuturesContractItem extends SecurityRow implements BwAdvanceChartResultItem {
                private final ApiFuturesContractSearchItem futuresContract;
                private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

                public static /* synthetic */ FuturesContractItem copy$default(FuturesContractItem futuresContractItem, ApiFuturesContractSearchItem apiFuturesContractSearchItem, int i, Object obj) {
                    if ((i & 1) != 0) {
                        apiFuturesContractSearchItem = futuresContractItem.futuresContract;
                    }
                    return futuresContractItem.copy(apiFuturesContractSearchItem);
                }

                /* renamed from: component1, reason: from getter */
                public final ApiFuturesContractSearchItem getFuturesContract() {
                    return this.futuresContract;
                }

                public final FuturesContractItem copy(ApiFuturesContractSearchItem futuresContract) {
                    Intrinsics.checkNotNullParameter(futuresContract, "futuresContract");
                    return new FuturesContractItem(futuresContract);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof FuturesContractItem) && Intrinsics.areEqual(this.futuresContract, ((FuturesContractItem) other).futuresContract);
                }

                public int hashCode() {
                    return this.futuresContract.hashCode();
                }

                public String toString() {
                    return "FuturesContractItem(futuresContract=" + this.futuresContract + ")";
                }

                public final ApiFuturesContractSearchItem getFuturesContract() {
                    return this.futuresContract;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FuturesContractItem(ApiFuturesContractSearchItem futuresContract) {
                    super(futuresContract.getDisplayName(), futuresContract.getDisplaySymbol(), futuresContract.getId(), null);
                    Intrinsics.checkNotNullParameter(futuresContract, "futuresContract");
                    this.futuresContract = futuresContract;
                    this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(futuresContract.getId(), null, null, InstrumentDetailSource.ADVANCED_CHART, false, 22, null), false, 2, null);
                }

                @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
                public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                    return this.intentKey;
                }
            }

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesProductItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$BwAdvanceChartResultItem;", "futuresProduct", "Lcom/robinhood/android/models/futures/api/bonfire/ApiFuturesProductSearchItem;", "<init>", "(Lcom/robinhood/android/models/futures/api/bonfire/ApiFuturesProductSearchItem;)V", "getFuturesProduct", "()Lcom/robinhood/android/models/futures/api/bonfire/ApiFuturesProductSearchItem;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$BwAdvanceChartResultItem$FuturesProductItem, reason: from toString */
            public static final /* data */ class FuturesProductItem extends SecurityRow implements BwAdvanceChartResultItem {
                private final ApiFuturesProductSearchItem futuresProduct;
                private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;

                public static /* synthetic */ FuturesProductItem copy$default(FuturesProductItem futuresProductItem, ApiFuturesProductSearchItem apiFuturesProductSearchItem, int i, Object obj) {
                    if ((i & 1) != 0) {
                        apiFuturesProductSearchItem = futuresProductItem.futuresProduct;
                    }
                    return futuresProductItem.copy(apiFuturesProductSearchItem);
                }

                /* renamed from: component1, reason: from getter */
                public final ApiFuturesProductSearchItem getFuturesProduct() {
                    return this.futuresProduct;
                }

                public final FuturesProductItem copy(ApiFuturesProductSearchItem futuresProduct) {
                    Intrinsics.checkNotNullParameter(futuresProduct, "futuresProduct");
                    return new FuturesProductItem(futuresProduct);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof FuturesProductItem) && Intrinsics.areEqual(this.futuresProduct, ((FuturesProductItem) other).futuresProduct);
                }

                public int hashCode() {
                    return this.futuresProduct.hashCode();
                }

                public String toString() {
                    return "FuturesProductItem(futuresProduct=" + this.futuresProduct + ")";
                }

                public final ApiFuturesProductSearchItem getFuturesProduct() {
                    return this.futuresProduct;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FuturesProductItem(ApiFuturesProductSearchItem futuresProduct) {
                    super(futuresProduct.getDisplayName(), futuresProduct.getDisplaySymbol(), futuresProduct.getId(), null);
                    Intrinsics.checkNotNullParameter(futuresProduct, "futuresProduct");
                    this.futuresProduct = futuresProduct;
                    this.intentKey = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(futuresProduct.getId(), null, null, InstrumentDetailSource.ADVANCED_CHART, false, 22, null), false, 2, null);
                }

                @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
                public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                    return this.intentKey;
                }
            }
        }

        /* compiled from: SearchSelectorViewState.kt */
        @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$CopilotResultItem;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "copilotPopularInstrument", "Lcom/robinhood/android/cortex/models/asset/AssetDigestPopularInstruments$Item;", "<init>", "(Lcom/robinhood/android/cortex/models/asset/AssetDigestPopularInstruments$Item;)V", "instrument", "Lcom/robinhood/models/db/Instrument;", "(Lcom/robinhood/models/db/Instrument;)V", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "type", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "getType", "()Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "intentKey", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "curatedListChipItem", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "getCuratedListChipItem", "()Lcom/robinhood/android/common/ui/CuratedListChipItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$CopilotResultItem, reason: from toString */
        public static final /* data */ class CopilotResultItem extends SecurityRow {
            private final AssetDigestPopularInstruments.Item copilotPopularInstrument;
            private final HostIntentKey.ShowFragmentInStandaloneActivity intentKey;
            private final AssetType3 type;

            /* compiled from: SearchSelectorViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.selector.SearchItem$SecurityRow$CopilotResultItem$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AssetType3.values().length];
                    try {
                        iArr[AssetType3.STOCKS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AssetType3.CRYPTO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* renamed from: component1, reason: from getter */
            private final AssetDigestPopularInstruments.Item getCopilotPopularInstrument() {
                return this.copilotPopularInstrument;
            }

            public static /* synthetic */ CopilotResultItem copy$default(CopilotResultItem copilotResultItem, AssetDigestPopularInstruments.Item item, int i, Object obj) {
                if ((i & 1) != 0) {
                    item = copilotResultItem.copilotPopularInstrument;
                }
                return copilotResultItem.copy(item);
            }

            public final CopilotResultItem copy(AssetDigestPopularInstruments.Item copilotPopularInstrument) {
                Intrinsics.checkNotNullParameter(copilotPopularInstrument, "copilotPopularInstrument");
                return new CopilotResultItem(copilotPopularInstrument);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CopilotResultItem) && Intrinsics.areEqual(this.copilotPopularInstrument, ((CopilotResultItem) other).copilotPopularInstrument);
            }

            public int hashCode() {
                return this.copilotPopularInstrument.hashCode();
            }

            public String toString() {
                return "CopilotResultItem(copilotPopularInstrument=" + this.copilotPopularInstrument + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CopilotResultItem(AssetDigestPopularInstruments.Item copilotPopularInstrument) {
                HostIntentKey.ShowFragmentInStandaloneActivity showFragmentInStandaloneActivity;
                super(copilotPopularInstrument.getDisplayName(), copilotPopularInstrument.getSymbol(), copilotPopularInstrument.getInstrumentId(), null);
                Intrinsics.checkNotNullParameter(copilotPopularInstrument, "copilotPopularInstrument");
                this.copilotPopularInstrument = copilotPopularInstrument;
                this.type = copilotPopularInstrument.getType();
                int i = WhenMappings.$EnumSwitchMapping$0[copilotPopularInstrument.getType().ordinal()];
                if (i == 1) {
                    showFragmentInStandaloneActivity = new HostIntentKey.ShowFragmentInStandaloneActivity(new LegacyFragmentKey.EquityInstrumentDetail(copilotPopularInstrument.getInstrumentId(), null, null, InstrumentDetailSource.COPILOT_DIGEST_ONBOARDING, false, 22, null), false, 2, null);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showFragmentInStandaloneActivity = new HostIntentKey.ShowFragmentInStandaloneActivity(new CryptoDetailFragmentKey(copilotPopularInstrument.getInstrumentId(), null, false, null, null, null, 62, null), false, 2, null);
                }
                this.intentKey = showFragmentInStandaloneActivity;
            }

            public final AssetType3 getType() {
                return this.type;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public CopilotResultItem(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                String displayName = instrument.getDisplayName();
                String symbol = instrument.getSymbol();
                this(new AssetDigestPopularInstruments.Item(AssetType3.STOCKS, instrument.getId(), symbol, displayName));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public CopilotResultItem(UiCurrencyPair currencyPair) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                String displayName = currencyPair.getDisplayName();
                String symbol = currencyPair.getSymbol();
                this(new AssetDigestPopularInstruments.Item(AssetType3.CRYPTO, currencyPair.getId(), symbol, displayName));
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public HostIntentKey.ShowFragmentInStandaloneActivity getIntentKey() {
                return this.intentKey;
            }

            @Override // com.robinhood.android.search.selector.SearchSelectorViewState3.SecurityRow
            public CuratedListChipItem getCuratedListChipItem() {
                Integer numValueOf;
                UUID id = getId();
                String symbol = getSymbol();
                ApiCuratedList.OwnerType ownerType = ApiCuratedList.OwnerType.UNKNOWN;
                int i = WhenMappings.$EnumSwitchMapping$0[this.copilotPopularInstrument.getType().ordinal()];
                if (i == 1) {
                    numValueOf = null;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(C20690R.drawable.ic_rds_crypto_c_16dp);
                }
                return new CuratedListChipItem(id, symbol, ownerType, null, numValueOf, null, null, true, false, null, false, 1384, null);
            }
        }
    }
}
