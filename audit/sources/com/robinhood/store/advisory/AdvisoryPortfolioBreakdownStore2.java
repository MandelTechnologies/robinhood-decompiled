package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetManagedPortfolioRequestDto;
import advisory.proto.p008v1.GetManagedPortfolioResponseDto;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryPortfolioBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$managedPortfolioEndpoint$1", m3645f = "AdvisoryPortfolioBreakdownStore.kt", m3646l = {34}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$managedPortfolioEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryPortfolioBreakdownStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super ManagedPortfolioSummary>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryPortfolioBreakdownStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryPortfolioBreakdownStore2(AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, Continuation<? super AdvisoryPortfolioBreakdownStore2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryPortfolioBreakdownStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryPortfolioBreakdownStore2 advisoryPortfolioBreakdownStore2 = new AdvisoryPortfolioBreakdownStore2(this.this$0, continuation);
        advisoryPortfolioBreakdownStore2.L$0 = obj;
        return advisoryPortfolioBreakdownStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ManagedPortfolioSummary> continuation) {
        return ((AdvisoryPortfolioBreakdownStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            GetManagedPortfolioRequestDto getManagedPortfolioRequestDto = new GetManagedPortfolioRequestDto(str);
            this.label = 1;
            obj = advisoryService.GetManagedPortfolio(getManagedPortfolioRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ManagedPortfolioSummary5.toDbModel((GetManagedPortfolioResponseDto) obj);
    }
}
