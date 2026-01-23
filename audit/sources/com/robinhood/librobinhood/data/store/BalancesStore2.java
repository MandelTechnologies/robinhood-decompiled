package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoBalances;
import com.robinhood.models.crypto.p314db.CryptoHolding;
import com.robinhood.models.crypto.p314db.CryptoPortfolio;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: BalancesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/CryptoBalances;", "portfolioOptional", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/CryptoPortfolio;", "holdingOptional", "Lcom/robinhood/models/crypto/db/CryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$cryptoBalances$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$cryptoBalances$1, reason: use source file name */
/* loaded from: classes20.dex */
final class BalancesStore2 extends ContinuationImpl7 implements Function3<Optional<? extends CryptoPortfolio>, Optional<? extends CryptoHolding>, Continuation<? super CryptoBalances>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BalancesStore2(Continuation<? super BalancesStore2> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<CryptoPortfolio> optional, Optional<CryptoHolding> optional2, Continuation<? super CryptoBalances> continuation) {
        BalancesStore2 balancesStore2 = new BalancesStore2(continuation);
        balancesStore2.L$0 = optional;
        balancesStore2.L$1 = optional2;
        return balancesStore2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends CryptoPortfolio> optional, Optional<? extends CryptoHolding> optional2, Continuation<? super CryptoBalances> continuation) {
        return invoke2((Optional<CryptoPortfolio>) optional, (Optional<CryptoHolding>) optional2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new CryptoBalances((CryptoPortfolio) ((Optional) this.L$0).getOrNull(), (CryptoHolding) ((Optional) this.L$1).getOrNull());
    }
}
