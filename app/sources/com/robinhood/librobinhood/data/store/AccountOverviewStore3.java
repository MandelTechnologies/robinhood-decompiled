package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.models.accountoverview.api.ApiCardOrder;
import com.robinhood.android.models.accountoverview.api.ApiCardOrder2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountOverviewStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cardOrder", "Lcom/robinhood/android/models/accountoverview/api/ApiCardOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountOverviewStore$getCardOrderEndpoint$2", m3645f = "AccountOverviewStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AccountOverviewStore$getCardOrderEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountOverviewStore3 extends ContinuationImpl7 implements Function2<ApiCardOrder, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountOverviewStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountOverviewStore3(AccountOverviewStore accountOverviewStore, Continuation<? super AccountOverviewStore3> continuation) {
        super(2, continuation);
        this.this$0 = accountOverviewStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountOverviewStore3 accountOverviewStore3 = new AccountOverviewStore3(this.this$0, continuation);
        accountOverviewStore3.L$0 = obj;
        return accountOverviewStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCardOrder apiCardOrder, Continuation<? super Unit> continuation) {
        return ((AccountOverviewStore3) create(apiCardOrder, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ApiCardOrder apiCardOrder = (ApiCardOrder) this.L$0;
            Map map = this.this$0.cardOrderRelays;
            String accountNumber = apiCardOrder.getAccountNumber();
            Object objCreate = map.get(accountNumber);
            if (objCreate == null) {
                objCreate = BehaviorRelay.create();
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                map.put(accountNumber, objCreate);
            }
            ((BehaviorRelay) objCreate).accept(ApiCardOrder2.toDbModel(apiCardOrder));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
