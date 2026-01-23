package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementCombinedContributionV2ViewModel;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel2;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContributionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;", "<destruct>", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore$GetCombinedContributionViewModelArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore$contributionViewModelEndpoint$1", m3645f = "ContributionStore.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ContributionStore$contributionViewModelEndpoint$1 extends ContinuationImpl7 implements Function2<ContributionStore.GetCombinedContributionViewModelArgs, Continuation<? super RetirementCombinedContributionViewModel>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContributionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContributionStore$contributionViewModelEndpoint$1(ContributionStore contributionStore, Continuation<? super ContributionStore$contributionViewModelEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = contributionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContributionStore$contributionViewModelEndpoint$1 contributionStore$contributionViewModelEndpoint$1 = new ContributionStore$contributionViewModelEndpoint$1(this.this$0, continuation);
        contributionStore$contributionViewModelEndpoint$1.L$0 = obj;
        return contributionStore$contributionViewModelEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContributionStore.GetCombinedContributionViewModelArgs getCombinedContributionViewModelArgs, Continuation<? super RetirementCombinedContributionViewModel> continuation) {
        return ((ContributionStore$contributionViewModelEndpoint$1) create(getCombinedContributionViewModelArgs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String accountNumber = ((ContributionStore.GetCombinedContributionViewModelArgs) this.L$0).getAccountNumber();
            RetirementApi retirementApi = this.this$0.retirementApi;
            this.L$0 = accountNumber;
            this.label = 1;
            Object retirementCombinedContributionV2ViewModel = retirementApi.getRetirementCombinedContributionV2ViewModel(accountNumber, this);
            if (retirementCombinedContributionV2ViewModel == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = accountNumber;
            obj = retirementCombinedContributionV2ViewModel;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return RetirementCombinedContributionViewModel2.toDbModel((ApiRetirementCombinedContributionV2ViewModel) obj, str);
    }
}
