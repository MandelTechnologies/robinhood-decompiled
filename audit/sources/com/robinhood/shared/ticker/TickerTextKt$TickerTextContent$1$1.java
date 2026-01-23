package com.robinhood.shared.ticker;

import com.robinhood.shared.ticker.internal.TickerTextAnimationState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TickerText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.ticker.TickerTextKt$TickerTextContent$1$1", m3645f = "TickerText.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class TickerTextKt$TickerTextContent$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TickerTextAnimationState $animationState;
    final /* synthetic */ String $text;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TickerTextKt$TickerTextContent$1$1(TickerTextAnimationState tickerTextAnimationState, String str, Continuation<? super TickerTextKt$TickerTextContent$1$1> continuation) {
        super(2, continuation);
        this.$animationState = tickerTextAnimationState;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TickerTextKt$TickerTextContent$1$1(this.$animationState, this.$text, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TickerTextKt$TickerTextContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$animationState.updateText(this.$text);
        return Unit.INSTANCE;
    }
}
