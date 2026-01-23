package com.robinhood.android.gold.upgrade.unified;

import androidx.compose.runtime.SnapshotState;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldUnifiedHostComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$1$1", m3645f = "GoldUnifiedHostComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostComposableKt$GoldUnifiedHostComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedHostComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavDestination $currentDestination;
    final /* synthetic */ SnapshotState<NavDestination> $firstDestination$delegate;
    final /* synthetic */ NavHostController $navController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldUnifiedHostComposable4(NavDestination navDestination, NavHostController navHostController, SnapshotState<NavDestination> snapshotState, Continuation<? super GoldUnifiedHostComposable4> continuation) {
        super(2, continuation);
        this.$currentDestination = navDestination;
        this.$navController = navHostController;
        this.$firstDestination$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldUnifiedHostComposable4(this.$currentDestination, this.$navController, this.$firstDestination$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldUnifiedHostComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        NavDestination navDestination;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (GoldUnifiedHostComposable3.GoldUnifiedHostComposable$lambda$2(this.$firstDestination$delegate) != null || (navDestination = this.$currentDestination) == null) {
                if (GoldUnifiedNavController.isStartDestination(this.$currentDestination, this.$navController)) {
                    GoldUnifiedNavController.finishWithCancel(this.$navController);
                }
                return Unit.INSTANCE;
            }
            this.$firstDestination$delegate.setValue(navDestination);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
