package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.projection.ProjectedReturns;
import com.robinhood.models.advisory.p304db.projection.ProjectedReturns2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import yoda.service.RestYoda;
import yoda.service.dashboard.GetFutureReturnsRequestDto;
import yoda.service.dashboard.GetFutureReturnsResponseDto;

/* compiled from: AdvisoryProjectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryProjectionStore$projectionEndpoint$1", m3645f = "AdvisoryProjectionStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryProjectionStore$projectionEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryProjectionStore5 extends ContinuationImpl7 implements Function2<String, Continuation<? super ProjectedReturns>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryProjectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryProjectionStore5(AdvisoryProjectionStore advisoryProjectionStore, Continuation<? super AdvisoryProjectionStore5> continuation) {
        super(2, continuation);
        this.this$0 = advisoryProjectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryProjectionStore5 advisoryProjectionStore5 = new AdvisoryProjectionStore5(this.this$0, continuation);
        advisoryProjectionStore5.L$0 = obj;
        return advisoryProjectionStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ProjectedReturns> continuation) {
        return ((AdvisoryProjectionStore5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            RestYoda restYoda = this.this$0.yodaApi;
            GetFutureReturnsRequestDto getFutureReturnsRequestDto = new GetFutureReturnsRequestDto(str);
            this.label = 1;
            obj = restYoda.GetFutureReturns(getFutureReturnsRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ProjectedReturns2.toDbModel((GetFutureReturnsResponseDto) obj);
    }
}
