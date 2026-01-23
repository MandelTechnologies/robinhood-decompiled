package com.robinhood.android.pathfinder.corepages.pendingdeposits;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingDepositsViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsViewState;", "", "transfers", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "sendingInput", "", "<init>", "(Ljava/util/List;Z)V", "getTransfers", "()Ljava/util/List;", "getSendingInput", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PendingDepositsViewState {
    public static final int $stable = 8;
    private final boolean sendingInput;
    private final List<StatefulHistoryEvent<HistoryEvent>> transfers;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingDepositsViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingDepositsViewState copy$default(PendingDepositsViewState pendingDepositsViewState, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pendingDepositsViewState.transfers;
        }
        if ((i & 2) != 0) {
            z = pendingDepositsViewState.sendingInput;
        }
        return pendingDepositsViewState.copy(list, z);
    }

    public final List<StatefulHistoryEvent<HistoryEvent>> component1() {
        return this.transfers;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final PendingDepositsViewState copy(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> transfers, boolean sendingInput) {
        Intrinsics.checkNotNullParameter(transfers, "transfers");
        return new PendingDepositsViewState(transfers, sendingInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingDepositsViewState)) {
            return false;
        }
        PendingDepositsViewState pendingDepositsViewState = (PendingDepositsViewState) other;
        return Intrinsics.areEqual(this.transfers, pendingDepositsViewState.transfers) && this.sendingInput == pendingDepositsViewState.sendingInput;
    }

    public int hashCode() {
        return (this.transfers.hashCode() * 31) + Boolean.hashCode(this.sendingInput);
    }

    public String toString() {
        return "PendingDepositsViewState(transfers=" + this.transfers + ", sendingInput=" + this.sendingInput + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PendingDepositsViewState(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> transfers, boolean z) {
        Intrinsics.checkNotNullParameter(transfers, "transfers");
        this.transfers = transfers;
        this.sendingInput = z;
    }

    public /* synthetic */ PendingDepositsViewState(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z);
    }

    public final List<StatefulHistoryEvent<HistoryEvent>> getTransfers() {
        return this.transfers;
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }
}
