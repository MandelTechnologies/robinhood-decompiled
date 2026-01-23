package trivia.p550v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import trivia.p550v1.GoldTriviaService_Adapter;

/* compiled from: GoldTriviaService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ltrivia/v1/CloseButtonTappedResponseDto;", "request", "Ltrivia/v1/CloseButtonTappedRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "trivia.v1.GoldTriviaService_Adapter$CloseButtonTappedEndpoint$call$1", m3645f = "GoldTriviaService_Adapter.kt", m3646l = {155}, m3647m = "invokeSuspend")
/* renamed from: trivia.v1.GoldTriviaService_Adapter$CloseButtonTappedEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class GoldTriviaService_Adapter3 extends ContinuationImpl7 implements Function2<CloseButtonTappedRequestDto, Continuation<? super CloseButtonTappedResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldTriviaService_Adapter.CloseButtonTappedEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldTriviaService_Adapter3(GoldTriviaService_Adapter.CloseButtonTappedEndpoint closeButtonTappedEndpoint, Continuation<? super GoldTriviaService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = closeButtonTappedEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldTriviaService_Adapter3 goldTriviaService_Adapter3 = new GoldTriviaService_Adapter3(this.this$0, continuation);
        goldTriviaService_Adapter3.L$0 = obj;
        return goldTriviaService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CloseButtonTappedRequestDto closeButtonTappedRequestDto, Continuation<? super CloseButtonTappedResponseDto> continuation) {
        return ((GoldTriviaService_Adapter3) create(closeButtonTappedRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CloseButtonTappedRequestDto closeButtonTappedRequestDto = (CloseButtonTappedRequestDto) this.L$0;
        GoldTriviaService goldTriviaService = this.this$0.service;
        this.label = 1;
        Object objCloseButtonTapped = goldTriviaService.CloseButtonTapped(closeButtonTappedRequestDto, this);
        return objCloseButtonTapped == coroutine_suspended ? coroutine_suspended : objCloseButtonTapped;
    }
}
