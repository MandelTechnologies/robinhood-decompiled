package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.bonfire.ApiPaycheckV2;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PaycheckStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiPaycheckV2;", "it", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$rhsPaycheckEndpointV2$1", m3645f = "PaycheckStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 42}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$rhsPaycheckEndpointV2$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PaycheckStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiPaycheckV2>>, Object> {
    int label;
    final /* synthetic */ PaycheckStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaycheckStore2(PaycheckStore paycheckStore, Continuation<? super PaycheckStore2> continuation) {
        super(2, continuation);
        this.this$0 = paycheckStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaycheckStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiPaycheckV2>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiPaycheckV2>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiPaycheckV2>> continuation) {
        return ((PaycheckStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.accountProvider.refresh(false);
            this.this$0.rhyAccountStore.refresh(false);
            Observable<Account> observableStreamIndividualAccount = this.this$0.accountProvider.streamIndividualAccount();
            this.label = 1;
            obj = RxAwait3.awaitFirst(observableStreamIndividualAccount, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Account account = (Account) obj;
        RhyBonfireApi rhyBonfireApi = this.this$0.bonfireApi;
        String accountNumber = account.getAccountNumber();
        String accountNumber2 = account.getAccountNumber();
        this.label = 2;
        Object directDepositPaychecksV2 = rhyBonfireApi.getDirectDepositPaychecksV2(accountNumber, "rhs", accountNumber2, this);
        return directDepositPaychecksV2 == coroutine_suspended ? coroutine_suspended : directDepositPaychecksV2;
    }
}
