package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.coroutines.flow.Operators;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1", m3645f = "BracketState.kt", m3646l = {150}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class BracketState5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BracketState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BracketState5(BracketState bracketState, Continuation<? super BracketState5> continuation) {
        super(2, continuation);
        this.this$0 = bracketState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BracketState5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BracketState5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final BracketState bracketState = this.this$0;
            Flow flowConnectWhen$default = Operators.connectWhen$default(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BracketState5.invokeSuspend$lambda$0(bracketState);
                }
            }), this.this$0.navigationState.streamNoLocationChangeInProgress(), null, 2, null);
            final BracketState bracketState2 = this.this$0;
            Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(flowConnectWhen$default, SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(BracketState5.invokeSuspend$lambda$1(bracketState2));
                }
            }), null, 2, null), new C17216x22aaebb6(null, this.this$0));
            C172204 c172204 = new C172204(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowTransformLatest, c172204, this) == coroutine_suspended) {
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
    public static final Tuples2 invokeSuspend$lambda$0(BracketState bracketState) {
        int currentFirstVisibleRoundHeight = bracketState.getCurrentFirstVisibleRoundHeight();
        int currentSecondVisibleRoundCardHeightWithoutSpacers = bracketState.getCurrentSecondVisibleRoundCardHeightWithoutSpacers();
        float latestVerticalScrollYPercentage = bracketState.getLatestVerticalScrollYPercentage();
        int maxHeight = bracketState.getMaxHeight();
        return Tuples4.m3642to(Integer.valueOf(RangesKt.coerceAtMost(MathKt.roundToInt(currentFirstVisibleRoundHeight * latestVerticalScrollYPercentage), maxHeight >= currentFirstVisibleRoundHeight ? 0 : currentFirstVisibleRoundHeight - maxHeight)), Integer.valueOf(RangesKt.coerceAtMost(MathKt.roundToInt(currentSecondVisibleRoundCardHeightWithoutSpacers * latestVerticalScrollYPercentage), maxHeight < currentSecondVisibleRoundCardHeightWithoutSpacers ? currentSecondVisibleRoundCardHeightWithoutSpacers - maxHeight : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(BracketState bracketState) {
        return bracketState.getHorizontalPagerState().isScrollInProgress();
    }

    /* compiled from: BracketState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$4", m3645f = "BracketState.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$4 */
    static final class C172204 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ BracketState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172204(BracketState bracketState, Continuation<? super C172204> continuation) {
            super(2, continuation);
            this.this$0 = bracketState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172204 c172204 = new C172204(this.this$0, continuation);
            c172204.I$0 = ((Number) obj).intValue();
            return c172204;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((C172204) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                ScrollState verticalScrollState = this.this$0.getVerticalScrollState();
                this.label = 1;
                if (verticalScrollState.scrollTo(i2, this) == coroutine_suspended) {
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
}
