package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventCard.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$1$1", m3645f = "EventCard.kt", m3646l = {97}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventCard2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotFloatState2 $alpha$delegate;
    final /* synthetic */ SnapshotState<STATE> $currentState$delegate;
    final /* synthetic */ SnapshotFloatState2 $flipRotation$delegate;
    final /* synthetic */ SnapshotState4<Function0<Unit>> $reset$delegate;
    final /* synthetic */ SnapshotState4<STATE> $targetState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventCard2(SnapshotState4<? extends Function0<Unit>> snapshotState4, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState4<? extends STATE> snapshotState42, SnapshotState<STATE> snapshotState, Continuation<? super EventCard2> continuation) {
        super(2, continuation);
        this.$reset$delegate = snapshotState4;
        this.$flipRotation$delegate = snapshotFloatState2;
        this.$alpha$delegate = snapshotFloatState22;
        this.$targetState$delegate = snapshotState42;
        this.$currentState$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventCard2(this.$reset$delegate, this.$flipRotation$delegate, this.$alpha$delegate, this.$targetState$delegate, this.$currentState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventCard2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventCard2 eventCard2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventCard.FlipBox$lambda$21(this.$reset$delegate).invoke();
            TweenSpec tweenSpec = EventCard.animationSpec;
            final SnapshotFloatState2 snapshotFloatState2 = this.$flipRotation$delegate;
            final SnapshotFloatState2 snapshotFloatState22 = this.$alpha$delegate;
            Function2 function2 = new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EventCard2.invokeSuspend$lambda$0(snapshotFloatState2, snapshotFloatState22, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            eventCard2 = this;
            if (SuspendAnimation.animate$default(0.0f, 1.0f, 0.0f, tweenSpec, function2, eventCard2, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            eventCard2 = this;
        }
        eventCard2.$currentState$delegate.setValue(eventCard2.$targetState$delegate.getValue());
        EventCard.FlipBox$lambda$21(eventCard2.$reset$delegate).invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, float f, float f2) {
        float fLerp;
        snapshotFloatState2.setFloatValue(MathHelpers.lerp(0.0f, 180.0f, f));
        if (f < 0.5f) {
            fLerp = MathHelpers.lerp(1.0f, 0.0f, f * 2.0f);
        } else {
            fLerp = MathHelpers.lerp(0.0f, 1.0f, (f * 2.0f) - 1.0f);
        }
        snapshotFloatState22.setFloatValue(fLerp);
        return Unit.INSTANCE;
    }
}
