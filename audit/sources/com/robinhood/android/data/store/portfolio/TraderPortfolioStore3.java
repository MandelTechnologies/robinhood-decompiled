package com.robinhood.android.data.store.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TraderPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Account;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore$individualAccountPortfolioEndpoint$1$account$1", m3645f = "TraderPortfolioStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$individualAccountPortfolioEndpoint$1$account$1, reason: use source file name */
/* loaded from: classes2.dex */
final class TraderPortfolioStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Account>, Object> {
    int label;
    final /* synthetic */ TraderPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderPortfolioStore3(TraderPortfolioStore traderPortfolioStore, Continuation<? super TraderPortfolioStore3> continuation) {
        super(2, continuation);
        this.this$0 = traderPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderPortfolioStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Account> continuation) {
        return ((TraderPortfolioStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Observable<Account> observableStreamIndividualAccount = this.this$0.accountProvider.streamIndividualAccount();
        this.label = 1;
        Object objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableStreamIndividualAccount, this);
        return objAwaitFirstOrNull == coroutine_suspended ? coroutine_suspended : objAwaitFirstOrNull;
    }
}
