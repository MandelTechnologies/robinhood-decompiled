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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService_Adapter;

/* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTaxLotRowInvalidInputAmountResponseDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTaxLotRowInvalidInputAmountRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$ClearTaxLotRowInvalidInputAmountEndpoint$call$1", m3645f = "CryptoTaxLotSelectionService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$ClearTaxLotRowInvalidInputAmountEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class CryptoTaxLotSelectionService_Adapter2 extends ContinuationImpl7 implements Function2<ClearTaxLotRowInvalidInputAmountRequestDto, Continuation<? super ClearTaxLotRowInvalidInputAmountResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTaxLotSelectionService_Adapter.ClearTaxLotRowInvalidInputAmountEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTaxLotSelectionService_Adapter2(CryptoTaxLotSelectionService_Adapter.ClearTaxLotRowInvalidInputAmountEndpoint clearTaxLotRowInvalidInputAmountEndpoint, Continuation<? super CryptoTaxLotSelectionService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = clearTaxLotRowInvalidInputAmountEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTaxLotSelectionService_Adapter2 cryptoTaxLotSelectionService_Adapter2 = new CryptoTaxLotSelectionService_Adapter2(this.this$0, continuation);
        cryptoTaxLotSelectionService_Adapter2.L$0 = obj;
        return cryptoTaxLotSelectionService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ClearTaxLotRowInvalidInputAmountRequestDto clearTaxLotRowInvalidInputAmountRequestDto, Continuation<? super ClearTaxLotRowInvalidInputAmountResponseDto> continuation) {
        return ((CryptoTaxLotSelectionService_Adapter2) create(clearTaxLotRowInvalidInputAmountRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ClearTaxLotRowInvalidInputAmountRequestDto clearTaxLotRowInvalidInputAmountRequestDto = (ClearTaxLotRowInvalidInputAmountRequestDto) this.L$0;
        CryptoTaxLotSelectionService cryptoTaxLotSelectionService = this.this$0.service;
        this.label = 1;
        Object objClearTaxLotRowInvalidInputAmount = cryptoTaxLotSelectionService.ClearTaxLotRowInvalidInputAmount(clearTaxLotRowInvalidInputAmountRequestDto, this);
        return objClearTaxLotRowInvalidInputAmount == coroutine_suspended ? coroutine_suspended : objClearTaxLotRowInvalidInputAmount;
    }
}
