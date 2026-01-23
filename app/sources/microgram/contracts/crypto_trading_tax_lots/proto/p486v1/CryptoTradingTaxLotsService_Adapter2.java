package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService_Adapter;

/* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTemporarilySelectedTaxLotStrategyResponseDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTemporarilySelectedTaxLotStrategyRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$ClearTemporarilySelectedTaxLotStrategyEndpoint$call$1", m3645f = "CryptoTradingTaxLotsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$ClearTemporarilySelectedTaxLotStrategyEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class CryptoTradingTaxLotsService_Adapter2 extends ContinuationImpl7 implements Function2<ClearTemporarilySelectedTaxLotStrategyRequestDto, Continuation<? super ClearTemporarilySelectedTaxLotStrategyResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTradingTaxLotsService_Adapter.ClearTemporarilySelectedTaxLotStrategyEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTradingTaxLotsService_Adapter2(CryptoTradingTaxLotsService_Adapter.ClearTemporarilySelectedTaxLotStrategyEndpoint clearTemporarilySelectedTaxLotStrategyEndpoint, Continuation<? super CryptoTradingTaxLotsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = clearTemporarilySelectedTaxLotStrategyEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTradingTaxLotsService_Adapter2 cryptoTradingTaxLotsService_Adapter2 = new CryptoTradingTaxLotsService_Adapter2(this.this$0, continuation);
        cryptoTradingTaxLotsService_Adapter2.L$0 = obj;
        return cryptoTradingTaxLotsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ClearTemporarilySelectedTaxLotStrategyRequestDto clearTemporarilySelectedTaxLotStrategyRequestDto, Continuation<? super ClearTemporarilySelectedTaxLotStrategyResponseDto> continuation) {
        return ((CryptoTradingTaxLotsService_Adapter2) create(clearTemporarilySelectedTaxLotStrategyRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ClearTemporarilySelectedTaxLotStrategyRequestDto clearTemporarilySelectedTaxLotStrategyRequestDto = (ClearTemporarilySelectedTaxLotStrategyRequestDto) this.L$0;
        CryptoTradingTaxLotsService cryptoTradingTaxLotsService = this.this$0.service;
        this.label = 1;
        Object objClearTemporarilySelectedTaxLotStrategy = cryptoTradingTaxLotsService.ClearTemporarilySelectedTaxLotStrategy(clearTemporarilySelectedTaxLotStrategyRequestDto, this);
        return objClearTemporarilySelectedTaxLotStrategy == coroutine_suspended ? coroutine_suspended : objClearTemporarilySelectedTaxLotStrategy;
    }
}
