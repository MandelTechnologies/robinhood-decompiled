package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetReturnsBreakdownRequestDto;
import advisory.proto.p008v1.GetReturnsBreakdownResponseDto;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown2;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryPortfolioBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "args", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore$GetReturnsBreakdownArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$returnsBreakdownEndpoint$2", m3645f = "AdvisoryPortfolioBreakdownStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$returnsBreakdownEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryPortfolioBreakdownStore5 extends ContinuationImpl7 implements Function2<AdvisoryPortfolioBreakdownStore.GetReturnsBreakdownArgs, Continuation<? super ReturnsBreakdown>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryPortfolioBreakdownStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryPortfolioBreakdownStore5(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, Continuation<? super AdvisoryPortfolioBreakdownStore5> continuation) {
        super(2, continuation);
        this.this$0 = advisoryPortfolioBreakdownStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryPortfolioBreakdownStore5 advisoryPortfolioBreakdownStore5 = new AdvisoryPortfolioBreakdownStore5(this.this$0, continuation);
        advisoryPortfolioBreakdownStore5.L$0 = obj;
        return advisoryPortfolioBreakdownStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvisoryPortfolioBreakdownStore.GetReturnsBreakdownArgs getReturnsBreakdownArgs, Continuation<? super ReturnsBreakdown> continuation) {
        return ((AdvisoryPortfolioBreakdownStore5) create(getReturnsBreakdownArgs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AdvisoryPortfolioBreakdownStore.GetReturnsBreakdownArgs getReturnsBreakdownArgs = (AdvisoryPortfolioBreakdownStore.GetReturnsBreakdownArgs) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            GetReturnsBreakdownRequestDto getReturnsBreakdownRequestDto = new GetReturnsBreakdownRequestDto(getReturnsBreakdownArgs.getAccountNumber(), getReturnsBreakdownArgs.getSpan());
            this.label = 1;
            obj = advisoryService.GetReturnsBreakdown(getReturnsBreakdownRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ReturnsBreakdown2.toDbModel((GetReturnsBreakdownResponseDto) obj);
    }
}
