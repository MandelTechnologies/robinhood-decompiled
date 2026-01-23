package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import com.robinhood.android.crypto.lib.UiCryptoOrdersFormatter;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onStart$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDetailDuxo5 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
    final /* synthetic */ boolean $isTradeBonusEnabled;
    final /* synthetic */ UiCryptoOrder $uiCryptoOrder;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoOrderDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDetailDuxo5(UiCryptoOrder uiCryptoOrder, CryptoOrderDetailDuxo cryptoOrderDetailDuxo, boolean z, Continuation<? super CryptoOrderDetailDuxo5> continuation) {
        super(2, continuation);
        this.$uiCryptoOrder = uiCryptoOrder;
        this.this$0 = cryptoOrderDetailDuxo;
        this.$isTradeBonusEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDetailDuxo5 cryptoOrderDetailDuxo5 = new CryptoOrderDetailDuxo5(this.$uiCryptoOrder, this.this$0, this.$isTradeBonusEnabled, continuation);
        cryptoOrderDetailDuxo5.L$0 = obj;
        return cryptoOrderDetailDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
        return ((CryptoOrderDetailDuxo5) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoOrderDetailDataState cryptoOrderDetailDataState = (CryptoOrderDetailDataState) this.L$0;
        if (this.$uiCryptoOrder.getCurrencyPair().isTokenizedStock()) {
            CryptoOrderDetailDuxo cryptoOrderDetailDuxo = this.this$0;
            Screen.Name name = Screen.Name.TOKENIZED_STOCK_ORDER_HISTORY_DETAIL;
            String string2 = this.$uiCryptoOrder.getCurrencyPair().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            cryptoOrderDetailDuxo.eventScreen = new Screen(name, null, string2, null, 10, null);
        }
        return CryptoOrderDetailDataState.m25899copyaYVmwo0$default(cryptoOrderDetailDataState, null, new UiCryptoOrdersFormatter(this.$uiCryptoOrder, this.this$0.localizedDateTimeFormatter), this.$uiCryptoOrder, false, this.$isTradeBonusEnabled, false, false, null, false, null, false, null, null, 8169, null);
    }
}
