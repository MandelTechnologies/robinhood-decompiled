package com.robinhood.android.lib.trade;

import com.robinhood.android.lib.trade.OrderState;
import kotlin.Metadata;

/* compiled from: OrderState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/OrderState;", "T", "", "isReviewingState", "", "()Z", "nextState", "getNextState", "()Lcom/robinhood/android/lib/trade/OrderState;", "previousState", "getPreviousState", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface OrderState<T extends OrderState<T>> {
    T getNextState();

    T getPreviousState();

    boolean isReviewingState();
}
