package com.robinhood.android.futures.eventbrackets.p141ui;

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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$2$1", m3645f = "BracketState.kt", m3646l = {125}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class BracketState4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BracketState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BracketState4(BracketState bracketState, Continuation<? super BracketState4> continuation) {
        super(2, continuation);
        this.this$0 = bracketState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BracketState4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BracketState4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final BracketState bracketState = this.this$0;
            Flow flowConnectWhen$default = Operators.connectWhen$default(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BracketState4.invokeSuspend$lambda$0(bracketState);
                }
            }), this.this$0.navigationState.streamNoLocationChangeInProgress(), null, 2, null);
            C172192 c172192 = new C172192(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowConnectWhen$default, c172192, this) == coroutine_suspended) {
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
        return Tuples4.m3642to(Integer.valueOf(bracketState.getFirstVisiblePage()), Float.valueOf(bracketState.getLatestVerticalScrollYPercentage()));
    }

    /* compiled from: BracketState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$2$1$2", m3645f = "BracketState.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$2$1$2 */
    static final class C172192 extends ContinuationImpl7 implements Function2<Tuples2<? extends Integer, ? extends Float>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BracketState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172192(BracketState bracketState, Continuation<? super C172192> continuation) {
            super(2, continuation);
            this.this$0 = bracketState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C172192 c172192 = new C172192(this.this$0, continuation);
            c172192.L$0 = obj;
            return c172192;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Integer, ? extends Float> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<Integer, Float>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Integer, Float> tuples2, Continuation<? super Unit> continuation) {
            return ((C172192) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                this.this$0.navigationState.onCurrentRoundIndexChange(((Number) tuples2.component1()).intValue(), ((Number) tuples2.component2()).floatValue());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
