package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CryptoExploreComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$searchHeader$1$3$1", m3645f = "CryptoExploreComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoExploreComposableKt$Content$searchHeader$1$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $doneShowingClosedAnimation$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SnapshotState<Boolean> $forceVisibilityAnimation$delegate;
    final /* synthetic */ CryptoExploreViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreComposableKt$Content$searchHeader$1$3$1(CryptoExploreViewState cryptoExploreViewState, FocusManager focusManager, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super CryptoExploreComposableKt$Content$searchHeader$1$3$1> continuation) {
        super(2, continuation);
        this.$viewState = cryptoExploreViewState;
        this.$focusManager = focusManager;
        this.$forceVisibilityAnimation$delegate = snapshotState;
        this.$doneShowingClosedAnimation$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoExploreComposableKt$Content$searchHeader$1$3$1(this.$viewState, this.$focusManager, this.$forceVisibilityAnimation$delegate, this.$doneShowingClosedAnimation$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoExploreComposableKt$Content$searchHeader$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$viewState.isSearchVisible()) {
                CryptoExploreComposableKt.Content$lambda$10(this.$forceVisibilityAnimation$delegate, false);
                FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
                this.label = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoExploreComposableKt.Content$lambda$13(this.$doneShowingClosedAnimation$delegate, true);
        return Unit.INSTANCE;
    }
}
