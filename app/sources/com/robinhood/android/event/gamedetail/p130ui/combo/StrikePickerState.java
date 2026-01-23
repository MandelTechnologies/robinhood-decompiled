package com.robinhood.android.event.gamedetail.p130ui.combo;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailComboBottomSheet.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J-\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/combo/StrikePickerState;", "", "displayKey", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "elements", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "currentSelectionIndex", "", "<init>", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lkotlinx/collections/immutable/PersistentList;I)V", "getDisplayKey", "()Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "getElements", "()Lkotlinx/collections/immutable/PersistentList;", "getCurrentSelectionIndex", "()I", "displayList", "", "getDisplayList", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class StrikePickerState {
    public static final int $stable = 8;
    private final int currentSelectionIndex;
    private final ContractIdWithSide displayKey;
    private final ImmutableList3<String> displayList;
    private final ImmutableList3<ContractElement> elements;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrikePickerState copy$default(StrikePickerState strikePickerState, ContractIdWithSide contractIdWithSide, ImmutableList3 immutableList3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            contractIdWithSide = strikePickerState.displayKey;
        }
        if ((i2 & 2) != 0) {
            immutableList3 = strikePickerState.elements;
        }
        if ((i2 & 4) != 0) {
            i = strikePickerState.currentSelectionIndex;
        }
        return strikePickerState.copy(contractIdWithSide, immutableList3, i);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractIdWithSide getDisplayKey() {
        return this.displayKey;
    }

    public final ImmutableList3<ContractElement> component2() {
        return this.elements;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentSelectionIndex() {
        return this.currentSelectionIndex;
    }

    public final StrikePickerState copy(ContractIdWithSide displayKey, ImmutableList3<ContractElement> elements, int currentSelectionIndex) {
        Intrinsics.checkNotNullParameter(displayKey, "displayKey");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new StrikePickerState(displayKey, elements, currentSelectionIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrikePickerState)) {
            return false;
        }
        StrikePickerState strikePickerState = (StrikePickerState) other;
        return Intrinsics.areEqual(this.displayKey, strikePickerState.displayKey) && Intrinsics.areEqual(this.elements, strikePickerState.elements) && this.currentSelectionIndex == strikePickerState.currentSelectionIndex;
    }

    public int hashCode() {
        return (((this.displayKey.hashCode() * 31) + this.elements.hashCode()) * 31) + Integer.hashCode(this.currentSelectionIndex);
    }

    public String toString() {
        return "StrikePickerState(displayKey=" + this.displayKey + ", elements=" + this.elements + ", currentSelectionIndex=" + this.currentSelectionIndex + ")";
    }

    public StrikePickerState(ContractIdWithSide displayKey, ImmutableList3<ContractElement> elements, int i) {
        Intrinsics.checkNotNullParameter(displayKey, "displayKey");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.displayKey = displayKey;
        this.elements = elements;
        this.currentSelectionIndex = i;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        Iterator<ContractElement> it = elements.iterator();
        while (it.hasNext()) {
            String contractDisplayText = it.next().getContractDisplayText();
            if (contractDisplayText == null) {
                contractDisplayText = "-";
            }
            arrayList.add(contractDisplayText);
        }
        this.displayList = extensions2.toPersistentList(arrayList);
    }

    public final ContractIdWithSide getDisplayKey() {
        return this.displayKey;
    }

    public final ImmutableList3<ContractElement> getElements() {
        return this.elements;
    }

    public final int getCurrentSelectionIndex() {
        return this.currentSelectionIndex;
    }

    public final ImmutableList3<String> getDisplayList() {
        return this.displayList;
    }
}
