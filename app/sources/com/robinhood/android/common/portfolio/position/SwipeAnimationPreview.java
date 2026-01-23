package com.robinhood.android.common.portfolio.position;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeAnimationPreview.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "", "event", "Lcom/robinhood/udf/UiEvent;", "onAnimationComplete", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Lkotlin/jvm/functions/Function0;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "getOnAnimationComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SwipeAnimationPreview {
    public static final int $stable = 8;
    private final UiEvent<?> event;
    private final Function0<Unit> onAnimationComplete;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwipeAnimationPreview copy$default(SwipeAnimationPreview swipeAnimationPreview, UiEvent uiEvent, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = swipeAnimationPreview.event;
        }
        if ((i & 2) != 0) {
            function0 = swipeAnimationPreview.onAnimationComplete;
        }
        return swipeAnimationPreview.copy(uiEvent, function0);
    }

    public final UiEvent<?> component1() {
        return this.event;
    }

    public final Function0<Unit> component2() {
        return this.onAnimationComplete;
    }

    public final SwipeAnimationPreview copy(UiEvent<?> event, Function0<Unit> onAnimationComplete) {
        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
        return new SwipeAnimationPreview(event, onAnimationComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeAnimationPreview)) {
            return false;
        }
        SwipeAnimationPreview swipeAnimationPreview = (SwipeAnimationPreview) other;
        return Intrinsics.areEqual(this.event, swipeAnimationPreview.event) && Intrinsics.areEqual(this.onAnimationComplete, swipeAnimationPreview.onAnimationComplete);
    }

    public int hashCode() {
        UiEvent<?> uiEvent = this.event;
        return ((uiEvent == null ? 0 : uiEvent.hashCode()) * 31) + this.onAnimationComplete.hashCode();
    }

    public String toString() {
        return "SwipeAnimationPreview(event=" + this.event + ", onAnimationComplete=" + this.onAnimationComplete + ")";
    }

    public SwipeAnimationPreview(UiEvent<?> uiEvent, Function0<Unit> onAnimationComplete) {
        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
        this.event = uiEvent;
        this.onAnimationComplete = onAnimationComplete;
    }

    public final UiEvent<?> getEvent() {
        return this.event;
    }

    public final Function0<Unit> getOnAnimationComplete() {
        return this.onAnimationComplete;
    }
}
