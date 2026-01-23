package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState5;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;", "Lcom/robinhood/shared/trading/orderstate/OrderInstrument;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "<init>", "(Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;)V", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FuturesInstrument implements InstrumentOrderState5 {
    private final FuturesContract contract;

    public static /* synthetic */ FuturesInstrument copy$default(FuturesInstrument futuresInstrument, FuturesContract futuresContract, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresContract = futuresInstrument.contract;
        }
        return futuresInstrument.copy(futuresContract);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesInstrument copy(FuturesContract contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return new FuturesInstrument(contract);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesInstrument) && Intrinsics.areEqual(this.contract, ((FuturesInstrument) other).contract);
    }

    public int hashCode() {
        return this.contract.hashCode();
    }

    public String toString() {
        return "FuturesInstrument(contract=" + this.contract + ")";
    }

    public FuturesInstrument(FuturesContract contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.contract = contract;
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState5
    public UUID getId() {
        return this.contract.getId();
    }
}
