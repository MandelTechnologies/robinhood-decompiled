package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.p314db.CryptoBalances;
import com.robinhood.models.crypto.p314db.CryptoHolding;
import com.robinhood.models.crypto.p314db.CryptoPortfolio;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: BalancesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/CryptoBalances;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/crypto/db/CryptoPortfolio;", "holding", "Lcom/robinhood/models/crypto/db/CryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$streamCryptoBalances$1$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$streamCryptoBalances$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BalancesStore7 extends ContinuationImpl7 implements Function3<CryptoPortfolio, CryptoHolding, Continuation<? super CryptoBalances>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BalancesStore7(Continuation<? super BalancesStore7> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CryptoPortfolio cryptoPortfolio, CryptoHolding cryptoHolding, Continuation<? super CryptoBalances> continuation) {
        BalancesStore7 balancesStore7 = new BalancesStore7(continuation);
        balancesStore7.L$0 = cryptoPortfolio;
        balancesStore7.L$1 = cryptoHolding;
        return balancesStore7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new CryptoBalances((CryptoPortfolio) this.L$0, (CryptoHolding) this.L$1);
    }
}
