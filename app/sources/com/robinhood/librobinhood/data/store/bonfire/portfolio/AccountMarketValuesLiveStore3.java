package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountMarketValuesLiveStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore$liveValuesEndpoint$2", m3645f = "AccountMarketValuesLiveStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore$liveValuesEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountMarketValuesLiveStore3 extends ContinuationImpl7 implements Function2<AccountMarketValuesLive, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountMarketValuesLiveStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountMarketValuesLiveStore3(AccountMarketValuesLiveStore accountMarketValuesLiveStore, Continuation<? super AccountMarketValuesLiveStore3> continuation) {
        super(2, continuation);
        this.this$0 = accountMarketValuesLiveStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountMarketValuesLiveStore3 accountMarketValuesLiveStore3 = new AccountMarketValuesLiveStore3(this.this$0, continuation);
        accountMarketValuesLiveStore3.L$0 = obj;
        return accountMarketValuesLiveStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountMarketValuesLive accountMarketValuesLive, Continuation<? super Unit> continuation) {
        return ((AccountMarketValuesLiveStore3) create(accountMarketValuesLive, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((AccountMarketValuesLive) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
