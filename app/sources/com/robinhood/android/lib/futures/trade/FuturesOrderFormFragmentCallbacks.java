package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver;
import kotlin.Metadata;

/* compiled from: FuturesOrderFormFragmentCallbacks.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/FuturesOrderFormFragmentCallbacks;", "", "getOrderConfig", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "onOrderTypeClicked", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "exitOrderForm", "shouldFadeOut", "", "onDonePressed", "getLadderFragmentOrderChecksResolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FuturesOrderFormFragmentCallbacks {
    void exitOrderForm(boolean shouldFadeOut);

    FuturesOrderCheckResolver getLadderFragmentOrderChecksResolver();

    FuturesOrderConfiguration getOrderConfig();

    void onDonePressed();

    void onOrderTypeClicked(FuturesOrderSide side);

    /* compiled from: FuturesOrderFormFragmentCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void exitOrderForm$default(FuturesOrderFormFragmentCallbacks futuresOrderFormFragmentCallbacks, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exitOrderForm");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            futuresOrderFormFragmentCallbacks.exitOrderForm(z);
        }
    }
}
