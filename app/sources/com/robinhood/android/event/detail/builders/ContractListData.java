package com.robinhood.android.event.detail.builders;

import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildMultiContractList.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/ContractListData;", "", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "quote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "displayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "pendingOrders", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "<init>", "(Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;Lcom/robinhood/android/models/event/db/marketdata/EventQuote;Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;Ljava/util/List;)V", "getContract", "()Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "getPosition", "()Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "getQuote", "()Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "getDisplayMode", "()Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "getPendingOrders", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractListData {
    public static final int $stable = 8;
    private final EventContract contract;
    private final EventDetailDisplayDataBottomSheet displayMode;
    private final List<UiEventOrder> pendingOrders;
    private final UiEventContractPosition position;
    private final EventQuote quote;

    public static /* synthetic */ ContractListData copy$default(ContractListData contractListData, EventContract eventContract, UiEventContractPosition uiEventContractPosition, EventQuote eventQuote, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContract = contractListData.contract;
        }
        if ((i & 2) != 0) {
            uiEventContractPosition = contractListData.position;
        }
        if ((i & 4) != 0) {
            eventQuote = contractListData.quote;
        }
        if ((i & 8) != 0) {
            eventDetailDisplayDataBottomSheet = contractListData.displayMode;
        }
        if ((i & 16) != 0) {
            list = contractListData.pendingOrders;
        }
        List list2 = list;
        EventQuote eventQuote2 = eventQuote;
        return contractListData.copy(eventContract, uiEventContractPosition, eventQuote2, eventDetailDisplayDataBottomSheet, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final EventContract getContract() {
        return this.contract;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEventContractPosition getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final EventQuote getQuote() {
        return this.quote;
    }

    /* renamed from: component4, reason: from getter */
    public final EventDetailDisplayDataBottomSheet getDisplayMode() {
        return this.displayMode;
    }

    public final List<UiEventOrder> component5() {
        return this.pendingOrders;
    }

    public final ContractListData copy(EventContract contract, UiEventContractPosition position, EventQuote quote, EventDetailDisplayDataBottomSheet displayMode, List<UiEventOrder> pendingOrders) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        return new ContractListData(contract, position, quote, displayMode, pendingOrders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractListData)) {
            return false;
        }
        ContractListData contractListData = (ContractListData) other;
        return Intrinsics.areEqual(this.contract, contractListData.contract) && Intrinsics.areEqual(this.position, contractListData.position) && Intrinsics.areEqual(this.quote, contractListData.quote) && this.displayMode == contractListData.displayMode && Intrinsics.areEqual(this.pendingOrders, contractListData.pendingOrders);
    }

    public int hashCode() {
        int iHashCode = this.contract.hashCode() * 31;
        UiEventContractPosition uiEventContractPosition = this.position;
        int iHashCode2 = (iHashCode + (uiEventContractPosition == null ? 0 : uiEventContractPosition.hashCode())) * 31;
        EventQuote eventQuote = this.quote;
        return ((((iHashCode2 + (eventQuote != null ? eventQuote.hashCode() : 0)) * 31) + this.displayMode.hashCode()) * 31) + this.pendingOrders.hashCode();
    }

    public String toString() {
        return "ContractListData(contract=" + this.contract + ", position=" + this.position + ", quote=" + this.quote + ", displayMode=" + this.displayMode + ", pendingOrders=" + this.pendingOrders + ")";
    }

    public ContractListData(EventContract contract, UiEventContractPosition uiEventContractPosition, EventQuote eventQuote, EventDetailDisplayDataBottomSheet displayMode, List<UiEventOrder> pendingOrders) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        this.contract = contract;
        this.position = uiEventContractPosition;
        this.quote = eventQuote;
        this.displayMode = displayMode;
        this.pendingOrders = pendingOrders;
    }

    public final EventContract getContract() {
        return this.contract;
    }

    public final UiEventContractPosition getPosition() {
        return this.position;
    }

    public final EventQuote getQuote() {
        return this.quote;
    }

    public final EventDetailDisplayDataBottomSheet getDisplayMode() {
        return this.displayMode;
    }

    public /* synthetic */ ContractListData(EventContract eventContract, UiEventContractPosition uiEventContractPosition, EventQuote eventQuote, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventContract, uiEventContractPosition, eventQuote, eventDetailDisplayDataBottomSheet, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<UiEventOrder> getPendingOrders() {
        return this.pendingOrders;
    }
}
