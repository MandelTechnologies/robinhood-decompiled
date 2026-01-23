package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AccountsHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "Lcom/robinhood/models/crypto/db/CryptoAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$rhsToCryptoAccountMapFlow$2", m3645f = "AccountsHistoryStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$rhsToCryptoAccountMapFlow$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountsHistoryStore2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Map<String, ? extends CryptoAccount>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AccountsHistoryStore2(Continuation<? super AccountsHistoryStore2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountsHistoryStore2 accountsHistoryStore2 = new AccountsHistoryStore2(continuation);
        accountsHistoryStore2.L$0 = obj;
        return accountsHistoryStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<String, ? extends CryptoAccount>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Map<String, CryptoAccount>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Map<String, CryptoAccount>> flowCollector, Continuation<? super Unit> continuation) {
        return ((AccountsHistoryStore2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Map mapEmptyMap = MapsKt.emptyMap();
            this.label = 1;
            if (flowCollector.emit(mapEmptyMap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
