package eoy_giveaway.p456v1;

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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Leoy_giveaway/v1/UpdateAppStateResponseDto;", "request", "Leoy_giveaway/v1/UpdateAppStateRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "eoy_giveaway.v1.EndOfYearGiveawayService_Adapter$UpdateAppStateEndpoint$call$1", m3645f = "EndOfYearGiveawayService_Adapter.kt", m3646l = {136}, m3647m = "invokeSuspend")
/* renamed from: eoy_giveaway.v1.EndOfYearGiveawayService_Adapter$UpdateAppStateEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EndOfYearGiveawayService_Adapter4 extends ContinuationImpl7 implements Function2<UpdateAppStateRequestDto, Continuation<? super UpdateAppStateResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EndOfYearGiveawayService_Adapter.UpdateAppStateEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EndOfYearGiveawayService_Adapter4(EndOfYearGiveawayService_Adapter.UpdateAppStateEndpoint updateAppStateEndpoint, Continuation<? super EndOfYearGiveawayService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = updateAppStateEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EndOfYearGiveawayService_Adapter4 endOfYearGiveawayService_Adapter4 = new EndOfYearGiveawayService_Adapter4(this.this$0, continuation);
        endOfYearGiveawayService_Adapter4.L$0 = obj;
        return endOfYearGiveawayService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateAppStateRequestDto updateAppStateRequestDto, Continuation<? super UpdateAppStateResponseDto> continuation) {
        return ((EndOfYearGiveawayService_Adapter4) create(updateAppStateRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EndOfYearGiveawayService endOfYearGiveawayService = this.this$0.service;
        this.label = 1;
        Object objUpdateAppState = endOfYearGiveawayService.UpdateAppState(updateAppStateRequestDto, this);
        return objUpdateAppState == coroutine_suspended ? coroutine_suspended : objUpdateAppState;
    }
}
