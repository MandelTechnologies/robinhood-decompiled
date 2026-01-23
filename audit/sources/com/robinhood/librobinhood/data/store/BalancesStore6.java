package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.CryptoBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: BalancesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "brokerageBalancesOptional", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "cryptoBalances", "Lcom/robinhood/models/crypto/db/CryptoBalances;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$individualAccountUnifiedBalancesOptional$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$individualAccountUnifiedBalancesOptional$1, reason: use source file name */
/* loaded from: classes20.dex */
final class BalancesStore6 extends ContinuationImpl7 implements Function3<Optional<? extends BrokerageBalances>, CryptoBalances, Continuation<? super Optional<? extends UnifiedBalances>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BalancesStore6(Continuation<? super BalancesStore6> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<BrokerageBalances> optional, CryptoBalances cryptoBalances, Continuation<? super Optional<UnifiedBalances>> continuation) {
        BalancesStore6 balancesStore6 = new BalancesStore6(continuation);
        balancesStore6.L$0 = optional;
        balancesStore6.L$1 = cryptoBalances;
        return balancesStore6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends BrokerageBalances> optional, CryptoBalances cryptoBalances, Continuation<? super Optional<? extends UnifiedBalances>> continuation) {
        return invoke2((Optional<BrokerageBalances>) optional, cryptoBalances, (Continuation<? super Optional<UnifiedBalances>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Optional optional = (Optional) this.L$0;
        CryptoBalances cryptoBalances = (CryptoBalances) this.L$1;
        BrokerageBalances brokerageBalances = (BrokerageBalances) optional.getOrNull();
        if (brokerageBalances == null) {
            return Optional2.INSTANCE;
        }
        return new Some(new UnifiedBalances(brokerageBalances, cryptoBalances));
    }
}
