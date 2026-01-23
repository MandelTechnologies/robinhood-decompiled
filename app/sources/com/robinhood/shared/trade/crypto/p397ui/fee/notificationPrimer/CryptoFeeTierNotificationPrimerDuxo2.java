package com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoFeeTierNotificationPrimerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$turnOn$1$3$1", m3645f = "CryptoFeeTierNotificationPrimerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$turnOn$1$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoFeeTierNotificationPrimerDuxo2 extends ContinuationImpl7 implements Function2<CryptoFeeTierNotificationPrimerViewState, Continuation<? super CryptoFeeTierNotificationPrimerViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CryptoFeeTierNotificationPrimerDuxo2(Continuation<? super CryptoFeeTierNotificationPrimerDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoFeeTierNotificationPrimerDuxo2 cryptoFeeTierNotificationPrimerDuxo2 = new CryptoFeeTierNotificationPrimerDuxo2(continuation);
        cryptoFeeTierNotificationPrimerDuxo2.L$0 = obj;
        return cryptoFeeTierNotificationPrimerDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoFeeTierNotificationPrimerViewState cryptoFeeTierNotificationPrimerViewState, Continuation<? super CryptoFeeTierNotificationPrimerViewState> continuation) {
        return ((CryptoFeeTierNotificationPrimerDuxo2) create(cryptoFeeTierNotificationPrimerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((CryptoFeeTierNotificationPrimerViewState) this.L$0).copy(false);
    }
}
