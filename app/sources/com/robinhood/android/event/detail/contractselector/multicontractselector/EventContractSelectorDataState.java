package com.robinhood.android.event.detail.contractselector.multicontractselector;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.builders.BuildMultiContractList;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialogData;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.utils.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventMultiContractSelectorStates.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003J\u0015\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0003J\u0088\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00052\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u000b\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;", "", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "contractIdToContractListData", "", "Ljava/util/UUID;", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "swapsAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "isMarketOpen", "", "eventTradeOverlayDialog", "Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "contractIdToFundamentals", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;", "contractIdToOpenInterestDelta", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "<init>", "(Lcom/robinhood/android/models/event/ui/UiEcEvent;Ljava/util/Map;Lcom/robinhood/utils/Optional;Ljava/lang/Boolean;Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;Ljava/util/Map;Ljava/util/Map;)V", "getUiEvent", "()Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getContractIdToContractListData", "()Ljava/util/Map;", "getSwapsAccount", "()Lcom/robinhood/utils/Optional;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEventTradeOverlayDialog", "()Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "getContractIdToFundamentals", "getContractIdToOpenInterestDelta", "isTradeEnabled", "()Z", "contractList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "getContractList", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/android/models/event/ui/UiEcEvent;Ljava/util/Map;Lcom/robinhood/utils/Optional;Ljava/lang/Boolean;Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;Ljava/util/Map;Ljava/util/Map;)Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EventContractSelectorDataState {
    public static final int $stable = 8;
    private final Map<UUID, ContractListData> contractIdToContractListData;
    private final Map<UUID, EventFundamental> contractIdToFundamentals;
    private final Map<UUID, Delta> contractIdToOpenInterestDelta;
    private final EventTradeOverlayDialogData eventTradeOverlayDialog;
    private final Boolean isMarketOpen;
    private final Optional<FuturesAccount> swapsAccount;
    private final UiEcEvent uiEvent;

    public EventContractSelectorDataState() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ EventContractSelectorDataState copy$default(EventContractSelectorDataState eventContractSelectorDataState, UiEcEvent uiEcEvent, Map map, Optional optional, Boolean bool, EventTradeOverlayDialogData eventTradeOverlayDialogData, Map map2, Map map3, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEcEvent = eventContractSelectorDataState.uiEvent;
        }
        if ((i & 2) != 0) {
            map = eventContractSelectorDataState.contractIdToContractListData;
        }
        if ((i & 4) != 0) {
            optional = eventContractSelectorDataState.swapsAccount;
        }
        if ((i & 8) != 0) {
            bool = eventContractSelectorDataState.isMarketOpen;
        }
        if ((i & 16) != 0) {
            eventTradeOverlayDialogData = eventContractSelectorDataState.eventTradeOverlayDialog;
        }
        if ((i & 32) != 0) {
            map2 = eventContractSelectorDataState.contractIdToFundamentals;
        }
        if ((i & 64) != 0) {
            map3 = eventContractSelectorDataState.contractIdToOpenInterestDelta;
        }
        Map map4 = map2;
        Map map5 = map3;
        EventTradeOverlayDialogData eventTradeOverlayDialogData2 = eventTradeOverlayDialogData;
        Optional optional2 = optional;
        return eventContractSelectorDataState.copy(uiEcEvent, map, optional2, bool, eventTradeOverlayDialogData2, map4, map5);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEcEvent getUiEvent() {
        return this.uiEvent;
    }

    public final Map<UUID, ContractListData> component2() {
        return this.contractIdToContractListData;
    }

    public final Optional<FuturesAccount> component3() {
        return this.swapsAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsMarketOpen() {
        return this.isMarketOpen;
    }

    /* renamed from: component5, reason: from getter */
    public final EventTradeOverlayDialogData getEventTradeOverlayDialog() {
        return this.eventTradeOverlayDialog;
    }

    public final Map<UUID, EventFundamental> component6() {
        return this.contractIdToFundamentals;
    }

    public final Map<UUID, Delta> component7() {
        return this.contractIdToOpenInterestDelta;
    }

    public final EventContractSelectorDataState copy(UiEcEvent uiEvent, Map<UUID, ContractListData> contractIdToContractListData, Optional<FuturesAccount> swapsAccount, Boolean isMarketOpen, EventTradeOverlayDialogData eventTradeOverlayDialog, Map<UUID, EventFundamental> contractIdToFundamentals, Map<UUID, Delta> contractIdToOpenInterestDelta) {
        Intrinsics.checkNotNullParameter(contractIdToFundamentals, "contractIdToFundamentals");
        Intrinsics.checkNotNullParameter(contractIdToOpenInterestDelta, "contractIdToOpenInterestDelta");
        return new EventContractSelectorDataState(uiEvent, contractIdToContractListData, swapsAccount, isMarketOpen, eventTradeOverlayDialog, contractIdToFundamentals, contractIdToOpenInterestDelta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContractSelectorDataState)) {
            return false;
        }
        EventContractSelectorDataState eventContractSelectorDataState = (EventContractSelectorDataState) other;
        return Intrinsics.areEqual(this.uiEvent, eventContractSelectorDataState.uiEvent) && Intrinsics.areEqual(this.contractIdToContractListData, eventContractSelectorDataState.contractIdToContractListData) && Intrinsics.areEqual(this.swapsAccount, eventContractSelectorDataState.swapsAccount) && Intrinsics.areEqual(this.isMarketOpen, eventContractSelectorDataState.isMarketOpen) && Intrinsics.areEqual(this.eventTradeOverlayDialog, eventContractSelectorDataState.eventTradeOverlayDialog) && Intrinsics.areEqual(this.contractIdToFundamentals, eventContractSelectorDataState.contractIdToFundamentals) && Intrinsics.areEqual(this.contractIdToOpenInterestDelta, eventContractSelectorDataState.contractIdToOpenInterestDelta);
    }

    public int hashCode() {
        UiEcEvent uiEcEvent = this.uiEvent;
        int iHashCode = (uiEcEvent == null ? 0 : uiEcEvent.hashCode()) * 31;
        Map<UUID, ContractListData> map = this.contractIdToContractListData;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Optional<FuturesAccount> optional = this.swapsAccount;
        int iHashCode3 = (iHashCode2 + (optional == null ? 0 : optional.hashCode())) * 31;
        Boolean bool = this.isMarketOpen;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        EventTradeOverlayDialogData eventTradeOverlayDialogData = this.eventTradeOverlayDialog;
        return ((((iHashCode4 + (eventTradeOverlayDialogData != null ? eventTradeOverlayDialogData.hashCode() : 0)) * 31) + this.contractIdToFundamentals.hashCode()) * 31) + this.contractIdToOpenInterestDelta.hashCode();
    }

    public String toString() {
        return "EventContractSelectorDataState(uiEvent=" + this.uiEvent + ", contractIdToContractListData=" + this.contractIdToContractListData + ", swapsAccount=" + this.swapsAccount + ", isMarketOpen=" + this.isMarketOpen + ", eventTradeOverlayDialog=" + this.eventTradeOverlayDialog + ", contractIdToFundamentals=" + this.contractIdToFundamentals + ", contractIdToOpenInterestDelta=" + this.contractIdToOpenInterestDelta + ")";
    }

    public EventContractSelectorDataState(UiEcEvent uiEcEvent, Map<UUID, ContractListData> map, Optional<FuturesAccount> optional, Boolean bool, EventTradeOverlayDialogData eventTradeOverlayDialogData, Map<UUID, EventFundamental> contractIdToFundamentals, Map<UUID, Delta> contractIdToOpenInterestDelta) {
        Intrinsics.checkNotNullParameter(contractIdToFundamentals, "contractIdToFundamentals");
        Intrinsics.checkNotNullParameter(contractIdToOpenInterestDelta, "contractIdToOpenInterestDelta");
        this.uiEvent = uiEcEvent;
        this.contractIdToContractListData = map;
        this.swapsAccount = optional;
        this.isMarketOpen = bool;
        this.eventTradeOverlayDialog = eventTradeOverlayDialogData;
        this.contractIdToFundamentals = contractIdToFundamentals;
        this.contractIdToOpenInterestDelta = contractIdToOpenInterestDelta;
    }

    public final UiEcEvent getUiEvent() {
        return this.uiEvent;
    }

    public final Map<UUID, ContractListData> getContractIdToContractListData() {
        return this.contractIdToContractListData;
    }

    public final Optional<FuturesAccount> getSwapsAccount() {
        return this.swapsAccount;
    }

    public final Boolean isMarketOpen() {
        return this.isMarketOpen;
    }

    public final EventTradeOverlayDialogData getEventTradeOverlayDialog() {
        return this.eventTradeOverlayDialog;
    }

    public /* synthetic */ EventContractSelectorDataState(UiEcEvent uiEcEvent, Map map, Optional optional, Boolean bool, EventTradeOverlayDialogData eventTradeOverlayDialogData, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEcEvent, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : optional, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : eventTradeOverlayDialogData, (i & 32) != 0 ? MapsKt.emptyMap() : map2, (i & 64) != 0 ? MapsKt.emptyMap() : map3);
    }

    public final Map<UUID, EventFundamental> getContractIdToFundamentals() {
        return this.contractIdToFundamentals;
    }

    public final Map<UUID, Delta> getContractIdToOpenInterestDelta() {
        return this.contractIdToOpenInterestDelta;
    }

    public final boolean isTradeEnabled() {
        Event event;
        UiEcEvent uiEcEvent = this.uiEvent;
        String attestation = (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) ? null : event.getAttestation();
        Optional<FuturesAccount> optional = this.swapsAccount;
        FuturesAccount orNull = optional != null ? optional.getOrNull() : null;
        return Intrinsics.areEqual(this.isMarketOpen, Boolean.TRUE) || orNull == null || !FuturesAccount2.signedAttestation(orNull, attestation);
    }

    public final ImmutableList<ContractSelectorRowTreatmentViewState> getContractList() {
        Map<UUID, ContractListData> map = this.contractIdToContractListData;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<UUID, ContractListData>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ContractListData value = it.next().getValue();
            EventFundamental eventFundamental = this.contractIdToFundamentals.get(value.getContract().getContractId());
            ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewStateBuildContractSelectorRowTreatmentViewState = BuildMultiContractList.buildContractSelectorRowTreatmentViewState(value, false, true, eventFundamental != null ? eventFundamental.getOpenInterest() : null, this.contractIdToOpenInterestDelta.get(value.getContract().getContractId()), isTradeEnabled() && value.getContract().getTradability() != EventContractTradability.UNTRADABLE);
            if (contractSelectorRowTreatmentViewStateBuildContractSelectorRowTreatmentViewState != null) {
                arrayList.add(contractSelectorRowTreatmentViewStateBuildContractSelectorRowTreatmentViewState);
            }
        }
        return extensions2.toPersistentList(arrayList);
    }
}
