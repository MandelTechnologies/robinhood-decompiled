package com.robinhood.android.crypto.p094ui.detail.cards;

import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDataState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoDetailCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadLessonEarnability$3$2", m3645f = "CryptoDetailCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardDuxo$loadLessonEarnability$3$2, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailCardDuxo4 extends ContinuationImpl7 implements Function2<CryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CryptoDetailCardDuxo4(Continuation<? super CryptoDetailCardDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoDetailCardDuxo4 cryptoDetailCardDuxo4 = new CryptoDetailCardDuxo4(continuation);
        cryptoDetailCardDuxo4.L$0 = obj;
        return cryptoDetailCardDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoDetailCardDataState cryptoDetailCardDataState, Continuation<? super CryptoDetailCardDataState> continuation) {
        return ((CryptoDetailCardDuxo4) create(cryptoDetailCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoDetailCardDataState.copy$default((CryptoDetailCardDataState) this.L$0, null, null, null, null, CryptoDetailCardDataState2.DoNotShow.INSTANCE, false, 47, null);
    }
}
