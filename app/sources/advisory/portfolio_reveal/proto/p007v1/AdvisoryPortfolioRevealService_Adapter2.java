package advisory.portfolio_reveal.proto.p007v1;

import advisory.portfolio_reveal.proto.p007v1.AdvisoryPortfolioRevealService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryPortfolioRevealService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "request", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "advisory.portfolio_reveal.proto.v1.AdvisoryPortfolioRevealService_Adapter$GetPortfolioRevealEndpoint$call$1", m3645f = "AdvisoryPortfolioRevealService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: advisory.portfolio_reveal.proto.v1.AdvisoryPortfolioRevealService_Adapter$GetPortfolioRevealEndpoint$call$1, reason: use source file name */
/* loaded from: classes23.dex */
final class AdvisoryPortfolioRevealService_Adapter2 extends ContinuationImpl7 implements Function2<GetPortfolioRevealRequestDto, Continuation<? super GetPortfolioRevealResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryPortfolioRevealService_Adapter.GetPortfolioRevealEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryPortfolioRevealService_Adapter2(AdvisoryPortfolioRevealService_Adapter.GetPortfolioRevealEndpoint getPortfolioRevealEndpoint, Continuation<? super AdvisoryPortfolioRevealService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getPortfolioRevealEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryPortfolioRevealService_Adapter2 advisoryPortfolioRevealService_Adapter2 = new AdvisoryPortfolioRevealService_Adapter2(this.this$0, continuation);
        advisoryPortfolioRevealService_Adapter2.L$0 = obj;
        return advisoryPortfolioRevealService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetPortfolioRevealRequestDto getPortfolioRevealRequestDto, Continuation<? super GetPortfolioRevealResponseDto> continuation) {
        return ((AdvisoryPortfolioRevealService_Adapter2) create(getPortfolioRevealRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetPortfolioRevealRequestDto getPortfolioRevealRequestDto = (GetPortfolioRevealRequestDto) this.L$0;
        AdvisoryPortfolioRevealService advisoryPortfolioRevealService = this.this$0.service;
        this.label = 1;
        Object objGetPortfolioReveal = advisoryPortfolioRevealService.GetPortfolioReveal(getPortfolioRevealRequestDto, this);
        return objGetPortfolioReveal == coroutine_suspended ? coroutine_suspended : objGetPortfolioReveal;
    }
}
