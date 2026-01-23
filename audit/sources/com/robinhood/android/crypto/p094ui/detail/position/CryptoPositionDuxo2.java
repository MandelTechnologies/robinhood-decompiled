package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: CryptoPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1$1$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPositionDuxo2 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoPositionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPositionDuxo2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super CryptoPositionDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoPositionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoPositionDuxo2 cryptoPositionDuxo2 = new CryptoPositionDuxo2(this.this$0, continuation);
        cryptoPositionDuxo2.L$0 = obj;
        return cryptoPositionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
        return ((CryptoPositionDuxo2) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) this.L$0;
            StateFlow2 stateFlow2 = this.this$0._currencyPairFlow;
            this.label = 1;
            if (stateFlow2.emit(uiCurrencyPair, this) == coroutine_suspended) {
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
