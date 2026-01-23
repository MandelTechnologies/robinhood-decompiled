package com.robinhood.android.charts.util;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: StaleState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/charts/util/StaleState;", "", "enabled", "", "staleColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(ZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnabled", "()Z", "getStaleColor-0d7_KjU", "()J", "J", "component1", "component2", "component2-0d7_KjU", "copy", "copy-4WTKRHQ", "(ZJ)Lcom/robinhood/android/charts/util/StaleState;", "equals", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StaleState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final long staleColor;

    public /* synthetic */ StaleState(boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j);
    }

    /* renamed from: copy-4WTKRHQ$default, reason: not valid java name */
    public static /* synthetic */ StaleState m12172copy4WTKRHQ$default(StaleState staleState, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = staleState.enabled;
        }
        if ((i & 2) != 0) {
            j = staleState.staleColor;
        }
        return staleState.m12174copy4WTKRHQ(z, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getStaleColor() {
        return this.staleColor;
    }

    /* renamed from: copy-4WTKRHQ, reason: not valid java name */
    public final StaleState m12174copy4WTKRHQ(boolean enabled, long staleColor) {
        return new StaleState(enabled, staleColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaleState)) {
            return false;
        }
        StaleState staleState = (StaleState) other;
        return this.enabled == staleState.enabled && Color.m6707equalsimpl0(this.staleColor, staleState.staleColor);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Color.m6713hashCodeimpl(this.staleColor);
    }

    public String toString() {
        return "StaleState(enabled=" + this.enabled + ", staleColor=" + Color.m6714toStringimpl(this.staleColor) + ")";
    }

    private StaleState(boolean z, long j) {
        this.enabled = z;
        this.staleColor = j;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getStaleColor-0d7_KjU, reason: not valid java name */
    public final long m12175getStaleColor0d7_KjU() {
        return this.staleColor;
    }
}
