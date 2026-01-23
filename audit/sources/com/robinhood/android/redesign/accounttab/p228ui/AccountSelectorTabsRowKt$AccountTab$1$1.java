package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$1$1", m3645f = "AccountSelectorTabsRow.kt", m3646l = {352, 360}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AccountTab$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $clickedAnimatedScale;
    final /* synthetic */ SnapshotState<Boolean> $triggerBounceAnimationClick$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorTabsRowKt$AccountTab$1$1(Animatable<Float, AnimationVectors2> animatable, SnapshotState<Boolean> snapshotState, Continuation<? super AccountSelectorTabsRowKt$AccountTab$1$1> continuation) {
        super(2, continuation);
        this.$clickedAnimatedScale = animatable;
        this.$triggerBounceAnimationClick$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorTabsRowKt$AccountTab$1$1(this.$clickedAnimatedScale, this.$triggerBounceAnimationClick$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorTabsRowKt$AccountTab$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, null, null, r14, 12, null) == r8) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorTabsRowKt.AccountTab$lambda$20(this.$triggerBounceAnimationClick$delegate)) {
                Animatable<Float, AnimationVectors2> animatable = this.$clickedAnimatedScale;
                Float fBoxFloat = boxing.boxFloat(0.9f);
                SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.75f, 1500.0f, null, 4, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, this, 12, null) != coroutine_suspended) {
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
            AccountSelectorTabsRowKt.AccountTab$lambda$21(this.$triggerBounceAnimationClick$delegate, false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVectors2> animatable2 = this.$clickedAnimatedScale;
        Float fBoxFloat2 = boxing.boxFloat(1.0f);
        SpringSpec springSpecSpring$default2 = AnimationSpecKt.spring$default(0.75f, 1500.0f, null, 4, null);
        this.label = 2;
    }
}
