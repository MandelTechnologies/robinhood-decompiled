package com.robinhood.android.futures.history.p142ui.correction;

import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhdCashCorrectionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDataState;", "", "id", "Ljava/util/UUID;", "cashCorrection", "Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;)V", "getId", "()Ljava/util/UUID;", "getCashCorrection", "()Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RhdCashCorrectionDataState {
    public static final int $stable = 8;
    private final FuturesCashCorrection cashCorrection;
    private final UUID id;

    public static /* synthetic */ RhdCashCorrectionDataState copy$default(RhdCashCorrectionDataState rhdCashCorrectionDataState, UUID uuid, FuturesCashCorrection futuresCashCorrection, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = rhdCashCorrectionDataState.id;
        }
        if ((i & 2) != 0) {
            futuresCashCorrection = rhdCashCorrectionDataState.cashCorrection;
        }
        return rhdCashCorrectionDataState.copy(uuid, futuresCashCorrection);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesCashCorrection getCashCorrection() {
        return this.cashCorrection;
    }

    public final RhdCashCorrectionDataState copy(UUID id, FuturesCashCorrection cashCorrection) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new RhdCashCorrectionDataState(id, cashCorrection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhdCashCorrectionDataState)) {
            return false;
        }
        RhdCashCorrectionDataState rhdCashCorrectionDataState = (RhdCashCorrectionDataState) other;
        return Intrinsics.areEqual(this.id, rhdCashCorrectionDataState.id) && Intrinsics.areEqual(this.cashCorrection, rhdCashCorrectionDataState.cashCorrection);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        FuturesCashCorrection futuresCashCorrection = this.cashCorrection;
        return iHashCode + (futuresCashCorrection == null ? 0 : futuresCashCorrection.hashCode());
    }

    public String toString() {
        return "RhdCashCorrectionDataState(id=" + this.id + ", cashCorrection=" + this.cashCorrection + ")";
    }

    public RhdCashCorrectionDataState(UUID id, FuturesCashCorrection futuresCashCorrection) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.cashCorrection = futuresCashCorrection;
    }

    public /* synthetic */ RhdCashCorrectionDataState(UUID uuid, FuturesCashCorrection futuresCashCorrection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : futuresCashCorrection);
    }

    public final UUID getId() {
        return this.id;
    }

    public final FuturesCashCorrection getCashCorrection() {
        return this.cashCorrection;
    }
}
