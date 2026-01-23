package com.robinhood.android.crypto.tab.p093ui;

import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$2$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoHomeDuxo$onStart$2$1 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
    final /* synthetic */ CryptoHomeState $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeDuxo$onStart$2$1(CryptoHomeState cryptoHomeState, Continuation<? super CryptoHomeDuxo$onStart$2$1> continuation) {
        super(2, continuation);
        this.$it = cryptoHomeState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeDuxo$onStart$2$1 cryptoHomeDuxo$onStart$2$1 = new CryptoHomeDuxo$onStart$2$1(this.$it, continuation);
        cryptoHomeDuxo$onStart$2$1.L$0 = obj;
        return cryptoHomeDuxo$onStart$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
        return ((CryptoHomeDuxo$onStart$2$1) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, null, null, this.$it, null, null, null, null, false, null, false, null, false, false, 8155, null);
    }
}
