package com.airbnb.lottie.compose;

import androidx.compose.p011ui.node.ModifierNodeElement;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LottieAnimationSizeNode.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "", "width", "height", "<init>", "(II)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "node", "", "update", "(Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getWidth", "getHeight", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LottieAnimationSizeElement extends ModifierNodeElement<LottieAnimationSizeNode> {
    private final int height;
    private final int width;

    public String toString() {
        return "LottieAnimationSizeElement(width=" + this.width + ", height=" + this.height + ")";
    }

    public LottieAnimationSizeElement(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    /* renamed from: create */
    public LottieAnimationSizeNode getNode() {
        return new LottieAnimationSizeNode(this.width, this.height);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(LottieAnimationSizeNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setWidth(this.width);
        node.setHeight(this.height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) other;
        return this.width == lottieAnimationSizeElement.width && this.height == lottieAnimationSizeElement.height;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }
}
