package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowInputAmountResponseDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowInputAmountRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$UpdateTaxLotRowInputAmountEndpoint$call$1", m3645f = "CryptoTaxLotSelectionService_Adapter.kt", m3646l = {200}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$UpdateTaxLotRowInputAmountEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class CryptoTaxLotSelectionService_Adapter6 extends ContinuationImpl7 implements Function2<UpdateTaxLotRowInputAmountRequestDto, Continuation<? super UpdateTaxLotRowInputAmountResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTaxLotSelectionService_Adapter.UpdateTaxLotRowInputAmountEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTaxLotSelectionService_Adapter6(CryptoTaxLotSelectionService_Adapter.UpdateTaxLotRowInputAmountEndpoint updateTaxLotRowInputAmountEndpoint, Continuation<? super CryptoTaxLotSelectionService_Adapter6> continuation) {
        super(2, continuation);
        this.this$0 = updateTaxLotRowInputAmountEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTaxLotSelectionService_Adapter6 cryptoTaxLotSelectionService_Adapter6 = new CryptoTaxLotSelectionService_Adapter6(this.this$0, continuation);
        cryptoTaxLotSelectionService_Adapter6.L$0 = obj;
        return cryptoTaxLotSelectionService_Adapter6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateTaxLotRowInputAmountRequestDto updateTaxLotRowInputAmountRequestDto, Continuation<? super UpdateTaxLotRowInputAmountResponseDto> continuation) {
        return ((CryptoTaxLotSelectionService_Adapter6) create(updateTaxLotRowInputAmountRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UpdateTaxLotRowInputAmountRequestDto updateTaxLotRowInputAmountRequestDto = (UpdateTaxLotRowInputAmountRequestDto) this.L$0;
        CryptoTaxLotSelectionService cryptoTaxLotSelectionService = this.this$0.service;
        this.label = 1;
        Object objUpdateTaxLotRowInputAmount = cryptoTaxLotSelectionService.UpdateTaxLotRowInputAmount(updateTaxLotRowInputAmountRequestDto, this);
        return objUpdateTaxLotRowInputAmount == coroutine_suspended ? coroutine_suspended : objUpdateTaxLotRowInputAmount;
    }
}
