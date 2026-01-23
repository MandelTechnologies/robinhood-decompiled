package com.robinhood.android.dashboard.lib.mcw.fxswitcherftux;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.shared.common.bottomtab.controller.BottomTabsController;
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

/* compiled from: FxSwitcherFtux.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$3$1", m3645f = "FxSwitcherFtux.kt", m3646l = {99}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FxSwitcherFtux6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomTabsController $bottomTabsController;
    final /* synthetic */ Function0<Unit> $onClose;
    final /* synthetic */ SnapshotState<Boolean> $showBars$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FxSwitcherFtux6(BottomTabsController bottomTabsController, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Continuation<? super FxSwitcherFtux6> continuation) {
        super(2, continuation);
        this.$bottomTabsController = bottomTabsController;
        this.$onClose = function0;
        this.$showBars$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FxSwitcherFtux6(this.$bottomTabsController, this.$onClose, this.$showBars$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FxSwitcherFtux6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FxSwitcherFtux4.FxSwitcherFtux$lambda$8(this.$showBars$delegate, false);
            this.label = 1;
            if (DelayKt.delay(600L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BottomTabsController bottomTabsController = this.$bottomTabsController;
        if (bottomTabsController != null) {
            bottomTabsController.toggleBottomTabBarVisibility(true);
        }
        this.$onClose.invoke();
        return Unit.INSTANCE;
    }
}
