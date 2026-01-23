package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* compiled from: CryptoAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCachedIndividualAccount$2$3", m3645f = "CryptoAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCachedIndividualAccount$2$3, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountStore6 extends ContinuationImpl7 implements Function2<CryptoAccount, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    CryptoAccountStore6(Continuation<? super CryptoAccountStore6> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoAccountStore6 cryptoAccountStore6 = new CryptoAccountStore6(continuation);
        cryptoAccountStore6.L$0 = obj;
        return cryptoAccountStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoAccount cryptoAccount, Continuation<? super Unit> continuation) {
        return ((CryptoAccountStore6) create(cryptoAccount, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoAccount cryptoAccount = (CryptoAccount) this.L$0;
        Timber.INSTANCE.mo3350d("Dao's first account is " + cryptoAccount, new Object[0]);
        return Unit.INSTANCE;
    }
}
