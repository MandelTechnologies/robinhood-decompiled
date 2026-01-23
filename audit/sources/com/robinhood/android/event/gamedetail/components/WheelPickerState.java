package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: WheelPicker.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/WheelPickerState;", "", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "selectedIndex", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;I)V", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WheelPickerState {
    public static final int $stable = 0;
    private final ImmutableList<ContractElement> items;
    private final int selectedIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WheelPickerState copy$default(WheelPickerState wheelPickerState, ImmutableList immutableList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = wheelPickerState.items;
        }
        if ((i2 & 2) != 0) {
            i = wheelPickerState.selectedIndex;
        }
        return wheelPickerState.copy(immutableList, i);
    }

    public final ImmutableList<ContractElement> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final WheelPickerState copy(ImmutableList<ContractElement> items, int selectedIndex) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new WheelPickerState(items, selectedIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WheelPickerState)) {
            return false;
        }
        WheelPickerState wheelPickerState = (WheelPickerState) other;
        return Intrinsics.areEqual(this.items, wheelPickerState.items) && this.selectedIndex == wheelPickerState.selectedIndex;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Integer.hashCode(this.selectedIndex);
    }

    public String toString() {
        return "WheelPickerState(items=" + this.items + ", selectedIndex=" + this.selectedIndex + ")";
    }

    public WheelPickerState(ImmutableList<ContractElement> items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.selectedIndex = i;
    }

    public /* synthetic */ WheelPickerState(ImmutableList immutableList, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i2 & 2) != 0 ? 0 : i);
    }

    public final ImmutableList<ContractElement> getItems() {
        return this.items;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }
}
