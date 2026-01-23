package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.NbboSummaryDao;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: NbboSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lretrofit2/Response;", "Lcom/robinhood/nbbo/models/api/ApiNbboSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$endpoint$2", m3645f = "NbboSummaryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class NbboSummaryStore3 extends ContinuationImpl7 implements Function2<Response<ApiNbboSummary>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NbboSummaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NbboSummaryStore3(NbboSummaryStore nbboSummaryStore, Continuation<? super NbboSummaryStore3> continuation) {
        super(2, continuation);
        this.this$0 = nbboSummaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NbboSummaryStore3 nbboSummaryStore3 = new NbboSummaryStore3(this.this$0, continuation);
        nbboSummaryStore3.L$0 = obj;
        return nbboSummaryStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiNbboSummary> response, Continuation<? super Unit> continuation) {
        return ((NbboSummaryStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiNbboSummary apiNbboSummary = (ApiNbboSummary) ((Response) this.L$0).body();
        if (apiNbboSummary != null) {
            this.this$0.dao.insert((NbboSummaryDao) apiNbboSummary.toDbModel());
        }
        return Unit.INSTANCE;
    }
}
