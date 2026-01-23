package com.robinhood.android.equities.equitytrade;

import com.robinhood.models.p320db.Position;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityPosition;", "Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "position", "Lcom/robinhood/models/db/Position;", "<init>", "(Lcom/robinhood/models/db/Position;)V", "getPosition", "()Lcom/robinhood/models/db/Position;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityPosition implements InstrumentOrderState3 {
    private final Position position;

    public static /* synthetic */ EquityPosition copy$default(EquityPosition equityPosition, Position position, int i, Object obj) {
        if ((i & 1) != 0) {
            position = equityPosition.position;
        }
        return equityPosition.copy(position);
    }

    /* renamed from: component1, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    public final EquityPosition copy(Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return new EquityPosition(position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EquityPosition) && Intrinsics.areEqual(this.position, ((EquityPosition) other).position);
    }

    public int hashCode() {
        return this.position.hashCode();
    }

    public String toString() {
        return "EquityPosition(position=" + this.position + ")";
    }

    public EquityPosition(Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.position = position;
    }

    public final Position getPosition() {
        return this.position;
    }
}
