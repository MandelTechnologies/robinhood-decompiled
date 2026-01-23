package com.robinhood.android.options.p208ui.detail;

import androidx.compose.p011ui.geometry.Rect;
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

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1", m3645f = "OptionsDetailPageFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Rect> $greekSectionBound$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isGreekSectionVisible$delegate;
    final /* synthetic */ SnapshotState<Rect> $viewport$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1(SnapshotState<Rect> snapshotState, SnapshotState<Rect> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$greekSectionBound$delegate = snapshotState;
        this.$viewport$delegate = snapshotState2;
        this.$isGreekSectionVisible$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1(this.$greekSectionBound$delegate, this.$viewport$delegate, this.$isGreekSectionVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            OptionsDetailPageFragment.ComposeContent$lambda$17(this.$isGreekSectionVisible$delegate, OptionsDetailPageFragment.ComposeContent$lambda$10(this.$greekSectionBound$delegate).getTop() < OptionsDetailPageFragment.ComposeContent$lambda$10(this.$greekSectionBound$delegate).getBottom() && OptionsDetailPageFragment.ComposeContent$lambda$10(this.$greekSectionBound$delegate).getBottom() > OptionsDetailPageFragment.ComposeContent$lambda$7(this.$viewport$delegate).getTop() && OptionsDetailPageFragment.ComposeContent$lambda$10(this.$greekSectionBound$delegate).getTop() < OptionsDetailPageFragment.ComposeContent$lambda$7(this.$viewport$delegate).getBottom());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
