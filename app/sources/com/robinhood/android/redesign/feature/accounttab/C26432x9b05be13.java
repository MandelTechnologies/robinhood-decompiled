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
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$animateExpansionState$1", m3645f = "AccountSelectorComposable.kt", m3646l = {204}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$animateExpansionState$1 */
/* loaded from: classes5.dex */
final class C26432x9b05be13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
    final /* synthetic */ AccountSelectorExpansionState $targetState;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C26432x9b05be13(AccountSelectorExpansionState accountSelectorExpansionState, Animatable<Float, AnimationVectors2> animatable, AccountTabDuxo accountTabDuxo, SnapshotState<AccountSelectorExpansionState> snapshotState, Continuation<? super C26432x9b05be13> continuation) {
        super(2, continuation);
        this.$targetState = accountSelectorExpansionState;
        this.$tabExpansionProgress = animatable;
        this.$accountTabDuxo = accountTabDuxo;
        this.$uiExpansionState$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C26432x9b05be13(this.$targetState, this.$tabExpansionProgress, this.$accountTabDuxo, this.$uiExpansionState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C26432x9b05be13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C26432x9b05be13 c26432x9b05be13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(this.$uiExpansionState$delegate, new AccountSelectorExpansionState.Transitioning(AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate), this.$targetState));
            AccountSelectorExpansionState accountSelectorExpansionState = this.$targetState;
            AccountSelectorExpansionState.Expanded expanded = AccountSelectorExpansionState.Expanded.INSTANCE;
            float f = 0.0f;
            if (!Intrinsics.areEqual(accountSelectorExpansionState, expanded)) {
                AccountSelectorExpansionState.Collapsed collapsed = AccountSelectorExpansionState.Collapsed.INSTANCE;
                if (!Intrinsics.areEqual(accountSelectorExpansionState, collapsed)) {
                    if (!(accountSelectorExpansionState instanceof AccountSelectorExpansionState.Transitioning)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AccountSelectorExpansionState to = ((AccountSelectorExpansionState.Transitioning) this.$targetState).getTo();
                    if (!Intrinsics.areEqual(to, expanded)) {
                        if (Intrinsics.areEqual(to, collapsed)) {
                            f = 1.0f;
                        } else {
                            if (!(to instanceof AccountSelectorExpansionState.Transitioning)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f = 0.3f;
                        }
                    }
                }
            }
            Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
            Float fBoxFloat = boxing.boxFloat(f);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.75f, 200.0f, null, 4, null);
            this.label = 1;
            c26432x9b05be13 = this;
            if (Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, c26432x9b05be13, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c26432x9b05be13 = this;
        }
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(c26432x9b05be13.$uiExpansionState$delegate, c26432x9b05be13.$targetState);
        c26432x9b05be13.$accountTabDuxo.saveCollapsedState(Intrinsics.areEqual(c26432x9b05be13.$targetState, AccountSelectorExpansionState.Collapsed.INSTANCE));
        return Unit.INSTANCE;
    }
}
