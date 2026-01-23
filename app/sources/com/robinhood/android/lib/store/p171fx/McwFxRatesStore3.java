package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao;
import com.robinhood.models.p325fx.api.ApiMcwFxQuote;
import com.robinhood.models.p325fx.api.ApiMcwFxQuote3;
import com.robinhood.models.p325fx.api.ApiMcwFxQuotes;
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

/* compiled from: McwFxRatesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "resp", "Lcom/robinhood/models/fx/api/ApiMcwFxQuotes;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.fx.McwFxRatesStore$mcwFxQuotesEndpoint$2", m3645f = "McwFxRatesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.fx.McwFxRatesStore$mcwFxQuotesEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class McwFxRatesStore3 extends ContinuationImpl7 implements Function2<ApiMcwFxQuotes, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwFxRatesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwFxRatesStore3(McwFxRatesStore mcwFxRatesStore, Continuation<? super McwFxRatesStore3> continuation) {
        super(2, continuation);
        this.this$0 = mcwFxRatesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwFxRatesStore3 mcwFxRatesStore3 = new McwFxRatesStore3(this.this$0, continuation);
        mcwFxRatesStore3.L$0 = obj;
        return mcwFxRatesStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMcwFxQuotes apiMcwFxQuotes, Continuation<? super Unit> continuation) {
        return ((McwFxRatesStore3) create(apiMcwFxQuotes, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<ApiMcwFxQuote> data = ((ApiMcwFxQuotes) this.L$0).getData();
        if (data != null) {
            McwFxRatesDao mcwFxRatesDao = this.this$0.dao;
            List<ApiMcwFxQuote> list = data;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ApiMcwFxQuote3.toDbModel((ApiMcwFxQuote) it.next()));
            }
            mcwFxRatesDao.insert(arrayList);
        }
        return Unit.INSTANCE;
    }
}
