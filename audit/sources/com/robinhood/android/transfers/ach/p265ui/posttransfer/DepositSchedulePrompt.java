package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.transfers.models.p406db.AchTransfer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferInstantDepositViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/DepositSchedulePrompt;", "", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;)V", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DepositSchedulePrompt {
    public static final int $stable = 8;
    private final AchTransfer achTransfer;

    public static /* synthetic */ DepositSchedulePrompt copy$default(DepositSchedulePrompt depositSchedulePrompt, AchTransfer achTransfer, int i, Object obj) {
        if ((i & 1) != 0) {
            achTransfer = depositSchedulePrompt.achTransfer;
        }
        return depositSchedulePrompt.copy(achTransfer);
    }

    /* renamed from: component1, reason: from getter */
    public final AchTransfer getAchTransfer() {
        return this.achTransfer;
    }

    public final DepositSchedulePrompt copy(AchTransfer achTransfer) {
        Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
        return new DepositSchedulePrompt(achTransfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DepositSchedulePrompt) && Intrinsics.areEqual(this.achTransfer, ((DepositSchedulePrompt) other).achTransfer);
    }

    public int hashCode() {
        return this.achTransfer.hashCode();
    }

    public String toString() {
        return "DepositSchedulePrompt(achTransfer=" + this.achTransfer + ")";
    }

    public DepositSchedulePrompt(AchTransfer achTransfer) {
        Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
        this.achTransfer = achTransfer;
    }

    public final AchTransfer getAchTransfer() {
        return this.achTransfer;
    }
}
