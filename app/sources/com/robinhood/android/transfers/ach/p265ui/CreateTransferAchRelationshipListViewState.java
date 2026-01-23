package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferAchRelationshipListDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateTransferAchRelationshipListViewState;", "", "achRelationships", "", "Lcom/robinhood/models/db/AchRelationship;", "selectionResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/transfers/ach/ui/SelectionResult;", "<init>", "(Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getAchRelationships", "()Ljava/util/List;", "getSelectionResult", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferAchRelationshipListViewState {
    public static final int $stable = 8;
    private final List<AchRelationship> achRelationships;
    private final UiEvent<SelectionResult> selectionResult;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateTransferAchRelationshipListViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateTransferAchRelationshipListViewState copy$default(CreateTransferAchRelationshipListViewState createTransferAchRelationshipListViewState, List list, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = createTransferAchRelationshipListViewState.achRelationships;
        }
        if ((i & 2) != 0) {
            uiEvent = createTransferAchRelationshipListViewState.selectionResult;
        }
        return createTransferAchRelationshipListViewState.copy(list, uiEvent);
    }

    public final List<AchRelationship> component1() {
        return this.achRelationships;
    }

    public final UiEvent<SelectionResult> component2() {
        return this.selectionResult;
    }

    public final CreateTransferAchRelationshipListViewState copy(List<AchRelationship> achRelationships, UiEvent<SelectionResult> selectionResult) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        return new CreateTransferAchRelationshipListViewState(achRelationships, selectionResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferAchRelationshipListViewState)) {
            return false;
        }
        CreateTransferAchRelationshipListViewState createTransferAchRelationshipListViewState = (CreateTransferAchRelationshipListViewState) other;
        return Intrinsics.areEqual(this.achRelationships, createTransferAchRelationshipListViewState.achRelationships) && Intrinsics.areEqual(this.selectionResult, createTransferAchRelationshipListViewState.selectionResult);
    }

    public int hashCode() {
        int iHashCode = this.achRelationships.hashCode() * 31;
        UiEvent<SelectionResult> uiEvent = this.selectionResult;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "CreateTransferAchRelationshipListViewState(achRelationships=" + this.achRelationships + ", selectionResult=" + this.selectionResult + ")";
    }

    public CreateTransferAchRelationshipListViewState(List<AchRelationship> achRelationships, UiEvent<SelectionResult> uiEvent) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        this.achRelationships = achRelationships;
        this.selectionResult = uiEvent;
    }

    public /* synthetic */ CreateTransferAchRelationshipListViewState(List list, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : uiEvent);
    }

    public final List<AchRelationship> getAchRelationships() {
        return this.achRelationships;
    }

    public final UiEvent<SelectionResult> getSelectionResult() {
        return this.selectionResult;
    }
}
