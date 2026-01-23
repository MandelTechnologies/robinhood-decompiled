package com.robinhood.android.optionschain.sbschain.table;

import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "", "<init>", "()V", "key", "", "getKey", "()I", "Header", "InstrumentRow", "UnderlyingQuoteRow", "DisclosureRow", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$DisclosureRow;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$InstrumentRow;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$UnderlyingQuoteRow;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class TableRowState {
    public static final int $stable = 0;

    public /* synthetic */ TableRowState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getKey();

    private TableRowState() {
    }

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J#\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$Header;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "Lcom/robinhood/android/optionschain/sbschain/table/TwoSidedScrollableRow;", "metrics", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "bidAskPriceLabelType", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;)V", "getMetrics", "()Lkotlinx/collections/immutable/ImmutableList;", "getBidAskPriceLabelType", "()Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "key", "", "getKey", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Header extends TableRowState implements TwoSidedScrollableRow {
        public static final int $stable = 0;
        private final OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType;
        private final int key;
        private final ImmutableList<OptionSideBySideChainMetric> metrics;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Header copy$default(Header header, ImmutableList immutableList, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = header.metrics;
            }
            if ((i & 2) != 0) {
                optionChainSettingsSideBySideBidAskPriceLabelType = header.bidAskPriceLabelType;
            }
            return header.copy(immutableList, optionChainSettingsSideBySideBidAskPriceLabelType);
        }

        public final ImmutableList<OptionSideBySideChainMetric> component1() {
            return this.metrics;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionChainSettingsSideBySideBidAskPriceLabelType getBidAskPriceLabelType() {
            return this.bidAskPriceLabelType;
        }

        public final Header copy(ImmutableList<? extends OptionSideBySideChainMetric> metrics, OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType) {
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            Intrinsics.checkNotNullParameter(bidAskPriceLabelType, "bidAskPriceLabelType");
            return new Header(metrics, bidAskPriceLabelType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(this.metrics, header.metrics) && this.bidAskPriceLabelType == header.bidAskPriceLabelType;
        }

        public int hashCode() {
            return (this.metrics.hashCode() * 31) + this.bidAskPriceLabelType.hashCode();
        }

        public String toString() {
            return "Header(metrics=" + this.metrics + ", bidAskPriceLabelType=" + this.bidAskPriceLabelType + ")";
        }

        public final ImmutableList<OptionSideBySideChainMetric> getMetrics() {
            return this.metrics;
        }

        public final OptionChainSettingsSideBySideBidAskPriceLabelType getBidAskPriceLabelType() {
            return this.bidAskPriceLabelType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Header(ImmutableList<? extends OptionSideBySideChainMetric> metrics, OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType) {
            super(null);
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            Intrinsics.checkNotNullParameter(bidAskPriceLabelType, "bidAskPriceLabelType");
            this.metrics = metrics;
            this.bidAskPriceLabelType = bidAskPriceLabelType;
            this.key = -1;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.TableRowState
        public int getKey() {
            return this.key;
        }
    }

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f\u0012\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\fHÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\fHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\t\u0010K\u001a\u00020\u0015HÆ\u0003J\t\u0010L\u001a\u00020\u0017HÆ\u0003J\t\u0010M\u001a\u00020\u0017HÆ\u0003J·\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001J\u0013\u0010O\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0015HÖ\u0001J\t\u0010S\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002030\f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$InstrumentRow;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "Lcom/robinhood/android/optionschain/sbschain/table/TwoSidedScrollableRow;", "callBidCell", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "callAskCell", "putBidCell", "putAskCell", "stickyCellStr", "Lkotlin/Lazy;", "", "callMetrics", "", "putMetrics", "rowEnabled", "", "loadingStyle", "Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "showTopHorizontalDivider", "showBottomHorizontalDivider", "rowIndex", "", "selectedLegIndicatorOnCallRow", "Lcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;", "selectedLegIndicatorOnPutRow", "<init>", "(Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;Lkotlin/Lazy;Ljava/util/List;Ljava/util/List;ZLcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;ZZILcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;Lcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;)V", "getCallBidCell", "()Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "getCallAskCell", "getPutBidCell", "getPutAskCell", "getStickyCellStr", "()Lkotlin/Lazy;", "getCallMetrics", "()Ljava/util/List;", "getPutMetrics", "getRowEnabled", "()Z", "getLoadingStyle", "()Lcom/robinhood/android/optionschain/sbschain/table/LoadingStyle;", "getShowTopHorizontalDivider", "getShowBottomHorizontalDivider", "getRowIndex", "()I", "getSelectedLegIndicatorOnCallRow", "()Lcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;", "getSelectedLegIndicatorOnPutRow", "key", "getKey", "callCells", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState;", "getCallCells", "putCells", "getPutCells", "stickyCell", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$Text;", "getStickyCell", "()Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$Text;", "getBidAskCell", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "side", "Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class InstrumentRow extends TableRowState implements TwoSidedScrollableRow {
        public static final int $stable = 8;
        private final TableCellState.BidAsk callAskCell;
        private final TableCellState.BidAsk callBidCell;
        private final List<TableCellState> callCells;
        private final List<Lazy<String>> callMetrics;
        private final int key;
        private final LoadingStyle loadingStyle;
        private final TableCellState.BidAsk putAskCell;
        private final TableCellState.BidAsk putBidCell;
        private final List<TableCellState> putCells;
        private final List<Lazy<String>> putMetrics;
        private final boolean rowEnabled;
        private final int rowIndex;
        private final SelectedLegIndicator selectedLegIndicatorOnCallRow;
        private final SelectedLegIndicator selectedLegIndicatorOnPutRow;
        private final boolean showBottomHorizontalDivider;
        private final boolean showTopHorizontalDivider;
        private final TableCellState.Text stickyCell;
        private final Lazy<String> stickyCellStr;

        /* renamed from: component1, reason: from getter */
        public final TableCellState.BidAsk getCallBidCell() {
            return this.callBidCell;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowTopHorizontalDivider() {
            return this.showTopHorizontalDivider;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getShowBottomHorizontalDivider() {
            return this.showBottomHorizontalDivider;
        }

        /* renamed from: component12, reason: from getter */
        public final int getRowIndex() {
            return this.rowIndex;
        }

        /* renamed from: component13, reason: from getter */
        public final SelectedLegIndicator getSelectedLegIndicatorOnCallRow() {
            return this.selectedLegIndicatorOnCallRow;
        }

        /* renamed from: component14, reason: from getter */
        public final SelectedLegIndicator getSelectedLegIndicatorOnPutRow() {
            return this.selectedLegIndicatorOnPutRow;
        }

        /* renamed from: component2, reason: from getter */
        public final TableCellState.BidAsk getCallAskCell() {
            return this.callAskCell;
        }

        /* renamed from: component3, reason: from getter */
        public final TableCellState.BidAsk getPutBidCell() {
            return this.putBidCell;
        }

        /* renamed from: component4, reason: from getter */
        public final TableCellState.BidAsk getPutAskCell() {
            return this.putAskCell;
        }

        public final Lazy<String> component5() {
            return this.stickyCellStr;
        }

        public final List<Lazy<String>> component6() {
            return this.callMetrics;
        }

        public final List<Lazy<String>> component7() {
            return this.putMetrics;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getRowEnabled() {
            return this.rowEnabled;
        }

        /* renamed from: component9, reason: from getter */
        public final LoadingStyle getLoadingStyle() {
            return this.loadingStyle;
        }

        public final InstrumentRow copy(TableCellState.BidAsk callBidCell, TableCellState.BidAsk callAskCell, TableCellState.BidAsk putBidCell, TableCellState.BidAsk putAskCell, Lazy<String> stickyCellStr, List<? extends Lazy<String>> callMetrics, List<? extends Lazy<String>> putMetrics, boolean rowEnabled, LoadingStyle loadingStyle, boolean showTopHorizontalDivider, boolean showBottomHorizontalDivider, int rowIndex, SelectedLegIndicator selectedLegIndicatorOnCallRow, SelectedLegIndicator selectedLegIndicatorOnPutRow) {
            Intrinsics.checkNotNullParameter(callBidCell, "callBidCell");
            Intrinsics.checkNotNullParameter(callAskCell, "callAskCell");
            Intrinsics.checkNotNullParameter(putBidCell, "putBidCell");
            Intrinsics.checkNotNullParameter(putAskCell, "putAskCell");
            Intrinsics.checkNotNullParameter(stickyCellStr, "stickyCellStr");
            Intrinsics.checkNotNullParameter(callMetrics, "callMetrics");
            Intrinsics.checkNotNullParameter(putMetrics, "putMetrics");
            Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
            Intrinsics.checkNotNullParameter(selectedLegIndicatorOnCallRow, "selectedLegIndicatorOnCallRow");
            Intrinsics.checkNotNullParameter(selectedLegIndicatorOnPutRow, "selectedLegIndicatorOnPutRow");
            return new InstrumentRow(callBidCell, callAskCell, putBidCell, putAskCell, stickyCellStr, callMetrics, putMetrics, rowEnabled, loadingStyle, showTopHorizontalDivider, showBottomHorizontalDivider, rowIndex, selectedLegIndicatorOnCallRow, selectedLegIndicatorOnPutRow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentRow)) {
                return false;
            }
            InstrumentRow instrumentRow = (InstrumentRow) other;
            return Intrinsics.areEqual(this.callBidCell, instrumentRow.callBidCell) && Intrinsics.areEqual(this.callAskCell, instrumentRow.callAskCell) && Intrinsics.areEqual(this.putBidCell, instrumentRow.putBidCell) && Intrinsics.areEqual(this.putAskCell, instrumentRow.putAskCell) && Intrinsics.areEqual(this.stickyCellStr, instrumentRow.stickyCellStr) && Intrinsics.areEqual(this.callMetrics, instrumentRow.callMetrics) && Intrinsics.areEqual(this.putMetrics, instrumentRow.putMetrics) && this.rowEnabled == instrumentRow.rowEnabled && this.loadingStyle == instrumentRow.loadingStyle && this.showTopHorizontalDivider == instrumentRow.showTopHorizontalDivider && this.showBottomHorizontalDivider == instrumentRow.showBottomHorizontalDivider && this.rowIndex == instrumentRow.rowIndex && this.selectedLegIndicatorOnCallRow == instrumentRow.selectedLegIndicatorOnCallRow && this.selectedLegIndicatorOnPutRow == instrumentRow.selectedLegIndicatorOnPutRow;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.callBidCell.hashCode() * 31) + this.callAskCell.hashCode()) * 31) + this.putBidCell.hashCode()) * 31) + this.putAskCell.hashCode()) * 31) + this.stickyCellStr.hashCode()) * 31) + this.callMetrics.hashCode()) * 31) + this.putMetrics.hashCode()) * 31) + Boolean.hashCode(this.rowEnabled)) * 31) + this.loadingStyle.hashCode()) * 31) + Boolean.hashCode(this.showTopHorizontalDivider)) * 31) + Boolean.hashCode(this.showBottomHorizontalDivider)) * 31) + Integer.hashCode(this.rowIndex)) * 31) + this.selectedLegIndicatorOnCallRow.hashCode()) * 31) + this.selectedLegIndicatorOnPutRow.hashCode();
        }

        public String toString() {
            return "InstrumentRow(callBidCell=" + this.callBidCell + ", callAskCell=" + this.callAskCell + ", putBidCell=" + this.putBidCell + ", putAskCell=" + this.putAskCell + ", stickyCellStr=" + this.stickyCellStr + ", callMetrics=" + this.callMetrics + ", putMetrics=" + this.putMetrics + ", rowEnabled=" + this.rowEnabled + ", loadingStyle=" + this.loadingStyle + ", showTopHorizontalDivider=" + this.showTopHorizontalDivider + ", showBottomHorizontalDivider=" + this.showBottomHorizontalDivider + ", rowIndex=" + this.rowIndex + ", selectedLegIndicatorOnCallRow=" + this.selectedLegIndicatorOnCallRow + ", selectedLegIndicatorOnPutRow=" + this.selectedLegIndicatorOnPutRow + ")";
        }

        public final TableCellState.BidAsk getCallBidCell() {
            return this.callBidCell;
        }

        public final TableCellState.BidAsk getCallAskCell() {
            return this.callAskCell;
        }

        public final TableCellState.BidAsk getPutBidCell() {
            return this.putBidCell;
        }

        public final TableCellState.BidAsk getPutAskCell() {
            return this.putAskCell;
        }

        public final Lazy<String> getStickyCellStr() {
            return this.stickyCellStr;
        }

        public final List<Lazy<String>> getCallMetrics() {
            return this.callMetrics;
        }

        public final List<Lazy<String>> getPutMetrics() {
            return this.putMetrics;
        }

        public final boolean getRowEnabled() {
            return this.rowEnabled;
        }

        public /* synthetic */ InstrumentRow(TableCellState.BidAsk bidAsk, TableCellState.BidAsk bidAsk2, TableCellState.BidAsk bidAsk3, TableCellState.BidAsk bidAsk4, Lazy lazy, List list, List list2, boolean z, LoadingStyle loadingStyle, boolean z2, boolean z3, int i, SelectedLegIndicator selectedLegIndicator, SelectedLegIndicator selectedLegIndicator2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(bidAsk, bidAsk2, bidAsk3, bidAsk4, lazy, list, list2, z, (i2 & 256) != 0 ? LoadingStyle.NONE : loadingStyle, z2, z3, i, selectedLegIndicator, selectedLegIndicator2);
        }

        public final LoadingStyle getLoadingStyle() {
            return this.loadingStyle;
        }

        public final boolean getShowTopHorizontalDivider() {
            return this.showTopHorizontalDivider;
        }

        public final boolean getShowBottomHorizontalDivider() {
            return this.showBottomHorizontalDivider;
        }

        public final int getRowIndex() {
            return this.rowIndex;
        }

        public final SelectedLegIndicator getSelectedLegIndicatorOnCallRow() {
            return this.selectedLegIndicatorOnCallRow;
        }

        public final SelectedLegIndicator getSelectedLegIndicatorOnPutRow() {
            return this.selectedLegIndicatorOnPutRow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InstrumentRow(TableCellState.BidAsk callBidCell, TableCellState.BidAsk callAskCell, TableCellState.BidAsk putBidCell, TableCellState.BidAsk putAskCell, Lazy<String> stickyCellStr, List<? extends Lazy<String>> callMetrics, List<? extends Lazy<String>> putMetrics, boolean z, LoadingStyle loadingStyle, boolean z2, boolean z3, int i, SelectedLegIndicator selectedLegIndicatorOnCallRow, SelectedLegIndicator selectedLegIndicatorOnPutRow) {
            super(null);
            Intrinsics.checkNotNullParameter(callBidCell, "callBidCell");
            Intrinsics.checkNotNullParameter(callAskCell, "callAskCell");
            Intrinsics.checkNotNullParameter(putBidCell, "putBidCell");
            Intrinsics.checkNotNullParameter(putAskCell, "putAskCell");
            Intrinsics.checkNotNullParameter(stickyCellStr, "stickyCellStr");
            Intrinsics.checkNotNullParameter(callMetrics, "callMetrics");
            Intrinsics.checkNotNullParameter(putMetrics, "putMetrics");
            Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
            Intrinsics.checkNotNullParameter(selectedLegIndicatorOnCallRow, "selectedLegIndicatorOnCallRow");
            Intrinsics.checkNotNullParameter(selectedLegIndicatorOnPutRow, "selectedLegIndicatorOnPutRow");
            this.callBidCell = callBidCell;
            this.callAskCell = callAskCell;
            this.putBidCell = putBidCell;
            this.putAskCell = putAskCell;
            this.stickyCellStr = stickyCellStr;
            this.callMetrics = callMetrics;
            this.putMetrics = putMetrics;
            this.rowEnabled = z;
            this.loadingStyle = loadingStyle;
            this.showTopHorizontalDivider = z2;
            this.showBottomHorizontalDivider = z3;
            this.rowIndex = i;
            this.selectedLegIndicatorOnCallRow = selectedLegIndicatorOnCallRow;
            this.selectedLegIndicatorOnPutRow = selectedLegIndicatorOnPutRow;
            this.key = i;
            List listListOf = CollectionsKt.listOf((Object[]) new TableCellState.BidAsk[]{callBidCell, callAskCell});
            List<? extends Lazy<String>> list = callMetrics;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TableCellState.Text(TableCellTextStyle.METRIC, this.rowEnabled, this.loadingStyle, (Lazy) it.next()));
            }
            this.callCells = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
            List listListOf2 = CollectionsKt.listOf((Object[]) new TableCellState.BidAsk[]{this.putBidCell, this.putAskCell});
            List<Lazy<String>> list2 = this.putMetrics;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new TableCellState.Text(TableCellTextStyle.METRIC, this.rowEnabled, this.loadingStyle, (Lazy) it2.next()));
            }
            this.putCells = CollectionsKt.plus((Collection) listListOf2, (Iterable) arrayList2);
            this.stickyCell = new TableCellState.Text(TableCellTextStyle.STRIKE, this.rowEnabled, this.loadingStyle, this.stickyCellStr);
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.TableRowState
        public int getKey() {
            return this.key;
        }

        public final List<TableCellState> getCallCells() {
            return this.callCells;
        }

        public final List<TableCellState> getPutCells() {
            return this.putCells;
        }

        public final TableCellState.Text getStickyCell() {
            return this.stickyCell;
        }

        public final TableCellState.BidAsk getBidAskCell(OptionContractType contractType, OrderSide side) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(side, "side");
            Tuples2 tuples2M3642to = Tuples4.m3642to(contractType, side);
            OptionContractType optionContractType = OptionContractType.CALL;
            OrderSide orderSide = OrderSide.BUY;
            if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(optionContractType, orderSide))) {
                return this.callAskCell;
            }
            OrderSide orderSide2 = OrderSide.SELL;
            if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(optionContractType, orderSide2))) {
                return this.callBidCell;
            }
            OptionContractType optionContractType2 = OptionContractType.PUT;
            if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(optionContractType2, orderSide))) {
                return this.putAskCell;
            }
            if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(optionContractType2, orderSide2))) {
                return this.putBidCell;
            }
            throw new IllegalStateException(("Invalid contract type and side combination: " + contractType + ", " + side).toString());
        }
    }

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$UnderlyingQuoteRow;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "underlyingQuoteStr", "", "<init>", "(Ljava/lang/String;)V", "getUnderlyingQuoteStr", "()Ljava/lang/String;", "key", "", "getKey", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnderlyingQuoteRow extends TableRowState {
        public static final int $stable = 0;
        private final int key;
        private final String underlyingQuoteStr;

        public static /* synthetic */ UnderlyingQuoteRow copy$default(UnderlyingQuoteRow underlyingQuoteRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = underlyingQuoteRow.underlyingQuoteStr;
            }
            return underlyingQuoteRow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUnderlyingQuoteStr() {
            return this.underlyingQuoteStr;
        }

        public final UnderlyingQuoteRow copy(String underlyingQuoteStr) {
            Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
            return new UnderlyingQuoteRow(underlyingQuoteStr);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnderlyingQuoteRow) && Intrinsics.areEqual(this.underlyingQuoteStr, ((UnderlyingQuoteRow) other).underlyingQuoteStr);
        }

        public int hashCode() {
            return this.underlyingQuoteStr.hashCode();
        }

        public String toString() {
            return "UnderlyingQuoteRow(underlyingQuoteStr=" + this.underlyingQuoteStr + ")";
        }

        public final String getUnderlyingQuoteStr() {
            return this.underlyingQuoteStr;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnderlyingQuoteRow(String underlyingQuoteStr) {
            super(null);
            Intrinsics.checkNotNullParameter(underlyingQuoteStr, "underlyingQuoteStr");
            this.underlyingQuoteStr = underlyingQuoteStr;
            this.key = -2;
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.TableRowState
        public int getKey() {
            return this.key;
        }
    }

    /* compiled from: OptionSideBySideChainTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$DisclosureRow;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "<init>", "()V", "key", "", "getKey", "()I", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisclosureRow extends TableRowState {
        public static final int $stable = 0;
        public static final DisclosureRow INSTANCE = new DisclosureRow();
        private static final int key = -3;

        public boolean equals(Object other) {
            return this == other || (other instanceof DisclosureRow);
        }

        public int hashCode() {
            return -535058038;
        }

        public String toString() {
            return "DisclosureRow";
        }

        private DisclosureRow() {
            super(null);
        }

        @Override // com.robinhood.android.optionschain.sbschain.table.TableRowState
        public int getKey() {
            return key;
        }
    }
}
