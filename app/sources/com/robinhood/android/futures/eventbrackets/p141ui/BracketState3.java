package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.coroutines.flow.Operators;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$1$1", m3645f = "BracketState.kt", m3646l = {115}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class BracketState3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BracketState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BracketState3(BracketState bracketState, Continuation<? super BracketState3> continuation) {
        super(2, continuation);
        this.this$0 = bracketState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BracketState3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BracketState3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final BracketState bracketState = this.this$0;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(BracketState3.invokeSuspend$lambda$0(bracketState));
                }
            });
            final BracketState bracketState2 = this.this$0;
            Flow flowConnectWhen$default = Operators.connectWhen$default(flowSnapshotFlow, SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(BracketState3.invokeSuspend$lambda$1(bracketState2));
                }
            }), null, 2, null);
            C172183 c172183 = new C172183(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowConnectWhen$default, c172183, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$0(BracketState bracketState) {
        if (bracketState.getCurrentFirstVisibleRoundHeight() == 0) {
            return 0.0f;
        }
        return RangesKt.coerceAtMost(bracketState.getVerticalScrollState().getValue() / bracketState.getCurrentFirstVisibleRoundHeight(), 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(BracketState bracketState) {
        return (bracketState.getHorizontalPagerState().isScrollInProgress() || bracketState.getVerticalScrollState().isScrollInProgress()) ? false : true;
    }

    /* compiled from: BracketState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "yPercentage", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$1$1$3", m3645f = "BracketState.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$1$1$3 */
    static final class C172183 extends ContinuationImpl7 implements Function2<Float, Continuation<? super Unit>, Object> {
        /* synthetic */ float F$0;
        int label;
        final /* synthetic */ BracketState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172183(BracketState bracketState, Continuation<? super C172183> continuation) {
            super(2, continuation);
            this.this$0 = bracketState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172183 c172183 = new C172183(this.this$0, continuation);
            c172183.F$0 = ((Number) obj).floatValue();
            return c172183;
        }

        public final Object invoke(float f, Continuation<? super Unit> continuation) {
            return ((C172183) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setLatestVerticalScrollYPercentage(this.F$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
