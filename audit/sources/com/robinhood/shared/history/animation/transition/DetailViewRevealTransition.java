package com.robinhood.shared.history.animation.transition;

import android.view.View;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailViewRevealTransition.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/history/animation/transition/DetailViewRevealTransition;", "Lcom/robinhood/shared/history/animation/transition/RevealTransition;", "transitionName", "", "contentHeaderId", "", ResourceTypes.COLOR, "<init>", "(Ljava/lang/String;II)V", "getTargetEndView", "Landroid/view/View;", "endView", "getTargetColor", "targetView", "lib-history-animation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DetailViewRevealTransition extends RevealTransition {
    private final int color;
    private final int contentHeaderId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailViewRevealTransition(String transitionName, int i, int i2) {
        super(transitionName);
        Intrinsics.checkNotNullParameter(transitionName, "transitionName");
        this.contentHeaderId = i;
        this.color = i2;
    }

    @Override // com.robinhood.shared.history.animation.transition.RevealTransition
    protected View getTargetEndView(View endView) {
        Intrinsics.checkNotNullParameter(endView, "endView");
        View viewFindViewById = endView.findViewById(this.contentHeaderId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    @Override // com.robinhood.shared.history.animation.transition.RevealTransition
    protected int getTargetColor(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        return this.color;
    }
}
