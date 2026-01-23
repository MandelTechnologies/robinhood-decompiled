package microgram.contracts.gold_tab_service.proto.p491v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.gold_tab_service.proto.p491v1.GoldTabServiceService_Adapter;

/* compiled from: GoldTabServiceService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/gold_tab_service/proto/v1/GetGoldTabEligibleStatesResponseDto;", "request", "Lmicrogram/contracts/gold_tab_service/proto/v1/GetGoldTabEligibleStatesRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.gold_tab_service.proto.v1.GoldTabServiceService_Adapter$GetGoldTabEligibleStatesEndpoint$call$1", m3645f = "GoldTabServiceService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.gold_tab_service.proto.v1.GoldTabServiceService_Adapter$GetGoldTabEligibleStatesEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class GoldTabServiceService_Adapter2 extends ContinuationImpl7 implements Function2<GetGoldTabEligibleStatesRequestDto, Continuation<? super GetGoldTabEligibleStatesResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldTabServiceService_Adapter.GetGoldTabEligibleStatesEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldTabServiceService_Adapter2(GoldTabServiceService_Adapter.GetGoldTabEligibleStatesEndpoint getGoldTabEligibleStatesEndpoint, Continuation<? super GoldTabServiceService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getGoldTabEligibleStatesEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldTabServiceService_Adapter2 goldTabServiceService_Adapter2 = new GoldTabServiceService_Adapter2(this.this$0, continuation);
        goldTabServiceService_Adapter2.L$0 = obj;
        return goldTabServiceService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetGoldTabEligibleStatesRequestDto getGoldTabEligibleStatesRequestDto, Continuation<? super GetGoldTabEligibleStatesResponseDto> continuation) {
        return ((GoldTabServiceService_Adapter2) create(getGoldTabEligibleStatesRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetGoldTabEligibleStatesRequestDto getGoldTabEligibleStatesRequestDto = (GetGoldTabEligibleStatesRequestDto) this.L$0;
        GoldTabServiceService goldTabServiceService = this.this$0.service;
        this.label = 1;
        Object objGetGoldTabEligibleStates = goldTabServiceService.GetGoldTabEligibleStates(getGoldTabEligibleStatesRequestDto, this);
        return objGetGoldTabEligibleStates == coroutine_suspended ? coroutine_suspended : objGetGoldTabEligibleStates;
    }
}
