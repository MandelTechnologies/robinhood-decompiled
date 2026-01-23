package com.robinhood.android.advisory.insights.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AdvisoryInsightDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/MultiPageNavigationState;", "", "currentChildIndex", "", "currentChildCount", "<init>", "(II)V", "getCurrentChildIndex", "()I", "getCurrentChildCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MultiPageNavigationState {
    public static final int $stable = 0;
    private final int currentChildCount;
    private final int currentChildIndex;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiPageNavigationState() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ MultiPageNavigationState copy$default(MultiPageNavigationState multiPageNavigationState, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = multiPageNavigationState.currentChildIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = multiPageNavigationState.currentChildCount;
        }
        return multiPageNavigationState.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentChildIndex() {
        return this.currentChildIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentChildCount() {
        return this.currentChildCount;
    }

    public final MultiPageNavigationState copy(int currentChildIndex, int currentChildCount) {
        return new MultiPageNavigationState(currentChildIndex, currentChildCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiPageNavigationState)) {
            return false;
        }
        MultiPageNavigationState multiPageNavigationState = (MultiPageNavigationState) other;
        return this.currentChildIndex == multiPageNavigationState.currentChildIndex && this.currentChildCount == multiPageNavigationState.currentChildCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.currentChildIndex) * 31) + Integer.hashCode(this.currentChildCount);
    }

    public String toString() {
        return "MultiPageNavigationState(currentChildIndex=" + this.currentChildIndex + ", currentChildCount=" + this.currentChildCount + ")";
    }

    public MultiPageNavigationState(int i, int i2) {
        this.currentChildIndex = i;
        this.currentChildCount = i2;
    }

    public /* synthetic */ MultiPageNavigationState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getCurrentChildIndex() {
        return this.currentChildIndex;
    }

    public final int getCurrentChildCount() {
        return this.currentChildCount;
    }
}
