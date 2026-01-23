package com.robinhood.android.feature.livetrivia;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import trivia.p550v1.CloseButtonTappedRequestDto;
import trivia.p550v1.GoldTriviaService;

/* compiled from: LiveTriviaDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$closeTrivia$1$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$closeTrivia$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class LiveTriviaDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LiveTriviaDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveTriviaDuxo2(LiveTriviaDuxo liveTriviaDuxo, Continuation<? super LiveTriviaDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = liveTriviaDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveTriviaDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveTriviaDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GoldTriviaService goldTriviaService = this.this$0.clientService;
            CloseButtonTappedRequestDto closeButtonTappedRequestDto = new CloseButtonTappedRequestDto();
            this.label = 1;
            if (goldTriviaService.CloseButtonTapped(closeButtonTappedRequestDto, this) == coroutine_suspended) {
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
