package equity_trading_tax_lots.proto.p460v1;

import equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradingTaxLotsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/GetAvailableDisposalOptionsResponseDto;", "request", "Lequity_trading_tax_lots/proto/v1/GetAvailableDisposalOptionsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$GetAvailableDisposalOptionsEndpoint$call$1", m3645f = "EquityTradingTaxLotsService_Adapter.kt", m3646l = {167}, m3647m = "invokeSuspend")
/* renamed from: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$GetAvailableDisposalOptionsEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EquityTradingTaxLotsService_Adapter3 extends ContinuationImpl7 implements Function2<GetAvailableDisposalOptionsRequestDto, Continuation<? super GetAvailableDisposalOptionsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityTradingTaxLotsService_Adapter.GetAvailableDisposalOptionsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradingTaxLotsService_Adapter3(EquityTradingTaxLotsService_Adapter.GetAvailableDisposalOptionsEndpoint getAvailableDisposalOptionsEndpoint, Continuation<? super EquityTradingTaxLotsService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = getAvailableDisposalOptionsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradingTaxLotsService_Adapter3 equityTradingTaxLotsService_Adapter3 = new EquityTradingTaxLotsService_Adapter3(this.this$0, continuation);
        equityTradingTaxLotsService_Adapter3.L$0 = obj;
        return equityTradingTaxLotsService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAvailableDisposalOptionsRequestDto getAvailableDisposalOptionsRequestDto, Continuation<? super GetAvailableDisposalOptionsResponseDto> continuation) {
        return ((EquityTradingTaxLotsService_Adapter3) create(getAvailableDisposalOptionsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetAvailableDisposalOptionsRequestDto getAvailableDisposalOptionsRequestDto = (GetAvailableDisposalOptionsRequestDto) this.L$0;
        EquityTradingTaxLotsService equityTradingTaxLotsService = this.this$0.service;
        this.label = 1;
        Object objGetAvailableDisposalOptions = equityTradingTaxLotsService.GetAvailableDisposalOptions(getAvailableDisposalOptionsRequestDto, this);
        return objGetAvailableDisposalOptions == coroutine_suspended ? coroutine_suspended : objGetAvailableDisposalOptions;
    }
}
