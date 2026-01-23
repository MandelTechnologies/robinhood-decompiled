package com.robinhood.android.equities.taxlots;

import androidx.compose.foundation.lazy.LazyListState;
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

/* compiled from: SelectLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$9$1", m3645f = "SelectLotsComposable.kt", m3646l = {151}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SelectLotsComposableKt$SelectLotsComposable$9$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $scrollState;
    final /* synthetic */ SnapshotState<Boolean> $scrollToTop$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectLotsComposableKt$SelectLotsComposable$9$1(LazyListState lazyListState, SnapshotState<Boolean> snapshotState, Continuation<? super SelectLotsComposableKt$SelectLotsComposable$9$1> continuation) {
        super(2, continuation);
        this.$scrollState = lazyListState;
        this.$scrollToTop$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectLotsComposableKt$SelectLotsComposable$9$1(this.$scrollState, this.$scrollToTop$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectLotsComposableKt$SelectLotsComposable$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SelectLotsComposableKt$SelectLotsComposable$9$1 selectLotsComposableKt$SelectLotsComposable$9$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$scrollState;
            this.label = 1;
            selectLotsComposableKt$SelectLotsComposable$9$1 = this;
            if (LazyListState.scrollToItem$default(lazyListState, 0, 0, selectLotsComposableKt$SelectLotsComposable$9$1, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            selectLotsComposableKt$SelectLotsComposable$9$1 = this;
        }
        SelectLotsComposableKt.SelectLotsComposable$lambda$9(selectLotsComposableKt$SelectLotsComposable$9$1.$scrollToTop$delegate, false);
        return Unit.INSTANCE;
    }
}
