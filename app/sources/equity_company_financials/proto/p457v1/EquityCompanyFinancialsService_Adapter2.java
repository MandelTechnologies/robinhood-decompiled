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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lequity_company_financials/proto/v1/SetScrubIndexResponseDto;", "request", "Lequity_company_financials/proto/v1/SetScrubIndexRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "equity_company_financials.proto.v1.EquityCompanyFinancialsService_Adapter$SetScrubIndexEndpoint$call$1", m3645f = "EquityCompanyFinancialsService_Adapter.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* renamed from: equity_company_financials.proto.v1.EquityCompanyFinancialsService_Adapter$SetScrubIndexEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EquityCompanyFinancialsService_Adapter2 extends ContinuationImpl7 implements Function2<SetScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityCompanyFinancialsService_Adapter.SetScrubIndexEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityCompanyFinancialsService_Adapter2(EquityCompanyFinancialsService_Adapter.SetScrubIndexEndpoint setScrubIndexEndpoint, Continuation<? super EquityCompanyFinancialsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = setScrubIndexEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityCompanyFinancialsService_Adapter2 equityCompanyFinancialsService_Adapter2 = new EquityCompanyFinancialsService_Adapter2(this.this$0, continuation);
        equityCompanyFinancialsService_Adapter2.L$0 = obj;
        return equityCompanyFinancialsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SetScrubIndexRequestDto setScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto> continuation) {
        return ((EquityCompanyFinancialsService_Adapter2) create(setScrubIndexRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SetScrubIndexRequestDto setScrubIndexRequestDto = (SetScrubIndexRequestDto) this.L$0;
        EquityCompanyFinancialsService equityCompanyFinancialsService = this.this$0.service;
        this.label = 1;
        Object objSetScrubIndex = equityCompanyFinancialsService.SetScrubIndex(setScrubIndexRequestDto, this);
        return objSetScrubIndex == coroutine_suspended ? coroutine_suspended : objSetScrubIndex;
    }
}
