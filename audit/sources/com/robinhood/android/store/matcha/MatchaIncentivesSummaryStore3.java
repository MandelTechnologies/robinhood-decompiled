package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaIncentivesSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIncentivesSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore$endpoint$2", m3645f = "MatchaIncentivesSummaryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore$endpoint$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaIncentivesSummaryStore3 extends ContinuationImpl7 implements Function2<ApiMatchaIncentivesSummary, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaIncentivesSummaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaIncentivesSummaryStore3(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, Continuation<? super MatchaIncentivesSummaryStore3> continuation) {
        super(2, continuation);
        this.this$0 = matchaIncentivesSummaryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaIncentivesSummaryStore3 matchaIncentivesSummaryStore3 = new MatchaIncentivesSummaryStore3(this.this$0, continuation);
        matchaIncentivesSummaryStore3.L$0 = obj;
        return matchaIncentivesSummaryStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchaIncentivesSummary apiMatchaIncentivesSummary, Continuation<? super Unit> continuation) {
        return ((MatchaIncentivesSummaryStore3) create(apiMatchaIncentivesSummary, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(MatchaIncentivesSummary2.toDbModel((ApiMatchaIncentivesSummary) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
