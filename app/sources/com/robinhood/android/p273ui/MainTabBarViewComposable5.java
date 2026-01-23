package com.robinhood.android.p273ui;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainTabBarViewComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarViewComposableKt$MainTabBarComposable$3$1", m3645f = "MainTabBarViewComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.ui.MainTabBarViewComposableKt$MainTabBarComposable$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class MainTabBarViewComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $showWatchlistTooltip$delegate;
    final /* synthetic */ SnapshotState4<MainTabBarViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainTabBarViewComposable5(SnapshotState4<MainTabBarViewState> snapshotState4, SnapshotState<Boolean> snapshotState, Continuation<? super MainTabBarViewComposable5> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$showWatchlistTooltip$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainTabBarViewComposable5(this.$viewState$delegate, this.$showWatchlistTooltip$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainTabBarViewComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (MainTabBarViewComposable3.MainTabBarComposable$lambda$2(this.$viewState$delegate).getShowWatchlistTabTooltip()) {
                MainTabBarViewComposable3.MainTabBarComposable$lambda$6(this.$showWatchlistTooltip$delegate, true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
