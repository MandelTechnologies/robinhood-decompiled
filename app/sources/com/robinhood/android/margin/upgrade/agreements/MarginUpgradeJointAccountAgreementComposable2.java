package com.robinhood.android.margin.upgrade.agreements;

import androidx.compose.foundation.ScrollState;
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

/* compiled from: MarginUpgradeJointAccountAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeJointAccountAgreementComposableKt$MarginUpgradeJointAccountAgreementComposable$1$1", m3645f = "MarginUpgradeJointAccountAgreementComposable.kt", m3646l = {49}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeJointAccountAgreementComposableKt$MarginUpgradeJointAccountAgreementComposable$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeJointAccountAgreementComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SnapshotState<Boolean> $shouldScrollToEnd$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeJointAccountAgreementComposable2(ScrollState scrollState, SnapshotState<Boolean> snapshotState, Continuation<? super MarginUpgradeJointAccountAgreementComposable2> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$shouldScrollToEnd$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeJointAccountAgreementComposable2(this.$scrollState, this.$shouldScrollToEnd$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginUpgradeJointAccountAgreementComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        MarginUpgradeJointAccountAgreementComposable2 marginUpgradeJointAccountAgreementComposable2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (MarginUpgradeJointAccountAgreementComposable.MarginUpgradeJointAccountAgreementComposable$lambda$4(this.$shouldScrollToEnd$delegate)) {
                ScrollState scrollState = this.$scrollState;
                int maxValue = scrollState.getMaxValue();
                this.label = 1;
                marginUpgradeJointAccountAgreementComposable2 = this;
                if (ScrollState.animateScrollTo$default(scrollState, maxValue, null, marginUpgradeJointAccountAgreementComposable2, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            marginUpgradeJointAccountAgreementComposable2 = this;
        }
        MarginUpgradeJointAccountAgreementComposable.MarginUpgradeJointAccountAgreementComposable$lambda$5(marginUpgradeJointAccountAgreementComposable2.$shouldScrollToEnd$delegate, false);
        return Unit.INSTANCE;
    }
}
