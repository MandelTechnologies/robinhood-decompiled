package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.CryptoBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: BalancesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "brokerageBalances", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "cryptoBalances", "Lcom/robinhood/models/crypto/db/CryptoBalances;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$individualAccountUnifiedBalances$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$individualAccountUnifiedBalances$1, reason: use source file name */
/* loaded from: classes20.dex */
final class BalancesStore5 extends ContinuationImpl7 implements Function3<BrokerageBalances, CryptoBalances, Continuation<? super UnifiedBalances>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BalancesStore5(Continuation<? super BalancesStore5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(BrokerageBalances brokerageBalances, CryptoBalances cryptoBalances, Continuation<? super UnifiedBalances> continuation) {
        BalancesStore5 balancesStore5 = new BalancesStore5(continuation);
        balancesStore5.L$0 = brokerageBalances;
        balancesStore5.L$1 = cryptoBalances;
        return balancesStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new UnifiedBalances((BrokerageBalances) this.L$0, (CryptoBalances) this.L$1);
    }
}
