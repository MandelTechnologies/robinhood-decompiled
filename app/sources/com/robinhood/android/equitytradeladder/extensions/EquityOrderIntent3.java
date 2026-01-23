package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Position5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderIntent.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"isBuyToClose", "", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "isSellToClose", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.extensions.EquityOrderIntentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderIntent3 {
    public static final boolean isBuyToClose(EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "<this>");
        return Position5.isShortPositionOrPending(equityOrderIntent.getPosition()) && equityOrderIntent.getTradeSide() == EquityOrderSide.BUY;
    }

    public static final boolean isSellToClose(EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "<this>");
        return Position5.isLongPositionOrPending(equityOrderIntent.getPosition()) && equityOrderIntent.getTradeSide() == EquityOrderSide.SELL;
    }
}
