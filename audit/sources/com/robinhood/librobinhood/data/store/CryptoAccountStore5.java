package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* compiled from: CryptoAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCachedIndividualAccount$2$2", m3645f = "CryptoAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountStore$streamCachedIndividualAccount$2$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountStore5 extends ContinuationImpl7 implements Function3<FlowCollector<? super CryptoAccount>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    CryptoAccountStore5(Continuation<? super CryptoAccountStore5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super CryptoAccount> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new CryptoAccountStore5(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Timber.INSTANCE.mo3350d("AccountStore unsubscribed from dao", new Object[0]);
        return Unit.INSTANCE;
    }
}
