package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventCard.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$2$1", m3645f = "EventCard.kt", m3646l = {111}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventCard3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<STATE> $currentState$delegate;
    final /* synthetic */ SnapshotState4<Function0<Unit>> $reset$delegate;
    final /* synthetic */ SnapshotState4<STATE> $targetState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventCard3(SnapshotState4<? extends STATE> snapshotState4, SnapshotState<STATE> snapshotState, SnapshotState4<? extends Function0<Unit>> snapshotState42, Continuation<? super EventCard3> continuation) {
        super(2, continuation);
        this.$targetState$delegate = snapshotState4;
        this.$currentState$delegate = snapshotState;
        this.$reset$delegate = snapshotState42;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventCard3(this.$targetState$delegate, this.$currentState$delegate, this.$reset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventCard3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final SnapshotState4<STATE> snapshotState4 = this.$targetState$delegate;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventCard.access$FlipBox$lambda$6(snapshotState4);
                }
            });
            C165352 c165352 = new C165352(this.$currentState$delegate, this.$reset$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowSnapshotFlow, c165352, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [STATE] */
    /* compiled from: EventCard.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "STATE", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$2$1$2", m3645f = "EventCard.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.EventCardKt$FlipBox$2$1$2 */
    static final class C165352<STATE> extends ContinuationImpl7 implements Function2<STATE, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<STATE> $currentState$delegate;
        final /* synthetic */ SnapshotState4<Function0<Unit>> $reset$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C165352(SnapshotState<STATE> snapshotState, SnapshotState4<? extends Function0<Unit>> snapshotState4, Continuation<? super C165352> continuation) {
            super(2, continuation);
            this.$currentState$delegate = snapshotState;
            this.$reset$delegate = snapshotState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C165352 c165352 = new C165352(this.$currentState$delegate, this.$reset$delegate, continuation);
            c165352.L$0 = obj;
            return c165352;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke2((C165352<STATE>) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(STATE state, Continuation<? super Unit> continuation) {
            return ((C165352) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$currentState$delegate.setValue(this.L$0);
            EventCard.FlipBox$lambda$21(this.$reset$delegate).invoke();
            return Unit.INSTANCE;
        }
    }
}
