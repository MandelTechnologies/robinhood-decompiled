package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: LiveEventCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class LiveEventCardKt$LiveEventCard$4$1$12$1 implements Function0<Unit> {
    final /* synthetic */ HubNavigationCallbacks $callbacks;
    final /* synthetic */ LiveEventCardViewState $state;

    LiveEventCardKt$LiveEventCard$4$1$12$1(HubNavigationCallbacks hubNavigationCallbacks, LiveEventCardViewState liveEventCardViewState) {
        this.$callbacks = hubNavigationCallbacks;
        this.$state = liveEventCardViewState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callbacks.quotePillClicked(this.$state.getEventId(), this.$state.getLeftContractViewState().getContractId());
    }
}
