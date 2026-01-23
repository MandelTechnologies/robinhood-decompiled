package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesAccountDao;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.ceres.p284v1.FuturesAccountDto;
import com.robinhood.ceres.p284v1.GetAccountsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/ceres/v1/GetAccountsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$accountsEndpoint$4", m3645f = "FuturesAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class FuturesAccountStore$accountsEndpoint$4 extends ContinuationImpl7 implements Function2<GetAccountsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$accountsEndpoint$4(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$accountsEndpoint$4> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$accountsEndpoint$4 futuresAccountStore$accountsEndpoint$4 = new FuturesAccountStore$accountsEndpoint$4(this.this$0, continuation);
        futuresAccountStore$accountsEndpoint$4.L$0 = obj;
        return futuresAccountStore$accountsEndpoint$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAccountsResponseDto getAccountsResponseDto, Continuation<? super Unit> continuation) {
        return ((FuturesAccountStore$accountsEndpoint$4) create(getAccountsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetAccountsResponseDto getAccountsResponseDto = (GetAccountsResponseDto) this.L$0;
            FuturesAccountDao futuresAccountDao = this.this$0.accountDao;
            List<FuturesAccountDto> results = getAccountsResponseDto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesAccount2.toDbModel((FuturesAccountDto) it.next()));
            }
            futuresAccountDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
