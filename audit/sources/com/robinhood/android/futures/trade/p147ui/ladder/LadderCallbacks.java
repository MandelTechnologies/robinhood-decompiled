package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxCallbacks;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0003H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0013H&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0013H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;", "Lcom/robinhood/android/futures/trade/ui/ladder/ftux/LadderFtuxCallbacks;", "onPendingOrderDragDirectionChanged", "", "direction", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "onRowSelected", "selectedRowIndex", "", "onPlaceOrder", "orderSpec", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "onPendingOrderSelected", "selectedPendingOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "onPendingOrderDraggedOverRowChanged", "newDraggedOverIndex", "onPendingOrderDragEnded", "success", "", "isDelete", "onExpandLadder", "expandOnTop", "onZoomStateChanged", "started", "onZoomScaleChanged", "zoomScale", "currentCenterIndex", "onQuantityUpdated", "quantity", "Ljava/math/BigDecimal;", "onFlattenClicked", "onSettingsVisibilityChange", "show", "onPnLClick", "onAutoSendChanged", "autoSend", "onOpenOrdersClicked", "onQuantitySelectorClicked", "onTimeInForceChanged", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface LadderCallbacks extends LadderFtuxCallbacks {
    void onAutoSendChanged(boolean autoSend);

    void onExpandLadder(boolean expandOnTop);

    void onFlattenClicked();

    void onOpenOrdersClicked();

    void onPendingOrderDragDirectionChanged(LadderCustomGestureDetector direction);

    void onPendingOrderDragEnded(boolean success, boolean isDelete);

    void onPendingOrderDraggedOverRowChanged(int newDraggedOverIndex);

    void onPendingOrderSelected(FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders);

    void onPlaceOrder(OrderSpec orderSpec);

    void onPnLClick();

    void onQuantitySelectorClicked();

    void onQuantityUpdated(BigDecimal quantity);

    void onRowSelected(int selectedRowIndex);

    void onSettingsVisibilityChange(boolean show);

    void onTimeInForceChanged(FuturesTimeInForce timeInForce);

    void onZoomScaleChanged(int zoomScale, int currentCenterIndex);

    void onZoomStateChanged(boolean started);
}
