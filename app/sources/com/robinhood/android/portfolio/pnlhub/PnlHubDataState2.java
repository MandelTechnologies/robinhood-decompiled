package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "", "Hidden", "TradeDetailSettings", "DataAvailability", "TradeDetail", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$DataAvailability;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$Hidden;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$TradeDetail;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$TradeDetailSettings;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubBottomSheetState, reason: use source file name */
/* loaded from: classes11.dex */
public interface PnlHubDataState2 {

    /* compiled from: PnlHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$Hidden;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubBottomSheetState$Hidden */
    public static final /* data */ class Hidden implements PnlHubDataState2 {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return -1181464473;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
        }
    }

    /* compiled from: PnlHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$TradeDetailSettings;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubBottomSheetState$TradeDetailSettings */
    public static final /* data */ class TradeDetailSettings implements PnlHubDataState2 {
        public static final int $stable = 0;
        public static final TradeDetailSettings INSTANCE = new TradeDetailSettings();

        public boolean equals(Object other) {
            return this == other || (other instanceof TradeDetailSettings);
        }

        public int hashCode() {
            return 1573734011;
        }

        public String toString() {
            return "TradeDetailSettings";
        }

        private TradeDetailSettings() {
        }
    }

    /* compiled from: PnlHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$DataAvailability;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubBottomSheetState$DataAvailability */
    public static final /* data */ class DataAvailability implements PnlHubDataState2 {
        public static final int $stable = 0;
        public static final DataAvailability INSTANCE = new DataAvailability();

        public boolean equals(Object other) {
            return this == other || (other instanceof DataAvailability);
        }

        public int hashCode() {
            return -2054206302;
        }

        public String toString() {
            return "DataAvailability";
        }

        private DataAvailability() {
        }
    }

    /* compiled from: PnlHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState$TradeDetail;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "<init>", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;)V", "getItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubBottomSheetState$TradeDetail, reason: from toString */
    public static final /* data */ class TradeDetail implements PnlHubDataState2 {
        public static final int $stable = 8;
        private final ProfitAndLossTradeItem item;

        public static /* synthetic */ TradeDetail copy$default(TradeDetail tradeDetail, ProfitAndLossTradeItem profitAndLossTradeItem, int i, Object obj) {
            if ((i & 1) != 0) {
                profitAndLossTradeItem = tradeDetail.item;
            }
            return tradeDetail.copy(profitAndLossTradeItem);
        }

        /* renamed from: component1, reason: from getter */
        public final ProfitAndLossTradeItem getItem() {
            return this.item;
        }

        public final TradeDetail copy(ProfitAndLossTradeItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new TradeDetail(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TradeDetail) && Intrinsics.areEqual(this.item, ((TradeDetail) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "TradeDetail(item=" + this.item + ")";
        }

        public TradeDetail(ProfitAndLossTradeItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public final ProfitAndLossTradeItem getItem() {
            return this.item;
        }
    }
}
