package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoLimitOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onLimitPriceTapped$1$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onLimitPriceTapped$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoLimitOrderDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoLimitOrderDataState.Loaded $dataState;
    int label;
    final /* synthetic */ CryptoLimitOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoLimitOrderDuxo3(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState.Loaded loaded, Continuation<? super CryptoLimitOrderDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoLimitOrderDuxo;
        this.$dataState = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoLimitOrderDuxo3(this.this$0, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoLimitOrderDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoTradingBottomSheetService.launchBottomSheet$default(this.this$0.bottomSheetService, CryptoOrderContexts.getLimitOrderDefinitionBottomSheetTypeDto(this.$dataState.getCryptoOrderContext()), this.this$0.getEventScreen(), null, 4, null);
        return Unit.INSTANCE;
    }
}
