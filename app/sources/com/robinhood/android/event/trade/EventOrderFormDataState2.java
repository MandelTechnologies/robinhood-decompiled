package com.robinhood.android.event.trade;

import com.robinhood.android.event.trade.OrderSubmissionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EventOrderFormDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"isEditableState", "", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormDataStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderFormDataState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isEditableState(OrderSubmissionState orderSubmissionState) {
        if (orderSubmissionState instanceof OrderSubmissionState.Editing) {
            return true;
        }
        if ((orderSubmissionState instanceof OrderSubmissionState.Reviewing) || (orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
