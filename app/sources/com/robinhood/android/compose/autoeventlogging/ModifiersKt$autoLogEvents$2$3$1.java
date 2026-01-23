package com.robinhood.android.compose.autoeventlogging;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.compose.bento.util.PointerInputScopes;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: Modifiers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
final class ModifiersKt$autoLogEvents$2$3$1 implements PointerInputEventHandler {
    final /* synthetic */ UserInteractionEventDescriptor $currentEventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $logPerformance;

    ModifiersKt$autoLogEvents$2$3$1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z) {
        this.$eventLogger = eventLogger;
        this.$currentEventDescriptor = userInteractionEventDescriptor;
        this.$logPerformance = z;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final EventLogger eventLogger = this.$eventLogger;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$currentEventDescriptor;
        final boolean z = this.$logPerformance;
        Object objDetectTapUnconsumed = PointerInputScopes.detectTapUnconsumed(pointerInputScope, new Function1() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifiersKt$autoLogEvents$2$3$1.invoke$lambda$0(eventLogger, userInteractionEventDescriptor, z, (Offset) obj);
            }
        }, continuation);
        return objDetectTapUnconsumed == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapUnconsumed : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, Offset offset) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.TAP), z, false, 4, null);
        return Unit.INSTANCE;
    }
}
