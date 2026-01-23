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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FxSwitcherFtux.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$2$1", m3645f = "FxSwitcherFtux.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxKt$FxSwitcherFtux$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FxSwitcherFtux5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomTabsController $bottomTabsController;
    final /* synthetic */ FxSwitcherFtuxDuxo $duxo;
    final /* synthetic */ SnapshotState<Boolean> $showBars$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FxSwitcherFtux5(FxSwitcherFtuxDuxo fxSwitcherFtuxDuxo, BottomTabsController bottomTabsController, SnapshotState<Boolean> snapshotState, Continuation<? super FxSwitcherFtux5> continuation) {
        super(2, continuation);
        this.$duxo = fxSwitcherFtuxDuxo;
        this.$bottomTabsController = bottomTabsController;
        this.$showBars$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FxSwitcherFtux5(this.$duxo, this.$bottomTabsController, this.$showBars$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FxSwitcherFtux5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.updateHasSeenFxSwitcherFtuxPref();
        BottomTabsController bottomTabsController = this.$bottomTabsController;
        if (bottomTabsController != null) {
            bottomTabsController.toggleBottomTabBarVisibility(false);
        }
        FxSwitcherFtux4.FxSwitcherFtux$lambda$8(this.$showBars$delegate, true);
        return Unit.INSTANCE;
    }
}
