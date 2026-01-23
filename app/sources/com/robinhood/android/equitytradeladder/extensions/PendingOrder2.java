package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equitytradeladder.models.EquityPendingOrder3;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: PendingOrder.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/models/PendingOrder;", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "determinePillVisualState", "(Lcom/robinhood/android/equitytradeladder/models/PendingOrder;Lcom/robinhood/models/db/MarketHours;Lj$/time/Clock;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.extensions.PendingOrderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PendingOrder2 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r0 != com.robinhood.models.p320db.OrderMarketHours.ALL_DAY_HOURS) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r0 != com.robinhood.models.p320db.OrderMarketHours.REGULAR_CURB_HOURS) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PillStyle.PillVisualState determinePillVisualState(EquityPendingOrder3 equityPendingOrder3, MarketHours marketHours, Clock clock) {
        Intrinsics.checkNotNullParameter(equityPendingOrder3, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Instant instant = clock.instant();
        OrderMarketHours orderHours = equityPendingOrder3.getOrderHours();
        if (equityPendingOrder3.getState() == EquityOrderState.LOCATING || equityPendingOrder3.getState() == EquityOrderState.QUEUED) {
            return PillStyle.PillVisualState.OUTLINED;
        }
        if (equityPendingOrder3.getState() == EquityOrderState.CONFIRMED) {
            return PillStyle.PillVisualState.ACTIVE;
        }
        if (equityPendingOrder3.getState() == EquityOrderState.UNCONFIRMED) {
            if (marketHours == null || marketHours.isOpen()) {
                if (marketHours != null) {
                    Intrinsics.checkNotNull(instant);
                    if (marketHours.isOvernightHours(instant)) {
                    }
                }
                if (marketHours != null) {
                    Intrinsics.checkNotNull(instant);
                    if (marketHours.isExtendedHours(instant)) {
                        if (orderHours != OrderMarketHours.REGULAR_HOURS) {
                        }
                    } else if (marketHours != null) {
                        Intrinsics.checkNotNull(instant);
                        marketHours.isOpenRegular(instant);
                    }
                }
                return PillStyle.PillVisualState.ACTIVE;
            }
            return PillStyle.PillVisualState.OUTLINED;
        }
        return PillStyle.PillVisualState.ACTIVE;
    }
}
