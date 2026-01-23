package com.robinhood.android.transfers.international.p266ui.amountinput;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AmountInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$BlinkingCursor$1$1", m3645f = "AmountInputComposable.kt", m3646l = {375}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$BlinkingCursor$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AmountInputComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isVisible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountInputComposable4(SnapshotState<Boolean> snapshotState, Continuation<? super AmountInputComposable4> continuation) {
        super(2, continuation);
        this.$isVisible = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AmountInputComposable4(this.$isVisible, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AmountInputComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final SnapshotState<Boolean> snapshotState = this.$isVisible;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$BlinkingCursor$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(AmountInputComposable4.invokeSuspend$lambda$0(snapshotState));
                }
            });
            C303392 c303392 = new C303392(this.$isVisible);
            this.label = 1;
            if (flowSnapshotFlow.collect(c303392, this) == coroutine_suspended) {
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

    /* compiled from: AmountInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$BlinkingCursor$1$1$2 */
    static final class C303392<T> implements FlowCollector {
        final /* synthetic */ SnapshotState<Boolean> $isVisible;

        C303392(SnapshotState<Boolean> snapshotState) {
            this.$isVisible = snapshotState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
            AmountInputComposable5 amountInputComposable5;
            if (continuation instanceof AmountInputComposable5) {
                amountInputComposable5 = (AmountInputComposable5) continuation;
                int i = amountInputComposable5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    amountInputComposable5.label = i - Integer.MIN_VALUE;
                } else {
                    amountInputComposable5 = new AmountInputComposable5(this, continuation);
                }
            }
            Object obj = amountInputComposable5.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = amountInputComposable5.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                amountInputComposable5.label = 1;
                if (DelayKt.delay(500L, amountInputComposable5) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$isVisible.setValue(boxing.boxBoolean(!r6.getValue().booleanValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(SnapshotState snapshotState) {
        return ((Boolean) snapshotState.getValue()).booleanValue();
    }
}
