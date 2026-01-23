package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: MovingDeltasAnimation.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/animation/MovingDeltasAnimationPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationPreviewProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class MovingDeltasAnimation7 implements PreviewParameterProvider<MovingDeltasAnimation8> {
    private final Sequence<MovingDeltasAnimation8> values = SequencesKt.sequenceOf(MovingDeltasAnimation8.LEFT, MovingDeltasAnimation8.RIGHT);

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<MovingDeltasAnimation8> getValues() {
        return this.values;
    }
}
