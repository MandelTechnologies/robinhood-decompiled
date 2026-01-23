package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirement401kFinderResultsResponse;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kFinderEndpoint$1", m3645f = "Retirement401kRolloverStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class Retirement401kRolloverStore$retirement401kFinderEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Retirement401kFinderResultsViewmodel>, Object> {
    int label;
    final /* synthetic */ Retirement401kRolloverStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Retirement401kRolloverStore$retirement401kFinderEndpoint$1(Retirement401kRolloverStore retirement401kRolloverStore, Continuation<? super Retirement401kRolloverStore$retirement401kFinderEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = retirement401kRolloverStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Retirement401kRolloverStore$retirement401kFinderEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Retirement401kFinderResultsViewmodel> continuation) {
        return ((Retirement401kRolloverStore$retirement401kFinderEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RetirementApi retirementApi = this.this$0.retirementApi;
            this.label = 1;
            obj = retirementApi.get401kAccountFinderResults(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Retirement401kFinderResultsViewmodel4.toDbModel((ApiRetirement401kFinderResultsResponse) obj);
    }
}
