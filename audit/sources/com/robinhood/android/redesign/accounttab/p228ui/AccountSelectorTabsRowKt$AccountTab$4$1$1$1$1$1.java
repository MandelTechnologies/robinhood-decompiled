package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1", m3645f = "AccountSelectorTabsRow.kt", m3646l = {447}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HapticFeedback $haptics;
    final /* synthetic */ Function0<Unit> $onTabLongPressed;
    final /* synthetic */ SnapshotState<Boolean> $triggerBounceAnimationClick$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1(HapticFeedback hapticFeedback, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Continuation<? super AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$haptics = hapticFeedback;
        this.$onTabLongPressed = function0;
        this.$triggerBounceAnimationClick$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1(this.$haptics, this.$onTabLongPressed, this.$triggerBounceAnimationClick$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorTabsRowKt$AccountTab$4$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$haptics.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            AccountSelectorTabsRowKt.AccountTab$lambda$21(this.$triggerBounceAnimationClick$delegate, true);
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$onTabLongPressed.invoke();
        return Unit.INSTANCE;
    }
}
