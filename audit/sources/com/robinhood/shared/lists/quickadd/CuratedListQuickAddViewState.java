package com.robinhood.shared.lists.quickadd;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddViewState4;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListQuickAddViewState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0012HÂ\u0003J\u009e\u0001\u0010:\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\fHÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006B"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddViewState;", "", "itemAddedEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/shared/lists/quickadd/UpdateDetail;", "itemRemovedEvent", "itemsUpdatedEvent", "Lcom/robinhood/shared/lists/quickadd/UpdateMultipleDetail;", "itemQuickAddedEvent", "itemUpdateErrorEvent", "", "userListCount", "", "availableUserList", "Lcom/robinhood/models/db/CuratedList;", "showAddToListBottomSheetEvent", "Lcom/robinhood/models/db/Security;", "updateStatus", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/Integer;Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/shared/lists/quickadd/UpdateStatus;)V", "getItemAddedEvent", "()Lcom/robinhood/udf/UiEvent;", "getItemRemovedEvent", "getItemsUpdatedEvent", "getItemQuickAddedEvent", "getItemUpdateErrorEvent", "getUserListCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvailableUserList", "()Lcom/robinhood/models/db/CuratedList;", "getShowAddToListBottomSheetEvent", "quickAddUpdateStatus", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$QuickAdd;", "getQuickAddUpdateStatus", "()Lcom/robinhood/shared/lists/quickadd/UpdateStatus$QuickAdd;", "addItemUpdateStatus", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Add;", "getAddItemUpdateStatus", "()Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Add;", "removeItemUpdateStatus", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Remove;", "getRemoveItemUpdateStatus", "()Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Remove;", "updateMultipleUpdateStatus", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$UpdateMultiple;", "getUpdateMultipleUpdateStatus", "()Lcom/robinhood/shared/lists/quickadd/UpdateStatus$UpdateMultiple;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/Integer;Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/shared/lists/quickadd/UpdateStatus;)Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddViewState;", "equals", "", "other", "hashCode", "toString", "", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CuratedListQuickAddViewState {
    private final CuratedList availableUserList;
    private final UiEvent<CuratedListQuickAddViewState2> itemAddedEvent;
    private final UiEvent<CuratedListQuickAddViewState2> itemQuickAddedEvent;
    private final UiEvent<CuratedListQuickAddViewState2> itemRemovedEvent;
    private final UiEvent<Throwable> itemUpdateErrorEvent;
    private final UiEvent<CuratedListQuickAddViewState3> itemsUpdatedEvent;
    private final UiEvent<Security> showAddToListBottomSheetEvent;
    private final CuratedListQuickAddViewState4 updateStatus;
    private final Integer userListCount;

    public CuratedListQuickAddViewState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: component9, reason: from getter */
    private final CuratedListQuickAddViewState4 getUpdateStatus() {
        return this.updateStatus;
    }

    public static /* synthetic */ CuratedListQuickAddViewState copy$default(CuratedListQuickAddViewState curatedListQuickAddViewState, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, Integer num, CuratedList curatedList, UiEvent uiEvent6, CuratedListQuickAddViewState4 curatedListQuickAddViewState4, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = curatedListQuickAddViewState.itemAddedEvent;
        }
        if ((i & 2) != 0) {
            uiEvent2 = curatedListQuickAddViewState.itemRemovedEvent;
        }
        if ((i & 4) != 0) {
            uiEvent3 = curatedListQuickAddViewState.itemsUpdatedEvent;
        }
        if ((i & 8) != 0) {
            uiEvent4 = curatedListQuickAddViewState.itemQuickAddedEvent;
        }
        if ((i & 16) != 0) {
            uiEvent5 = curatedListQuickAddViewState.itemUpdateErrorEvent;
        }
        if ((i & 32) != 0) {
            num = curatedListQuickAddViewState.userListCount;
        }
        if ((i & 64) != 0) {
            curatedList = curatedListQuickAddViewState.availableUserList;
        }
        if ((i & 128) != 0) {
            uiEvent6 = curatedListQuickAddViewState.showAddToListBottomSheetEvent;
        }
        if ((i & 256) != 0) {
            curatedListQuickAddViewState4 = curatedListQuickAddViewState.updateStatus;
        }
        UiEvent uiEvent7 = uiEvent6;
        CuratedListQuickAddViewState4 curatedListQuickAddViewState42 = curatedListQuickAddViewState4;
        Integer num2 = num;
        CuratedList curatedList2 = curatedList;
        UiEvent uiEvent8 = uiEvent5;
        UiEvent uiEvent9 = uiEvent3;
        return curatedListQuickAddViewState.copy(uiEvent, uiEvent2, uiEvent9, uiEvent4, uiEvent8, num2, curatedList2, uiEvent7, curatedListQuickAddViewState42);
    }

    public final UiEvent<CuratedListQuickAddViewState2> component1() {
        return this.itemAddedEvent;
    }

    public final UiEvent<CuratedListQuickAddViewState2> component2() {
        return this.itemRemovedEvent;
    }

    public final UiEvent<CuratedListQuickAddViewState3> component3() {
        return this.itemsUpdatedEvent;
    }

    public final UiEvent<CuratedListQuickAddViewState2> component4() {
        return this.itemQuickAddedEvent;
    }

    public final UiEvent<Throwable> component5() {
        return this.itemUpdateErrorEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getUserListCount() {
        return this.userListCount;
    }

    /* renamed from: component7, reason: from getter */
    public final CuratedList getAvailableUserList() {
        return this.availableUserList;
    }

    public final UiEvent<Security> component8() {
        return this.showAddToListBottomSheetEvent;
    }

    public final CuratedListQuickAddViewState copy(UiEvent<CuratedListQuickAddViewState2> itemAddedEvent, UiEvent<CuratedListQuickAddViewState2> itemRemovedEvent, UiEvent<CuratedListQuickAddViewState3> itemsUpdatedEvent, UiEvent<CuratedListQuickAddViewState2> itemQuickAddedEvent, UiEvent<Throwable> itemUpdateErrorEvent, Integer userListCount, CuratedList availableUserList, UiEvent<Security> showAddToListBottomSheetEvent, CuratedListQuickAddViewState4 updateStatus) {
        return new CuratedListQuickAddViewState(itemAddedEvent, itemRemovedEvent, itemsUpdatedEvent, itemQuickAddedEvent, itemUpdateErrorEvent, userListCount, availableUserList, showAddToListBottomSheetEvent, updateStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListQuickAddViewState)) {
            return false;
        }
        CuratedListQuickAddViewState curatedListQuickAddViewState = (CuratedListQuickAddViewState) other;
        return Intrinsics.areEqual(this.itemAddedEvent, curatedListQuickAddViewState.itemAddedEvent) && Intrinsics.areEqual(this.itemRemovedEvent, curatedListQuickAddViewState.itemRemovedEvent) && Intrinsics.areEqual(this.itemsUpdatedEvent, curatedListQuickAddViewState.itemsUpdatedEvent) && Intrinsics.areEqual(this.itemQuickAddedEvent, curatedListQuickAddViewState.itemQuickAddedEvent) && Intrinsics.areEqual(this.itemUpdateErrorEvent, curatedListQuickAddViewState.itemUpdateErrorEvent) && Intrinsics.areEqual(this.userListCount, curatedListQuickAddViewState.userListCount) && Intrinsics.areEqual(this.availableUserList, curatedListQuickAddViewState.availableUserList) && Intrinsics.areEqual(this.showAddToListBottomSheetEvent, curatedListQuickAddViewState.showAddToListBottomSheetEvent) && Intrinsics.areEqual(this.updateStatus, curatedListQuickAddViewState.updateStatus);
    }

    public int hashCode() {
        UiEvent<CuratedListQuickAddViewState2> uiEvent = this.itemAddedEvent;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        UiEvent<CuratedListQuickAddViewState2> uiEvent2 = this.itemRemovedEvent;
        int iHashCode2 = (iHashCode + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<CuratedListQuickAddViewState3> uiEvent3 = this.itemsUpdatedEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<CuratedListQuickAddViewState2> uiEvent4 = this.itemQuickAddedEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Throwable> uiEvent5 = this.itemUpdateErrorEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        Integer num = this.userListCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        CuratedList curatedList = this.availableUserList;
        int iHashCode7 = (iHashCode6 + (curatedList == null ? 0 : curatedList.hashCode())) * 31;
        UiEvent<Security> uiEvent6 = this.showAddToListBottomSheetEvent;
        int iHashCode8 = (iHashCode7 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        CuratedListQuickAddViewState4 curatedListQuickAddViewState4 = this.updateStatus;
        return iHashCode8 + (curatedListQuickAddViewState4 != null ? curatedListQuickAddViewState4.hashCode() : 0);
    }

    public String toString() {
        return "CuratedListQuickAddViewState(itemAddedEvent=" + this.itemAddedEvent + ", itemRemovedEvent=" + this.itemRemovedEvent + ", itemsUpdatedEvent=" + this.itemsUpdatedEvent + ", itemQuickAddedEvent=" + this.itemQuickAddedEvent + ", itemUpdateErrorEvent=" + this.itemUpdateErrorEvent + ", userListCount=" + this.userListCount + ", availableUserList=" + this.availableUserList + ", showAddToListBottomSheetEvent=" + this.showAddToListBottomSheetEvent + ", updateStatus=" + this.updateStatus + ")";
    }

    public CuratedListQuickAddViewState(UiEvent<CuratedListQuickAddViewState2> uiEvent, UiEvent<CuratedListQuickAddViewState2> uiEvent2, UiEvent<CuratedListQuickAddViewState3> uiEvent3, UiEvent<CuratedListQuickAddViewState2> uiEvent4, UiEvent<Throwable> uiEvent5, Integer num, CuratedList curatedList, UiEvent<Security> uiEvent6, CuratedListQuickAddViewState4 curatedListQuickAddViewState4) {
        this.itemAddedEvent = uiEvent;
        this.itemRemovedEvent = uiEvent2;
        this.itemsUpdatedEvent = uiEvent3;
        this.itemQuickAddedEvent = uiEvent4;
        this.itemUpdateErrorEvent = uiEvent5;
        this.userListCount = num;
        this.availableUserList = curatedList;
        this.showAddToListBottomSheetEvent = uiEvent6;
        this.updateStatus = curatedListQuickAddViewState4;
    }

    public /* synthetic */ CuratedListQuickAddViewState(UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, Integer num, CuratedList curatedList, UiEvent uiEvent6, CuratedListQuickAddViewState4 curatedListQuickAddViewState4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : uiEvent2, (i & 4) != 0 ? null : uiEvent3, (i & 8) != 0 ? null : uiEvent4, (i & 16) != 0 ? null : uiEvent5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : curatedList, (i & 128) != 0 ? null : uiEvent6, (i & 256) != 0 ? null : curatedListQuickAddViewState4);
    }

    public final UiEvent<CuratedListQuickAddViewState2> getItemAddedEvent() {
        return this.itemAddedEvent;
    }

    public final UiEvent<CuratedListQuickAddViewState2> getItemRemovedEvent() {
        return this.itemRemovedEvent;
    }

    public final UiEvent<CuratedListQuickAddViewState3> getItemsUpdatedEvent() {
        return this.itemsUpdatedEvent;
    }

    public final UiEvent<CuratedListQuickAddViewState2> getItemQuickAddedEvent() {
        return this.itemQuickAddedEvent;
    }

    public final UiEvent<Throwable> getItemUpdateErrorEvent() {
        return this.itemUpdateErrorEvent;
    }

    public final Integer getUserListCount() {
        return this.userListCount;
    }

    public final CuratedList getAvailableUserList() {
        return this.availableUserList;
    }

    public final UiEvent<Security> getShowAddToListBottomSheetEvent() {
        return this.showAddToListBottomSheetEvent;
    }

    public final CuratedListQuickAddViewState4.QuickAdd getQuickAddUpdateStatus() {
        CuratedListQuickAddViewState4 curatedListQuickAddViewState4 = this.updateStatus;
        if (curatedListQuickAddViewState4 instanceof CuratedListQuickAddViewState4.QuickAdd) {
            return (CuratedListQuickAddViewState4.QuickAdd) curatedListQuickAddViewState4;
        }
        return null;
    }

    public final CuratedListQuickAddViewState4.Add getAddItemUpdateStatus() {
        CuratedListQuickAddViewState4 curatedListQuickAddViewState4 = this.updateStatus;
        if (curatedListQuickAddViewState4 instanceof CuratedListQuickAddViewState4.Add) {
            return (CuratedListQuickAddViewState4.Add) curatedListQuickAddViewState4;
        }
        return null;
    }

    public final CuratedListQuickAddViewState4.Remove getRemoveItemUpdateStatus() {
        CuratedListQuickAddViewState4 curatedListQuickAddViewState4 = this.updateStatus;
        if (curatedListQuickAddViewState4 instanceof CuratedListQuickAddViewState4.Remove) {
            return (CuratedListQuickAddViewState4.Remove) curatedListQuickAddViewState4;
        }
        return null;
    }

    public final CuratedListQuickAddViewState4.UpdateMultiple getUpdateMultipleUpdateStatus() {
        CuratedListQuickAddViewState4 curatedListQuickAddViewState4 = this.updateStatus;
        if (curatedListQuickAddViewState4 instanceof CuratedListQuickAddViewState4.UpdateMultiple) {
            return (CuratedListQuickAddViewState4.UpdateMultiple) curatedListQuickAddViewState4;
        }
        return null;
    }
}
