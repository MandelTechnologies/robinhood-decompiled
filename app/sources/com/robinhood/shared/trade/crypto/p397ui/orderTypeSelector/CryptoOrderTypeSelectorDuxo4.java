package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderTypeSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$3$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderTypeSelectorDuxo4 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
    final /* synthetic */ CryptoAccount $cryptoAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderTypeSelectorDuxo4(CryptoAccount cryptoAccount, Continuation<? super CryptoOrderTypeSelectorDuxo4> continuation) {
        super(2, continuation);
        this.$cryptoAccount = cryptoAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderTypeSelectorDuxo4 cryptoOrderTypeSelectorDuxo4 = new CryptoOrderTypeSelectorDuxo4(this.$cryptoAccount, continuation);
        cryptoOrderTypeSelectorDuxo4.L$0 = obj;
        return cryptoOrderTypeSelectorDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
        return ((CryptoOrderTypeSelectorDuxo4) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, null, null, false, null, false, null, this.$cryptoAccount, 0, 1535, null);
    }
}
