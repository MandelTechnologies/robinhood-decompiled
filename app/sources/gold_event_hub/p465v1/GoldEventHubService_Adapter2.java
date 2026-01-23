package gold_event_hub.p465v1;

import eoy_giveaway.p456v1.UpdateAppStateRequestDto;
import eoy_giveaway.p456v1.UpdateAppStateResponseDto;
import gold_event_hub.p465v1.GoldEventHubService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldEventHubService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Leoy_giveaway/v1/UpdateAppStateResponseDto;", "request", "Leoy_giveaway/v1/UpdateAppStateRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "gold_event_hub.v1.GoldEventHubService_Adapter$UpdateAppStateEndpoint$call$1", m3645f = "GoldEventHubService_Adapter.kt", m3646l = {92}, m3647m = "invokeSuspend")
/* renamed from: gold_event_hub.v1.GoldEventHubService_Adapter$UpdateAppStateEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class GoldEventHubService_Adapter2 extends ContinuationImpl7 implements Function2<UpdateAppStateRequestDto, Continuation<? super UpdateAppStateResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldEventHubService_Adapter.UpdateAppStateEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldEventHubService_Adapter2(GoldEventHubService_Adapter.UpdateAppStateEndpoint updateAppStateEndpoint, Continuation<? super GoldEventHubService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = updateAppStateEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldEventHubService_Adapter2 goldEventHubService_Adapter2 = new GoldEventHubService_Adapter2(this.this$0, continuation);
        goldEventHubService_Adapter2.L$0 = obj;
        return goldEventHubService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateAppStateRequestDto updateAppStateRequestDto, Continuation<? super UpdateAppStateResponseDto> continuation) {
        return ((GoldEventHubService_Adapter2) create(updateAppStateRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UpdateAppStateRequestDto updateAppStateRequestDto = (UpdateAppStateRequestDto) this.L$0;
        GoldEventHubService goldEventHubService = this.this$0.service;
        this.label = 1;
        Object objUpdateAppState = goldEventHubService.UpdateAppState(updateAppStateRequestDto, this);
        return objUpdateAppState == coroutine_suspended ? coroutine_suspended : objUpdateAppState;
    }
}
