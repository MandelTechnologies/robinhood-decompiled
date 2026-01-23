package trivia.p550v1;

import eoy_giveaway.p456v1.DismissProgramViewRequestDto;
import eoy_giveaway.p456v1.DismissProgramViewResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import trivia.p550v1.GoldTriviaClientService_Adapter;

/* compiled from: GoldTriviaClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "request", "Leoy_giveaway/v1/DismissProgramViewRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "trivia.v1.GoldTriviaClientService_Adapter$DismissProgramViewEndpoint$call$1", m3645f = "GoldTriviaClientService_Adapter.kt", m3646l = {77}, m3647m = "invokeSuspend")
/* renamed from: trivia.v1.GoldTriviaClientService_Adapter$DismissProgramViewEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class GoldTriviaClientService_Adapter2 extends ContinuationImpl7 implements Function2<DismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldTriviaClientService_Adapter.DismissProgramViewEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldTriviaClientService_Adapter2(GoldTriviaClientService_Adapter.DismissProgramViewEndpoint dismissProgramViewEndpoint, Continuation<? super GoldTriviaClientService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = dismissProgramViewEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldTriviaClientService_Adapter2 goldTriviaClientService_Adapter2 = new GoldTriviaClientService_Adapter2(this.this$0, continuation);
        goldTriviaClientService_Adapter2.L$0 = obj;
        return goldTriviaClientService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation) {
        return ((GoldTriviaClientService_Adapter2) create(dismissProgramViewRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DismissProgramViewRequestDto dismissProgramViewRequestDto = (DismissProgramViewRequestDto) this.L$0;
        GoldTriviaClientService goldTriviaClientService = this.this$0.service;
        this.label = 1;
        Object objDismissProgramView = goldTriviaClientService.DismissProgramView(dismissProgramViewRequestDto, this);
        return objDismissProgramView == coroutine_suspended ? coroutine_suspended : objDismissProgramView;
    }
}
