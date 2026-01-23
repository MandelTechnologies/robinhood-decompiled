package equity_company_financials.proto.p457v1;

import equity_company_financials.proto.p457v1.EquityCompanyFinancialsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityCompanyFinancialsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodResponseDto;", "request", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "equity_company_financials.proto.v1.EquityCompanyFinancialsService_Adapter$SetSelectedTimePeriodEndpoint$call$1", m3645f = "EquityCompanyFinancialsService_Adapter.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* renamed from: equity_company_financials.proto.v1.EquityCompanyFinancialsService_Adapter$SetSelectedTimePeriodEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EquityCompanyFinancialsService_Adapter3 extends ContinuationImpl7 implements Function2<SetSelectedTimePeriodRequestDto, Continuation<? super SetSelectedTimePeriodResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityCompanyFinancialsService_Adapter.SetSelectedTimePeriodEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityCompanyFinancialsService_Adapter3(EquityCompanyFinancialsService_Adapter.SetSelectedTimePeriodEndpoint setSelectedTimePeriodEndpoint, Continuation<? super EquityCompanyFinancialsService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = setSelectedTimePeriodEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityCompanyFinancialsService_Adapter3 equityCompanyFinancialsService_Adapter3 = new EquityCompanyFinancialsService_Adapter3(this.this$0, continuation);
        equityCompanyFinancialsService_Adapter3.L$0 = obj;
        return equityCompanyFinancialsService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SetSelectedTimePeriodRequestDto setSelectedTimePeriodRequestDto, Continuation<? super SetSelectedTimePeriodResponseDto> continuation) {
        return ((EquityCompanyFinancialsService_Adapter3) create(setSelectedTimePeriodRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SetSelectedTimePeriodRequestDto setSelectedTimePeriodRequestDto = (SetSelectedTimePeriodRequestDto) this.L$0;
        EquityCompanyFinancialsService equityCompanyFinancialsService = this.this$0.service;
        this.label = 1;
        Object objSetSelectedTimePeriod = equityCompanyFinancialsService.SetSelectedTimePeriod(setSelectedTimePeriodRequestDto, this);
        return objSetSelectedTimePeriod == coroutine_suspended ? coroutine_suspended : objSetSelectedTimePeriod;
    }
}
