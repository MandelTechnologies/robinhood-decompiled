package com.robinhood.android.lists.p173ui.deletelist;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteCuratedListState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListState;", "", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "isDeletingList", "", "deleteListError", "Lcom/robinhood/udf/UiEvent;", "", "deleteListSuccess", "", "<init>", "(Lcom/robinhood/models/db/CuratedList;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "()Z", "getDeleteListError", "()Lcom/robinhood/udf/UiEvent;", "getDeleteListSuccess", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeleteCuratedListState {
    public static final int $stable = 8;
    private final CuratedList curatedList;
    private final UiEvent<Throwable> deleteListError;
    private final UiEvent<Unit> deleteListSuccess;
    private final boolean isDeletingList;

    public DeleteCuratedListState() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteCuratedListState copy$default(DeleteCuratedListState deleteCuratedListState, CuratedList curatedList, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            curatedList = deleteCuratedListState.curatedList;
        }
        if ((i & 2) != 0) {
            z = deleteCuratedListState.isDeletingList;
        }
        if ((i & 4) != 0) {
            uiEvent = deleteCuratedListState.deleteListError;
        }
        if ((i & 8) != 0) {
            uiEvent2 = deleteCuratedListState.deleteListSuccess;
        }
        return deleteCuratedListState.copy(curatedList, z, uiEvent, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final CuratedList getCuratedList() {
        return this.curatedList;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDeletingList() {
        return this.isDeletingList;
    }

    public final UiEvent<Throwable> component3() {
        return this.deleteListError;
    }

    public final UiEvent<Unit> component4() {
        return this.deleteListSuccess;
    }

    public final DeleteCuratedListState copy(CuratedList curatedList, boolean isDeletingList, UiEvent<Throwable> deleteListError, UiEvent<Unit> deleteListSuccess) {
        return new DeleteCuratedListState(curatedList, isDeletingList, deleteListError, deleteListSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteCuratedListState)) {
            return false;
        }
        DeleteCuratedListState deleteCuratedListState = (DeleteCuratedListState) other;
        return Intrinsics.areEqual(this.curatedList, deleteCuratedListState.curatedList) && this.isDeletingList == deleteCuratedListState.isDeletingList && Intrinsics.areEqual(this.deleteListError, deleteCuratedListState.deleteListError) && Intrinsics.areEqual(this.deleteListSuccess, deleteCuratedListState.deleteListSuccess);
    }

    public int hashCode() {
        CuratedList curatedList = this.curatedList;
        int iHashCode = (((curatedList == null ? 0 : curatedList.hashCode()) * 31) + Boolean.hashCode(this.isDeletingList)) * 31;
        UiEvent<Throwable> uiEvent = this.deleteListError;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.deleteListSuccess;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "DeleteCuratedListState(curatedList=" + this.curatedList + ", isDeletingList=" + this.isDeletingList + ", deleteListError=" + this.deleteListError + ", deleteListSuccess=" + this.deleteListSuccess + ")";
    }

    public DeleteCuratedListState(CuratedList curatedList, boolean z, UiEvent<Throwable> uiEvent, UiEvent<Unit> uiEvent2) {
        this.curatedList = curatedList;
        this.isDeletingList = z;
        this.deleteListError = uiEvent;
        this.deleteListSuccess = uiEvent2;
    }

    public /* synthetic */ DeleteCuratedListState(CuratedList curatedList, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : curatedList, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final CuratedList getCuratedList() {
        return this.curatedList;
    }

    public final boolean isDeletingList() {
        return this.isDeletingList;
    }

    public final UiEvent<Throwable> getDeleteListError() {
        return this.deleteListError;
    }

    public final UiEvent<Unit> getDeleteListSuccess() {
        return this.deleteListSuccess;
    }
}
