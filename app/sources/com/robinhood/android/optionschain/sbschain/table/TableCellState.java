package com.robinhood.android.optionschain.sbschain.table;

import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0019\b\u0004\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableCellState;", "", "content", "Lkotlin/Lazy;", "", "<init>", "(Lkotlin/Lazy;)V", "getContent", "()Lkotlin/Lazy;", "Text", "BidAsk", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$Text;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class TableCellState {
    public static final int $stable = 8;
    private final Lazy<String> content;

    public /* synthetic */ TableCellState(Lazy lazy, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazy);
    }

    private TableCellState(Lazy<String> lazy) {
        this.content = lazy;
    }

    public Lazy<String> getContent() {
        return this.content;
    }

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$Text;", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState;", ResourceTypes.STYLE, "Lcom/robinhood/android/optionschain/sbschain/table/TableCellTextStyle;", "isEnabled", "", "loadingStyle", "Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "content", "Lkotlin/Lazy;", "", "<init>", "(Lcom/robinhood/android/optionschain/sbschain/table/TableCellTextStyle;ZLcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;Lkotlin/Lazy;)V", "getStyle", "()Lcom/robinhood/android/optionschain/sbschain/table/TableCellTextStyle;", "()Z", "getLoadingStyle", "()Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "getContent", "()Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Text extends TableCellState {
        public static final int $stable = 8;
        private final Lazy<String> content;
        private final boolean isEnabled;
        private final LoadingStyle loadingStyle;
        private final TableCellTextStyle style;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Text copy$default(Text text, TableCellTextStyle tableCellTextStyle, boolean z, LoadingStyle loadingStyle, Lazy lazy, int i, Object obj) {
            if ((i & 1) != 0) {
                tableCellTextStyle = text.style;
            }
            if ((i & 2) != 0) {
                z = text.isEnabled;
            }
            if ((i & 4) != 0) {
                loadingStyle = text.loadingStyle;
            }
            if ((i & 8) != 0) {
                lazy = text.content;
            }
            return text.copy(tableCellTextStyle, z, loadingStyle, lazy);
        }

        /* renamed from: component1, reason: from getter */
        public final TableCellTextStyle getStyle() {
            return this.style;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final LoadingStyle getLoadingStyle() {
            return this.loadingStyle;
        }

        public final Lazy<String> component4() {
            return this.content;
        }

        public final Text copy(TableCellTextStyle style, boolean isEnabled, LoadingStyle loadingStyle, Lazy<String> content) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Text(style, isEnabled, loadingStyle, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return this.style == text.style && this.isEnabled == text.isEnabled && this.loadingStyle == text.loadingStyle && Intrinsics.areEqual(this.content, text.content);
        }

        public int hashCode() {
            return (((((this.style.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.loadingStyle.hashCode()) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Text(style=" + this.style + ", isEnabled=" + this.isEnabled + ", loadingStyle=" + this.loadingStyle + ", content=" + this.content + ")";
        }

        public final TableCellTextStyle getStyle() {
            return this.style;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public /* synthetic */ Text(TableCellTextStyle tableCellTextStyle, boolean z, LoadingStyle loadingStyle, Lazy lazy, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(tableCellTextStyle, (i & 2) != 0 ? true : z, (i & 4) != 0 ? LoadingStyle.NONE : loadingStyle, lazy);
        }

        public final LoadingStyle getLoadingStyle() {
            return this.loadingStyle;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.TableCellState
        public Lazy<String> getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(TableCellTextStyle style, boolean z, LoadingStyle loadingStyle, Lazy<String> content) {
            super(content, null);
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
            Intrinsics.checkNotNullParameter(content, "content");
            this.style = style;
            this.isEnabled = z;
            this.loadingStyle = loadingStyle;
            this.content = content;
        }
    }

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010HÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState;", "isBid", "", "isSelected", "loadingStyle", "Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "disableType", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "positionIndicator", "", "watchlistIndicator", "showHighlight", "legBundleWithRowIndex", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "content", "Lkotlin/Lazy;", "<init>", "(ZZLcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;Ljava/lang/String;ZZLcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;Lkotlin/Lazy;)V", "()Z", "getLoadingStyle", "()Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "getDisableType", "()Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "getPositionIndicator", "()Ljava/lang/String;", "getWatchlistIndicator", "getShowHighlight", "getLegBundleWithRowIndex", "()Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "getContent", "()Lkotlin/Lazy;", "isEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BidAsk extends TableCellState {
        public static final int $stable = 8;
        private final Lazy<String> content;
        private final BidAskCellDisableType disableType;
        private final boolean isBid;
        private final boolean isEnabled;
        private final boolean isSelected;
        private final OptionLegBundleWithRowIndex legBundleWithRowIndex;
        private final LoadingStyle loadingStyle;
        private final String positionIndicator;
        private final boolean showHighlight;
        private final boolean watchlistIndicator;

        /* compiled from: OptionSideBySideChainTableViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BidAskCellDisableType.values().length];
                try {
                    iArr[BidAskCellDisableType.PCO_NO_WATCHLIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BidAskCellDisableType.OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BidAskCellDisableType.CONTRACT_PCO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ BidAsk copy$default(BidAsk bidAsk, boolean z, boolean z2, LoadingStyle loadingStyle, BidAskCellDisableType bidAskCellDisableType, String str, boolean z3, boolean z4, OptionLegBundleWithRowIndex optionLegBundleWithRowIndex, Lazy lazy, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bidAsk.isBid;
            }
            if ((i & 2) != 0) {
                z2 = bidAsk.isSelected;
            }
            if ((i & 4) != 0) {
                loadingStyle = bidAsk.loadingStyle;
            }
            if ((i & 8) != 0) {
                bidAskCellDisableType = bidAsk.disableType;
            }
            if ((i & 16) != 0) {
                str = bidAsk.positionIndicator;
            }
            if ((i & 32) != 0) {
                z3 = bidAsk.watchlistIndicator;
            }
            if ((i & 64) != 0) {
                z4 = bidAsk.showHighlight;
            }
            if ((i & 128) != 0) {
                optionLegBundleWithRowIndex = bidAsk.legBundleWithRowIndex;
            }
            if ((i & 256) != 0) {
                lazy = bidAsk.content;
            }
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex2 = optionLegBundleWithRowIndex;
            Lazy lazy2 = lazy;
            boolean z5 = z3;
            boolean z6 = z4;
            String str2 = str;
            LoadingStyle loadingStyle2 = loadingStyle;
            return bidAsk.copy(z, z2, loadingStyle2, bidAskCellDisableType, str2, z5, z6, optionLegBundleWithRowIndex2, lazy2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsBid() {
            return this.isBid;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component3, reason: from getter */
        public final LoadingStyle getLoadingStyle() {
            return this.loadingStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final BidAskCellDisableType getDisableType() {
            return this.disableType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPositionIndicator() {
            return this.positionIndicator;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getWatchlistIndicator() {
            return this.watchlistIndicator;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowHighlight() {
            return this.showHighlight;
        }

        /* renamed from: component8, reason: from getter */
        public final OptionLegBundleWithRowIndex getLegBundleWithRowIndex() {
            return this.legBundleWithRowIndex;
        }

        public final Lazy<String> component9() {
            return this.content;
        }

        public final BidAsk copy(boolean isBid, boolean isSelected, LoadingStyle loadingStyle, BidAskCellDisableType disableType, String positionIndicator, boolean watchlistIndicator, boolean showHighlight, OptionLegBundleWithRowIndex legBundleWithRowIndex, Lazy<String> content) {
            Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
            Intrinsics.checkNotNullParameter(content, "content");
            return new BidAsk(isBid, isSelected, loadingStyle, disableType, positionIndicator, watchlistIndicator, showHighlight, legBundleWithRowIndex, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidAsk)) {
                return false;
            }
            BidAsk bidAsk = (BidAsk) other;
            return this.isBid == bidAsk.isBid && this.isSelected == bidAsk.isSelected && this.loadingStyle == bidAsk.loadingStyle && this.disableType == bidAsk.disableType && Intrinsics.areEqual(this.positionIndicator, bidAsk.positionIndicator) && this.watchlistIndicator == bidAsk.watchlistIndicator && this.showHighlight == bidAsk.showHighlight && Intrinsics.areEqual(this.legBundleWithRowIndex, bidAsk.legBundleWithRowIndex) && Intrinsics.areEqual(this.content, bidAsk.content);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isBid) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.loadingStyle.hashCode()) * 31;
            BidAskCellDisableType bidAskCellDisableType = this.disableType;
            int iHashCode2 = (iHashCode + (bidAskCellDisableType == null ? 0 : bidAskCellDisableType.hashCode())) * 31;
            String str = this.positionIndicator;
            int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.watchlistIndicator)) * 31) + Boolean.hashCode(this.showHighlight)) * 31;
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = this.legBundleWithRowIndex;
            return ((iHashCode3 + (optionLegBundleWithRowIndex != null ? optionLegBundleWithRowIndex.hashCode() : 0)) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "BidAsk(isBid=" + this.isBid + ", isSelected=" + this.isSelected + ", loadingStyle=" + this.loadingStyle + ", disableType=" + this.disableType + ", positionIndicator=" + this.positionIndicator + ", watchlistIndicator=" + this.watchlistIndicator + ", showHighlight=" + this.showHighlight + ", legBundleWithRowIndex=" + this.legBundleWithRowIndex + ", content=" + this.content + ")";
        }

        public final boolean isBid() {
            return this.isBid;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public /* synthetic */ BidAsk(boolean z, boolean z2, LoadingStyle loadingStyle, BidAskCellDisableType bidAskCellDisableType, String str, boolean z3, boolean z4, OptionLegBundleWithRowIndex optionLegBundleWithRowIndex, Lazy lazy, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, (i & 4) != 0 ? LoadingStyle.NONE : loadingStyle, bidAskCellDisableType, str, z3, (i & 64) != 0 ? false : z4, optionLegBundleWithRowIndex, lazy);
        }

        public final LoadingStyle getLoadingStyle() {
            return this.loadingStyle;
        }

        public final BidAskCellDisableType getDisableType() {
            return this.disableType;
        }

        public final String getPositionIndicator() {
            return this.positionIndicator;
        }

        public final boolean getWatchlistIndicator() {
            return this.watchlistIndicator;
        }

        public final boolean getShowHighlight() {
            return this.showHighlight;
        }

        public final OptionLegBundleWithRowIndex getLegBundleWithRowIndex() {
            return this.legBundleWithRowIndex;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.TableCellState
        public Lazy<String> getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BidAsk(boolean z, boolean z2, LoadingStyle loadingStyle, BidAskCellDisableType bidAskCellDisableType, String str, boolean z3, boolean z4, OptionLegBundleWithRowIndex optionLegBundleWithRowIndex, Lazy<String> content) {
            super(content, null);
            Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
            Intrinsics.checkNotNullParameter(content, "content");
            this.isBid = z;
            this.isSelected = z2;
            this.loadingStyle = loadingStyle;
            this.disableType = bidAskCellDisableType;
            this.positionIndicator = str;
            this.watchlistIndicator = z3;
            this.showHighlight = z4;
            this.legBundleWithRowIndex = optionLegBundleWithRowIndex;
            this.content = content;
            int i = bidAskCellDisableType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bidAskCellDisableType.ordinal()];
            boolean z5 = true;
            if (i != -1) {
                if (i == 1 || i == 2) {
                    z5 = false;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.isEnabled = z5;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }
}
