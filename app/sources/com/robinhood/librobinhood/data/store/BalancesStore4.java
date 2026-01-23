package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Portfolio;
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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "accountOptional", "Lcom/robinhood/models/db/Account;", "portfolioOptional", "Lcom/robinhood/models/db/Portfolio;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$individualAccountBrokerageBalancesOptional$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$individualAccountBrokerageBalancesOptional$1, reason: use source file name */
/* loaded from: classes20.dex */
final class BalancesStore4 extends ContinuationImpl7 implements Function3<Optional<? extends Account>, Optional<? extends Portfolio>, Continuation<? super Optional<? extends BrokerageBalances>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BalancesStore4(Continuation<? super BalancesStore4> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<Account> optional, Optional<Portfolio> optional2, Continuation<? super Optional<BrokerageBalances>> continuation) {
        BalancesStore4 balancesStore4 = new BalancesStore4(continuation);
        balancesStore4.L$0 = optional;
        balancesStore4.L$1 = optional2;
        return balancesStore4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, Optional<? extends Portfolio> optional2, Continuation<? super Optional<? extends BrokerageBalances>> continuation) {
        return invoke2((Optional<Account>) optional, (Optional<Portfolio>) optional2, (Continuation<? super Optional<BrokerageBalances>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Optional optional = (Optional) this.L$0;
        Optional optional2 = (Optional) this.L$1;
        Account account = (Account) optional.getOrNull();
        Portfolio portfolio = (Portfolio) optional2.getOrNull();
        if (account == null || portfolio == null) {
            return Optional2.INSTANCE;
        }
        return new Some(new BrokerageBalances(account, portfolio));
    }
}
