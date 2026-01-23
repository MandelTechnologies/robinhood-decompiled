package com.robinhood.android.retirement.dashboard.contribution;

import android.content.Context;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementContributionHubFragmentKey;
import com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ContributionsSummaryCard.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$LoadedContributionsSummaryCard$1$onClickContributionsCard$1$1$1", m3645f = "ContributionsSummaryCard.kt", m3646l = {375}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCardKt$LoadedContributionsSummaryCard$1$onClickContributionsCard$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class ContributionsSummaryCard5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ SnapshotState4<ContributionsSummaryCard> $ringPlacement$delegate;
    final /* synthetic */ ContributionSummaryCardViewState.Loaded $state;
    final /* synthetic */ SnapshotState<Boolean> $wasClicked$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContributionsSummaryCard5(Navigator navigator, Context context, ContributionSummaryCardViewState.Loaded loaded, SnapshotState<Boolean> snapshotState, SnapshotState4<? extends ContributionsSummaryCard> snapshotState4, Continuation<? super ContributionsSummaryCard5> continuation) {
        super(2, continuation);
        this.$navigator = navigator;
        this.$context = context;
        this.$state = loaded;
        this.$wasClicked$delegate = snapshotState;
        this.$ringPlacement$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContributionsSummaryCard5(this.$navigator, this.$context, this.$state, this.$wasClicked$delegate, this.$ringPlacement$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContributionsSummaryCard5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$21(this.$wasClicked$delegate, true);
            this.label = 1;
            if (DelayKt.delay(140L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Navigator.DefaultImpls.showFragment$default(this.$navigator, this.$context, new RetirementContributionHubFragmentKey(ContributionsSummaryCard2.LoadedContributionsSummaryCard$lambda$27(this.$ringPlacement$delegate).name(), this.$state.getAccountNumber()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
