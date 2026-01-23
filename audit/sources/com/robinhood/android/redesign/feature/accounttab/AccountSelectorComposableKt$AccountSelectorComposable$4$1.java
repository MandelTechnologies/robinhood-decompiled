package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$4$1", m3645f = "AccountSelectorComposable.kt", m3646l = {449}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$4$1(Animatable<Float, AnimationVectors2> animatable, SnapshotState<AccountSelectorExpansionState> snapshotState, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$4$1> continuation) {
        super(2, continuation);
        this.$tabExpansionProgress = animatable;
        this.$uiExpansionState$delegate = snapshotState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$1(float f) {
        return 100L;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$4$1(this.$tabExpansionProgress, this.$uiExpansionState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
            Flow flowDebounce = FlowKt.debounce(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(AccountSelectorComposableKt$AccountSelectorComposable$4$1.invokeSuspend$lambda$0(animatable));
                }
            }), new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$4$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(AccountSelectorComposableKt$AccountSelectorComposable$4$1.invokeSuspend$lambda$1(((Float) obj2).floatValue()));
                }
            });
            C264303 c264303 = new C264303(this.$uiExpansionState$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDebounce, c264303, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$0(Animatable animatable) {
        return Math.abs(((Number) animatable.getValue()).floatValue());
    }

    /* compiled from: AccountSelectorComposable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "value", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$4$1$3", m3645f = "AccountSelectorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$4$1$3 */
    static final class C264303 extends ContinuationImpl7 implements Function2<Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264303(SnapshotState<AccountSelectorExpansionState> snapshotState, Continuation<? super C264303> continuation) {
            super(2, continuation);
            this.$uiExpansionState$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264303 c264303 = new C264303(this.$uiExpansionState$delegate, continuation);
            c264303.F$0 = ((Number) obj).floatValue();
            return c264303;
        }

        public final Object invoke(float f, Continuation<? super Unit> continuation) {
            return ((C264303) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.F$0 == 1.0f) {
                AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$lambda$9 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate);
                AccountSelectorExpansionState.Transitioning transitioning = accountSelectorExpansionStateAccountSelectorComposable$lambda$9 instanceof AccountSelectorExpansionState.Transitioning ? (AccountSelectorExpansionState.Transitioning) accountSelectorExpansionStateAccountSelectorComposable$lambda$9 : null;
                AccountSelectorExpansionState to = transitioning != null ? transitioning.getTo() : null;
                AccountSelectorExpansionState.Collapsed collapsed = AccountSelectorExpansionState.Collapsed.INSTANCE;
                if (Intrinsics.areEqual(to, collapsed)) {
                    AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(this.$uiExpansionState$delegate, collapsed);
                } else {
                    AccountSelectorExpansionState.Expanded expanded = AccountSelectorExpansionState.Expanded.INSTANCE;
                    if (Intrinsics.areEqual(to, expanded)) {
                        AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(this.$uiExpansionState$delegate, expanded);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
