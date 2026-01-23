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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsResponseDto;", "request", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$SetSelectedTaxLotsEndpoint$call$1", m3645f = "EquityTradingTaxLotsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$SetSelectedTaxLotsEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class EquityTradingTaxLotsService_Adapter6 extends ContinuationImpl7 implements Function2<SetSelectedTaxLotsRequestDto, Continuation<? super SetSelectedTaxLotsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityTradingTaxLotsService_Adapter.SetSelectedTaxLotsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradingTaxLotsService_Adapter6(EquityTradingTaxLotsService_Adapter.SetSelectedTaxLotsEndpoint setSelectedTaxLotsEndpoint, Continuation<? super EquityTradingTaxLotsService_Adapter6> continuation) {
        super(2, continuation);
        this.this$0 = setSelectedTaxLotsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradingTaxLotsService_Adapter6 equityTradingTaxLotsService_Adapter6 = new EquityTradingTaxLotsService_Adapter6(this.this$0, continuation);
        equityTradingTaxLotsService_Adapter6.L$0 = obj;
        return equityTradingTaxLotsService_Adapter6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SetSelectedTaxLotsRequestDto setSelectedTaxLotsRequestDto, Continuation<? super SetSelectedTaxLotsResponseDto> continuation) {
        return ((EquityTradingTaxLotsService_Adapter6) create(setSelectedTaxLotsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SetSelectedTaxLotsRequestDto setSelectedTaxLotsRequestDto = (SetSelectedTaxLotsRequestDto) this.L$0;
        EquityTradingTaxLotsService equityTradingTaxLotsService = this.this$0.service;
        this.label = 1;
        Object objSetSelectedTaxLots = equityTradingTaxLotsService.SetSelectedTaxLots(setSelectedTaxLotsRequestDto, this);
        return objSetSelectedTaxLots == coroutine_suspended ? coroutine_suspended : objSetSelectedTaxLots;
    }
}
