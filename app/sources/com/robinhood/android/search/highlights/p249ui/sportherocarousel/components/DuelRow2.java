package com.robinhood.android.search.highlights.p249ui.sportherocarousel.components;

import androidx.compose.runtime.SnapshotFloatState2;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p479j$.time.Instant;

/* compiled from: DuelRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$FloatingDeltaText$1$1", m3645f = "DuelRow.kt", m3646l = {200}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$FloatingDeltaText$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class DuelRow2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FloatingOpenInterestDelta $delta;
    final /* synthetic */ SnapshotFloatState2 $progress$delegate;
    final /* synthetic */ SharedFlow<Instant> $timeFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DuelRow2(SharedFlow<Instant> sharedFlow, FloatingOpenInterestDelta floatingOpenInterestDelta, SnapshotFloatState2 snapshotFloatState2, Continuation<? super DuelRow2> continuation) {
        super(2, continuation);
        this.$timeFlow = sharedFlow;
        this.$delta = floatingOpenInterestDelta;
        this.$progress$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DuelRow2(this.$timeFlow, this.$delta, this.$progress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DuelRow2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DuelRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "now", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$FloatingDeltaText$1$1$1", m3645f = "DuelRow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$FloatingDeltaText$1$1$1 */
    static final class C280171 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
        final /* synthetic */ FloatingOpenInterestDelta $delta;
        final /* synthetic */ SnapshotFloatState2 $progress$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C280171(FloatingOpenInterestDelta floatingOpenInterestDelta, SnapshotFloatState2 snapshotFloatState2, Continuation<? super C280171> continuation) {
            super(2, continuation);
            this.$delta = floatingOpenInterestDelta;
            this.$progress$delegate = snapshotFloatState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C280171 c280171 = new C280171(this.$delta, this.$progress$delegate, continuation);
            c280171.L$0 = obj;
            return c280171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
            return ((C280171) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$progress$delegate.setFloatValue(FloatingOpenInterestDelta2.getLINEAR_OUT_FAST_IN_RAMP_UP_EASING().transform(this.$delta.progress((Instant) this.L$0)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<Instant> sharedFlow = this.$timeFlow;
            C280171 c280171 = new C280171(this.$delta, this.$progress$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, c280171, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
