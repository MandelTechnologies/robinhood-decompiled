package com.robinhood.android.redesigninvesting.highlights.p231ui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HighlightsCarouselComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$6$1", m3645f = "HighlightsCarouselComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$6$1, reason: use source file name */
/* loaded from: classes5.dex */
final class HighlightsCarouselComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ImmutableList<HighlightCard>> $carouselItems$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isUserInteracting$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<HighlightCard>> $pendingItems$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsCarouselComposable5(SnapshotState<ImmutableList<HighlightCard>> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<ImmutableList<HighlightCard>> snapshotState3, Continuation<? super HighlightsCarouselComposable5> continuation) {
        super(2, continuation);
        this.$pendingItems$delegate = snapshotState;
        this.$isUserInteracting$delegate = snapshotState2;
        this.$carouselItems$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HighlightsCarouselComposable5(this.$pendingItems$delegate, this.$isUserInteracting$delegate, this.$carouselItems$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HighlightsCarouselComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ImmutableList immutableListHighlightsCarouselComposable$lambda$18 = HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$18(this.$pendingItems$delegate);
            if (!HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$10(this.$isUserInteracting$delegate) && immutableListHighlightsCarouselComposable$lambda$18 != null) {
                this.$carouselItems$delegate.setValue(immutableListHighlightsCarouselComposable$lambda$18);
                this.$pendingItems$delegate.setValue(null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
