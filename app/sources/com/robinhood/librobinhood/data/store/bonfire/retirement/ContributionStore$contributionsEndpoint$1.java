package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContributionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore$contributionsEndpoint$1", m3645f = "ContributionStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ContributionStore$contributionsEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiRetirementContributionsResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContributionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContributionStore$contributionsEndpoint$1(ContributionStore contributionStore, Continuation<? super ContributionStore$contributionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = contributionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContributionStore$contributionsEndpoint$1 contributionStore$contributionsEndpoint$1 = new ContributionStore$contributionsEndpoint$1(this.this$0, continuation);
        contributionStore$contributionsEndpoint$1.L$0 = obj;
        return contributionStore$contributionsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiRetirementContributionsResponse> continuation) {
        return ((ContributionStore$contributionsEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        RetirementApi retirementApi = this.this$0.retirementApi;
        this.label = 1;
        Object retirementContributionScreenInfo = retirementApi.getRetirementContributionScreenInfo(str, this);
        return retirementContributionScreenInfo == coroutine_suspended ? coroutine_suspended : retirementContributionScreenInfo;
    }
}
