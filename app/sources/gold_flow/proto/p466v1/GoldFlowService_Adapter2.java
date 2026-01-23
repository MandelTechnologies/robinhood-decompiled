package gold_flow.proto.p466v1;

import com.plaid.internal.EnumC7081g;
import gold_flow.proto.p466v1.GoldFlowService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldFlowService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lgold_flow/proto/v1/SendActionResponseDto;", "request", "Lgold_flow/proto/v1/SendActionRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "gold_flow.proto.v1.GoldFlowService_Adapter$SendActionEndpoint$call$1", m3645f = "GoldFlowService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: gold_flow.proto.v1.GoldFlowService_Adapter$SendActionEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class GoldFlowService_Adapter2 extends ContinuationImpl7 implements Function2<SendActionRequestDto, Continuation<? super SendActionResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldFlowService_Adapter.SendActionEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldFlowService_Adapter2(GoldFlowService_Adapter.SendActionEndpoint sendActionEndpoint, Continuation<? super GoldFlowService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = sendActionEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldFlowService_Adapter2 goldFlowService_Adapter2 = new GoldFlowService_Adapter2(this.this$0, continuation);
        goldFlowService_Adapter2.L$0 = obj;
        return goldFlowService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SendActionRequestDto sendActionRequestDto, Continuation<? super SendActionResponseDto> continuation) {
        return ((GoldFlowService_Adapter2) create(sendActionRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SendActionRequestDto sendActionRequestDto = (SendActionRequestDto) this.L$0;
        GoldFlowService goldFlowService = this.this$0.service;
        this.label = 1;
        Object objSendAction = goldFlowService.SendAction(sendActionRequestDto, this);
        return objSendAction == coroutine_suspended ? coroutine_suspended : objSendAction;
    }
}
