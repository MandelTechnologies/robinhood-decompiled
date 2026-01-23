package eoy_giveaway.p456v1;

import com.plaid.internal.EnumC7081g;
import eoy_giveaway.p456v1.EndOfYearGiveawayService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EndOfYearGiveawayService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Leoy_giveaway/v1/HandleCanvasMessageResponseDto;", "request", "Leoy_giveaway/v1/HandleCanvasMessageRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "eoy_giveaway.v1.EndOfYearGiveawayService_Adapter$HandleCanvasMessageEndpoint$call$1", m3645f = "EndOfYearGiveawayService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: eoy_giveaway.v1.EndOfYearGiveawayService_Adapter$HandleCanvasMessageEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EndOfYearGiveawayService_Adapter2 extends ContinuationImpl7 implements Function2<HandleCanvasMessageRequestDto, Continuation<? super HandleCanvasMessageResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EndOfYearGiveawayService_Adapter.HandleCanvasMessageEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EndOfYearGiveawayService_Adapter2(EndOfYearGiveawayService_Adapter.HandleCanvasMessageEndpoint handleCanvasMessageEndpoint, Continuation<? super EndOfYearGiveawayService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = handleCanvasMessageEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EndOfYearGiveawayService_Adapter2 endOfYearGiveawayService_Adapter2 = new EndOfYearGiveawayService_Adapter2(this.this$0, continuation);
        endOfYearGiveawayService_Adapter2.L$0 = obj;
        return endOfYearGiveawayService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HandleCanvasMessageRequestDto handleCanvasMessageRequestDto, Continuation<? super HandleCanvasMessageResponseDto> continuation) {
        return ((EndOfYearGiveawayService_Adapter2) create(handleCanvasMessageRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        HandleCanvasMessageRequestDto handleCanvasMessageRequestDto = (HandleCanvasMessageRequestDto) this.L$0;
        EndOfYearGiveawayService endOfYearGiveawayService = this.this$0.service;
        this.label = 1;
        Object objHandleCanvasMessage = endOfYearGiveawayService.HandleCanvasMessage(handleCanvasMessageRequestDto, this);
        return objHandleCanvasMessage == coroutine_suspended ? coroutine_suspended : objHandleCanvasMessage;
    }
}
