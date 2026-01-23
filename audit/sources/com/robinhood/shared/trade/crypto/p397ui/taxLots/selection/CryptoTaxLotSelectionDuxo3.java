package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.UpdateTaxLotRowInputAmountRequestDto;

/* compiled from: CryptoTaxLotSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onKeyPressed$2$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onKeyPressed$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTaxLotSelectionDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $assetAmount;
    final /* synthetic */ String $focusedTaxLotId;
    final /* synthetic */ String $formattedAssetAmount;
    final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
    int label;
    final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTaxLotSelectionDuxo3(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, String str, String str2, Continuation<? super CryptoTaxLotSelectionDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTaxLotSelectionDuxo;
        this.$assetAmount = bigDecimal;
        this.$uiCurrencyPair = uiCurrencyPair;
        this.$focusedTaxLotId = str;
        this.$formattedAssetAmount = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTaxLotSelectionDuxo3(this.this$0, this.$assetAmount, this.$uiCurrencyPair, this.$focusedTaxLotId, this.$formattedAssetAmount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoTaxLotSelectionDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal scale;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotSelectionService cryptoTaxLotSelectionService = this.this$0.taxLotSelectionService;
            BigDecimal bigDecimal = this.$assetAmount;
            UpdateTaxLotRowInputAmountRequestDto updateTaxLotRowInputAmountRequestDto = new UpdateTaxLotRowInputAmountRequestDto(this.$focusedTaxLotId, (bigDecimal == null || (scale = bigDecimal.setScale(this.$uiCurrencyPair.getAllowedQuantityScale(), RoundingMode.DOWN)) == null) ? null : IdlDecimal2.toIdlDecimal(scale), this.$formattedAssetAmount);
            this.label = 1;
            if (cryptoTaxLotSelectionService.UpdateTaxLotRowInputAmount(updateTaxLotRowInputAmountRequestDto, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
