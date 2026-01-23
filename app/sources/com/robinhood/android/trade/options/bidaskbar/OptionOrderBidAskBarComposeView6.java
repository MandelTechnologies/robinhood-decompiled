package com.robinhood.android.trade.options.bidaskbar;

import android.view.MotionEvent;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState3;
import kotlin.Metadata;

/* compiled from: OptionOrderBidAskBarComposeView.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m3636d2 = {"handleTouchEvent", "", "Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarComposeView$Callbacks;", "event", "Landroid/view/MotionEvent;", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeViewKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderBidAskBarComposeView6 {
    public static final boolean handleTouchEvent(OptionOrderBidAskBarComposeView.Callbacks callbacks, MotionEvent motionEvent) {
        if (callbacks == null) {
            return false;
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            callbacks.onTouchEvent(new OptionOrderBidAskBarViewState3.Down(motionEvent.getX()));
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            callbacks.onTouchEvent(new OptionOrderBidAskBarViewState3.Move(motionEvent.getX()));
            return true;
        }
        if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
            callbacks.onTouchEvent(new OptionOrderBidAskBarViewState3.Up(motionEvent.getX()));
            return true;
        }
        callbacks.onTouchEvent(OptionOrderBidAskBarViewState3.Other.INSTANCE);
        return false;
    }
}
