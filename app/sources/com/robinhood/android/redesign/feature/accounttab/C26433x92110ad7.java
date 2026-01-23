package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$handleGlobalGestureEnd$1", m3645f = "AccountSelectorComposable.kt", m3646l = {380}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$handleGlobalGestureEnd$1 */
/* loaded from: classes5.dex */
final class C26433x92110ad7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ SnapshotState<Boolean> $isGestureActive$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C26433x92110ad7(Animatable<Float, AnimationVectors2> animatable, AccountTabDuxo accountTabDuxo, SnapshotState<AccountSelectorExpansionState> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super C26433x92110ad7> continuation) {
        super(2, continuation);
        this.$tabExpansionProgress = animatable;
        this.$accountTabDuxo = accountTabDuxo;
        this.$uiExpansionState$delegate = snapshotState;
        this.$isGestureActive$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C26433x92110ad7(this.$tabExpansionProgress, this.$accountTabDuxo, this.$uiExpansionState$delegate, this.$isGestureActive$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C26433x92110ad7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C26433x92110ad7 c26433x92110ad7;
        AccountSelectorExpansionState accountSelectorExpansionState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget = AccountSelectorComposableKt.AccountSelectorComposable$determineSnapTarget(this.$tabExpansionProgress.getValue().floatValue());
            AccountSelectorExpansionState.Expanded expanded = AccountSelectorExpansionState.Expanded.INSTANCE;
            float f = 0.0f;
            if (!Intrinsics.areEqual(accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget, expanded)) {
                AccountSelectorExpansionState.Collapsed collapsed = AccountSelectorExpansionState.Collapsed.INSTANCE;
                if (!Intrinsics.areEqual(accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget, collapsed)) {
                    if (!(accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget instanceof AccountSelectorExpansionState.Transitioning)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AccountSelectorExpansionState to = ((AccountSelectorExpansionState.Transitioning) accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget).getTo();
                    if (!Intrinsics.areEqual(to, expanded)) {
                        if (Intrinsics.areEqual(to, collapsed)) {
                            f = 1.0f;
                        } else {
                            if (!(to instanceof AccountSelectorExpansionState.Transitioning)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f = 0.9f;
                        }
                    }
                }
            }
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(this.$uiExpansionState$delegate, new AccountSelectorExpansionState.Transitioning(AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate), accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget));
            Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
            Float fBoxFloat = boxing.boxFloat(f);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.75f, 200.0f, null, 4, null);
            this.L$0 = accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget;
            this.label = 1;
            c26433x92110ad7 = this;
            if (Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, c26433x92110ad7, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            accountSelectorExpansionState = accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountSelectorExpansionState = (AccountSelectorExpansionState) this.L$0;
            ResultKt.throwOnFailure(obj);
            c26433x92110ad7 = this;
        }
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(c26433x92110ad7.$uiExpansionState$delegate, accountSelectorExpansionState);
        c26433x92110ad7.$accountTabDuxo.saveCollapsedState(Intrinsics.areEqual(accountSelectorExpansionState, AccountSelectorExpansionState.Collapsed.INSTANCE));
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$13(c26433x92110ad7.$isGestureActive$delegate, false);
        return Unit.INSTANCE;
    }
}
