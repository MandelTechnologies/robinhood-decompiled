package eoy_giveaway.p456v1;

import eoy_giveaway.p456v1.EndOfYearGiveawayClientService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EndOfYearGiveawayClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "request", "Leoy_giveaway/v1/DismissProgramViewRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "eoy_giveaway.v1.EndOfYearGiveawayClientService_Adapter$DismissProgramViewEndpoint$call$1", m3645f = "EndOfYearGiveawayClientService_Adapter.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* renamed from: eoy_giveaway.v1.EndOfYearGiveawayClientService_Adapter$DismissProgramViewEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EndOfYearGiveawayClientService_Adapter2 extends ContinuationImpl7 implements Function2<DismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EndOfYearGiveawayClientService_Adapter.DismissProgramViewEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EndOfYearGiveawayClientService_Adapter2(EndOfYearGiveawayClientService_Adapter.DismissProgramViewEndpoint dismissProgramViewEndpoint, Continuation<? super EndOfYearGiveawayClientService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = dismissProgramViewEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EndOfYearGiveawayClientService_Adapter2 endOfYearGiveawayClientService_Adapter2 = new EndOfYearGiveawayClientService_Adapter2(this.this$0, continuation);
        endOfYearGiveawayClientService_Adapter2.L$0 = obj;
        return endOfYearGiveawayClientService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation) {
        return ((EndOfYearGiveawayClientService_Adapter2) create(dismissProgramViewRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EndOfYearGiveawayClientService endOfYearGiveawayClientService = this.this$0.service;
        this.label = 1;
        Object objDismissProgramView = endOfYearGiveawayClientService.DismissProgramView(dismissProgramViewRequestDto, this);
        return objDismissProgramView == coroutine_suspended ? coroutine_suspended : objDismissProgramView;
    }
}
