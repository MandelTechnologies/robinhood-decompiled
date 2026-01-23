package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTaxLotOrderInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$convertToSellAll$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$convertToSellAll$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTaxLotOrderInputDuxo2 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
    final /* synthetic */ BigDecimal $assetAmount;
    final /* synthetic */ String $formattedAssetAmount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTaxLotOrderInputDuxo2(BigDecimal bigDecimal, String str, Continuation<? super CryptoTaxLotOrderInputDuxo2> continuation) {
        super(2, continuation);
        this.$assetAmount = bigDecimal;
        this.$formattedAssetAmount = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTaxLotOrderInputDuxo2 cryptoTaxLotOrderInputDuxo2 = new CryptoTaxLotOrderInputDuxo2(this.$assetAmount, this.$formattedAssetAmount, continuation);
        cryptoTaxLotOrderInputDuxo2.L$0 = obj;
        return cryptoTaxLotOrderInputDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
        return ((CryptoTaxLotOrderInputDuxo2) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, null, null, null, this.$assetAmount, this.$formattedAssetAmount, null, null, false, 7423, null);
    }
}
