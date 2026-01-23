package com.robinhood.android.isa.contributions;

import androidx.compose.runtime.SnapshotState;
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

/* compiled from: IsaContributionConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$IsaContributionConfirmationComposable$1$1", m3645f = "IsaContributionConfirmationFragment.kt", m3646l = {98}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationFragmentKt$IsaContributionConfirmationComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IsaContributionConfirmationFragment5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isMaxContribution;
    final /* synthetic */ SnapshotState<Boolean> $showContent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaContributionConfirmationFragment5(boolean z, SnapshotState<Boolean> snapshotState, Continuation<? super IsaContributionConfirmationFragment5> continuation) {
        super(2, continuation);
        this.$isMaxContribution = z;
        this.$showContent$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IsaContributionConfirmationFragment5(this.$isMaxContribution, this.$showContent$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IsaContributionConfirmationFragment5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isMaxContribution) {
                this.label = 1;
                if (DelayKt.delay(2417L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IsaContributionConfirmationFragment4.IsaContributionConfirmationComposable$lambda$3(this.$showContent$delegate, true);
        return Unit.INSTANCE;
    }
}
