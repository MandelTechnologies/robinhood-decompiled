package com.robinhood.android.charts.model;

import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/charts/model/AxisScrubLabel;", "", "text", "", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "value", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;F)V", "getText", "()Ljava/lang/String;", "getColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getValue", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AxisScrubLabel {
    public static final int $stable = 8;
    private final ThemedColor color;
    private final String text;
    private final float value;

    public static /* synthetic */ AxisScrubLabel copy$default(AxisScrubLabel axisScrubLabel, String str, ThemedColor themedColor, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = axisScrubLabel.text;
        }
        if ((i & 2) != 0) {
            themedColor = axisScrubLabel.color;
        }
        if ((i & 4) != 0) {
            f = axisScrubLabel.value;
        }
        return axisScrubLabel.copy(str, themedColor, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedColor getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final AxisScrubLabel copy(String text, ThemedColor color, float value) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        return new AxisScrubLabel(text, color, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AxisScrubLabel)) {
            return false;
        }
        AxisScrubLabel axisScrubLabel = (AxisScrubLabel) other;
        return Intrinsics.areEqual(this.text, axisScrubLabel.text) && Intrinsics.areEqual(this.color, axisScrubLabel.color) && Float.compare(this.value, axisScrubLabel.value) == 0;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + Float.hashCode(this.value);
    }

    public String toString() {
        return "AxisScrubLabel(text=" + this.text + ", color=" + this.color + ", value=" + this.value + ")";
    }

    public AxisScrubLabel(String text, ThemedColor color, float f) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.text = text;
        this.color = color;
        this.value = f;
    }

    public final String getText() {
        return this.text;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final float getValue() {
        return this.value;
    }
}
