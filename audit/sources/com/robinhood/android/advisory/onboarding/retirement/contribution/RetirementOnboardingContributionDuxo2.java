package com.robinhood.android.advisory.onboarding.retirement.contribution;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementOnboardingContributionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$onCreate$2$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RetirementOnboardingContributionDuxo2 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
    final /* synthetic */ List<TransferAccount> $accounts;
    final /* synthetic */ TransferAccount $sourceAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementOnboardingContributionDuxo2(TransferAccount transferAccount, List<TransferAccount> list, Continuation<? super RetirementOnboardingContributionDuxo2> continuation) {
        super(2, continuation);
        this.$sourceAccount = transferAccount;
        this.$accounts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementOnboardingContributionDuxo2 retirementOnboardingContributionDuxo2 = new RetirementOnboardingContributionDuxo2(this.$sourceAccount, this.$accounts, continuation);
        retirementOnboardingContributionDuxo2.L$0 = obj;
        return retirementOnboardingContributionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
        return ((RetirementOnboardingContributionDuxo2) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RetirementOnboardingContributionDataState retirementOnboardingContributionDataState = (RetirementOnboardingContributionDataState) this.L$0;
        TransferAccount transferAccount = this.$sourceAccount;
        List<TransferAccount> list = this.$accounts;
        Intrinsics.checkNotNull(list);
        return RetirementOnboardingContributionDataState.copy$default(retirementOnboardingContributionDataState, null, null, null, null, false, null, transferAccount, null, list, false, null, 1215, null);
    }
}
