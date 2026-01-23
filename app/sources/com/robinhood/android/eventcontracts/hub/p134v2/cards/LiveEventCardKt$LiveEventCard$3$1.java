package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveEventCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class LiveEventCardKt$LiveEventCard$3$1 implements PointerInputEventHandler {
    final /* synthetic */ HubNavigationCallbacks $callbacks;
    final /* synthetic */ SnapshotFloatState2 $cardWidth$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ LiveEventCardViewState $state;

    LiveEventCardKt$LiveEventCard$3$1(LiveEventCardViewState liveEventCardViewState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, HubNavigationCallbacks hubNavigationCallbacks, SnapshotFloatState2 snapshotFloatState2) {
        this.$state = liveEventCardViewState;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$callbacks = hubNavigationCallbacks;
        this.$cardWidth$delegate = snapshotFloatState2;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final LiveEventCardViewState liveEventCardViewState = this.$state;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final EventLogger eventLogger = this.$eventLogger;
        final HubNavigationCallbacks hubNavigationCallbacks = this.$callbacks;
        final SnapshotFloatState2 snapshotFloatState2 = this.$cardWidth$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEventCardKt$LiveEventCard$3$1.invoke$lambda$0(liveEventCardViewState, userInteractionEventDescriptor, eventLogger, hubNavigationCallbacks, snapshotFloatState2, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(LiveEventCardViewState liveEventCardViewState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, HubNavigationCallbacks hubNavigationCallbacks, SnapshotFloatState2 snapshotFloatState2, Offset offset) {
        UUID contractId;
        if (Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)) < snapshotFloatState2.getFloatValue() / 2) {
            contractId = liveEventCardViewState.getLeftContractViewState().getContractId();
        } else {
            contractId = liveEventCardViewState.getRightContractViewState().getContractId();
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, "event-card-row-" + contractId, null, 4, null), new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null), userInteractionEventDescriptor.getContext(), false, 33, null);
        hubNavigationCallbacks.navigateToEventDetail(liveEventCardViewState.getEventId(), contractId);
        return Unit.INSTANCE;
    }
}
