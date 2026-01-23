package com.robinhood.android.futures.detail.p140ui;

import com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo4;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/PreviewCallbacks;", "Lcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;", "<init>", "()V", "showPictureInPicture", "", "contractId", "Ljava/util/UUID;", "isContinuous", "", "setSelectedContractId", "viewMode", "Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "onBackClicked", "addToWatchlist", "isContractInUserLists", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "exitFtux", "navigateToOnboarding", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "onOpenContractsSelector", "onContractSelected", "isViewingProductOnly", "onContractSelectorDismissed", "prefetchLadderFtuxLottieIfNeeded", "isTradeBarExpanded", "hideLadderButtonTooltip", "onContractTradeLadderClicked", "onContractTradeOrderFormClicked", "onError", "t", "", "goToNextFtuxState", "goToPreviousFtuxState", "onFlattenClick", "onOpenAdvancedChart", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class PreviewCallbacks implements FuturesDetailScreenCallbacks {
    public static final PreviewCallbacks INSTANCE = new PreviewCallbacks();

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void addToWatchlist(boolean isContractInUserLists, FuturesContract futuresContract) {
        Intrinsics.checkNotNullParameter(futuresContract, "futuresContract");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void exitFtux() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void goToNextFtuxState() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void goToPreviousFtuxState() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void hideLadderButtonTooltip() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void navigateToOnboarding(UUID contractId, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onBackClicked() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractSelected(UUID contractId, boolean isViewingProductOnly) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractSelectorDismissed() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractTradeLadderClicked(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractTradeOrderFormClicked(UUID contractId, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onFlattenClick() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onOpenAdvancedChart(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onOpenContractsSelector() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void prefetchLadderFtuxLottieIfNeeded(boolean isTradeBarExpanded) {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void setSelectedContractId(UUID contractId, FuturesDetailChartDuxo4 viewMode) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void showPictureInPicture(UUID contractId, boolean isContinuous) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
    }

    private PreviewCallbacks() {
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onTradeBarExpanded(boolean z) {
        FuturesDetailScreenCallbacks.DefaultImpls.onTradeBarExpanded(this, z);
    }
}
