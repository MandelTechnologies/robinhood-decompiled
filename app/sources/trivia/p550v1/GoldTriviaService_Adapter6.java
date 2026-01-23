package trivia.p550v1;

import com.plaid.internal.EnumC7081g;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ltrivia/v1/VideoBufferingEndedResponseDto;", "request", "Ltrivia/v1/VideoBufferingEndedRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "trivia.v1.GoldTriviaService_Adapter$VideoBufferingEndedEndpoint$call$1", m3645f = "GoldTriviaService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
/* renamed from: trivia.v1.GoldTriviaService_Adapter$VideoBufferingEndedEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class GoldTriviaService_Adapter6 extends ContinuationImpl7 implements Function2<VideoBufferingEndedRequestDto, Continuation<? super VideoBufferingEndedResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldTriviaService_Adapter.VideoBufferingEndedEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldTriviaService_Adapter6(GoldTriviaService_Adapter.VideoBufferingEndedEndpoint videoBufferingEndedEndpoint, Continuation<? super GoldTriviaService_Adapter6> continuation) {
        super(2, continuation);
        this.this$0 = videoBufferingEndedEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldTriviaService_Adapter6 goldTriviaService_Adapter6 = new GoldTriviaService_Adapter6(this.this$0, continuation);
        goldTriviaService_Adapter6.L$0 = obj;
        return goldTriviaService_Adapter6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(VideoBufferingEndedRequestDto videoBufferingEndedRequestDto, Continuation<? super VideoBufferingEndedResponseDto> continuation) {
        return ((GoldTriviaService_Adapter6) create(videoBufferingEndedRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        VideoBufferingEndedRequestDto videoBufferingEndedRequestDto = (VideoBufferingEndedRequestDto) this.L$0;
        GoldTriviaService goldTriviaService = this.this$0.service;
        this.label = 1;
        Object objVideoBufferingEnded = goldTriviaService.VideoBufferingEnded(videoBufferingEndedRequestDto, this);
        return objVideoBufferingEnded == coroutine_suspended ? coroutine_suspended : objVideoBufferingEnded;
    }
}
