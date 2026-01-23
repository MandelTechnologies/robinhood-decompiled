package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.models.p320db.AchRelationship;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferAchRelationshipListDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/SelectionResult;", "", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "state", "Lcom/robinhood/android/transfers/ach/ui/AchRelationshipState;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/android/transfers/ach/ui/AchRelationshipState;)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getState", "()Lcom/robinhood/android/transfers/ach/ui/AchRelationshipState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SelectionResult {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final CreateTransferAchRelationshipListDuxo2 state;

    public static /* synthetic */ SelectionResult copy$default(SelectionResult selectionResult, AchRelationship achRelationship, CreateTransferAchRelationshipListDuxo2 createTransferAchRelationshipListDuxo2, int i, Object obj) {
        if ((i & 1) != 0) {
            achRelationship = selectionResult.achRelationship;
        }
        if ((i & 2) != 0) {
            createTransferAchRelationshipListDuxo2 = selectionResult.state;
        }
        return selectionResult.copy(achRelationship, createTransferAchRelationshipListDuxo2);
    }

    /* renamed from: component1, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component2, reason: from getter */
    public final CreateTransferAchRelationshipListDuxo2 getState() {
        return this.state;
    }

    public final SelectionResult copy(AchRelationship achRelationship, CreateTransferAchRelationshipListDuxo2 state) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        Intrinsics.checkNotNullParameter(state, "state");
        return new SelectionResult(achRelationship, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionResult)) {
            return false;
        }
        SelectionResult selectionResult = (SelectionResult) other;
        return Intrinsics.areEqual(this.achRelationship, selectionResult.achRelationship) && this.state == selectionResult.state;
    }

    public int hashCode() {
        return (this.achRelationship.hashCode() * 31) + this.state.hashCode();
    }

    public String toString() {
        return "SelectionResult(achRelationship=" + this.achRelationship + ", state=" + this.state + ")";
    }

    public SelectionResult(AchRelationship achRelationship, CreateTransferAchRelationshipListDuxo2 state) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        Intrinsics.checkNotNullParameter(state, "state");
        this.achRelationship = achRelationship;
        this.state = state;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final CreateTransferAchRelationshipListDuxo2 getState() {
        return this.state;
    }
}
