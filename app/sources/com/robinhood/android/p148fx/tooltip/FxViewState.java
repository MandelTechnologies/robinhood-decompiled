package com.robinhood.android.p148fx.tooltip;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxViewState;", "", "fxState", "Lcom/robinhood/android/fx/tooltip/FxState;", "<init>", "(Lcom/robinhood/android/fx/tooltip/FxState;)V", "getFxState", "()Lcom/robinhood/android/fx/tooltip/FxState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FxViewState {
    public static final int $stable = 8;
    private final FxState fxState;

    public static /* synthetic */ FxViewState copy$default(FxViewState fxViewState, FxState fxState, int i, Object obj) {
        if ((i & 1) != 0) {
            fxState = fxViewState.fxState;
        }
        return fxViewState.copy(fxState);
    }

    /* renamed from: component1, reason: from getter */
    public final FxState getFxState() {
        return this.fxState;
    }

    public final FxViewState copy(FxState fxState) {
        Intrinsics.checkNotNullParameter(fxState, "fxState");
        return new FxViewState(fxState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FxViewState) && Intrinsics.areEqual(this.fxState, ((FxViewState) other).fxState);
    }

    public int hashCode() {
        return this.fxState.hashCode();
    }

    public String toString() {
        return "FxViewState(fxState=" + this.fxState + ")";
    }

    public FxViewState(FxState fxState) {
        Intrinsics.checkNotNullParameter(fxState, "fxState");
        this.fxState = fxState;
    }

    public final FxState getFxState() {
        return this.fxState;
    }
}
