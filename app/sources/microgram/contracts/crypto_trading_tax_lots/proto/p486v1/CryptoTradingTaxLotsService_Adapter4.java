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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotOrderInputResponseDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotOrderInputRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$InitializeCryptoTaxLotOrderInputEndpoint$call$1", m3645f = "CryptoTradingTaxLotsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$InitializeCryptoTaxLotOrderInputEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class CryptoTradingTaxLotsService_Adapter4 extends ContinuationImpl7 implements Function2<InitializeCryptoTaxLotOrderInputRequestDto, Continuation<? super InitializeCryptoTaxLotOrderInputResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTradingTaxLotsService_Adapter.InitializeCryptoTaxLotOrderInputEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTradingTaxLotsService_Adapter4(CryptoTradingTaxLotsService_Adapter.InitializeCryptoTaxLotOrderInputEndpoint initializeCryptoTaxLotOrderInputEndpoint, Continuation<? super CryptoTradingTaxLotsService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = initializeCryptoTaxLotOrderInputEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTradingTaxLotsService_Adapter4 cryptoTradingTaxLotsService_Adapter4 = new CryptoTradingTaxLotsService_Adapter4(this.this$0, continuation);
        cryptoTradingTaxLotsService_Adapter4.L$0 = obj;
        return cryptoTradingTaxLotsService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InitializeCryptoTaxLotOrderInputRequestDto initializeCryptoTaxLotOrderInputRequestDto, Continuation<? super InitializeCryptoTaxLotOrderInputResponseDto> continuation) {
        return ((CryptoTradingTaxLotsService_Adapter4) create(initializeCryptoTaxLotOrderInputRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        InitializeCryptoTaxLotOrderInputRequestDto initializeCryptoTaxLotOrderInputRequestDto = (InitializeCryptoTaxLotOrderInputRequestDto) this.L$0;
        CryptoTradingTaxLotsService cryptoTradingTaxLotsService = this.this$0.service;
        this.label = 1;
        Object objInitializeCryptoTaxLotOrderInput = cryptoTradingTaxLotsService.InitializeCryptoTaxLotOrderInput(initializeCryptoTaxLotOrderInputRequestDto, this);
        return objInitializeCryptoTaxLotOrderInput == coroutine_suspended ? coroutine_suspended : objInitializeCryptoTaxLotOrderInput;
    }
}
