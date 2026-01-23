package com.robinhood.android.futures.detail.p140ui;

import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo4;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u0003H&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0007H\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;", "", "showPictureInPicture", "", "contractId", "Ljava/util/UUID;", "isContinuous", "", "setSelectedContractId", "viewMode", "Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "onBackClicked", "addToWatchlist", "isContractInUserLists", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "exitFtux", "navigateToOnboarding", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "onOpenContractsSelector", "onContractSelected", "isViewingProductOnly", "onContractSelectorDismissed", "prefetchLadderFtuxLottieIfNeeded", "isTradeBarExpanded", "hideLadderButtonTooltip", "onContractTradeLadderClicked", "onContractTradeOrderFormClicked", "onError", "t", "", "goToNextFtuxState", "goToPreviousFtuxState", "onFlattenClick", "onOpenAdvancedChart", "onTradeBarExpanded", "isExpanded", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface FuturesDetailScreenCallbacks {
    void addToWatchlist(boolean isContractInUserLists, FuturesContract futuresContract);

    void exitFtux();

    void goToNextFtuxState();

    void goToPreviousFtuxState();

    void hideLadderButtonTooltip();

    void navigateToOnboarding(UUID contractId, FuturesOrderSide side);

    void onBackClicked();

    void onContractSelected(UUID contractId, boolean isViewingProductOnly);

    void onContractSelectorDismissed();

    void onContractTradeLadderClicked(UUID contractId);

    void onContractTradeOrderFormClicked(UUID contractId, FuturesOrderSide side);

    void onError(Throwable t);

    void onFlattenClick();

    void onOpenAdvancedChart(UUID contractId);

    void onOpenContractsSelector();

    void onTradeBarExpanded(boolean isExpanded);

    void prefetchLadderFtuxLottieIfNeeded(boolean isTradeBarExpanded);

    void setSelectedContractId(UUID contractId, FuturesDetailChartDuxo4 viewMode);

    void showPictureInPicture(UUID contractId, boolean isContinuous);

    /* compiled from: FuturesDetailScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onTradeBarExpanded(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, boolean z) {
            futuresDetailScreenCallbacks.prefetchLadderFtuxLottieIfNeeded(z);
            if (z) {
                return;
            }
            futuresDetailScreenCallbacks.hideLadderButtonTooltip();
        }
    }
}
