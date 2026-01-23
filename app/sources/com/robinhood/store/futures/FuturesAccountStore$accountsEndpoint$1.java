package com.robinhood.store.futures;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetAccountsRequestDto;
import com.robinhood.ceres.p284v1.GetAccountsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/GetAccountsResponseDto;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$accountsEndpoint$1", m3645f = "FuturesAccountStore.kt", m3646l = {114}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesAccountStore$accountsEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends IdlPaginationCursor>, Continuation<? super GetAccountsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$accountsEndpoint$1(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$accountsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$accountsEndpoint$1 futuresAccountStore$accountsEndpoint$1 = new FuturesAccountStore$accountsEndpoint$1(this.this$0, continuation);
        futuresAccountStore$accountsEndpoint$1.L$0 = obj;
        return futuresAccountStore$accountsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends IdlPaginationCursor> tuples2, Continuation<? super GetAccountsResponseDto> continuation) {
        return invoke2((Tuples2<String, IdlPaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, IdlPaginationCursor> tuples2, Continuation<? super GetAccountsResponseDto> continuation) {
        return ((FuturesAccountStore$accountsEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
        Ceres ceres = this.this$0.ceres;
        GetAccountsRequestDto getAccountsRequestDto = new GetAccountsRequestDto(str, idlPaginationCursor != null ? idlPaginationCursor.getValue() : null, null, null, null, 28, null);
        this.label = 1;
        Object objGetAccounts = ceres.GetAccounts(getAccountsRequestDto, this);
        return objGetAccounts == coroutine_suspended ? coroutine_suspended : objGetAccounts;
    }
}
