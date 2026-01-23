package com.robinhood.android.event.detail;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.event.detail.EventDetailLiveDataSectionViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: EventDetailLiveDataSection.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "<init>", "()V", "leftContractState", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;", "getLeftContractState", "()Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState$ContractViewState;", "rightContractState", "getRightContractState", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "getSecondaryText", "baseState", "getBaseState", "()Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.EventDetailLiveDataSectionParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class EventDetailLiveDataSection8 implements PreviewParameterProvider<EventDetailLiveDataSectionViewState> {
    private final EventDetailLiveDataSectionViewState baseState;
    private final EventDetailLiveDataSectionViewState.ContractViewState leftContractState;
    private final StringResource primaryText;
    private final EventDetailLiveDataSectionViewState.ContractViewState rightContractState;
    private final StringResource secondaryText;
    private final Sequence<EventDetailLiveDataSectionViewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public EventDetailLiveDataSection8() {
        EventDetailLiveDataSectionViewState.ContractViewState contractViewState = new EventDetailLiveDataSectionViewState.ContractViewState(true, "28");
        this.leftContractState = contractViewState;
        EventDetailLiveDataSectionViewState.ContractViewState contractViewState2 = new EventDetailLiveDataSectionViewState.ContractViewState(false, "14");
        this.rightContractState = contractViewState2;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("1st & 10 @ PIT 4");
        this.primaryText = stringResourceInvoke;
        StringResource stringResourceInvoke2 = companion.invoke("Q2 8:45");
        this.secondaryText = stringResourceInvoke2;
        Color.Companion companion2 = Color.INSTANCE;
        EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState = new EventDetailLiveDataSectionViewState(contractViewState, contractViewState2, new DayNightColor(companion2.m6724getRed0d7_KjU(), companion2.m6724getRed0d7_KjU(), null), new DayNightColor(companion2.m6717getBlue0d7_KjU(), companion2.m6717getBlue0d7_KjU(), null), stringResourceInvoke, stringResourceInvoke2);
        this.baseState = eventDetailLiveDataSectionViewState;
        this.values = SequencesKt.sequenceOf(eventDetailLiveDataSectionViewState, EventDetailLiveDataSectionViewState.copy$default(eventDetailLiveDataSectionViewState, EventDetailLiveDataSectionViewState.ContractViewState.copy$default(contractViewState, false, null, 2, null), EventDetailLiveDataSectionViewState.ContractViewState.copy$default(contractViewState2, true, null, 2, null), null, null, null, null, 60, null), EventDetailLiveDataSectionViewState.copy$default(eventDetailLiveDataSectionViewState, null, null, null, null, null, null, 31, null), EventDetailLiveDataSectionViewState.copy$default(eventDetailLiveDataSectionViewState, null, null, null, null, companion.invoke("1st & 10 @ PIT but longer longer longer text that will for sure overflow"), null, 47, null), EventDetailLiveDataSectionViewState.copy$default(eventDetailLiveDataSectionViewState, null, null, null, null, null, companion.invoke("Q2 8:45 but longer longer longer text that will for sure overflow"), 31, null), EventDetailLiveDataSectionViewState.copy$default(eventDetailLiveDataSectionViewState, null, null, null, null, null, null, 28, null));
    }

    public final EventDetailLiveDataSectionViewState.ContractViewState getLeftContractState() {
        return this.leftContractState;
    }

    public final EventDetailLiveDataSectionViewState.ContractViewState getRightContractState() {
        return this.rightContractState;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final EventDetailLiveDataSectionViewState getBaseState() {
        return this.baseState;
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<EventDetailLiveDataSectionViewState> getValues() {
        return this.values;
    }
}
