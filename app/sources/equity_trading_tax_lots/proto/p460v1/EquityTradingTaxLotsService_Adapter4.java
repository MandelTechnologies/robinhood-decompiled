package equity_trading_tax_lots.proto.p460v1;

import com.plaid.internal.EnumC7081g;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/GetAvailableSelectionStrategyOptionsResponseDto;", "request", "Lequity_trading_tax_lots/proto/v1/GetAvailableSelectionStrategyOptionsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$GetAvailableSelectionStrategyOptionsEndpoint$call$1", m3645f = "EquityTradingTaxLotsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$GetAvailableSelectionStrategyOptionsEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EquityTradingTaxLotsService_Adapter4 extends ContinuationImpl7 implements Function2<GetAvailableSelectionStrategyOptionsRequestDto, Continuation<? super GetAvailableSelectionStrategyOptionsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityTradingTaxLotsService_Adapter.GetAvailableSelectionStrategyOptionsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradingTaxLotsService_Adapter4(EquityTradingTaxLotsService_Adapter.GetAvailableSelectionStrategyOptionsEndpoint getAvailableSelectionStrategyOptionsEndpoint, Continuation<? super EquityTradingTaxLotsService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = getAvailableSelectionStrategyOptionsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradingTaxLotsService_Adapter4 equityTradingTaxLotsService_Adapter4 = new EquityTradingTaxLotsService_Adapter4(this.this$0, continuation);
        equityTradingTaxLotsService_Adapter4.L$0 = obj;
        return equityTradingTaxLotsService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAvailableSelectionStrategyOptionsRequestDto getAvailableSelectionStrategyOptionsRequestDto, Continuation<? super GetAvailableSelectionStrategyOptionsResponseDto> continuation) {
        return ((EquityTradingTaxLotsService_Adapter4) create(getAvailableSelectionStrategyOptionsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetAvailableSelectionStrategyOptionsRequestDto getAvailableSelectionStrategyOptionsRequestDto = (GetAvailableSelectionStrategyOptionsRequestDto) this.L$0;
        EquityTradingTaxLotsService equityTradingTaxLotsService = this.this$0.service;
        this.label = 1;
        Object objGetAvailableSelectionStrategyOptions = equityTradingTaxLotsService.GetAvailableSelectionStrategyOptions(getAvailableSelectionStrategyOptionsRequestDto, this);
        return objGetAvailableSelectionStrategyOptions == coroutine_suspended ? coroutine_suspended : objGetAvailableSelectionStrategyOptions;
    }
}
