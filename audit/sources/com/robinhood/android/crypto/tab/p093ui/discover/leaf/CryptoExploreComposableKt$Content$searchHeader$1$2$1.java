package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoExploreComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$searchHeader$1$2$1", m3645f = "CryptoExploreComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoExploreComposableKt$Content$searchHeader$1$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $doneShowingClosedAnimation$delegate;
    final /* synthetic */ SnapshotState<Boolean> $forceVisibilityAnimation$delegate;
    final /* synthetic */ FocusRequester $searchFocusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreComposableKt$Content$searchHeader$1$2$1(FocusRequester focusRequester, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super CryptoExploreComposableKt$Content$searchHeader$1$2$1> continuation) {
        super(2, continuation);
        this.$searchFocusRequester = focusRequester;
        this.$forceVisibilityAnimation$delegate = snapshotState;
        this.$doneShowingClosedAnimation$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoExploreComposableKt$Content$searchHeader$1$2$1(this.$searchFocusRequester, this.$forceVisibilityAnimation$delegate, this.$doneShowingClosedAnimation$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoExploreComposableKt$Content$searchHeader$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoExploreComposableKt.Content$lambda$10(this.$forceVisibilityAnimation$delegate, true);
            CryptoExploreComposableKt.Content$lambda$13(this.$doneShowingClosedAnimation$delegate, false);
            FocusRequester.m6497requestFocus3ESFkO8$default(this.$searchFocusRequester, 0, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
