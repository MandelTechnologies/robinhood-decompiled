package com.robinhood.android.event.history.p131ui.order;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;", "", "eventOrder", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "cancelInProgress", "", "gtdTimeInForce", "Lcom/robinhood/utils/resource/StringResource;", "displayDetail", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "<init>", "(Lcom/robinhood/android/models/event/db/order/UiEventOrder;Lcom/robinhood/android/models/event/db/arsenal/EventContract;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/Optional;)V", "getEventOrder", "()Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "getContract", "()Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "getCancelInProgress", "()Z", "getGtdTimeInForce", "()Lcom/robinhood/utils/resource/StringResource;", "getDisplayDetail", "()Lcom/robinhood/utils/Optional;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventOrderDetailDataState {
    public static final int $stable = 8;
    private final boolean cancelInProgress;
    private final EventContract contract;
    private final Optional<ContractDisplayDetails> displayDetail;
    private final UiEventOrder eventOrder;
    private final StringResource gtdTimeInForce;

    public EventOrderDetailDataState() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ EventOrderDetailDataState copy$default(EventOrderDetailDataState eventOrderDetailDataState, UiEventOrder uiEventOrder, EventContract eventContract, boolean z, StringResource stringResource, Optional optional, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEventOrder = eventOrderDetailDataState.eventOrder;
        }
        if ((i & 2) != 0) {
            eventContract = eventOrderDetailDataState.contract;
        }
        if ((i & 4) != 0) {
            z = eventOrderDetailDataState.cancelInProgress;
        }
        if ((i & 8) != 0) {
            stringResource = eventOrderDetailDataState.gtdTimeInForce;
        }
        if ((i & 16) != 0) {
            optional = eventOrderDetailDataState.displayDetail;
        }
        Optional optional2 = optional;
        boolean z2 = z;
        return eventOrderDetailDataState.copy(uiEventOrder, eventContract, z2, stringResource, optional2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEventOrder getEventOrder() {
        return this.eventOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final EventContract getContract() {
        return this.contract;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getGtdTimeInForce() {
        return this.gtdTimeInForce;
    }

    public final Optional<ContractDisplayDetails> component5() {
        return this.displayDetail;
    }

    public final EventOrderDetailDataState copy(UiEventOrder eventOrder, EventContract contract, boolean cancelInProgress, StringResource gtdTimeInForce, Optional<ContractDisplayDetails> displayDetail) {
        return new EventOrderDetailDataState(eventOrder, contract, cancelInProgress, gtdTimeInForce, displayDetail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventOrderDetailDataState)) {
            return false;
        }
        EventOrderDetailDataState eventOrderDetailDataState = (EventOrderDetailDataState) other;
        return Intrinsics.areEqual(this.eventOrder, eventOrderDetailDataState.eventOrder) && Intrinsics.areEqual(this.contract, eventOrderDetailDataState.contract) && this.cancelInProgress == eventOrderDetailDataState.cancelInProgress && Intrinsics.areEqual(this.gtdTimeInForce, eventOrderDetailDataState.gtdTimeInForce) && Intrinsics.areEqual(this.displayDetail, eventOrderDetailDataState.displayDetail);
    }

    public int hashCode() {
        UiEventOrder uiEventOrder = this.eventOrder;
        int iHashCode = (uiEventOrder == null ? 0 : uiEventOrder.hashCode()) * 31;
        EventContract eventContract = this.contract;
        int iHashCode2 = (((iHashCode + (eventContract == null ? 0 : eventContract.hashCode())) * 31) + Boolean.hashCode(this.cancelInProgress)) * 31;
        StringResource stringResource = this.gtdTimeInForce;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Optional<ContractDisplayDetails> optional = this.displayDetail;
        return iHashCode3 + (optional != null ? optional.hashCode() : 0);
    }

    public String toString() {
        return "EventOrderDetailDataState(eventOrder=" + this.eventOrder + ", contract=" + this.contract + ", cancelInProgress=" + this.cancelInProgress + ", gtdTimeInForce=" + this.gtdTimeInForce + ", displayDetail=" + this.displayDetail + ")";
    }

    public EventOrderDetailDataState(UiEventOrder uiEventOrder, EventContract eventContract, boolean z, StringResource stringResource, Optional<ContractDisplayDetails> optional) {
        this.eventOrder = uiEventOrder;
        this.contract = eventContract;
        this.cancelInProgress = z;
        this.gtdTimeInForce = stringResource;
        this.displayDetail = optional;
    }

    public /* synthetic */ EventOrderDetailDataState(UiEventOrder uiEventOrder, EventContract eventContract, boolean z, StringResource stringResource, Optional optional, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEventOrder, (i & 2) != 0 ? null : eventContract, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : stringResource, (i & 16) != 0 ? null : optional);
    }

    public final UiEventOrder getEventOrder() {
        return this.eventOrder;
    }

    public final EventContract getContract() {
        return this.contract;
    }

    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    public final StringResource getGtdTimeInForce() {
        return this.gtdTimeInForce;
    }

    public final Optional<ContractDisplayDetails> getDisplayDetail() {
        return this.displayDetail;
    }
}
