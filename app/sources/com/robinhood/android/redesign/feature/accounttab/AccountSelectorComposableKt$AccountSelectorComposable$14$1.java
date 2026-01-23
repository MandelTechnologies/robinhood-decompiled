package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$14$1", m3645f = "AccountSelectorComposable.kt", m3646l = {735, 738}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$14$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ SnapshotState<Boolean> $allowHorizontalPaging$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isGestureActive$delegate;
    final /* synthetic */ SnapshotState<AccountSelectorScrollable> $selectedTabScrollableState$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$14$1(Animatable<Float, AnimationVectors2> animatable, AccountTabDuxo accountTabDuxo, SnapshotState<Boolean> snapshotState, SnapshotState<AccountSelectorScrollable> snapshotState2, SnapshotState<AccountSelectorExpansionState> snapshotState3, SnapshotState<Boolean> snapshotState4, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$14$1> continuation) {
        super(2, continuation);
        this.$tabExpansionProgress = animatable;
        this.$accountTabDuxo = accountTabDuxo;
        this.$isGestureActive$delegate = snapshotState;
        this.$selectedTabScrollableState$delegate = snapshotState2;
        this.$uiExpansionState$delegate = snapshotState3;
        this.$allowHorizontalPaging$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$14$1(this.$tabExpansionProgress, this.$accountTabDuxo, this.$isGestureActive$delegate, this.$selectedTabScrollableState$delegate, this.$uiExpansionState$delegate, this.$allowHorizontalPaging$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$14$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$29;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$12(this.$isGestureActive$delegate) && (accountSelectorScrollableAccountSelectorComposable$lambda$29 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$29(this.$selectedTabScrollableState$delegate)) != null && !accountSelectorScrollableAccountSelectorComposable$lambda$29.isScrolling()) {
                this.label = 1;
                if (DelayKt.delay(100L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$accountTabDuxo.saveCollapsedState(Intrinsics.areEqual((AccountSelectorExpansionState) obj, AccountSelectorExpansionState.Collapsed.INSTANCE));
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$13(this.$isGestureActive$delegate, false);
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$16(this.$allowHorizontalPaging$delegate, true);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$12(this.$isGestureActive$delegate)) {
            SnapshotState<AccountSelectorExpansionState> snapshotState = this.$uiExpansionState$delegate;
            Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
            AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$lambda$9 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(snapshotState);
            this.label = 2;
            obj = AccountSelectorComposableKt.AccountSelectorComposable$performSnapToTarget(snapshotState, animatable, accountSelectorExpansionStateAccountSelectorComposable$lambda$9, this);
        }
        return Unit.INSTANCE;
    }
}
